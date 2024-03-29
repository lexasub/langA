package org.lexasub.langosSecondTry;

import org.lexasub.langosSecondTry.utils.Promise;

import java.util.function.Function;
import java.util.stream.Stream;

public class PromisedFIR {

    public static Promise promiseFunction(Object spec, Promise type, Promise name,
                                          Stream<Promise> argTypes, Stream<Promise> argNames, Stream<Promise> body,
                                          Promise nmspace) {
        //skip spec//пока их нету
        Promise pr = Promise.add(() -> FIR.createFunction(type, name, argTypes, argNames, nmspace)
                                          .addBody(body.map(i -> (ClassElem) i.get()))
        );
        nmspace.addWaiter(i -> ((Scope)i).obj = pr);
        return pr;
    }

    public static Promise declareNamespace(Stream<Promise> ids, Promise nmspace) {
        return Promise.add(() -> FIR.declareNamespace(ids, nmspace));
    }

    public static Promise promiseMethodCall(Promise nmspace, Promise funCall, Promise nmspace_) {
        return FIR.createMethodCall(nmspace, funCall, nmspace_);
    }

    public static Promise promiseFunctionCall(Function funName, Stream<Promise> args, Promise nmspace) {
        return FIR.createFunctionCall(funName, args, nmspace);
    }

    public static Promise promiseFunctionCall_(Promise pr1, Promise pr2) {
        //op it's property or funcall
        return Promise.add(() -> FIR.createFunctionCall_(
                pr1,
                pr2
        ));
    }

    public static Promise promiseGetMember(Promise id, Promise property, Promise nmspace) {
        return Promise.add(() -> FIR.createGetMember(id, property, nmspace));
    }
    public static Promise promiseSimpleLambda(Promise args, Promise expr, Promise nmspace) {
        Promise pr = Promise.add(() -> FIR.createSimpleLambda(args, expr));//maybe convert expr to Stream?? but how?
        nmspace.addWaiter(i -> ((Scope)i).obj = pr);
        return pr;
    }
    public static Promise promiseLambda(Promise args, Stream<Promise> elems, Promise nmspace) {
        Promise pr = Promise.add(() -> FIR.createLambda(args, elems));//maybe convert expr to Stream?? but how?
        nmspace.addWaiter(i -> ((Scope)i).obj = pr);
        return pr;
    }

    public static Stream<Promise> promiseProgram(Stream<Promise> imports, Stream<Promise> elems) {
        return FIR.createProgram(imports, elems);
    }

    public static Promise promiseIds(Stream<Promise> ids) {
        return Promise.add(() -> FIR.createListOfIds(ids));
    }

    public static Promise promiseImport(Stream<Promise> importPath) {
        return Promise.add(() -> FIR.doImport(importPath));
    }

    public static Promise promiseId(String id, Promise nmspace) {
        return Promise.add(() -> FIR.createId(id, (Scope)(nmspace.get())));
    }

    public static Promise promiseReturn(Promise expr, Promise nmspace) {
        return Promise.add(() -> FIR.doReturn(expr,nmspace));
    }

    public static Promise promiseBreak(Promise nmspace) {
        return Promise.add(() -> FIR.doBreak(nmspace));
    }

    public static Promise promiseContinue(Promise nmspace) {
        return Promise.add(() -> FIR.doContinue(nmspace));
    }

    public static Promise promiseClass(Promise name, Stream<Promise> body) {
        return Promise.add(() -> FIR.createClass(name, body));
    }
}
