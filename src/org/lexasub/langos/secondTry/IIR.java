package org.lexasub.langos.secondTry;

import org.lexasub.langos.secondTry.utils.Promise;

public class IIR {//intermidiate IR
    private static final IIR iir = new IIR();

    public static ClassID getOrAddID(String id) {
        return new ClassID(id);
    }

    public static ClassFunction addFunction(Promise type, Promise name) {
        return new ClassFunction(type.get(), name.get());
    }


    public static ClassClass getClassLink(ClassID classID) {
    }

    public static ClassClass addClass(Promise name) {
        return new ClassClass(name.get());
    }
}
