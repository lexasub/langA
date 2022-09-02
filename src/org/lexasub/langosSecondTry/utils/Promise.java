package org.lexasub.langosSecondTry.utils;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Promise {
    Supplier op;
    List<Promise> waiters = new LinkedList<>();
    List<Promise> dependences = new LinkedList<>();
    Object res;
    boolean isReady = false;
    public Promise(Supplier _op) {
        op = _op;
    }
   public Promise addWaiter(Function<Object,Object> o) {
        Promise pr = add(() -> o.apply(res));
        pr.dependences.add(this);
        waiters.add(pr);
        return pr;
    }
    public static Promise add(Supplier op) {
        return new Promise(op);
    }
    public Object get(){
        if(isReady) return res;
        dependences.stream().map(Promise::get);//getReady of deps
        res = op.get();
        isReady = true;
        return res;
    }
}
