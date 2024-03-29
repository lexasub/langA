package org.lexasub.langosSecondTry;

import org.lexasub.langosSecondTry.utils.IdGenerator;
import org.lexasub.langosSecondTry.utils.Promise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class FIR {
    public static ClassFunction createFunction(Promise type,  Promise name, Stream<Promise> argType,
                                               Stream<Promise> argName, Promise nmspace) {
       return IIR.addFunction(type, name, nmspace)
                .addArgs(argType.map(i -> (ClassID) ((Scope) i.get()).obj),
                        argName.map(i -> (ClassID) ((Scope) i.get()).obj)
                );
    }

    public static Scope declareNamespace(Stream<Promise> ids, Promise nmspace) {
        //что тут делать??? c nmspace.obj = ?
        Iterator<ClassID> it = ids.map(i -> (ClassID)(((Scope) i.get()).obj)).iterator();
        Scope np = ((Scope) nmspace.get()).findSubNamespace(it.next().text).get();
        if(!Scope.deepSearch(it, np)) return null;
        return np;
    }
    public static Promise createMethodCall(Promise nmspace, Promise funCall, Promise nmspace_) {
        //funCall it's Scope
        Promise asm = funCall.addWaiter(i ->
            Scope.genAsmFromList((Scope) nmspace.get()) + ((Scope)i).asm
        );
            /*
            INTOSCOPE org
            INTOSCOPE su
            INTOSCOPE langos
            INTOSCOPE classRRR
             */
            /*~~~~~~~
            POP ss
            ...
            CALL ee
            ~~~~~~~~*/
        return nmspace_.addWaiter(i ->
                ((Scope)i).addSubScope(new Scope(IdGenerator.functionCall(), Scope.Type.asm, (String) asm.get()))
        );
    }

    public static Promise createFunctionCall(Function funName, Stream<Promise> args, Promise nmspace) {//TODO check, strange func
        Scope scope = (Scope) nmspace.get();
        Promise pr = scope.addSubScope(IdGenerator.functionCall(), Scope.Type.expr);
        String asm = (String) funName.apply(args.map(i -> (Scope) i.get()));
        pr.addWaiter(i -> ((Scope)i).asm=asm);
        return pr;
    }

    public static String createFunctionCall_(Promise pr1, Promise pr2) {
        return (String) pr1.addWaiter(i->((Scope)i).asm).get() + pr2.get();
    }

    public static Object createGetMember(Promise id, Promise property, Promise nmspace) {
        return ClassClass.getClassLink((ClassID) (((Scope)id.get()).obj), nmspace).getProperty((Scope) property.get());
    }

    public static String createSimpleLambda(Promise args, Promise expr) {
        return IIR.addSimpleLambda((Stream<Promise>) args.get(), expr);
    }

    public static String createLambda(Promise args, Stream<Promise> elems) {
        return IIR.addLambda((Stream<Promise>) args.get(), elems);
    }

    public static Stream<Promise> createProgram(Stream<Promise> imports, Stream<Promise> elems) {
        /*
        //may be run promises
        imports.map(Promise::get);
        elems.map(Promise::get);
        */
        return Stream.concat(imports, elems);
    }

    public static Stream<ClassID> createListOfIds(Stream<Promise> ids) {
        return ids.map(i -> (ClassID) i.get());
    }

    public static String doImport(Stream<Promise> importPath) {
        return IIR.import_(importPath);
    }

    public static Object doReturn(Promise expr, Promise nmspace) {
        return IIR.return_(expr, nmspace);
    }

    public static Scope createId(String id, Scope nmspace) {
       return ClassID.ClassIDGen(id, nmspace);
    }

    public static Object doBreak(Promise nmspace) {
        return IIR.break_(nmspace);
    }

    public static Object doContinue(Promise nmspace) {
        return IIR.continue_(nmspace);
    }

    public static ClassClass createClass(Promise name, Stream<Promise> body) {//TODO or return type Scope?
        return IIR.addClass(name).addBody(body.map(i -> (ClassElem) i.get()));
    }
}
