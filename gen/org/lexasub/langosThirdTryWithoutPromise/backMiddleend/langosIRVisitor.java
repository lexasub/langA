// Generated from /home/su/IdeaProjects/langA/src/main/java/org/lexasub/langosThirdTryWithoutPromise/langosIR.g4 by ANTLR 4.10.1
package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link langosIRParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface langosIRVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link langosIRParser#intoscope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntoscope(langosIRParser.IntoscopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(langosIRParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#endclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndclass(langosIRParser.EndclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#import_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_(langosIRParser.Import_Context ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(langosIRParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#mapo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapo(langosIRParser.MapoContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#pairmap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairmap(langosIRParser.PairmapContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#pairmap_o}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairmap_o(langosIRParser.Pairmap_oContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#pairmapo_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairmapo_(langosIRParser.Pairmapo_Context ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#pairmapoo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairmapoo(langosIRParser.PairmapooContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#pop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPop(langosIRParser.PopContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(langosIRParser.PushContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#jmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJmp(langosIRParser.JmpContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(langosIRParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(langosIRParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#lbl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLbl(langosIRParser.LblContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#member_declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_declare(langosIRParser.Member_declareContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#class_full}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_full(langosIRParser.Class_fullContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#jmps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJmps(langosIRParser.JmpsContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#flow_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow_control(langosIRParser.Flow_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#scope_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope_control(langosIRParser.Scope_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#stack_cmds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack_cmds(langosIRParser.Stack_cmdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#map_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_control(langosIRParser.Map_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#function_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument(langosIRParser.Function_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(langosIRParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#get_element_ptr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_element_ptr(langosIRParser.Get_element_ptrContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#mov}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMov(langosIRParser.MovContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(langosIRParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link langosIRParser#entry_point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry_point(langosIRParser.Entry_pointContext ctx);
}