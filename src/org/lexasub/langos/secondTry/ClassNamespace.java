package org.lexasub.langos.secondTry;

import java.util.LinkedList;
import java.util.Optional;

public class ClassNamespace {
    String name;
    //LinkedList<Classes,mbFunctions,lambdas,subfunctions,for_,..> elements
    LinkedList<ClassNamespaceLeaf> elems = new LinkedList<>();
    static LinkedList<ClassNamespace> namespaces = new LinkedList<>();
    LinkedList<ClassNamespace> subNamespaces = new LinkedList<>();
    public static ClassNamespace findNamespace(String text) {
       return namespaces.stream().filter(i-> i.name == text).findFirst().get();
    }

    public ClassNamespace findSubNamespace(String text) {
        Optional<ClassNamespace> sn = subNamespaces.stream().filter(i -> i.name == text).findFirst();
        return (!sn.isEmpty())?sn.get(): elems.stream().filter(i -> i.name == text).findFirst().get();
    }
}
