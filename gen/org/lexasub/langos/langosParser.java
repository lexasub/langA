// Generated from /home/support-pc/Рабочий стол/техподдержка/отчеты/Копытцев А А/others/inteljidea/langA_/langos.g4 by ANTLR 4.10.1
package org.lexasub.langos;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class langosParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, IMPORT=2, SYNTAX=3, RETURN=4, WITH=5, QUEST=6, STAR=7, PLUS=8, ASSIGN=9, 
		DOT=10, LPAREN=11, RPAREN=12, LBRACE=13, RBRACE=14, LEND=15, REND=16, 
		BAR=17, GT=18, LT=19, CIRCUMFLEX=20, ID=21, COLON=22, SEMI=23, COMA=24, 
		DOUBLECOLON=25, ARROW=26, CHAR=27, STRING=28;
	public static final int
		RULE_rulelist = 0, RULE_rule_ = 1, RULE_alternative = 2, RULE_alternatives = 3, 
		RULE_alternatives_strong = 4, RULE_bnf_not = 5, RULE_element = 6, RULE_range_ = 7, 
		RULE_optional_ = 8, RULE_zeroormore = 9, RULE_zeroormore_non_gready = 10, 
		RULE_oneormore = 11, RULE_syntax_ = 12, RULE_syntax_namespace_obj = 13, 
		RULE_syntax_impl = 14, RULE_syntax_return = 15, RULE_syntax_rule_call = 16, 
		RULE_syntax_lambda = 17, RULE_syntax_object_getter = 18, RULE_syntax_text_getter = 19, 
		RULE_syntax_method_call_begin = 20, RULE_syntax_method_call_body = 21, 
		RULE_syntax_method_call = 22, RULE_syntax_expr = 23, RULE_syntax_expr_strong = 24, 
		RULE_syntax_impl_body = 25, RULE_import_ = 26, RULE_program = 27, RULE_entry_point = 28, 
		RULE_id_list = 29, RULE_id_list_strong = 30, RULE_id_strong = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"rulelist", "rule_", "alternative", "alternatives", "alternatives_strong", 
			"bnf_not", "element", "range_", "optional_", "zeroormore", "zeroormore_non_gready", 
			"oneormore", "syntax_", "syntax_namespace_obj", "syntax_impl", "syntax_return", 
			"syntax_rule_call", "syntax_lambda", "syntax_object_getter", "syntax_text_getter", 
			"syntax_method_call_begin", "syntax_method_call_body", "syntax_method_call", 
			"syntax_expr", "syntax_expr_strong", "syntax_impl_body", "import_", "program", 
			"entry_point", "id_list", "id_list_strong", "id_strong"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'import'", "'syntax'", "'return'", "'with'", "'?'", "'*'", 
			"'+'", "'='", "'.'", "')'", "'('", "'}'", "'{'", "']'", "'['", "'|'", 
			"'>'", "'<'", "'^'", null, "': '", "';'", "','", "'::'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "IMPORT", "SYNTAX", "RETURN", "WITH", "QUEST", "STAR", "PLUS", 
			"ASSIGN", "DOT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LEND", "REND", 
			"BAR", "GT", "LT", "CIRCUMFLEX", "ID", "COLON", "SEMI", "COMA", "DOUBLECOLON", 
			"ARROW", "CHAR", "STRING"
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
	public String getGrammarFileName() { return "langos.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public langosParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RulelistContext extends ParserRuleContext {
		public List<Rule_Context> rule_() {
			return getRuleContexts(Rule_Context.class);
		}
		public Rule_Context rule_(int i) {
			return getRuleContext(Rule_Context.class,i);
		}
		public RulelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterRulelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitRulelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitRulelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulelistContext rulelist() throws RecognitionException {
		RulelistContext _localctx = new RulelistContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_rulelist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				rule_();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class Rule_Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(langosParser.ID, 0); }
		public TerminalNode COLON() { return getToken(langosParser.COLON, 0); }
		public AlternativesContext alternatives() {
			return getRuleContext(AlternativesContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(langosParser.SEMI, 0); }
		public Rule_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterRule_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitRule_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitRule_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_Context rule_() throws RecognitionException {
		Rule_Context _localctx = new Rule_Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_rule_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(ID);
			setState(70);
			match(COLON);
			setState(71);
			alternatives();
			setState(72);
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

	public static class AlternativeContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public AlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitAlternative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternativeContext alternative() throws RecognitionException {
		AlternativeContext _localctx = new AlternativeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				element();
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RPAREN) | (1L << ID) | (1L << CHAR) | (1L << STRING))) != 0) );
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

	public static class AlternativesContext extends ParserRuleContext {
		public List<AlternativeContext> alternative() {
			return getRuleContexts(AlternativeContext.class);
		}
		public AlternativeContext alternative(int i) {
			return getRuleContext(AlternativeContext.class,i);
		}
		public List<TerminalNode> BAR() { return getTokens(langosParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(langosParser.BAR, i);
		}
		public AlternativesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternatives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterAlternatives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitAlternatives(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitAlternatives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternativesContext alternatives() throws RecognitionException {
		AlternativesContext _localctx = new AlternativesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alternatives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			alternative();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BAR) {
				{
				{
				setState(80);
				match(BAR);
				setState(81);
				alternative();
				}
				}
				setState(86);
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

	public static class Alternatives_strongContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(langosParser.RPAREN, 0); }
		public AlternativesContext alternatives() {
			return getRuleContext(AlternativesContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(langosParser.LPAREN, 0); }
		public Alternatives_strongContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternatives_strong; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterAlternatives_strong(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitAlternatives_strong(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitAlternatives_strong(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alternatives_strongContext alternatives_strong() throws RecognitionException {
		Alternatives_strongContext _localctx = new Alternatives_strongContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alternatives_strong);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(RPAREN);
			setState(88);
			alternatives();
			setState(89);
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

	public static class Bnf_notContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(langosParser.RPAREN, 0); }
		public TerminalNode CIRCUMFLEX() { return getToken(langosParser.CIRCUMFLEX, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(langosParser.LPAREN, 0); }
		public Bnf_notContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bnf_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterBnf_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitBnf_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitBnf_not(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bnf_notContext bnf_not() throws RecognitionException {
		Bnf_notContext _localctx = new Bnf_notContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bnf_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(RPAREN);
			setState(92);
			match(CIRCUMFLEX);
			setState(93);
			element();
			setState(94);
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

	public static class ElementContext extends ParserRuleContext {
		public Bnf_notContext bnf_not() {
			return getRuleContext(Bnf_notContext.class,0);
		}
		public Zeroormore_non_greadyContext zeroormore_non_gready() {
			return getRuleContext(Zeroormore_non_greadyContext.class,0);
		}
		public Optional_Context optional_() {
			return getRuleContext(Optional_Context.class,0);
		}
		public ZeroormoreContext zeroormore() {
			return getRuleContext(ZeroormoreContext.class,0);
		}
		public OneormoreContext oneormore() {
			return getRuleContext(OneormoreContext.class,0);
		}
		public TerminalNode ID() { return getToken(langosParser.ID, 0); }
		public Range_Context range_() {
			return getRuleContext(Range_Context.class,0);
		}
		public TerminalNode CHAR() { return getToken(langosParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(langosParser.STRING, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_element);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				bnf_not();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				zeroormore_non_gready();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				optional_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				zeroormore();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				oneormore();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(101);
				match(ID);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(102);
				range_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(103);
				match(CHAR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(104);
				match(STRING);
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

	public static class Range_Context extends ParserRuleContext {
		public List<TerminalNode> CHAR() { return getTokens(langosParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(langosParser.CHAR, i);
		}
		public List<TerminalNode> DOT() { return getTokens(langosParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(langosParser.DOT, i);
		}
		public Range_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterRange_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitRange_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitRange_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_Context range_() throws RecognitionException {
		Range_Context _localctx = new Range_Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_range_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(CHAR);
			setState(108);
			match(DOT);
			setState(109);
			match(DOT);
			setState(110);
			match(CHAR);
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

	public static class Optional_Context extends ParserRuleContext {
		public Alternatives_strongContext alternatives_strong() {
			return getRuleContext(Alternatives_strongContext.class,0);
		}
		public TerminalNode QUEST() { return getToken(langosParser.QUEST, 0); }
		public Optional_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterOptional_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitOptional_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitOptional_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_Context optional_() throws RecognitionException {
		Optional_Context _localctx = new Optional_Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_optional_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			alternatives_strong();
			setState(113);
			match(QUEST);
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

	public static class ZeroormoreContext extends ParserRuleContext {
		public Alternatives_strongContext alternatives_strong() {
			return getRuleContext(Alternatives_strongContext.class,0);
		}
		public TerminalNode STAR() { return getToken(langosParser.STAR, 0); }
		public ZeroormoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zeroormore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterZeroormore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitZeroormore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitZeroormore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZeroormoreContext zeroormore() throws RecognitionException {
		ZeroormoreContext _localctx = new ZeroormoreContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_zeroormore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			alternatives_strong();
			setState(116);
			match(STAR);
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

	public static class Zeroormore_non_greadyContext extends ParserRuleContext {
		public ZeroormoreContext zeroormore() {
			return getRuleContext(ZeroormoreContext.class,0);
		}
		public TerminalNode QUEST() { return getToken(langosParser.QUEST, 0); }
		public Zeroormore_non_greadyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zeroormore_non_gready; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterZeroormore_non_gready(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitZeroormore_non_gready(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitZeroormore_non_gready(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Zeroormore_non_greadyContext zeroormore_non_gready() throws RecognitionException {
		Zeroormore_non_greadyContext _localctx = new Zeroormore_non_greadyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_zeroormore_non_gready);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			zeroormore();
			setState(119);
			match(QUEST);
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

	public static class OneormoreContext extends ParserRuleContext {
		public Alternatives_strongContext alternatives_strong() {
			return getRuleContext(Alternatives_strongContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(langosParser.PLUS, 0); }
		public OneormoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneormore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterOneormore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitOneormore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitOneormore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneormoreContext oneormore() throws RecognitionException {
		OneormoreContext _localctx = new OneormoreContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_oneormore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			alternatives_strong();
			setState(122);
			match(PLUS);
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

	public static class Syntax_Context extends ParserRuleContext {
		public TerminalNode SYNTAX() { return getToken(langosParser.SYNTAX, 0); }
		public TerminalNode ID() { return getToken(langosParser.ID, 0); }
		public TerminalNode RBRACE() { return getToken(langosParser.RBRACE, 0); }
		public RulelistContext rulelist() {
			return getRuleContext(RulelistContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(langosParser.LBRACE, 0); }
		public List<Import_Context> import_() {
			return getRuleContexts(Import_Context.class);
		}
		public Import_Context import_(int i) {
			return getRuleContext(Import_Context.class,i);
		}
		public Syntax_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterSyntax_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitSyntax_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitSyntax_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Syntax_Context syntax_() throws RecognitionException {
		Syntax_Context _localctx = new Syntax_Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_syntax_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(SYNTAX);
			setState(125);
			match(ID);
			setState(126);
			match(RBRACE);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(127);
				import_();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			rulelist();
			setState(134);
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

	public static class Syntax_namespace_objContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(langosParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langosParser.ID, i);
		}
		public TerminalNode DOUBLECOLON() { return getToken(langosParser.DOUBLECOLON, 0); }
		public Syntax_namespace_objContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax_namespace_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterSyntax_namespace_obj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitSyntax_namespace_obj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitSyntax_namespace_obj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Syntax_namespace_objContext syntax_namespace_obj() throws RecognitionException {
		Syntax_namespace_objContext _localctx = new Syntax_namespace_objContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_syntax_namespace_obj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ID);
			setState(137);
			match(DOUBLECOLON);
			setState(138);
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

	public static class Syntax_implContext extends ParserRuleContext {
		public TerminalNode SYNTAX() { return getToken(langosParser.SYNTAX, 0); }
		public Syntax_namespace_objContext syntax_namespace_obj() {
			return getRuleContext(Syntax_namespace_objContext.class,0);
		}
		public Id_list_strongContext id_list_strong() {
			return getRuleContext(Id_list_strongContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(langosParser.RBRACE, 0); }
		public Syntax_impl_bodyContext syntax_impl_body() {
			return getRuleContext(Syntax_impl_bodyContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(langosParser.LBRACE, 0); }
		public Syntax_implContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax_impl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterSyntax_impl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitSyntax_impl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitSyntax_impl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Syntax_implContext syntax_impl() throws RecognitionException {
		Syntax_implContext _localctx = new Syntax_implContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_syntax_impl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(SYNTAX);
			setState(141);
			syntax_namespace_obj();
			setState(142);
			id_list_strong();
			setState(143);
			match(RBRACE);
			setState(144);
			syntax_impl_body();
			setState(145);
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

	public static class Syntax_returnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(langosParser.RETURN, 0); }
		public Syntax_exprContext syntax_expr() {
			return getRuleContext(Syntax_exprContext.class,0);
		}
		public Syntax_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterSyntax_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitSyntax_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitSyntax_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Syntax_returnContext syntax_return() throws RecognitionException {
		Syntax_returnContext _localctx = new Syntax_returnContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_syntax_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(RETURN);
			setState(148);
			syntax_expr();
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

	public static class Syntax_rule_callContext extends ParserRuleContext {
		public Syntax_namespace_objContext syntax_namespace_obj() {
			return getRuleContext(Syntax_namespace_objContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(langosParser.RPAREN, 0); }
		public Syntax_exprContext syntax_expr() {
			return getRuleContext(Syntax_exprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(langosParser.LPAREN, 0); }
		public Syntax_rule_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax_rule_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterSyntax_rule_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitSyntax_rule_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitSyntax_rule_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Syntax_rule_callContext syntax_rule_call() throws RecognitionException {
		Syntax_rule_callContext _localctx = new Syntax_rule_callContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_syntax_rule_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			syntax_namespace_obj();
			setState(151);
			match(RPAREN);
			setState(152);
			syntax_expr();
			setState(153);
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

	public static class Syntax_lambdaContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(langosParser.RPAREN, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(langosParser.LPAREN, 0); }
		public TerminalNode ARROW() { return getToken(langosParser.ARROW, 0); }
		public TerminalNode RBRACE() { return getToken(langosParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(langosParser.LBRACE, 0); }
		public List<Syntax_exprContext> syntax_expr() {
			return getRuleContexts(Syntax_exprContext.class);
		}
		public Syntax_exprContext syntax_expr(int i) {
			return getRuleContext(Syntax_exprContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(langosParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(langosParser.SEMI, i);
		}
		public Syntax_lambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax_lambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterSyntax_lambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitSyntax_lambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitSyntax_lambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Syntax_lambdaContext syntax_lambda() throws RecognitionException {
		Syntax_lambdaContext _localctx = new Syntax_lambdaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_syntax_lambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(RPAREN);
			setState(156);
			id_list();
			setState(157);
			match(LPAREN);
			setState(158);
			match(ARROW);
			setState(159);
			match(RBRACE);
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(160);
				syntax_expr();
				setState(161);
				match(SEMI);
				}
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << RPAREN) | (1L << ID))) != 0) );
			setState(167);
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

	public static class Syntax_object_getterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(langosParser.ID, 0); }
		public Syntax_expr_strongContext syntax_expr_strong() {
			return getRuleContext(Syntax_expr_strongContext.class,0);
		}
		public Syntax_object_getterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax_object_getter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterSyntax_object_getter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitSyntax_object_getter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitSyntax_object_getter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Syntax_object_getterContext syntax_object_getter() throws RecognitionException {
		Syntax_object_getterContext _localctx = new Syntax_object_getterContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_syntax_object_getter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(ID);
			setState(170);
			syntax_expr_strong();
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

	public static class Syntax_text_getterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(langosParser.ID, 0); }
		public TerminalNode REND() { return getToken(langosParser.REND, 0); }
		public Syntax_exprContext syntax_expr() {
			return getRuleContext(Syntax_exprContext.class,0);
		}
		public TerminalNode LEND() { return getToken(langosParser.LEND, 0); }
		public Syntax_text_getterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax_text_getter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterSyntax_text_getter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitSyntax_text_getter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitSyntax_text_getter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Syntax_text_getterContext syntax_text_getter() throws RecognitionException {
		Syntax_text_getterContext _localctx = new Syntax_text_getterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_syntax_text_getter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(ID);
			setState(173);
			match(REND);
			setState(174);
			syntax_expr();
			setState(175);
			match(LEND);
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

	public static class Syntax_method_call_beginContext extends ParserRuleContext {
		public Syntax_rule_callContext syntax_rule_call() {
			return getRuleContext(Syntax_rule_callContext.class,0);
		}
		public Syntax_object_getterContext syntax_object_getter() {
			return getRuleContext(Syntax_object_getterContext.class,0);
		}
		public Syntax_text_getterContext syntax_text_getter() {
			return getRuleContext(Syntax_text_getterContext.class,0);
		}
		public Syntax_method_call_beginContext syntax_method_call_begin() {
			return getRuleContext(Syntax_method_call_beginContext.class,0);
		}
		public Syntax_method_call_bodyContext syntax_method_call_body() {
			return getRuleContext(Syntax_method_call_bodyContext.class,0);
		}
		public Syntax_method_call_beginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax_method_call_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterSyntax_method_call_begin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitSyntax_method_call_begin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitSyntax_method_call_begin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Syntax_method_call_beginContext syntax_method_call_begin() throws RecognitionException {
		return syntax_method_call_begin(0);
	}

	private Syntax_method_call_beginContext syntax_method_call_begin(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Syntax_method_call_beginContext _localctx = new Syntax_method_call_beginContext(_ctx, _parentState);
		Syntax_method_call_beginContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_syntax_method_call_begin, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(178);
				syntax_rule_call();
				}
				break;
			case 2:
				{
				setState(179);
				syntax_object_getter();
				}
				break;
			case 3:
				{
				setState(180);
				syntax_text_getter();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Syntax_method_call_beginContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_syntax_method_call_begin);
					setState(183);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(184);
					syntax_method_call_body();
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Syntax_method_call_bodyContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(langosParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(langosParser.DOT, i);
		}
		public List<Syntax_expr_strongContext> syntax_expr_strong() {
			return getRuleContexts(Syntax_expr_strongContext.class);
		}
		public Syntax_expr_strongContext syntax_expr_strong(int i) {
			return getRuleContext(Syntax_expr_strongContext.class,i);
		}
		public Syntax_method_call_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax_method_call_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterSyntax_method_call_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitSyntax_method_call_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitSyntax_method_call_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Syntax_method_call_bodyContext syntax_method_call_body() throws RecognitionException {
		Syntax_method_call_bodyContext _localctx = new Syntax_method_call_bodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_syntax_method_call_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(190);
					match(DOT);
					setState(191);
					syntax_expr_strong();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(194); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Syntax_method_callContext extends ParserRuleContext {
		public Syntax_method_call_beginContext syntax_method_call_begin() {
			return getRuleContext(Syntax_method_call_beginContext.class,0);
		}
		public Syntax_method_call_bodyContext syntax_method_call_body() {
			return getRuleContext(Syntax_method_call_bodyContext.class,0);
		}
		public Syntax_method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterSyntax_method_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitSyntax_method_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitSyntax_method_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Syntax_method_callContext syntax_method_call() throws RecognitionException {
		Syntax_method_callContext _localctx = new Syntax_method_callContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_syntax_method_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			syntax_method_call_begin(0);
			setState(197);
			syntax_method_call_body();
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

	public static class Syntax_exprContext extends ParserRuleContext {
		public Syntax_method_callContext syntax_method_call() {
			return getRuleContext(Syntax_method_callContext.class,0);
		}
		public Syntax_rule_callContext syntax_rule_call() {
			return getRuleContext(Syntax_rule_callContext.class,0);
		}
		public Syntax_lambdaContext syntax_lambda() {
			return getRuleContext(Syntax_lambdaContext.class,0);
		}
		public Syntax_returnContext syntax_return() {
			return getRuleContext(Syntax_returnContext.class,0);
		}
		public Syntax_object_getterContext syntax_object_getter() {
			return getRuleContext(Syntax_object_getterContext.class,0);
		}
		public Syntax_text_getterContext syntax_text_getter() {
			return getRuleContext(Syntax_text_getterContext.class,0);
		}
		public TerminalNode ID() { return getToken(langosParser.ID, 0); }
		public Syntax_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterSyntax_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitSyntax_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitSyntax_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Syntax_exprContext syntax_expr() throws RecognitionException {
		Syntax_exprContext _localctx = new Syntax_exprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_syntax_expr);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				syntax_method_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				syntax_rule_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				syntax_lambda();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				syntax_return();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				syntax_object_getter();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(204);
				syntax_text_getter();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(205);
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

	public static class Syntax_expr_strongContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(langosParser.RPAREN, 0); }
		public Syntax_exprContext syntax_expr() {
			return getRuleContext(Syntax_exprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(langosParser.LPAREN, 0); }
		public Syntax_expr_strongContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax_expr_strong; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterSyntax_expr_strong(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitSyntax_expr_strong(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitSyntax_expr_strong(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Syntax_expr_strongContext syntax_expr_strong() throws RecognitionException {
		Syntax_expr_strongContext _localctx = new Syntax_expr_strongContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_syntax_expr_strong);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(RPAREN);
			setState(209);
			syntax_expr();
			setState(210);
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

	public static class Syntax_impl_bodyContext extends ParserRuleContext {
		public List<Syntax_exprContext> syntax_expr() {
			return getRuleContexts(Syntax_exprContext.class);
		}
		public Syntax_exprContext syntax_expr(int i) {
			return getRuleContext(Syntax_exprContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(langosParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(langosParser.SEMI, i);
		}
		public Syntax_impl_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax_impl_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterSyntax_impl_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitSyntax_impl_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitSyntax_impl_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Syntax_impl_bodyContext syntax_impl_body() throws RecognitionException {
		Syntax_impl_bodyContext _localctx = new Syntax_impl_bodyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_syntax_impl_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << RPAREN) | (1L << ID))) != 0)) {
				{
				{
				setState(212);
				syntax_expr();
				setState(213);
				match(SEMI);
				}
				}
				setState(219);
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

	public static class Import_Context extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(langosParser.IMPORT, 0); }
		public List<TerminalNode> ID() { return getTokens(langosParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langosParser.ID, i);
		}
		public TerminalNode SEMI() { return getToken(langosParser.SEMI, 0); }
		public List<TerminalNode> DOT() { return getTokens(langosParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(langosParser.DOT, i);
		}
		public Import_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterImport_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitImport_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitImport_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_Context import_() throws RecognitionException {
		Import_Context _localctx = new Import_Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_import_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(IMPORT);
			setState(221);
			match(ID);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(222);
				match(DOT);
				setState(223);
				match(ID);
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
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

	public static class ProgramContext extends ParserRuleContext {
		public List<Import_Context> import_() {
			return getRuleContexts(Import_Context.class);
		}
		public Import_Context import_(int i) {
			return getRuleContext(Import_Context.class,i);
		}
		public List<Syntax_Context> syntax_() {
			return getRuleContexts(Syntax_Context.class);
		}
		public Syntax_Context syntax_(int i) {
			return getRuleContext(Syntax_Context.class,i);
		}
		public List<Syntax_implContext> syntax_impl() {
			return getRuleContexts(Syntax_implContext.class);
		}
		public Syntax_implContext syntax_impl(int i) {
			return getRuleContext(Syntax_implContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(231);
				import_();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYNTAX) {
				{
				setState(239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(237);
					syntax_();
					}
					break;
				case 2:
					{
					setState(238);
					syntax_impl();
					}
					break;
				}
				}
				setState(243);
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

	public static class Entry_pointContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(langosParser.EOF, 0); }
		public Entry_pointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry_point; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterEntry_point(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitEntry_point(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitEntry_point(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entry_pointContext entry_point() throws RecognitionException {
		Entry_pointContext _localctx = new Entry_pointContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_entry_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			program();
			setState(245);
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

	public static class Id_listContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(langosParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langosParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(langosParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(langosParser.COMA, i);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitId_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitId_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(ID);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(248);
				match(COMA);
				setState(249);
				match(ID);
				}
				}
				setState(254);
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

	public static class Id_list_strongContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(langosParser.RPAREN, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(langosParser.LPAREN, 0); }
		public Id_list_strongContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list_strong; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterId_list_strong(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitId_list_strong(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitId_list_strong(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_list_strongContext id_list_strong() throws RecognitionException {
		Id_list_strongContext _localctx = new Id_list_strongContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_id_list_strong);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(RPAREN);
			setState(256);
			id_list();
			setState(257);
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

	public static class Id_strongContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(langosParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(langosParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(langosParser.LPAREN, 0); }
		public Id_strongContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_strong; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).enterId_strong(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langosListener ) ((langosListener)listener).exitId_strong(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langosVisitor ) return ((langosVisitor<? extends T>)visitor).visitId_strong(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_strongContext id_strong() throws RecognitionException {
		Id_strongContext _localctx = new Id_strongContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_id_strong);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(RPAREN);
			setState(260);
			match(ID);
			setState(261);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return syntax_method_call_begin_sempred((Syntax_method_call_beginContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean syntax_method_call_begin_sempred(Syntax_method_call_beginContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001c\u0108\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0001\u0000\u0004\u0000B\b\u0000\u000b"+
		"\u0000\f\u0000C\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0004\u0002L\b\u0002\u000b\u0002\f\u0002M\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003S\b\u0003\n\u0003\f\u0003V\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006j\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0005\f\u0081\b\f\n\f\f\f\u0084\t\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0004\u0011\u00a4\b\u0011\u000b\u0011\f\u0011\u00a5\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u00b6\b\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u00ba\b\u0014\n\u0014\f\u0014\u00bd\t\u0014\u0001\u0015\u0001\u0015"+
		"\u0004\u0015\u00c1\b\u0015\u000b\u0015\f\u0015\u00c2\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00cf\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u00d8\b\u0019\n\u0019\f\u0019\u00db\t\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u00e1\b\u001a\n\u001a\f\u001a\u00e4"+
		"\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0005\u001b\u00e9\b\u001b"+
		"\n\u001b\f\u001b\u00ec\t\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u00f0"+
		"\b\u001b\n\u001b\f\u001b\u00f3\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u00fb\b\u001d\n\u001d"+
		"\f\u001d\u00fe\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0000\u0001"+
		"( \u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>\u0000\u0000\u0104\u0000A\u0001\u0000\u0000"+
		"\u0000\u0002E\u0001\u0000\u0000\u0000\u0004K\u0001\u0000\u0000\u0000\u0006"+
		"O\u0001\u0000\u0000\u0000\bW\u0001\u0000\u0000\u0000\n[\u0001\u0000\u0000"+
		"\u0000\fi\u0001\u0000\u0000\u0000\u000ek\u0001\u0000\u0000\u0000\u0010"+
		"p\u0001\u0000\u0000\u0000\u0012s\u0001\u0000\u0000\u0000\u0014v\u0001"+
		"\u0000\u0000\u0000\u0016y\u0001\u0000\u0000\u0000\u0018|\u0001\u0000\u0000"+
		"\u0000\u001a\u0088\u0001\u0000\u0000\u0000\u001c\u008c\u0001\u0000\u0000"+
		"\u0000\u001e\u0093\u0001\u0000\u0000\u0000 \u0096\u0001\u0000\u0000\u0000"+
		"\"\u009b\u0001\u0000\u0000\u0000$\u00a9\u0001\u0000\u0000\u0000&\u00ac"+
		"\u0001\u0000\u0000\u0000(\u00b5\u0001\u0000\u0000\u0000*\u00c0\u0001\u0000"+
		"\u0000\u0000,\u00c4\u0001\u0000\u0000\u0000.\u00ce\u0001\u0000\u0000\u0000"+
		"0\u00d0\u0001\u0000\u0000\u00002\u00d9\u0001\u0000\u0000\u00004\u00dc"+
		"\u0001\u0000\u0000\u00006\u00ea\u0001\u0000\u0000\u00008\u00f4\u0001\u0000"+
		"\u0000\u0000:\u00f7\u0001\u0000\u0000\u0000<\u00ff\u0001\u0000\u0000\u0000"+
		">\u0103\u0001\u0000\u0000\u0000@B\u0003\u0002\u0001\u0000A@\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000D\u0001\u0001\u0000\u0000\u0000EF\u0005\u0015\u0000"+
		"\u0000FG\u0005\u0016\u0000\u0000GH\u0003\u0006\u0003\u0000HI\u0005\u0017"+
		"\u0000\u0000I\u0003\u0001\u0000\u0000\u0000JL\u0003\f\u0006\u0000KJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000N\u0005\u0001\u0000\u0000\u0000OT\u0003\u0004"+
		"\u0002\u0000PQ\u0005\u0011\u0000\u0000QS\u0003\u0004\u0002\u0000RP\u0001"+
		"\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000U\u0007\u0001\u0000\u0000\u0000VT\u0001\u0000"+
		"\u0000\u0000WX\u0005\f\u0000\u0000XY\u0003\u0006\u0003\u0000YZ\u0005\u000b"+
		"\u0000\u0000Z\t\u0001\u0000\u0000\u0000[\\\u0005\f\u0000\u0000\\]\u0005"+
		"\u0014\u0000\u0000]^\u0003\f\u0006\u0000^_\u0005\u000b\u0000\u0000_\u000b"+
		"\u0001\u0000\u0000\u0000`j\u0003\n\u0005\u0000aj\u0003\u0014\n\u0000b"+
		"j\u0003\u0010\b\u0000cj\u0003\u0012\t\u0000dj\u0003\u0016\u000b\u0000"+
		"ej\u0005\u0015\u0000\u0000fj\u0003\u000e\u0007\u0000gj\u0005\u001b\u0000"+
		"\u0000hj\u0005\u001c\u0000\u0000i`\u0001\u0000\u0000\u0000ia\u0001\u0000"+
		"\u0000\u0000ib\u0001\u0000\u0000\u0000ic\u0001\u0000\u0000\u0000id\u0001"+
		"\u0000\u0000\u0000ie\u0001\u0000\u0000\u0000if\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000j\r\u0001\u0000\u0000"+
		"\u0000kl\u0005\u001b\u0000\u0000lm\u0005\n\u0000\u0000mn\u0005\n\u0000"+
		"\u0000no\u0005\u001b\u0000\u0000o\u000f\u0001\u0000\u0000\u0000pq\u0003"+
		"\b\u0004\u0000qr\u0005\u0006\u0000\u0000r\u0011\u0001\u0000\u0000\u0000"+
		"st\u0003\b\u0004\u0000tu\u0005\u0007\u0000\u0000u\u0013\u0001\u0000\u0000"+
		"\u0000vw\u0003\u0012\t\u0000wx\u0005\u0006\u0000\u0000x\u0015\u0001\u0000"+
		"\u0000\u0000yz\u0003\b\u0004\u0000z{\u0005\b\u0000\u0000{\u0017\u0001"+
		"\u0000\u0000\u0000|}\u0005\u0003\u0000\u0000}~\u0005\u0015\u0000\u0000"+
		"~\u0082\u0005\u000e\u0000\u0000\u007f\u0081\u00034\u001a\u0000\u0080\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0085"+
		"\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0003\u0000\u0000\u0000\u0086\u0087\u0005\r\u0000\u0000\u0087\u0019\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0005\u0015\u0000\u0000\u0089\u008a\u0005"+
		"\u0019\u0000\u0000\u008a\u008b\u0005\u0015\u0000\u0000\u008b\u001b\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0005\u0003\u0000\u0000\u008d\u008e\u0003"+
		"\u001a\r\u0000\u008e\u008f\u0003<\u001e\u0000\u008f\u0090\u0005\u000e"+
		"\u0000\u0000\u0090\u0091\u00032\u0019\u0000\u0091\u0092\u0005\r\u0000"+
		"\u0000\u0092\u001d\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0004\u0000"+
		"\u0000\u0094\u0095\u0003.\u0017\u0000\u0095\u001f\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0003\u001a\r\u0000\u0097\u0098\u0005\f\u0000\u0000\u0098"+
		"\u0099\u0003.\u0017\u0000\u0099\u009a\u0005\u000b\u0000\u0000\u009a!\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0005\f\u0000\u0000\u009c\u009d\u0003:"+
		"\u001d\u0000\u009d\u009e\u0005\u000b\u0000\u0000\u009e\u009f\u0005\u001a"+
		"\u0000\u0000\u009f\u00a3\u0005\u000e\u0000\u0000\u00a0\u00a1\u0003.\u0017"+
		"\u0000\u00a1\u00a2\u0005\u0017\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a0\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\r\u0000\u0000"+
		"\u00a8#\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0015\u0000\u0000\u00aa"+
		"\u00ab\u00030\u0018\u0000\u00ab%\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005"+
		"\u0015\u0000\u0000\u00ad\u00ae\u0005\u0010\u0000\u0000\u00ae\u00af\u0003"+
		".\u0017\u0000\u00af\u00b0\u0005\u000f\u0000\u0000\u00b0\'\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0006\u0014\uffff\uffff\u0000\u00b2\u00b6\u0003"+
		" \u0010\u0000\u00b3\u00b6\u0003$\u0012\u0000\u00b4\u00b6\u0003&\u0013"+
		"\u0000\u00b5\u00b1\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u00bb\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\n\u0004\u0000\u0000\u00b8\u00ba\u0003*\u0015\u0000"+
		"\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bc)\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0005\n\u0000\u0000\u00bf\u00c1\u00030\u0018\u0000\u00c0\u00be"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3+\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0003(\u0014\u0000\u00c5\u00c6\u0003*\u0015"+
		"\u0000\u00c6-\u0001\u0000\u0000\u0000\u00c7\u00cf\u0003,\u0016\u0000\u00c8"+
		"\u00cf\u0003 \u0010\u0000\u00c9\u00cf\u0003\"\u0011\u0000\u00ca\u00cf"+
		"\u0003\u001e\u000f\u0000\u00cb\u00cf\u0003$\u0012\u0000\u00cc\u00cf\u0003"+
		"&\u0013\u0000\u00cd\u00cf\u0005\u0015\u0000\u0000\u00ce\u00c7\u0001\u0000"+
		"\u0000\u0000\u00ce\u00c8\u0001\u0000\u0000\u0000\u00ce\u00c9\u0001\u0000"+
		"\u0000\u0000\u00ce\u00ca\u0001\u0000\u0000\u0000\u00ce\u00cb\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cf/\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\f\u0000"+
		"\u0000\u00d1\u00d2\u0003.\u0017\u0000\u00d2\u00d3\u0005\u000b\u0000\u0000"+
		"\u00d31\u0001\u0000\u0000\u0000\u00d4\u00d5\u0003.\u0017\u0000\u00d5\u00d6"+
		"\u0005\u0017\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da3\u0001"+
		"\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005"+
		"\u0002\u0000\u0000\u00dd\u00e2\u0005\u0015\u0000\u0000\u00de\u00df\u0005"+
		"\n\u0000\u0000\u00df\u00e1\u0005\u0015\u0000\u0000\u00e0\u00de\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\u0017"+
		"\u0000\u0000\u00e65\u0001\u0000\u0000\u0000\u00e7\u00e9\u00034\u001a\u0000"+
		"\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000"+
		"\u00eb\u00f1\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ed\u00f0\u0003\u0018\f\u0000\u00ee\u00f0\u0003\u001c\u000e\u0000\u00ef"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f27\u0001\u0000\u0000\u0000\u00f3\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f5\u00036\u001b\u0000\u00f5\u00f6\u0005"+
		"\u0000\u0000\u0001\u00f69\u0001\u0000\u0000\u0000\u00f7\u00fc\u0005\u0015"+
		"\u0000\u0000\u00f8\u00f9\u0005\u0018\u0000\u0000\u00f9\u00fb\u0005\u0015"+
		"\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fd;\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0005\f\u0000\u0000\u0100\u0101\u0003:\u001d\u0000"+
		"\u0101\u0102\u0005\u000b\u0000\u0000\u0102=\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0005\f\u0000\u0000\u0104\u0105\u0005\u0015\u0000\u0000\u0105\u0106"+
		"\u0005\u000b\u0000\u0000\u0106?\u0001\u0000\u0000\u0000\u0010CMTi\u0082"+
		"\u00a5\u00b5\u00bb\u00c2\u00ce\u00d9\u00e2\u00ea\u00ef\u00f1\u00fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}