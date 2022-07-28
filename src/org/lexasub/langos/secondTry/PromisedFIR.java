package org.lexasub.langos.secondTry;

import org.lexasub.langos.secondTry.utils.Promise;

import java.util.Iterator;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PromisedFIR {
    public Promise promiseFuncArgs(Stream<Promise> types, Stream<Promise> names) {
        Iterator<Promise> iTypes = types.iterator();
        Iterator<Promise> iArgs = names.iterator();
        return Promise.add(() -> {
            FIR fir = new FIR();
            IntStream.iterate(0, i -> i < types.count(), i -> i + 1).
                    forEachOrdered(i -> fir.declareFunctionArg(iTypes.next(), iArgs.next()));
            return fir;
        });
    }

    public Promise promiseFunction(Object spec, Promise type, Object nmspace, Function func,
                                   Promise args, Stream<Promise> body) {
        //skip spec//пока их нету
        return Promise.add(() -> FIR.createFunction(type, (nmspace != null)?nmspace:func,args,body));

    }

    public Object declareNamespace(Stream<Promise> ids) {
        return Promise.add(() -> FIR.declareNamespace(ids));
    }

    public Promise promiseMethodCall(Object nmspace, Promise className, Object funCall) {
        return Promise.add(() -> FIR.createMethodCall((nmspace != null)?nmspace:className, funCall));
    }

    public Promise promiseFunctionCall(Function funName, Stream<Promise> args) {
        return Promise.add(() -> FIR.createFunctionCall(funName, args));
    }

    public Promise promiseFunctionCall_(Promise methCall, Promise funCall, Stream<Promise> op) {
        //op it's property or funcall
        return Promise.add(() -> FIR.createFunctionCall_(
                    (methCall!=null)?methCall:funCall,
                    op
        ));
    }

    public Promise promiseGetMember(Promise id, Promise property) {
        return Promise.add(() -> FIR.createGetMember(id,property));
    }

    public Promise promiseLambda(Promise args, Stream<Promise> elems, Promise expr) {
        return Promise.add(() -> FIR.createLambda(args, (elems != null)? elems : expr));//maybe convert expr to Stream?? but how?
    }

    public Promise promiseProgram(Stream<Object> imports, Stream<Promise> elems) {
        return Promise.add(() -> FIR.createProgram(imports, elems));
    }

    public Promise promiseIds(Stream<Promise> ids) {
    }

    public Promise promiseImport(Stream<Promise> imports) {
    }

    public Promise promiseReturn(Promise expr) {
    }

    public Promise promiseId(String text) {
    }

    public Promise promiseBreak() {
    }

    public Promise promiseContinue() {
    }
}
