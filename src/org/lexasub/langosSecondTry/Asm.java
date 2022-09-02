package org.lexasub.langosSecondTry;

public class Asm {
    public static String POP(String s) {
        return "POP " + s + "\n";
    }

    public static String newScope() {
        return "ENTERSCOPE\n";
    }

    public static String endScope() {
        return "EXITSCOPE\n";
    }

    public static String intoScope(String name) {
        return "INTOSCOPE" + name + "\n";
    }
}
