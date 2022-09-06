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

    public static String NEQ(String lbl) { return "NEQ " + lbl + "\n"; }

    public static String LABEL(String lbl) { return lbl + ":/n"; }

    public static String JMP(String lbl) { return "JMP " + lbl + "\n"; }

    public static String getArg(String s) {
        return POP(s);
    }

    public static Object setArg(String s) {
        return PUSH(s);
    }
}
