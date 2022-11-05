package org.lexasub.langosThirdTryWithoutPromise.frontend;


import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.lexasub.langosThirdTryWithoutPromise.frontend.utils.AsmUtils;
import org.lexasub.langosThirdTryWithoutPromise.frontend.utils.IdGenerator;
import org.lexasub.langosThirdTryWithoutPromise.frontend.utils.PairString;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

public class Asm extends AsmUtils {
    public static String setReturn(String src_reg, String func_name) {
        return MOV(src_reg, func_name+"_res");
    }
    public static String getReturn(String dst_reg, String func_name) {
        return MOV(func_name+"_res", dst_reg);
    }


    public static String createFunction(String type, String name, String args, String body) {
        //TODO add type
        return LABEL("FUNCTION_" + name) + newScope() + args + body + RET() + endScope();
    }



    public static PairString createLambda(Stream<String> args, String body) {
        String name = IdGenerator.lambda();
        String beginLambda = "BEGIN_" + name;
        String lambdaBegin = LABEL(beginLambda);
        String lambdaEnd = "END_" + name;
        String s = JMP(lambdaEnd) +
                lambdaBegin;
        s += tabulate();

        StringBuilder sb = new StringBuilder();
        if(args != null) {
            Iterator<String> argsIT = args.iterator();
            int i = 0;
            while (argsIT.hasNext()) {
                sb.append(getArg(argsIT.next(), name + "_arg" + i));
                //hmm надо как то сделать, чтоб тот, кто вызывал лямбду - знал ее сгенерированное имя
                ++i;
            }
        }
        s +=/*newScope() +*/
                sb + ((body != null) ? body/*+Asm.MOV("last_res", "lambda_res")*/ : "") + RET()
        /*+endScope()*/;
        s += untabulate(); //+ "\n"
        s += LABEL(lambdaEnd);
        return new PairString(s, beginLambda);
    }

    public static String getArg(String regName, String from) {
        return MOV(from, regName);
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
        return CLASS(className) + intoScope(className) + body + outofScope() + ENDCLASS(className);
    }


}
