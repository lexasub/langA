package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;

import org.lexasub.langosThirdTryWithoutPromise.frontend.utils.IdGenerator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
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
        return p("%"+id+" = icmp eq i32 0, %" + check + "\n" +
                "br i1 %"+id+", label %" + ifEq + ", label %" + ifNeq + "\n");
    }
    public static String EQ(String check, String arg) {
        String id = IdGenerator.reg();
        return EQ(check, arg, id) + LBL(id);
    }

    public static String LBL(String text) {
        return p(JMP(text) + text + ":\n") ;//std::kostyl' подтыкаем костыли для llvm
    }
    public static String RET(String type, String arg) {
        return p("ret "+type + " " + arg + "\n");
    }
    public static String RET(String arg) {
        return p(RET("i32", "%" + arg));
    }
    public static String RET() {
        return p(RET("i32","0"));
    }

    public static String declareType(String className, Stream<String> stringStream, int methodsCount) {
        return p("%" + className + " = type{"
                + stringStream.map(i->"%"+i+", ").reduce("",String::concat)
                + "ptr, ".repeat(methodsCount)
                + "}\n");
    }

    public static String CALL(String s) {
        return CALL(s, "");
    }
    public static String CALL(String s, String args) {
        String v = "";
        if (s.contains("FUNCTION_")) v="%"+s.replace("FUNCTION_", "")+"_res = ";//std::smallKostyl'
        if (s.contains("_lambda_")) v="%" +s.replace("BEGIN_","")+"_res = ";//std::smallKostyl'
        return p( v + "call noundef i32 @" + s + "("+args+")\n");
    }
    public static String getElementPtr(String variable, String className, String objName, int memberId) {
        return p("%" + variable + " = " + "getelementptr inbounds %" + className +
                ", ptr %" + objName + ", i32 0, i32 " + memberId + "\n");
    }

    public static String POP(String text) {
        return p("POP %" + text + "\n");
    }

    public static String PUSH(String text) {
        return p("PUSH %" + text + "\n");
    }

    public static String MOV(String to, String from) {
        //return "MOV %" + to + ", %" + from + "\n";
        boolean b = Objects.equals(to, "lambda_res") || Objects.equals(to, "last_res");
        if(from.contains("lambda"))
            //bitcast i8* blockaddress(@main, %BEGIN_lambda_v1Xei4yfzS) to i8*;
        {
            if(b)
                return RET("i8*", "blockaddress(@main, %" + from + ")");
            else return p("%" + to + " = bitcast i8* blockaddress(@main, %" + from + ") to i8*\n");
        }
        if(b)
            return RET("i32", "%" + from);
        return p("%" + to + " = bitcast i32 %" + from + " to i32\n");
        //" = add i32 %"+from+", 0\n";//TODO std::kostyl'
    }

    public static String declareFuncHeader(String funcName, Stream<String> args) {
        Iterator<String> it = args.iterator();
        StringBuilder sb = new StringBuilder();
        if(it.hasNext())  sb.append("i32 %" + it.next());
        while(it.hasNext()) sb.append(", i32 %" + it.next());
        return p("define i32 @" + funcName + "(" + sb + ")  {\n");
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

    public static String createFunction(String funcName, String ret, String body) {
        return funcName + tabulate() + body + ret + untabulate() +"}\n";
    }
}
