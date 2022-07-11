import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
public class PromisedIR {
    public Promise promiseID(String text) {
       return Promise.add(() ->  IR.createID(text));
    }

    public Promise promiseElement(Promise promiseID) {
        return promiseID;
    }

    public Promise promiseSyntax(Promise promiseID, Stream<Promise> objectStream, Promise visitRulelist) {
        return Promise.add(() -> {
            Stream<Object> t = objectStream.map((i) -> i.addAfterDependency(visitRulelist));
            return IR.createSyntax(promiseID, t, visitRulelist);
        });
    }

    public Promise promiseBnfNamespaceObj(Promise promiseID, Promise promiseID1) {
        return Promise.add(() -> IR.createBnfNamespaceObj(promiseID, promiseID1));
    }

    public Promise promiseBnfMethodCall(Promise promiseID, Promise visitSyntax_expr) {
        return Promise.add(
                () -> IR.findSyntax(promiseID).addHandlerExpression(visitSyntax_expr)
        );
    }

    public Promise promiseBnfObjectGetter(Promise promiseID, Promise visitSyntax_expr_strong) {
    }

    public Promise promiseBnfTextGetter(Promise promiseID, Promise visitSyntax_expr) {
    }

    public Promise promiseOneormore(Promise visitAlternatives_strong) {
        return Promise.add(() -> IR.createOneormore(visitAlternatives_strong));
    }

    public Promise promiseCHAR(String text) {
        return Promise.add(() -> IR.createChar(text));
    }

    public Promise promiseSTRING(String text) {
        return Promise.add(() -> IR.createString(text));
    }

    public Promise promiseBnfRange(Promise promiseCHAR, Promise promiseCHAR1) {
        return Promise.add(() -> IR.createRange(promiseCHAR, promiseCHAR1));
    }

    public Promise promiseBnfOptional(Promise visitAlternatives_strong) {
        return Promise.add(() -> IR.createOptional(visitAlternatives_strong));
    }

    public Promise promiseZeroormore(Promise visitAlternatives_strong) {
        return Promise.add(() -> IR.createZeroormore(visitAlternatives_strong));
    }

    public Promise promiseZeroormoreNoneGready(Promise visitAlternatives_strong) {
        return Promise.add(() -> IR.createZeroormoreNoneGready(visitAlternatives_strong));
    }

    public Promise promiseSyntaxImpl(Promise visitSyntax_namespace_obj, Promise visitId_list_strong, Promise visitSyntax_impl_body) {
        return Promise.add(() ->
            IR.findSyntaxNamespace(
                    visitSyntax_namespace_obj.addWaiter((i) -> i.namespace())
            ).addHandler(
                    visitSyntax_namespace_obj.addWaiter((i) -> i.name()),
                    visitId_list_strong,
                    visitSyntax_impl_body
            )
        );
    }

    public Promise promiseSyntaxReturn(Promise visitSyntax_expr) {
        return Promise.add(() -> IR.createReturn(visitSyntax_expr));
    }

    public Promise promiseLambda(Promise visitId_list, Stream<Object> objectStream) {
        return Promise.add(() -> IR.createLambda(visitId_list,objectStream));
    }

    public Promise promiseBnfImplBody(Stream<Object> objectStream) {
        return Promise.add(() -> IR.createImplBody(objectStream));
    }

    public Promise promiseImport(Stream<Object> objectStream) {
        return Promise.add(() -> IR.createImport(objectStream));
    }

    public Promise promiseProgram(Stream<Object> objectStream, Stream<Object> objectStream1, Stream<Object> objectStream2) {
        return Promise.add(() -> {
            /*Object elem = objectStream.findFirst().orElse(null);
            Object firstElem = elem;//nonCopy!!
            TODO while(objectStream.count() != 0){
                newDependency = objectStream.findFirst().orElse(null);//next
                elem.addAfterDependency(newDependency);
                elem = newDependency;
            }
            return firstElem*/
            return null;
        });
    }

    public Promise promiseIdList(Stream<Object> objectStream) {
        return Promise.add(() -> IR.createIdList(objectStream));
    }

    public Promise promiseBnfNot(Promise visitElement) {
        return Promise.add(() -> IR.createNot(visitElement));
    }

    public Promise promiseBnfAlternative(Stream<Object> objectStream) {
        return Promise.add(() -> IR.createAlternative(objectStream));
    }

    public Promise promiseBnfAlternatives(Stream<Object> objectStream) {
        return Promise.add(() -> IR.createAlternatives(objectStream));
    }

    public Promise promiseRule_(Object id, Object alt) {
        return Promise.add(() -> IR.createRule(id, alt));
    }

    public Promise promiseRuleList(Stream<Object> objectStream) {
        return Promise.add(() -> IR.createRuleList(objectStream));
    }
}
