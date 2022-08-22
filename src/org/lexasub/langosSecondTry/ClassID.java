package org.lexasub.langosSecondTry;

import java.util.Optional;

public class ClassID {
    public String text = "";
    ClassNamespace np;
    public ClassID(String id, ClassNamespace nmspace) {
        text = id;
        Optional<ClassNamespace> i = nmspace.findSubNamespace(id);
        if(i.isEmpty()) {
            nmspace.addSubNamespace(id, ClassNamespace.Type.id);
            np = nmspace.findSubNamespace(id).get();
            nmspace.findSubNamespace(id).get().obj = this;
        }
        else {
            //error
        }
    }
}
