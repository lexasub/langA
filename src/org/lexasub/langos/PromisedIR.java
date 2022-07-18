package org.lexasub.langos;

import org.lexasub.langos.utils.Promise;

import java.util.ListIterator;
import java.util.stream.Stream;
public class PromisedIR {
    public Promise promiseID(String text) {
       return Promise.add(() ->  (new IR()).createID(text));
    }

    public Promise promiseElement(Promise elem) {
        return elem;
    }

    public Promise promiseSyntax(Promise syntaxName, Stream<Promise> syntaxImports, Stream<Promise> syntaxRules) {
        return Promise.add(() -> {
            Stream<Promise> t = syntaxImports.map((i) -> i.addAfterDependency(syntaxRules));
            return (new IR()).createSyntax(syntaxName, t, syntaxRules);
        });
    }

    public Promise promiseBnfNamespaceObj(Promise namespace_, Promise objectName) {
        return Promise.add(() -> (new IR()).createBnfNamespaceObj(namespace_, objectName));
    }

    public Promise promiseBnfMethodCall(Promise methodName, Promise methodArgs) {
        return Promise.add(
                () -> (new IR()).findSyntax(methodName).addHandlerExpression(methodArgs)
        );
    }

    public Promise promiseBnfObjectGetter(Promise objectName, Promise expr) {
        return null;
    }

    public Promise promiseBnfTextGetter(Promise objectName, Promise expr) {
        return null;
    }

    public Promise promiseOneormore(Promise alternatives) {
        return Promise.add(() -> (new IR()).createOneormore(alternatives));
    }

    public Promise promiseCHAR(String text) {
        return Promise.add(() -> (new IR()).createChar(text));
    }

    public Promise promiseSTRING(String text) {
        return Promise.add(() -> (new IR()).createString(text));
    }

    public Promise promiseBnfRange(Promise charFrom, Promise charTo) {
        return Promise.add(() -> (new IR()).createRange(charFrom, charTo));
    }

    public Promise promiseBnfOptional(Promise alternatives) {
        return Promise.add(() -> (new IR()).createOptional(alternatives));
    }

    public Promise promiseZeroormore(Promise alternatives) {
        return Promise.add(() -> (new IR()).createZeroormore(alternatives));
    }

    public Promise promiseZeroormoreNoneGready(Promise alternatives) {
        return Promise.add(() -> (new IR()).createZeroormoreNoneGready(alternatives));
    }

    public Promise promiseSyntaxImpl(Promise namespaceObj, Promise syntaxMethodArgs, Promise syntaxMethodBody) {
        return Promise.add(() ->
                Syntax.linkSyntaxImpl(
                    namespaceObj,
                    syntaxMethodArgs,
                    syntaxMethodBody
                )
        );
    }

    public Promise promiseSyntaxReturn(Promise returnExpr) {
        return Promise.add(() -> (new IR()).createReturn(returnExpr));
    }

    public Promise promiseLambda(Promise lambdaArgs, Stream<Object> lambdaBody) {
        return Promise.add(() -> (new IR()).createLambda(lambdaArgs,lambdaBody));
    }

    public Promise promiseBnfImplBody(Stream<Object> expressions) {
        return Promise.add(() -> (new IR()).createImplBody(expressions));
    }

    public Promise promiseImport(Stream<Object> imports) {
        return Promise.add(() -> (new IR()).createImport(imports));
    }

    public Promise promiseProgram(Stream<Promise> importPath, Stream<Object> syntax_, Stream<Object> syntaxImpl) {
        return Promise.add(() -> {
            ListIterator<Promise> elem = importPath.toList().listIterator();
            Object firstElem = elem.next();//nonCopy!!
            while(importPath.count() != 0){
                var tmp = elem.next();
                elem.previous().addAfterDependency(tmp);
            }
            return firstElem;
        });
    }

    public Promise promiseIdList(Stream<Promise> ids) {
        return Promise.add(() -> (new IR()).createIdList(ids));
    }

    public Promise promiseBnfNot(Promise elem) {
        return Promise.add(() -> (new IR()).createNot(elem));
    }

    public Promise promiseBnfAlternative(Stream<Object> elements) {
        return Promise.add(() -> (new IR()).createAlternative(elements));
    }

    public Promise promiseBnfAlternatives(Stream<Object> alternatives) {
        return Promise.add(() -> (new IR()).createAlternatives(alternatives));
    }

    public Promise promiseRule_(Promise id, Promise alt, Promise syntaxName) {
        return Promise.add(() -> (new IR()).findSyntaxNamespace(syntaxName).createRule(id, alt));
    }


    public Promise promiseRuleCall(Promise visitSyntax_namespace_obj, Promise visitSyntax_expr_helper) {//TODO разобраться
        return Promise.add(() -> (new IR()).createRuleCall(visitSyntax_namespace_obj, visitSyntax_expr_helper));
    }
}
