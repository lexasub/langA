package org.lexasub.langosSecondTry;

import org.lexasub.langosSecondTry.utils.Promise;

import java.util.Iterator;
import java.util.Optional;
import java.util.stream.Stream;

public class IIR {//intermidiate IR
    //private static final IIR iir = new IIR();

    public static ClassFunction addFunction(Promise type, Promise name, Promise nmspace) {
        //TODO or return type Scope?
        return new ClassFunction((Scope) type.get(), (Scope) name.get(), nmspace);
    }

    public static ClassClass addClass(Promise name) {
        return new ClassClass(name.get());
    }

    public static String addSimpleLambda(Stream<Promise> args, Promise expr) {
        return new ClassLambda(args).addExpr((Scope) expr.get()).genAsm();
    }

    public static String addLambda(Stream<Promise> args, Stream<Promise> elems) {
        ClassLambda lambda = new ClassLambda(args);
        elems.map(Promise::get).map(i -> lambda.addExpr((Scope)i));
        return lambda.genAsm();
    }

    public static String import_(Stream<Promise> importPath) {
        Iterator<Promise> it = importPath.iterator();
        Promise obj  = it.next();
        if(it.hasNext()){
            if((String) obj.get() == "system")
                return importSystem(it);
        }
        Promise path = obj;
        while(it.hasNext()) {
            Promise finalObj = it.next();
            path = path.addWaiter(i -> i + "/" + ((ClassID) ((Scope) finalObj.get()).obj).text);
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
