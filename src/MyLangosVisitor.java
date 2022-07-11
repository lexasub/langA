import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.Collections;

public class MyLangosVisitor implements langosVisitor {

    PromisedIR promisedIr = new PromisedIR();

    @Override
    public Promise visitRulelist(langosParser.RulelistContext ctx) {
        return promisedIr.promiseRuleList(
                ctx.rule_().stream().map(this::visitRule_)
        );
    }

    @Override
    public Promise visitRule_(langosParser.Rule_Context ctx) {
        Promise id = promisedIr.promiseID(ctx.ID().getText());
        Promise alt = visitAlternatives(ctx.alternatives());
        return promisedIr.promiseRule_(id, alt);
    }

    @Override
    public Promise visitAlternatives(langosParser.AlternativesContext ctx) {
        return promisedIr.promiseBnfAlternatives(
                ctx.alternative().stream().map(this::visitAlternative)
        );
    }

    @Override
    public Promise visitAlternatives_strong(langosParser.Alternatives_strongContext ctx) {
        return visitAlternatives(ctx.alternatives());
    }

    @Override
    public Promise visitAlternative(langosParser.AlternativeContext ctx) {
        return promisedIr.promiseBnfAlternative(
                ctx.element().stream().map(this::visitElement)
        );
    }

    @Override
    public Promise visitBnf_not(langosParser.Bnf_notContext ctx) {
        return promisedIr.promiseBnfNot(visitElement(ctx.element()));
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
            return promisedIr.promiseElement(visitBnf_not(ctx.bnf_not()));
        if (!ctx.zeroormore_non_gready().isEmpty())
            return promisedIr.promiseElement(
                    visitZeroormore_non_gready(
                            ctx.zeroormore_non_gready()));
        if (!ctx.optional_().isEmpty())
            return promisedIr.promiseElement(visitOptional_(ctx.optional_()));
        if (!ctx.zeroormore().isEmpty())
            return promisedIr.promiseElement(visitZeroormore(ctx.zeroormore()));
        if (!ctx.oneormore().isEmpty())
            return promisedIr.promiseElement(visitOneormore(ctx.oneormore()));
        if (!ctx.range_().isEmpty())
            return promisedIr.promiseElement(visitRange_(ctx.range_()));

        if (!ctx.ID().isEmpty())
            return promisedIr.promiseElement(promisedIr.promiseID(ctx.ID().getText()));
        if (!ctx.CHAR().isEmpty())
            return promisedIr.promiseElement(promisedIr.promiseCHAR(ctx.CHAR().getText()));
        if (!ctx.STRING().isEmpty())
            return promisedIr.promiseElement(promisedIr.promiseSTRING(ctx.STRING().getText()));
        return null;
    }

    @Override
    public Promise visitRange_(langosParser.Range_Context ctx) {
        return promisedIr.promiseBnfRange(
                promisedIr.promiseCHAR(ctx.CHAR(0).getText()),
                promisedIr.promiseCHAR(ctx.CHAR(1).getText())
        );
    }

    @Override
    public Promise visitOptional_(langosParser.Optional_Context ctx) {
        return promisedIr.promiseBnfOptional(visitAlternatives_strong(ctx.alternatives_strong()));
    }

    @Override
    public Promise visitZeroormore(langosParser.ZeroormoreContext ctx) {
        return promisedIr.promiseZeroormore(visitAlternatives_strong(ctx.alternatives_strong()));
    }

    @Override
    public Promise visitZeroormore_non_gready(langosParser.Zeroormore_non_greadyContext ctx) {
        return promisedIr.promiseZeroormoreNoneGready(
                visitAlternatives_strong(ctx.zeroormore().alternatives_strong())
        );
    }

    @Override
    public Promise visitOneormore(langosParser.OneormoreContext ctx) {
        return promisedIr.promiseOneormore(visitAlternatives_strong(ctx.alternatives_strong()));
    }

    @Override
    public Promise visitSyntax_(langosParser.Syntax_Context ctx) {
        return promisedIr.promiseSyntax(promisedIr.promiseID(ctx.ID().getText()),
                ctx.import_().stream().map(this::visitImport_),
                visitRulelist(ctx.rulelist())
        );
    }

    @Override
    public Promise visitSyntax_namespace_obj(langosParser.Syntax_namespace_objContext ctx) {
        return promisedIr.promiseBnfNamespaceObj(
                promisedIr.promiseID(ctx.ID(0).getText()),
                promisedIr.promiseID(ctx.ID(1).getText())
        );
    }

    @Override
    public Promise visitSyntax_impl(langosParser.Syntax_implContext ctx) {
        return promisedIr.promiseSyntaxImpl(
                visitSyntax_namespace_obj(ctx.syntax_namespace_obj()),
                visitId_list_strong(ctx.id_list_strong()),
                visitSyntax_impl_body(ctx.syntax_impl_body())
        );
    }

    @Override
    public Promise visitSyntax_return(langosParser.Syntax_returnContext ctx) {
        return promisedIr.promiseSyntaxReturn(visitSyntax_expr(ctx.syntax_expr()));
    }

    @Override
    public Promise visitSyntax_method_call(langosParser.Syntax_method_callContext ctx) {
        return promisedIr.promiseBnfMethodCall(
                promisedIr.promiseID(ctx.ID().getText()),
                visitSyntax_expr(ctx.syntax_expr())
        );
    }

    @Override
    public Promise visitSyntax_lambda(langosParser.Syntax_lambdaContext ctx) {
        return promisedIr.promiseLambda(visitId_list(ctx.id_list()),
                ctx.syntax_expr().stream().map(this::visitSyntax_expr)
        );
    }

    /*
        @Override
        public Promise visitSyntax_with_body(langosParser.Syntax_with_bodyContext ctx) {
            //OLDTODO
            return null;
        }

        @Override
        public Promise visitSyntax_with(langosParser.Syntax_withContext ctx) {
            //OLDTODO
            return null;
        }
    */
    @Override
    public Promise visitSyntax_object_getter(langosParser.Syntax_object_getterContext ctx) {
        return promisedIr.promiseBnfObjectGetter(
                promisedIr.promiseID(ctx.ID().getText()),
                visitSyntax_expr_strong(ctx.syntax_expr_strong())
        );
    }

    @Override
    public Promise visitSyntax_text_getter(langosParser.Syntax_text_getterContext ctx) {
        return promisedIr.promiseBnfTextGetter(
                promisedIr.promiseID(ctx.ID().getText()),
                visitSyntax_expr(ctx.syntax_expr())
        );
    }

    @Override
    public Promise visitSyntax_expr_helper(langosParser.Syntax_expr_helperContext ctx) {
        if(!ctx.syntax_expr_strong().isEmpty())
            return visitSyntax_expr_strong(ctx.syntax_expr_strong());
        return visitSyntax_method_call(ctx.syntax_method_call());
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
        //TODO
        // syntax_expr_helper : syntax_expr_strong | syntax_method_call;
        // syntax_expr : syntax_namespace_obj syntax_expr_helper
        return null;
    }

    @Override
    public Promise visitSyntax_expr_strong(langosParser.Syntax_expr_strongContext ctx) {
        return visitSyntax_expr(ctx.syntax_expr());
    }

    @Override
    public Promise visitSyntax_impl_body(langosParser.Syntax_impl_bodyContext ctx) {
        return promisedIr.promiseBnfImplBody(
                ctx.syntax_expr().stream().map(this::visitSyntax_expr)
        );
    }

    @Override
    public Promise visitImport_(langosParser.Import_Context ctx) {
        return promisedIr.promiseImport(
                ctx.ID().stream().map(i -> promisedIr.promiseID(i.getText()))
        );
    }

    @Override
    public Promise visitProgram(langosParser.ProgramContext ctx) {
        return promisedIr.promiseProgram(
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
        return promisedIr.promiseIdList(ctx.ID().stream().map(
                i -> promisedIr.promiseID(i.getText())
        ));
    }

    @Override
    public Promise visitId_list_strong(langosParser.Id_list_strongContext ctx) {
        return visitId_list(ctx.id_list());
    }

    @Override
    public Promise visitId_strong(langosParser.Id_strongContext ctx) {
        return promisedIr.promiseID(ctx.ID().getText());
    }

    @Override
    public Promise visit(ParseTree parseTree) {
        return null;
    }

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
