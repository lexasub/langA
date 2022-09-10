package org.lexasub.langosThirdTryWithoutPromise;

import org.lexasub.langosThirdTryWithoutPromise.utils.IdGenerator;

import java.util.Iterator;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionGenerators {
    public static Function ifGenerator() {
        return (expr) -> {
            Iterator<String> e = ((Stream<String>) expr).iterator();
            String exp = e.next();//logic expression lambda
            String bodyTrue = e.next();//bodyTrue
            String bodyFalse = "";
            if(e.hasNext())
                bodyFalse = e.next();//bodyFalse
            String lbl = IdGenerator.label();
            return exp +
                    Asm.EQ(lbl) +
                        bodyTrue +
                    Asm.JMP(lbl) +
                        bodyFalse +
                    Asm.LABEL(lbl);
        };
    }

    public static Function whileGenerator() {
        return (expr) -> {
            Iterator<String> e = ((Stream<String>) expr).iterator();
            String exp = e.next();//logic expression lambda
            String body = e.next();//body
            String lblStart = IdGenerator.label();
            String lblEnd = IdGenerator.label();
            return Asm.LABEL(lblStart) +
                    exp +
                    Asm.EQ(lblEnd) +
                    body +
                    Asm.JMP(lblStart) +
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
            Iterator<String> e = ((Stream<String>) expr).iterator();
            String res = Asm.LABEL(text);
            while (e.hasNext()) res += e.next();
            return  res ;//May be some load

        };
    }
}
