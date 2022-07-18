import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class IR {//TODO? normal asm usage
    static List syn = new LinkedList<Syntax>();
    ASM asm;
    public Object createID(String s){
        return asm.addToTableIDs(s);
    }

    public Object createSyntax(Promise promiseID, Stream<Promise> t, Promise rulelist) {
        Syntax syn_ = new Syntax(promiseID);
        t.forEach(syn_::addImport);
        syn_.addRuleList(rulelist);
        syn_.apply();
        syn.add(syn_);
        return syn_;
    }

    public Object createBnfNamespaceObj(Promise promiseID, Promise promiseID1) {
        Syntax sn = findSyntaxNamespace(promiseID);
        if (sn == null) return null;
        return sn.findRule(promiseID1);
    }

    public IR findSyntax(Promise promiseID) {
        return new IR();
    }

    public ASM createOneormore(Promise visitAlternatives_strong) {
        ((Stream<Object>) visitAlternatives_strong.get()).map(asm::addCode);
        return asm;
    }

    public Object createChar(String text) {
        return asm.addToTableUniqStr(text);
    }

    public Object createString(String text) {
        return asm.addToTableUniqStr(text);
    }

    public Object createRange(Promise promiseCHAR, Promise promiseCHAR1) {
        return Syntax.addRangeCheck(promiseCHAR, promiseCHAR1);
    }

    public ASM createOptional(Promise visitAlternatives_strong) {
        ((Stream<Object>) visitAlternatives_strong.get()).map(asm::addCode);
        return asm;
    }

    public ASM createZeroormore(Promise visitAlternatives_strong) {
        ((Stream<Object>) visitAlternatives_strong.get()).map(asm::addCode);
        return asm;
    }

    public ASM createZeroormoreNoneGready(Promise visitAlternatives_strong) {
        ((Stream<Object>) visitAlternatives_strong.get()).map(asm::addCode);
        return asm;
    }

    public Object createReturn(Object visitSyntax_expr) {

    }

    public ASM createLambda(Object visitId_list, Stream<Object> objectStream) {
        return asm.addLambda(visitId_list, objectStream);
    }

    public Object createImplBody(Stream<Object> objectStream) {
        objectStream.map(asm::addCode);
        return asm;
    }

    public Object createImport(Stream<Object> objectStream) {
        Iterator<Object> it = objectStream.iterator();
        ASMMODULE mod = asm.findModule(it.next());
        while(it.hasNext()) {
            mod = mod.findSubModule(it.next());
        }
        mod.import_();
        return asm;
    }

    public Object createIdList(Stream<Promise> objectStream) {
        objectStream.map(i -> asm.addToTableIDs((String) i.get()));
        return asm;
    }

    public Object createNot(Object visitElement) {
    }

    public Object createAlternative(Stream<Object> objectStream) {
    }

    public Stream<Object> createAlternatives(Stream<Object> objectStream) {
        return objectStream;
    }

    public Object createRule(Object id, Object alt) {
    }

    public Object createRuleList(Stream<Object> objectStream) {
    }

    public Object createRuleCall(Promise visitSyntax_namespace_obj, Promise visitSyntax_expr_helper) {
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
