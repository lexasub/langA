package org.lexasub.langosSecondTry;

import org.lexasub.langosSecondTry.utils.Promise;

import java.util.function.Function;
import java.util.stream.Stream;

public class PromisedFIR {

    public static Promise promiseFunction(Object spec, Promise type, Promise name,
                                          Stream<Promise> argType, Stream<Promise> argName, Stream<Promise> body) {
        //skip spec//пока их нету
        return Promise.add(() -> FIR.createFunction(type, name, argType, argName, body));
    }

    public static Promise declareNamespace(Stream<Promise> ids, ClassNamespace nmspace) {
        return Promise.add(() -> FIR.declareNamespace(ids, nmspace));
    }

    public static Promise promiseMethodCall(Promise nmspace, Promise className, Object funCall, ClassNamespace np) {
        Promise class_ = className.addWaiter((Function<Object, Object>) i -> {
            return np.findSubElem(((ClassID) i).text);//subelem or subnamespace???
        });
        return Promise.add(() -> FIR.createMethodCall((nmspace != null) ? nmspace : class_, funCall));
    }

    public static Promise promiseFunctionCall(Function funName, Stream<Promise> args) {
        return Promise.add(() -> FIR.createFunctionCall(funName, args));
    }

    public static Promise promiseFunctionCall_(Promise methCall, Promise funCall, Stream<Promise> op) {
        //op it's property or funcall
        return Promise.add(() -> FIR.createFunctionCall_(
                (methCall != null) ? methCall : funCall,
                op
        ));
    }

    public static Promise promiseGetMember(Promise id, Promise property, ClassNamespace nmspace) {
        return Promise.add(() -> FIR.createGetMember(id, property, nmspace));
    }
    public static Promise promiseSimpleLambda(Promise args, Promise expr) {
        return Promise.add(() -> FIR.createSimpleLambda(args, expr));//maybe convert expr to Stream?? but how?
    }
    public static Promise promiseLambda(Promise args, Stream<Promise> elems) {
        return Promise.add(() -> FIR.createLambda(args, elems));//maybe convert expr to Stream?? but how?
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

    public static Promise promiseId(String id, ClassNamespace nmspace) {
        return Promise.add(() -> FIR.createId(id, nmspace));
    }

    public static Promise promiseReturn(Promise expr) {
        return Promise.add(() -> FIR.doReturn(expr));
    }

    public static Promise promiseBreak() {
        return Promise.add(FIR::doBreak);
    }

    public static Promise promiseContinue() {
        return Promise.add(FIR::doContinue);
    }

    public static Promise promiseClass(Promise name, Stream<Promise> body) {
        return Promise.add(() -> FIR.createClass(name, body));
    }
}
