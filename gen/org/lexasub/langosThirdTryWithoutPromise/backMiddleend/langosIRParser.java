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
		ARROW=1, COLON=2, SLASH=3, COMA=4, LPAREN=5, RPAREN=6, SHARP=7, CLASS=8, 
		ENDCLASS=9, MEMBER=10, IMPORT=11, GET_ELEMENT_PTR=12, MAP=13, MAPo=14, 
		PAIRMAP=15, PAIRMAP_o=16, PAIRMAPo_=17, PAIRMAPoo=18, POP=19, PUSH=20, 
		MOV=21, EQCALL_THEN_JMP=22, NEQCALL_THEN_JMP_EXTENDED=23, EQ=24, JMP=25, 
		BREAK=26, CONTINUE=27, FUNC=28, CALL=29, RET=30, ENTERSCOPE=31, EXITSCOPE=32, 
		FUNCTION_ARGUMENT=33, WS=34, TAB=35, UNTAB=36, ID=37, FUNCID=38;
	public static final int
		RULE_id = 0, RULE_class = 1, RULE_endclass = 2, RULE_import_ = 3, RULE_map = 4, 
		RULE_mapo = 5, RULE_pairmap = 6, RULE_pairmap_o = 7, RULE_pairmapo_ = 8, 
		RULE_pairmapoo = 9, RULE_pop = 10, RULE_push = 11, RULE_jmp = 12, RULE_call = 13, 
		RULE_eq = 14, RULE_eQCALL_THEN_JMP = 15, RULE_nEQCALL_THEN_JMP_EXTENDED = 16, 
		RULE_id_list = 17, RULE_func_lbl = 18, RULE_lbl = 19, RULE_member_declare = 20, 
		RULE_class_full = 21, RULE_jmps = 22, RULE_flow_control = 23, RULE_scope_control = 24, 
		RULE_map_control = 25, RULE_function_argument = 26, RULE_func = 27, RULE_get_element_ptr = 28, 
		RULE_mov = 29, RULE_program = 30, RULE_entry_point = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"id", "class", "endclass", "import_", "map", "mapo", "pairmap", "pairmap_o", 
			"pairmapo_", "pairmapoo", "pop", "push", "jmp", "call", "eq", "eQCALL_THEN_JMP", 
			"nEQCALL_THEN_JMP_EXTENDED", "id_list", "func_lbl", "lbl", "member_declare", 
			"class_full", "jmps", "flow_control", "scope_control", "map_control", 
			"function_argument", "func", "get_element_ptr", "mov", "program", "entry_point"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "':'", "'/'", "','", "')'", "'('", "'#'", "'CLASS'", "'ENDCLASS'", 
			"'MEMBER'", "'IMPORT'", "'GET_ELEMENT_PTR'", "'MAP'", "'MAPo'", "'PAIRMAP'", 
			"'PAIRMAP_o'", "'PAIRMAPo_'", "'PAIRMAPoo'", "'POP'", "'PUSH'", "'MOV'", 
			"'EQCALL_THEN_JMP'", "'NEQCALL_THEN_JMP_EXTENDED'", "'EQ'", "'JMP'", 
			"'BREAK'", "'CONTINUE'", "'FUNCTION_'", "'CALL'", "'RET'", "'ENTERSCOPE'", 
			"'EXITSCOPE'", "'FUNCTION_ARGUMENT'", null, "'TAB'", "'UNTAB'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ARROW", "COLON", "SLASH", "COMA", "LPAREN", "RPAREN", "SHARP", 
			"CLASS", "ENDCLASS", "MEMBER", "IMPORT", "GET_ELEMENT_PTR", "MAP", "MAPo", 
			"PAIRMAP", "PAIRMAP_o", "PAIRMAPo_", "PAIRMAPoo", "POP", "PUSH", "MOV", 
			"EQCALL_THEN_JMP", "NEQCALL_THEN_JMP_EXTENDED", "EQ", "JMP", "BREAK", 
			"CONTINUE", "FUNC", "CALL", "RET", "ENTERSCOPE", "EXITSCOPE", "FUNCTION_ARGUMENT", 
			"WS", "TAB", "UNTAB", "ID", "FUNCID"
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(langosIRParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
			setState(66);
			match(CLASS);
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
			setState(69);
			match(ENDCLASS);
			setState(70);
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
			setState(72);
			match(IMPORT);
			setState(73);
			match(ID);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH) {
				{
				{
				setState(74);
				match(SLASH);
				setState(75);
				match(ID);
				}
				}
				setState(80);
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
			setState(81);
			match(MAP);
			setState(82);
			match(ID);
			setState(83);
			match(COMA);
			setState(84);
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
			setState(86);
			match(MAPo);
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
			setState(91);
			match(PAIRMAP);
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
			setState(98);
			match(PAIRMAP_o);
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
			setState(105);
			match(PAIRMAPo_);
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
			setState(112);
			match(PAIRMAPoo);
			setState(113);
			match(ID);
			setState(114);
			match(COMA);
			setState(115);
			match(ID);
			setState(116);
			match(COMA);
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
			setState(119);
			match(POP);
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
			setState(122);
			match(PUSH);
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
			setState(125);
			match(JMP);
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(langosIRParser.CALL, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(langosIRParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(langosIRParser.LPAREN, 0); }
		public List<TerminalNode> ID() { return getTokens(langosIRParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langosIRParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(langosIRParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(langosIRParser.COMA, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(CALL);
			setState(129);
			id();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(130);
				match(RPAREN);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(131);
					match(ID);
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(132);
						match(COMA);
						setState(133);
						match(ID);
						}
						}
						setState(138);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(141);
				match(LPAREN);
				}
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

	public static class EqContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(langosIRParser.EQ, 0); }
		public List<TerminalNode> ID() { return getTokens(langosIRParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langosIRParser.ID, i);
		}
		public TerminalNode COMA() { return getToken(langosIRParser.COMA, 0); }
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
			setState(144);
			match(EQ);
			setState(145);
			match(ID);
			setState(146);
			match(COMA);
			setState(147);
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

	public static class EQCALL_THEN_JMPContext extends ParserRuleContext {
		public TerminalNode EQCALL_THEN_JMP() { return getToken(langosIRParser.EQCALL_THEN_JMP, 0); }
		public List<TerminalNode> ID() { return getTokens(langosIRParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langosIRParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(langosIRParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(langosIRParser.COMA, i);
		}
		public EQCALL_THEN_JMPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eQCALL_THEN_JMP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterEQCALL_THEN_JMP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitEQCALL_THEN_JMP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitEQCALL_THEN_JMP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EQCALL_THEN_JMPContext eQCALL_THEN_JMP() throws RecognitionException {
		EQCALL_THEN_JMPContext _localctx = new EQCALL_THEN_JMPContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_eQCALL_THEN_JMP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(EQCALL_THEN_JMP);
			setState(150);
			match(ID);
			setState(151);
			match(COMA);
			setState(152);
			match(ID);
			setState(153);
			match(COMA);
			setState(154);
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

	public static class NEQCALL_THEN_JMP_EXTENDEDContext extends ParserRuleContext {
		public TerminalNode NEQCALL_THEN_JMP_EXTENDED() { return getToken(langosIRParser.NEQCALL_THEN_JMP_EXTENDED, 0); }
		public List<TerminalNode> ID() { return getTokens(langosIRParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langosIRParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(langosIRParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(langosIRParser.COMA, i);
		}
		public NEQCALL_THEN_JMP_EXTENDEDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nEQCALL_THEN_JMP_EXTENDED; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterNEQCALL_THEN_JMP_EXTENDED(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitNEQCALL_THEN_JMP_EXTENDED(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitNEQCALL_THEN_JMP_EXTENDED(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NEQCALL_THEN_JMP_EXTENDEDContext nEQCALL_THEN_JMP_EXTENDED() throws RecognitionException {
		NEQCALL_THEN_JMP_EXTENDEDContext _localctx = new NEQCALL_THEN_JMP_EXTENDEDContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nEQCALL_THEN_JMP_EXTENDED);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(NEQCALL_THEN_JMP_EXTENDED);
			setState(157);
			match(ID);
			setState(158);
			match(COMA);
			setState(159);
			match(ID);
			setState(160);
			match(COMA);
			setState(161);
			match(ID);
			setState(162);
			match(COMA);
			setState(163);
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

	public static class Id_listContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(langosIRParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langosIRParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(langosIRParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(langosIRParser.COMA, i);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitId_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitId_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(165);
				match(ID);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(166);
					match(COMA);
					setState(167);
					match(ID);
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Func_lblContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(langosIRParser.RPAREN, 0); }
		public List<Id_listContext> id_list() {
			return getRuleContexts(Id_listContext.class);
		}
		public Id_listContext id_list(int i) {
			return getRuleContext(Id_listContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(langosIRParser.LPAREN, 0); }
		public TerminalNode COLON() { return getToken(langosIRParser.COLON, 0); }
		public TerminalNode SHARP() { return getToken(langosIRParser.SHARP, 0); }
		public TerminalNode ARROW() { return getToken(langosIRParser.ARROW, 0); }
		public Func_lblContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_lbl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterFunc_lbl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitFunc_lbl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitFunc_lbl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_lblContext func_lbl() throws RecognitionException {
		Func_lblContext _localctx = new Func_lblContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_func_lbl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			id();
			setState(176);
			match(RPAREN);
			setState(177);
			id_list();
			setState(178);
			match(LPAREN);
			setState(179);
			match(COLON);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SHARP) {
				{
				setState(180);
				match(SHARP);
				}
			}

			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(183);
				id_list();
				}
				break;
			}
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(186);
				match(ARROW);
				}
			}

			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(189);
				id_list();
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
		enterRule(_localctx, 38, RULE_lbl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(ID);
			setState(193);
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
		enterRule(_localctx, 40, RULE_member_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(MEMBER);
			setState(196);
			match(ID);
			setState(197);
			match(COMA);
			setState(198);
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
		public TerminalNode ENTERSCOPE() { return getToken(langosIRParser.ENTERSCOPE, 0); }
		public TerminalNode EXITSCOPE() { return getToken(langosIRParser.EXITSCOPE, 0); }
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
		enterRule(_localctx, 42, RULE_class_full);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			class_();
			setState(201);
			match(ENTERSCOPE);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << MEMBER) | (1L << IMPORT) | (1L << GET_ELEMENT_PTR) | (1L << MAP) | (1L << MAPo) | (1L << PAIRMAP) | (1L << PAIRMAP_o) | (1L << PAIRMAPo_) | (1L << PAIRMAPoo) | (1L << MOV) | (1L << EQCALL_THEN_JMP) | (1L << NEQCALL_THEN_JMP_EXTENDED) | (1L << EQ) | (1L << JMP) | (1L << BREAK) | (1L << CONTINUE) | (1L << CALL) | (1L << RET) | (1L << ENTERSCOPE) | (1L << ID))) != 0)) {
				{
				setState(204);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MEMBER:
					{
					setState(202);
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
				case MOV:
				case EQCALL_THEN_JMP:
				case NEQCALL_THEN_JMP_EXTENDED:
				case EQ:
				case JMP:
				case BREAK:
				case CONTINUE:
				case CALL:
				case RET:
				case ENTERSCOPE:
				case ID:
					{
					setState(203);
					program();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			match(EXITSCOPE);
			setState(210);
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
		public NEQCALL_THEN_JMP_EXTENDEDContext nEQCALL_THEN_JMP_EXTENDED() {
			return getRuleContext(NEQCALL_THEN_JMP_EXTENDEDContext.class,0);
		}
		public EQCALL_THEN_JMPContext eQCALL_THEN_JMP() {
			return getRuleContext(EQCALL_THEN_JMPContext.class,0);
		}
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
		}
		public JmpContext jmp() {
			return getRuleContext(JmpContext.class,0);
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
		enterRule(_localctx, 44, RULE_jmps);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEQCALL_THEN_JMP_EXTENDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				nEQCALL_THEN_JMP_EXTENDED();
				}
				break;
			case EQCALL_THEN_JMP:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				eQCALL_THEN_JMP();
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				eq();
				}
				break;
			case JMP:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				jmp();
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
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
		enterRule(_localctx, 46, RULE_flow_control);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				call();
				}
				break;
			case RET:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(RET);
				setState(221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(220);
					id();
					}
					break;
				}
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(CONTINUE);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				match(BREAK);
				}
				break;
			case EQCALL_THEN_JMP:
			case NEQCALL_THEN_JMP_EXTENDED:
			case EQ:
			case JMP:
				enterOuterAlt(_localctx, 5);
				{
				setState(225);
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
		enterRule(_localctx, 48, RULE_scope_control);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(ENTERSCOPE);
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
		enterRule(_localctx, 50, RULE_map_control);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				map();
				}
				break;
			case MAPo:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				mapo();
				}
				break;
			case PAIRMAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				pairmap();
				}
				break;
			case PAIRMAP_o:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				pairmap_o();
				}
				break;
			case PAIRMAPo_:
				enterOuterAlt(_localctx, 5);
				{
				setState(234);
				pairmapo_();
				}
				break;
			case PAIRMAPoo:
				enterOuterAlt(_localctx, 6);
				{
				setState(235);
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
		enterRule(_localctx, 52, RULE_function_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(FUNCTION_ARGUMENT);
			setState(239);
			match(ID);
			setState(240);
			match(COMA);
			setState(241);
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
		public Func_lblContext func_lbl() {
			return getRuleContext(Func_lblContext.class,0);
		}
		public TerminalNode ENTERSCOPE() { return getToken(langosIRParser.ENTERSCOPE, 0); }
		public TerminalNode RET() { return getToken(langosIRParser.RET, 0); }
		public TerminalNode EXITSCOPE() { return getToken(langosIRParser.EXITSCOPE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
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
		enterRule(_localctx, 54, RULE_func);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			func_lbl();
			setState(244);
			match(ENTERSCOPE);
			{
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(245);
					program();
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
			setState(251);
			match(RET);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(252);
				id();
				}
			}

			setState(255);
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
		enterRule(_localctx, 56, RULE_get_element_ptr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(GET_ELEMENT_PTR);
			setState(258);
			match(ID);
			setState(259);
			match(COMA);
			setState(260);
			match(ID);
			setState(261);
			match(COMA);
			setState(262);
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
		enterRule(_localctx, 58, RULE_mov);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(MOV);
			setState(265);
			match(ID);
			setState(266);
			match(COMA);
			setState(267);
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
		enterRule(_localctx, 60, RULE_program);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				import_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				class_full();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				flow_control();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(273);
				scope_control();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(274);
				map_control();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(275);
				mov();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(276);
				get_element_ptr();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(277);
				lbl();
				}
				break;
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
		enterRule(_localctx, 62, RULE_entry_point);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << IMPORT) | (1L << GET_ELEMENT_PTR) | (1L << MAP) | (1L << MAPo) | (1L << PAIRMAP) | (1L << PAIRMAP_o) | (1L << PAIRMAPo_) | (1L << PAIRMAPoo) | (1L << MOV) | (1L << EQCALL_THEN_JMP) | (1L << NEQCALL_THEN_JMP_EXTENDED) | (1L << EQ) | (1L << JMP) | (1L << BREAK) | (1L << CONTINUE) | (1L << CALL) | (1L << RET) | (1L << ENTERSCOPE) | (1L << ID))) != 0)) {
				{
				{
				setState(280);
				program();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(286);
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
		"\u0004\u0001&\u0122\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003M\b\u0003\n\u0003\f\u0003P\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0087\b\r\n\r\f\r\u008a\t\r\u0003"+
		"\r\u008c\b\r\u0001\r\u0003\r\u008f\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00a9\b\u0011\n\u0011"+
		"\f\u0011\u00ac\t\u0011\u0003\u0011\u00ae\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00b6\b\u0012"+
		"\u0001\u0012\u0003\u0012\u00b9\b\u0012\u0001\u0012\u0003\u0012\u00bc\b"+
		"\u0012\u0001\u0012\u0003\u0012\u00bf\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00cd\b\u0015\n"+
		"\u0015\f\u0015\u00d0\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00d9\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00de\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u00e3\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u00ed\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u00f7\b\u001b\n"+
		"\u001b\f\u001b\u00fa\t\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u00fe"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u0117\b\u001e\u0001\u001f\u0005\u001f\u011a\b\u001f\n\u001f\f\u001f"+
		"\u011d\t\u001f\u0001\u001f\u0003\u001f\u0120\b\u001f\u0001\u001f\u0000"+
		"\u0000 \u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>\u0000\u0000\u0126\u0000@\u0001\u0000"+
		"\u0000\u0000\u0002B\u0001\u0000\u0000\u0000\u0004E\u0001\u0000\u0000\u0000"+
		"\u0006H\u0001\u0000\u0000\u0000\bQ\u0001\u0000\u0000\u0000\nV\u0001\u0000"+
		"\u0000\u0000\f[\u0001\u0000\u0000\u0000\u000eb\u0001\u0000\u0000\u0000"+
		"\u0010i\u0001\u0000\u0000\u0000\u0012p\u0001\u0000\u0000\u0000\u0014w"+
		"\u0001\u0000\u0000\u0000\u0016z\u0001\u0000\u0000\u0000\u0018}\u0001\u0000"+
		"\u0000\u0000\u001a\u0080\u0001\u0000\u0000\u0000\u001c\u0090\u0001\u0000"+
		"\u0000\u0000\u001e\u0095\u0001\u0000\u0000\u0000 \u009c\u0001\u0000\u0000"+
		"\u0000\"\u00ad\u0001\u0000\u0000\u0000$\u00af\u0001\u0000\u0000\u0000"+
		"&\u00c0\u0001\u0000\u0000\u0000(\u00c3\u0001\u0000\u0000\u0000*\u00c8"+
		"\u0001\u0000\u0000\u0000,\u00d8\u0001\u0000\u0000\u0000.\u00e2\u0001\u0000"+
		"\u0000\u00000\u00e4\u0001\u0000\u0000\u00002\u00ec\u0001\u0000\u0000\u0000"+
		"4\u00ee\u0001\u0000\u0000\u00006\u00f3\u0001\u0000\u0000\u00008\u0101"+
		"\u0001\u0000\u0000\u0000:\u0108\u0001\u0000\u0000\u0000<\u0116\u0001\u0000"+
		"\u0000\u0000>\u011b\u0001\u0000\u0000\u0000@A\u0005%\u0000\u0000A\u0001"+
		"\u0001\u0000\u0000\u0000BC\u0005\b\u0000\u0000CD\u0005%\u0000\u0000D\u0003"+
		"\u0001\u0000\u0000\u0000EF\u0005\t\u0000\u0000FG\u0005%\u0000\u0000G\u0005"+
		"\u0001\u0000\u0000\u0000HI\u0005\u000b\u0000\u0000IN\u0005%\u0000\u0000"+
		"JK\u0005\u0003\u0000\u0000KM\u0005%\u0000\u0000LJ\u0001\u0000\u0000\u0000"+
		"MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000O\u0007\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0005"+
		"\r\u0000\u0000RS\u0005%\u0000\u0000ST\u0005\u0004\u0000\u0000TU\u0005"+
		"%\u0000\u0000U\t\u0001\u0000\u0000\u0000VW\u0005\u000e\u0000\u0000WX\u0005"+
		"%\u0000\u0000XY\u0005\u0004\u0000\u0000YZ\u0005%\u0000\u0000Z\u000b\u0001"+
		"\u0000\u0000\u0000[\\\u0005\u000f\u0000\u0000\\]\u0005%\u0000\u0000]^"+
		"\u0005\u0004\u0000\u0000^_\u0005%\u0000\u0000_`\u0005\u0004\u0000\u0000"+
		"`a\u0005%\u0000\u0000a\r\u0001\u0000\u0000\u0000bc\u0005\u0010\u0000\u0000"+
		"cd\u0005%\u0000\u0000de\u0005\u0004\u0000\u0000ef\u0005%\u0000\u0000f"+
		"g\u0005\u0004\u0000\u0000gh\u0005%\u0000\u0000h\u000f\u0001\u0000\u0000"+
		"\u0000ij\u0005\u0011\u0000\u0000jk\u0005%\u0000\u0000kl\u0005\u0004\u0000"+
		"\u0000lm\u0005%\u0000\u0000mn\u0005\u0004\u0000\u0000no\u0005%\u0000\u0000"+
		"o\u0011\u0001\u0000\u0000\u0000pq\u0005\u0012\u0000\u0000qr\u0005%\u0000"+
		"\u0000rs\u0005\u0004\u0000\u0000st\u0005%\u0000\u0000tu\u0005\u0004\u0000"+
		"\u0000uv\u0005%\u0000\u0000v\u0013\u0001\u0000\u0000\u0000wx\u0005\u0013"+
		"\u0000\u0000xy\u0005%\u0000\u0000y\u0015\u0001\u0000\u0000\u0000z{\u0005"+
		"\u0014\u0000\u0000{|\u0005%\u0000\u0000|\u0017\u0001\u0000\u0000\u0000"+
		"}~\u0005\u0019\u0000\u0000~\u007f\u0005%\u0000\u0000\u007f\u0019\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0005\u001d\u0000\u0000\u0081\u008e\u0003"+
		"\u0000\u0000\u0000\u0082\u008b\u0005\u0006\u0000\u0000\u0083\u0088\u0005"+
		"%\u0000\u0000\u0084\u0085\u0005\u0004\u0000\u0000\u0085\u0087\u0005%\u0000"+
		"\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008b\u0083\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008f\u0005\u0005\u0000"+
		"\u0000\u008e\u0082\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000"+
		"\u0000\u008f\u001b\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u0018\u0000"+
		"\u0000\u0091\u0092\u0005%\u0000\u0000\u0092\u0093\u0005\u0004\u0000\u0000"+
		"\u0093\u0094\u0005%\u0000\u0000\u0094\u001d\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0005\u0016\u0000\u0000\u0096\u0097\u0005%\u0000\u0000\u0097\u0098"+
		"\u0005\u0004\u0000\u0000\u0098\u0099\u0005%\u0000\u0000\u0099\u009a\u0005"+
		"\u0004\u0000\u0000\u009a\u009b\u0005%\u0000\u0000\u009b\u001f\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0005\u0017\u0000\u0000\u009d\u009e\u0005%\u0000"+
		"\u0000\u009e\u009f\u0005\u0004\u0000\u0000\u009f\u00a0\u0005%\u0000\u0000"+
		"\u00a0\u00a1\u0005\u0004\u0000\u0000\u00a1\u00a2\u0005%\u0000\u0000\u00a2"+
		"\u00a3\u0005\u0004\u0000\u0000\u00a3\u00a4\u0005%\u0000\u0000\u00a4!\u0001"+
		"\u0000\u0000\u0000\u00a5\u00aa\u0005%\u0000\u0000\u00a6\u00a7\u0005\u0004"+
		"\u0000\u0000\u00a7\u00a9\u0005%\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00a5\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae#\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0003\u0000\u0000\u0000\u00b0\u00b1\u0005\u0006\u0000\u0000"+
		"\u00b1\u00b2\u0003\"\u0011\u0000\u00b2\u00b3\u0005\u0005\u0000\u0000\u00b3"+
		"\u00b5\u0005\u0002\u0000\u0000\u00b4\u00b6\u0005\u0007\u0000\u0000\u00b5"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b9\u0003\"\u0011\u0000\u00b8\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00bb"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bc\u0005\u0001\u0000\u0000\u00bb\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00be"+
		"\u0001\u0000\u0000\u0000\u00bd\u00bf\u0003\"\u0011\u0000\u00be\u00bd\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf%\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0005%\u0000\u0000\u00c1\u00c2\u0005\u0002\u0000"+
		"\u0000\u00c2\'\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\n\u0000\u0000"+
		"\u00c4\u00c5\u0005%\u0000\u0000\u00c5\u00c6\u0005\u0004\u0000\u0000\u00c6"+
		"\u00c7\u0005%\u0000\u0000\u00c7)\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003"+
		"\u0002\u0001\u0000\u00c9\u00ce\u0005\u001f\u0000\u0000\u00ca\u00cd\u0003"+
		"(\u0014\u0000\u00cb\u00cd\u0003<\u001e\u0000\u00cc\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0005 \u0000\u0000\u00d2\u00d3\u0003\u0004\u0002\u0000"+
		"\u00d3+\u0001\u0000\u0000\u0000\u00d4\u00d9\u0003 \u0010\u0000\u00d5\u00d9"+
		"\u0003\u001e\u000f\u0000\u00d6\u00d9\u0003\u001c\u000e\u0000\u00d7\u00d9"+
		"\u0003\u0018\f\u0000\u00d8\u00d4\u0001\u0000\u0000\u0000\u00d8\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d9-\u0001\u0000\u0000\u0000\u00da\u00e3\u0003\u001a"+
		"\r\u0000\u00db\u00dd\u0005\u001e\u0000\u0000\u00dc\u00de\u0003\u0000\u0000"+
		"\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000"+
		"\u0000\u00de\u00e3\u0001\u0000\u0000\u0000\u00df\u00e3\u0005\u001b\u0000"+
		"\u0000\u00e0\u00e3\u0005\u001a\u0000\u0000\u00e1\u00e3\u0003,\u0016\u0000"+
		"\u00e2\u00da\u0001\u0000\u0000\u0000\u00e2\u00db\u0001\u0000\u0000\u0000"+
		"\u00e2\u00df\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3/\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0005\u001f\u0000\u0000\u00e51\u0001\u0000\u0000\u0000\u00e6\u00ed"+
		"\u0003\b\u0004\u0000\u00e7\u00ed\u0003\n\u0005\u0000\u00e8\u00ed\u0003"+
		"\f\u0006\u0000\u00e9\u00ed\u0003\u000e\u0007\u0000\u00ea\u00ed\u0003\u0010"+
		"\b\u0000\u00eb\u00ed\u0003\u0012\t\u0000\u00ec\u00e6\u0001\u0000\u0000"+
		"\u0000\u00ec\u00e7\u0001\u0000\u0000\u0000\u00ec\u00e8\u0001\u0000\u0000"+
		"\u0000\u00ec\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed3\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0005!\u0000\u0000\u00ef\u00f0\u0005%\u0000\u0000\u00f0\u00f1"+
		"\u0005\u0004\u0000\u0000\u00f1\u00f2\u0005%\u0000\u0000\u00f25\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0003$\u0012\u0000\u00f4\u00f8\u0005\u001f\u0000"+
		"\u0000\u00f5\u00f7\u0003<\u001e\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fd\u0005\u001e\u0000\u0000"+
		"\u00fc\u00fe\u0003\u0000\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0005 \u0000\u0000\u01007\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0005\f\u0000\u0000\u0102\u0103\u0005%\u0000\u0000\u0103\u0104\u0005"+
		"\u0004\u0000\u0000\u0104\u0105\u0005%\u0000\u0000\u0105\u0106\u0005\u0004"+
		"\u0000\u0000\u0106\u0107\u0005%\u0000\u0000\u01079\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0005\u0015\u0000\u0000\u0109\u010a\u0005%\u0000\u0000\u010a"+
		"\u010b\u0005\u0004\u0000\u0000\u010b\u010c\u0005%\u0000\u0000\u010c;\u0001"+
		"\u0000\u0000\u0000\u010d\u0117\u0003\u0006\u0003\u0000\u010e\u0117\u0003"+
		"*\u0015\u0000\u010f\u0117\u0003.\u0017\u0000\u0110\u0117\u00036\u001b"+
		"\u0000\u0111\u0117\u00030\u0018\u0000\u0112\u0117\u00032\u0019\u0000\u0113"+
		"\u0117\u0003:\u001d\u0000\u0114\u0117\u00038\u001c\u0000\u0115\u0117\u0003"+
		"&\u0013\u0000\u0116\u010d\u0001\u0000\u0000\u0000\u0116\u010e\u0001\u0000"+
		"\u0000\u0000\u0116\u010f\u0001\u0000\u0000\u0000\u0116\u0110\u0001\u0000"+
		"\u0000\u0000\u0116\u0111\u0001\u0000\u0000\u0000\u0116\u0112\u0001\u0000"+
		"\u0000\u0000\u0116\u0113\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000"+
		"\u0000\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117=\u0001\u0000\u0000"+
		"\u0000\u0118\u011a\u0003<\u001e\u0000\u0119\u0118\u0001\u0000\u0000\u0000"+
		"\u011a\u011d\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011f\u0001\u0000\u0000\u0000"+
		"\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u0120\u0005\u0000\u0000\u0001"+
		"\u011f\u011e\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000"+
		"\u0120?\u0001\u0000\u0000\u0000\u0015N\u0088\u008b\u008e\u00aa\u00ad\u00b5"+
		"\u00b8\u00bb\u00be\u00cc\u00ce\u00d8\u00dd\u00e2\u00ec\u00f8\u00fd\u0116"+
		"\u011b\u011f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}