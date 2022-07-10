// Generated from /home/su/IdeaProjects/langA/langos.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class langosLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, IMPORT=2, SYNTAX=3, RETURN=4, WITH=5, QUEST=6, STAR=7, PLUS=8, ASSIGN=9, 
		DOT=10, LPAREN=11, RPAREN=12, LBRACE=13, RBRACE=14, LEND=15, REND=16, 
		BAR=17, GT=18, LT=19, CIRCUMFLEX=20, ID=21, COLON=22, SEMI=23, COMA=24, 
		DOUBLECOLON=25, ARROW=26, ANY=27, CHAR=28, STRING=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "IMPORT", "SYNTAX", "RETURN", "WITH", "QUEST", "STAR", "PLUS", 
			"ASSIGN", "DOT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LEND", "REND", 
			"BAR", "GT", "LT", "CIRCUMFLEX", "ID", "COLON", "SEMI", "COMA", "DOUBLECOLON", 
			"ARROW", "ANY", "CHAR", "STRING"
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
			"ARROW", "ANY", "CHAR", "STRING"
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


	public langosLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "langos.g4"; }

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
		"\u0004\u0000\u001d\u009c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0005\u0014z\b\u0014\n\u0014\f\u0014"+
		"}\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u0096\b\u001c\n\u001c\f\u001c\u0099\t\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u0097\u0000\u001d\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		"\u0001\u0000\u0003\u0003\u0000\t\n\r\r  \u0002\u0000AZaz\u0005\u0000-"+
		"-09AZ__az\u009e\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0001;\u0001\u0000\u0000"+
		"\u0000\u0003?\u0001\u0000\u0000\u0000\u0005F\u0001\u0000\u0000\u0000\u0007"+
		"M\u0001\u0000\u0000\u0000\tT\u0001\u0000\u0000\u0000\u000bY\u0001\u0000"+
		"\u0000\u0000\r[\u0001\u0000\u0000\u0000\u000f]\u0001\u0000\u0000\u0000"+
		"\u0011_\u0001\u0000\u0000\u0000\u0013a\u0001\u0000\u0000\u0000\u0015c"+
		"\u0001\u0000\u0000\u0000\u0017e\u0001\u0000\u0000\u0000\u0019g\u0001\u0000"+
		"\u0000\u0000\u001bi\u0001\u0000\u0000\u0000\u001dk\u0001\u0000\u0000\u0000"+
		"\u001fm\u0001\u0000\u0000\u0000!o\u0001\u0000\u0000\u0000#q\u0001\u0000"+
		"\u0000\u0000%s\u0001\u0000\u0000\u0000\'u\u0001\u0000\u0000\u0000)w\u0001"+
		"\u0000\u0000\u0000+~\u0001\u0000\u0000\u0000-\u0081\u0001\u0000\u0000"+
		"\u0000/\u0083\u0001\u0000\u0000\u00001\u0085\u0001\u0000\u0000\u00003"+
		"\u0088\u0001\u0000\u0000\u00005\u008b\u0001\u0000\u0000\u00007\u008d\u0001"+
		"\u0000\u0000\u00009\u0091\u0001\u0000\u0000\u0000;<\u0007\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=>\u0006\u0000\u0000\u0000>\u0002\u0001"+
		"\u0000\u0000\u0000?@\u0005i\u0000\u0000@A\u0005m\u0000\u0000AB\u0005p"+
		"\u0000\u0000BC\u0005o\u0000\u0000CD\u0005r\u0000\u0000DE\u0005t\u0000"+
		"\u0000E\u0004\u0001\u0000\u0000\u0000FG\u0005s\u0000\u0000GH\u0005y\u0000"+
		"\u0000HI\u0005n\u0000\u0000IJ\u0005t\u0000\u0000JK\u0005a\u0000\u0000"+
		"KL\u0005x\u0000\u0000L\u0006\u0001\u0000\u0000\u0000MN\u0005r\u0000\u0000"+
		"NO\u0005e\u0000\u0000OP\u0005t\u0000\u0000PQ\u0005u\u0000\u0000QR\u0005"+
		"r\u0000\u0000RS\u0005n\u0000\u0000S\b\u0001\u0000\u0000\u0000TU\u0005"+
		"w\u0000\u0000UV\u0005i\u0000\u0000VW\u0005t\u0000\u0000WX\u0005h\u0000"+
		"\u0000X\n\u0001\u0000\u0000\u0000YZ\u0005?\u0000\u0000Z\f\u0001\u0000"+
		"\u0000\u0000[\\\u0005*\u0000\u0000\\\u000e\u0001\u0000\u0000\u0000]^\u0005"+
		"+\u0000\u0000^\u0010\u0001\u0000\u0000\u0000_`\u0005=\u0000\u0000`\u0012"+
		"\u0001\u0000\u0000\u0000ab\u0005.\u0000\u0000b\u0014\u0001\u0000\u0000"+
		"\u0000cd\u0005)\u0000\u0000d\u0016\u0001\u0000\u0000\u0000ef\u0005(\u0000"+
		"\u0000f\u0018\u0001\u0000\u0000\u0000gh\u0005}\u0000\u0000h\u001a\u0001"+
		"\u0000\u0000\u0000ij\u0005{\u0000\u0000j\u001c\u0001\u0000\u0000\u0000"+
		"kl\u0005]\u0000\u0000l\u001e\u0001\u0000\u0000\u0000mn\u0005[\u0000\u0000"+
		"n \u0001\u0000\u0000\u0000op\u0005|\u0000\u0000p\"\u0001\u0000\u0000\u0000"+
		"qr\u0005>\u0000\u0000r$\u0001\u0000\u0000\u0000st\u0005<\u0000\u0000t"+
		"&\u0001\u0000\u0000\u0000uv\u0005^\u0000\u0000v(\u0001\u0000\u0000\u0000"+
		"w{\u0007\u0001\u0000\u0000xz\u0007\u0002\u0000\u0000yx\u0001\u0000\u0000"+
		"\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|*\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005:\u0000\u0000\u007f\u0080\u0005 \u0000\u0000\u0080,\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0005;\u0000\u0000\u0082.\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0005,\u0000\u0000\u00840\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0005:\u0000\u0000\u0086\u0087\u0005:\u0000\u0000\u00872\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0005-\u0000\u0000\u0089\u008a\u0005>\u0000\u0000"+
		"\u008a4\u0001\u0000\u0000\u0000\u008b\u008c\t\u0000\u0000\u0000\u008c"+
		"6\u0001\u0000\u0000\u0000\u008d\u008e\u0005\'\u0000\u0000\u008e\u008f"+
		"\u00035\u001a\u0000\u008f\u0090\u0005\'\u0000\u0000\u00908\u0001\u0000"+
		"\u0000\u0000\u0091\u0097\u0005\'\u0000\u0000\u0092\u0096\u00035\u001a"+
		"\u0000\u0093\u0094\u0005\\\u0000\u0000\u0094\u0096\u0005\'\u0000\u0000"+
		"\u0095\u0092\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000"+
		"\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u009a\u0001\u0000\u0000\u0000"+
		"\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009b\u0005\'\u0000\u0000\u009b"+
		":\u0001\u0000\u0000\u0000\u0004\u0000{\u0095\u0097\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}