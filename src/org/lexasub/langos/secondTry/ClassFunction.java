package org.lexasub.langos.secondTry;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Stream;

public class ClassFunction {
    LinkedList<ClassArg> args = new LinkedList<>();
    LinkedList<ClassElem> body = new LinkedList<>();
    String type;
    String name;
    public ClassFunction(Object _type, Object _name) {
        type = (String) _type;//may be it ClassID
        name = (String) _name;
    }

    public ClassFunction addArgs(Stream<ClassID> typeStream, Stream<ClassID> nameStream) {
        Iterator<ClassID> itType = typeStream.iterator();
        Iterator<ClassID> itName = nameStream.iterator();
        while (itType.hasNext()){
            args.add(new ClassArg(itType.next(), itName.next()));
        }
        return this;
    }

    public ClassFunction addBody(Stream<ClassElem> classElemStream) {
        classElemStream.map(i -> args.stream().map(j -> i.replaceIDToClass(j.name)));//mb name.text
        classElemStream.map(body::add);
        return this;
    }
}
