package org.lexasub.langosThirdTryWithoutPromise;


import org.lexasub.langosThirdTryWithoutPromise.utils.IdGenerator;

import java.util.stream.Stream;

public class Asm {
    public static String POP(String s) {
        return "POP " + s + "\n";
    }
    public static String PUSH(String r) { return "PUSH " + r + "\n"; }
    public static String getArg(String s) {
        return POP(s);
    }
    public static Object setArg(String s) {
        return PUSH(s);
    }

    public static String createFunction(String type, String name, String args, String body) {
        //TODO add type
        return LBL(name) + newScope() + args + body + RET() + endScope();
    }
    public static String NEQ(String lbl) { return "NEQ " + lbl + "\n"; }
    public static String EQ(String lbl) { return "EQ " + lbl + "\n"; }
    public static String JMP(String lbl) {
        return "JMP " + lbl + "\n";
    }
    private static String LBL(String name) {
        return name + ":\n";
    }

    private static String RET() {
        return "RET\n";
    }
    public static String LABEL(String lbl) { return lbl + ":\n"; }

    private static String endScope() {
        return "EXITSCOPE\n";
    }

    private static String newScope() {
        return "ENTERSCOPE\n";
    }

    public static String intoScope(String name) {
        return "INTOSCOPE " + name + "\n";
    }
    public static String createLambda(Stream<String> args, String body) {
        String name = IdGenerator.lambda();
        return JMP("END_" + name) +
                LBL("BEGIN_" + name) +
                newScope() +
                ((args!=null)?args.reduce("", String::concat):"") +
                body +
                RET() +
                endScope() +
                LBL("END_" + name);
    }

    public static String MOVMEMBER(String regName, String field) {
        return "MOVMEMBER " +  regName + ", " + field + "\n";
    }

    public static String setArgLastRes() {
        return "LAST_RES_TO_STACK\n";
    }

    public static String RETURN() {
        return "RETURN\n";//???
    }

    public static String CONTINUE() {
        return "CONTINUE\n";
    }

    public static String BREAK() {
        return "BREAK\n";
    }
}
