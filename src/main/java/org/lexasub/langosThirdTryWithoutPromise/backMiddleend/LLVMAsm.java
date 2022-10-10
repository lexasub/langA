package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;

import java.util.stream.Stream;

public class LLVMAsm {
    public static String typePtr = "ptr";

    public static String JMP(String text) {
    }

    public static String EQ(String text) {
    }

    public static String NEQ(String text) {
    }

    public static String LBL(String text) {
    }

    public static String RET() {
    }

    public static String declareType(String className, Stream<String> stringStream, int methodsCount) {
        return "%" + className + " = type{"
                + stringStream.map(i->"%"+i+"*, ").reduce("",String::concat)
                + "ptr, ".repeat(methodsCount)
                + "}\n";
    }

    public static String CALL(String s) {

    }
}
