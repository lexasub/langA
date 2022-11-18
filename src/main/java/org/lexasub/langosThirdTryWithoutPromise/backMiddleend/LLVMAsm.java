package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;

import org.lexasub.langosThirdTryWithoutPromise.frontend.utils.IdGenerator;
import org.lexasub.langosThirdTryWithoutPromise.frontend.utils.PairString;

import java.util.*;
import java.util.stream.Stream;

public class LLVMAsm extends LLVMAsmUtils {

    public static String NEQ(String check, String ifEq, String ifNeq) {
        return EQ(check, ifNeq, ifEq);
    }

    public static String EQ(String check, String ifEq, String ifNeq) {
        String id = IdGenerator.reg();
        return MOVER(id, "icmp eq i32 0, %" + check) +
                p("br i1 %" + id + ", label %" + ifEq + ", label %" + ifNeq + "\n");
    }

    public static String EQ(String check, String ifEq) {
        String id = IdGenerator.reg();
        return EQ(check, ifEq, id) + LBL(id);
    }

    private static Stream<String> returnReassigned(List<PairString> ret_args, StringBuilder sb, PHIScope phiScope, StringBuilder phis,
                                           NamespaceTree globalTree) {
        return ret_args.stream().map(i -> {
            PairString phi = phiScope.getPhi(i.b, globalTree);
            phis.append(phi.a);
            String reg = (Objects.equals(phi.b, "")) ? i.b : phi.b;
            sb.append(i.a + ", ");
            return i.a + " %" + reg + ", ";
        });
    }

    private static String retHelper(NamespaceTree globalTree, String arg, int n, String arg1, PHIScope phiScope) {
        List<PairString> ret_args = globalTree.declaresCrossReplaced().toList();
        StringBuilder sb = new StringBuilder();
        StringBuilder phis = new StringBuilder();
        if (!Objects.equals(arg, "")) {
            PairString phi = phiScope.getPhi(arg, globalTree);//TODO check
            return phi.a + RET("i32", (Objects.equals(phi.b, "")) ? arg : phi.b);
        }
        String args = returnReassigned(ret_args, sb, phiScope, phis, globalTree).reduce("", String::concat);
        if (sb.isEmpty()) {
            PairString phi = phiScope.getPhi(arg, globalTree);
            return phi.a + RET("i32", (Objects.equals(phi.b, "")) ? arg : phi.b);
        }
        if (globalTree.funcPrefix.isEmpty()) {
            globalTree.funcType = "%" + IdGenerator.type();
            globalTree.funcPrefix = globalTree.funcType + " = type {" + sb.substring(0, sb.length() - n)
                    + (n == 0 ? "i32 " : "") + "}\n";
        }
        if (n == 0) args += "i32 %" + arg1;
        //%T1 = type { <type list> }
        return phis + RET(globalTree.funcType, "{ " + args.substring(0, args.length() - n) + " }");
    }

    public static String RET(String arg, NamespaceTree globalTree, PHIScope phiScope) {
        arg = globalTree.getSSAReg(arg);
        return retHelper(globalTree, "%" + arg, 0, arg, phiScope);
    }

    public static String RETDefault(NamespaceTree globalTree, PHIScope phiScope) {
        return retHelper(globalTree, "0", 2, "", phiScope);
    }

    public static String declareType(String className, Stream<String> stringStream, int methodsCount) {
        return MOVER(className, "type{"
                + stringStream.map(i -> "%" + i + ", ").reduce("", String::concat)
                + "ptr, ".repeat(methodsCount)
                + "}");
    }

    public static String CALL(String s, NamespaceTree globalTree) {
        return CALL(s, "", globalTree, "i32");
    }

    public static String CALL(String s, String args, NamespaceTree globalTree, String type) {
        String v = "";
        //TODO may be add lambda call from function argument(~~tryAddNeeded)
        if (s.contains("FUNCTION_")) v = s.replace("FUNCTION_", "");//TODO bad std::smallKostyl'
        else if (s.contains("_lambda_")) v = s.replace("BEGIN_", "");//TODO bad std::smallKostyl'
        else {
            v = s;
            s = globalTree.getSSAReg(s);
        }
        v = globalTree.mayBeRenameReg(v + "_res");
        return MOVER(v, "call noundef " + type + " @" + s + "(" + args + ")");
    }

    public static String getElementPtr(String variable, String className, String objName, int memberId) {
        return MOVER(variable, "getelementptr inbounds %" + className +
                ", ptr %" + objName + ", i32 0, i32 " + memberId);
    }


    public static String MOV(String to, String from, NamespaceTree globalTree) {//caller is visitMov
        //if(Objects.equals(from, "phi_res"))
        boolean b = Objects.equals(to, "lambda_res") || Objects.equals(to, "last_res");//TODO remove std::kostyl' after fix
        if (from.contains("lambda"))
        //bitcast i8* blockaddress(@main, %BEGIN_lambda_v1Xei4yfzS) to i8*;
        {
            //TODO globalTree.tryAddNeeded(from);??
            if (b)
                return RET("i8*", "blockaddress(@main, %" + from + ")");
            else return MOVER(to, "bitcast i8* blockaddress(@main, %" + from + ") to i8*");
        }
        from = globalTree.getSSAReg(from);
        if (b)
            return RET("i32", "%" + from);
        to = globalTree.mayBeRenameReg(to);
        return MOVER(to, "bitcast i32 %" + from + " to i32");
    }


    public static String declareFuncHeader(String funcName, Stream<String> args, NamespaceTree globalTree) {
        Iterator<String> it = args.iterator();
        StringBuilder sb = new StringBuilder();
        if (it.hasNext()) {
            String next = it.next();
            sb.append("i32 %" + next);
            globalTree.addDeclareFuncParam(next, "i32");//add argument of function
        }
        while (it.hasNext()) {
            String next = it.next();
            sb.append(", i32 %" + next);
            globalTree.addDeclareFuncParam(next, "i32");//add argument of function
        }
        return p(funcName + "(" + sb);
    }

    public static String declareFuncHeader2(String funHeader, String s, String funcPrefix, String funcType) {
        return p(funcPrefix + "define " + funcType + " @" + funHeader + s + ")  {\n");
    }

    public static void print(String s) {
        s += "define i1 @FUNCTION_isZero(i32 %b)  {\n" +
                "    %u = icmp eq i32 0, %b\n" +
                "\tret i1 %u\n" +
                "}\n" +
                "\n" +
                "define i32 @FUNCTION_mod(i32 %b, i32 %c)  {\n" +
                "    %z = srem i32 %b, %c\n" +
                "\tret i32 %z\n" +
                "}\n" +
                "\n" +
                "@.str = private unnamed_addr constant [4 x i8] c\"%d \\00\", align 1\n" +
                " \n" +
                "\n" +
                "define i32 @main() {\n" +
                "entry:\n" +
                "  %d = call noundef i32 @FUNCTION_gcd2(i32 24826148,i32 45296490)\n" +
                "  %u = srem i32 526, 1\n" +
                "  %r = call i32 (ptr, ...) @printf(ptr noundef @.str, i32 noundef %d)\n" +
                "  ret i32 1\n" +
                "}\n" +
                "\n" +
                "declare i32 @printf(i8*, ...)" +
                "define i1 @FUNCTION_not(i1 %b)  {\n" +
                "\t%isZero_res = xor i1 %b, 1\n" +
                "\tret i1 %isZero_res\n" +
                "}";
        if (!pretty) System.out.print(s);
        Iterator<String> str = Arrays.stream(s.split("\n")).iterator();
        StringBuilder tab = new StringBuilder("");
        while (str.hasNext()) {
            String j = str.next();
            if (j.compareTo("TAB") == 0)
                tab.append("\t");
            else if (j.compareTo("UNTAB") == 0) {
                tab = new StringBuilder(tab.substring(0, tab.length() - 1));
            } else System.out.println(tab + j);
        }
    }

    public static String createFunction(String funcHeader, String body, String ret) {
        return funcHeader + tabulate() + body + ret + untabulate() + "}\n";
    }

    public static String transStreamOfAdditionalArgs(Stream<Map.Entry<String, String>> s) {
        String r = s.map(i -> i.getValue() + " %" + i.getKey() + ", ").reduce("", String::concat);
        return (r != "") ? r.substring(0, r.length() - 2) : "";
    }

    public static String JMP(String ifEq, String ifNeq) {
        return EQ("how????", ifNeq, ifEq);
    }

    public static String PHI(String to, String alt1, String alt0, String alt1Lbl, String alt0Lbl, NamespaceTree globalTree) {//TODO
        return MOVER(globalTree.mayBeRenameReg(to), "phi i32 [%" + alt1 + ", %" + alt1Lbl + "], [%" + alt0 + ", %" + alt0Lbl + "]");
    }
}
