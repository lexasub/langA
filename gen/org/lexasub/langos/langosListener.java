// Generated from /home/support-pc/Рабочий стол/техподдержка/отчеты/Копытцев А А/others/inteljidea/langA_/langos.g4 by ANTLR 4.10.1
package org.lexasub.langos;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link langosParser}.
 */
public interface langosListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link langosParser#rulelist}.
	 * @param ctx the parse tree
	 */
	void enterRulelist(langosParser.RulelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#rulelist}.
	 * @param ctx the parse tree
	 */
	void exitRulelist(langosParser.RulelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#rule_}.
	 * @param ctx the parse tree
	 */
	void enterRule_(langosParser.Rule_Context ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#rule_}.
	 * @param ctx the parse tree
	 */
	void exitRule_(langosParser.Rule_Context ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#alternatives}.
	 * @param ctx the parse tree
	 */
	void enterAlternatives(langosParser.AlternativesContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#alternatives}.
	 * @param ctx the parse tree
	 */
	void exitAlternatives(langosParser.AlternativesContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#alternatives_strong}.
	 * @param ctx the parse tree
	 */
	void enterAlternatives_strong(langosParser.Alternatives_strongContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#alternatives_strong}.
	 * @param ctx the parse tree
	 */
	void exitAlternatives_strong(langosParser.Alternatives_strongContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#alternative}.
	 * @param ctx the parse tree
	 */
	void enterAlternative(langosParser.AlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#alternative}.
	 * @param ctx the parse tree
	 */
	void exitAlternative(langosParser.AlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#bnf_not}.
	 * @param ctx the parse tree
	 */
	void enterBnf_not(langosParser.Bnf_notContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#bnf_not}.
	 * @param ctx the parse tree
	 */
	void exitBnf_not(langosParser.Bnf_notContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(langosParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(langosParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#range_}.
	 * @param ctx the parse tree
	 */
	void enterRange_(langosParser.Range_Context ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#range_}.
	 * @param ctx the parse tree
	 */
	void exitRange_(langosParser.Range_Context ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#optional_}.
	 * @param ctx the parse tree
	 */
	void enterOptional_(langosParser.Optional_Context ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#optional_}.
	 * @param ctx the parse tree
	 */
	void exitOptional_(langosParser.Optional_Context ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#zeroormore}.
	 * @param ctx the parse tree
	 */
	void enterZeroormore(langosParser.ZeroormoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#zeroormore}.
	 * @param ctx the parse tree
	 */
	void exitZeroormore(langosParser.ZeroormoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#zeroormore_non_gready}.
	 * @param ctx the parse tree
	 */
	void enterZeroormore_non_gready(langosParser.Zeroormore_non_greadyContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#zeroormore_non_gready}.
	 * @param ctx the parse tree
	 */
	void exitZeroormore_non_gready(langosParser.Zeroormore_non_greadyContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#oneormore}.
	 * @param ctx the parse tree
	 */
	void enterOneormore(langosParser.OneormoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#oneormore}.
	 * @param ctx the parse tree
	 */
	void exitOneormore(langosParser.OneormoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#syntax_}.
	 * @param ctx the parse tree
	 */
	void enterSyntax_(langosParser.Syntax_Context ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#syntax_}.
	 * @param ctx the parse tree
	 */
	void exitSyntax_(langosParser.Syntax_Context ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#syntax_namespace_obj}.
	 * @param ctx the parse tree
	 */
	void enterSyntax_namespace_obj(langosParser.Syntax_namespace_objContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#syntax_namespace_obj}.
	 * @param ctx the parse tree
	 */
	void exitSyntax_namespace_obj(langosParser.Syntax_namespace_objContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#syntax_impl}.
	 * @param ctx the parse tree
	 */
	void enterSyntax_impl(langosParser.Syntax_implContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#syntax_impl}.
	 * @param ctx the parse tree
	 */
	void exitSyntax_impl(langosParser.Syntax_implContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#syntax_return}.
	 * @param ctx the parse tree
	 */
	void enterSyntax_return(langosParser.Syntax_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#syntax_return}.
	 * @param ctx the parse tree
	 */
	void exitSyntax_return(langosParser.Syntax_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#syntax_rule_call}.
	 * @param ctx the parse tree
	 */
	void enterSyntax_rule_call(langosParser.Syntax_rule_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#syntax_rule_call}.
	 * @param ctx the parse tree
	 */
	void exitSyntax_rule_call(langosParser.Syntax_rule_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#syntax_lambda}.
	 * @param ctx the parse tree
	 */
	void enterSyntax_lambda(langosParser.Syntax_lambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#syntax_lambda}.
	 * @param ctx the parse tree
	 */
	void exitSyntax_lambda(langosParser.Syntax_lambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#syntax_object_getter}.
	 * @param ctx the parse tree
	 */
	void enterSyntax_object_getter(langosParser.Syntax_object_getterContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#syntax_object_getter}.
	 * @param ctx the parse tree
	 */
	void exitSyntax_object_getter(langosParser.Syntax_object_getterContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#syntax_text_getter}.
	 * @param ctx the parse tree
	 */
	void enterSyntax_text_getter(langosParser.Syntax_text_getterContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#syntax_text_getter}.
	 * @param ctx the parse tree
	 */
	void exitSyntax_text_getter(langosParser.Syntax_text_getterContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#syntax_method_call_begin}.
	 * @param ctx the parse tree
	 */
	void enterSyntax_method_call_begin(langosParser.Syntax_method_call_beginContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#syntax_method_call_begin}.
	 * @param ctx the parse tree
	 */
	void exitSyntax_method_call_begin(langosParser.Syntax_method_call_beginContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#syntax_method_call_body}.
	 * @param ctx the parse tree
	 */
	void enterSyntax_method_call_body(langosParser.Syntax_method_call_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#syntax_method_call_body}.
	 * @param ctx the parse tree
	 */
	void exitSyntax_method_call_body(langosParser.Syntax_method_call_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#syntax_method_call}.
	 * @param ctx the parse tree
	 */
	void enterSyntax_method_call(langosParser.Syntax_method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#syntax_method_call}.
	 * @param ctx the parse tree
	 */
	void exitSyntax_method_call(langosParser.Syntax_method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#syntax_expr}.
	 * @param ctx the parse tree
	 */
	void enterSyntax_expr(langosParser.Syntax_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#syntax_expr}.
	 * @param ctx the parse tree
	 */
	void exitSyntax_expr(langosParser.Syntax_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#syntax_expr_strong}.
	 * @param ctx the parse tree
	 */
	void enterSyntax_expr_strong(langosParser.Syntax_expr_strongContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#syntax_expr_strong}.
	 * @param ctx the parse tree
	 */
	void exitSyntax_expr_strong(langosParser.Syntax_expr_strongContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#syntax_impl_body}.
	 * @param ctx the parse tree
	 */
	void enterSyntax_impl_body(langosParser.Syntax_impl_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#syntax_impl_body}.
	 * @param ctx the parse tree
	 */
	void exitSyntax_impl_body(langosParser.Syntax_impl_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#import_}.
	 * @param ctx the parse tree
	 */
	void enterImport_(langosParser.Import_Context ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#import_}.
	 * @param ctx the parse tree
	 */
	void exitImport_(langosParser.Import_Context ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(langosParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(langosParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#entry_point}.
	 * @param ctx the parse tree
	 */
	void enterEntry_point(langosParser.Entry_pointContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#entry_point}.
	 * @param ctx the parse tree
	 */
	void exitEntry_point(langosParser.Entry_pointContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(langosParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(langosParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#id_list_strong}.
	 * @param ctx the parse tree
	 */
	void enterId_list_strong(langosParser.Id_list_strongContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#id_list_strong}.
	 * @param ctx the parse tree
	 */
	void exitId_list_strong(langosParser.Id_list_strongContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosParser#id_strong}.
	 * @param ctx the parse tree
	 */
	void enterId_strong(langosParser.Id_strongContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosParser#id_strong}.
	 * @param ctx the parse tree
	 */
	void exitId_strong(langosParser.Id_strongContext ctx);
}