package org.lexasub.langosSecondTry;

import org.lexasub.langosSecondTry.utils.Promise;

import java.util.Iterator;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class FIR {
    public static ClassFunction createFunction(Promise type,  Promise name, Stream<Promise> argType, Stream<Promise> argName, Stream<Promise> body) {
        return IIR.addFunction(type, name).
                addArgs(argType.map(i -> (ClassID) i.get()),
                        argName.map(i -> (ClassID) i.get())
                ).addBody(body.map(i -> (ClassElem) i.get()));
    }

    public static ClassNamespaceLeaf declareNamespace(Stream<Promise> ids) {
        Iterator<ClassID> it = ids.map(i -> (ClassID) i.get()).iterator();
        ClassNamespace np = ClassNamespace.findNamespace(it.next().text);
        while(it.hasNext()){
            String text = it.next().text;
            Optional<ClassNamespace> i = np.findSubNamespace(text);
            if(i.isEmpty()) return np.findSubElem(text);
        }
        return null;
    }

    public static Object createMethodCall(Promise o, Object funCall) {
    }

    public static Object createFunctionCall(Function funName, Stream<Promise> args) {
        return funName.apply(args.map(i -> (ClassExpr) i.get()));
    }

    public static Object createFunctionCall_(Promise promise, Stream<Promise> op) {
    }

    public static Object createGetMember(Promise id, Promise property) {
        return IIR.getClassLink((ClassID)id.get()).getProperty(property.get());
    }

    public static ClassLambda createSimpleLambda(Promise args, Promise expr) {
        return IIR.addSimpleLambda((Stream<Promise>) args.get(), expr);
    }

    public static ClassLambda createLambda(Promise args, Stream<Promise> elems) {
        return IIR.addLambda((Stream<Promise>) args.get(), elems);
    }

    public static Object createProgram(Stream<Promise> imports, Stream<Promise> elems) {
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


    public static ClassClass createClass(Promise name, Stream<Promise> body) {
        return IIR.addClass(name).addBody(body.map(i -> (ClassElem) i.get()));
    }
}
