package org.lexasub.langosThirdTryWithoutPromise.frontend;


import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.lexasub.langosThirdTryWithoutPromise.frontend.utils.AsmUtils;
import org.lexasub.langosThirdTryWithoutPromise.frontend.utils.PairString;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

public class Asm extends AsmUtils {
    public static String createFunction(String type, String name, String args, String body) {
        //TODO add type
        return "FUNCTION_" + name + " (" + args + ")" + ": \n"
                + newScope() + body + RET() + endScope();
    }

    public static PairString createLambda(Stream<String> args, String body, String name) {
        String beginLambda = "BEGIN_" + name;
        String lambdaEnd = "END_" + name;
        String s = beginLambda;
        //JMP(lambdaEnd)
        s += " (";

        StringBuilder sb = new StringBuilder();
        if (args != null) {
            Iterator<String> argsIT = args.iterator();
            sb.append(argsIT.next());
            //int i = 0;
            while (argsIT.hasNext()) {
                //  sb.append(getArg(argsIT.next(), name + "_arg" + i));
                sb.append(", " + argsIT.next());
                //hmm надо как то сделать, чтоб тот, кто вызывал лямбду - знал ее сгенерированное имя
                //++i;
            }
        }
        s += sb + ") :\n" + newScope();
        s += ((body != null) ? body : "") + RET();
        s += endScope();
        s += LABEL(lambdaEnd);
        return new PairString(s, beginLambda);
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


    public static void print(String s) {
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

    public static String createClass(String className, String body) {
        return CLASS(className) + newScope() + body + endScope() + ENDCLASS(className);
    }

    public static String JMP(String lblT, String lblF) {
        return p("JMP " + lblT + ", " + lblF + "\n");
    }

    public static String PHI(String alt1, String alt0) {
        return p("PHI " + alt1 + ", " + alt0 + "\n");
    }
}
