package org.lexasub.langosSecondTry;

import org.lexasub.langosSecondTry.utils.Promise;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassLambda {
    Scope np;
    LinkedList<ClassID> args;
    LinkedList<Scope> exprs;
    public ClassLambda(Stream<Promise> args) {
        //may be it not ClassID
        this.args = args.map(i -> (ClassID)((Scope) i.get()).obj).collect(Collectors.toCollection(LinkedList::new));
    }

    public ClassLambda addExpr(Scope expr) {
        exprs.add(expr);
        return this;
    }

    public String genAsm() {
        Stream<String> head = args.stream()
                .map(i -> np.declareVar(i))
                .map(i -> Asm.getArg("lr" + i.toString()));//lr0 ... - it's local register
        Stream<String> body = exprs.stream().map(i -> {
            if (i.obj instanceof Promise) ((Promise) i.obj).get();//хитрый трюк,
            // в промисе должен быть addWaiter который сам обратиться к объекту, и объект сам в Scope 'asm' скинет
            return i.asm;//Must not == null
        });
        return Asm.newScope() + Stream.concat(head, body) + Asm.endScope();//хмм лямбда не сразу вызывается, тот кто принимает эту строку, должен знать об этом
    }
}
