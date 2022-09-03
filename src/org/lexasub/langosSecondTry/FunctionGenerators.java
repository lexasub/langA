package org.lexasub.langosSecondTry;

import org.lexasub.langosSecondTry.utils.IdGenerator;

import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionGenerators {// ClassExpr?? -> Asm
    public static Function ifGenerator() {
        return (expr) -> {
            Stream<Scope> e = (Stream<Scope>) expr;
            Scope exp = e.findFirst().get();//logic expression lambda
            Scope body = e.findFirst().get();//body lambda
            String res = "";
            res = applyStream(exp, res);
            if (res == null) return "error";
            String lbl = IdGenerator.label();
            res += Asm.NEQ(lbl);
            res = applyStream(body, res);
            if (res == null) return "error";
            res += Asm.LABEL(lbl);
            return res;
        };
    }

    public static Function whileGenerator() {
        return (expr) -> {
            Stream<Scope> e = (Stream<Scope>) expr;
            Scope exp = e.findFirst().get();//logic expression lambda
            Scope body = e.findFirst().get();//body lambda
            String res = "";
            res = applyStream(exp, res);
            if (res == null) return "error";
            String lbl = IdGenerator.label();
            String lbl1 = IdGenerator.label();
            res += Asm.LABEL(lbl1);
            res += Asm.NEQ(lbl);
            res = applyStream(body, res);
            if (res == null) return "error";
            res += Asm.JMP(lbl1);
            res += Asm.LABEL(lbl);
            return res;
        };
    }

    public static Function pairMapGenerator() {//TODO
        return (expr) -> {
            Stream<Scope> e = (Stream<Scope>) expr;
            Scope exp1 = e.findFirst().get();//first collection
            Scope exp2 = e.findFirst().get();//second collection
            Scope body = e.findFirst().get();//body lambda
            String res = "";
            res = applyStream(exp1, res);
            if (res == null) return "error";
            res = applyStream(exp2, res);
            if (res == null) return "error";
            res = applyStream(body, res);
            if (res == null) return "error";
            return res;
        };
    }

    private static String applyStream(Scope exp1, String res) {
        if(exp1.asm == null)
            return null;
        res += exp1.asm;
        return res;
    }

    public static Function mapGenerator() {//TODO
        return (expr) -> {
            Stream<Scope> e = (Stream<Scope>) expr;
            Scope exp = e.findFirst().get();//collection
            Scope body = e.findFirst().get();//body lambda
            String res = "";
            res = applyStream(exp, res);
            if (res == null) return "error";
            res = applyStream(body, res);
            if (res == null) return "error";
            return res;
        };
    }

    public static Function userFunGenerator(String text) {//TODO//xm, параметры разные могут быть, не факт что лямбда прийдет. Могут и обычные аргументы
        return (expr) -> {
            Stream<Scope> e = (Stream<Scope>) expr;
            Scope body = e.findFirst().get();//body lambda
            String res = "";
            return applyStream(body, res);
        };
    }
}
