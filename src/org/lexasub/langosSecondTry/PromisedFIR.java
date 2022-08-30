package org.lexasub.langosSecondTry;

import org.lexasub.langosSecondTry.utils.IdGenerator;
import org.lexasub.langosSecondTry.utils.Promise;

import java.util.function.Function;
import java.util.stream.Stream;

public class PromisedFIR {

    public static Promise promiseFunction(Object spec, Promise type, Promise name,
                                          Stream<Promise> argType, Stream<Promise> argName, Stream<Promise> body,
                                          Promise nmspace) {
        //skip spec//пока их нету
        Promise pr = Promise.add(() -> FIR.createFunction(type, name, argType, argName, body, nmspace));
        nmspace.addWaiter(i -> ((Scope)i).obj = pr);
        return pr;
    }

    public static Promise declareNamespace(Stream<Promise> ids, Promise nmspace) {
        return Promise.add(() -> FIR.declareNamespace(ids, nmspace));
    }

    public static Promise promiseMethodCall(Promise nmspace, Object funCall, Promise nmspace_) {
        Promise pr = Promise.add(() -> FIR.createMethodCall(nmspace, funCall));
        nmspace_.addWaiter(i -> ((Scope)i).addSubScope(IdGenerator.functionCall(),
                Scope.Type.expr,pr));//addSubScope??expr??
        return pr;
    }

    public static Promise promiseFunctionCall(Function funName, Stream<Promise> args, Promise nmspace) {
        return Promise.add(() -> FIR.createFunctionCall(funName, args, nmspace));
    }

    public static Promise promiseFunctionCall_(Promise promise, Promise op) {
        //op it's property or funcall
        return Promise.add(() -> FIR.createFunctionCall_(
                promise,
                op
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

    public static Promise promiseProgram(Stream<Promise> imports, Stream<Promise> elems) {
        return Promise.add(() -> FIR.createProgram(imports, elems));
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
