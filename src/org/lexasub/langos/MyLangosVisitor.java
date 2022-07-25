package org.lexasub.langos;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.lexasub.langos.utils.Promise;
public class MyLangosVisitor implements langosVisitor {

    PromisedFIR promisedFIR = new PromisedFIR();

    @Override
    public Promise visitAlternatives(langosParser.AlternativesContext ctx) {
        return promisedFIR.promiseBnfAlternatives(
                ctx.alternative().stream().map(this::visitAlternative)
        );
    }

    @Override
    public Promise visitAlternatives_strong(langosParser.Alternatives_strongContext ctx) {
        return visitAlternatives(ctx.alternatives());
    }

    @Override
    public Promise visitAlternative(langosParser.AlternativeContext ctx) {
        return promisedFIR.promiseBnfAlternative(
                ctx.element().stream().map(this::visitElement)
        );
    }

    @Override
    public Promise visitBnf_not(langosParser.Bnf_notContext ctx) {
        return promisedFIR.promiseBnfNot(visitElement(ctx.element()));
    }

    @Override
    public Promise visitElement(langosParser.ElementContext ctx) {
        /*List<Object> elems = Arrays.asList(
                ctx.bnf_not(),
                ctx.zeroormore_non_gready()
        );
        List<Object> funcs = Arrays.asList(
          (Function<langosParser.Bnf_notContext,Object>)
                  (i) -> visitBnf_not(i),
          (Function<langosParser.Zeroormore_non_greadyContext,Object>)
                  (i) -> visitZeroormore_non_gready(i)
        );
        if (!v.isEmpty())
            return ir.promiseElement(f(v));*/

        if (!ctx.bnf_not().isEmpty())
            return promisedFIR.promiseElement(visitBnf_not(ctx.bnf_not()));
        if (!ctx.zeroormore_non_gready().isEmpty())
            return promisedFIR.promiseElement(
                    visitZeroormore_non_gready(
                            ctx.zeroormore_non_gready()));
        if (!ctx.optional_().isEmpty())
            return promisedFIR.promiseElement(visitOptional_(ctx.optional_()));
        if (!ctx.zeroormore().isEmpty())
            return promisedFIR.promiseElement(visitZeroormore(ctx.zeroormore()));
        if (!ctx.oneormore().isEmpty())
            return promisedFIR.promiseElement(visitOneormore(ctx.oneormore()));
        if (!ctx.range_().isEmpty())
            return promisedFIR.promiseElement(visitRange_(ctx.range_()));

        if (ctx.ID().getText() != "") //[TODO check]
            return promisedFIR.promiseElement(getPromiseID(ctx.ID()));
        if (ctx.CHAR().getText() != "")//[TODO check]
            return promisedFIR.promiseElement(promisedFIR.promiseCHAR(ctx.CHAR().getText()));
        if (ctx.STRING().getText() != "")//[TODO check]
            return promisedFIR.promiseElement(promisedFIR.promiseSTRING(ctx.STRING().getText()));
        return null;
    }

    @Override
    public Promise visitRange_(langosParser.Range_Context ctx) {
        return promisedFIR.promiseBnfRange(
                promisedFIR.promiseCHAR(ctx.CHAR(0).getText()),
                promisedFIR.promiseCHAR(ctx.CHAR(1).getText())
        );
    }

    @Override
    public Promise visitOptional_(langosParser.Optional_Context ctx) {
        return promisedFIR.promiseBnfOptional(visitAlternatives_strong(ctx.alternatives_strong()));
    }

    @Override
    public Promise visitZeroormore(langosParser.ZeroormoreContext ctx) {
        return promisedFIR.promiseZeroormore(visitAlternatives_strong(ctx.alternatives_strong()));
    }

    @Override
    public Promise visitZeroormore_non_gready(langosParser.Zeroormore_non_greadyContext ctx) {
        return promisedFIR.promiseZeroormoreNoneGready(
                visitAlternatives_strong(ctx.zeroormore().alternatives_strong())
        );
    }

    @Override
    public Promise visitOneormore(langosParser.OneormoreContext ctx) {
        return promisedFIR.promiseOneormore(visitAlternatives_strong(ctx.alternatives_strong()));
    }

    @Override
    public Promise visitRulelist(langosParser.RulelistContext ctx) {//он не нужен
        return null;
    }

    @Override
    public Promise visitRule_(langosParser.Rule_Context ctx) {//он не нужен
        return null;
    }

    private Promise getPromiseID(TerminalNode ctx) {
        return promisedFIR.promiseID(ctx.getText());
    }

    @Override
    public Promise visitSyntax_(langosParser.Syntax_Context ctx) {
        Promise syntaxName = getPromiseID(ctx.ID());
        return promisedFIR.promiseSyntax(syntaxName,
                ctx.import_().stream().map(this::visitImport_),
                ctx.rulelist().rule_().stream().map( i -> {
                        Promise id = getPromiseID(i.ID());
                        Promise alt = visitAlternatives(i.alternatives());
                        return promisedFIR.promiseRule_(id, alt, syntaxName);
                    })
        );
    }

    @Override
    public Promise visitSyntax_namespace_obj(langosParser.Syntax_namespace_objContext ctx) {
        return promisedFIR.promiseBnfNamespaceObj(
                getPromiseID(ctx.ID(0)),
                getPromiseID(ctx.ID(1))
        );
    }

    @Override
    public Promise visitSyntax_impl(langosParser.Syntax_implContext ctx) {
        return promisedFIR.promiseSyntaxImpl(
                visitSyntax_namespace_obj(ctx.syntax_namespace_obj()),
                visitId_list_strong(ctx.id_list_strong()),
                visitSyntax_impl_body(ctx.syntax_impl_body())
        );
    }

    @Override
    public Promise visitSyntax_return(langosParser.Syntax_returnContext ctx) {
        return promisedFIR.promiseSyntaxReturn(visitSyntax_expr(ctx.syntax_expr()));
    }

    @Override
    public Promise visitSyntax_rule_call(langosParser.Syntax_rule_callContext ctx) {
        return promisedFIR.promiseBnfRuleCall(
                visitSyntax_namespace_obj(ctx.syntax_namespace_obj()),
                visitSyntax_expr(ctx.syntax_expr())
        );
    }

    @Override
    public Promise visitSyntax_lambda(langosParser.Syntax_lambdaContext ctx) {
        return promisedFIR.promiseLambda(visitId_list(ctx.id_list()),
                ctx.syntax_expr().stream().map(this::visitSyntax_expr)
        );
    }

    /*
        @Override
        public org.lexasub.langos.utils.Promise visitSyntax_with_body(langosParser.Syntax_with_bodyContext ctx) {
            //OLDTODO
            return null;
        }

        @Override
        public org.lexasub.langos.utils.Promise visitSyntax_with(langosParser.Syntax_withContext ctx) {
            //OLDTODO
            return null;
        }
    */
    @Override
    public Promise visitSyntax_object_getter(langosParser.Syntax_object_getterContext ctx) {
        return promisedFIR.promiseBnfObjectGetter(
                getPromiseID(ctx.ID()),
                visitSyntax_expr_strong(ctx.syntax_expr_strong())
        );
    }

    @Override
    public Promise visitSyntax_text_getter(langosParser.Syntax_text_getterContext ctx) {
        return promisedFIR.promiseBnfTextGetter(
                getPromiseID(ctx.ID()),
                visitSyntax_expr(ctx.syntax_expr())
        );
    }

    @Override
    public Object visitSyntax_method_call_begin(langosParser.Syntax_method_call_beginContext ctx) {
        return null;
    }

    @Override
    public Object visitSyntax_method_call_body(langosParser.Syntax_method_call_bodyContext ctx) {
        return null;
    }

    @Override
    public Object visitSyntax_method_call(langosParser.Syntax_method_callContext ctx) {//TODO
        return null;
    }

    @Override
    public Promise visitSyntax_expr(langosParser.Syntax_exprContext ctx) {
        if(!ctx.syntax_lambda().isEmpty())
            return visitSyntax_lambda(ctx.syntax_lambda());
        if(!ctx.syntax_return().isEmpty())
            return visitSyntax_return(ctx.syntax_return());
        if(!ctx.syntax_object_getter().isEmpty())
            return visitSyntax_object_getter(ctx.syntax_object_getter());
        if(!ctx.syntax_text_getter().isEmpty())
            return visitSyntax_text_getter(ctx.syntax_text_getter());
    /*    if(!ctx.syntax_namespace_obj().isEmpty()){
            if(!ctx.syntax_expr_helper().syntax_expr_strong().isEmpty())
                return promisedIr.promiseRuleCall(
                        visitSyntax_namespace_obj(ctx.syntax_namespace_obj()),
                        visitSyntax_expr_helper(ctx.syntax_expr_helper())
                );

        }*/
        if(!ctx.syntax_method_call().isEmpty()){}//TODO
        if(!ctx.syntax_rule_call().isEmpty())
            return visitSyntax_rule_call(ctx.syntax_rule_call());
        return null;
    }

    @Override
    public Promise visitSyntax_expr_strong(langosParser.Syntax_expr_strongContext ctx) {
        return visitSyntax_expr(ctx.syntax_expr());
    }

    @Override
    public Promise visitSyntax_impl_body(langosParser.Syntax_impl_bodyContext ctx) {
        return promisedFIR.promiseBnfImplBody(
                ctx.syntax_expr().stream().map(this::visitSyntax_expr)
        );
    }

    @Override
    public Promise visitImport_(langosParser.Import_Context ctx) {
        return promisedFIR.promiseImport(
                ctx.ID().stream().map(i -> getPromiseID(i))
        );
    }

    @Override
    public Promise visitProgram(langosParser.ProgramContext ctx) {
        return promisedFIR.promiseProgram(
                ctx.import_().stream().map(this::visitImport_),
                ctx.syntax_().stream().map(this::visitSyntax_),
                ctx.syntax_impl().stream().map(this::visitSyntax_impl)
        );
    }

    @Override
    public Promise visitEntry_point(langosParser.Entry_pointContext ctx) {
        return visitProgram(ctx.program());
    }

    @Override
    public Promise visitId_list(langosParser.Id_listContext ctx) {
        return promisedFIR.promiseIdList(ctx.ID().stream().map(
                i -> getPromiseID(i)
        ));
    }

    @Override
    public Promise visitId_list_strong(langosParser.Id_list_strongContext ctx) {
        return visitId_list(ctx.id_list());
    }

    @Override
    public Promise visitId_strong(langosParser.Id_strongContext ctx) {
        return getPromiseID(ctx.ID());
    }

    @Override
    public Promise visit(ParseTree parseTree) {
        return null;
    }//visitEntryPoint()??

    @Override
    public Promise visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Promise visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Promise visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
