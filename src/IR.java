import java.util.stream.Stream;

public class IR {
    Object obj;//TODO replace to singleton obj
    public Object promiseID(String text) {
        return Promise::add(() -> obj.createID(text));
    }

    public Object promiseElement(Object promiseID) {
    }

    public Object promiseSyntax(Object promiseID, Stream<Object> objectStream, Object visitRulelist) {
        return Promise::add(() -> {
            var t = objectStream.map((i) -> i.addAfterDependency(visitRulelist));
            return obj.createSyntax(promiseID, t, visitRulelist);
        });
    }

    public Object promiseBnfNamespaceObj(Object promiseID, Object promiseID1) {
        return Promise::add(() -> obj.createBnfNamespaceObj(promiseID,promiseID1));
    }

    public Object promiseBnfMethodCall(Object promiseID, Object visitSyntax_expr) {
        return Promise::add(
                () -> obj.findSyntax(promiseID).addHandlerExpression(visitSyntax_expr)
        );
    }

    public Object promiseBnfObjectGetter(Object promiseID, Object visitSyntax_expr_strong) {
        return null;
    }

    public Object promiseBnfTextGetter(Object promiseID, Object visitSyntax_expr) {
    }

    public Object promiseOneormore(Object visitAlternatives_strong) {
        /*return Promise::add(
                () -> {visitAlternatives_strong.}
        );*/
    }

    public Object promiseCHAR(String text) {
        return Promise::add(() -> obj.createChar(text));
    }

    public Object promiseSTRING(String text) {
        return Promise::add(() -> obj.createString(text));
    }

    public Object promiseBnfRange(Object promiseCHAR, Object promiseCHAR1) {
        return Promise::add(() -> obj.createRange(promiseCHAR, promiseCHAR1));
    }

    public Object promiseBnfOptional(Object visitAlternatives_strong) {
        return Promise::add(() -> obj.createOptional(visitAlternatives_strong));
    }

    public Object promiseZeroormore(Object visitAlternatives_strong) {
        return Promise::add(() -> obj.createZeroormore(visitAlternatives_strong));
    }

    public Object promiseZeroormoreNoneGready(Object visitAlternatives_strong) {
        return Promise::add(() -> obj.createZeroormoreNoneGready(visitAlternatives_strong));
    }

    public Object promiseSyntaxImpl(Object visitSyntax_namespace_obj, Object visitId_list_strong, Object visitSyntax_impl_body) {
    }

    public Object promiseSyntaxReturn(Object visitSyntax_expr) {
    }

    public Object promiseLambda(Object visitId_list, Stream<Object> objectStream) {
    }

    public Object promiseBnfImplBody(Stream<Object> objectStream) {
    }

    public Object promiseImport(Stream<Object> objectStream) {
    }

    public Object promiseProgram(Stream<Object> objectStream, Stream<Object> objectStream1, Stream<Object> objectStream2) {
    }

    public Object promiseIdList(Stream<Object> objectStream) {
    }

    public Object promiseBnfNot(Object visitElement) {
    }

    public Object promiseBnfAlternative(Stream<Object> objectStream) {
    }

    public Object promiseBnfAlternatives(Stream<Object> objectStream) {
    }

    public Object promiseRule_(Object id, Object alt) {
    }

    public Object promiseRuleList(Stream<Object> objectStream) {
    }
}
