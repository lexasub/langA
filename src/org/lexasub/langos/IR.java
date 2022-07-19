package org.lexasub.langos;

import org.lexasub.langos.asm.ASM;
import org.lexasub.langos.asm.ASMMODULE;
import org.lexasub.langos.utils.Promise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class IR {//TODO? normal org.lexasub.langos.asm usage
    static List syn = new LinkedList<Syntax>();
    ASM asm;
    public Object createID(String s){
        return asm.addToTableIDs(s);
    }

    public Object createSyntax(Promise syntaxName, Stream<Promise> imports, Stream<Promise> rulelist) {
        Syntax syn_ = new Syntax(syntaxName);
        imports.forEach(syn_::addImport);
        syn_.addRuleList(rulelist);
        syn_.apply();
        syn.add(syn_);
        return syn_;
    }

    public Object createBnfNamespaceObj(Promise namespace_, Promise ruleName) {
        Syntax sn = findSyntaxNamespace(namespace_);
        if (sn == null) return null;
        return sn.findRule(ruleName);
    }

    public IR findSyntax(Promise promiseID) {//TODO разобраться
        return new IR();
    }

    public ASM createOneormore(Promise alternatives) {
        ((Stream<Object>) alternatives.get()).map(asm::addCode);
        return asm;
    }

    public Object createChar(String text) {
        return asm.addToTableUniqStr(text);
    }

    public Object createString(String text) {
        return asm.addToTableUniqStr(text);
    }

    public Object createRange(Promise charFrom, Promise charTo) {
        return Syntax.addRangeCheck(charFrom, charTo);
    }

    public ASM createOptional(Promise alternatives) {
        ((Stream<Object>) alternatives.get()).map(asm::addCode);
        return asm;
    }

    public ASM createZeroormore(Promise alternatives) {
        ((Stream<Object>) alternatives.get()).map(asm::addCode);
        return asm;
    }

    public ASM createZeroormoreNoneGready(Promise alternatives) {
        ((Stream<Object>) alternatives.get()).map(asm::addCode);
        return asm;
    }

    public Object createReturn(Promise returnExpr) {

    }

    public ASM createLambda(Promise lambdaArgs, Stream<Object> lambdaBody) {
        return asm.addLambda(lambdaArgs, lambdaBody);
    }

    public ASM createImplBody(Stream<Object> expressions) {
        expressions.map(asm::addCode);
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
        //elem.get()
    }

    public Object createAlternative(Stream<Object> elements) {
    }

    public Stream<Object> createAlternatives(Stream<Object> alternatives) {
        return alternatives;
    }//MB it's wrong

    public Object createRuleCall(Promise visitSyntax_namespace_obj, Promise visitSyntax_expr_helper) {//TODO разобраться
    }

    public Object addHandlerExpression(Object visitSyntax_expr) {
    }
    public static Syntax findSyntaxNamespace(Promise promise){
        Optional<Syntax> stream = syn.stream().filter(o -> ((Syntax)o).name == promise.get()).findFirst();
        if(!stream.isEmpty())
            return stream.get();
        return null;
    }

}
