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
		MOV=21, PHI=22, PHI_RES=23, EQCALL_THEN_JMP=24, NEQCALL_THEN_JMP_EXTENDED=25, 
		EQ=26, JMP=27, BREAK=28, CONTINUE=29, FUNC=30, CALL=31, RET=32, ENTERSCOPE=33, 
		EXITSCOPE=34, FUNCTION_ARGUMENT=35, BEGINID=36, ENDID=37, FUNC_ID=38, 
		WS=39, TAB=40, UNTAB=41, ID=42;
	public static final int
		RULE_id3 = 0, RULE_class = 1, RULE_endclass = 2, RULE_import_ = 3, RULE_map = 4, 
		RULE_mapo = 5, RULE_pairmap = 6, RULE_pairmap_o = 7, RULE_pairmapo_ = 8, 
		RULE_pairmapoo = 9, RULE_pop = 10, RULE_push = 11, RULE_fid = 12, RULE_beid = 13, 
		RULE_jmp = 14, RULE_call = 15, RULE_eq = 16, RULE_eQCALL_THEN_JMP = 17, 
		RULE_nEQCALL_THEN_JMP_EXTENDED = 18, RULE_id_list = 19, RULE_func_lbl = 20, 
		RULE_lbl = 21, RULE_member_declare = 22, RULE_class_full = 23, RULE_jmps = 24, 
		RULE_flow_control = 25, RULE_scope_control = 26, RULE_map_control = 27, 
		RULE_function_argument = 28, RULE_func = 29, RULE_get_element_ptr = 30, 
		RULE_mov = 31, RULE_phi = 32, RULE_movPhi = 33, RULE_block = 34, RULE_program = 35, 
		RULE_entry_point = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"id3", "class", "endclass", "import_", "map", "mapo", "pairmap", "pairmap_o", 
			"pairmapo_", "pairmapoo", "pop", "push", "fid", "beid", "jmp", "call", 
			"eq", "eQCALL_THEN_JMP", "nEQCALL_THEN_JMP_EXTENDED", "id_list", "func_lbl", 
			"lbl", "member_declare", "class_full", "jmps", "flow_control", "scope_control", 
			"map_control", "function_argument", "func", "get_element_ptr", "mov", 
			"phi", "movPhi", "block", "program", "entry_point"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "':'", "'/'", "','", "')'", "'('", "'#'", "'CLASS'", "'ENDCLASS'", 
			"'MEMBER'", "'IMPORT'", "'GET_ELEMENT_PTR'", "'MAP'", "'MAPo'", "'PAIRMAP'", 
			"'PAIRMAP_o'", "'PAIRMAPo_'", "'PAIRMAPoo'", "'POP'", "'PUSH'", "'MOV'", 
			"'PHI'", "'phi_res'", "'EQCALL_THEN_JMP'", "'NEQCALL_THEN_JMP_EXTENDED'", 
			"'EQ'", "'JMP'", "'BREAK'", "'CONTINUE'", "'FUNCTION_'", "'CALL'", "'RET'", 
			"'ENTERSCOPE'", "'EXITSCOPE'", "'FUNCTION_ARGUMENT'", null, null, null, 
			null, "'TAB'", "'UNTAB'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ARROW", "COLON", "SLASH", "COMA", "LPAREN", "RPAREN", "SHARP", 
			"CLASS", "ENDCLASS", "MEMBER", "IMPORT", "GET_ELEMENT_PTR", "MAP", "MAPo", 
			"PAIRMAP", "PAIRMAP_o", "PAIRMAPo_", "PAIRMAPoo", "POP", "PUSH", "MOV", 
			"PHI", "PHI_RES", "EQCALL_THEN_JMP", "NEQCALL_THEN_JMP_EXTENDED", "EQ", 
			"JMP", "BREAK", "CONTINUE", "FUNC", "CALL", "RET", "ENTERSCOPE", "EXITSCOPE", 
			"FUNCTION_ARGUMENT", "BEGINID", "ENDID", "FUNC_ID", "WS", "TAB", "UNTAB", 
			"ID"
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

	public static class Id3Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(langosIRParser.ID, 0); }
		public Id3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterId3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitId3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitId3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id3Context id3() throws RecognitionException {
		Id3Context _localctx = new Id3Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_id3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
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
			setState(76);
			match(CLASS);
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
			setState(79);
			match(ENDCLASS);
			setState(80);
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
			setState(82);
			match(IMPORT);
			setState(83);
			match(ID);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH) {
				{
				{
				setState(84);
				match(SLASH);
				setState(85);
				match(ID);
				}
				}
				setState(90);
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
			setState(91);
			match(MAP);
			setState(92);
			match(ID);
			setState(93);
			match(COMA);
			setState(94);
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
			setState(96);
			match(MAPo);
			setState(97);
			match(ID);
			setState(98);
			match(COMA);
			setState(99);
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
			setState(101);
			match(PAIRMAP);
			setState(102);
			match(ID);
			setState(103);
			match(COMA);
			setState(104);
			match(ID);
			setState(105);
			match(COMA);
			setState(106);
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
			setState(108);
			match(PAIRMAP_o);
			setState(109);
			match(ID);
			setState(110);
			match(COMA);
			setState(111);
			match(ID);
			setState(112);
			match(COMA);
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
			setState(115);
			match(PAIRMAPo_);
			setState(116);
			match(ID);
			setState(117);
			match(COMA);
			setState(118);
			match(ID);
			setState(119);
			match(COMA);
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
			setState(122);
			match(PAIRMAPoo);
			setState(123);
			match(ID);
			setState(124);
			match(COMA);
			setState(125);
			match(ID);
			setState(126);
			match(COMA);
			setState(127);
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
			setState(129);
			match(POP);
			setState(130);
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
			setState(132);
			match(PUSH);
			setState(133);
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

	public static class FidContext extends ParserRuleContext {
		public TerminalNode FUNC_ID() { return getToken(langosIRParser.FUNC_ID, 0); }
		public TerminalNode ID() { return getToken(langosIRParser.ID, 0); }
		public FidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterFid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitFid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitFid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FidContext fid() throws RecognitionException {
		FidContext _localctx = new FidContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !(_la==FUNC_ID || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BeidContext extends ParserRuleContext {
		public TerminalNode BEGINID() { return getToken(langosIRParser.BEGINID, 0); }
		public TerminalNode ENDID() { return getToken(langosIRParser.ENDID, 0); }
		public TerminalNode ID() { return getToken(langosIRParser.ID, 0); }
		public BeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterBeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitBeid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitBeid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeidContext beid() throws RecognitionException {
		BeidContext _localctx = new BeidContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_beid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGINID) | (1L << ENDID) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class JmpContext extends ParserRuleContext {
		public TerminalNode JMP() { return getToken(langosIRParser.JMP, 0); }
		public List<BeidContext> beid() {
			return getRuleContexts(BeidContext.class);
		}
		public BeidContext beid(int i) {
			return getRuleContext(BeidContext.class,i);
		}
		public TerminalNode ID() { return getToken(langosIRParser.ID, 0); }
		public List<TerminalNode> COMA() { return getTokens(langosIRParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(langosIRParser.COMA, i);
		}
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
		enterRule(_localctx, 28, RULE_jmp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(JMP);
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(140);
				match(ID);
				setState(141);
				match(COMA);
				}
				break;
			}
			setState(144);
			beid();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(145);
				match(COMA);
				setState(146);
				beid();
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(langosIRParser.CALL, 0); }
		public TerminalNode ID() { return getToken(langosIRParser.ID, 0); }
		public List<TerminalNode> COMA() { return getTokens(langosIRParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(langosIRParser.COMA, i);
		}
		public FidContext fid() {
			return getRuleContext(FidContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(langosIRParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(langosIRParser.LPAREN, 0); }
		public List<Id3Context> id3() {
			return getRuleContexts(Id3Context.class);
		}
		public Id3Context id3(int i) {
			return getRuleContext(Id3Context.class,i);
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
		enterRule(_localctx, 30, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(CALL);
			setState(150);
			match(ID);
			setState(151);
			match(COMA);
			setState(152);
			fid();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(153);
				match(RPAREN);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(154);
					id3();
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(155);
						match(COMA);
						setState(156);
						id3();
						}
						}
						setState(161);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(164);
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
		enterRule(_localctx, 32, RULE_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(EQ);
			setState(168);
			match(ID);
			setState(169);
			match(COMA);
			setState(170);
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
		enterRule(_localctx, 34, RULE_eQCALL_THEN_JMP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(EQCALL_THEN_JMP);
			setState(173);
			match(ID);
			setState(174);
			match(COMA);
			setState(175);
			match(ID);
			setState(176);
			match(COMA);
			setState(177);
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
		enterRule(_localctx, 36, RULE_nEQCALL_THEN_JMP_EXTENDED);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(NEQCALL_THEN_JMP_EXTENDED);
			setState(180);
			match(ID);
			setState(181);
			match(COMA);
			setState(182);
			match(ID);
			setState(183);
			match(COMA);
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
		enterRule(_localctx, 38, RULE_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(188);
				match(ID);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(189);
					match(COMA);
					setState(190);
					match(ID);
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Func_lblContext extends ParserRuleContext {
		public TerminalNode FUNC_ID() { return getToken(langosIRParser.FUNC_ID, 0); }
		public TerminalNode RPAREN() { return getToken(langosIRParser.RPAREN, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(langosIRParser.LPAREN, 0); }
		public TerminalNode COLON() { return getToken(langosIRParser.COLON, 0); }
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
		enterRule(_localctx, 40, RULE_func_lbl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(FUNC_ID);
			setState(199);
			match(RPAREN);
			setState(200);
			id_list();
			setState(201);
			match(LPAREN);
			setState(202);
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
		enterRule(_localctx, 42, RULE_lbl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(ID);
			setState(205);
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
		enterRule(_localctx, 44, RULE_member_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(MEMBER);
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
		enterRule(_localctx, 46, RULE_class_full);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			class_();
			setState(213);
			match(ENTERSCOPE);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << MEMBER) | (1L << IMPORT) | (1L << GET_ELEMENT_PTR) | (1L << MAP) | (1L << MAPo) | (1L << PAIRMAP) | (1L << PAIRMAP_o) | (1L << PAIRMAPo_) | (1L << PAIRMAPoo) | (1L << MOV) | (1L << PHI) | (1L << EQCALL_THEN_JMP) | (1L << NEQCALL_THEN_JMP_EXTENDED) | (1L << EQ) | (1L << JMP) | (1L << BREAK) | (1L << CONTINUE) | (1L << CALL) | (1L << RET) | (1L << ENTERSCOPE) | (1L << BEGINID) | (1L << FUNC_ID) | (1L << ID))) != 0)) {
				{
				setState(216);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MEMBER:
					{
					setState(214);
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
				case PHI:
				case EQCALL_THEN_JMP:
				case NEQCALL_THEN_JMP_EXTENDED:
				case EQ:
				case JMP:
				case BREAK:
				case CONTINUE:
				case CALL:
				case RET:
				case ENTERSCOPE:
				case BEGINID:
				case FUNC_ID:
				case ID:
					{
					setState(215);
					program();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			match(EXITSCOPE);
			setState(222);
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
		enterRule(_localctx, 48, RULE_jmps);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEQCALL_THEN_JMP_EXTENDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				nEQCALL_THEN_JMP_EXTENDED();
				}
				break;
			case EQCALL_THEN_JMP:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				eQCALL_THEN_JMP();
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				eq();
				}
				break;
			case JMP:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
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
		public TerminalNode ID() { return getToken(langosIRParser.ID, 0); }
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
		enterRule(_localctx, 50, RULE_flow_control);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				call();
				}
				break;
			case RET:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(RET);
				setState(233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(232);
					match(ID);
					}
					break;
				}
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				match(CONTINUE);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				match(BREAK);
				}
				break;
			case EQCALL_THEN_JMP:
			case NEQCALL_THEN_JMP_EXTENDED:
			case EQ:
			case JMP:
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
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
		enterRule(_localctx, 52, RULE_scope_control);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
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
		enterRule(_localctx, 54, RULE_map_control);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				map();
				}
				break;
			case MAPo:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				mapo();
				}
				break;
			case PAIRMAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				pairmap();
				}
				break;
			case PAIRMAP_o:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				pairmap_o();
				}
				break;
			case PAIRMAPo_:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				pairmapo_();
				}
				break;
			case PAIRMAPoo:
				enterOuterAlt(_localctx, 6);
				{
				setState(247);
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
		enterRule(_localctx, 56, RULE_function_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(FUNCTION_ARGUMENT);
			setState(251);
			match(ID);
			setState(252);
			match(COMA);
			setState(253);
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
		public TerminalNode ID() { return getToken(langosIRParser.ID, 0); }
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
		enterRule(_localctx, 58, RULE_func);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			func_lbl();
			setState(256);
			match(ENTERSCOPE);
			{
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(257);
					program();
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
			setState(263);
			match(RET);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(264);
				match(ID);
				}
			}

			setState(267);
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
		enterRule(_localctx, 60, RULE_get_element_ptr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(GET_ELEMENT_PTR);
			setState(270);
			match(ID);
			setState(271);
			match(COMA);
			setState(272);
			match(ID);
			setState(273);
			match(COMA);
			setState(274);
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
		enterRule(_localctx, 62, RULE_mov);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(MOV);
			setState(277);
			match(ID);
			setState(278);
			match(COMA);
			setState(279);
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

	public static class PhiContext extends ParserRuleContext {
		public TerminalNode PHI() { return getToken(langosIRParser.PHI, 0); }
		public List<TerminalNode> ID() { return getTokens(langosIRParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langosIRParser.ID, i);
		}
		public TerminalNode COMA() { return getToken(langosIRParser.COMA, 0); }
		public PhiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterPhi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitPhi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitPhi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhiContext phi() throws RecognitionException {
		PhiContext _localctx = new PhiContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_phi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(PHI);
			setState(282);
			match(ID);
			setState(283);
			match(COMA);
			setState(284);
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

	public static class MovPhiContext extends ParserRuleContext {
		public PhiContext phi() {
			return getRuleContext(PhiContext.class,0);
		}
		public TerminalNode MOV() { return getToken(langosIRParser.MOV, 0); }
		public TerminalNode ID() { return getToken(langosIRParser.ID, 0); }
		public TerminalNode COMA() { return getToken(langosIRParser.COMA, 0); }
		public TerminalNode PHI_RES() { return getToken(langosIRParser.PHI_RES, 0); }
		public MovPhiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movPhi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterMovPhi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitMovPhi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitMovPhi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovPhiContext movPhi() throws RecognitionException {
		MovPhiContext _localctx = new MovPhiContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_movPhi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			phi();
			setState(287);
			match(MOV);
			setState(288);
			match(ID);
			setState(289);
			match(COMA);
			setState(290);
			match(PHI_RES);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BEGINID() { return getToken(langosIRParser.BEGINID, 0); }
		public List<TerminalNode> COLON() { return getTokens(langosIRParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(langosIRParser.COLON, i);
		}
		public TerminalNode ENDID() { return getToken(langosIRParser.ENDID, 0); }
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosIRListener ) ((langosIRListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosIRVisitor ) return ((langosIRVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(BEGINID);
			setState(293);
			match(COLON);
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << IMPORT) | (1L << GET_ELEMENT_PTR) | (1L << MAP) | (1L << MAPo) | (1L << PAIRMAP) | (1L << PAIRMAP_o) | (1L << PAIRMAPo_) | (1L << PAIRMAPoo) | (1L << MOV) | (1L << PHI) | (1L << EQCALL_THEN_JMP) | (1L << NEQCALL_THEN_JMP_EXTENDED) | (1L << EQ) | (1L << JMP) | (1L << BREAK) | (1L << CONTINUE) | (1L << CALL) | (1L << RET) | (1L << ENTERSCOPE) | (1L << BEGINID) | (1L << FUNC_ID) | (1L << ID))) != 0)) {
					{
					{
					setState(294);
					program();
					}
					}
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(300);
				match(ENDID);
				setState(301);
				match(COLON);
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
		public MovPhiContext movPhi() {
			return getRuleContext(MovPhiContext.class,0);
		}
		public MovContext mov() {
			return getRuleContext(MovContext.class,0);
		}
		public Get_element_ptrContext get_element_ptr() {
			return getRuleContext(Get_element_ptrContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 70, RULE_program);
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				import_();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				class_full();
				}
				break;
			case EQCALL_THEN_JMP:
			case NEQCALL_THEN_JMP_EXTENDED:
			case EQ:
			case JMP:
			case BREAK:
			case CONTINUE:
			case CALL:
			case RET:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				flow_control();
				}
				break;
			case FUNC_ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				func();
				}
				break;
			case ENTERSCOPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(308);
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
				setState(309);
				map_control();
				}
				break;
			case PHI:
				enterOuterAlt(_localctx, 7);
				{
				setState(310);
				movPhi();
				}
				break;
			case MOV:
				enterOuterAlt(_localctx, 8);
				{
				setState(311);
				mov();
				}
				break;
			case GET_ELEMENT_PTR:
				enterOuterAlt(_localctx, 9);
				{
				setState(312);
				get_element_ptr();
				}
				break;
			case BEGINID:
				enterOuterAlt(_localctx, 10);
				{
				setState(313);
				block();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 11);
				{
				setState(314);
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
		enterRule(_localctx, 72, RULE_entry_point);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << IMPORT) | (1L << GET_ELEMENT_PTR) | (1L << MAP) | (1L << MAPo) | (1L << PAIRMAP) | (1L << PAIRMAP_o) | (1L << PAIRMAPo_) | (1L << PAIRMAPoo) | (1L << MOV) | (1L << PHI) | (1L << EQCALL_THEN_JMP) | (1L << NEQCALL_THEN_JMP_EXTENDED) | (1L << EQ) | (1L << JMP) | (1L << BREAK) | (1L << CONTINUE) | (1L << CALL) | (1L << RET) | (1L << ENTERSCOPE) | (1L << BEGINID) | (1L << FUNC_ID) | (1L << ID))) != 0)) {
				{
				{
				setState(317);
				program();
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(323);
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
		"\u0004\u0001*\u0147\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003W\b\u0003\n\u0003\f\u0003Z\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u008f\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0094\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u009e\b\u000f\n\u000f\f\u000f\u00a1\t\u000f\u0003\u000f\u00a3\b\u000f"+
		"\u0001\u000f\u0003\u000f\u00a6\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00c0\b\u0013\n\u0013"+
		"\f\u0013\u00c3\t\u0013\u0003\u0013\u00c5\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u00d9\b\u0017"+
		"\n\u0017\f\u0017\u00dc\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00e5\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u00ea\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u00ef\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u00f9\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0103\b\u001d\n"+
		"\u001d\f\u001d\u0106\t\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u010a"+
		"\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0005\"\u0128"+
		"\b\"\n\"\f\"\u012b\t\"\u0001\"\u0001\"\u0003\"\u012f\b\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u013c\b#\u0001$\u0005$\u013f\b$\n$\f$\u0142\t$\u0001$\u0003$\u0145\b"+
		"$\u0001$\u0000\u0000%\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFH\u0000\u0002"+
		"\u0002\u0000&&**\u0002\u0000$%**\u0148\u0000J\u0001\u0000\u0000\u0000"+
		"\u0002L\u0001\u0000\u0000\u0000\u0004O\u0001\u0000\u0000\u0000\u0006R"+
		"\u0001\u0000\u0000\u0000\b[\u0001\u0000\u0000\u0000\n`\u0001\u0000\u0000"+
		"\u0000\fe\u0001\u0000\u0000\u0000\u000el\u0001\u0000\u0000\u0000\u0010"+
		"s\u0001\u0000\u0000\u0000\u0012z\u0001\u0000\u0000\u0000\u0014\u0081\u0001"+
		"\u0000\u0000\u0000\u0016\u0084\u0001\u0000\u0000\u0000\u0018\u0087\u0001"+
		"\u0000\u0000\u0000\u001a\u0089\u0001\u0000\u0000\u0000\u001c\u008b\u0001"+
		"\u0000\u0000\u0000\u001e\u0095\u0001\u0000\u0000\u0000 \u00a7\u0001\u0000"+
		"\u0000\u0000\"\u00ac\u0001\u0000\u0000\u0000$\u00b3\u0001\u0000\u0000"+
		"\u0000&\u00c4\u0001\u0000\u0000\u0000(\u00c6\u0001\u0000\u0000\u0000*"+
		"\u00cc\u0001\u0000\u0000\u0000,\u00cf\u0001\u0000\u0000\u0000.\u00d4\u0001"+
		"\u0000\u0000\u00000\u00e4\u0001\u0000\u0000\u00002\u00ee\u0001\u0000\u0000"+
		"\u00004\u00f0\u0001\u0000\u0000\u00006\u00f8\u0001\u0000\u0000\u00008"+
		"\u00fa\u0001\u0000\u0000\u0000:\u00ff\u0001\u0000\u0000\u0000<\u010d\u0001"+
		"\u0000\u0000\u0000>\u0114\u0001\u0000\u0000\u0000@\u0119\u0001\u0000\u0000"+
		"\u0000B\u011e\u0001\u0000\u0000\u0000D\u0124\u0001\u0000\u0000\u0000F"+
		"\u013b\u0001\u0000\u0000\u0000H\u0140\u0001\u0000\u0000\u0000JK\u0005"+
		"*\u0000\u0000K\u0001\u0001\u0000\u0000\u0000LM\u0005\b\u0000\u0000MN\u0005"+
		"*\u0000\u0000N\u0003\u0001\u0000\u0000\u0000OP\u0005\t\u0000\u0000PQ\u0005"+
		"*\u0000\u0000Q\u0005\u0001\u0000\u0000\u0000RS\u0005\u000b\u0000\u0000"+
		"SX\u0005*\u0000\u0000TU\u0005\u0003\u0000\u0000UW\u0005*\u0000\u0000V"+
		"T\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000Y\u0007\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000[\\\u0005\r\u0000\u0000\\]\u0005*\u0000\u0000]^\u0005"+
		"\u0004\u0000\u0000^_\u0005*\u0000\u0000_\t\u0001\u0000\u0000\u0000`a\u0005"+
		"\u000e\u0000\u0000ab\u0005*\u0000\u0000bc\u0005\u0004\u0000\u0000cd\u0005"+
		"*\u0000\u0000d\u000b\u0001\u0000\u0000\u0000ef\u0005\u000f\u0000\u0000"+
		"fg\u0005*\u0000\u0000gh\u0005\u0004\u0000\u0000hi\u0005*\u0000\u0000i"+
		"j\u0005\u0004\u0000\u0000jk\u0005*\u0000\u0000k\r\u0001\u0000\u0000\u0000"+
		"lm\u0005\u0010\u0000\u0000mn\u0005*\u0000\u0000no\u0005\u0004\u0000\u0000"+
		"op\u0005*\u0000\u0000pq\u0005\u0004\u0000\u0000qr\u0005*\u0000\u0000r"+
		"\u000f\u0001\u0000\u0000\u0000st\u0005\u0011\u0000\u0000tu\u0005*\u0000"+
		"\u0000uv\u0005\u0004\u0000\u0000vw\u0005*\u0000\u0000wx\u0005\u0004\u0000"+
		"\u0000xy\u0005*\u0000\u0000y\u0011\u0001\u0000\u0000\u0000z{\u0005\u0012"+
		"\u0000\u0000{|\u0005*\u0000\u0000|}\u0005\u0004\u0000\u0000}~\u0005*\u0000"+
		"\u0000~\u007f\u0005\u0004\u0000\u0000\u007f\u0080\u0005*\u0000\u0000\u0080"+
		"\u0013\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0013\u0000\u0000\u0082"+
		"\u0083\u0005*\u0000\u0000\u0083\u0015\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0005\u0014\u0000\u0000\u0085\u0086\u0005*\u0000\u0000\u0086\u0017\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0007\u0000\u0000\u0000\u0088\u0019\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0007\u0001\u0000\u0000\u008a\u001b\u0001"+
		"\u0000\u0000\u0000\u008b\u008e\u0005\u001b\u0000\u0000\u008c\u008d\u0005"+
		"*\u0000\u0000\u008d\u008f\u0005\u0004\u0000\u0000\u008e\u008c\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u0093\u0003\u001a\r\u0000\u0091\u0092\u0005\u0004\u0000"+
		"\u0000\u0092\u0094\u0003\u001a\r\u0000\u0093\u0091\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u001d\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005\u001f\u0000\u0000\u0096\u0097\u0005*\u0000\u0000\u0097"+
		"\u0098\u0005\u0004\u0000\u0000\u0098\u00a5\u0003\u0018\f\u0000\u0099\u00a2"+
		"\u0005\u0006\u0000\u0000\u009a\u009f\u0003\u0000\u0000\u0000\u009b\u009c"+
		"\u0005\u0004\u0000\u0000\u009c\u009e\u0003\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u009a"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a6\u0005\u0005\u0000\u0000\u00a5\u0099"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u001f"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u001a\u0000\u0000\u00a8\u00a9"+
		"\u0005*\u0000\u0000\u00a9\u00aa\u0005\u0004\u0000\u0000\u00aa\u00ab\u0005"+
		"*\u0000\u0000\u00ab!\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0018\u0000"+
		"\u0000\u00ad\u00ae\u0005*\u0000\u0000\u00ae\u00af\u0005\u0004\u0000\u0000"+
		"\u00af\u00b0\u0005*\u0000\u0000\u00b0\u00b1\u0005\u0004\u0000\u0000\u00b1"+
		"\u00b2\u0005*\u0000\u0000\u00b2#\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005"+
		"\u0019\u0000\u0000\u00b4\u00b5\u0005*\u0000\u0000\u00b5\u00b6\u0005\u0004"+
		"\u0000\u0000\u00b6\u00b7\u0005*\u0000\u0000\u00b7\u00b8\u0005\u0004\u0000"+
		"\u0000\u00b8\u00b9\u0005*\u0000\u0000\u00b9\u00ba\u0005\u0004\u0000\u0000"+
		"\u00ba\u00bb\u0005*\u0000\u0000\u00bb%\u0001\u0000\u0000\u0000\u00bc\u00c1"+
		"\u0005*\u0000\u0000\u00bd\u00be\u0005\u0004\u0000\u0000\u00be\u00c0\u0005"+
		"*\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c4\u00bc\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c5\'\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005&\u0000"+
		"\u0000\u00c7\u00c8\u0005\u0006\u0000\u0000\u00c8\u00c9\u0003&\u0013\u0000"+
		"\u00c9\u00ca\u0005\u0005\u0000\u0000\u00ca\u00cb\u0005\u0002\u0000\u0000"+
		"\u00cb)\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005*\u0000\u0000\u00cd\u00ce"+
		"\u0005\u0002\u0000\u0000\u00ce+\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005"+
		"\n\u0000\u0000\u00d0\u00d1\u0005*\u0000\u0000\u00d1\u00d2\u0005\u0004"+
		"\u0000\u0000\u00d2\u00d3\u0005*\u0000\u0000\u00d3-\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0003\u0002\u0001\u0000\u00d5\u00da\u0005!\u0000\u0000\u00d6"+
		"\u00d9\u0003,\u0016\u0000\u00d7\u00d9\u0003F#\u0000\u00d8\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001"+
		"\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001"+
		"\u0000\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00da\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0005\"\u0000\u0000\u00de\u00df\u0003\u0004"+
		"\u0002\u0000\u00df/\u0001\u0000\u0000\u0000\u00e0\u00e5\u0003$\u0012\u0000"+
		"\u00e1\u00e5\u0003\"\u0011\u0000\u00e2\u00e5\u0003 \u0010\u0000\u00e3"+
		"\u00e5\u0003\u001c\u000e\u0000\u00e4\u00e0\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e51\u0001\u0000\u0000\u0000\u00e6\u00ef"+
		"\u0003\u001e\u000f\u0000\u00e7\u00e9\u0005 \u0000\u0000\u00e8\u00ea\u0005"+
		"*\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ea\u00ef\u0001\u0000\u0000\u0000\u00eb\u00ef\u0005\u001d"+
		"\u0000\u0000\u00ec\u00ef\u0005\u001c\u0000\u0000\u00ed\u00ef\u00030\u0018"+
		"\u0000\u00ee\u00e6\u0001\u0000\u0000\u0000\u00ee\u00e7\u0001\u0000\u0000"+
		"\u0000\u00ee\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef3\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0005!\u0000\u0000\u00f15\u0001\u0000\u0000\u0000\u00f2\u00f9"+
		"\u0003\b\u0004\u0000\u00f3\u00f9\u0003\n\u0005\u0000\u00f4\u00f9\u0003"+
		"\f\u0006\u0000\u00f5\u00f9\u0003\u000e\u0007\u0000\u00f6\u00f9\u0003\u0010"+
		"\b\u0000\u00f7\u00f9\u0003\u0012\t\u0000\u00f8\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f3\u0001\u0000\u0000\u0000\u00f8\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f5\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f97\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0005#\u0000\u0000\u00fb\u00fc\u0005*\u0000\u0000\u00fc\u00fd"+
		"\u0005\u0004\u0000\u0000\u00fd\u00fe\u0005*\u0000\u0000\u00fe9\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0003(\u0014\u0000\u0100\u0104\u0005!\u0000\u0000"+
		"\u0101\u0103\u0003F#\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0103\u0106"+
		"\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0001\u0000\u0000\u0000\u0105\u0107\u0001\u0000\u0000\u0000\u0106\u0104"+
		"\u0001\u0000\u0000\u0000\u0107\u0109\u0005 \u0000\u0000\u0108\u010a\u0005"+
		"*\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c\u0005\"\u0000"+
		"\u0000\u010c;\u0001\u0000\u0000\u0000\u010d\u010e\u0005\f\u0000\u0000"+
		"\u010e\u010f\u0005*\u0000\u0000\u010f\u0110\u0005\u0004\u0000\u0000\u0110"+
		"\u0111\u0005*\u0000\u0000\u0111\u0112\u0005\u0004\u0000\u0000\u0112\u0113"+
		"\u0005*\u0000\u0000\u0113=\u0001\u0000\u0000\u0000\u0114\u0115\u0005\u0015"+
		"\u0000\u0000\u0115\u0116\u0005*\u0000\u0000\u0116\u0117\u0005\u0004\u0000"+
		"\u0000\u0117\u0118\u0005*\u0000\u0000\u0118?\u0001\u0000\u0000\u0000\u0119"+
		"\u011a\u0005\u0016\u0000\u0000\u011a\u011b\u0005*\u0000\u0000\u011b\u011c"+
		"\u0005\u0004\u0000\u0000\u011c\u011d\u0005*\u0000\u0000\u011dA\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0003@ \u0000\u011f\u0120\u0005\u0015\u0000\u0000"+
		"\u0120\u0121\u0005*\u0000\u0000\u0121\u0122\u0005\u0004\u0000\u0000\u0122"+
		"\u0123\u0005\u0017\u0000\u0000\u0123C\u0001\u0000\u0000\u0000\u0124\u0125"+
		"\u0005$\u0000\u0000\u0125\u012e\u0005\u0002\u0000\u0000\u0126\u0128\u0003"+
		"F#\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0128\u012b\u0001\u0000\u0000"+
		"\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000"+
		"\u0000\u012a\u012c\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0005%\u0000\u0000\u012d\u012f\u0005\u0002\u0000\u0000"+
		"\u012e\u0129\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000"+
		"\u012fE\u0001\u0000\u0000\u0000\u0130\u013c\u0003\u0006\u0003\u0000\u0131"+
		"\u013c\u0003.\u0017\u0000\u0132\u013c\u00032\u0019\u0000\u0133\u013c\u0003"+
		":\u001d\u0000\u0134\u013c\u00034\u001a\u0000\u0135\u013c\u00036\u001b"+
		"\u0000\u0136\u013c\u0003B!\u0000\u0137\u013c\u0003>\u001f\u0000\u0138"+
		"\u013c\u0003<\u001e\u0000\u0139\u013c\u0003D\"\u0000\u013a\u013c\u0003"+
		"*\u0015\u0000\u013b\u0130\u0001\u0000\u0000\u0000\u013b\u0131\u0001\u0000"+
		"\u0000\u0000\u013b\u0132\u0001\u0000\u0000\u0000\u013b\u0133\u0001\u0000"+
		"\u0000\u0000\u013b\u0134\u0001\u0000\u0000\u0000\u013b\u0135\u0001\u0000"+
		"\u0000\u0000\u013b\u0136\u0001\u0000\u0000\u0000\u013b\u0137\u0001\u0000"+
		"\u0000\u0000\u013b\u0138\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000"+
		"\u0000\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013cG\u0001\u0000\u0000"+
		"\u0000\u013d\u013f\u0003F#\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013f"+
		"\u0142\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140"+
		"\u0141\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142"+
		"\u0140\u0001\u0000\u0000\u0000\u0143\u0145\u0005\u0000\u0000\u0001\u0144"+
		"\u0143\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145"+
		"I\u0001\u0000\u0000\u0000\u0015X\u008e\u0093\u009f\u00a2\u00a5\u00c1\u00c4"+
		"\u00d8\u00da\u00e4\u00e9\u00ee\u00f8\u0104\u0109\u0129\u012e\u013b\u0140"+
		"\u0144";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}