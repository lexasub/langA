package org.lexasub.langosSecondTry;

import java.util.Optional;

public class ClassID {
    public String text = "";
    Scope np;
    public ClassID(String id, Scope nmspace) {
        text = id;
        Optional<Scope> i = nmspace.findSubNamespace(id);
        if(i.isEmpty()) {
            nmspace.addSubScope(id, Scope.Type.id);
            np = nmspace.findSubNamespace(id).get();
            nmspace.findSubNamespace(id).get().obj = this;
        }
        else {
            //error
        }
    }
}
