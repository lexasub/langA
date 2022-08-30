package org.lexasub.langosSecondTry;

import org.lexasub.langosSecondTry.utils.IdGenerator;
import org.lexasub.langosSecondTry.utils.Promise;

import java.util.Iterator;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class FIR {
    public static ClassFunction createFunction(Promise type,  Promise name, Stream<Promise> argType, Stream<Promise> argName, Stream<Promise> body, Promise nmspace) {
       return IIR.addFunction(type, name, nmspace)
                .addArgs(argType.map(i -> (ClassID) i.get()),
                        argName.map(i -> (ClassID) i.get())
                )
                .addBody(body.map(i -> (ClassElem) i.get()));
    }

    public static Scope declareNamespace(Stream<Promise> ids, Promise nmspace) {
        //что тут делать??? c nmspace.obj = ?
        Iterator<ClassID> it = ids.map(i -> (ClassID) i.get()).iterator();
        Scope np = ((Scope) nmspace.get()).findSubNamespace(it.next().text).get();
        while(it.hasNext()){
            ClassID next = it.next();
            String text = next.text;
            //mb np.obj = next??
            Optional<Scope> i = np.findSubNamespace(text);
            if(i.isEmpty()) return null;
            np = i.get();
        }
        return np;
    }

    public static Object createMethodCall(Promise nmspace, Object funCall) {
//o it's classNamespace or classNamespace


//хм. тут что-то не так,
            /*
            int a::s.f (){
            }
            a::s.f()
            or
            a::s.f()
            int a::s.f(){
            }
            create or add may be different
            это семантика, id в любом случае генерятся одинаково
             */

            Scope t = (Scope) nmspace.get();
            t.findSubNamespace(...)
    }

    public static Asm createFunctionCall(Function funName, Stream<Promise> args, Promise nmspace) {
        String id = IdGenerator.functionCall();
        Promise pr = ((Scope) nmspace.get()).addSubScope(id, Scope.Type.expr);
        Asm asm = (Asm) funName.apply(args.map(i -> (Scope) i.get()));
        pr.addWaiter(i -> ((Scope)i).obj=asm);
        //TODO change return type to ClassNamespace?
        return asm;
    }

    public static Object createFunctionCall_(Promise promise, Promise op) {
        //method_call | function_call
        (IIR) promise.get()
    }

    public static Object createGetMember(Promise id, Promise property, Promise nmspace) {
        return IIR.getClassLink((ClassID)id.get(), nmspace).getProperty(property.get());
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

    public static Object doImport(Stream<Promise> importPath) {
        return IIR.import_(importPath);
    }

    public static Object doReturn(Promise expr, Promise nmspace) {
        return IIR.return_(expr, nmspace);
    }

    public static ClassID createId(String id, Scope nmspace) {
       return IIR.getOrAddID(id, nmspace);
    }

    public static Object doBreak(Promise nmspace) {
        return IIR.break_(nmspace);
    }

    public static Object doContinue(Promise nmspace) {
        return IIR.continue_(nmspace);
    }

    public static ClassClass createClass(Promise name, Stream<Promise> body) {
        return IIR.addClass(name).addBody(body.map(i -> (ClassElem) i.get()));
    }
}
