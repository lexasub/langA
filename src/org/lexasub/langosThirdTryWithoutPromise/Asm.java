package org.lexasub.langosThirdTryWithoutPromise;


import org.lexasub.langosThirdTryWithoutPromise.utils.IdGenerator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class Asm {
    static boolean pretty = false;
    static String tab = "";
    public static String p(String r) {
       // System.out.print("\t" + r);
        return tab+r;
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
        return untabulate() + p("EXITSCOPE\n");
    }

    private static String untabulate() {
       return (pretty)?"UNTAB\n":"";
    }

    private static String newScope() {
        return p("ENTERSCOPE\n") + tabulate();
    }

    private static String tabulate() {
        return (pretty)?"TAB\n":"";
    }

    public static String intoScope(String name) {
        return p("INTOSCOPE " + name + "\n");
    }

    public static PairString createLambda(Stream<String> args, String body) {
        String name = IdGenerator.lambda();
        String lblBegin = LABEL("BEGIN_" + name);
        String s = JMP("END_" + name) +
                lblBegin;
        s += tabulate();
        s += newScope() +
                ((args != null) ? args.reduce("", String::concat) : "") +
                ((body != null) ? body : "")  +
                RET() +
             endScope();
        s += untabulate(); //+ "\n"
        s+= LABEL("END_" + name);
        return new PairString(s, lblBegin);
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

    public static String IMPORT(Stream<String> visitid) {
        Iterator<String> it= visitid.iterator();
        String path = it.next();
        if(path == "system")
            return IMPORT_Sys(it);
        while(it.hasNext())
            path += "/" + it.next();
        return p("IMPORT " + path + "\n");
    }

    public static String MAP(String lblCollBeg, String lblLambdaBegin) {
        return p("MAP " + lblCollBeg + ", " + lblLambdaBegin + "\n");
    }

    private static String IMPORT_Sys(Iterator<String> it) {
        return "";
    }

    static void print(String s) {
        if(!pretty) System.out.print(s);
        Iterator<String> str = Arrays.stream(s.split("\n")).iterator();
        String tab = "";
        while (str.hasNext()){
            String j = str.next();
            if(j.compareTo("TAB") == 0)
                tab += "\t";
            else if (j.compareTo( "UNTAB") == 0) {
                tab = tab.substring(0, tab.length() - 1);
            }
            else System.out.println(tab + j);;
        }
    }

}
