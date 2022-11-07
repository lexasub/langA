package org.lexasub.langosThirdTryWithoutPromise.frontend;

import org.lexasub.langosThirdTryWithoutPromise.frontend.utils.IdGenerator;
import org.lexasub.langosThirdTryWithoutPromise.frontend.utils.PairString;

import java.util.Iterator;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionGenerators {
    public static Function ifGenerator() {
        return expr -> {
            Iterator<String> e = ((Stream<String>) expr).iterator();
            String exp =  e.next();//logic expression lambda
            String bodyTrue = e.next();//bodyTrue
            String bodyFalse = null;
            if (e.hasNext())
                bodyFalse = e.next();//bodyFalse
            String endIf = IdGenerator.lblIfEnd();
            //lambdaBegins.remove() не получится если будут вложенные лямбды((
            return Asm.CALL(exp) +
                    Asm.EQCALL_THEN_JMP(bodyFalse, "lambda_res", endIf) +
                    Asm.CALL(bodyTrue) +
                    Asm.LABEL(endIf);
        };
    }

    public static Function whileGenerator() {
        return expr -> {
            Iterator<String> e = ((Stream<String>) expr).iterator();
            String exp =  e.next();//logic expression lambda
            String body = e.next();//body
            String lblEnd = IdGenerator.lblWhileEnd();
            String lbl = IdGenerator.lbl();
            return
                    Asm.LABEL(lbl) +
                    Asm.CALL(exp) +
                    Asm.EQ(lblEnd, "lambda_res") +
                    Asm.CALL(body) +
                    Asm.JMP(lbl) +
                    Asm.LABEL(lblEnd);
        };
    }

    private static String buildMap(String collections, String body, String func) {
        String lblLambdaEnd = IdGenerator.lblMapEnd();
        return Asm.JMP(lblLambdaEnd) + collections + body + Asm.LABEL(lblLambdaEnd) + func;
    }

    private static PairString generateMapParts(Object collection) {
       // if (collection instanceof PairString)//PairString->it's lambda
        //    return new PairString(((PairString) collection).a, ((PairString) collection).b);
        //else instanceof String
        String s = (String) collection;
        if (s.chars().filter(c -> c == ' ').count() == 0) //if it ID
            return new PairString("", s.substring(0, s.length() - 1));//""-> o, not _
        //if it not ID//may be now it only id
        String lblCollBegin = IdGenerator.lblCollBegin();
        return new PairString(Asm.LABEL(lblCollBegin) + s + Asm.RET(), lblCollBegin);
    }

    public static Function pairMapGenerator() {//TODO +надо продумать map(collection, ()->s()) и m.map(()->s()) и map().map() любая комбинация
        return expr -> {
            Iterator<String> e = ((Stream<String>) expr).iterator();

            //PairString .a prev, .b post
            PairString arg1 = generateMapParts(e.next());//first collection
            PairString arg2 = generateMapParts(e.next());//second collection

            String body = e.next();//body
            String lambda = body;
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
            Iterator<String> e = ((Stream<String>) expr).iterator();

            //PairString .a prev, .b post
            PairString arg = generateMapParts(e.next());//collection

            String body = e.next();//body
            String lambda = body;
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
                if (next instanceof PairString p) {//сейчас вроде никогда не происходит
                    res.append(", " + p.a);
                    res.append(Asm.setReturn(p.b, lbl));//set return//TODO check generator of stream
                } else {
                    res.append(", " + next);
                }
            }
            return Asm.CALL(text + "(" + res + ")");//May be some load

        };
    }

    public static Function swap() {
        return expr -> {
            Iterator<String> e = ((Stream<String>) expr).iterator();
            String a = e.next();
            String b = e.next();
            String c = IdGenerator.reg();
            return Asm.MOV(a, c) + Asm.MOV(b, a) + Asm.MOV(c, b);//TODO CHECK
        };
    }

    public static Function set() {
        return expr -> {
            Iterator<String> e = ((Stream<String>) expr).iterator();
            String varName = e.next();
            String data = e.next();//b.mod(two())

           // return data + Asm.MOV("last_res", varName);//TODO CHECK
           return  Asm.MOV(data, varName);//ex: move from myFunc_res
        };
    }
}
