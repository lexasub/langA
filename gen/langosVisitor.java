// Generated from /home/su/IdeaProjects/langA/langos.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link langosParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface langosVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link langosParser#rulelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulelist(langosParser.RulelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#rule_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_(langosParser.Rule_Context ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#alternatives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternatives(langosParser.AlternativesContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#alternatives_strong}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternatives_strong(langosParser.Alternatives_strongContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternative(langosParser.AlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#bnf_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBnf_not(langosParser.Bnf_notContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(langosParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#range_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_(langosParser.Range_Context ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#optional_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional_(langosParser.Optional_Context ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#zeroormore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeroormore(langosParser.ZeroormoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#zeroormore_non_gready}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeroormore_non_gready(langosParser.Zeroormore_non_greadyContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#oneormore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneormore(langosParser.OneormoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#syntax_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntax_(langosParser.Syntax_Context ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#syntax_namespace_obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntax_namespace_obj(langosParser.Syntax_namespace_objContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#syntax_impl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntax_impl(langosParser.Syntax_implContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#syntax_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntax_return(langosParser.Syntax_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#syntax_method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntax_method_call(langosParser.Syntax_method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#syntax_lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntax_lambda(langosParser.Syntax_lambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#syntax_object_getter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntax_object_getter(langosParser.Syntax_object_getterContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#syntax_text_getter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntax_text_getter(langosParser.Syntax_text_getterContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#syntax_expr_helper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntax_expr_helper(langosParser.Syntax_expr_helperContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#syntax_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntax_expr(langosParser.Syntax_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#syntax_expr_strong}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntax_expr_strong(langosParser.Syntax_expr_strongContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#syntax_impl_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntax_impl_body(langosParser.Syntax_impl_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#import_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_(langosParser.Import_Context ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(langosParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#entry_point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry_point(langosParser.Entry_pointContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list(langosParser.Id_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#id_list_strong}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list_strong(langosParser.Id_list_strongContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosParser#id_strong}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_strong(langosParser.Id_strongContext ctx);
}