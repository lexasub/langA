// Generated from /home/support-pc/Рабочий стол/техподдержка/отчеты/Копытцев А А/others/inteljidea/langA_/src/main/java/org/lexasub/langosWithoutSyntax.g4 by ANTLR 4.10.1
package org.lexasub.langosThirdTryWithoutPromise.frontend;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link langosWithoutSyntaxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface langosWithoutSyntaxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#import_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_(langosWithoutSyntaxParser.Import_Context ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#id_strong}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_strong(langosWithoutSyntaxParser.Id_strongContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#fun_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_name(langosWithoutSyntaxParser.Fun_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list(langosWithoutSyntaxParser.Id_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(langosWithoutSyntaxParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_name(langosWithoutSyntaxParser.Var_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_name(langosWithoutSyntaxParser.Class_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#member_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_name(langosWithoutSyntaxParser.Member_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#namspce_obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamspce_obj(langosWithoutSyntaxParser.Namspce_objContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#function_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_specifier(langosWithoutSyntaxParser.Function_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(langosWithoutSyntaxParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(langosWithoutSyntaxParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#get_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_member(langosWithoutSyntaxParser.Get_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#braced_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraced_element(langosWithoutSyntaxParser.Braced_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(langosWithoutSyntaxParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#func_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_args(langosWithoutSyntaxParser.Func_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(langosWithoutSyntaxParser.Method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(langosWithoutSyntaxParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#function_call_helper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_helper(langosWithoutSyntaxParser.Function_call_helperContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#function_call_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_(langosWithoutSyntaxParser.Function_call_Context ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#flow_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow_control(langosWithoutSyntaxParser.Flow_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(langosWithoutSyntaxParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#return_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_expr(langosWithoutSyntaxParser.Return_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(langosWithoutSyntaxParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#with_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_body(langosWithoutSyntaxParser.With_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#with_synonym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_synonym(langosWithoutSyntaxParser.With_synonymContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#with_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_(langosWithoutSyntaxParser.With_Context ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#parened_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParened_expr(langosWithoutSyntaxParser.Parened_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#declare_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_member(langosWithoutSyntaxParser.Declare_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#class_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_(langosWithoutSyntaxParser.Class_Context ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(langosWithoutSyntaxParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#entry_point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry_point(langosWithoutSyntaxParser.Entry_pointContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#parened_expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParened_expr_list(langosWithoutSyntaxParser.Parened_expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosWithoutSyntaxParser#parened_id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParened_id_list(langosWithoutSyntaxParser.Parened_id_listContext ctx);
}