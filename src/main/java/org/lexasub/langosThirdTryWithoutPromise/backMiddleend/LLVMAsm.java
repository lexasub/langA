package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;

import org.lexasub.langosThirdTryWithoutPromise.frontend.utils.IdGenerator;

import java.util.*;
import java.util.stream.Stream;

public class LLVMAsm extends LLVMAsmUtils {


    public static String JMP(String text) {
        return p("br label %" + text + "\n");
    }
    public static String NEQ(String check, String ifEq, String ifNeq) {
        return EQ(check, ifNeq, ifEq);
    }
    public static String EQ(String check, String ifEq, String ifNeq) {
        String id = IdGenerator.reg();
        return MOVER(id, "icmp eq i32 0, %" + check) +
                p("br i1 %" + id + ", label %" + ifEq + ", label %" + ifNeq + "\n");
    }
    public static String EQ(String check, String arg) {
        String id = IdGenerator.reg();
        return EQ(check, arg, id) + LBL(id);
    }

    public static String LBL(String text) {
        return JMP(text) + text + ":\n";//std::kostyl' подтыкаем костыли для llvm
    }
    private static String RET(String type, String arg) {//!!! arg != regName
        return p("ret " + type + " " + arg + "\n");
    }
    public static String RET(String arg, NamespaceTree globalTree) {
        arg = globalTree.getSSAReg(arg);
        return RET("i32", "%" + arg);
    }
    public static String RET() {
        return RET("i32", "0");
    }

    public static String declareType(String className, Stream<String> stringStream, int methodsCount) {
        return MOVER(className, "type{"
                + stringStream.map(i->"%"+i+", ").reduce("",String::concat)
                + "ptr, ".repeat(methodsCount)
                + "}");
    }

    public static String CALL(String s, NamespaceTree globalTree) {
        return CALL(s, "", globalTree);
    }
    public static String CALL(String s, String args, NamespaceTree globalTree) {
        String v = "";
        //TODO may be add lambda call from function argument(~~tryAddNeeded)
        if (s.contains("FUNCTION_")) v=s.replace("FUNCTION_", "");//TODO bad std::smallKostyl'
        else if (s.contains("_lambda_")) v=s.replace("BEGIN_","");//TODO bad std::smallKostyl'
        else {
            v = s;
            s = globalTree.getSSAReg(s);
        }
        v = globalTree.mayBeRenameReg(v+ "_res");
        return MOVER(v, "call noundef i32 @" + s + "(" + args + ")");
    }
    public static String getElementPtr(String variable, String className, String objName, int memberId) {
        return MOVER(variable, "getelementptr inbounds %" + className +
                ", ptr %" + objName + ", i32 0, i32 " + memberId);
    }

    
    public static String MOV(String to, String from, NamespaceTree globalTree) {//caller is visitMov
        boolean b = Objects.equals(to, "lambda_res") || Objects.equals(to, "last_res");//TODO remove std::kostyl' after fix
        if(from.contains("lambda"))
            //bitcast i8* blockaddress(@main, %BEGIN_lambda_v1Xei4yfzS) to i8*;
        {
            //TODO globalTree.tryAddNeeded(from);??
            if(b)
                return RET("i8*", "blockaddress(@main, %" + from + ")");
            else return MOVER(to,"bitcast i8* blockaddress(@main, %" + from + ") to i8*");
        }
        from = globalTree.getSSAReg(from);
        if(b)
           return RET("i32", "%" + from);
        to = globalTree.mayBeRenameReg(to);
        return MOVER(to,"bitcast i32 %" + from + " to i32");
    }


    public static String declareFuncHeader(String funcName, Stream<String> args, NamespaceTree globalTree) {
        Iterator<String> it = args.iterator();
        StringBuilder sb = new StringBuilder();
        if(it.hasNext()) {
            String next = it.next();
            sb.append("i32 %" + next);
            globalTree.addDeclare("i32", next);//add argument of function
        }
        while(it.hasNext()) {
            String next = it.next();
            sb.append(", i32 %" + next);
            globalTree.addDeclare("i32", next);//add argument of function
        }
        return p("define i32 @" + funcName + "(" + sb );
    }
    public static void print(String s) {
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

    public static String createFunction(String funcName, String body, String ret) {
        return funcName + tabulate() + body + ret + untabulate() +"}\n";
    }

    public static String transStreamOfAdditionalArgs(Stream<Map.Entry<String, String>> s) {
        String r =  s.map(i -> i.getValue() + " %" + i.getKey() + ", ").reduce("", String::concat);
        return (r!="")?r.substring(0, r.length() - 2):"";
    }
}
