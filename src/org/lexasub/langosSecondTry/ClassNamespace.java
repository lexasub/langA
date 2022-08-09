package org.lexasub.langosSecondTry;

import java.util.LinkedList;
import java.util.Optional;

public class ClassNamespace {//TODO поменять примениния этого класса и наверное что-то статическое поменять
    String name;
    //LinkedList<Classes,mbFunctions,lambdas,subfunctions,for_,..> elements
    LinkedList<ClassNamespaceLeaf> elems = new LinkedList<>();
    static LinkedList<ClassNamespace> namespaces = new LinkedList<>();
    LinkedList<ClassNamespace> subNamespaces = new LinkedList<>();
    public static ClassNamespace findNamespace(String text) {
       return namespaces.stream().filter(i-> i.name == text).findFirst().get();
    }

    public Optional<ClassNamespace> findSubNamespace(String text) {
        return subNamespaces.stream().filter(i -> i.name == text).findFirst();
    }
    public ClassNamespaceLeaf findSubElem(String text) {
        return elems.stream().filter(i -> i.name == text).findFirst().get();
    }
}
