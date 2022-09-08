package org.lexasub.langosSecondTry;

import org.lexasub.langosSecondTry.utils.Promise;

import java.util.*;

public class Scope {
    public String asm;//TODO поменять примениния этого класса и наверное что-то статическое поменять
    String name;
    List<List<ClassID>> localVars = new ArrayList<>();

    public static String genAsmFromList(Scope t) {
        LinkedList<String> nmspaces = new LinkedList<>();
        while (t.parent != null) {
            nmspaces.add(Asm.intoScope(t.name));
            t = t.parent;
        }
        nmspaces.add(Asm.intoScope(t.name));
        Collections.reverse(nmspaces);
        return nmspaces.stream().reduce("", String::concat);
    }

    public static boolean deepSearch(Iterator<ClassID> it, Scope np) {
        while(it.hasNext()){
            ClassID next = it.next();
            String text = next.text;
            //mb np.obj = next??
            Optional<Scope> i = np.findSubNamespace(text);
            if(i.isEmpty()) return false;
            np = i.get();
        }
        return true;
    }

    public int declareVar(ClassID name, ClassID type) {
        localVars.add(Arrays.asList(name, type));
        return localVars.size() - 1;//element id
    }
    public int declareVar(ClassID name) {
        localVars.add(Arrays.asList(name, null));//may be ClassID(not null)
        return localVars.size() - 1;//element id
    }
    enum Type {expr,brace,class_, function, lambda, id, asm}
    Type type;
    Scope parent;

    public Object obj;
    //LinkedList<Classes,mbFunctions,lambdas,subfunctions,for_,..> elements
    //LinkedList<ClassNamespaceLeaf> elems = new LinkedList<>();
   // static LinkedList<ClassNamespace> namespaces = new LinkedList<>();
    LinkedList<Promise> subNamespaces = new LinkedList<>();//Promise<ClassNamespace>

    public Scope(String text, Type _type) {
        name = text;
        type = _type;
    }
    public Scope(String text, Type _type, String _asm) {
        name = text;
        type = _type;
        asm = _asm;
    }
    public Scope() {

    }
/*
    public static ClassNamespace findNamespace(String text) {
       return namespaces.stream().filter(i-> i.name == text).findFirst().get();
    }
*/
    public Optional<Scope> findSubNamespace(String text) {
        return subNamespaces.stream().map(i -> (Scope)i.get())
                .filter(i -> i.name == text).findFirst();
    }
    /*public ClassNamespaceLeaf findSubElem(String text) {
        return elems.stream().filter(i -> i.name == text).findFirst().get();
    }*/

    public Promise addSubScope(String text, Type _type) {
        Promise nmspace = Promise.add(() -> {
            Scope _nmspace = new Scope(text, _type);
            _nmspace.parent = this;
            return _nmspace;
        });
        subNamespaces.add(nmspace);
        return nmspace;
    }
    public Promise addSubScope(String text, Type _type, Promise pr) {
        Promise nmspace = Promise.add(() -> {
            Scope _nmspace = new Scope(text, _type);
            _nmspace.parent = this;
            _nmspace.obj = pr;
            return _nmspace;
        });
        subNamespaces.add(nmspace);
        return nmspace;
    }

    public Promise addSubScope(Scope scope) {
        Promise nmspace = Promise.add(() -> {
            scope.parent = this;
            return scope;
        });
        subNamespaces.add(nmspace);
        return nmspace;
    }
}
