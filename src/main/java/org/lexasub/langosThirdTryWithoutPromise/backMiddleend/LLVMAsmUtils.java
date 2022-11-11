package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;

public class LLVMAsmUtils {

    public static boolean pretty = false;
    private static String tab = "";
    public static String typePtr = "ptr";

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

}
