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
        return "INTOSCOPE " + name + "\n";
    }

    public static String PUSH(String r) { return "PUSH " + r + "\n"; }

    public static String ImportOslang(String path, String moduleName) {
        return "IMPORT_OSLANG " + path + "/" + moduleName + "\n";
     }
}
