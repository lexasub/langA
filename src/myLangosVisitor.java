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
        return ir.promiseSyntaxAlternatives(
                ctx.alternative().stream().map(i -> {return visitAlternative(i);})
        );
    }

    @Override
    public Object visitAlternatives_strong(langosParser.Alternatives_strongContext ctx) {
        return null;
    }

    @Override
    public Object visitAlternative(langosParser.AlternativeContext ctx) {
        return null;
    }

    @Override
    public Object visitBnf_not(langosParser.Bnf_notContext ctx) {
        return null;
    }

    @Override
    public Object visitElement(langosParser.ElementContext ctx) {
        return null;
    }

    @Override
    public Object visitRange_(langosParser.Range_Context ctx) {
        return null;
    }

    @Override
    public Object visitOptional_(langosParser.Optional_Context ctx) {
        return null;
    }

    @Override
    public Object visitZeroormore(langosParser.ZeroormoreContext ctx) {
        return null;
    }

    @Override
    public Object visitZeroormore_non_gready(langosParser.Zeroormore_non_greadyContext ctx) {
        return null;
    }

    @Override
    public Object visitOneormore(langosParser.OneormoreContext ctx) {
        return null;
    }

    @Override
    public Object visitSyntax_(langosParser.Syntax_Context ctx) {
        return null;
    }

    @Override
    public Object visitSyntax_namespace_obj(langosParser.Syntax_namespace_objContext ctx) {
        return null;
    }

    @Override
    public Object visitSyntax_impl(langosParser.Syntax_implContext ctx) {
        return null;
    }

    @Override
    public Object visitSyntax_return(langosParser.Syntax_returnContext ctx) {
        return null;
    }

    @Override
    public Object visitSyntax_method_call(langosParser.Syntax_method_callContext ctx) {
        return null;
    }

    @Override
    public Object visitSyntax_lambda(langosParser.Syntax_lambdaContext ctx) {
        return null;
    }

    @Override
    public Object visitSyntax_with_body(langosParser.Syntax_with_bodyContext ctx) {
        return null;
    }

    @Override
    public Object visitSyntax_with(langosParser.Syntax_withContext ctx) {
        return null;
    }

    @Override
    public Object visitSyntax_object_getter(langosParser.Syntax_object_getterContext ctx) {
        return null;
    }

    @Override
    public Object visitSyntax_text_getter(langosParser.Syntax_text_getterContext ctx) {
        return null;
    }

    @Override
    public Object visitSyntax_expr(langosParser.Syntax_exprContext ctx) {
        return null;
    }

    @Override
    public Object visitSyntax_expr_strong(langosParser.Syntax_expr_strongContext ctx) {
        return null;
    }

    @Override
    public Object visitSyntax_impl_body(langosParser.Syntax_impl_bodyContext ctx) {
        return null;
    }

    @Override
    public Object visitImport_(langosParser.Import_Context ctx) {
        return null;
    }

    @Override
    public Object visitProgram(langosParser.ProgramContext ctx) {
        return null;
    }

    @Override
    public Object visitEntry_point(langosParser.Entry_pointContext ctx) {
        return null;
    }

    @Override
    public Object visitId_list(langosParser.Id_listContext ctx) {
        return null;
    }

    @Override
    public Object visitId_list_strong(langosParser.Id_list_strongContext ctx) {
        return null;
    }

    @Override
    public Object visitId_strong(langosParser.Id_strongContext ctx) {
        return null;
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
