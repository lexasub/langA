package org.lexasub.langos;

import org.lexasub.langos.asm.ASM;
import org.lexasub.langos.asm.ASMMODULE;
import org.lexasub.langos.utils.Promise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FIR {//FRONTEND IR
    //TODO? normal org.lexasub.langos.asm usage
    static List<Syntax> syn = new LinkedList<>();
    ASM asm;
    public Object createID(String s){
        return asm.addToTableIDs(s);
    }

    public Object createSyntax(Promise syntaxName, Stream<Promise> imports, Stream<Promise> ruleList) {
        Syntax syn_ = new Syntax(syntaxName);
        imports.forEach(syn_::addImport);
        syn_.addRuleList(ruleList);
        syn_.apply();
        syn.add(syn_);
        return syn_;
    }

    public Rule createBnfNamespaceObj(Promise namespace_, Promise ruleName) {
        Syntax sn = findSyntaxNamespace(namespace_);
        if (sn == null) return null;
        return sn.findRule(ruleName);
    }

    public ASM createOneormore(Promise alternatives) {
        ((Stream<ASM>) alternatives.get()).map(asm::addCode);
        return asm;
    }

    public Object createChar(String text) {//TODO что-то не так, syntax надо присыпать
       return asm.addToTableUniqStr(text);
    }

    public Object createString(String text) {
        return asm.addToTableUniqStr(text);
    }

    public Object createRange(Promise charFrom, Promise charTo) {
        return Syntax.addRangeCheck(charFrom, charTo);
    }

    public ASM createOptional(Promise alternatives) {
        ((Stream<ASM>) alternatives.get()).map(asm::addCode);
        return asm;
    }

    public ASM createZeroormore(Promise alternatives) {
        ((Stream<ASM>) alternatives.get()).map(asm::addCode);
        return asm;
    }

    public ASM createZeroormoreNoneGready(Promise alternatives) {
        ((Stream<ASM>) alternatives.get()).map(asm::addCode);
        return asm;
    }

    public Object createReturn(Promise returnExpr) {//TODO
        return null;
    }

    public ASM createLambda(Promise lambdaArgs, Stream<Object> lambdaBody) {
        return asm.addLambda(lambdaArgs, lambdaBody);
    }

    public ASM createImplBody(Stream<Promise> expressions) {
        expressions.map(i -> asm.addCode((ASM) i.get()));
        return asm;
    }

    public ASM createImport(Stream<Object> imports) {
        Iterator<Object> it = imports.iterator();
        ASMMODULE mod = asm.findModule(it.next());
        while(it.hasNext()) {
            mod = mod.findSubModule(it.next());
        }
        mod.import_();
        return asm;
    }

    public ASM createIdList(Stream<Promise> ids) {
        ids.map(i -> asm.addToTableIDs((String) i.get()));
        return asm;
    }

    public Object createNot(Promise elem) {
        asm.neg((ASM) elem.get());
        return asm;
    }

    public Object createAlternative(Stream<Promise> elements) {//TODO
        return null;
    }

    public Stream<Object> createAlternatives(Stream<Object> alternatives) {
        return alternatives;
    }//MB it's wrong

    public Object bnfRuleCall(Promise methodFullName, Promise methodArgs) {
        asm.generateRunRule((Rule) methodFullName.get(), methodArgs, syn);
        return asm;
    }
    public static Syntax findSyntaxNamespace(Promise promise){
        Optional<Syntax> stream = syn.stream().filter(o -> ((Syntax)o).name == promise.get()).findFirst();
        if(!stream.isEmpty())
            return stream.get();
        return null;
    }

}
