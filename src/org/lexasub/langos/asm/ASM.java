package org.lexasub.langos.asm;

import org.lexasub.langos.Syntax;
import org.lexasub.langos.Rule;
import org.lexasub.langos.utils.Promise;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class ASM {
    List ids = new LinkedList<String>();
    List uniqStr = new LinkedList<String>();
    public String addToTableIDs(String s) {
        ids.add(s);
        return s;
    }

    public <R> R addCode(ASM o) {
        //org.lexasub.langos.asm.ASM должен приходить
        return null;
    }

    public String addToTableUniqStr(String text) {
        uniqStr.add(text);
        return text;
    }

    public ASM addLambda(Object visitId_list, Stream<Object> objectStream) {//TODO
        return  this;
    }

    public ASMMODULE findModule(Object next) {//TODO

        return null;
    }

    public void neg(ASM asm) {//TODO

    }

    public void generateRunRule(Rule Rule, Promise methodArgs, List<Syntax> syn) {//TODO

    }
}
