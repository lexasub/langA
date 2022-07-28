// Generated from /home/su/IdeaProjects/langA/langosWithoutSyntax.g4 by ANTLR 4.10.1
package org.lexasub.langos.secondTry;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class langosWithoutSyntaxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, IMPORT=2, SYNTAX=3, RETURN=4, WITH=5, MAP=6, PAIRMAP=7, IF=8, WHILE=9, 
		CONTINUE=10, BREAK=11, QUEST=12, STAR=13, PLUS=14, MINUS=15, ASSIGN=16, 
		DOT=17, LPAREN=18, RPAREN=19, LBRACE=20, RBRACE=21, LEND=22, REND=23, 
		BAR=24, GT=25, LT=26, CIRCUMFLEX=27, ID=28, COLON=29, SEMI=30, COMA=31, 
		DOUBLECOLON=32, ARROW=33, CHAR=34, STRING=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "IMPORT", "SYNTAX", "RETURN", "WITH", "MAP", "PAIRMAP", "IF", "WHILE", 
			"CONTINUE", "BREAK", "QUEST", "STAR", "PLUS", "MINUS", "ASSIGN", "DOT", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LEND", "REND", "BAR", "GT", 
			"LT", "CIRCUMFLEX", "ID", "COLON", "SEMI", "COMA", "DOUBLECOLON", "ARROW", 
			"ANY", "CHAR", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'import'", "'syntax'", "'return'", "'with'", "'map'", "'pairmap'", 
			"'if'", "'while'", "'continue'", "'break'", "'?'", "'*'", "'+'", "'-'", 
			"'='", "'.'", "')'", "'('", "'}'", "'{'", "']'", "'['", "'|'", "'>'", 
			"'<'", "'^'", null, "': '", "';'", "','", "'::'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "IMPORT", "SYNTAX", "RETURN", "WITH", "MAP", "PAIRMAP", "IF", 
			"WHILE", "CONTINUE", "BREAK", "QUEST", "STAR", "PLUS", "MINUS", "ASSIGN", 
			"DOT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LEND", "REND", "BAR", 
			"GT", "LT", "CIRCUMFLEX", "ID", "COLON", "SEMI", "COMA", "DOUBLECOLON", 
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


	public langosWithoutSyntaxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "langosWithoutSyntax.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000#\u00d0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0005\u001b\u00ae\b\u001b"+
		"\n\u001b\f\u001b\u00b1\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0001#\u0005#\u00ca\b#\n#\f#\u00cd\t#\u0001#\u0001"+
		"#\u0001\u00cb\u0000$\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014"+
		")\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e"+
		"=\u001f? A!C\u0000E\"G#\u0001\u0000\u0003\u0003\u0000\t\n\r\r  \u0002"+
		"\u0000AZaz\u0005\u0000--09AZ__az\u00d1\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000"+
		";\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001"+
		"\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000"+
		"\u0000\u0000G\u0001\u0000\u0000\u0000\u0001I\u0001\u0000\u0000\u0000\u0003"+
		"M\u0001\u0000\u0000\u0000\u0005T\u0001\u0000\u0000\u0000\u0007[\u0001"+
		"\u0000\u0000\u0000\tb\u0001\u0000\u0000\u0000\u000bg\u0001\u0000\u0000"+
		"\u0000\rk\u0001\u0000\u0000\u0000\u000fs\u0001\u0000\u0000\u0000\u0011"+
		"v\u0001\u0000\u0000\u0000\u0013|\u0001\u0000\u0000\u0000\u0015\u0085\u0001"+
		"\u0000\u0000\u0000\u0017\u008b\u0001\u0000\u0000\u0000\u0019\u008d\u0001"+
		"\u0000\u0000\u0000\u001b\u008f\u0001\u0000\u0000\u0000\u001d\u0091\u0001"+
		"\u0000\u0000\u0000\u001f\u0093\u0001\u0000\u0000\u0000!\u0095\u0001\u0000"+
		"\u0000\u0000#\u0097\u0001\u0000\u0000\u0000%\u0099\u0001\u0000\u0000\u0000"+
		"\'\u009b\u0001\u0000\u0000\u0000)\u009d\u0001\u0000\u0000\u0000+\u009f"+
		"\u0001\u0000\u0000\u0000-\u00a1\u0001\u0000\u0000\u0000/\u00a3\u0001\u0000"+
		"\u0000\u00001\u00a5\u0001\u0000\u0000\u00003\u00a7\u0001\u0000\u0000\u0000"+
		"5\u00a9\u0001\u0000\u0000\u00007\u00ab\u0001\u0000\u0000\u00009\u00b2"+
		"\u0001\u0000\u0000\u0000;\u00b5\u0001\u0000\u0000\u0000=\u00b7\u0001\u0000"+
		"\u0000\u0000?\u00b9\u0001\u0000\u0000\u0000A\u00bc\u0001\u0000\u0000\u0000"+
		"C\u00bf\u0001\u0000\u0000\u0000E\u00c1\u0001\u0000\u0000\u0000G\u00c5"+
		"\u0001\u0000\u0000\u0000IJ\u0007\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KL\u0006\u0000\u0000\u0000L\u0002\u0001\u0000\u0000\u0000MN\u0005"+
		"i\u0000\u0000NO\u0005m\u0000\u0000OP\u0005p\u0000\u0000PQ\u0005o\u0000"+
		"\u0000QR\u0005r\u0000\u0000RS\u0005t\u0000\u0000S\u0004\u0001\u0000\u0000"+
		"\u0000TU\u0005s\u0000\u0000UV\u0005y\u0000\u0000VW\u0005n\u0000\u0000"+
		"WX\u0005t\u0000\u0000XY\u0005a\u0000\u0000YZ\u0005x\u0000\u0000Z\u0006"+
		"\u0001\u0000\u0000\u0000[\\\u0005r\u0000\u0000\\]\u0005e\u0000\u0000]"+
		"^\u0005t\u0000\u0000^_\u0005u\u0000\u0000_`\u0005r\u0000\u0000`a\u0005"+
		"n\u0000\u0000a\b\u0001\u0000\u0000\u0000bc\u0005w\u0000\u0000cd\u0005"+
		"i\u0000\u0000de\u0005t\u0000\u0000ef\u0005h\u0000\u0000f\n\u0001\u0000"+
		"\u0000\u0000gh\u0005m\u0000\u0000hi\u0005a\u0000\u0000ij\u0005p\u0000"+
		"\u0000j\f\u0001\u0000\u0000\u0000kl\u0005p\u0000\u0000lm\u0005a\u0000"+
		"\u0000mn\u0005i\u0000\u0000no\u0005r\u0000\u0000op\u0005m\u0000\u0000"+
		"pq\u0005a\u0000\u0000qr\u0005p\u0000\u0000r\u000e\u0001\u0000\u0000\u0000"+
		"st\u0005i\u0000\u0000tu\u0005f\u0000\u0000u\u0010\u0001\u0000\u0000\u0000"+
		"vw\u0005w\u0000\u0000wx\u0005h\u0000\u0000xy\u0005i\u0000\u0000yz\u0005"+
		"l\u0000\u0000z{\u0005e\u0000\u0000{\u0012\u0001\u0000\u0000\u0000|}\u0005"+
		"c\u0000\u0000}~\u0005o\u0000\u0000~\u007f\u0005n\u0000\u0000\u007f\u0080"+
		"\u0005t\u0000\u0000\u0080\u0081\u0005i\u0000\u0000\u0081\u0082\u0005n"+
		"\u0000\u0000\u0082\u0083\u0005u\u0000\u0000\u0083\u0084\u0005e\u0000\u0000"+
		"\u0084\u0014\u0001\u0000\u0000\u0000\u0085\u0086\u0005b\u0000\u0000\u0086"+
		"\u0087\u0005r\u0000\u0000\u0087\u0088\u0005e\u0000\u0000\u0088\u0089\u0005"+
		"a\u0000\u0000\u0089\u008a\u0005k\u0000\u0000\u008a\u0016\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0005?\u0000\u0000\u008c\u0018\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0005*\u0000\u0000\u008e\u001a\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005+\u0000\u0000\u0090\u001c\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0005-\u0000\u0000\u0092\u001e\u0001\u0000\u0000\u0000\u0093\u0094\u0005"+
		"=\u0000\u0000\u0094 \u0001\u0000\u0000\u0000\u0095\u0096\u0005.\u0000"+
		"\u0000\u0096\"\u0001\u0000\u0000\u0000\u0097\u0098\u0005)\u0000\u0000"+
		"\u0098$\u0001\u0000\u0000\u0000\u0099\u009a\u0005(\u0000\u0000\u009a&"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0005}\u0000\u0000\u009c(\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0005{\u0000\u0000\u009e*\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0005]\u0000\u0000\u00a0,\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0005[\u0000\u0000\u00a2.\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005|"+
		"\u0000\u0000\u00a40\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005>\u0000\u0000"+
		"\u00a62\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005<\u0000\u0000\u00a84"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005^\u0000\u0000\u00aa6\u0001\u0000"+
		"\u0000\u0000\u00ab\u00af\u0007\u0001\u0000\u0000\u00ac\u00ae\u0007\u0002"+
		"\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000"+
		"\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b08\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0005:\u0000\u0000\u00b3\u00b4\u0005 \u0000\u0000\u00b4"+
		":\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005;\u0000\u0000\u00b6<\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0005,\u0000\u0000\u00b8>\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0005:\u0000\u0000\u00ba\u00bb\u0005:\u0000\u0000\u00bb"+
		"@\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005-\u0000\u0000\u00bd\u00be\u0005"+
		">\u0000\u0000\u00beB\u0001\u0000\u0000\u0000\u00bf\u00c0\t\u0000\u0000"+
		"\u0000\u00c0D\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\'\u0000\u0000"+
		"\u00c2\u00c3\u0003C!\u0000\u00c3\u00c4\u0005\'\u0000\u0000\u00c4F\u0001"+
		"\u0000\u0000\u0000\u00c5\u00cb\u0005\'\u0000\u0000\u00c6\u00ca\u0003C"+
		"!\u0000\u00c7\u00c8\u0005\\\u0000\u0000\u00c8\u00ca\u0005\'\u0000\u0000"+
		"\u00c9\u00c6\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000"+
		"\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\'\u0000\u0000\u00cf"+
		"H\u0001\u0000\u0000\u0000\u0004\u0000\u00af\u00c9\u00cb\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}