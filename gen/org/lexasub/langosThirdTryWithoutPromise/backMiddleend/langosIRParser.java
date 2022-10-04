// Generated from /home/su/IdeaProjects/langA/src/main/java/org/lexasub/langosThirdTryWithoutPromise/langosIR.g4 by ANTLR 4.10.1
package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class langosIRParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COLON=1, SLASH=2, COMA=3, CLASS=4, ENDCLASS=5, IMPORT=6, MAP=7, MAPo=8, 
		PAIRMAP=9, PAIRMAP_o=10, PAIRMAPo_=11, PAIRMAPoo=12, POP=13, PUSH=14, 
		EQ=15, NEQ=16, JMP=17, BREAK=18, CONTINUE=19, CALL=20, RET=21, INTOSCOPE=22, 
		OUTOFSCOPE=23, ENTERSCOPE=24, EXITSCOPE=25, WS=26, TAB=27, UNTAB=28, ID=29;
	public static final int
		RULE_intoscope = 0, RULE_class = 1, RULE_endclass = 2, RULE_import_ = 3, 
		RULE_map = 4, RULE_mapo = 5, RULE_pairmap = 6, RULE_pairmap_o = 7, RULE_pairmapo_ = 8, 
		RULE_pairmapoo = 9, RULE_pop = 10, RULE_push = 11, RULE_jmp = 12, RULE_call = 13, 
		RULE_eq = 14, RULE_neq = 15, RULE_lbl = 16, RULE_class_full = 17, RULE_jmps = 18, 
		RULE_flow_control = 19, RULE_scope_control = 20, RULE_stack_cmds = 21, 
		RULE_map_control = 22, RULE_program = 23, RULE_entry_point = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"intoscope", "class", "endclass", "import_", "map", "mapo", "pairmap", 
			"pairmap_o", "pairmapo_", "pairmapoo", "pop", "push", "jmp", "call", 
			"eq", "neq", "lbl", "class_full", "jmps", "flow_control", "scope_control", 
			"stack_cmds", "map_control", "program", "entry_point"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'/'", "','", "'CLASS'", "'ENDCLASS'", "'IMPORT'", "'MAP'", 
			"'MAPo'", "'PAIRMAP'", "'PAIRMAP_o'", "'PAIRMAPo_'", "'PAIRMAPoo'", "'POP'", 
			"'PUSH'", "'EQ'", "'NEQ'", "'JMP'", "'BREAK'", "'CONTINUE'", "'CALL'", 
			"'RET'", "'INTOSCOPE'", "'OUTOFSCOPE'", "'ENTERSCOPE'", "'EXITSCOPE'", 
			null, "'TAB'", "'UNTAB'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COLON", "SLASH", "COMA", "CLASS", "ENDCLASS", "IMPORT", "MAP", 
			"MAPo", "PAIRMAP", "PAIRMAP_o", "PAIRMAPo_", "PAIRMAPoo", "POP", "PUSH", 
			"EQ", "NEQ", "JMP", "BREAK", "CONTINUE", "CALL", "RET", "INTOSCOPE", 
			"OUTOFSCOPE", "ENTERSCOPE", "EXITSCOPE", "WS", "TAB", "UNTAB", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "langosIR.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public langosIRParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class IntoscopeContext extends ParserRuleContext {
		public TerminalNode INTOSCOPE() { return getToken(langosIRParser.INTOSCOPE, 0); }
		public TerminalNode ID() { return getToken(langosIRParser.ID, 0); }
		public IntoscopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intoscope; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitIntoscope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntoscopeContext intoscope() throws RecognitionException {
		IntoscopeContext _localctx = new IntoscopeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_intoscope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(INTOSCOPE);
			setState(51);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(langosIRParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(langosIRParser.ID, 0); }
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(CLASS);
			setState(54);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndclassContext extends ParserRuleContext {
		public TerminalNode ENDCLASS() { return getToken(langosIRParser.ENDCLASS, 0); }
		public TerminalNode ID() { return getToken(langosIRParser.ID, 0); }
		public EndclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endclass; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitEndclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndclassContext endclass() throws RecognitionException {
		EndclassContext _localctx = new EndclassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_endclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(ENDCLASS);
			setState(57);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_Context extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(langosIRParser.IMPORT, 0); }
		public List<TerminalNode> ID() { return getTokens(langosIRParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langosIRParser.ID, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(langosIRParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(langosIRParser.SLASH, i);
		}
		public Import_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitImport_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_Context import_() throws RecognitionException {
		Import_Context _localctx = new Import_Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_import_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(IMPORT);
			setState(60);
			match(ID);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH) {
				{
				{
				setState(61);
				match(SLASH);
				setState(62);
				match(ID);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapContext extends ParserRuleContext {
		public TerminalNode MAP() { return getToken(langosIRParser.MAP, 0); }
		public List<TerminalNode> ID() { return getTokens(langosIRParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langosIRParser.ID, i);
		}
		public TerminalNode COMA() { return getToken(langosIRParser.COMA, 0); }
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_map);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(MAP);
			setState(69);
			match(ID);
			setState(70);
			match(COMA);
			setState(71);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapoContext extends ParserRuleContext {
		public TerminalNode MAPo() { return getToken(langosIRParser.MAPo, 0); }
		public List<TerminalNode> ID() { return getTokens(langosIRParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langosIRParser.ID, i);
		}
		public TerminalNode COMA() { return getToken(langosIRParser.COMA, 0); }
		public MapoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitMapo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapoContext mapo() throws RecognitionException {
		MapoContext _localctx = new MapoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mapo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(MAPo);
			setState(74);
			match(ID);
			setState(75);
			match(COMA);
			setState(76);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairmapContext extends ParserRuleContext {
		public TerminalNode PAIRMAP() { return getToken(langosIRParser.PAIRMAP, 0); }
		public List<TerminalNode> ID() { return getTokens(langosIRParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langosIRParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(langosIRParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(langosIRParser.COMA, i);
		}
		public PairmapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairmap; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitPairmap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairmapContext pairmap() throws RecognitionException {
		PairmapContext _localctx = new PairmapContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pairmap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(PAIRMAP);
			setState(79);
			match(ID);
			setState(80);
			match(COMA);
			setState(81);
			match(ID);
			setState(82);
			match(COMA);
			setState(83);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pairmap_oContext extends ParserRuleContext {
		public TerminalNode PAIRMAP_o() { return getToken(langosIRParser.PAIRMAP_o, 0); }
		public List<TerminalNode> ID() { return getTokens(langosIRParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langosIRParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(langosIRParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(langosIRParser.COMA, i);
		}
		public Pairmap_oContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairmap_o; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitPairmap_o(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pairmap_oContext pairmap_o() throws RecognitionException {
		Pairmap_oContext _localctx = new Pairmap_oContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pairmap_o);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(PAIRMAP_o);
			setState(86);
			match(ID);
			setState(87);
			match(COMA);
			setState(88);
			match(ID);
			setState(89);
			match(COMA);
			setState(90);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pairmapo_Context extends ParserRuleContext {
		public TerminalNode PAIRMAPo_() { return getToken(langosIRParser.PAIRMAPo_, 0); }
		public List<TerminalNode> ID() { return getTokens(langosIRParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langosIRParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(langosIRParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(langosIRParser.COMA, i);
		}
		public Pairmapo_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairmapo_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitPairmapo_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pairmapo_Context pairmapo_() throws RecognitionException {
		Pairmapo_Context _localctx = new Pairmapo_Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_pairmapo_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(PAIRMAPo_);
			setState(93);
			match(ID);
			setState(94);
			match(COMA);
			setState(95);
			match(ID);
			setState(96);
			match(COMA);
			setState(97);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairmapooContext extends ParserRuleContext {
		public TerminalNode PAIRMAPoo() { return getToken(langosIRParser.PAIRMAPoo, 0); }
		public List<TerminalNode> ID() { return getTokens(langosIRParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langosIRParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(langosIRParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(langosIRParser.COMA, i);
		}
		public PairmapooContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairmapoo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitPairmapoo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairmapooContext pairmapoo() throws RecognitionException {
		PairmapooContext _localctx = new PairmapooContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pairmapoo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(PAIRMAPoo);
			setState(100);
			match(ID);
			setState(101);
			match(COMA);
			setState(102);
			match(ID);
			setState(103);
			match(COMA);
			setState(104);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PopContext extends ParserRuleContext {
		public TerminalNode POP() { return getToken(langosIRParser.POP, 0); }
		public TerminalNode ID() { return getToken(langosIRParser.ID, 0); }
		public PopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitPop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PopContext pop() throws RecognitionException {
		PopContext _localctx = new PopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(POP);
			setState(107);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PushContext extends ParserRuleContext {
		public TerminalNode PUSH() { return getToken(langosIRParser.PUSH, 0); }
		public TerminalNode ID() { return getToken(langosIRParser.ID, 0); }
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitPush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(PUSH);
			setState(110);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JmpContext extends ParserRuleContext {
		public TerminalNode JMP() { return getToken(langosIRParser.JMP, 0); }
		public TerminalNode ID() { return getToken(langosIRParser.ID, 0); }
		public JmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jmp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitJmp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JmpContext jmp() throws RecognitionException {
		JmpContext _localctx = new JmpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(JMP);
			setState(113);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(langosIRParser.CALL, 0); }
		public TerminalNode ID() { return getToken(langosIRParser.ID, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(CALL);
			setState(116);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(langosIRParser.EQ, 0); }
		public TerminalNode ID() { return getToken(langosIRParser.ID, 0); }
		public EqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqContext eq() throws RecognitionException {
		EqContext _localctx = new EqContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(EQ);
			setState(119);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NeqContext extends ParserRuleContext {
		public TerminalNode NEQ() { return getToken(langosIRParser.NEQ, 0); }
		public TerminalNode ID() { return getToken(langosIRParser.ID, 0); }
		public NeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neq; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitNeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NeqContext neq() throws RecognitionException {
		NeqContext _localctx = new NeqContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_neq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(NEQ);
			setState(122);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LblContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(langosIRParser.ID, 0); }
		public TerminalNode COLON() { return getToken(langosIRParser.COLON, 0); }
		public LblContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lbl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitLbl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LblContext lbl() throws RecognitionException {
		LblContext _localctx = new LblContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lbl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(ID);
			setState(125);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_fullContext extends ParserRuleContext {
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public IntoscopeContext intoscope() {
			return getRuleContext(IntoscopeContext.class,0);
		}
		public EndclassContext endclass() {
			return getRuleContext(EndclassContext.class,0);
		}
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public Class_fullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_full; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitClass_full(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_fullContext class_full() throws RecognitionException {
		Class_fullContext _localctx = new Class_fullContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_class_full);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			class_();
			setState(128);
			intoscope();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << IMPORT) | (1L << MAP) | (1L << MAPo) | (1L << PAIRMAP) | (1L << PAIRMAP_o) | (1L << PAIRMAPo_) | (1L << PAIRMAPoo) | (1L << POP) | (1L << PUSH) | (1L << EQ) | (1L << NEQ) | (1L << JMP) | (1L << BREAK) | (1L << CONTINUE) | (1L << CALL) | (1L << RET) | (1L << INTOSCOPE) | (1L << OUTOFSCOPE) | (1L << ENTERSCOPE) | (1L << EXITSCOPE) | (1L << ID))) != 0)) {
				{
				{
				setState(129);
				program();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			endclass();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JmpsContext extends ParserRuleContext {
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
		}
		public JmpContext jmp() {
			return getRuleContext(JmpContext.class,0);
		}
		public NeqContext neq() {
			return getRuleContext(NeqContext.class,0);
		}
		public JmpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jmps; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitJmps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JmpsContext jmps() throws RecognitionException {
		JmpsContext _localctx = new JmpsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_jmps);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				eq();
				}
				break;
			case JMP:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				jmp();
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				neq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Flow_controlContext extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode RET() { return getToken(langosIRParser.RET, 0); }
		public TerminalNode CONTINUE() { return getToken(langosIRParser.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(langosIRParser.BREAK, 0); }
		public JmpsContext jmps() {
			return getRuleContext(JmpsContext.class,0);
		}
		public Flow_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow_control; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitFlow_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flow_controlContext flow_control() throws RecognitionException {
		Flow_controlContext _localctx = new Flow_controlContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_flow_control);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				call();
				}
				break;
			case RET:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(RET);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(CONTINUE);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				match(BREAK);
				}
				break;
			case EQ:
			case NEQ:
			case JMP:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				jmps();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scope_controlContext extends ParserRuleContext {
		public IntoscopeContext intoscope() {
			return getRuleContext(IntoscopeContext.class,0);
		}
		public TerminalNode OUTOFSCOPE() { return getToken(langosIRParser.OUTOFSCOPE, 0); }
		public TerminalNode ENTERSCOPE() { return getToken(langosIRParser.ENTERSCOPE, 0); }
		public TerminalNode EXITSCOPE() { return getToken(langosIRParser.EXITSCOPE, 0); }
		public Scope_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope_control; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitScope_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scope_controlContext scope_control() throws RecognitionException {
		Scope_controlContext _localctx = new Scope_controlContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_scope_control);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTOSCOPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				intoscope();
				}
				break;
			case OUTOFSCOPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(OUTOFSCOPE);
				}
				break;
			case ENTERSCOPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(ENTERSCOPE);
				}
				break;
			case EXITSCOPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				match(EXITSCOPE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stack_cmdsContext extends ParserRuleContext {
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public PopContext pop() {
			return getRuleContext(PopContext.class,0);
		}
		public Stack_cmdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack_cmds; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitStack_cmds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stack_cmdsContext stack_cmds() throws RecognitionException {
		Stack_cmdsContext _localctx = new Stack_cmdsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_stack_cmds);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUSH:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				push();
				}
				break;
			case POP:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				pop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Map_controlContext extends ParserRuleContext {
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public MapoContext mapo() {
			return getRuleContext(MapoContext.class,0);
		}
		public PairmapContext pairmap() {
			return getRuleContext(PairmapContext.class,0);
		}
		public Pairmap_oContext pairmap_o() {
			return getRuleContext(Pairmap_oContext.class,0);
		}
		public Pairmapo_Context pairmapo_() {
			return getRuleContext(Pairmapo_Context.class,0);
		}
		public PairmapooContext pairmapoo() {
			return getRuleContext(PairmapooContext.class,0);
		}
		public Map_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_control; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitMap_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Map_controlContext map_control() throws RecognitionException {
		Map_controlContext _localctx = new Map_controlContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_map_control);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				map();
				}
				break;
			case MAPo:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				mapo();
				}
				break;
			case PAIRMAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				pairmap();
				}
				break;
			case PAIRMAP_o:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				pairmap_o();
				}
				break;
			case PAIRMAPo_:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				pairmapo_();
				}
				break;
			case PAIRMAPoo:
				enterOuterAlt(_localctx, 6);
				{
				setState(164);
				pairmapoo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public Import_Context import_() {
			return getRuleContext(Import_Context.class,0);
		}
		public Class_fullContext class_full() {
			return getRuleContext(Class_fullContext.class,0);
		}
		public Flow_controlContext flow_control() {
			return getRuleContext(Flow_controlContext.class,0);
		}
		public Scope_controlContext scope_control() {
			return getRuleContext(Scope_controlContext.class,0);
		}
		public Map_controlContext map_control() {
			return getRuleContext(Map_controlContext.class,0);
		}
		public Stack_cmdsContext stack_cmds() {
			return getRuleContext(Stack_cmdsContext.class,0);
		}
		public LblContext lbl() {
			return getRuleContext(LblContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_program);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				import_();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				class_full();
				}
				break;
			case EQ:
			case NEQ:
			case JMP:
			case BREAK:
			case CONTINUE:
			case CALL:
			case RET:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				flow_control();
				}
				break;
			case INTOSCOPE:
			case OUTOFSCOPE:
			case ENTERSCOPE:
			case EXITSCOPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				scope_control();
				}
				break;
			case MAP:
			case MAPo:
			case PAIRMAP:
			case PAIRMAP_o:
			case PAIRMAPo_:
			case PAIRMAPoo:
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
				map_control();
				}
				break;
			case POP:
			case PUSH:
				enterOuterAlt(_localctx, 6);
				{
				setState(172);
				stack_cmds();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(173);
				lbl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entry_pointContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(langosIRParser.EOF, 0); }
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public Entry_pointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry_point; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitEntry_point(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entry_pointContext entry_point() throws RecognitionException {
		Entry_pointContext _localctx = new Entry_pointContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_entry_point);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << IMPORT) | (1L << MAP) | (1L << MAPo) | (1L << PAIRMAP) | (1L << PAIRMAP_o) | (1L << PAIRMAPo_) | (1L << PAIRMAPoo) | (1L << POP) | (1L << PUSH) | (1L << EQ) | (1L << NEQ) | (1L << JMP) | (1L << BREAK) | (1L << CONTINUE) | (1L << CALL) | (1L << RET) | (1L << INTOSCOPE) | (1L << OUTOFSCOPE) | (1L << ENTERSCOPE) | (1L << EXITSCOPE) | (1L << ID))) != 0)) {
				{
				{
				setState(176);
				program();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001d\u00b9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003@\b\u0003\n\u0003\f\u0003C\t\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u0083\b\u0011\n\u0011\f\u0011\u0086\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u008d\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0094"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u009a"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u009e\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u00a6\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u00af\b\u0017\u0001\u0018\u0005\u0018"+
		"\u00b2\b\u0018\n\u0018\f\u0018\u00b5\t\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0000\u0000\u0019\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0\u0000\u0000\u00b7\u0000"+
		"2\u0001\u0000\u0000\u0000\u00025\u0001\u0000\u0000\u0000\u00048\u0001"+
		"\u0000\u0000\u0000\u0006;\u0001\u0000\u0000\u0000\bD\u0001\u0000\u0000"+
		"\u0000\nI\u0001\u0000\u0000\u0000\fN\u0001\u0000\u0000\u0000\u000eU\u0001"+
		"\u0000\u0000\u0000\u0010\\\u0001\u0000\u0000\u0000\u0012c\u0001\u0000"+
		"\u0000\u0000\u0014j\u0001\u0000\u0000\u0000\u0016m\u0001\u0000\u0000\u0000"+
		"\u0018p\u0001\u0000\u0000\u0000\u001as\u0001\u0000\u0000\u0000\u001cv"+
		"\u0001\u0000\u0000\u0000\u001ey\u0001\u0000\u0000\u0000 |\u0001\u0000"+
		"\u0000\u0000\"\u007f\u0001\u0000\u0000\u0000$\u008c\u0001\u0000\u0000"+
		"\u0000&\u0093\u0001\u0000\u0000\u0000(\u0099\u0001\u0000\u0000\u0000*"+
		"\u009d\u0001\u0000\u0000\u0000,\u00a5\u0001\u0000\u0000\u0000.\u00ae\u0001"+
		"\u0000\u0000\u00000\u00b3\u0001\u0000\u0000\u000023\u0005\u0016\u0000"+
		"\u000034\u0005\u001d\u0000\u00004\u0001\u0001\u0000\u0000\u000056\u0005"+
		"\u0004\u0000\u000067\u0005\u001d\u0000\u00007\u0003\u0001\u0000\u0000"+
		"\u000089\u0005\u0005\u0000\u00009:\u0005\u001d\u0000\u0000:\u0005\u0001"+
		"\u0000\u0000\u0000;<\u0005\u0006\u0000\u0000<A\u0005\u001d\u0000\u0000"+
		"=>\u0005\u0002\u0000\u0000>@\u0005\u001d\u0000\u0000?=\u0001\u0000\u0000"+
		"\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000B\u0007\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000"+
		"DE\u0005\u0007\u0000\u0000EF\u0005\u001d\u0000\u0000FG\u0005\u0003\u0000"+
		"\u0000GH\u0005\u001d\u0000\u0000H\t\u0001\u0000\u0000\u0000IJ\u0005\b"+
		"\u0000\u0000JK\u0005\u001d\u0000\u0000KL\u0005\u0003\u0000\u0000LM\u0005"+
		"\u001d\u0000\u0000M\u000b\u0001\u0000\u0000\u0000NO\u0005\t\u0000\u0000"+
		"OP\u0005\u001d\u0000\u0000PQ\u0005\u0003\u0000\u0000QR\u0005\u001d\u0000"+
		"\u0000RS\u0005\u0003\u0000\u0000ST\u0005\u001d\u0000\u0000T\r\u0001\u0000"+
		"\u0000\u0000UV\u0005\n\u0000\u0000VW\u0005\u001d\u0000\u0000WX\u0005\u0003"+
		"\u0000\u0000XY\u0005\u001d\u0000\u0000YZ\u0005\u0003\u0000\u0000Z[\u0005"+
		"\u001d\u0000\u0000[\u000f\u0001\u0000\u0000\u0000\\]\u0005\u000b\u0000"+
		"\u0000]^\u0005\u001d\u0000\u0000^_\u0005\u0003\u0000\u0000_`\u0005\u001d"+
		"\u0000\u0000`a\u0005\u0003\u0000\u0000ab\u0005\u001d\u0000\u0000b\u0011"+
		"\u0001\u0000\u0000\u0000cd\u0005\f\u0000\u0000de\u0005\u001d\u0000\u0000"+
		"ef\u0005\u0003\u0000\u0000fg\u0005\u001d\u0000\u0000gh\u0005\u0003\u0000"+
		"\u0000hi\u0005\u001d\u0000\u0000i\u0013\u0001\u0000\u0000\u0000jk\u0005"+
		"\r\u0000\u0000kl\u0005\u001d\u0000\u0000l\u0015\u0001\u0000\u0000\u0000"+
		"mn\u0005\u000e\u0000\u0000no\u0005\u001d\u0000\u0000o\u0017\u0001\u0000"+
		"\u0000\u0000pq\u0005\u0011\u0000\u0000qr\u0005\u001d\u0000\u0000r\u0019"+
		"\u0001\u0000\u0000\u0000st\u0005\u0014\u0000\u0000tu\u0005\u001d\u0000"+
		"\u0000u\u001b\u0001\u0000\u0000\u0000vw\u0005\u000f\u0000\u0000wx\u0005"+
		"\u001d\u0000\u0000x\u001d\u0001\u0000\u0000\u0000yz\u0005\u0010\u0000"+
		"\u0000z{\u0005\u001d\u0000\u0000{\u001f\u0001\u0000\u0000\u0000|}\u0005"+
		"\u001d\u0000\u0000}~\u0005\u0001\u0000\u0000~!\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0003\u0002\u0001\u0000\u0080\u0084\u0003\u0000\u0000\u0000"+
		"\u0081\u0083\u0003.\u0017\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083"+
		"\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0087\u0088\u0003\u0004\u0002\u0000\u0088"+
		"#\u0001\u0000\u0000\u0000\u0089\u008d\u0003\u001c\u000e\u0000\u008a\u008d"+
		"\u0003\u0018\f\u0000\u008b\u008d\u0003\u001e\u000f\u0000\u008c\u0089\u0001"+
		"\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008b\u0001"+
		"\u0000\u0000\u0000\u008d%\u0001\u0000\u0000\u0000\u008e\u0094\u0003\u001a"+
		"\r\u0000\u008f\u0094\u0005\u0015\u0000\u0000\u0090\u0094\u0005\u0013\u0000"+
		"\u0000\u0091\u0094\u0005\u0012\u0000\u0000\u0092\u0094\u0003$\u0012\u0000"+
		"\u0093\u008e\u0001\u0000\u0000\u0000\u0093\u008f\u0001\u0000\u0000\u0000"+
		"\u0093\u0090\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000"+
		"\u0093\u0092\u0001\u0000\u0000\u0000\u0094\'\u0001\u0000\u0000\u0000\u0095"+
		"\u009a\u0003\u0000\u0000\u0000\u0096\u009a\u0005\u0017\u0000\u0000\u0097"+
		"\u009a\u0005\u0018\u0000\u0000\u0098\u009a\u0005\u0019\u0000\u0000\u0099"+
		"\u0095\u0001\u0000\u0000\u0000\u0099\u0096\u0001\u0000\u0000\u0000\u0099"+
		"\u0097\u0001\u0000\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a"+
		")\u0001\u0000\u0000\u0000\u009b\u009e\u0003\u0016\u000b\u0000\u009c\u009e"+
		"\u0003\u0014\n\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009c\u0001"+
		"\u0000\u0000\u0000\u009e+\u0001\u0000\u0000\u0000\u009f\u00a6\u0003\b"+
		"\u0004\u0000\u00a0\u00a6\u0003\n\u0005\u0000\u00a1\u00a6\u0003\f\u0006"+
		"\u0000\u00a2\u00a6\u0003\u000e\u0007\u0000\u00a3\u00a6\u0003\u0010\b\u0000"+
		"\u00a4\u00a6\u0003\u0012\t\u0000\u00a5\u009f\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a5\u00a1\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6-\u0001\u0000\u0000\u0000\u00a7\u00af"+
		"\u0003\u0006\u0003\u0000\u00a8\u00af\u0003\"\u0011\u0000\u00a9\u00af\u0003"+
		"&\u0013\u0000\u00aa\u00af\u0003(\u0014\u0000\u00ab\u00af\u0003,\u0016"+
		"\u0000\u00ac\u00af\u0003*\u0015\u0000\u00ad\u00af\u0003 \u0010\u0000\u00ae"+
		"\u00a7\u0001\u0000\u0000\u0000\u00ae\u00a8\u0001\u0000\u0000\u0000\u00ae"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ae\u00aa\u0001\u0000\u0000\u0000\u00ae"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae"+
		"\u00ad\u0001\u0000\u0000\u0000\u00af/\u0001\u0000\u0000\u0000\u00b0\u00b2"+
		"\u0003.\u0017\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0005\u0000\u0000\u0001\u00b71\u0001\u0000"+
		"\u0000\u0000\tA\u0084\u008c\u0093\u0099\u009d\u00a5\u00ae\u00b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}