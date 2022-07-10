// Generated from /home/su/IdeaProjects/langA/langos.g4 by ANTLR 4.10.1
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
		RULE_rulelist = 0, RULE_rule_ = 1, RULE_alternatives = 2, RULE_alternatives_strong = 3, 
		RULE_alternative = 4, RULE_bnf_not = 5, RULE_element = 6, RULE_range_ = 7, 
		RULE_optional_ = 8, RULE_zeroormore = 9, RULE_zeroormore_non_gready = 10, 
		RULE_oneormore = 11, RULE_syntax_ = 12, RULE_syntax_namespace_obj = 13, 
		RULE_syntax_impl = 14, RULE_syntax_return = 15, RULE_syntax_method_call = 16, 
		RULE_syntax_lambda = 17, RULE_syntax_object_getter = 18, RULE_syntax_text_getter = 19, 
		RULE_syntax_expr = 20, RULE_syntax_expr_strong = 21, RULE_syntax_impl_body = 22, 
		RULE_import_ = 23, RULE_program = 24, RULE_entry_point = 25, RULE_id_list = 26, 
		RULE_id_list_strong = 27, RULE_id_strong = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"rulelist", "rule_", "alternatives", "alternatives_strong", "alternative", 
			"bnf_not", "element", "range_", "optional_", "zeroormore", "zeroormore_non_gready", 
			"oneormore", "syntax_", "syntax_namespace_obj", "syntax_impl", "syntax_return", 
			"syntax_method_call", "syntax_lambda", "syntax_object_getter", "syntax_text_getter", 
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(58);
				rule_();
				}
				}
				setState(63);
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
			setState(64);
			match(ID);
			setState(65);
			match(COLON);
			setState(66);
			alternatives();
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
		enterRule(_localctx, 4, RULE_alternatives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			alternative();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BAR) {
				{
				{
				setState(70);
				match(BAR);
				setState(71);
				alternative();
				}
				}
				setState(76);
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
		enterRule(_localctx, 6, RULE_alternatives_strong);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(RPAREN);
			setState(78);
			alternatives();
			setState(79);
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
		enterRule(_localctx, 8, RULE_alternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				element();
				}
				}
				setState(84); 
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
			setState(86);
			match(RPAREN);
			setState(87);
			match(CIRCUMFLEX);
			setState(88);
			element();
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
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				bnf_not();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				zeroormore_non_gready();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				optional_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				zeroormore();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				oneormore();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				match(ID);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(97);
				range_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				match(CHAR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(99);
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
			setState(102);
			match(CHAR);
			setState(103);
			match(DOT);
			setState(104);
			match(DOT);
			setState(105);
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
			setState(107);
			alternatives_strong();
			setState(108);
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
			setState(110);
			alternatives_strong();
			setState(111);
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
			setState(113);
			zeroormore();
			setState(114);
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
			setState(116);
			alternatives_strong();
			setState(117);
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
			setState(119);
			match(SYNTAX);
			setState(120);
			match(ID);
			setState(121);
			match(RBRACE);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(122);
				import_();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			rulelist();
			setState(129);
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
			setState(131);
			match(ID);
			setState(132);
			match(DOUBLECOLON);
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
			setState(135);
			match(SYNTAX);
			setState(136);
			syntax_namespace_obj();
			setState(137);
			id_list_strong();
			setState(138);
			match(RBRACE);
			setState(139);
			syntax_impl_body();
			setState(140);
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
			setState(142);
			match(RETURN);
			setState(143);
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

	public static class Syntax_method_callContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(langosParser.DOT, 0); }
		public TerminalNode ID() { return getToken(langosParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(langosParser.RPAREN, 0); }
		public Syntax_exprContext syntax_expr() {
			return getRuleContext(Syntax_exprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(langosParser.LPAREN, 0); }
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
		enterRule(_localctx, 32, RULE_syntax_method_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(DOT);
			setState(146);
			match(ID);
			setState(147);
			match(RPAREN);
			setState(148);
			syntax_expr();
			setState(149);
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
			setState(151);
			match(RPAREN);
			setState(152);
			id_list();
			setState(153);
			match(LPAREN);
			setState(154);
			match(ARROW);
			setState(155);
			match(RBRACE);
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(156);
				syntax_expr();
				setState(157);
				match(SEMI);
				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << RPAREN) | (1L << ID))) != 0) );
			setState(163);
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
			setState(165);
			match(ID);
			setState(166);
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
			setState(168);
			match(ID);
			setState(169);
			match(REND);
			setState(170);
			syntax_expr();
			setState(171);
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

	public static class Syntax_exprContext extends ParserRuleContext {
		public Syntax_namespace_objContext syntax_namespace_obj() {
			return getRuleContext(Syntax_namespace_objContext.class,0);
		}
		public Syntax_expr_strongContext syntax_expr_strong() {
			return getRuleContext(Syntax_expr_strongContext.class,0);
		}
		public Syntax_method_callContext syntax_method_call() {
			return getRuleContext(Syntax_method_callContext.class,0);
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
		enterRule(_localctx, 40, RULE_syntax_expr);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				syntax_namespace_obj();
				setState(176);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RPAREN:
					{
					setState(174);
					syntax_expr_strong();
					}
					break;
				case DOT:
					{
					setState(175);
					syntax_method_call();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				syntax_lambda();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				syntax_return();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				syntax_object_getter();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				syntax_text_getter();
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
		enterRule(_localctx, 42, RULE_syntax_expr_strong);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(RPAREN);
			setState(185);
			syntax_expr();
			setState(186);
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
		enterRule(_localctx, 44, RULE_syntax_impl_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(188);
				syntax_expr();
				setState(189);
				match(SEMI);
				}
				}
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << RPAREN) | (1L << ID))) != 0) );
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
		enterRule(_localctx, 46, RULE_import_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(IMPORT);
			setState(196);
			match(ID);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(197);
				match(DOT);
				setState(198);
				match(ID);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
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
		enterRule(_localctx, 48, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(206);
				import_();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYNTAX) {
				{
				setState(214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(212);
					syntax_();
					}
					break;
				case 2:
					{
					setState(213);
					syntax_impl();
					}
					break;
				}
				}
				setState(218);
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
		enterRule(_localctx, 50, RULE_entry_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			program();
			setState(220);
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
		enterRule(_localctx, 52, RULE_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(ID);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(223);
				match(COMA);
				setState(224);
				match(ID);
				}
				}
				setState(229);
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
		enterRule(_localctx, 54, RULE_id_list_strong);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(RPAREN);
			setState(231);
			id_list();
			setState(232);
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
		enterRule(_localctx, 56, RULE_id_strong);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(RPAREN);
			setState(235);
			match(ID);
			setState(236);
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
		"\u0004\u0001\u001c\u00ef\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0005\u0000<\b\u0000\n\u0000"+
		"\f\u0000?\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002I\b\u0002\n\u0002"+
		"\f\u0002L\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0004\u0004S\b\u0004\u000b\u0004\f\u0004T\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006e\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0005\f|\b\f\n\f\f\f\u007f\t\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0004\u0011\u00a0\b\u0011\u000b\u0011\f\u0011"+
		"\u00a1\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u00b1\b\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u00b7\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0004\u0016\u00c0"+
		"\b\u0016\u000b\u0016\f\u0016\u00c1\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u00c8\b\u0017\n\u0017\f\u0017\u00cb\t\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0005\u0018\u00d0\b\u0018\n\u0018\f\u0018"+
		"\u00d3\t\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u00d7\b\u0018\n\u0018"+
		"\f\u0018\u00da\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u00e2\b\u001a\n\u001a\f\u001a\u00e5"+
		"\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0000\u0000\u001d\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468\u0000\u0000\u00e9\u0000=\u0001\u0000\u0000\u0000\u0002"+
		"@\u0001\u0000\u0000\u0000\u0004E\u0001\u0000\u0000\u0000\u0006M\u0001"+
		"\u0000\u0000\u0000\bR\u0001\u0000\u0000\u0000\nV\u0001\u0000\u0000\u0000"+
		"\fd\u0001\u0000\u0000\u0000\u000ef\u0001\u0000\u0000\u0000\u0010k\u0001"+
		"\u0000\u0000\u0000\u0012n\u0001\u0000\u0000\u0000\u0014q\u0001\u0000\u0000"+
		"\u0000\u0016t\u0001\u0000\u0000\u0000\u0018w\u0001\u0000\u0000\u0000\u001a"+
		"\u0083\u0001\u0000\u0000\u0000\u001c\u0087\u0001\u0000\u0000\u0000\u001e"+
		"\u008e\u0001\u0000\u0000\u0000 \u0091\u0001\u0000\u0000\u0000\"\u0097"+
		"\u0001\u0000\u0000\u0000$\u00a5\u0001\u0000\u0000\u0000&\u00a8\u0001\u0000"+
		"\u0000\u0000(\u00b6\u0001\u0000\u0000\u0000*\u00b8\u0001\u0000\u0000\u0000"+
		",\u00bf\u0001\u0000\u0000\u0000.\u00c3\u0001\u0000\u0000\u00000\u00d1"+
		"\u0001\u0000\u0000\u00002\u00db\u0001\u0000\u0000\u00004\u00de\u0001\u0000"+
		"\u0000\u00006\u00e6\u0001\u0000\u0000\u00008\u00ea\u0001\u0000\u0000\u0000"+
		":<\u0003\u0002\u0001\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>\u0001\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0005\u0015\u0000\u0000"+
		"AB\u0005\u0016\u0000\u0000BC\u0003\u0004\u0002\u0000CD\u0005\u0017\u0000"+
		"\u0000D\u0003\u0001\u0000\u0000\u0000EJ\u0003\b\u0004\u0000FG\u0005\u0011"+
		"\u0000\u0000GI\u0003\b\u0004\u0000HF\u0001\u0000\u0000\u0000IL\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\u0005"+
		"\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MN\u0005\f\u0000\u0000"+
		"NO\u0003\u0004\u0002\u0000OP\u0005\u000b\u0000\u0000P\u0007\u0001\u0000"+
		"\u0000\u0000QS\u0003\f\u0006\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\t\u0001"+
		"\u0000\u0000\u0000VW\u0005\f\u0000\u0000WX\u0005\u0014\u0000\u0000XY\u0003"+
		"\f\u0006\u0000YZ\u0005\u000b\u0000\u0000Z\u000b\u0001\u0000\u0000\u0000"+
		"[e\u0003\n\u0005\u0000\\e\u0003\u0014\n\u0000]e\u0003\u0010\b\u0000^e"+
		"\u0003\u0012\t\u0000_e\u0003\u0016\u000b\u0000`e\u0005\u0015\u0000\u0000"+
		"ae\u0003\u000e\u0007\u0000be\u0005\u001b\u0000\u0000ce\u0005\u001c\u0000"+
		"\u0000d[\u0001\u0000\u0000\u0000d\\\u0001\u0000\u0000\u0000d]\u0001\u0000"+
		"\u0000\u0000d^\u0001\u0000\u0000\u0000d_\u0001\u0000\u0000\u0000d`\u0001"+
		"\u0000\u0000\u0000da\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"dc\u0001\u0000\u0000\u0000e\r\u0001\u0000\u0000\u0000fg\u0005\u001b\u0000"+
		"\u0000gh\u0005\n\u0000\u0000hi\u0005\n\u0000\u0000ij\u0005\u001b\u0000"+
		"\u0000j\u000f\u0001\u0000\u0000\u0000kl\u0003\u0006\u0003\u0000lm\u0005"+
		"\u0006\u0000\u0000m\u0011\u0001\u0000\u0000\u0000no\u0003\u0006\u0003"+
		"\u0000op\u0005\u0007\u0000\u0000p\u0013\u0001\u0000\u0000\u0000qr\u0003"+
		"\u0012\t\u0000rs\u0005\u0006\u0000\u0000s\u0015\u0001\u0000\u0000\u0000"+
		"tu\u0003\u0006\u0003\u0000uv\u0005\b\u0000\u0000v\u0017\u0001\u0000\u0000"+
		"\u0000wx\u0005\u0003\u0000\u0000xy\u0005\u0015\u0000\u0000y}\u0005\u000e"+
		"\u0000\u0000z|\u0003.\u0017\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~\u0080\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0003\u0000\u0000\u0000\u0081\u0082\u0005\r\u0000\u0000\u0082\u0019\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005\u0015\u0000\u0000\u0084\u0085\u0005"+
		"\u0019\u0000\u0000\u0085\u0086\u0005\u0015\u0000\u0000\u0086\u001b\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0005\u0003\u0000\u0000\u0088\u0089\u0003"+
		"\u001a\r\u0000\u0089\u008a\u00036\u001b\u0000\u008a\u008b\u0005\u000e"+
		"\u0000\u0000\u008b\u008c\u0003,\u0016\u0000\u008c\u008d\u0005\r\u0000"+
		"\u0000\u008d\u001d\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0004\u0000"+
		"\u0000\u008f\u0090\u0003(\u0014\u0000\u0090\u001f\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0005\n\u0000\u0000\u0092\u0093\u0005\u0015\u0000\u0000\u0093"+
		"\u0094\u0005\f\u0000\u0000\u0094\u0095\u0003(\u0014\u0000\u0095\u0096"+
		"\u0005\u000b\u0000\u0000\u0096!\u0001\u0000\u0000\u0000\u0097\u0098\u0005"+
		"\f\u0000\u0000\u0098\u0099\u00034\u001a\u0000\u0099\u009a\u0005\u000b"+
		"\u0000\u0000\u009a\u009b\u0005\u001a\u0000\u0000\u009b\u009f\u0005\u000e"+
		"\u0000\u0000\u009c\u009d\u0003(\u0014\u0000\u009d\u009e\u0005\u0017\u0000"+
		"\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u009c\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0005\r\u0000\u0000\u00a4#\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0005\u0015\u0000\u0000\u00a6\u00a7\u0003*\u0015\u0000\u00a7"+
		"%\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0015\u0000\u0000\u00a9\u00aa"+
		"\u0005\u0010\u0000\u0000\u00aa\u00ab\u0003(\u0014\u0000\u00ab\u00ac\u0005"+
		"\u000f\u0000\u0000\u00ac\'\u0001\u0000\u0000\u0000\u00ad\u00b0\u0003\u001a"+
		"\r\u0000\u00ae\u00b1\u0003*\u0015\u0000\u00af\u00b1\u0003 \u0010\u0000"+
		"\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b7\u0001\u0000\u0000\u0000\u00b2\u00b7\u0003\"\u0011\u0000\u00b3"+
		"\u00b7\u0003\u001e\u000f\u0000\u00b4\u00b7\u0003$\u0012\u0000\u00b5\u00b7"+
		"\u0003&\u0013\u0000\u00b6\u00ad\u0001\u0000\u0000\u0000\u00b6\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7)\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0005\f\u0000\u0000\u00b9\u00ba\u0003(\u0014"+
		"\u0000\u00ba\u00bb\u0005\u000b\u0000\u0000\u00bb+\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0003(\u0014\u0000\u00bd\u00be\u0005\u0017\u0000\u0000\u00be"+
		"\u00c0\u0001\u0000\u0000\u0000\u00bf\u00bc\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c2-\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0005\u0002\u0000\u0000\u00c4\u00c9\u0005\u0015\u0000\u0000\u00c5\u00c6"+
		"\u0005\n\u0000\u0000\u00c6\u00c8\u0005\u0015\u0000\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005"+
		"\u0017\u0000\u0000\u00cd/\u0001\u0000\u0000\u0000\u00ce\u00d0\u0003.\u0017"+
		"\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d8\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d7\u0003\u0018\f\u0000\u00d5\u00d7\u0003\u001c\u000e\u0000"+
		"\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d91\u0001\u0000\u0000\u0000\u00da"+
		"\u00d8\u0001\u0000\u0000\u0000\u00db\u00dc\u00030\u0018\u0000\u00dc\u00dd"+
		"\u0005\u0000\u0000\u0001\u00dd3\u0001\u0000\u0000\u0000\u00de\u00e3\u0005"+
		"\u0015\u0000\u0000\u00df\u00e0\u0005\u0018\u0000\u0000\u00e0\u00e2\u0005"+
		"\u0015\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e45\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e7\u0005\f\u0000\u0000\u00e7\u00e8\u00034\u001a"+
		"\u0000\u00e8\u00e9\u0005\u000b\u0000\u0000\u00e97\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0005\f\u0000\u0000\u00eb\u00ec\u0005\u0015\u0000\u0000\u00ec"+
		"\u00ed\u0005\u000b\u0000\u0000\u00ed9\u0001\u0000\u0000\u0000\u000e=J"+
		"Td}\u00a1\u00b0\u00b6\u00c1\u00c9\u00d1\u00d6\u00d8\u00e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}