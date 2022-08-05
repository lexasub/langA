package org.lexasub.langosSecondTry;

import java.util.LinkedList;
import java.util.stream.Stream;

public class ClassClass {
    LinkedList<ClassElem> body = new LinkedList<>();
    String name;

    public ClassClass(Object _name) {
        name = (String) _name;//may be it ClassID
    }

    public Object getProperty(Object o) {
    }

    public ClassClass addBody(Stream<ClassElem> _body) {
        _body.map(body::add);//mb name.text
        return this;
    }
}
