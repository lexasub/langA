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
            return  exp.a +
                    Asm.EQ(lblEnd) +
                    Asm.CALL(body.b) +
                    body.a +
                    Asm.JMP(exp.b) +
                    Asm.LABEL(lblEnd);
        };
    }

    public static Function pairMapGenerator() {//TODO
        return (expr) -> {
            Iterator<String> e = ((Stream<String>) expr).iterator();
            String coll1 = e.next();//first collection
            String coll2 = e.next();//second collection
            String body = e.next();//body
            String lblStart = IdGenerator.label();
            String lblEnd = IdGenerator.label();
            return Asm.LABEL(lblStart) +
                    body +
                    Asm.EQ(lblEnd) +
                    body +
                    Asm.JMP(lblStart) +
                    Asm.LABEL(lblEnd);
        };
    }


    public static Function mapGenerator() {//TODO//+надо продумать map(collection, ()->s()) и m.map(()->s()) и map().map() любая комбинация
        return (expr) -> {
            Iterator<String> e = ((Stream<String>) expr).iterator();
            String coll1 = e.next();//first collection
            String body = e.next();//body
            String lblStart = IdGenerator.label();
            String lblEnd = IdGenerator.label();
            return Asm.LABEL(lblStart) +
                    body +
                    Asm.EQ(lblEnd) +
                    body +
                    Asm.JMP(lblStart) +
                    Asm.LABEL(lblEnd);
        };
    }

    public static Function userFunGenerator(String text) {
        return (expr) -> {
            Iterator<Object> e = ((Stream<Object>) expr).iterator();
            String res = Asm.LABEL("CALL_" + text);
            while (e.hasNext()) {
                Object next = e.next();
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
