package org.lexasub.langosThirdTryWithoutPromise;

import org.lexasub.langosThirdTryWithoutPromise.utils.IdGenerator;

import java.util.Iterator;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionGenerators {
    public static Function ifGenerator() {
        return (expr) -> {
            Iterator<Object> e = ((Stream<Object>) expr).iterator();
            PairString exp = (PairString)e.next();//logic expression lambda
            PairString bodyTrue = (PairString)e.next();//bodyTrue
            PairString bodyFalse = null;
            if(e.hasNext())
                bodyFalse = (PairString) e.next();//bodyFalse
            String lbl = IdGenerator.label();
            //lambdaBegins.remove() не получится если будут вложенные лямбды((
            return  Asm.CALL(exp.b) +
                    exp.a +
                    Asm.EQ(lbl) +
                    Asm.CALL(bodyTrue.b) +
                        bodyTrue.a +
                    Asm.JMP(lbl) +
                    Asm.CALL(bodyFalse.b) +
                        bodyFalse.a +
                    Asm.LABEL(lbl);
        };
    }

    public static Function whileGenerator() {
        return (expr) -> {
            Iterator<Object> e = ((Stream<Object>) expr).iterator();
            PairString exp = (PairString)e.next();//logic expression lambda
            PairString body = (PairString)e.next();//body
            String lblEnd = IdGenerator.label();
            return exp.a +
                    Asm.EQ(lblEnd) +
                    Asm.CALL(body.b) +
                    body.a +
                    Asm.JMP(exp.b) +
                    Asm.LABEL(lblEnd);
        };
    }
    private static String buildMap(String collections, PairString body, String func){
        String lblLambdaEnd = IdGenerator.label();
        return Asm.JMP(lblLambdaEnd) + collections + body.a +  Asm.LABEL(lblLambdaEnd) + func;
    }

    public static Function pairMapGenerator() {//TODO
        return (expr) -> {
            Iterator<Object> e = ((Stream<Object>) expr).iterator();

            //PairString .a prev, .b post
            PairString arg1 = generateMapParts(e.next());//first collection
            PairString arg2 = generateMapParts(e.next());//second collection

            PairString body = (PairString) e.next();//body
            String lambda = body.b.substring(0, body.b.length() - 2);
            String arg_post;
            if(arg1.a == ""){
                if(arg2.a == "") arg_post = Asm.PAIRMAPoo(arg1.b, arg2.b, lambda);
                else arg_post = Asm.PAIRMAPo_(arg1.b, arg2.b, lambda);
            }
            else {
                if(arg2.a == "")arg_post = Asm.PAIRMAP_o(arg1.b, arg2.b, lambda);
                else arg_post = Asm.PAIRMAP(arg1.b, arg2.b, lambda);
            }
            return buildMap(arg1.a + arg2.a, body, arg_post);
        };
    }

    private static PairString generateMapParts(Object collection) {
        if(collection instanceof PairString p)//PairString->it's lambda
            return new PairString(p.a, p.b.substring(0, p.b.length() - 2));
        //else instanceof String
        String s = (String) collection;
        if(s.chars().filter(c->c==' ').count() == 0) //if it ID
            return new PairString("", s.substring(0, s.length() - 1));//""-> o, not _
        //if it not ID
        String lblCollBegin = IdGenerator.label();
        return new PairString(Asm.LABEL(lblCollBegin) + s + Asm.RET(), lblCollBegin);
    }

    public static Function mapGenerator() {//TODO +надо продумать map(collection, ()->s()) и m.map(()->s()) и map().map() любая комбинация
        return (expr) -> {
            Iterator<Object> e = ((Stream<Object>) expr).iterator();

            //PairString .a prev, .b post
            PairString arg = generateMapParts(e.next());//collection

            PairString body = (PairString) e.next();//body
            String lambda = body.b.substring(0, body.b.length() - 2);
            if(arg.a == "") return buildMap(arg.a, body, Asm.MAPo(arg.b, lambda));
            return buildMap(arg.a, body, Asm.MAP(arg.b, lambda));
        };
    }


    public static Function userFunGenerator(String text) {
        return (expr) -> {
            Iterator<Object> e = ((Stream<Object>) expr).iterator();
            String res = Asm.LABEL("CALL_" + text);
            while (e.hasNext()) {
                Object next = e.next();
                if(next == null) continue;
                if(next instanceof PairString){
                    res += ((PairString)next).a + Asm.setArg(((PairString)next).b);
                }
                else {
                    res += (String) next;
                }
            }
            return  res + Asm.CALL(text);//May be some load

        };
    }
}
