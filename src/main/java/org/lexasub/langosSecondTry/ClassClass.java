package org.lexasub.langosSecondTry;

import org.lexasub.langosSecondTry.utils.Promise;

import java.util.LinkedList;
import java.util.stream.Stream;

public class ClassClass {
    LinkedList<ClassElem> body = new LinkedList<>();
    String name;
    Scope np;

    public static ClassClass getClassLink(ClassID classID, Promise nmspace) {
        return (ClassClass) ((Scope)nmspace.get()).findSubNamespace(classID.text).get().obj;
    }
    public ClassClass(Object _name) {
        name = (String) _name;//may be it ClassID
    }

    public Object getProperty(Scope o) {
        ClassID pr = (ClassID) o.obj;
        return null;
    }

    public ClassClass addBody(Stream<ClassElem> _body) {
        _body.map(body::add);//mb name.text
        return this;
    }
}
