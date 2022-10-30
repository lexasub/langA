package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;

import java.util.stream.Stream;

public class LLVMAsm {
    public static String typePtr = "ptr";

    public static String JMP(String text) {
        return "JMP " + text + "\n";
    }

    public static String EQ(String text) {
        return "JEQ " + text + "\n";
    }

    public static String NEQ(String text) {
        return "JNZ " + text + "\n";
    }

    public static String LBL(String text) {
        return text + /*"[TODO LABEL change for llvmir]*/ ":\n";
    }

    public static String RET() {
        return "RET\n";
    }

    public static String declareType(String className, Stream<String> stringStream, int methodsCount) {
        return "%" + className + " = type{"
                + stringStream.map(i->"%"+i+", ").reduce("",String::concat)
                + "ptr, ".repeat(methodsCount)
                + "}\n";
    }

    public static String CALL(String s) {
        return "call noundef i32 " + s + "()\n";
    }

    public static String getElementPtr(String variable, String className, String objName, String memberId) {
        return "%" + variable + " = " + "getelementptr inbounds " + className +
                ", ptr %" + objName + ", i32 0, i32 " + memberId + "\n";
    }

    public static String POP(String text) {
        return "POP %" + text + "\n";
    }

    public static String PUSH(String text) {
        return "PUSH %" + text + "\n";
    }

    public static String MOV(String to, String from) {
        return "MOV %" + to + ", %" + from + "\n";
    }
}
