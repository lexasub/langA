import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.Vector;

public class IR {
    static List syn = new LinkedList<Syntax>();
    ASM asm;
    public Object createID(String s){
        return asm.addToTableIDs(s);
    }

    public Object createSyntax(Promise promiseID, Stream<Object> t, Object visitRulelist) {

    }

    public Object createBnfNamespaceObj(Promise promiseID, Promise promiseID1) {
    }

    public IR findSyntax(Promise promiseID) {
        return new IR();
    }

    public Object createOneormore(Object visitAlternatives_strong) {
    }

    public Object createChar(String text) {
    }

    public Object createString(String text) {
    }

    public Object createRange(Promise promiseCHAR, Promise promiseCHAR1) {
    }

    public Object createOptional(Object visitAlternatives_strong) {
    }

    public Object createZeroormore(Object visitAlternatives_strong) {
    }

    public Object createZeroormoreNoneGready(Object visitAlternatives_strong) {
    }

    public Object createReturn(Object visitSyntax_expr) {
    }

    public Object createLambda(Object visitId_list, Stream<Object> objectStream) {
    }

    public Object createImplBody(Stream<Object> objectStream) {
    }

    public Object createImport(Stream<Object> objectStream) {
    }

    public Object createIdList(Stream<Object> objectStream) {
    }

    public Object createNot(Object visitElement) {
    }

    public Object createAlternative(Stream<Object> objectStream) {
    }

    public Object createAlternatives(Stream<Object> objectStream) {
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
        Optional<Syntax> stream = syn.stream().filter(o -> o.name == promise.get()).findFirst();
        if(!stream.isEmpty());
            return stream.get();
        return null;
    }

}
