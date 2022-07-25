package org.lexasub.langos;

import org.lexasub.langos.utils.Promise;

import java.util.ListIterator;
import java.util.stream.Stream;
public class PromisedFIR {
    public Promise promiseID(String text) {
       return Promise.add(() ->  (new FIR()).createID(text));
    }

    public Promise promiseElement(Promise elem) {
        return elem;
    }

    public Promise promiseSyntax(Promise syntaxName, Stream<Promise> syntaxImports, Stream<Promise> syntaxRules) {
        return Promise.add(() -> {
            Stream<Promise> t = syntaxImports.map((i) -> i.addAfterDependency(syntaxRules));
            return (new FIR()).createSyntax(syntaxName, t, syntaxRules);
        });
    }

    public Promise promiseBnfNamespaceObj(Promise namespace_, Promise objectName) {
        return Promise.add(() -> (new FIR()).createBnfNamespaceObj(namespace_, objectName));
    }

    public Promise promiseBnfRuleCall(Promise methodFullName, Promise args) {
        return Promise.add(
                () -> (new FIR()).bnfRuleCall(methodFullName, args)
        );
    }

    public Promise promiseBnfObjectGetter(Promise objectName, Promise expr) {
        return null;
    }

    public Promise promiseBnfTextGetter(Promise objectName, Promise expr) {
        return null;
    }

    public Promise promiseOneormore(Promise alternatives) {
        return Promise.add(() -> (new FIR()).createOneormore(alternatives));
    }

    public Promise promiseCHAR(String text) {
        return Promise.add(() -> (new FIR()).createChar(text));
    }

    public Promise promiseSTRING(String text) {
        return Promise.add(() -> (new FIR()).createString(text));
    }

    public Promise promiseBnfRange(Promise charFrom, Promise charTo) {
        return Promise.add(() -> (new FIR()).createRange(charFrom, charTo));
    }

    public Promise promiseBnfOptional(Promise alternatives) {
        return Promise.add(() -> (new FIR()).createOptional(alternatives));
    }

    public Promise promiseZeroormore(Promise alternatives) {
        return Promise.add(() -> (new FIR()).createZeroormore(alternatives));
    }

    public Promise promiseZeroormoreNoneGready(Promise alternatives) {
        return Promise.add(() -> (new FIR()).createZeroormoreNoneGready(alternatives));
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
        return Promise.add(() -> (new FIR()).createReturn(returnExpr));
    }

    public Promise promiseLambda(Promise lambdaArgs, Stream<Object> lambdaBody) {
        return Promise.add(() -> (new FIR()).createLambda(lambdaArgs,lambdaBody));
    }

    public Promise promiseBnfImplBody(Stream<Promise> expressions) {
        return Promise.add(() -> (new FIR()).createImplBody(expressions));
    }

    public Promise promiseImport(Stream<Object> imports) {
        return Promise.add(() -> (new FIR()).createImport(imports));
    }

    public Promise promiseProgram(Stream<Promise> importPath, Stream<Object> syntax_, Stream<Object> syntaxImpl) {//TODO
        return Promise.add(() -> {
            ListIterator<Promise> elem = importPath.toList().listIterator();
            Object firstElem = elem.next();//nonCopy!!
            while(importPath.count() != 0){
                Promise tmp = elem.next();
                elem.previous().addAfterDependency(tmp);
            }
            return firstElem;
        });
    }

    public Promise promiseIdList(Stream<Promise> ids) {
        return Promise.add(() -> (new FIR()).createIdList(ids));
    }

    public Promise promiseBnfNot(Promise elem) {
        return Promise.add(() -> (new FIR()).createNot(elem));
    }

    public Promise promiseBnfAlternative(Stream<Promise> elements) {
        return Promise.add(() -> (new FIR()).createAlternative(elements));
    }

    public Promise promiseBnfAlternatives(Stream<Object> alternatives) {
        return Promise.add(() -> (new FIR()).createAlternatives(alternatives));
    }

    public Promise promiseRule_(Promise id, Promise alt, Promise syntaxName) {
        return Promise.add(() -> (new FIR()).findSyntaxNamespace(syntaxName).createRule(id, alt));
    }



}
