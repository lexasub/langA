package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;

import java.util.Objects;

public class LLVMAsmUtils {

    public static boolean pretty = false;
    public static String typePtr = "ptr";
    private static String tab = "";

    protected static String untabulate() {
        return (pretty) ? "UNTAB\n" : "";
    }

    protected static String tabulate() {
        return (pretty) ? "TAB\n" : "";
    }

    protected static String p(String r) {
        // System.out.print("\t" + r);
        return tab + r;
    }

    protected static String MOVER(String to, String from) {//copy some expr to variable
        return p("%" + to + " = " + from + "\n");
    }

    protected static String RET(String type, String arg) {//!!! arg != regName
        return p("ret " + type + " " + arg + "\n");
    }

    public static String JMP(String text) {
        return p("br label %" + text + "\n");
    }

    public static String LBL(String text) {
        return Objects.equals(text,"END_phi_scope")?"":(text + ":\n");//std::kostyl' подтыкаем костыли для llvm
    }

}
