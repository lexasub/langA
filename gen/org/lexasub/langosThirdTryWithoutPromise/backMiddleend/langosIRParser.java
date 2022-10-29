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
		COLON=1, SLASH=2, COMA=3, CLASS=4, ENDCLASS=5, MEMBER=6, IMPORT=7, GET_ELEMENT_PTR=8, 
		MAP=9, MAPo=10, PAIRMAP=11, PAIRMAP_o=12, PAIRMAPo_=13, PAIRMAPoo=14, 
		POP=15, PUSH=16, MOV=17, EQ=18, NEQ=19, JMP=20, BREAK=21, CONTINUE=22, 
		FUNC=23, CALL=24, RET=25, INTOSCOPE=26, OUTOFSCOPE=27, ENTERSCOPE=28, 
		EXITSCOPE=29, FUNCTION_ARGUMENT=30, WS=31, TAB=32, UNTAB=33, ID=34, FUNCID=35;
	public static final int
		RULE_intoscope = 0, RULE_class = 1, RULE_endclass = 2, RULE_import_ = 3, 
		RULE_map = 4, RULE_mapo = 5, RULE_pairmap = 6, RULE_pairmap_o = 7, RULE_pairmapo_ = 8, 
		RULE_pairmapoo = 9, RULE_pop = 10, RULE_push = 11, RULE_jmp = 12, RULE_call = 13, 
		RULE_eq = 14, RULE_neq = 15, RULE_lbl = 16, RULE_member_declare = 17, 
		RULE_class_full = 18, RULE_jmps = 19, RULE_flow_control = 20, RULE_scope_control = 21, 
		RULE_stack_cmds = 22, RULE_map_control = 23, RULE_function_argument = 24, 
		RULE_func = 25, RULE_get_element_ptr = 26, RULE_mov = 27, RULE_program = 28, 
		RULE_entry_point = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"intoscope", "class", "endclass", "import_", "map", "mapo", "pairmap", 
			"pairmap_o", "pairmapo_", "pairmapoo", "pop", "push", "jmp", "call", 
			"eq", "neq", "lbl", "member_declare", "class_full", "jmps", "flow_control", 
			"scope_control", "stack_cmds", "map_control", "function_argument", "func", 
			"get_element_ptr", "mov", "program", "entry_point"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'/'", "','", "'CLASS'", "'ENDCLASS'", "'MEMBER'", "'IMPORT'", 
			"'GET_ELEMENT_PTR'", "'MAP'", "'MAPo'", "'PAIRMAP'", "'PAIRMAP_o'", "'PAIRMAPo_'", 
			"'PAIRMAPoo'", "'POP'", "'PUSH'", "'MOV'", "'EQ'", "'NEQ'", "'JMP'", 
			"'BREAK'", "'CONTINUE'", "'FUNCTION_'", "'CALL'", "'RET'", "'INTOSCOPE'", 
			"'OUTOFSCOPE'", "'ENTERSCOPE'", "'EXITSCOPE'", "'FUNCTION_ARGUMENT'", 
			null, "'TAB'", "'UNTAB'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COLON", "SLASH", "COMA", "CLASS", "ENDCLASS", "MEMBER", "IMPORT", 
			"GET_ELEMENT_PTR", "MAP", "MAPo", "PAIRMAP", "PAIRMAP_o", "PAIRMAPo_", 
			"PAIRMAPoo", "POP", "PUSH", "MOV", "EQ", "NEQ", "JMP", "BREAK", "CONTINUE", 
			"FUNC", "CALL", "RET", "INTOSCOPE", "OUTOFSCOPE", "ENTERSCOPE", "EXITSCOPE", 
			"FUNCTION_ARGUMENT", "WS", "TAB", "UNTAB", "ID", "FUNCID"
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterIntoscope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitIntoscope(this);
		}
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
			setState(60);
			match(INTOSCOPE);
			setState(61);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitClass(this);
		}
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
			setState(63);
			match(CLASS);
			setState(64);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterEndclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitEndclass(this);
		}
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
			setState(66);
			match(ENDCLASS);
			setState(67);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterImport_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitImport_(this);
		}
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
			setState(69);
			match(IMPORT);
			setState(70);
			match(ID);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH) {
				{
				{
				setState(71);
				match(SLASH);
				setState(72);
				match(ID);
				}
				}
				setState(77);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitMap(this);
		}
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
			setState(78);
			match(MAP);
			setState(79);
			match(ID);
			setState(80);
			match(COMA);
			setState(81);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterMapo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitMapo(this);
		}
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
			setState(83);
			match(MAPo);
			setState(84);
			match(ID);
			setState(85);
			match(COMA);
			setState(86);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterPairmap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitPairmap(this);
		}
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
			setState(88);
			match(PAIRMAP);
			setState(89);
			match(ID);
			setState(90);
			match(COMA);
			setState(91);
			match(ID);
			setState(92);
			match(COMA);
			setState(93);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterPairmap_o(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitPairmap_o(this);
		}
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
			setState(95);
			match(PAIRMAP_o);
			setState(96);
			match(ID);
			setState(97);
			match(COMA);
			setState(98);
			match(ID);
			setState(99);
			match(COMA);
			setState(100);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterPairmapo_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitPairmapo_(this);
		}
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
			setState(102);
			match(PAIRMAPo_);
			setState(103);
			match(ID);
			setState(104);
			match(COMA);
			setState(105);
			match(ID);
			setState(106);
			match(COMA);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterPairmapoo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitPairmapoo(this);
		}
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
			setState(109);
			match(PAIRMAPoo);
			setState(110);
			match(ID);
			setState(111);
			match(COMA);
			setState(112);
			match(ID);
			setState(113);
			match(COMA);
			setState(114);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterPop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitPop(this);
		}
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
			setState(116);
			match(POP);
			setState(117);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitPush(this);
		}
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
			setState(119);
			match(PUSH);
			setState(120);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterJmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitJmp(this);
		}
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
			setState(122);
			match(JMP);
			setState(123);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitCall(this);
		}
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
			setState(125);
			match(CALL);
			setState(126);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitEq(this);
		}
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
			setState(128);
			match(EQ);
			setState(129);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterNeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitNeq(this);
		}
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
			setState(131);
			match(NEQ);
			setState(132);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterLbl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitLbl(this);
		}
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
			setState(134);
			match(ID);
			setState(135);
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

	public static class Member_declareContext extends ParserRuleContext {
		public TerminalNode MEMBER() { return getToken(langosIRParser.MEMBER, 0); }
		public List<TerminalNode> ID() { return getTokens(langosIRParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langosIRParser.ID, i);
		}
		public TerminalNode COMA() { return getToken(langosIRParser.COMA, 0); }
		public Member_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterMember_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitMember_declare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitMember_declare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_declareContext member_declare() throws RecognitionException {
		Member_declareContext _localctx = new Member_declareContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_member_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(MEMBER);
			setState(138);
			match(ID);
			setState(139);
			match(COMA);
			setState(140);
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

	public static class Class_fullContext extends ParserRuleContext {
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public IntoscopeContext intoscope() {
			return getRuleContext(IntoscopeContext.class,0);
		}
		public TerminalNode OUTOFSCOPE() { return getToken(langosIRParser.OUTOFSCOPE, 0); }
		public EndclassContext endclass() {
			return getRuleContext(EndclassContext.class,0);
		}
		public List<Member_declareContext> member_declare() {
			return getRuleContexts(Member_declareContext.class);
		}
		public Member_declareContext member_declare(int i) {
			return getRuleContext(Member_declareContext.class,i);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterClass_full(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitClass_full(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitClass_full(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_fullContext class_full() throws RecognitionException {
		Class_fullContext _localctx = new Class_fullContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_class_full);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			class_();
			setState(143);
			intoscope();
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(146);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MEMBER:
						{
						setState(144);
						member_declare();
						}
						break;
					case CLASS:
					case IMPORT:
					case GET_ELEMENT_PTR:
					case MAP:
					case MAPo:
					case PAIRMAP:
					case PAIRMAP_o:
					case PAIRMAPo_:
					case PAIRMAPoo:
					case POP:
					case PUSH:
					case MOV:
					case EQ:
					case NEQ:
					case JMP:
					case BREAK:
					case CONTINUE:
					case CALL:
					case RET:
					case INTOSCOPE:
					case OUTOFSCOPE:
					case ENTERSCOPE:
					case ID:
					case FUNCID:
						{
						setState(145);
						program();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(151);
			match(OUTOFSCOPE);
			setState(152);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterJmps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitJmps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitJmps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JmpsContext jmps() throws RecognitionException {
		JmpsContext _localctx = new JmpsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_jmps);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				eq();
				}
				break;
			case JMP:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				jmp();
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterFlow_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitFlow_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitFlow_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flow_controlContext flow_control() throws RecognitionException {
		Flow_controlContext _localctx = new Flow_controlContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_flow_control);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				call();
				}
				break;
			case RET:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(RET);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(CONTINUE);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match(BREAK);
				}
				break;
			case EQ:
			case NEQ:
			case JMP:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
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
		public TerminalNode ENTERSCOPE() { return getToken(langosIRParser.ENTERSCOPE, 0); }
		public IntoscopeContext intoscope() {
			return getRuleContext(IntoscopeContext.class,0);
		}
		public TerminalNode OUTOFSCOPE() { return getToken(langosIRParser.OUTOFSCOPE, 0); }
		public Scope_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterScope_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitScope_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitScope_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scope_controlContext scope_control() throws RecognitionException {
		Scope_controlContext _localctx = new Scope_controlContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_scope_control);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERSCOPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(ENTERSCOPE);
				}
				break;
			case INTOSCOPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				intoscope();
				}
				break;
			case OUTOFSCOPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(OUTOFSCOPE);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterStack_cmds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitStack_cmds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitStack_cmds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stack_cmdsContext stack_cmds() throws RecognitionException {
		Stack_cmdsContext _localctx = new Stack_cmdsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_stack_cmds);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUSH:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				push();
				}
				break;
			case POP:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterMap_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitMap_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitMap_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Map_controlContext map_control() throws RecognitionException {
		Map_controlContext _localctx = new Map_controlContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_map_control);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				map();
				}
				break;
			case MAPo:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				mapo();
				}
				break;
			case PAIRMAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				pairmap();
				}
				break;
			case PAIRMAP_o:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				pairmap_o();
				}
				break;
			case PAIRMAPo_:
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				pairmapo_();
				}
				break;
			case PAIRMAPoo:
				enterOuterAlt(_localctx, 6);
				{
				setState(180);
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

	public static class Function_argumentContext extends ParserRuleContext {
		public TerminalNode FUNCTION_ARGUMENT() { return getToken(langosIRParser.FUNCTION_ARGUMENT, 0); }
		public List<TerminalNode> ID() { return getTokens(langosIRParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langosIRParser.ID, i);
		}
		public TerminalNode COMA() { return getToken(langosIRParser.COMA, 0); }
		public Function_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterFunction_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitFunction_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitFunction_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argumentContext function_argument() throws RecognitionException {
		Function_argumentContext _localctx = new Function_argumentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(FUNCTION_ARGUMENT);
			setState(184);
			match(ID);
			setState(185);
			match(COMA);
			setState(186);
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

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode FUNCID() { return getToken(langosIRParser.FUNCID, 0); }
		public TerminalNode ENTERSCOPE() { return getToken(langosIRParser.ENTERSCOPE, 0); }
		public TerminalNode RET() { return getToken(langosIRParser.RET, 0); }
		public TerminalNode EXITSCOPE() { return getToken(langosIRParser.EXITSCOPE, 0); }
		public List<Function_argumentContext> function_argument() {
			return getRuleContexts(Function_argumentContext.class);
		}
		public Function_argumentContext function_argument(int i) {
			return getRuleContext(Function_argumentContext.class,i);
		}
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_func);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(FUNCID);
			setState(189);
			match(ENTERSCOPE);
			{
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION_ARGUMENT) {
				{
				{
				setState(190);
				function_argument();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(196);
					program();
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
			setState(202);
			match(RET);
			setState(203);
			match(EXITSCOPE);
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

	public static class Get_element_ptrContext extends ParserRuleContext {
		public TerminalNode GET_ELEMENT_PTR() { return getToken(langosIRParser.GET_ELEMENT_PTR, 0); }
		public List<TerminalNode> ID() { return getTokens(langosIRParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langosIRParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(langosIRParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(langosIRParser.COMA, i);
		}
		public Get_element_ptrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_element_ptr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterGet_element_ptr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitGet_element_ptr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitGet_element_ptr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_element_ptrContext get_element_ptr() throws RecognitionException {
		Get_element_ptrContext _localctx = new Get_element_ptrContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_get_element_ptr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(GET_ELEMENT_PTR);
			setState(206);
			match(ID);
			setState(207);
			match(COMA);
			setState(208);
			match(ID);
			setState(209);
			match(COMA);
			setState(210);
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

	public static class MovContext extends ParserRuleContext {
		public TerminalNode MOV() { return getToken(langosIRParser.MOV, 0); }
		public List<TerminalNode> ID() { return getTokens(langosIRParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langosIRParser.ID, i);
		}
		public TerminalNode COMA() { return getToken(langosIRParser.COMA, 0); }
		public MovContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mov; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterMov(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitMov(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitMov(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovContext mov() throws RecognitionException {
		MovContext _localctx = new MovContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mov);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(MOV);
			setState(213);
			match(ID);
			setState(214);
			match(COMA);
			setState(215);
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
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public Scope_controlContext scope_control() {
			return getRuleContext(Scope_controlContext.class,0);
		}
		public Map_controlContext map_control() {
			return getRuleContext(Map_controlContext.class,0);
		}
		public MovContext mov() {
			return getRuleContext(MovContext.class,0);
		}
		public Stack_cmdsContext stack_cmds() {
			return getRuleContext(Stack_cmdsContext.class,0);
		}
		public Get_element_ptrContext get_element_ptr() {
			return getRuleContext(Get_element_ptrContext.class,0);
		}
		public LblContext lbl() {
			return getRuleContext(LblContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_program);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				import_();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
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
				setState(219);
				flow_control();
				}
				break;
			case FUNCID:
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				func();
				}
				break;
			case INTOSCOPE:
			case OUTOFSCOPE:
			case ENTERSCOPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
				scope_control();
				}
				break;
			case MAP:
			case MAPo:
			case PAIRMAP:
			case PAIRMAP_o:
			case PAIRMAPo_:
			case PAIRMAPoo:
				enterOuterAlt(_localctx, 6);
				{
				setState(222);
				map_control();
				}
				break;
			case MOV:
				enterOuterAlt(_localctx, 7);
				{
				setState(223);
				mov();
				}
				break;
			case POP:
			case PUSH:
				enterOuterAlt(_localctx, 8);
				{
				setState(224);
				stack_cmds();
				}
				break;
			case GET_ELEMENT_PTR:
				enterOuterAlt(_localctx, 9);
				{
				setState(225);
				get_element_ptr();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 10);
				{
				setState(226);
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
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public TerminalNode EOF() { return getToken(langosIRParser.EOF, 0); }
		public Entry_pointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry_point; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterEntry_point(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitEntry_point(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitEntry_point(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entry_pointContext entry_point() throws RecognitionException {
		Entry_pointContext _localctx = new Entry_pointContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_entry_point);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << IMPORT) | (1L << GET_ELEMENT_PTR) | (1L << MAP) | (1L << MAPo) | (1L << PAIRMAP) | (1L << PAIRMAP_o) | (1L << PAIRMAPo_) | (1L << PAIRMAPoo) | (1L << POP) | (1L << PUSH) | (1L << MOV) | (1L << EQ) | (1L << NEQ) | (1L << JMP) | (1L << BREAK) | (1L << CONTINUE) | (1L << CALL) | (1L << RET) | (1L << INTOSCOPE) | (1L << OUTOFSCOPE) | (1L << ENTERSCOPE) | (1L << ID) | (1L << FUNCID))) != 0)) {
				{
				{
				setState(229);
				program();
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(235);
				match(EOF);
				}
				break;
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

	public static final String _serializedATN =
		"\u0004\u0001#\u00ef\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"J\b\u0003\n\u0003\f\u0003M\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0093\b\u0012\n"+
		"\u0012\f\u0012\u0096\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u009e\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00a5\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00aa\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u00ae\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00b6\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u00c0\b\u0019\n\u0019\f\u0019\u00c3\t\u0019\u0001\u0019"+
		"\u0005\u0019\u00c6\b\u0019\n\u0019\f\u0019\u00c9\t\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u00e4\b\u001c\u0001\u001d\u0005\u001d\u00e7\b\u001d\n\u001d\f\u001d"+
		"\u00ea\t\u001d\u0001\u001d\u0003\u001d\u00ed\b\u001d\u0001\u001d\u0000"+
		"\u0000\u001e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:\u0000\u0000\u00ee\u0000<\u0001"+
		"\u0000\u0000\u0000\u0002?\u0001\u0000\u0000\u0000\u0004B\u0001\u0000\u0000"+
		"\u0000\u0006E\u0001\u0000\u0000\u0000\bN\u0001\u0000\u0000\u0000\nS\u0001"+
		"\u0000\u0000\u0000\fX\u0001\u0000\u0000\u0000\u000e_\u0001\u0000\u0000"+
		"\u0000\u0010f\u0001\u0000\u0000\u0000\u0012m\u0001\u0000\u0000\u0000\u0014"+
		"t\u0001\u0000\u0000\u0000\u0016w\u0001\u0000\u0000\u0000\u0018z\u0001"+
		"\u0000\u0000\u0000\u001a}\u0001\u0000\u0000\u0000\u001c\u0080\u0001\u0000"+
		"\u0000\u0000\u001e\u0083\u0001\u0000\u0000\u0000 \u0086\u0001\u0000\u0000"+
		"\u0000\"\u0089\u0001\u0000\u0000\u0000$\u008e\u0001\u0000\u0000\u0000"+
		"&\u009d\u0001\u0000\u0000\u0000(\u00a4\u0001\u0000\u0000\u0000*\u00a9"+
		"\u0001\u0000\u0000\u0000,\u00ad\u0001\u0000\u0000\u0000.\u00b5\u0001\u0000"+
		"\u0000\u00000\u00b7\u0001\u0000\u0000\u00002\u00bc\u0001\u0000\u0000\u0000"+
		"4\u00cd\u0001\u0000\u0000\u00006\u00d4\u0001\u0000\u0000\u00008\u00e3"+
		"\u0001\u0000\u0000\u0000:\u00e8\u0001\u0000\u0000\u0000<=\u0005\u001a"+
		"\u0000\u0000=>\u0005\"\u0000\u0000>\u0001\u0001\u0000\u0000\u0000?@\u0005"+
		"\u0004\u0000\u0000@A\u0005\"\u0000\u0000A\u0003\u0001\u0000\u0000\u0000"+
		"BC\u0005\u0005\u0000\u0000CD\u0005\"\u0000\u0000D\u0005\u0001\u0000\u0000"+
		"\u0000EF\u0005\u0007\u0000\u0000FK\u0005\"\u0000\u0000GH\u0005\u0002\u0000"+
		"\u0000HJ\u0005\"\u0000\u0000IG\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\u0007\u0001"+
		"\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NO\u0005\t\u0000\u0000OP\u0005"+
		"\"\u0000\u0000PQ\u0005\u0003\u0000\u0000QR\u0005\"\u0000\u0000R\t\u0001"+
		"\u0000\u0000\u0000ST\u0005\n\u0000\u0000TU\u0005\"\u0000\u0000UV\u0005"+
		"\u0003\u0000\u0000VW\u0005\"\u0000\u0000W\u000b\u0001\u0000\u0000\u0000"+
		"XY\u0005\u000b\u0000\u0000YZ\u0005\"\u0000\u0000Z[\u0005\u0003\u0000\u0000"+
		"[\\\u0005\"\u0000\u0000\\]\u0005\u0003\u0000\u0000]^\u0005\"\u0000\u0000"+
		"^\r\u0001\u0000\u0000\u0000_`\u0005\f\u0000\u0000`a\u0005\"\u0000\u0000"+
		"ab\u0005\u0003\u0000\u0000bc\u0005\"\u0000\u0000cd\u0005\u0003\u0000\u0000"+
		"de\u0005\"\u0000\u0000e\u000f\u0001\u0000\u0000\u0000fg\u0005\r\u0000"+
		"\u0000gh\u0005\"\u0000\u0000hi\u0005\u0003\u0000\u0000ij\u0005\"\u0000"+
		"\u0000jk\u0005\u0003\u0000\u0000kl\u0005\"\u0000\u0000l\u0011\u0001\u0000"+
		"\u0000\u0000mn\u0005\u000e\u0000\u0000no\u0005\"\u0000\u0000op\u0005\u0003"+
		"\u0000\u0000pq\u0005\"\u0000\u0000qr\u0005\u0003\u0000\u0000rs\u0005\""+
		"\u0000\u0000s\u0013\u0001\u0000\u0000\u0000tu\u0005\u000f\u0000\u0000"+
		"uv\u0005\"\u0000\u0000v\u0015\u0001\u0000\u0000\u0000wx\u0005\u0010\u0000"+
		"\u0000xy\u0005\"\u0000\u0000y\u0017\u0001\u0000\u0000\u0000z{\u0005\u0014"+
		"\u0000\u0000{|\u0005\"\u0000\u0000|\u0019\u0001\u0000\u0000\u0000}~\u0005"+
		"\u0018\u0000\u0000~\u007f\u0005\"\u0000\u0000\u007f\u001b\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005\u0012\u0000\u0000\u0081\u0082\u0005\"\u0000"+
		"\u0000\u0082\u001d\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0013\u0000"+
		"\u0000\u0084\u0085\u0005\"\u0000\u0000\u0085\u001f\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0005\"\u0000\u0000\u0087\u0088\u0005\u0001\u0000\u0000\u0088"+
		"!\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0006\u0000\u0000\u008a\u008b"+
		"\u0005\"\u0000\u0000\u008b\u008c\u0005\u0003\u0000\u0000\u008c\u008d\u0005"+
		"\"\u0000\u0000\u008d#\u0001\u0000\u0000\u0000\u008e\u008f\u0003\u0002"+
		"\u0001\u0000\u008f\u0094\u0003\u0000\u0000\u0000\u0090\u0093\u0003\"\u0011"+
		"\u0000\u0091\u0093\u00038\u001c\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0005\u001b\u0000\u0000\u0098\u0099\u0003\u0004\u0002\u0000"+
		"\u0099%\u0001\u0000\u0000\u0000\u009a\u009e\u0003\u001c\u000e\u0000\u009b"+
		"\u009e\u0003\u0018\f\u0000\u009c\u009e\u0003\u001e\u000f\u0000\u009d\u009a"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009c"+
		"\u0001\u0000\u0000\u0000\u009e\'\u0001\u0000\u0000\u0000\u009f\u00a5\u0003"+
		"\u001a\r\u0000\u00a0\u00a5\u0005\u0019\u0000\u0000\u00a1\u00a5\u0005\u0016"+
		"\u0000\u0000\u00a2\u00a5\u0005\u0015\u0000\u0000\u00a3\u00a5\u0003&\u0013"+
		"\u0000\u00a4\u009f\u0001\u0000\u0000\u0000\u00a4\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5)\u0001\u0000\u0000\u0000"+
		"\u00a6\u00aa\u0005\u001c\u0000\u0000\u00a7\u00aa\u0003\u0000\u0000\u0000"+
		"\u00a8\u00aa\u0005\u001b\u0000\u0000\u00a9\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000"+
		"\u00aa+\u0001\u0000\u0000\u0000\u00ab\u00ae\u0003\u0016\u000b\u0000\u00ac"+
		"\u00ae\u0003\u0014\n\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ae-\u0001\u0000\u0000\u0000\u00af\u00b6\u0003"+
		"\b\u0004\u0000\u00b0\u00b6\u0003\n\u0005\u0000\u00b1\u00b6\u0003\f\u0006"+
		"\u0000\u00b2\u00b6\u0003\u000e\u0007\u0000\u00b3\u00b6\u0003\u0010\b\u0000"+
		"\u00b4\u00b6\u0003\u0012\t\u0000\u00b5\u00af\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b5\u00b1\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b6/\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0005\u001e\u0000\u0000\u00b8\u00b9\u0005\"\u0000\u0000\u00b9\u00ba\u0005"+
		"\u0003\u0000\u0000\u00ba\u00bb\u0005\"\u0000\u0000\u00bb1\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0005#\u0000\u0000\u00bd\u00c1\u0005\u001c\u0000"+
		"\u0000\u00be\u00c0\u00030\u0018\u0000\u00bf\u00be\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c6\u00038\u001c\u0000\u00c5"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0005\u0019\u0000\u0000\u00cb\u00cc\u0005\u001d\u0000\u0000\u00cc"+
		"3\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\b\u0000\u0000\u00ce\u00cf"+
		"\u0005\"\u0000\u0000\u00cf\u00d0\u0005\u0003\u0000\u0000\u00d0\u00d1\u0005"+
		"\"\u0000\u0000\u00d1\u00d2\u0005\u0003\u0000\u0000\u00d2\u00d3\u0005\""+
		"\u0000\u0000\u00d35\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u0011\u0000"+
		"\u0000\u00d5\u00d6\u0005\"\u0000\u0000\u00d6\u00d7\u0005\u0003\u0000\u0000"+
		"\u00d7\u00d8\u0005\"\u0000\u0000\u00d87\u0001\u0000\u0000\u0000\u00d9"+
		"\u00e4\u0003\u0006\u0003\u0000\u00da\u00e4\u0003$\u0012\u0000\u00db\u00e4"+
		"\u0003(\u0014\u0000\u00dc\u00e4\u00032\u0019\u0000\u00dd\u00e4\u0003*"+
		"\u0015\u0000\u00de\u00e4\u0003.\u0017\u0000\u00df\u00e4\u00036\u001b\u0000"+
		"\u00e0\u00e4\u0003,\u0016\u0000\u00e1\u00e4\u00034\u001a\u0000\u00e2\u00e4"+
		"\u0003 \u0010\u0000\u00e3\u00d9\u0001\u0000\u0000\u0000\u00e3\u00da\u0001"+
		"\u0000\u0000\u0000\u00e3\u00db\u0001\u0000\u0000\u0000\u00e3\u00dc\u0001"+
		"\u0000\u0000\u0000\u00e3\u00dd\u0001\u0000\u0000\u0000\u00e3\u00de\u0001"+
		"\u0000\u0000\u0000\u00e3\u00df\u0001\u0000\u0000\u0000\u00e3\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e49\u0001\u0000\u0000\u0000\u00e5\u00e7\u00038\u001c"+
		"\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ed\u0005\u0000\u0000\u0001\u00ec\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed;\u0001\u0000\u0000\u0000"+
		"\rK\u0092\u0094\u009d\u00a4\u00a9\u00ad\u00b5\u00c1\u00c7\u00e3\u00e8"+
		"\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}