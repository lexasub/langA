// Generated from /home/su/IdeaProjects/langA/src/main/java/org/lexasub/langosThirdTryWithoutPromise/langosIR.g4 by ANTLR 4.10.1
package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link langosIRParser}.
 */
public interface langosIRListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link langosIRParser#intoscope}.
	 * @param ctx the parse tree
	 */
	void enterIntoscope(langosIRParser.IntoscopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#intoscope}.
	 * @param ctx the parse tree
	 */
	void exitIntoscope(langosIRParser.IntoscopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(langosIRParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(langosIRParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#endclass}.
	 * @param ctx the parse tree
	 */
	void enterEndclass(langosIRParser.EndclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#endclass}.
	 * @param ctx the parse tree
	 */
	void exitEndclass(langosIRParser.EndclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#import_}.
	 * @param ctx the parse tree
	 */
	void enterImport_(langosIRParser.Import_Context ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#import_}.
	 * @param ctx the parse tree
	 */
	void exitImport_(langosIRParser.Import_Context ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(langosIRParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(langosIRParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#mapo}.
	 * @param ctx the parse tree
	 */
	void enterMapo(langosIRParser.MapoContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#mapo}.
	 * @param ctx the parse tree
	 */
	void exitMapo(langosIRParser.MapoContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#pairmap}.
	 * @param ctx the parse tree
	 */
	void enterPairmap(langosIRParser.PairmapContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#pairmap}.
	 * @param ctx the parse tree
	 */
	void exitPairmap(langosIRParser.PairmapContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#pairmap_o}.
	 * @param ctx the parse tree
	 */
	void enterPairmap_o(langosIRParser.Pairmap_oContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#pairmap_o}.
	 * @param ctx the parse tree
	 */
	void exitPairmap_o(langosIRParser.Pairmap_oContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#pairmapo_}.
	 * @param ctx the parse tree
	 */
	void enterPairmapo_(langosIRParser.Pairmapo_Context ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#pairmapo_}.
	 * @param ctx the parse tree
	 */
	void exitPairmapo_(langosIRParser.Pairmapo_Context ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#pairmapoo}.
	 * @param ctx the parse tree
	 */
	void enterPairmapoo(langosIRParser.PairmapooContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#pairmapoo}.
	 * @param ctx the parse tree
	 */
	void exitPairmapoo(langosIRParser.PairmapooContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#pop}.
	 * @param ctx the parse tree
	 */
	void enterPop(langosIRParser.PopContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#pop}.
	 * @param ctx the parse tree
	 */
	void exitPop(langosIRParser.PopContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(langosIRParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(langosIRParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#jmp}.
	 * @param ctx the parse tree
	 */
	void enterJmp(langosIRParser.JmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#jmp}.
	 * @param ctx the parse tree
	 */
	void exitJmp(langosIRParser.JmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(langosIRParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(langosIRParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#eq}.
	 * @param ctx the parse tree
	 */
	void enterEq(langosIRParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#eq}.
	 * @param ctx the parse tree
	 */
	void exitEq(langosIRParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#lbl}.
	 * @param ctx the parse tree
	 */
	void enterLbl(langosIRParser.LblContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#lbl}.
	 * @param ctx the parse tree
	 */
	void exitLbl(langosIRParser.LblContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#func_lbl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_lbl(langosIRParser.Func_lblContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#func_lbl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_lbl(langosIRParser.Func_lblContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#member_declare}.
	 * @param ctx the parse tree
	 */
	void enterMember_declare(langosIRParser.Member_declareContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#member_declare}.
	 * @param ctx the parse tree
	 */
	void exitMember_declare(langosIRParser.Member_declareContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#class_full}.
	 * @param ctx the parse tree
	 */
	void enterClass_full(langosIRParser.Class_fullContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#class_full}.
	 * @param ctx the parse tree
	 */
	void exitClass_full(langosIRParser.Class_fullContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#jmps}.
	 * @param ctx the parse tree
	 */
	void enterJmps(langosIRParser.JmpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#jmps}.
	 * @param ctx the parse tree
	 */
	void exitJmps(langosIRParser.JmpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#flow_control}.
	 * @param ctx the parse tree
	 */
	void enterFlow_control(langosIRParser.Flow_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#flow_control}.
	 * @param ctx the parse tree
	 */
	void exitFlow_control(langosIRParser.Flow_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#scope_control}.
	 * @param ctx the parse tree
	 */
	void enterScope_control(langosIRParser.Scope_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#scope_control}.
	 * @param ctx the parse tree
	 */
	void exitScope_control(langosIRParser.Scope_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#stack_cmds}.
	 * @param ctx the parse tree
	 */
	void enterStack_cmds(langosIRParser.Stack_cmdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#stack_cmds}.
	 * @param ctx the parse tree
	 */
	void exitStack_cmds(langosIRParser.Stack_cmdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#map_control}.
	 * @param ctx the parse tree
	 */
	void enterMap_control(langosIRParser.Map_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#map_control}.
	 * @param ctx the parse tree
	 */
	void exitMap_control(langosIRParser.Map_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument(langosIRParser.Function_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument(langosIRParser.Function_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(langosIRParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(langosIRParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#get_element_ptr}.
	 * @param ctx the parse tree
	 */
	void enterGet_element_ptr(langosIRParser.Get_element_ptrContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#get_element_ptr}.
	 * @param ctx the parse tree
	 */
	void exitGet_element_ptr(langosIRParser.Get_element_ptrContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#mov}.
	 * @param ctx the parse tree
	 */
	void enterMov(langosIRParser.MovContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#mov}.
	 * @param ctx the parse tree
	 */
	void exitMov(langosIRParser.MovContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(langosIRParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(langosIRParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link langosIRParser#entry_point}.
	 * @param ctx the parse tree
	 */
	void enterEntry_point(langosIRParser.Entry_pointContext ctx);
	/**
	 * Exit a parse tree produced by {@link langosIRParser#entry_point}.
	 * @param ctx the parse tree
	 */
	void exitEntry_point(langosIRParser.Entry_pointContext ctx);
}