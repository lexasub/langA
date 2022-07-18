package org.lexasub.langos;

import org.lexasub.langos.utils.Promise;

import java.util.ListIterator;
import java.util.stream.Stream;
public class PromisedIR {
    public Promise promiseID(String text) {
       return Promise.add(() ->  (new IR()).createID(text));
    }

    public Promise promiseElement(Promise promiseID) {
        return promiseID;
    }

    public Promise promiseSyntax(Promise promiseID, Stream<Promise> objectStream, Promise visitRulelist) {
        return Promise.add(() -> {
            Stream<Promise> t = objectStream.map((i) -> i.addAfterDependency(visitRulelist));
            return (new IR()).createSyntax(promiseID, t, visitRulelist);
        });
    }

    public Promise promiseBnfNamespaceObj(Promise promiseID, Promise promiseID1) {
        return Promise.add(() -> (new IR()).createBnfNamespaceObj(promiseID, promiseID1));
    }

    public Promise promiseBnfMethodCall(Promise promiseID, Promise visitSyntax_expr) {
        return Promise.add(
                () -> (new IR()).findSyntax(promiseID).addHandlerExpression(visitSyntax_expr)
        );
    }

    public Promise promiseBnfObjectGetter(Promise promiseID, Promise visitSyntax_expr_strong) {
        return null;
    }

    public Promise promiseBnfTextGetter(Promise promiseID, Promise visitSyntax_expr) {
        return null;
    }

    public Promise promiseOneormore(Promise visitAlternatives_strong) {
        return Promise.add(() -> (new IR()).createOneormore(visitAlternatives_strong));
    }

    public Promise promiseCHAR(String text) {
        return Promise.add(() -> (new IR()).createChar(text));
    }

    public Promise promiseSTRING(String text) {
        return Promise.add(() -> (new IR()).createString(text));
    }

    public Promise promiseBnfRange(Promise promiseCHAR, Promise promiseCHAR1) {
        return Promise.add(() -> (new IR()).createRange(promiseCHAR, promiseCHAR1));
    }

    public Promise promiseBnfOptional(Promise visitAlternatives_strong) {
        return Promise.add(() -> (new IR()).createOptional(visitAlternatives_strong));
    }

    public Promise promiseZeroormore(Promise visitAlternatives_strong) {
        return Promise.add(() -> (new IR()).createZeroormore(visitAlternatives_strong));
    }

    public Promise promiseZeroormoreNoneGready(Promise visitAlternatives_strong) {
        return Promise.add(() -> (new IR()).createZeroormoreNoneGready(visitAlternatives_strong));
    }

    public Promise promiseSyntaxImpl(Promise visitSyntax_namespace_obj, Promise visitId_list_strong, Promise visitSyntax_impl_body) {
        return Promise.add(() ->
                Syntax.linkSyntaxImpl(
                    visitSyntax_namespace_obj,
                    visitId_list_strong,
                    visitSyntax_impl_body
                )
        );
    }

    public Promise promiseSyntaxReturn(Promise visitSyntax_expr) {
        return Promise.add(() -> (new IR()).createReturn(visitSyntax_expr));
    }

    public Promise promiseLambda(Promise visitId_list, Stream<Object> objectStream) {
        return Promise.add(() -> (new IR()).createLambda(visitId_list,objectStream));
    }

    public Promise promiseBnfImplBody(Stream<Object> objectStream) {
        return Promise.add(() -> (new IR()).createImplBody(objectStream));
    }

    public Promise promiseImport(Stream<Object> objectStream) {
        return Promise.add(() -> (new IR()).createImport(objectStream));
    }

    public Promise promiseProgram(Stream<Promise> objectStream, Stream<Object> objectStream1, Stream<Object> objectStream2) {
        return Promise.add(() -> {
            ListIterator<Promise> elem = objectStream.toList().listIterator();
            Object firstElem = elem.next();//nonCopy!!
            while(objectStream.count() != 0){
                var tmp = elem.next();
                elem.previous().addAfterDependency(tmp);
            }
            return firstElem;
        });
    }

    public Promise promiseIdList(Stream<Promise> objectStream) {
        return Promise.add(() -> (new IR()).createIdList(objectStream));
    }

    public Promise promiseBnfNot(Promise visitElement) {
        return Promise.add(() -> (new IR()).createNot(visitElement));
    }

    public Promise promiseBnfAlternative(Stream<Object> objectStream) {
        return Promise.add(() -> (new IR()).createAlternative(objectStream));
    }

    public Promise promiseBnfAlternatives(Stream<Object> objectStream) {
        return Promise.add(() -> (new IR()).createAlternatives(objectStream));
    }

    public Promise promiseRule_(Object id, Object alt) {
        return Promise.add(() -> (new IR()).createRule(id, alt));
    }

    public Promise promiseRuleList(Stream<Object> objectStream) {
        return Promise.add(() -> (new IR()).createRuleList(objectStream));
    }

    public Promise promiseRuleCall(Promise visitSyntax_namespace_obj, Promise visitSyntax_expr_helper) {
        return Promise.add(() -> (new IR()).createRuleCall(visitSyntax_namespace_obj, visitSyntax_expr_helper));
    }
}
