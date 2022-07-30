package org.lexasub.langos.secondTry;

import org.lexasub.langos.secondTry.utils.Promise;

import java.util.Iterator;
import java.util.function.Function;
import java.util.stream.Stream;

public class FIR {
    public static IIR createFunction(Promise type, Object name, Promise args, Stream<Promise> body) {
        return IIR.addFunction(type, name).addArgs(args.get()).addBody(body.map(i -> (ClassElem)i.get()));
    }

    public static Object declareNamespace(Stream<Promise> ids) {
        Iterator<ClassID> it = ids.map(i -> (ClassID) i.get()).iterator();
        //it.next().text;
        while(it.hasNext()){
          //  it.next().text
        }
    }

    public static Object createMethodCall(Object o, Object funCall) {
    }

    public static Object createFunctionCall(Function funName, Stream<Promise> args) {
        return funName.apply(args.map(i -> (ClassExpr) i.get()));
    }

    public static Object createFunctionCall_(Promise promise, Stream<Promise> op) {
    }

    public static Object createGetMember(Promise id, Promise property) {
        return IIR.getClassLink((ClassID)id.get()).getProperty(property.get());
    }

    public static Object createLambda(Promise args, Object o) {

    }

    public static Object createProgram(Stream<Object> imports, Stream<Promise> elems) {
    }

    public static Stream<ClassID> createListOfIds(Stream<Promise> ids) {
        return ids.map(i -> (ClassID) i.get());
    }

    public static Object doImport(Stream<Promise> imports) {
    }

    public static Object doReturn(Promise expr) {
    }

    public static ClassID createId(String id) {
       return IIR.getOrAddID(id);
    }

    public static Object doBreak() {
    }

    public static Object doContinue() {
    }

    public void declareFunctionArg(Promise type, Promise name) {
        IIR.addNewVar(type, name);
    }
}
