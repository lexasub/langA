package org.lexasub.langosSecondTry;

import org.lexasub.langosSecondTry.utils.Promise;

import java.util.LinkedList;
import java.util.Optional;

public class ClassNamespace {//TODO поменять примениния этого класса и наверное что-то статическое поменять
    String name;
    String type;
    ClassNamespace parent;

    public Object obj;
    //LinkedList<Classes,mbFunctions,lambdas,subfunctions,for_,..> elements
    //LinkedList<ClassNamespaceLeaf> elems = new LinkedList<>();
   // static LinkedList<ClassNamespace> namespaces = new LinkedList<>();
    LinkedList<Promise> subNamespaces = new LinkedList<>();//Promise<ClassNamespace>

    public ClassNamespace(String text, String _type) {
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

    public Promise addSubNamespace(String text, String _type) {
        Promise nmspace = Promise.add(() -> {
            ClassNamespace _nmspace = new ClassNamespace(text, _type);
            _nmspace.parent = this;
            return _nmspace;
        });
        subNamespaces.add(nmspace);
        return nmspace;
    }
    public Promise addSubNamespace(String text, String _type, Promise pr) {
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
