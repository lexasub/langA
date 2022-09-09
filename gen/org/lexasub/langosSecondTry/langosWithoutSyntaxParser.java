// Generated from /home/su/IdeaProjects/langA/langosWithoutSyntax.g4 by ANTLR 4.10.1
package org.lexasub.langosSecondTry;
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
		T__0=1, CHAR=2, STRING=3, IMPORT=4, SYNTAX=5, RETURN=6, WITH=7, MAP=8, 
		PAIRMAP=9, IF=10, WHILE=11, CONTINUE=12, BREAK=13, CLASS=14, KWD=15, QUEST=16, 
		STAR=17, PLUS=18, MINUS=19, ASSIGN=20, DOT=21, LPAREN=22, RPAREN=23, LBRACE=24, 
		RBRACE=25, LEND=26, REND=27, BAR=28, GT=29, LT=30, CIRCUMFLEX=31, DOUBLECOLON=32, 
		COLON=33, SEMI=34, COMA=35, ARROW=36, ID=37;
	public static final int
		RULE_import_ = 0, RULE_fun_name = 1, RULE_id_list = 2, RULE_type_name = 3, 
		RULE_var_name = 4, RULE_class_name = 5, RULE_member_name = 6, RULE_namspce_obj = 7, 
		RULE_id_strong = 8, RULE_function_specifier = 9, RULE_function = 10, RULE_expr = 11, 
		RULE_get_member = 12, RULE_braced_element = 13, RULE_expr_list = 14, RULE_func_args = 15, 
		RULE_method_call = 16, RULE_function_call = 17, RULE_function_call_helper = 18, 
		RULE_function_call_ = 19, RULE_flow_control = 20, RULE_lambda = 21, RULE_return_expr = 22, 
		RULE_element = 23, RULE_class_ = 24, RULE_program = 25, RULE_entry_point = 26, 
		RULE_parened_expr_list = 27, RULE_parened_id_list = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"import_", "fun_name", "id_list", "type_name", "var_name", "class_name", 
			"member_name", "namspce_obj", "id_strong", "function_specifier", "function", 
			"expr", "get_member", "braced_element", "expr_list", "func_args", "method_call", 
			"function_call", "function_call_helper", "function_call_", "flow_control", 
			"lambda", "return_expr", "element", "class_", "program", "entry_point", 
			"parened_expr_list", "parened_id_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$'", null, null, "'import'", "'syntax'", "'return'", "'with'", 
			"'map'", "'pairmap'", "'if'", "'while'", "'continue'", "'break'", "'class'", 
			null, "'?'", "'*'", "'+'", "'-'", "'='", "'.'", "')'", "'('", "'}'", 
			"'{'", "']'", "'['", "'|'", "'>'", "'<'", "'^'", "'::'", "':'", "';'", 
			"','", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "CHAR", "STRING", "IMPORT", "SYNTAX", "RETURN", "WITH", "MAP", 
			"PAIRMAP", "IF", "WHILE", "CONTINUE", "BREAK", "CLASS", "KWD", "QUEST", 
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
			setState(58);
			match(IMPORT);
			setState(59);
			match(ID);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(60);
				match(DOT);
				setState(61);
				match(ID);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
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
		enterRule(_localctx, 2, RULE_fun_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAP) | (1L << PAIRMAP) | (1L << IF) | (1L << WHILE) | (1L << ID))) != 0)) ) {
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
		enterRule(_localctx, 4, RULE_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ID);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(72);
				match(COMA);
				setState(73);
				match(ID);
				}
				}
				setState(78);
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
		enterRule(_localctx, 6, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
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
		enterRule(_localctx, 8, RULE_var_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		enterRule(_localctx, 10, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		enterRule(_localctx, 12, RULE_member_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
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
		enterRule(_localctx, 14, RULE_namspce_obj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(ID);
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88);
				match(DOUBLECOLON);
				setState(89);
				match(ID);
				}
				}
				setState(92); 
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
		enterRule(_localctx, 16, RULE_id_strong);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(RPAREN);
			setState(95);
			match(ID);
			setState(96);
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
			setState(98);
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
		public TerminalNode ID() { return getToken(langosWithoutSyntaxParser.ID, 0); }
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
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(100);
				function_specifier();
				}
			}

			setState(103);
			type_name();
			setState(104);
			match(ID);
			setState(105);
			func_args();
			setState(106);
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
		public Flow_controlContext flow_control() {
			return getRuleContext(Flow_controlContext.class,0);
		}
		public Function_call_Context function_call_() {
			return getRuleContext(Function_call_Context.class,0);
		}
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public Get_memberContext get_member() {
			return getRuleContext(Get_memberContext.class,0);
		}
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
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				flow_control();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				function_call_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				lambda();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				get_member();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
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
		public TerminalNode ID() { return getToken(langosWithoutSyntaxParser.ID, 0); }
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
			setState(115);
			match(ID);
			setState(116);
			match(DOT);
			setState(117);
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
			setState(119);
			match(RBRACE);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << RETURN) | (1L << MAP) | (1L << PAIRMAP) | (1L << IF) | (1L << WHILE) | (1L << CONTINUE) | (1L << BREAK) | (1L << RPAREN) | (1L << ID))) != 0)) {
				{
				{
				setState(120);
				element();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
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
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << MAP) | (1L << PAIRMAP) | (1L << IF) | (1L << WHILE) | (1L << CONTINUE) | (1L << BREAK) | (1L << RPAREN) | (1L << ID))) != 0)) {
				{
				setState(128);
				expr();
				}
			}

			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(131);
				match(COMA);
				setState(132);
				expr();
				}
				}
				setState(137);
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
		public TerminalNode LPAREN() { return getToken(langosWithoutSyntaxParser.LPAREN, 0); }
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
			setState(138);
			match(RPAREN);
			setState(139);
			type_name();
			setState(140);
			var_name();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(141);
				match(COMA);
				setState(142);
				type_name();
				setState(143);
				var_name();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
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

	public static class Method_callContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(langosWithoutSyntaxParser.DOT, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Namspce_objContext namspce_obj() {
			return getRuleContext(Namspce_objContext.class,0);
		}
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
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
		enterRule(_localctx, 32, RULE_method_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(152);
				namspce_obj();
				}
				break;
			case 2:
				{
				setState(153);
				class_name();
				}
				break;
			}
			setState(156);
			match(DOT);
			setState(157);
			function_call();
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
		enterRule(_localctx, 34, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			fun_name();
			setState(160);
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
		enterRule(_localctx, 36, RULE_function_call_helper);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
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

	public static class Function_call_Context extends ParserRuleContext {
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
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
		enterRule(_localctx, 38, RULE_function_call_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(166);
				method_call();
				}
				break;
			case 2:
				{
				setState(167);
				function_call();
				}
				break;
			}
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(170);
				match(DOT);
				setState(171);
				function_call_helper();
				}
				}
				setState(176);
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
		enterRule(_localctx, 40, RULE_flow_control);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				return_expr();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(BREAK);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
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
		enterRule(_localctx, 42, RULE_lambda);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			parened_id_list();
			setState(183);
			match(ARROW);
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACE:
				{
				setState(184);
				braced_element();
				}
				break;
			case RETURN:
			case MAP:
			case PAIRMAP:
			case IF:
			case WHILE:
			case CONTINUE:
			case BREAK:
			case RPAREN:
			case ID:
				{
				setState(185);
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
		enterRule(_localctx, 44, RULE_return_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(RETURN);
			setState(189);
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
		enterRule(_localctx, 46, RULE_element);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
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

	public static class Class_Context extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(langosWithoutSyntaxParser.CLASS, 0); }
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Braced_elementContext braced_element() {
			return getRuleContext(Braced_elementContext.class,0);
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
		enterRule(_localctx, 48, RULE_class_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(CLASS);
			setState(196);
			class_name();
			setState(197);
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
		enterRule(_localctx, 50, RULE_program);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				import_();
				}
				break;
			case T__0:
			case RETURN:
			case MAP:
			case PAIRMAP:
			case IF:
			case WHILE:
			case CONTINUE:
			case BREAK:
			case RPAREN:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
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
		enterRule(_localctx, 52, RULE_entry_point);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IMPORT) | (1L << RETURN) | (1L << MAP) | (1L << PAIRMAP) | (1L << IF) | (1L << WHILE) | (1L << CONTINUE) | (1L << BREAK) | (1L << RPAREN) | (1L << ID))) != 0)) {
				{
				{
				setState(203);
				program();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
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
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(langosWithoutSyntaxParser.LPAREN, 0); }
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
		enterRule(_localctx, 54, RULE_parened_expr_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(RPAREN);
			setState(212);
			expr_list();
			setState(213);
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
		enterRule(_localctx, 56, RULE_parened_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(RPAREN);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(216);
				id_list();
				}
			}

			setState(219);
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
		"\u0004\u0001%\u00de\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000?\b\u0000\n\u0000\f\u0000B\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"K\b\u0002\n\u0002\f\u0002N\t\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007[\b\u0007\u000b\u0007\f\u0007\\\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0003\nf\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000br\b\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0005\rz\b\r\n\r\f\r}\t\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0003\u000e\u0082\b\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0086"+
		"\b\u000e\n\u000e\f\u000e\u0089\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0092\b\u000f"+
		"\n\u000f\f\u000f\u0095\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u009b\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u00a5"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u00a9\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u00ad\b\u0013\n\u0013\f\u0013\u00b0\t\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00b5\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00bb\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u00c2\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u00ca\b\u0019\u0001\u001a\u0005\u001a\u00cd\b\u001a\n\u001a\f\u001a"+
		"\u00d0\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u00da\b\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0000\u0000\u001d\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8\u0000\u0001\u0002\u0000\b\u000b%%\u00d7\u0000:\u0001\u0000\u0000\u0000"+
		"\u0002E\u0001\u0000\u0000\u0000\u0004G\u0001\u0000\u0000\u0000\u0006O"+
		"\u0001\u0000\u0000\u0000\bQ\u0001\u0000\u0000\u0000\nS\u0001\u0000\u0000"+
		"\u0000\fU\u0001\u0000\u0000\u0000\u000eW\u0001\u0000\u0000\u0000\u0010"+
		"^\u0001\u0000\u0000\u0000\u0012b\u0001\u0000\u0000\u0000\u0014e\u0001"+
		"\u0000\u0000\u0000\u0016q\u0001\u0000\u0000\u0000\u0018s\u0001\u0000\u0000"+
		"\u0000\u001aw\u0001\u0000\u0000\u0000\u001c\u0081\u0001\u0000\u0000\u0000"+
		"\u001e\u008a\u0001\u0000\u0000\u0000 \u009a\u0001\u0000\u0000\u0000\""+
		"\u009f\u0001\u0000\u0000\u0000$\u00a4\u0001\u0000\u0000\u0000&\u00a8\u0001"+
		"\u0000\u0000\u0000(\u00b4\u0001\u0000\u0000\u0000*\u00b6\u0001\u0000\u0000"+
		"\u0000,\u00bc\u0001\u0000\u0000\u0000.\u00c1\u0001\u0000\u0000\u00000"+
		"\u00c3\u0001\u0000\u0000\u00002\u00c9\u0001\u0000\u0000\u00004\u00ce\u0001"+
		"\u0000\u0000\u00006\u00d3\u0001\u0000\u0000\u00008\u00d7\u0001\u0000\u0000"+
		"\u0000:;\u0005\u0004\u0000\u0000;@\u0005%\u0000\u0000<=\u0005\u0015\u0000"+
		"\u0000=?\u0005%\u0000\u0000><\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000"+
		"\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000"+
		"\u0000\u0000B@\u0001\u0000\u0000\u0000CD\u0005\"\u0000\u0000D\u0001\u0001"+
		"\u0000\u0000\u0000EF\u0007\u0000\u0000\u0000F\u0003\u0001\u0000\u0000"+
		"\u0000GL\u0005%\u0000\u0000HI\u0005#\u0000\u0000IK\u0005%\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000M\u0005\u0001\u0000\u0000\u0000NL\u0001"+
		"\u0000\u0000\u0000OP\u0005%\u0000\u0000P\u0007\u0001\u0000\u0000\u0000"+
		"QR\u0005%\u0000\u0000R\t\u0001\u0000\u0000\u0000ST\u0005%\u0000\u0000"+
		"T\u000b\u0001\u0000\u0000\u0000UV\u0005%\u0000\u0000V\r\u0001\u0000\u0000"+
		"\u0000WZ\u0005%\u0000\u0000XY\u0005 \u0000\u0000Y[\u0005%\u0000\u0000"+
		"ZX\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]\u000f\u0001\u0000\u0000\u0000^_\u0005"+
		"\u0017\u0000\u0000_`\u0005%\u0000\u0000`a\u0005\u0016\u0000\u0000a\u0011"+
		"\u0001\u0000\u0000\u0000bc\u0005\u0001\u0000\u0000c\u0013\u0001\u0000"+
		"\u0000\u0000df\u0003\u0012\t\u0000ed\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0003\u0006\u0003\u0000hi\u0005"+
		"%\u0000\u0000ij\u0003\u001e\u000f\u0000jk\u0003\u001a\r\u0000k\u0015\u0001"+
		"\u0000\u0000\u0000lr\u0003(\u0014\u0000mr\u0003&\u0013\u0000nr\u0003*"+
		"\u0015\u0000or\u0003\u0018\f\u0000pr\u0005%\u0000\u0000ql\u0001\u0000"+
		"\u0000\u0000qm\u0001\u0000\u0000\u0000qn\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000r\u0017\u0001\u0000\u0000"+
		"\u0000st\u0005%\u0000\u0000tu\u0005\u0015\u0000\u0000uv\u0003\f\u0006"+
		"\u0000v\u0019\u0001\u0000\u0000\u0000w{\u0005\u0019\u0000\u0000xz\u0003"+
		".\u0017\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000\u0000"+
		"}{\u0001\u0000\u0000\u0000~\u007f\u0005\u0018\u0000\u0000\u007f\u001b"+
		"\u0001\u0000\u0000\u0000\u0080\u0082\u0003\u0016\u000b\u0000\u0081\u0080"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0087"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0005#\u0000\u0000\u0084\u0086\u0003"+
		"\u0016\u000b\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0089\u0001"+
		"\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001"+
		"\u0000\u0000\u0000\u0088\u001d\u0001\u0000\u0000\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005\u0017\u0000\u0000\u008b\u008c\u0003"+
		"\u0006\u0003\u0000\u008c\u0093\u0003\b\u0004\u0000\u008d\u008e\u0005#"+
		"\u0000\u0000\u008e\u008f\u0003\u0006\u0003\u0000\u008f\u0090\u0003\b\u0004"+
		"\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008d\u0001\u0000\u0000"+
		"\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000"+
		"\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0016\u0000"+
		"\u0000\u0097\u001f\u0001\u0000\u0000\u0000\u0098\u009b\u0003\u000e\u0007"+
		"\u0000\u0099\u009b\u0003\n\u0005\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0005\u0015\u0000\u0000\u009d\u009e\u0003\"\u0011\u0000\u009e"+
		"!\u0001\u0000\u0000\u0000\u009f\u00a0\u0003\u0002\u0001\u0000\u00a0\u00a1"+
		"\u00036\u001b\u0000\u00a1#\u0001\u0000\u0000\u0000\u00a2\u00a5\u0003\""+
		"\u0011\u0000\u00a3\u00a5\u0003\f\u0006\u0000\u00a4\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5%\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a9\u0003 \u0010\u0000\u00a7\u00a9\u0003\"\u0011\u0000\u00a8"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ae\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0015\u0000\u0000\u00ab"+
		"\u00ad\u0003$\u0012\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00b0"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0001\u0000\u0000\u0000\u00af\'\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b5\u0003,\u0016\u0000\u00b2\u00b5\u0005\r"+
		"\u0000\u0000\u00b3\u00b5\u0005\f\u0000\u0000\u00b4\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b5)\u0001\u0000\u0000\u0000\u00b6\u00b7\u00038\u001c\u0000\u00b7"+
		"\u00ba\u0005$\u0000\u0000\u00b8\u00bb\u0003\u001a\r\u0000\u00b9\u00bb"+
		"\u0003\u0016\u000b\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bb+\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005"+
		"\u0006\u0000\u0000\u00bd\u00be\u0003\u0016\u000b\u0000\u00be-\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c2\u0003\u0014\n\u0000\u00c0\u00c2\u0003\u0016\u000b"+
		"\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2/\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u000e\u0000\u0000"+
		"\u00c4\u00c5\u0003\n\u0005\u0000\u00c5\u00c6\u0003\u001a\r\u0000\u00c6"+
		"1\u0001\u0000\u0000\u0000\u00c7\u00ca\u0003\u0000\u0000\u0000\u00c8\u00ca"+
		"\u0003.\u0017\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00c8\u0001"+
		"\u0000\u0000\u0000\u00ca3\u0001\u0000\u0000\u0000\u00cb\u00cd\u00032\u0019"+
		"\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0005\u0000\u0000\u0001\u00d25\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0005\u0017\u0000\u0000\u00d4\u00d5\u0003\u001c\u000e\u0000"+
		"\u00d5\u00d6\u0005\u0016\u0000\u0000\u00d67\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d9\u0005\u0017\u0000\u0000\u00d8\u00da\u0003\u0004\u0002\u0000\u00d9"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u0016\u0000\u0000\u00dc"+
		"9\u0001\u0000\u0000\u0000\u0013@L\\eq{\u0081\u0087\u0093\u009a\u00a4\u00a8"+
		"\u00ae\u00b4\u00ba\u00c1\u00c9\u00ce\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}