// Generated from /home/support-pc/Рабочий стол/техподдержка/отчеты/Копытцев А А/others/inteljidea/langA_/src/main/java/org/lexasub/langosWithoutSyntax.g4 by ANTLR 4.10.1
package org.lexasub.langosThirdTryWithoutPromise.frontend;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class langosWithoutSyntaxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, CHAR=2, STRING=3, WS=4, IMPORT=5, BREAK=6, CLASS=7, CONTINUE=8, 
		IF=9, MAP=10, PAIRMAP=11, RETURN=12, SYNTAX=13, WHILE=14, WITH=15, QUEST=16, 
		STAR=17, PLUS=18, MINUS=19, ASSIGN=20, DOT=21, LPAREN=22, RPAREN=23, LBRACE=24, 
		RBRACE=25, LEND=26, REND=27, BAR=28, GT=29, LT=30, CIRCUMFLEX=31, DOUBLECOLON=32, 
		COLON=33, SEMI=34, COMA=35, ARROW=36, ID=37;
	public static final int
		RULE_import_ = 0, RULE_id_strong = 1, RULE_fun_name = 2, RULE_id_list = 3, 
		RULE_type_name = 4, RULE_var_name = 5, RULE_class_name = 6, RULE_member_name = 7, 
		RULE_namspce_obj = 8, RULE_function_specifier = 9, RULE_function = 10, 
		RULE_expr = 11, RULE_get_member = 12, RULE_braced_element = 13, RULE_expr_list = 14, 
		RULE_func_args = 15, RULE_method_call_ = 16, RULE_function_call_helper_method = 17, 
		RULE_method_call = 18, RULE_function_call = 19, RULE_function_call_helper = 20, 
		RULE_function_call2 = 21, RULE_function_call_ = 22, RULE_flow_control = 23, 
		RULE_lambda = 24, RULE_return_expr = 25, RULE_element = 26, RULE_with_body = 27, 
		RULE_with_synonym = 28, RULE_with_ = 29, RULE_parened_expr = 30, RULE_declare_member = 31, 
		RULE_class_ = 32, RULE_program = 33, RULE_entry_point = 34, RULE_parened_expr_list = 35, 
		RULE_parened_id_list = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"import_", "id_strong", "fun_name", "id_list", "type_name", "var_name", 
			"class_name", "member_name", "namspce_obj", "function_specifier", "function", 
			"expr", "get_member", "braced_element", "expr_list", "func_args", "method_call_", 
			"function_call_helper_method", "method_call", "function_call", "function_call_helper", 
			"function_call2", "function_call_", "flow_control", "lambda", "return_expr", 
			"element", "with_body", "with_synonym", "with_", "parened_expr", "declare_member", 
			"class_", "program", "entry_point", "parened_expr_list", "parened_id_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$'", null, null, null, "'import'", "'break'", "'class'", "'continue'", 
			"'if'", "'map'", "'pairmap'", "'return'", "'syntax'", "'while'", "'with'", 
			"'?'", "'*'", "'+'", "'-'", "'='", "'.'", "')'", "'('", "'}'", "'{'", 
			"']'", "'['", "'|'", "'>'", "'<'", "'^'", "'::'", "':'", "';'", "','", 
			"'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "CHAR", "STRING", "WS", "IMPORT", "BREAK", "CLASS", "CONTINUE", 
			"IF", "MAP", "PAIRMAP", "RETURN", "SYNTAX", "WHILE", "WITH", "QUEST", 
			"STAR", "PLUS", "MINUS", "ASSIGN", "DOT", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "LEND", "REND", "BAR", "GT", "LT", "CIRCUMFLEX", "DOUBLECOLON", 
			"COLON", "SEMI", "COMA", "ARROW", "ID"
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
	public String getGrammarFileName() { return "langosWithoutSyntax.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public langosWithoutSyntaxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Import_Context extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(langosWithoutSyntaxParser.IMPORT, 0); }
		public List<TerminalNode> ID() { return getTokens(langosWithoutSyntaxParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langosWithoutSyntaxParser.ID, i);
		}
		public TerminalNode SEMI() { return getToken(langosWithoutSyntaxParser.SEMI, 0); }
		public List<TerminalNode> DOT() { return getTokens(langosWithoutSyntaxParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(langosWithoutSyntaxParser.DOT, i);
		}
		public Import_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterImport_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitImport_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitImport_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_Context import_() throws RecognitionException {
		Import_Context _localctx = new Import_Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_import_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(IMPORT);
			setState(75);
			match(ID);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(76);
				match(DOT);
				setState(77);
				match(ID);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(SEMI);
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

	public static class Id_strongContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(langosWithoutSyntaxParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(langosWithoutSyntaxParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(langosWithoutSyntaxParser.LPAREN, 0); }
		public Id_strongContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_strong; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterId_strong(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitId_strong(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitId_strong(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_strongContext id_strong() throws RecognitionException {
		Id_strongContext _localctx = new Id_strongContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_id_strong);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(RPAREN);
			setState(86);
			match(ID);
			setState(87);
			match(LPAREN);
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

	public static class Fun_nameContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(langosWithoutSyntaxParser.IF, 0); }
		public TerminalNode WHILE() { return getToken(langosWithoutSyntaxParser.WHILE, 0); }
		public TerminalNode PAIRMAP() { return getToken(langosWithoutSyntaxParser.PAIRMAP, 0); }
		public TerminalNode MAP() { return getToken(langosWithoutSyntaxParser.MAP, 0); }
		public TerminalNode ID() { return getToken(langosWithoutSyntaxParser.ID, 0); }
		public Fun_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterFun_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitFun_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitFun_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_nameContext fun_name() throws RecognitionException {
		Fun_nameContext _localctx = new Fun_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fun_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << MAP) | (1L << PAIRMAP) | (1L << WHILE) | (1L << ID))) != 0)) ) {
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

	public static class Id_listContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(langosWithoutSyntaxParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langosWithoutSyntaxParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(langosWithoutSyntaxParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(langosWithoutSyntaxParser.COMA, i);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitId_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitId_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(ID);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(92);
				match(COMA);
				setState(93);
				match(ID);
				}
				}
				setState(98);
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

	public static class Type_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(langosWithoutSyntaxParser.ID, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Var_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(langosWithoutSyntaxParser.ID, 0); }
		public Var_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterVar_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitVar_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitVar_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_nameContext var_name() throws RecognitionException {
		Var_nameContext _localctx = new Var_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
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

	public static class Class_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(langosWithoutSyntaxParser.ID, 0); }
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitClass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitClass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Member_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(langosWithoutSyntaxParser.ID, 0); }
		public Member_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterMember_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitMember_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitMember_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_nameContext member_name() throws RecognitionException {
		Member_nameContext _localctx = new Member_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_member_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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

	public static class Namspce_objContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(langosWithoutSyntaxParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langosWithoutSyntaxParser.ID, i);
		}
		public List<TerminalNode> DOUBLECOLON() { return getTokens(langosWithoutSyntaxParser.DOUBLECOLON); }
		public TerminalNode DOUBLECOLON(int i) {
			return getToken(langosWithoutSyntaxParser.DOUBLECOLON, i);
		}
		public Namspce_objContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namspce_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterNamspce_obj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitNamspce_obj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitNamspce_obj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Namspce_objContext namspce_obj() throws RecognitionException {
		Namspce_objContext _localctx = new Namspce_objContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_namspce_obj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(ID);
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				match(DOUBLECOLON);
				setState(109);
				match(ID);
				}
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DOUBLECOLON );
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

	public static class Function_specifierContext extends ParserRuleContext {
		public Function_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterFunction_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitFunction_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitFunction_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_specifierContext function_specifier() throws RecognitionException {
		Function_specifierContext _localctx = new Function_specifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__0);
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

	public static class FunctionContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Func_argsContext func_args() {
			return getRuleContext(Func_argsContext.class,0);
		}
		public Braced_elementContext braced_element() {
			return getRuleContext(Braced_elementContext.class,0);
		}
		public Function_specifierContext function_specifier() {
			return getRuleContext(Function_specifierContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(116);
				function_specifier();
				}
			}

			setState(119);
			type_name();
			setState(120);
			var_name();
			setState(121);
			func_args();
			setState(122);
			braced_element();
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

	public static class ExprContext extends ParserRuleContext {
		public With_Context with_() {
			return getRuleContext(With_Context.class,0);
		}
		public Flow_controlContext flow_control() {
			return getRuleContext(Flow_controlContext.class,0);
		}
		public Function_call_Context function_call_() {
			return getRuleContext(Function_call_Context.class,0);
		}
		public Class_Context class_() {
			return getRuleContext(Class_Context.class,0);
		}
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public Get_memberContext get_member() {
			return getRuleContext(Get_memberContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(langosWithoutSyntaxParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(langosWithoutSyntaxParser.STRING, 0); }
		public TerminalNode ID() { return getToken(langosWithoutSyntaxParser.ID, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				with_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				flow_control();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				function_call_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				class_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				lambda();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				get_member();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				match(CHAR);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(131);
				match(STRING);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(132);
				match(ID);
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

	public static class Get_memberContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(langosWithoutSyntaxParser.DOT, 0); }
		public Member_nameContext member_name() {
			return getRuleContext(Member_nameContext.class,0);
		}
		public Get_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterGet_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitGet_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitGet_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_memberContext get_member() throws RecognitionException {
		Get_memberContext _localctx = new Get_memberContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_get_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			class_name();
			setState(136);
			match(DOT);
			setState(137);
			member_name();
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

	public static class Braced_elementContext extends ParserRuleContext {
		public TerminalNode RBRACE() { return getToken(langosWithoutSyntaxParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(langosWithoutSyntaxParser.LBRACE, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Braced_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braced_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterBraced_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitBraced_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitBraced_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Braced_elementContext braced_element() throws RecognitionException {
		Braced_elementContext _localctx = new Braced_elementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_braced_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(RBRACE);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << CHAR) | (1L << STRING) | (1L << BREAK) | (1L << CLASS) | (1L << CONTINUE) | (1L << IF) | (1L << MAP) | (1L << PAIRMAP) | (1L << RETURN) | (1L << WHILE) | (1L << WITH) | (1L << RPAREN) | (1L << ID))) != 0)) {
				{
				{
				setState(140);
				element();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(LBRACE);
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

	public static class Expr_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(langosWithoutSyntaxParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(langosWithoutSyntaxParser.COMA, i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterExpr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitExpr_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitExpr_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << STRING) | (1L << BREAK) | (1L << CLASS) | (1L << CONTINUE) | (1L << IF) | (1L << MAP) | (1L << PAIRMAP) | (1L << RETURN) | (1L << WHILE) | (1L << WITH) | (1L << RPAREN) | (1L << ID))) != 0)) {
				{
				setState(148);
				expr();
				}
			}

			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(151);
				match(COMA);
				setState(152);
				expr();
				}
				}
				setState(157);
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

	public static class Func_argsContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(langosWithoutSyntaxParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(langosWithoutSyntaxParser.LPAREN, 0); }
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public List<Var_nameContext> var_name() {
			return getRuleContexts(Var_nameContext.class);
		}
		public Var_nameContext var_name(int i) {
			return getRuleContext(Var_nameContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(langosWithoutSyntaxParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(langosWithoutSyntaxParser.COMA, i);
		}
		public Func_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterFunc_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitFunc_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitFunc_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_argsContext func_args() throws RecognitionException {
		Func_argsContext _localctx = new Func_argsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_func_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(RPAREN);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(159);
				type_name();
				setState(160);
				var_name();
				}
			}

			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(164);
				match(COMA);
				setState(165);
				type_name();
				setState(166);
				var_name();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(LPAREN);
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

	public static class Method_call_Context extends ParserRuleContext {
		public Fun_nameContext fun_name() {
			return getRuleContext(Fun_nameContext.class,0);
		}
		public Parened_expr_listContext parened_expr_list() {
			return getRuleContext(Parened_expr_listContext.class,0);
		}
		public Method_call_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterMethod_call_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitMethod_call_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitMethod_call_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_call_Context method_call_() throws RecognitionException {
		Method_call_Context _localctx = new Method_call_Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_method_call_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			fun_name();
			setState(176);
			parened_expr_list();
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

	public static class Function_call_helper_methodContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Member_nameContext member_name() {
			return getRuleContext(Member_nameContext.class,0);
		}
		public Function_call_helper_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_helper_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterFunction_call_helper_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitFunction_call_helper_method(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitFunction_call_helper_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_helper_methodContext function_call_helper_method() throws RecognitionException {
		Function_call_helper_methodContext _localctx = new Function_call_helper_methodContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_call_helper_method);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				member_name();
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

	public static class Method_callContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(langosWithoutSyntaxParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(langosWithoutSyntaxParser.DOT, i);
		}
		public Method_call_Context method_call_() {
			return getRuleContext(Method_call_Context.class,0);
		}
		public Namspce_objContext namspce_obj() {
			return getRuleContext(Namspce_objContext.class,0);
		}
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public List<Function_call_helper_methodContext> function_call_helper_method() {
			return getRuleContexts(Function_call_helper_methodContext.class);
		}
		public Function_call_helper_methodContext function_call_helper_method(int i) {
			return getRuleContext(Function_call_helper_methodContext.class,i);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitMethod_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitMethod_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_method_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(182);
				namspce_obj();
				}
				break;
			case 2:
				{
				setState(183);
				class_name();
				}
				break;
			}
			setState(186);
			match(DOT);
			setState(187);
			method_call_();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(188);
				match(DOT);
				setState(189);
				function_call_helper_method();
				}
				}
				setState(194);
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

	public static class Function_callContext extends ParserRuleContext {
		public Fun_nameContext fun_name() {
			return getRuleContext(Fun_nameContext.class,0);
		}
		public Parened_expr_listContext parened_expr_list() {
			return getRuleContext(Parened_expr_listContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			fun_name();
			setState(196);
			parened_expr_list();
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

	public static class Function_call_helperContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Member_nameContext member_name() {
			return getRuleContext(Member_nameContext.class,0);
		}
		public Function_call_helperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_helper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterFunction_call_helper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitFunction_call_helper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitFunction_call_helper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_helperContext function_call_helper() throws RecognitionException {
		Function_call_helperContext _localctx = new Function_call_helperContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function_call_helper);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				member_name();
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

	public static class Function_call2Context extends ParserRuleContext {
		public Fun_nameContext fun_name() {
			return getRuleContext(Fun_nameContext.class,0);
		}
		public Parened_expr_listContext parened_expr_list() {
			return getRuleContext(Parened_expr_listContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(langosWithoutSyntaxParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(langosWithoutSyntaxParser.DOT, i);
		}
		public List<Function_call_helperContext> function_call_helper() {
			return getRuleContexts(Function_call_helperContext.class);
		}
		public Function_call_helperContext function_call_helper(int i) {
			return getRuleContext(Function_call_helperContext.class,i);
		}
		public Function_call2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterFunction_call2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitFunction_call2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitFunction_call2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call2Context function_call2() throws RecognitionException {
		Function_call2Context _localctx = new Function_call2Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_call2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			fun_name();
			setState(203);
			parened_expr_list();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(204);
				match(DOT);
				setState(205);
				function_call_helper();
				}
				}
				setState(210);
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

	public static class Function_call_Context extends ParserRuleContext {
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public Function_call2Context function_call2() {
			return getRuleContext(Function_call2Context.class,0);
		}
		public Function_call_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterFunction_call_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitFunction_call_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitFunction_call_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_Context function_call_() throws RecognitionException {
		Function_call_Context _localctx = new Function_call_Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_call_);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				method_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				function_call2();
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

	public static class Flow_controlContext extends ParserRuleContext {
		public Return_exprContext return_expr() {
			return getRuleContext(Return_exprContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(langosWithoutSyntaxParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(langosWithoutSyntaxParser.CONTINUE, 0); }
		public Flow_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterFlow_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitFlow_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitFlow_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flow_controlContext flow_control() throws RecognitionException {
		Flow_controlContext _localctx = new Flow_controlContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_flow_control);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				return_expr();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(BREAK);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(CONTINUE);
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

	public static class LambdaContext extends ParserRuleContext {
		public Parened_id_listContext parened_id_list() {
			return getRuleContext(Parened_id_listContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(langosWithoutSyntaxParser.ARROW, 0); }
		public Braced_elementContext braced_element() {
			return getRuleContext(Braced_elementContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaContext lambda() throws RecognitionException {
		LambdaContext _localctx = new LambdaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_lambda);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			parened_id_list();
			setState(221);
			match(ARROW);
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACE:
				{
				setState(222);
				braced_element();
				}
				break;
			case CHAR:
			case STRING:
			case BREAK:
			case CLASS:
			case CONTINUE:
			case IF:
			case MAP:
			case PAIRMAP:
			case RETURN:
			case WHILE:
			case WITH:
			case RPAREN:
			case ID:
				{
				setState(223);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Return_exprContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(langosWithoutSyntaxParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterReturn_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitReturn_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitReturn_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_exprContext return_expr() throws RecognitionException {
		Return_exprContext _localctx = new Return_exprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_return_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(RETURN);
			setState(227);
			expr();
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

	public static class ElementContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_element);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				expr();
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

	public static class With_bodyContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(langosWithoutSyntaxParser.ARROW, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public With_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterWith_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitWith_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitWith_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_bodyContext with_body() throws RecognitionException {
		With_bodyContext _localctx = new With_bodyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_with_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(ARROW);
			setState(234);
			expr();
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

	public static class With_synonymContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(langosWithoutSyntaxParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(langosWithoutSyntaxParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(langosWithoutSyntaxParser.LPAREN, 0); }
		public With_synonymContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_synonym; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterWith_synonym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitWith_synonym(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitWith_synonym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_synonymContext with_synonym() throws RecognitionException {
		With_synonymContext _localctx = new With_synonymContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_with_synonym);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(RPAREN);
			setState(237);
			match(ID);
			setState(238);
			match(LPAREN);
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

	public static class With_Context extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(langosWithoutSyntaxParser.WITH, 0); }
		public Parened_exprContext parened_expr() {
			return getRuleContext(Parened_exprContext.class,0);
		}
		public With_synonymContext with_synonym() {
			return getRuleContext(With_synonymContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(langosWithoutSyntaxParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(langosWithoutSyntaxParser.LBRACE, 0); }
		public List<With_bodyContext> with_body() {
			return getRuleContexts(With_bodyContext.class);
		}
		public With_bodyContext with_body(int i) {
			return getRuleContext(With_bodyContext.class,i);
		}
		public With_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterWith_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitWith_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitWith_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_Context with_() throws RecognitionException {
		With_Context _localctx = new With_Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_with_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(WITH);
			setState(241);
			parened_expr();
			setState(242);
			with_synonym();
			setState(243);
			match(RBRACE);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARROW) {
				{
				{
				setState(244);
				with_body();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
			match(LBRACE);
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

	public static class Parened_exprContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(langosWithoutSyntaxParser.RPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(langosWithoutSyntaxParser.LPAREN, 0); }
		public Parened_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parened_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterParened_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitParened_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitParened_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parened_exprContext parened_expr() throws RecognitionException {
		Parened_exprContext _localctx = new Parened_exprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_parened_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(RPAREN);
			setState(253);
			expr();
			setState(254);
			match(LPAREN);
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

	public static class Declare_memberContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(langosWithoutSyntaxParser.SEMI, 0); }
		public Declare_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterDeclare_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitDeclare_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitDeclare_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_memberContext declare_member() throws RecognitionException {
		Declare_memberContext _localctx = new Declare_memberContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_declare_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			type_name();
			setState(257);
			var_name();
			setState(258);
			match(SEMI);
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

	public static class Class_Context extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(langosWithoutSyntaxParser.CLASS, 0); }
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(langosWithoutSyntaxParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(langosWithoutSyntaxParser.LBRACE, 0); }
		public List<Declare_memberContext> declare_member() {
			return getRuleContexts(Declare_memberContext.class);
		}
		public Declare_memberContext declare_member(int i) {
			return getRuleContext(Declare_memberContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Class_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterClass_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitClass_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitClass_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_Context class_() throws RecognitionException {
		Class_Context _localctx = new Class_Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_class_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(CLASS);
			setState(261);
			class_name();
			setState(262);
			match(RBRACE);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << CHAR) | (1L << STRING) | (1L << BREAK) | (1L << CLASS) | (1L << CONTINUE) | (1L << IF) | (1L << MAP) | (1L << PAIRMAP) | (1L << RETURN) | (1L << WHILE) | (1L << WITH) | (1L << RPAREN) | (1L << ID))) != 0)) {
				{
				setState(265);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(263);
					declare_member();
					}
					break;
				case 2:
					{
					setState(264);
					element();
					}
					break;
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			match(LBRACE);
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
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_program);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				import_();
				}
				break;
			case T__0:
			case CHAR:
			case STRING:
			case BREAK:
			case CLASS:
			case CONTINUE:
			case IF:
			case MAP:
			case PAIRMAP:
			case RETURN:
			case WHILE:
			case WITH:
			case RPAREN:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				element();
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
		public TerminalNode EOF() { return getToken(langosWithoutSyntaxParser.EOF, 0); }
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterEntry_point(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitEntry_point(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitEntry_point(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entry_pointContext entry_point() throws RecognitionException {
		Entry_pointContext _localctx = new Entry_pointContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_entry_point);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << CHAR) | (1L << STRING) | (1L << IMPORT) | (1L << BREAK) | (1L << CLASS) | (1L << CONTINUE) | (1L << IF) | (1L << MAP) | (1L << PAIRMAP) | (1L << RETURN) | (1L << WHILE) | (1L << WITH) | (1L << RPAREN) | (1L << ID))) != 0)) {
				{
				{
				setState(276);
				program();
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
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

	public static class Parened_expr_listContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(langosWithoutSyntaxParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(langosWithoutSyntaxParser.LPAREN, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Parened_expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parened_expr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterParened_expr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitParened_expr_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitParened_expr_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parened_expr_listContext parened_expr_list() throws RecognitionException {
		Parened_expr_listContext _localctx = new Parened_expr_listContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_parened_expr_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(RPAREN);
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(285);
				expr_list();
				}
				break;
			}
			setState(288);
			match(LPAREN);
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

	public static class Parened_id_listContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(langosWithoutSyntaxParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(langosWithoutSyntaxParser.LPAREN, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Parened_id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parened_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).enterParened_id_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosWithoutSyntaxListener ) ((langosWithoutSyntaxListener)listener).exitParened_id_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosWithoutSyntaxVisitor ) return ((langosWithoutSyntaxVisitor<? extends T>)visitor).visitParened_id_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parened_id_listContext parened_id_list() throws RecognitionException {
		Parened_id_listContext _localctx = new Parened_id_listContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_parened_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(RPAREN);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(291);
				id_list();
				}
			}

			setState(294);
			match(LPAREN);
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
		"\u0004\u0001%\u0129\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000O\b\u0000\n\u0000\f\u0000R\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003_\b\u0003\n\u0003\f\u0003"+
		"b\t\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0004\bo"+
		"\b\b\u000b\b\f\bp\u0001\t\u0001\t\u0001\n\u0003\nv\b\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0086\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\r"+
		"\u008e\b\r\n\r\f\r\u0091\t\r\u0001\r\u0001\r\u0001\u000e\u0003\u000e\u0096"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u009a\b\u000e\n\u000e\f\u000e"+
		"\u009d\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00a3\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u00a9\b\u000f\n\u000f\f\u000f\u00ac\t\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00b5"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u00b9\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00bf\b\u0012\n\u0012"+
		"\f\u0012\u00c2\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u00c9\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u00cf\b\u0015\n\u0015\f\u0015\u00d2\t\u0015\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u00d6\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u00db\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u00e1\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u00e8\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u00f6\b\u001d\n"+
		"\u001d\f\u001d\u00f9\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u010a\b \n \f \u010d"+
		"\t \u0001 \u0001 \u0001!\u0001!\u0003!\u0113\b!\u0001\"\u0005\"\u0116"+
		"\b\"\n\"\f\"\u0119\t\"\u0001\"\u0001\"\u0001#\u0001#\u0003#\u011f\b#\u0001"+
		"#\u0001#\u0001$\u0001$\u0003$\u0125\b$\u0001$\u0001$\u0001$\u0000\u0000"+
		"%\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFH\u0000\u0001\u0003\u0000\t\u000b\u000e"+
		"\u000e%%\u0125\u0000J\u0001\u0000\u0000\u0000\u0002U\u0001\u0000\u0000"+
		"\u0000\u0004Y\u0001\u0000\u0000\u0000\u0006[\u0001\u0000\u0000\u0000\b"+
		"c\u0001\u0000\u0000\u0000\ne\u0001\u0000\u0000\u0000\fg\u0001\u0000\u0000"+
		"\u0000\u000ei\u0001\u0000\u0000\u0000\u0010k\u0001\u0000\u0000\u0000\u0012"+
		"r\u0001\u0000\u0000\u0000\u0014u\u0001\u0000\u0000\u0000\u0016\u0085\u0001"+
		"\u0000\u0000\u0000\u0018\u0087\u0001\u0000\u0000\u0000\u001a\u008b\u0001"+
		"\u0000\u0000\u0000\u001c\u0095\u0001\u0000\u0000\u0000\u001e\u009e\u0001"+
		"\u0000\u0000\u0000 \u00af\u0001\u0000\u0000\u0000\"\u00b4\u0001\u0000"+
		"\u0000\u0000$\u00b8\u0001\u0000\u0000\u0000&\u00c3\u0001\u0000\u0000\u0000"+
		"(\u00c8\u0001\u0000\u0000\u0000*\u00ca\u0001\u0000\u0000\u0000,\u00d5"+
		"\u0001\u0000\u0000\u0000.\u00da\u0001\u0000\u0000\u00000\u00dc\u0001\u0000"+
		"\u0000\u00002\u00e2\u0001\u0000\u0000\u00004\u00e7\u0001\u0000\u0000\u0000"+
		"6\u00e9\u0001\u0000\u0000\u00008\u00ec\u0001\u0000\u0000\u0000:\u00f0"+
		"\u0001\u0000\u0000\u0000<\u00fc\u0001\u0000\u0000\u0000>\u0100\u0001\u0000"+
		"\u0000\u0000@\u0104\u0001\u0000\u0000\u0000B\u0112\u0001\u0000\u0000\u0000"+
		"D\u0117\u0001\u0000\u0000\u0000F\u011c\u0001\u0000\u0000\u0000H\u0122"+
		"\u0001\u0000\u0000\u0000JK\u0005\u0005\u0000\u0000KP\u0005%\u0000\u0000"+
		"LM\u0005\u0015\u0000\u0000MO\u0005%\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u0005\"\u0000"+
		"\u0000T\u0001\u0001\u0000\u0000\u0000UV\u0005\u0017\u0000\u0000VW\u0005"+
		"%\u0000\u0000WX\u0005\u0016\u0000\u0000X\u0003\u0001\u0000\u0000\u0000"+
		"YZ\u0007\u0000\u0000\u0000Z\u0005\u0001\u0000\u0000\u0000[`\u0005%\u0000"+
		"\u0000\\]\u0005#\u0000\u0000]_\u0005%\u0000\u0000^\\\u0001\u0000\u0000"+
		"\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000a\u0007\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"cd\u0005%\u0000\u0000d\t\u0001\u0000\u0000\u0000ef\u0005%\u0000\u0000"+
		"f\u000b\u0001\u0000\u0000\u0000gh\u0005%\u0000\u0000h\r\u0001\u0000\u0000"+
		"\u0000ij\u0005%\u0000\u0000j\u000f\u0001\u0000\u0000\u0000kn\u0005%\u0000"+
		"\u0000lm\u0005 \u0000\u0000mo\u0005%\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000q\u0011\u0001\u0000\u0000\u0000rs\u0005\u0001\u0000\u0000s\u0013"+
		"\u0001\u0000\u0000\u0000tv\u0003\u0012\t\u0000ut\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0003\b\u0004\u0000"+
		"xy\u0003\n\u0005\u0000yz\u0003\u001e\u000f\u0000z{\u0003\u001a\r\u0000"+
		"{\u0015\u0001\u0000\u0000\u0000|\u0086\u0003:\u001d\u0000}\u0086\u0003"+
		".\u0017\u0000~\u0086\u0003,\u0016\u0000\u007f\u0086\u0003@ \u0000\u0080"+
		"\u0086\u00030\u0018\u0000\u0081\u0086\u0003\u0018\f\u0000\u0082\u0086"+
		"\u0005\u0002\u0000\u0000\u0083\u0086\u0005\u0003\u0000\u0000\u0084\u0086"+
		"\u0005%\u0000\u0000\u0085|\u0001\u0000\u0000\u0000\u0085}\u0001\u0000"+
		"\u0000\u0000\u0085~\u0001\u0000\u0000\u0000\u0085\u007f\u0001\u0000\u0000"+
		"\u0000\u0085\u0080\u0001\u0000\u0000\u0000\u0085\u0081\u0001\u0000\u0000"+
		"\u0000\u0085\u0082\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0017\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0003\f\u0006\u0000\u0088\u0089\u0005\u0015\u0000\u0000"+
		"\u0089\u008a\u0003\u000e\u0007\u0000\u008a\u0019\u0001\u0000\u0000\u0000"+
		"\u008b\u008f\u0005\u0019\u0000\u0000\u008c\u008e\u00034\u001a\u0000\u008d"+
		"\u008c\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		"\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0005\u0018\u0000\u0000\u0093\u001b\u0001\u0000\u0000\u0000\u0094"+
		"\u0096\u0003\u0016\u000b\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u009b\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0005#\u0000\u0000\u0098\u009a\u0003\u0016\u000b\u0000\u0099\u0097"+
		"\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u001d"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u00a2"+
		"\u0005\u0017\u0000\u0000\u009f\u00a0\u0003\b\u0004\u0000\u00a0\u00a1\u0003"+
		"\n\u0005\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u009f\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00aa\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0005#\u0000\u0000\u00a5\u00a6\u0003\b\u0004"+
		"\u0000\u00a6\u00a7\u0003\n\u0005\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a4\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0005\u0016\u0000\u0000\u00ae\u001f\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0003\u0004\u0002\u0000\u00b0\u00b1\u0003F#\u0000\u00b1!"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b5\u0003&\u0013\u0000\u00b3\u00b5\u0003"+
		"\u000e\u0007\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b5#\u0001\u0000\u0000\u0000\u00b6\u00b9\u0003\u0010"+
		"\b\u0000\u00b7\u00b9\u0003\f\u0006\u0000\u00b8\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0005\u0015\u0000\u0000\u00bb\u00c0\u0003 \u0010\u0000"+
		"\u00bc\u00bd\u0005\u0015\u0000\u0000\u00bd\u00bf\u0003\"\u0011\u0000\u00be"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0"+
		"\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1"+
		"%\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0003\u0004\u0002\u0000\u00c4\u00c5\u0003F#\u0000\u00c5\'\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c9\u0003&\u0013\u0000\u00c7\u00c9\u0003\u000e\u0007"+
		"\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9)\u0001\u0000\u0000\u0000\u00ca\u00cb\u0003\u0004\u0002\u0000"+
		"\u00cb\u00d0\u0003F#\u0000\u00cc\u00cd\u0005\u0015\u0000\u0000\u00cd\u00cf"+
		"\u0003(\u0014\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d1+\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d6\u0003$\u0012\u0000\u00d4\u00d6\u0003*\u0015\u0000"+
		"\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d6-\u0001\u0000\u0000\u0000\u00d7\u00db\u00032\u0019\u0000\u00d8\u00db"+
		"\u0005\u0006\u0000\u0000\u00d9\u00db\u0005\b\u0000\u0000\u00da\u00d7\u0001"+
		"\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00d9\u0001"+
		"\u0000\u0000\u0000\u00db/\u0001\u0000\u0000\u0000\u00dc\u00dd\u0003H$"+
		"\u0000\u00dd\u00e0\u0005$\u0000\u0000\u00de\u00e1\u0003\u001a\r\u0000"+
		"\u00df\u00e1\u0003\u0016\u000b\u0000\u00e0\u00de\u0001\u0000\u0000\u0000"+
		"\u00e0\u00df\u0001\u0000\u0000\u0000\u00e11\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0005\f\u0000\u0000\u00e3\u00e4\u0003\u0016\u000b\u0000\u00e43"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e8\u0003\u0014\n\u0000\u00e6\u00e8\u0003"+
		"\u0016\u000b\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e85\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005$\u0000"+
		"\u0000\u00ea\u00eb\u0003\u0016\u000b\u0000\u00eb7\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0005\u0017\u0000\u0000\u00ed\u00ee\u0005%\u0000\u0000\u00ee"+
		"\u00ef\u0005\u0016\u0000\u0000\u00ef9\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0005\u000f\u0000\u0000\u00f1\u00f2\u0003<\u001e\u0000\u00f2\u00f3\u0003"+
		"8\u001c\u0000\u00f3\u00f7\u0005\u0019\u0000\u0000\u00f4\u00f6\u00036\u001b"+
		"\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0005\u0018\u0000\u0000\u00fb;\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0005\u0017\u0000\u0000\u00fd\u00fe\u0003\u0016\u000b\u0000"+
		"\u00fe\u00ff\u0005\u0016\u0000\u0000\u00ff=\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0003\b\u0004\u0000\u0101\u0102\u0003\n\u0005\u0000\u0102\u0103"+
		"\u0005\"\u0000\u0000\u0103?\u0001\u0000\u0000\u0000\u0104\u0105\u0005"+
		"\u0007\u0000\u0000\u0105\u0106\u0003\f\u0006\u0000\u0106\u010b\u0005\u0019"+
		"\u0000\u0000\u0107\u010a\u0003>\u001f\u0000\u0108\u010a\u00034\u001a\u0000"+
		"\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000"+
		"\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010e\u0001\u0000\u0000\u0000"+
		"\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u010f\u0005\u0018\u0000\u0000"+
		"\u010fA\u0001\u0000\u0000\u0000\u0110\u0113\u0003\u0000\u0000\u0000\u0111"+
		"\u0113\u00034\u001a\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0111"+
		"\u0001\u0000\u0000\u0000\u0113C\u0001\u0000\u0000\u0000\u0114\u0116\u0003"+
		"B!\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000\u0000"+
		"\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000"+
		"\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000"+
		"\u0000\u011a\u011b\u0005\u0000\u0000\u0001\u011bE\u0001\u0000\u0000\u0000"+
		"\u011c\u011e\u0005\u0017\u0000\u0000\u011d\u011f\u0003\u001c\u000e\u0000"+
		"\u011e\u011d\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u0005\u0016\u0000\u0000"+
		"\u0121G\u0001\u0000\u0000\u0000\u0122\u0124\u0005\u0017\u0000\u0000\u0123"+
		"\u0125\u0003\u0006\u0003\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0124"+
		"\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126"+
		"\u0127\u0005\u0016\u0000\u0000\u0127I\u0001\u0000\u0000\u0000\u001aP`"+
		"pu\u0085\u008f\u0095\u009b\u00a2\u00aa\u00b4\u00b8\u00c0\u00c8\u00d0\u00d5"+
		"\u00da\u00e0\u00e7\u00f7\u0109\u010b\u0112\u0117\u011e\u0124";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}