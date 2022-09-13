package org.lexasub.langosThirdTryWithoutPromise;


import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.lexasub.langosSecondTry.langosWithoutSyntaxLexer;
import org.lexasub.langosSecondTry.langosWithoutSyntaxParser;
import org.lexasub.langosThirdTryWithoutPromise.utils.IdGenerator;
import org.lexasub.langosThirdTryWithoutPromise.utils.PairString;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

public class Asm extends AsmUtils {

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
        return LABEL("FUNCTION_" + name) + newScope() + args + body + RET() + endScope();
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

    public static String RET() {
        return p("RET\n");
    }

    public static String LABEL(String lbl) {
        return p(lbl + ":\n");
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
                ((body != null) ? body : "") +
                RET() +
                endScope();
        s += untabulate(); //+ "\n"
        s += LABEL("END_" + name);
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
        Iterator<String> it = visitid.iterator();
        StringBuilder path = new StringBuilder(it.next());
        if (Objects.equals(path, "system"))
            return IMPORT_Sys(it);
        while (it.hasNext())
            path.append("/" + it.next());
        return p("IMPORT " + path + "\n");
    }

    public static String MAP(String lblCollBeg, String lblLambdaBegin) {
        return p("MAP " + lblCollBeg + ", " + lblLambdaBegin + "\n");
    }

    public static String PAIRMAP(String lblColl1Beg, String lblColl2Beg, String lblLambdaBegin) {
        return p("PAIRMAP " + lblColl1Beg + ", " + lblColl2Beg + ", " + lblLambdaBegin + "\n");
    }

    public static String MAPo(String lblCollBeg, String lblLambdaBegin) {
        return p("MAPo " + lblCollBeg + ", " + lblLambdaBegin + "\n");
    }

    public static String PAIRMAP_o(String lblColl1Beg, String lblColl2Beg, String lblLambdaBegin) {
        return p("PAIRMAP_o " + lblColl1Beg + ", " + lblColl2Beg + ", " + lblLambdaBegin + "\n");
    }

    public static String PAIRMAPo_(String lblColl1Beg, String lblColl2Beg, String lblLambdaBegin) {
        return p("PAIRMAPo_ " + lblColl1Beg + ", " + lblColl2Beg + ", " + lblLambdaBegin + "\n");
    }

    public static String PAIRMAPoo(String lblColl1Beg, String lblColl2Beg, String lblLambdaBegin) {
        return p("PAIRMAPoo " + lblColl1Beg + ", " + lblColl2Beg + ", " + lblLambdaBegin + "\n");
    }


    static void print(String s) {
        if (!pretty) System.out.print(s);
        Iterator<String> str = Arrays.stream(s.split("\n")).iterator();
        StringBuilder tab = new StringBuilder("");
        while (str.hasNext()) {
            String j = str.next();
            if (j.compareTo("TAB") == 0)
                tab.append("\t");
            else if (j.compareTo("UNTAB") == 0) {
                tab = new StringBuilder(tab.substring(0, tab.length() - 1));
            } else System.out.println(tab + j);
        }
    }

    static String getIIR(String s) {
        CharStream stream = CharStreams.fromString(s);
        langosWithoutSyntaxLexer lexer = new langosWithoutSyntaxLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        langosWithoutSyntaxParser parser = new langosWithoutSyntaxParser(tokens);
        mylangosWithoutSyntaxVisitor visitor = new mylangosWithoutSyntaxVisitor();
        return visitor.visitEntry_point(parser.entry_point());
    }
}
