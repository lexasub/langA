package org.lexasub.langosThirdTryWithoutPromise;


import org.lexasub.langosThirdTryWithoutPromise.utils.IdGenerator;

import java.util.stream.Stream;

public class Asm {
    public static String p(String r) {
       // System.out.print("\t" + r);
        return r;
    }

    public static String POP(String s) {
        return p("POP " + s + "\n");
    }

    public static String PUSH(String r) {
        return p("PUSH " + r + "\n");
    }

    public static String getArg(String s) {
        return POP(s);
    }

    public static Object setArg(String s) {
        return PUSH(s);
    }

    public static String createFunction(String type, String name, String args, String body) {
        //TODO add type
        return LABEL(name) + newScope() + args + body + RET() + endScope();
    }

    public static String NEQ(String lbl) {
        return p("NEQ " + lbl + "\n");
    }

    public static String EQ(String lbl) {
        return p("EQ " + lbl + "\n");
    }

    public static String JMP(String lbl) {
        return p("JMP " + lbl + "\n");
    }

    private static String RET() {
        return p("RET\n");
    }

    public static String LABEL(String lbl) {
        return p(lbl + ":\n");
    }

    private static String endScope() {
        return p("EXITSCOPE\n");
    }

    private static String newScope() {
        return p("ENTERSCOPE\n");
    }

    public static String intoScope(String name) {
        return p("INTOSCOPE " + name + "\n");
    }

    public static PairString createLambda(Stream<String> args, String body) {
        String name = IdGenerator.lambda();
        String lblBegin = LABEL("BEGIN_" + name);
        return new PairString(JMP("END_" + name) +
                lblBegin +
                newScope() +
                ((args != null) ? args.reduce("", String::concat) : "") + "\n" +
                body +
                RET() +
                endScope() +
                LABEL("END_" + name), lblBegin);
    }

    public static String MOVMEMBER(String regName, String field) {
        return p("MOVMEMBER " + regName + ", " + field + "\n");
    }

    public static String setArgLastRes() {
        return p("LAST_RES_TO_STACK\n");
    }

    public static String RETURN() {
        return p("RETURN\n");//???
    }

    public static String CONTINUE() {
        return p("CONTINUE\n");
    }

    public static String BREAK() {
        return p("BREAK\n");
    }

    public static String CALL(String s) {
        return p("CALL " + s + "\n");
    }
}
