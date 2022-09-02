package org.lexasub.langosSecondTry;

import org.lexasub.langosSecondTry.utils.Promise;

import java.util.Iterator;
import java.util.Optional;
import java.util.stream.Stream;

public class IIR {//intermidiate IR
    //private static final IIR iir = new IIR();

    public static ClassID getOrAddID(String id, Scope nmspace) {
        Optional<Scope> i = nmspace.findSubNamespace(id);
        if(i.isEmpty())
            return new ClassID(id, nmspace);
        return (ClassID) i.get().obj;
    }

    public static ClassFunction addFunction(Promise type, Promise name, Promise nmspace) {
        return new ClassFunction(type.get(), name.get(), nmspace);
    }


    public static ClassClass getClassLink(ClassID classID, Promise nmspace) {
        return (ClassClass) ((Scope)nmspace.get()).findSubNamespace(classID.text).get().obj;
    }

    public static ClassClass addClass(Promise name) {
        return new ClassClass(name.get());
    }

    public static String addSimpleLambda(Stream<Promise> args, Promise expr) {
        return new ClassLambda(args).addExpr((Scope) expr.get()).genAsm();
    }

    public static String addLambda(Stream<Promise> args, Stream<Promise> elems) {
        ClassLambda lambda = new ClassLambda(args);
        elems.map(Promise::get).map(i -> (Scope)i).map(lambda::addExpr);
        return lambda.genAsm();
    }

    public static String import_(Stream<Promise> importPath) {
        Iterator<Promise> it = importPath.iterator();
        Promise obj  = it.next();
        Promise path = null;
        if(it.hasNext()){
            if((String) obj.get() == "system")
                return importSystem(it);
        }
        while(it.hasNext()) {
            if(path == null)
                path = obj;
            else {
                Promise finalObj = obj;
                path = path.addWaiter(i -> i + "/" + finalObj.get());
            }
            obj = it.next();
        }
        return importModule((String) path.get(), (String)obj.get());
    }

    private static String importModule(String path, String moduleName) {
        return Asm.ImportOslang(path, moduleName);
    }

    private static String importSystem(Iterator<Promise> it) {
        //TODO
    }

    public static Object return_(Promise expr, Promise nmspace) {

    }

    public static Object break_(Promise nmspace) {
    }

    public static Object continue_(Promise nmspace) {

    }
}
