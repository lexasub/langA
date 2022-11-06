package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;

import org.lexasub.langosThirdTryWithoutPromise.frontend.utils.IdGenerator;

import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

public class LLVMAsm {
    public static String typePtr = "ptr";

    public static String JMP(String text) {
        return "br label %" + text + "\n";
    }

    public static String EQ(String lbl, String arg) {
        String id = IdGenerator.reg();
        String id2 = IdGenerator.reg();
        return "%"+id2+" = icmp eq i32 0, %" + lbl + "\n" +
                "br i1 %"+id2+", label %" + arg + ", label %" + id + "\n" + LBL(id);
    }

    public static String NEQ(String text) {
        return "JNZ " + text + "\n";
    }

    public static String LBL(String text) {
        return JMP(text) + text + ":\n";//std::kostyl
    }
    public static String RET(String type, String arg) {
        return "ret "+type + " " + arg + "\n";
    }
    public static String RET() {
        return "ret i32 0\n";
    }

    public static String declareType(String className, Stream<String> stringStream, int methodsCount) {
        return "%" + className + " = type{"
                + stringStream.map(i->"%"+i+", ").reduce("",String::concat)
                + "ptr, ".repeat(methodsCount)
                + "}\n";
    }

    public static String CALL(String s) {
        return "call noundef i32 @" + s + "()\n";
    }

    public static String getElementPtr(String variable, String className, String objName, int memberId) {
        return "%" + variable + " = " + "getelementptr inbounds %" + className +
                ", ptr %" + objName + ", i32 0, i32 " + memberId + "\n";
    }

    public static String POP(String text) {
        return "POP %" + text + "\n";
    }

    public static String PUSH(String text) {
        return "PUSH %" + text + "\n";
    }

    public static String MOV(String to, String from) {
        //return "MOV %" + to + ", %" + from + "\n";
        boolean b = Objects.equals(to, "lambda_res") || Objects.equals(to, "last_res");
        if(from.contains("lambda"))
            //bitcast i8* blockaddress(@main, %BEGIN_lambda_v1Xei4yfzS) to i8*;
        {
            if(b)
                return RET("i8*", "blockaddress(@main, %" + from + ")");
            else return "%" + to + " = bitcast i8* blockaddress(@main, %" + from + ") to i8*\n";
        }
        if(b)
            return RET("i32", "%" + from);
        return "%" + to + " = bitcast i32 %" + from + " to i32\n";
        //" = add i32 %"+from+", 0\n";//TODO std::kostyl'
    }

    public static String declareFuncHeader(String funcName, Stream<String> args) {
        Iterator<String> it = args.iterator();
        StringBuilder sb = new StringBuilder("i32 " + it.next());
        while(it.hasNext()) sb.append(", i32" + it.next());
        return "define i32 @" + funcName + "(" + sb + ")  {";
    }
}
