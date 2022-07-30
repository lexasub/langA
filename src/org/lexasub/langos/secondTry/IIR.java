package org.lexasub.langos.secondTry;

import org.lexasub.langos.secondTry.utils.Promise;

import java.util.stream.Stream;

public class IIR {//intermidiate IR
    private static final IIR iir = new IIR();

    public static ClassID getOrAddID(String id) {
    }

    public static void addNewVar(Promise type, Promise name) {
    }

    public static IIR addFunction(Promise type, Object name) {
        return iir;
    }

    public static IIR addArgs(Object o) {
        return iir;
    }

    public static IIR addBody(Stream<ClassElem> classElemStream) {
        return iir;
    }

    public static ClassClass getClassLink(ClassID classID) {
    }
}
