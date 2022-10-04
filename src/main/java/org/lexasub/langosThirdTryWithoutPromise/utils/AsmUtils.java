package org.lexasub.langosThirdTryWithoutPromise.utils;

import org.lexasub.langosThirdTryWithoutPromise.frontend.Asm;

import java.util.Iterator;

public class AsmUtils {
    public static boolean pretty = false;
    private static String tab = "";
    protected static String IMPORT_Sys(Iterator<String> it) {
        return "";
    }

    protected static String endScope() {
        return untabulate() + p("EXITSCOPE\n");
    }

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
    protected static String newScope() {
        return Asm.p("ENTERSCOPE\n") + Asm.tabulate();
    }
}
