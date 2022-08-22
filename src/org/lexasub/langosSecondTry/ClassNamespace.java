package org.lexasub.langosSecondTry;

import org.lexasub.langosSecondTry.utils.Promise;

import java.util.LinkedList;
import java.util.Optional;

public class ClassNamespace {//TODO поменять примениния этого класса и наверное что-то статическое поменять
    String name;
    enum Type {expr,brace,class_, function, lambda,id}
    Type type;
    ClassNamespace parent;

    public Object obj;
    //LinkedList<Classes,mbFunctions,lambdas,subfunctions,for_,..> elements
    //LinkedList<ClassNamespaceLeaf> elems = new LinkedList<>();
   // static LinkedList<ClassNamespace> namespaces = new LinkedList<>();
    LinkedList<Promise> subNamespaces = new LinkedList<>();//Promise<ClassNamespace>

    public ClassNamespace(String text, Type _type) {
        name = text;
        type = _type;
    }

    public ClassNamespace() {

    }
/*
    public static ClassNamespace findNamespace(String text) {
       return namespaces.stream().filter(i-> i.name == text).findFirst().get();
    }
*/
    public Optional<ClassNamespace> findSubNamespace(String text) {
        return subNamespaces.stream().map(i -> (ClassNamespace)i.get())
                .filter(i -> i.name == text).findFirst();
    }
    /*public ClassNamespaceLeaf findSubElem(String text) {
        return elems.stream().filter(i -> i.name == text).findFirst().get();
    }*/

    public Promise addSubNamespace(String text, Type _type) {
        Promise nmspace = Promise.add(() -> {
            ClassNamespace _nmspace = new ClassNamespace(text, _type);
            _nmspace.parent = this;
            return _nmspace;
        });
        subNamespaces.add(nmspace);
        return nmspace;
    }
    public Promise addSubNamespace(String text, Type _type, Promise pr) {
        Promise nmspace = Promise.add(() -> {
            ClassNamespace _nmspace = new ClassNamespace(text, _type);
            _nmspace.parent = this;
            _nmspace.obj = pr;
            return _nmspace;
        });
        subNamespaces.add(nmspace);
        return nmspace;
    }
}
