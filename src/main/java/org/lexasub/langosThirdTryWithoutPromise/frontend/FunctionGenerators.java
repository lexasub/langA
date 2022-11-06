package org.lexasub.langosThirdTryWithoutPromise.frontend;

import org.lexasub.langosThirdTryWithoutPromise.frontend.utils.IdGenerator;
import org.lexasub.langosThirdTryWithoutPromise.frontend.utils.PairString;

import java.util.Iterator;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionGenerators {
    public static Function ifGenerator() {
        return expr -> {
            Iterator<Object> e = ((Stream<Object>) expr).iterator();
            PairString exp = (PairString) e.next();//logic expression lambda
            PairString bodyTrue = (PairString) e.next();//bodyTrue
            PairString bodyFalse = null;
            if (e.hasNext())
                bodyFalse = (PairString) e.next();//bodyFalse
            String lbl = IdGenerator.lblIfEnd();
            //lambdaBegins.remove() не получится если будут вложенные лямбды((
            return Asm.CALL(exp.b) +
                    exp.a +
                    Asm.EQ(bodyFalse.b, "lambda_res") +
                    Asm.CALL(bodyTrue.b) +
                    bodyTrue.a +
                    Asm.JMP(lbl) +
                    bodyFalse.a +
                    Asm.LABEL(lbl);
        };
    }

    public static Function whileGenerator() {
        return expr -> {
            Iterator<Object> e = ((Stream<Object>) expr).iterator();
            PairString exp = (PairString) e.next();//logic expression lambda
            PairString body = (PairString) e.next();//body
            String lblEnd = IdGenerator.lblWhileEnd();
            return
                    Asm.CALL(exp.b) +
                    exp.a +
                    Asm.EQ(lblEnd, "lambda_res") +
                    Asm.CALL(body.b) +
                    body.a +
                    Asm.CALL(exp.b) +
                    Asm.JMP(exp.b.replace("BEGIN", "END")) +
                    Asm.LABEL(lblEnd);
        };
    }

    private static String buildMap(String collections, PairString body, String func) {
        String lblLambdaEnd = IdGenerator.lblMapEnd();
        return Asm.JMP(lblLambdaEnd) + collections + body.a + Asm.LABEL(lblLambdaEnd) + func;
    }

    private static PairString generateMapParts(Object collection) {
        if (collection instanceof PairString)//PairString->it's lambda
            return new PairString(((PairString) collection).a, ((PairString) collection).b);
        //else instanceof String
        String s = (String) collection;
        if (s.chars().filter(c -> c == ' ').count() == 0) //if it ID
            return new PairString("", s.substring(0, s.length() - 1));//""-> o, not _
        //if it not ID
        String lblCollBegin = IdGenerator.lblCollBegin();
        return new PairString(Asm.LABEL(lblCollBegin) + s + Asm.RET(), lblCollBegin);
    }

    public static Function pairMapGenerator() {//TODO +надо продумать map(collection, ()->s()) и m.map(()->s()) и map().map() любая комбинация
        return expr -> {
            Iterator<Object> e = ((Stream<Object>) expr).iterator();

            //PairString .a prev, .b post
            PairString arg1 = generateMapParts(e.next());//first collection
            PairString arg2 = generateMapParts(e.next());//second collection

            PairString body = (PairString) e.next();//body
            String lambda = body.b;
            String arg_post;
            if (isCollection(arg1)) {
                if (isCollection(arg2)) arg_post = Asm.PAIRMAPoo(arg1.b, arg2.b, lambda);
                else arg_post = Asm.PAIRMAPo_(arg1.b, arg2.b, lambda);
            } else {
                if (isCollection(arg2)) arg_post = Asm.PAIRMAP_o(arg1.b, arg2.b, lambda);
                else arg_post = Asm.PAIRMAP(arg1.b, arg2.b, lambda);
            }
            return buildMap(arg1.a + arg2.a, body, arg_post);
        };
    }

    private static boolean isCollection(PairString a) {
        return a.a.startsWith("MAP_ARGUMENT");
    }

    public static Function mapGenerator() {//TODO +надо продумать map(collection, ()->s()) и m.map(()->s()) и map().map() любая комбинация
        return expr -> {
            Iterator<Object> e = ((Stream<Object>) expr).iterator();

            //PairString .a prev, .b post
            PairString arg = generateMapParts(e.next());//collection

            PairString body = (PairString) e.next();//body
            String lambda = body.b;
            if (isCollection(arg)) return buildMap(arg.a, body, Asm.MAPo(arg.b, lambda));
            return buildMap(arg.a, body, Asm.MAP(arg.b, lambda));
        };
    }
    public static Function userFunGenerator2(String lbl, String text) {
        //TODO change
        return expr -> {
            Iterator<Object> e = ((Stream<Object>) expr).iterator();
            StringBuilder res = new StringBuilder(/*Asm.LABEL("CALL_" + lbl)*/);
            res.append((String) e.next());
            while (e.hasNext()) {
                Object next = e.next();
                if (next == null) continue;
                if (next instanceof PairString p) {
                    res.append(", " +p.a);
                    res.append(Asm.setReturn(p.b, lbl));//set return//TODO check generator of stream
                } else {
                    res.append(", " + next);
                }
            }
            return Asm.CALL(text + "(" + res + ")");//May be some load

        };
    }

   //private static String removePush(String a) {
     //   return a.substring(Asm.PUSH("").length() - 1/*remove PUSH_*/, a.length() - 1/*remove \n*/);
    //}

    public static Function swap() {
        return expr -> {
            Iterator<Object> e = ((Stream<Object>) expr).iterator();
            String a = ((String) e.next());
            String b = ((String) e.next());
            String c = IdGenerator.reg();
            a = a.substring("MOV swap_arg0, ".length(),a.length()-1);
            b = b.substring("MOV swap_arg1, ".length(),b.length()-1);
            return Asm.MOV(a, c) + Asm.MOV(b, a) + Asm.MOV(c, b);//TODO CHECK
        };
    }

    public static Function set() {
        return expr -> {
            Iterator<Object> e = ((Stream<Object>) expr).iterator();
            String varName = (String) e.next();
            String data = (String) e.next();//b.mod(two())
            varName = varName.substring("MOV set_arg0, ".length(),varName.length()-1);//a=

            return data + Asm.MOV("last_res", varName);//TODO CHECK
        };
    }
}
