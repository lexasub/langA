import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class myLangosVisitor implements langosVisitor {

    IR ir = new IR();
    @Override
    public Object visitRulelist(langosParser.RulelistContext ctx) {
        return ir.promiseRuleList(
                ctx.rule_().stream().map(i -> {return visitRule_(i);})
        );
    }

    @Override
    public Object visitRule_(langosParser.Rule_Context ctx) {
        var id = ir.promiseID(ctx.ID().getText());
        var alt = visitAlternatives(ctx.alternatives());
        return ir.promiseRule_(id, alt);
    }

    @Override
    public Object visitAlternatives(langosParser.AlternativesContext ctx) {
        return ir.promiseBnfAlternatives(
                ctx.alternative().stream().map(i -> {return visitAlternative(i);})
        );
    }

    @Override
    public Object visitAlternatives_strong(langosParser.Alternatives_strongContext ctx) {
        return visitAlternatives(ctx.alternatives());
    }

    @Override
    public Object visitAlternative(langosParser.AlternativeContext ctx) {
        return ir.promiseBnfAlternative(
                ctx.element().stream().map(i -> {return visitElement(i);})
        );
    }

    @Override
    public Object visitBnf_not(langosParser.Bnf_notContext ctx) {
        return ir.promiseBnfNot(visitElement(ctx.element()));
    }

    @Override
    public Object visitElement(langosParser.ElementContext ctx) {
        //TODO
        return null;
    }

    @Override
    public Object visitRange_(langosParser.Range_Context ctx) {
        return ir.promiseBnfRange(
                ir.promiseChar(ctx.CHAR(0)), ir.promiseChar(ctx.CHAR(1))
        );
    }

    @Override
    public Object visitOptional_(langosParser.Optional_Context ctx) {
        return ir.promiseBnfOptional(visitAlternatives_strong(ctx.alternatives_strong()));
    }

    @Override
    public Object visitZeroormore(langosParser.ZeroormoreContext ctx) {
        return ir.promiseZeroormore(visitAlternatives_strong(ctx.alternatives_strong()));
    }

    @Override
    public Object visitZeroormore_non_gready(langosParser.Zeroormore_non_greadyContext ctx) {
        return ir.promiseZeroormoreNoneGready(
                visitAlternatives_strong(ctx.alternatives_strong())
        );
    }

    @Override
    public Object visitOneormore(langosParser.OneormoreContext ctx) {
        return ir.promiseOneormore(visitAlternatives_strong(ctx.alternatives_strong()));
    }

    @Override
    public Object visitSyntax_(langosParser.Syntax_Context ctx) {
        return ir.promiseSyntax(ir.promiseID(ctx.ID()),
                ctx.import_().stream().map((i) -> {return visitImport_(i);}),
                visitRulelist(ctx.rulelist())
        );
    }

    @Override
    public Object visitSyntax_namespace_obj(langosParser.Syntax_namespace_objContext ctx) {
        return ir.promiseBnfNamespaceObj(
                ir.promiseID(ctx.ID(0).getText()),
                ir.promiseID(ctx.ID(1).getText())
        );
    }

    @Override
    public Object visitSyntax_impl(langosParser.Syntax_implContext ctx) {
        return ir.promiseSyntaxImpl(
                visitSyntax_namespace_obj(ctx.syntax_namespace_obj()),
                visitId_list_strong(ctx.id_list_strong()),
                visitSyntax_impl_body(ctx.syntax_impl_body())
        );
    }

    @Override
    public Object visitSyntax_return(langosParser.Syntax_returnContext ctx) {
        return ir.promiseSyntaxReturn(visitSyntax_expr(ctx.syntax_expr()));
    }

    @Override
    public Object visitSyntax_method_call(langosParser.Syntax_method_callContext ctx) {
        return ir.promiseBnfMethodCall(
                ir.promiseID(ctx.ID().getText()),
                visitSyntax_expr(ctx.syntax_expr())
        );
    }

    @Override
    public Object visitSyntax_lambda(langosParser.Syntax_lambdaContext ctx) {
        return ir.promiseLambda(visitId_list(ctx.id_list()),
                ctx.syntax_expr().stream().map((i) -> {return visitSyntax_expr(i);})
        );
    }
/*
    @Override
    public Object visitSyntax_with_body(langosParser.Syntax_with_bodyContext ctx) {
        //OLDTODO
        return null;
    }

    @Override
    public Object visitSyntax_with(langosParser.Syntax_withContext ctx) {
        //OLDTODO
        return null;
    }
*/
    @Override
    public Object visitSyntax_object_getter(langosParser.Syntax_object_getterContext ctx) {
        return ir.promiseBnfObjectGetter(
                ir.promiseID(ctx.ID().getText()),
                visitSyntax_expr_strong(ctx.syntax_expr_strong())
        );
    }

    @Override
    public Object visitSyntax_text_getter(langosParser.Syntax_text_getterContext ctx) {
        return ir.promiseBnfTextGetter(
                ir.promiseID(ctx.ID().getText()),
                visitSyntax_expr(ctx.syntax_expr())
        );
    }

    @Override
    public Object visitSyntax_expr(langosParser.Syntax_exprContext ctx) {
        //TODO
        return null;
    }

    @Override
    public Object visitSyntax_expr_strong(langosParser.Syntax_expr_strongContext ctx) {
        return visitSyntax_expr(ctx.syntax_expr());
    }

    @Override
    public Object visitSyntax_impl_body(langosParser.Syntax_impl_bodyContext ctx) {
        return ir.promiseBnfImplBody(
          ctx.syntax_expr().stream().map((i) -> {return visitSyntax_expr(i);})
        );
    }

    @Override
    public Object visitImport_(langosParser.Import_Context ctx) {
        return ir.promiseImport(
                ctx.ID().stream().map((i) -> {return ir.promiseID(i.getText());})
        );
    }

    @Override
    public Object visitProgram(langosParser.ProgramContext ctx) {
        return ir.promiseProgram(
                ctx.import_().stream().map((i)->{return visitImport_(i);}),
                ctx.syntax_().stream().map((i)->{return visitSyntax_(i);}),
                ctx.syntax_impl().stream().map((i)->{return visitSyntax_impl(i);})
        );
    }

    @Override
    public Object visitEntry_point(langosParser.Entry_pointContext ctx) {
        return visitProgram(ctx.program());
    }

    @Override
    public Object visitId_list(langosParser.Id_listContext ctx) {
        return ir.promiseIdList(ctx.ID().stream().map(
                (i)->{return ir.promiseID(i.getText());}
        ));
    }

    @Override
    public Object visitId_list_strong(langosParser.Id_list_strongContext ctx) {
        return visitId_list(ctx.id_list());
    }

    @Override
    public Object visitId_strong(langosParser.Id_strongContext ctx) {
        return ir.promiseID(ctx.ID().getText());
    }

    @Override
    public Object visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
