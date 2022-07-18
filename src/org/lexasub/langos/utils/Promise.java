package org.lexasub.langos.utils;

import java.util.function.Function;
import java.util.function.Supplier;

public class Promise {
    class tmp {
        public String namespace="", name="";

        public Object namespace() {
            return namespace;
        }

        public Object name() {
            return name;
        }
    };

    public static Promise add(Supplier op) {
        return new Promise();
    }

    public Promise addAfterDependency(Promise visitRulelist) {
        return this;
    }

    public Promise addWaiter(Function<tmp,Object> o) {

        return this;
    }
    public Object get(){
        return null;
    }

    public boolean equals(Object obj){
        return true;
    }
}
