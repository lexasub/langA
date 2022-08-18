package org.lexasub.langosSecondTry;

import org.lexasub.langosSecondTry.utils.Promise;

import java.util.stream.Stream;

public class IIR {//intermidiate IR
    //private static final IIR iir = new IIR();

    public static ClassID getOrAddID(String id, ClassNamespace nmspace) {
        return new ClassID(id, nmspace);
    }

    public static ClassFunction addFunction(Promise type, Promise name) {
        return new ClassFunction(type.get(), name.get());
    }


    public static ClassClass getClassLink(ClassID classID, Promise nmspace) {
        return (ClassClass) ((ClassNamespace)nmspace.get()).findSubNamespace(classID.text).get().obj;
    }

    public static ClassClass addClass(Promise name) {
        return new ClassClass(name.get());
    }

    public static ClassLambda addSimpleLambda(Stream<Promise> args, Promise expr) {
        return new ClassLambda(args).addExpr(expr.get());
    }

    public static ClassLambda addLambda(Stream<Promise> args, Stream<Promise> elems) {
        ClassLambda lambda = new ClassLambda(args);
        elems.map(Promise::get).map(lambda::addExpr);
        return lambda;
    }

    public static Object import_(Stream<Promise> importPath) {
    }

    public static Object return_(Promise expr, Promise nmspace) {
    }

    public static Object break_(Promise nmspace) {
    }

    public static Object continue_(Promise nmspace) {
    }
}
