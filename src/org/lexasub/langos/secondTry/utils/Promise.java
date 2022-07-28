package org.lexasub.langos.secondTry.utils;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Promise {
    public void addAfterDependency(Promise tmp) {
    }

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

    public Promise addAfterDependency(Stream<Promise> visitRulelist) {
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
