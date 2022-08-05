package org.lexasub.langosSecondTry;

import org.lexasub.langosSecondTry.utils.Promise;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassLambda {
    LinkedList<ClassID> args;
    LinkedList<Object> exprs;
    public ClassLambda(Stream<Promise> args) {
        //may be it not ClassID
        this.args = args.map(i -> (ClassID) i.get()).collect(Collectors.toCollection(LinkedList::new));
    }

    public ClassLambda addExpr(Object expr) {//Object or ClassExpr
        exprs.add(expr);
        return this;
    }
}
