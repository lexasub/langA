// Generated from /home/support-pc/Рабочий стол/техподдержка/отчеты/Копытцев А А/others/inteljidea/langA_/src/main/java/org/lexasub/langosThirdTryWithoutPromise/langosIR.g4 by ANTLR 4.10.1
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
		POP=15, PUSH=16, EQ=17, NEQ=18, JMP=19, BREAK=20, CONTINUE=21, FUNC=22, 
		CALL=23, RET=24, INTOSCOPE=25, OUTOFSCOPE=26, ENTERSCOPE=27, EXITSCOPE=28, 
		WS=29, TAB=30, UNTAB=31, ID=32;
	public static final int
		RULE_intoscope = 0, RULE_class = 1, RULE_endclass = 2, RULE_import_ = 3, 
		RULE_map = 4, RULE_mapo = 5, RULE_pairmap = 6, RULE_pairmap_o = 7, RULE_pairmapo_ = 8, 
		RULE_pairmapoo = 9, RULE_pop = 10, RULE_push = 11, RULE_jmp = 12, RULE_call = 13, 
		RULE_eq = 14, RULE_neq = 15, RULE_lbl = 16, RULE_member_declare = 17, 
		RULE_class_full = 18, RULE_jmps = 19, RULE_flow_control = 20, RULE_scope_control = 21, 
		RULE_stack_cmds = 22, RULE_map_control = 23, RULE_func = 24, RULE_get_element_ptr = 25, 
		RULE_program = 26, RULE_entry_point = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"intoscope", "class", "endclass", "import_", "map", "mapo", "pairmap", 
			"pairmap_o", "pairmapo_", "pairmapoo", "pop", "push", "jmp", "call", 
			"eq", "neq", "lbl", "member_declare", "class_full", "jmps", "flow_control", 
			"scope_control", "stack_cmds", "map_control", "func", "get_element_ptr", 
			"program", "entry_point"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'/'", "','", "'CLASS'", "'ENDCLASS'", "'MEMBER'", "'IMPORT'", 
			"'GET_ELEMENT_PTR'", "'MAP'", "'MAPo'", "'PAIRMAP'", "'PAIRMAP_o'", "'PAIRMAPo_'", 
			"'PAIRMAPoo'", "'POP'", "'PUSH'", "'EQ'", "'NEQ'", "'JMP'", "'BREAK'", 
			"'CONTINUE'", "'FUNCTION_'", "'CALL'", "'RET'", "'INTOSCOPE'", "'OUTOFSCOPE'", 
			"'ENTERSCOPE'", "'EXITSCOPE'", null, "'TAB'", "'UNTAB'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COLON", "SLASH", "COMA", "CLASS", "ENDCLASS", "MEMBER", "IMPORT", 
			"GET_ELEMENT_PTR", "MAP", "MAPo", "PAIRMAP", "PAIRMAP_o", "PAIRMAPo_", 
			"PAIRMAPoo", "POP", "PUSH", "EQ", "NEQ", "JMP", "BREAK", "CONTINUE", 
			"FUNC", "CALL", "RET", "INTOSCOPE", "OUTOFSCOPE", "ENTERSCOPE", "EXITSCOPE", 
			"WS", "TAB", "UNTAB", "ID"
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
			setState(56);
			match(INTOSCOPE);
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
			setState(59);
			match(CLASS);
			setState(60);
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
			setState(62);
			match(ENDCLASS);
			setState(63);
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
			setState(65);
			match(IMPORT);
			setState(66);
			match(ID);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH) {
				{
				{
				setState(67);
				match(SLASH);
				setState(68);
				match(ID);
				}
				}
				setState(73);
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
			setState(74);
			match(MAP);
			setState(75);
			match(ID);
			setState(76);
			match(COMA);
			setState(77);
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
			setState(79);
			match(MAPo);
			setState(80);
			match(ID);
			setState(81);
			match(COMA);
			setState(82);
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
			setState(84);
			match(PAIRMAP);
			setState(85);
			match(ID);
			setState(86);
			match(COMA);
			setState(87);
			match(ID);
			setState(88);
			match(COMA);
			setState(89);
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
			setState(91);
			match(PAIRMAP_o);
			setState(92);
			match(ID);
			setState(93);
			match(COMA);
			setState(94);
			match(ID);
			setState(95);
			match(COMA);
			setState(96);
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
			setState(98);
			match(PAIRMAPo_);
			setState(99);
			match(ID);
			setState(100);
			match(COMA);
			setState(101);
			match(ID);
			setState(102);
			match(COMA);
			setState(103);
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
			setState(105);
			match(PAIRMAPoo);
			setState(106);
			match(ID);
			setState(107);
			match(COMA);
			setState(108);
			match(ID);
			setState(109);
			match(COMA);
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
			setState(112);
			match(POP);
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
			setState(115);
			match(PUSH);
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
			setState(118);
			match(JMP);
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
			setState(121);
			match(CALL);
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
			setState(124);
			match(EQ);
			setState(125);
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
			setState(127);
			match(NEQ);
			setState(128);
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
			setState(130);
			match(ID);
			setState(131);
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
			setState(133);
			match(MEMBER);
			setState(134);
			match(ID);
			setState(135);
			match(COMA);
			setState(136);
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
			setState(138);
			class_();
			setState(139);
			intoscope();
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(142);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MEMBER:
						{
						setState(140);
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
					case EQ:
					case NEQ:
					case JMP:
					case BREAK:
					case CONTINUE:
					case FUNC:
					case CALL:
					case RET:
					case INTOSCOPE:
					case OUTOFSCOPE:
					case ENTERSCOPE:
					case EXITSCOPE:
					case ID:
						{
						setState(141);
						program();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(147);
			match(OUTOFSCOPE);
			setState(148);
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
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				eq();
				}
				break;
			case JMP:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				jmp();
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
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
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				call();
				}
				break;
			case RET:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(RET);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(CONTINUE);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(BREAK);
				}
				break;
			case EQ:
			case NEQ:
			case JMP:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
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
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTOSCOPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				intoscope();
				}
				break;
			case OUTOFSCOPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(OUTOFSCOPE);
				}
				break;
			case ENTERSCOPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(ENTERSCOPE);
				}
				break;
			case EXITSCOPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
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
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUSH:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				push();
				}
				break;
			case POP:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
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
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				map();
				}
				break;
			case MAPo:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				mapo();
				}
				break;
			case PAIRMAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				pairmap();
				}
				break;
			case PAIRMAP_o:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				pairmap_o();
				}
				break;
			case PAIRMAPo_:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				pairmapo_();
				}
				break;
			case PAIRMAPoo:
				enterOuterAlt(_localctx, 6);
				{
				setState(177);
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

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(langosIRParser.FUNC, 0); }
		public LblContext lbl() {
			return getRuleContext(LblContext.class,0);
		}
		public TerminalNode ENTERSCOPE() { return getToken(langosIRParser.ENTERSCOPE, 0); }
		public TerminalNode RET() { return getToken(langosIRParser.RET, 0); }
		public TerminalNode EXITSCOPE() { return getToken(langosIRParser.EXITSCOPE, 0); }
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
		enterRule(_localctx, 48, RULE_func);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(FUNC);
			setState(181);
			lbl();
			setState(182);
			match(ENTERSCOPE);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					program();
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(189);
			match(RET);
			setState(190);
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
		enterRule(_localctx, 50, RULE_get_element_ptr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(GET_ELEMENT_PTR);
			setState(193);
			match(ID);
			setState(194);
			match(COMA);
			setState(195);
			match(ID);
			setState(196);
			match(COMA);
			setState(197);
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
		public LblContext lbl() {
			return getRuleContext(LblContext.class,0);
		}
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
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public Get_element_ptrContext get_element_ptr() {
			return getRuleContext(Get_element_ptrContext.class,0);
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
		enterRule(_localctx, 52, RULE_program);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				lbl();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				import_();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
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
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				flow_control();
				}
				break;
			case INTOSCOPE:
			case OUTOFSCOPE:
			case ENTERSCOPE:
			case EXITSCOPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
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
				setState(204);
				map_control();
				}
				break;
			case POP:
			case PUSH:
				enterOuterAlt(_localctx, 7);
				{
				setState(205);
				stack_cmds();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 8);
				{
				setState(206);
				func();
				}
				break;
			case GET_ELEMENT_PTR:
				enterOuterAlt(_localctx, 9);
				{
				setState(207);
				get_element_ptr();
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
		enterRule(_localctx, 54, RULE_entry_point);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << IMPORT) | (1L << GET_ELEMENT_PTR) | (1L << MAP) | (1L << MAPo) | (1L << PAIRMAP) | (1L << PAIRMAP_o) | (1L << PAIRMAPo_) | (1L << PAIRMAPoo) | (1L << POP) | (1L << PUSH) | (1L << EQ) | (1L << NEQ) | (1L << JMP) | (1L << BREAK) | (1L << CONTINUE) | (1L << FUNC) | (1L << CALL) | (1L << RET) | (1L << INTOSCOPE) | (1L << OUTOFSCOPE) | (1L << ENTERSCOPE) | (1L << EXITSCOPE) | (1L << ID))) != 0)) {
				{
				{
				setState(210);
				program();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(216);
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
		"\u0004\u0001 \u00dc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003F\b\u0003\n\u0003\f\u0003I\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u008f\b\u0012\n\u0012\f\u0012\u0092\t\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u009a\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00a1"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00a7"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u00ab\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u00b3\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u00b9\b\u0018\n\u0018\f\u0018\u00bc\t\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u00d1"+
		"\b\u001a\u0001\u001b\u0005\u001b\u00d4\b\u001b\n\u001b\f\u001b\u00d7\t"+
		"\u001b\u0001\u001b\u0003\u001b\u00da\b\u001b\u0001\u001b\u0000\u0000\u001c"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.0246\u0000\u0000\u00dc\u00008\u0001\u0000\u0000\u0000"+
		"\u0002;\u0001\u0000\u0000\u0000\u0004>\u0001\u0000\u0000\u0000\u0006A"+
		"\u0001\u0000\u0000\u0000\bJ\u0001\u0000\u0000\u0000\nO\u0001\u0000\u0000"+
		"\u0000\fT\u0001\u0000\u0000\u0000\u000e[\u0001\u0000\u0000\u0000\u0010"+
		"b\u0001\u0000\u0000\u0000\u0012i\u0001\u0000\u0000\u0000\u0014p\u0001"+
		"\u0000\u0000\u0000\u0016s\u0001\u0000\u0000\u0000\u0018v\u0001\u0000\u0000"+
		"\u0000\u001ay\u0001\u0000\u0000\u0000\u001c|\u0001\u0000\u0000\u0000\u001e"+
		"\u007f\u0001\u0000\u0000\u0000 \u0082\u0001\u0000\u0000\u0000\"\u0085"+
		"\u0001\u0000\u0000\u0000$\u008a\u0001\u0000\u0000\u0000&\u0099\u0001\u0000"+
		"\u0000\u0000(\u00a0\u0001\u0000\u0000\u0000*\u00a6\u0001\u0000\u0000\u0000"+
		",\u00aa\u0001\u0000\u0000\u0000.\u00b2\u0001\u0000\u0000\u00000\u00b4"+
		"\u0001\u0000\u0000\u00002\u00c0\u0001\u0000\u0000\u00004\u00d0\u0001\u0000"+
		"\u0000\u00006\u00d5\u0001\u0000\u0000\u000089\u0005\u0019\u0000\u0000"+
		"9:\u0005 \u0000\u0000:\u0001\u0001\u0000\u0000\u0000;<\u0005\u0004\u0000"+
		"\u0000<=\u0005 \u0000\u0000=\u0003\u0001\u0000\u0000\u0000>?\u0005\u0005"+
		"\u0000\u0000?@\u0005 \u0000\u0000@\u0005\u0001\u0000\u0000\u0000AB\u0005"+
		"\u0007\u0000\u0000BG\u0005 \u0000\u0000CD\u0005\u0002\u0000\u0000DF\u0005"+
		" \u0000\u0000EC\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000H\u0007\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000JK\u0005\t\u0000\u0000KL\u0005 \u0000"+
		"\u0000LM\u0005\u0003\u0000\u0000MN\u0005 \u0000\u0000N\t\u0001\u0000\u0000"+
		"\u0000OP\u0005\n\u0000\u0000PQ\u0005 \u0000\u0000QR\u0005\u0003\u0000"+
		"\u0000RS\u0005 \u0000\u0000S\u000b\u0001\u0000\u0000\u0000TU\u0005\u000b"+
		"\u0000\u0000UV\u0005 \u0000\u0000VW\u0005\u0003\u0000\u0000WX\u0005 \u0000"+
		"\u0000XY\u0005\u0003\u0000\u0000YZ\u0005 \u0000\u0000Z\r\u0001\u0000\u0000"+
		"\u0000[\\\u0005\f\u0000\u0000\\]\u0005 \u0000\u0000]^\u0005\u0003\u0000"+
		"\u0000^_\u0005 \u0000\u0000_`\u0005\u0003\u0000\u0000`a\u0005 \u0000\u0000"+
		"a\u000f\u0001\u0000\u0000\u0000bc\u0005\r\u0000\u0000cd\u0005 \u0000\u0000"+
		"de\u0005\u0003\u0000\u0000ef\u0005 \u0000\u0000fg\u0005\u0003\u0000\u0000"+
		"gh\u0005 \u0000\u0000h\u0011\u0001\u0000\u0000\u0000ij\u0005\u000e\u0000"+
		"\u0000jk\u0005 \u0000\u0000kl\u0005\u0003\u0000\u0000lm\u0005 \u0000\u0000"+
		"mn\u0005\u0003\u0000\u0000no\u0005 \u0000\u0000o\u0013\u0001\u0000\u0000"+
		"\u0000pq\u0005\u000f\u0000\u0000qr\u0005 \u0000\u0000r\u0015\u0001\u0000"+
		"\u0000\u0000st\u0005\u0010\u0000\u0000tu\u0005 \u0000\u0000u\u0017\u0001"+
		"\u0000\u0000\u0000vw\u0005\u0013\u0000\u0000wx\u0005 \u0000\u0000x\u0019"+
		"\u0001\u0000\u0000\u0000yz\u0005\u0017\u0000\u0000z{\u0005 \u0000\u0000"+
		"{\u001b\u0001\u0000\u0000\u0000|}\u0005\u0011\u0000\u0000}~\u0005 \u0000"+
		"\u0000~\u001d\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0012\u0000\u0000"+
		"\u0080\u0081\u0005 \u0000\u0000\u0081\u001f\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0005 \u0000\u0000\u0083\u0084\u0005\u0001\u0000\u0000\u0084!\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005\u0006\u0000\u0000\u0086\u0087\u0005"+
		" \u0000\u0000\u0087\u0088\u0005\u0003\u0000\u0000\u0088\u0089\u0005 \u0000"+
		"\u0000\u0089#\u0001\u0000\u0000\u0000\u008a\u008b\u0003\u0002\u0001\u0000"+
		"\u008b\u0090\u0003\u0000\u0000\u0000\u008c\u008f\u0003\"\u0011\u0000\u008d"+
		"\u008f\u00034\u001a\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093"+
		"\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0005\u001a\u0000\u0000\u0094\u0095\u0003\u0004\u0002\u0000\u0095%\u0001"+
		"\u0000\u0000\u0000\u0096\u009a\u0003\u001c\u000e\u0000\u0097\u009a\u0003"+
		"\u0018\f\u0000\u0098\u009a\u0003\u001e\u000f\u0000\u0099\u0096\u0001\u0000"+
		"\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u0098\u0001\u0000"+
		"\u0000\u0000\u009a\'\u0001\u0000\u0000\u0000\u009b\u00a1\u0003\u001a\r"+
		"\u0000\u009c\u00a1\u0005\u0018\u0000\u0000\u009d\u00a1\u0005\u0015\u0000"+
		"\u0000\u009e\u00a1\u0005\u0014\u0000\u0000\u009f\u00a1\u0003&\u0013\u0000"+
		"\u00a0\u009b\u0001\u0000\u0000\u0000\u00a0\u009c\u0001\u0000\u0000\u0000"+
		"\u00a0\u009d\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1)\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a7\u0003\u0000\u0000\u0000\u00a3\u00a7\u0005\u001a\u0000\u0000\u00a4"+
		"\u00a7\u0005\u001b\u0000\u0000\u00a5\u00a7\u0005\u001c\u0000\u0000\u00a6"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a6\u00a3\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7"+
		"+\u0001\u0000\u0000\u0000\u00a8\u00ab\u0003\u0016\u000b\u0000\u00a9\u00ab"+
		"\u0003\u0014\n\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ab-\u0001\u0000\u0000\u0000\u00ac\u00b3\u0003\b"+
		"\u0004\u0000\u00ad\u00b3\u0003\n\u0005\u0000\u00ae\u00b3\u0003\f\u0006"+
		"\u0000\u00af\u00b3\u0003\u000e\u0007\u0000\u00b0\u00b3\u0003\u0010\b\u0000"+
		"\u00b1\u00b3\u0003\u0012\t\u0000\u00b2\u00ac\u0001\u0000\u0000\u0000\u00b2"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b2\u00ae\u0001\u0000\u0000\u0000\u00b2"+
		"\u00af\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b3/\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0005\u0016\u0000\u0000\u00b5\u00b6\u0003 \u0010\u0000\u00b6\u00ba\u0005"+
		"\u001b\u0000\u0000\u00b7\u00b9\u00034\u001a\u0000\u00b8\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u0018"+
		"\u0000\u0000\u00be\u00bf\u0005\u001c\u0000\u0000\u00bf1\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0005\b\u0000\u0000\u00c1\u00c2\u0005 \u0000\u0000"+
		"\u00c2\u00c3\u0005\u0003\u0000\u0000\u00c3\u00c4\u0005 \u0000\u0000\u00c4"+
		"\u00c5\u0005\u0003\u0000\u0000\u00c5\u00c6\u0005 \u0000\u0000\u00c63\u0001"+
		"\u0000\u0000\u0000\u00c7\u00d1\u0003 \u0010\u0000\u00c8\u00d1\u0003\u0006"+
		"\u0003\u0000\u00c9\u00d1\u0003$\u0012\u0000\u00ca\u00d1\u0003(\u0014\u0000"+
		"\u00cb\u00d1\u0003*\u0015\u0000\u00cc\u00d1\u0003.\u0017\u0000\u00cd\u00d1"+
		"\u0003,\u0016\u0000\u00ce\u00d1\u00030\u0018\u0000\u00cf\u00d1\u00032"+
		"\u0019\u0000\u00d0\u00c7\u0001\u0000\u0000\u0000\u00d0\u00c8\u0001\u0000"+
		"\u0000\u0000\u00d0\u00c9\u0001\u0000\u0000\u0000\u00d0\u00ca\u0001\u0000"+
		"\u0000\u0000\u00d0\u00cb\u0001\u0000\u0000\u0000\u00d0\u00cc\u0001\u0000"+
		"\u0000\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d15\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d4\u00034\u001a\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00da\u0005\u0000\u0000\u0001"+
		"\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000"+
		"\u00da7\u0001\u0000\u0000\u0000\fG\u008e\u0090\u0099\u00a0\u00a6\u00aa"+
		"\u00b2\u00ba\u00d0\u00d5\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}