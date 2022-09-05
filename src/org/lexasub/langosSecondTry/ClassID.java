package org.lexasub.langosSecondTry;

import java.util.Optional;

public class ClassID {
    public String text = "";
    Scope np;

    public static ClassID ClassIDGen(String id, Scope nmspace) {
        Optional<Scope> i = nmspace.findSubNamespace(id);
        if(i.isEmpty()) {
            ClassID _ci = new ClassID();
            _ci.text = id;
            nmspace.addSubScope(id, Scope.Type.id);
            _ci.np = nmspace.findSubNamespace(id).get();
            _ci.np.obj = _ci;
            return _ci;
        }
        return (ClassID) i.get().obj;

    }
}
