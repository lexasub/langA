package org.lexasub.langosSecondTry;

import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionGenerators {// ClassExpr?? -> Asm
    public static Function ifGenerator() {
        return (expr) -> {
            Stream<Scope> e = (Stream<Scope>) expr;
            e.findFirst().get();//logic expression lambda
            e.findFirst().get();//body lambda
            return 'a';
        };
    }

    public static Function whileGenerator() {
        return (expr) -> {
            Stream<Scope> e = (Stream<Scope>) expr;
            e.findFirst().get();//logic expression lambda
            e.findFirst().get();//body lambda
            return 'a';
        };
    }

    public static Function pairMapGenerator() {
        return (expr) -> {
            Stream<Scope> e = (Stream<Scope>) expr;
            e.findFirst().get();//first collection
            e.findFirst().get();//second collection
            e.findFirst().get();//body lambda
            return 'a';
        };
    }

    public static Function mapGenerator() {
        return (expr) -> {
            Stream<Scope> e = (Stream<Scope>) expr;
            e.findFirst().get();//collection
            e.findFirst().get();//body lambda
            return 'a';
        };
    }

    public static Function userFunGenerator(String text) {
        return (expr) -> {
            Stream<Scope> e = (Stream<Scope>) expr;
            e.findFirst().get();//body lambda
            return 'a';
        };
    }
}
