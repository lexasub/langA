package org.lexasub.langosSecondTry;

import org.lexasub.langosSecondTry.utils.ClassArg;
import org.lexasub.langosSecondTry.utils.Promise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Stream;

public class ClassFunction implements PreAsm {
    LinkedList<ClassArg> args = new LinkedList<>();
    LinkedList<ClassElem> body = new LinkedList<>();
    String type;
    String name;
    Scope np;
    public ClassFunction(Scope _type, Scope _name, Promise nmspace) {
        type = ((ClassID) _type.obj).text;//may be it ClassID
        name = ((ClassID) _name.obj).text;
        np = (Scope) nmspace.get();
    }

    public ClassFunction addArgs(Stream<ClassID> typeStream, Stream<ClassID> nameStream) {
        Iterator<ClassID> itType = typeStream.iterator();
        Iterator<ClassID> itName = nameStream.iterator();
        while (itType.hasNext()){
            args.add(new ClassArg(itType.next(), itName.next()));
        }
        return this;
    }

    public ClassFunction addBody(Stream<ClassElem> classElemStream) {
       // classElemStream.map(i -> args.stream().map(j -> i.replaceIDToClass(j.name)));//mb name.text
        classElemStream.map(body::add);
        return this;
    }

    @Override
    public String GenASM() {
        //generate variables table
        String scope = Asm.newScope();
        Stream<String> head = args.stream().map(i -> np.declareVar(i.name, i.type))
                .map(i -> Asm.getArg("lr" + i.toString()));//lr0 ... - it's local register
        //TODO body generate asm and replace arguments-variables in body to lr0... registers
        //Asm.endScope
        //+= Asm.call("ee")
        return null;
    }
}
