// Generated from /home/su/IdeaProjects/langA/src/main/java/org/lexasub/langosThirdTryWithoutPromise/langosIR.g4 by ANTLR 4.10.1
package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class langosIRLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LOWBAR", "ARROW", "COLON", "SLASH", "COMA", "LPAREN", "RPAREN", "SHARP", 
			"CLASS", "ENDCLASS", "MEMBER", "IMPORT", "GET_ELEMENT_PTR", "MAP", "MAPo", 
			"PAIRMAP", "PAIRMAP_o", "PAIRMAPo_", "PAIRMAPoo", "POP", "PUSH", "MOV", 
			"EQCALL_THEN_JMP", "NEQCALL_THEN_JMP_EXTENDED", "EQ", "JMP", "BREAK", 
			"CONTINUE", "FUNC", "CALL", "RET", "ENTERSCOPE", "EXITSCOPE", "FUNCTION_ARGUMENT", 
			"WS", "TAB", "UNTAB", "ID1", "ID2", "ID", "FUNCID"
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


	public langosIRLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "langosIR.g4"; }

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
		"\u0004\u0000&\u016f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
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
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0003%\u015c"+
		"\b%\u0001&\u0001&\u0001\'\u0004\'\u0161\b\'\u000b\'\f\'\u0162\u0001\'"+
		"\u0001\'\u0005\'\u0167\b\'\n\'\f\'\u016a\t\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0000\u0000)\u0001\u0000\u0003\u0001\u0005\u0002\u0007\u0003\t\u0004"+
		"\u000b\u0005\r\u0006\u000f\u0007\u0011\b\u0013\t\u0015\n\u0017\u000b\u0019"+
		"\f\u001b\r\u001d\u000e\u001f\u000f!\u0010#\u0011%\u0012\'\u0013)\u0014"+
		"+\u0015-\u0016/\u00171\u00183\u00195\u001a7\u001b9\u001c;\u001d=\u001e"+
		"?\u001fA C!E\"G#I$K\u0000M\u0000O%Q&\u0001\u0000\u0003\u0003\u0000\t\n"+
		"\r\r  \u0002\u0000AZaz\u0001\u000009\u016f\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003"+
		"\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000"+
		"\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000"+
		"\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A"+
		"\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000"+
		"\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000"+
		"\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0001S"+
		"\u0001\u0000\u0000\u0000\u0003U\u0001\u0000\u0000\u0000\u0005X\u0001\u0000"+
		"\u0000\u0000\u0007Z\u0001\u0000\u0000\u0000\t\\\u0001\u0000\u0000\u0000"+
		"\u000b^\u0001\u0000\u0000\u0000\r`\u0001\u0000\u0000\u0000\u000fb\u0001"+
		"\u0000\u0000\u0000\u0011d\u0001\u0000\u0000\u0000\u0013j\u0001\u0000\u0000"+
		"\u0000\u0015s\u0001\u0000\u0000\u0000\u0017z\u0001\u0000\u0000\u0000\u0019"+
		"\u0081\u0001\u0000\u0000\u0000\u001b\u0091\u0001\u0000\u0000\u0000\u001d"+
		"\u0095\u0001\u0000\u0000\u0000\u001f\u009a\u0001\u0000\u0000\u0000!\u00a2"+
		"\u0001\u0000\u0000\u0000#\u00ac\u0001\u0000\u0000\u0000%\u00b6\u0001\u0000"+
		"\u0000\u0000\'\u00c0\u0001\u0000\u0000\u0000)\u00c4\u0001\u0000\u0000"+
		"\u0000+\u00c9\u0001\u0000\u0000\u0000-\u00cd\u0001\u0000\u0000\u0000/"+
		"\u00dd\u0001\u0000\u0000\u00001\u00f7\u0001\u0000\u0000\u00003\u00fa\u0001"+
		"\u0000\u0000\u00005\u00fe\u0001\u0000\u0000\u00007\u0104\u0001\u0000\u0000"+
		"\u00009\u010d\u0001\u0000\u0000\u0000;\u0117\u0001\u0000\u0000\u0000="+
		"\u011c\u0001\u0000\u0000\u0000?\u0120\u0001\u0000\u0000\u0000A\u012b\u0001"+
		"\u0000\u0000\u0000C\u0135\u0001\u0000\u0000\u0000E\u0147\u0001\u0000\u0000"+
		"\u0000G\u014b\u0001\u0000\u0000\u0000I\u0151\u0001\u0000\u0000\u0000K"+
		"\u015b\u0001\u0000\u0000\u0000M\u015d\u0001\u0000\u0000\u0000O\u0160\u0001"+
		"\u0000\u0000\u0000Q\u016b\u0001\u0000\u0000\u0000ST\u0005_\u0000\u0000"+
		"T\u0002\u0001\u0000\u0000\u0000UV\u0005-\u0000\u0000VW\u0005>\u0000\u0000"+
		"W\u0004\u0001\u0000\u0000\u0000XY\u0005:\u0000\u0000Y\u0006\u0001\u0000"+
		"\u0000\u0000Z[\u0005/\u0000\u0000[\b\u0001\u0000\u0000\u0000\\]\u0005"+
		",\u0000\u0000]\n\u0001\u0000\u0000\u0000^_\u0005)\u0000\u0000_\f\u0001"+
		"\u0000\u0000\u0000`a\u0005(\u0000\u0000a\u000e\u0001\u0000\u0000\u0000"+
		"bc\u0005#\u0000\u0000c\u0010\u0001\u0000\u0000\u0000de\u0005C\u0000\u0000"+
		"ef\u0005L\u0000\u0000fg\u0005A\u0000\u0000gh\u0005S\u0000\u0000hi\u0005"+
		"S\u0000\u0000i\u0012\u0001\u0000\u0000\u0000jk\u0005E\u0000\u0000kl\u0005"+
		"N\u0000\u0000lm\u0005D\u0000\u0000mn\u0005C\u0000\u0000no\u0005L\u0000"+
		"\u0000op\u0005A\u0000\u0000pq\u0005S\u0000\u0000qr\u0005S\u0000\u0000"+
		"r\u0014\u0001\u0000\u0000\u0000st\u0005M\u0000\u0000tu\u0005E\u0000\u0000"+
		"uv\u0005M\u0000\u0000vw\u0005B\u0000\u0000wx\u0005E\u0000\u0000xy\u0005"+
		"R\u0000\u0000y\u0016\u0001\u0000\u0000\u0000z{\u0005I\u0000\u0000{|\u0005"+
		"M\u0000\u0000|}\u0005P\u0000\u0000}~\u0005O\u0000\u0000~\u007f\u0005R"+
		"\u0000\u0000\u007f\u0080\u0005T\u0000\u0000\u0080\u0018\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0005G\u0000\u0000\u0082\u0083\u0005E\u0000\u0000\u0083"+
		"\u0084\u0005T\u0000\u0000\u0084\u0085\u0005_\u0000\u0000\u0085\u0086\u0005"+
		"E\u0000\u0000\u0086\u0087\u0005L\u0000\u0000\u0087\u0088\u0005E\u0000"+
		"\u0000\u0088\u0089\u0005M\u0000\u0000\u0089\u008a\u0005E\u0000\u0000\u008a"+
		"\u008b\u0005N\u0000\u0000\u008b\u008c\u0005T\u0000\u0000\u008c\u008d\u0005"+
		"_\u0000\u0000\u008d\u008e\u0005P\u0000\u0000\u008e\u008f\u0005T\u0000"+
		"\u0000\u008f\u0090\u0005R\u0000\u0000\u0090\u001a\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0005M\u0000\u0000\u0092\u0093\u0005A\u0000\u0000\u0093\u0094"+
		"\u0005P\u0000\u0000\u0094\u001c\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"M\u0000\u0000\u0096\u0097\u0005A\u0000\u0000\u0097\u0098\u0005P\u0000"+
		"\u0000\u0098\u0099\u0005o\u0000\u0000\u0099\u001e\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0005P\u0000\u0000\u009b\u009c\u0005A\u0000\u0000\u009c\u009d"+
		"\u0005I\u0000\u0000\u009d\u009e\u0005R\u0000\u0000\u009e\u009f\u0005M"+
		"\u0000\u0000\u009f\u00a0\u0005A\u0000\u0000\u00a0\u00a1\u0005P\u0000\u0000"+
		"\u00a1 \u0001\u0000\u0000\u0000\u00a2\u00a3\u0005P\u0000\u0000\u00a3\u00a4"+
		"\u0005A\u0000\u0000\u00a4\u00a5\u0005I\u0000\u0000\u00a5\u00a6\u0005R"+
		"\u0000\u0000\u00a6\u00a7\u0005M\u0000\u0000\u00a7\u00a8\u0005A\u0000\u0000"+
		"\u00a8\u00a9\u0005P\u0000\u0000\u00a9\u00aa\u0005_\u0000\u0000\u00aa\u00ab"+
		"\u0005o\u0000\u0000\u00ab\"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005"+
		"P\u0000\u0000\u00ad\u00ae\u0005A\u0000\u0000\u00ae\u00af\u0005I\u0000"+
		"\u0000\u00af\u00b0\u0005R\u0000\u0000\u00b0\u00b1\u0005M\u0000\u0000\u00b1"+
		"\u00b2\u0005A\u0000\u0000\u00b2\u00b3\u0005P\u0000\u0000\u00b3\u00b4\u0005"+
		"o\u0000\u0000\u00b4\u00b5\u0005_\u0000\u0000\u00b5$\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0005P\u0000\u0000\u00b7\u00b8\u0005A\u0000\u0000\u00b8"+
		"\u00b9\u0005I\u0000\u0000\u00b9\u00ba\u0005R\u0000\u0000\u00ba\u00bb\u0005"+
		"M\u0000\u0000\u00bb\u00bc\u0005A\u0000\u0000\u00bc\u00bd\u0005P\u0000"+
		"\u0000\u00bd\u00be\u0005o\u0000\u0000\u00be\u00bf\u0005o\u0000\u0000\u00bf"+
		"&\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005P\u0000\u0000\u00c1\u00c2\u0005"+
		"O\u0000\u0000\u00c2\u00c3\u0005P\u0000\u0000\u00c3(\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0005P\u0000\u0000\u00c5\u00c6\u0005U\u0000\u0000\u00c6"+
		"\u00c7\u0005S\u0000\u0000\u00c7\u00c8\u0005H\u0000\u0000\u00c8*\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0005M\u0000\u0000\u00ca\u00cb\u0005O\u0000"+
		"\u0000\u00cb\u00cc\u0005V\u0000\u0000\u00cc,\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0005E\u0000\u0000\u00ce\u00cf\u0005Q\u0000\u0000\u00cf\u00d0\u0005"+
		"C\u0000\u0000\u00d0\u00d1\u0005A\u0000\u0000\u00d1\u00d2\u0005L\u0000"+
		"\u0000\u00d2\u00d3\u0005L\u0000\u0000\u00d3\u00d4\u0005_\u0000\u0000\u00d4"+
		"\u00d5\u0005T\u0000\u0000\u00d5\u00d6\u0005H\u0000\u0000\u00d6\u00d7\u0005"+
		"E\u0000\u0000\u00d7\u00d8\u0005N\u0000\u0000\u00d8\u00d9\u0005_\u0000"+
		"\u0000\u00d9\u00da\u0005J\u0000\u0000\u00da\u00db\u0005M\u0000\u0000\u00db"+
		"\u00dc\u0005P\u0000\u0000\u00dc.\u0001\u0000\u0000\u0000\u00dd\u00de\u0005"+
		"N\u0000\u0000\u00de\u00df\u0005E\u0000\u0000\u00df\u00e0\u0005Q\u0000"+
		"\u0000\u00e0\u00e1\u0005C\u0000\u0000\u00e1\u00e2\u0005A\u0000\u0000\u00e2"+
		"\u00e3\u0005L\u0000\u0000\u00e3\u00e4\u0005L\u0000\u0000\u00e4\u00e5\u0005"+
		"_\u0000\u0000\u00e5\u00e6\u0005T\u0000\u0000\u00e6\u00e7\u0005H\u0000"+
		"\u0000\u00e7\u00e8\u0005E\u0000\u0000\u00e8\u00e9\u0005N\u0000\u0000\u00e9"+
		"\u00ea\u0005_\u0000\u0000\u00ea\u00eb\u0005J\u0000\u0000\u00eb\u00ec\u0005"+
		"M\u0000\u0000\u00ec\u00ed\u0005P\u0000\u0000\u00ed\u00ee\u0005_\u0000"+
		"\u0000\u00ee\u00ef\u0005E\u0000\u0000\u00ef\u00f0\u0005X\u0000\u0000\u00f0"+
		"\u00f1\u0005T\u0000\u0000\u00f1\u00f2\u0005E\u0000\u0000\u00f2\u00f3\u0005"+
		"N\u0000\u0000\u00f3\u00f4\u0005D\u0000\u0000\u00f4\u00f5\u0005E\u0000"+
		"\u0000\u00f5\u00f6\u0005D\u0000\u0000\u00f60\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0005E\u0000\u0000\u00f8\u00f9\u0005Q\u0000\u0000\u00f92\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0005J\u0000\u0000\u00fb\u00fc\u0005M\u0000"+
		"\u0000\u00fc\u00fd\u0005P\u0000\u0000\u00fd4\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u0005B\u0000\u0000\u00ff\u0100\u0005R\u0000\u0000\u0100\u0101\u0005"+
		"E\u0000\u0000\u0101\u0102\u0005A\u0000\u0000\u0102\u0103\u0005K\u0000"+
		"\u0000\u01036\u0001\u0000\u0000\u0000\u0104\u0105\u0005C\u0000\u0000\u0105"+
		"\u0106\u0005O\u0000\u0000\u0106\u0107\u0005N\u0000\u0000\u0107\u0108\u0005"+
		"T\u0000\u0000\u0108\u0109\u0005I\u0000\u0000\u0109\u010a\u0005N\u0000"+
		"\u0000\u010a\u010b\u0005U\u0000\u0000\u010b\u010c\u0005E\u0000\u0000\u010c"+
		"8\u0001\u0000\u0000\u0000\u010d\u010e\u0005F\u0000\u0000\u010e\u010f\u0005"+
		"U\u0000\u0000\u010f\u0110\u0005N\u0000\u0000\u0110\u0111\u0005C\u0000"+
		"\u0000\u0111\u0112\u0005T\u0000\u0000\u0112\u0113\u0005I\u0000\u0000\u0113"+
		"\u0114\u0005O\u0000\u0000\u0114\u0115\u0005N\u0000\u0000\u0115\u0116\u0005"+
		"_\u0000\u0000\u0116:\u0001\u0000\u0000\u0000\u0117\u0118\u0005C\u0000"+
		"\u0000\u0118\u0119\u0005A\u0000\u0000\u0119\u011a\u0005L\u0000\u0000\u011a"+
		"\u011b\u0005L\u0000\u0000\u011b<\u0001\u0000\u0000\u0000\u011c\u011d\u0005"+
		"R\u0000\u0000\u011d\u011e\u0005E\u0000\u0000\u011e\u011f\u0005T\u0000"+
		"\u0000\u011f>\u0001\u0000\u0000\u0000\u0120\u0121\u0005E\u0000\u0000\u0121"+
		"\u0122\u0005N\u0000\u0000\u0122\u0123\u0005T\u0000\u0000\u0123\u0124\u0005"+
		"E\u0000\u0000\u0124\u0125\u0005R\u0000\u0000\u0125\u0126\u0005S\u0000"+
		"\u0000\u0126\u0127\u0005C\u0000\u0000\u0127\u0128\u0005O\u0000\u0000\u0128"+
		"\u0129\u0005P\u0000\u0000\u0129\u012a\u0005E\u0000\u0000\u012a@\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\u0005E\u0000\u0000\u012c\u012d\u0005X\u0000"+
		"\u0000\u012d\u012e\u0005I\u0000\u0000\u012e\u012f\u0005T\u0000\u0000\u012f"+
		"\u0130\u0005S\u0000\u0000\u0130\u0131\u0005C\u0000\u0000\u0131\u0132\u0005"+
		"O\u0000\u0000\u0132\u0133\u0005P\u0000\u0000\u0133\u0134\u0005E\u0000"+
		"\u0000\u0134B\u0001\u0000\u0000\u0000\u0135\u0136\u0005F\u0000\u0000\u0136"+
		"\u0137\u0005U\u0000\u0000\u0137\u0138\u0005N\u0000\u0000\u0138\u0139\u0005"+
		"C\u0000\u0000\u0139\u013a\u0005T\u0000\u0000\u013a\u013b\u0005I\u0000"+
		"\u0000\u013b\u013c\u0005O\u0000\u0000\u013c\u013d\u0005N\u0000\u0000\u013d"+
		"\u013e\u0005_\u0000\u0000\u013e\u013f\u0005A\u0000\u0000\u013f\u0140\u0005"+
		"R\u0000\u0000\u0140\u0141\u0005G\u0000\u0000\u0141\u0142\u0005U\u0000"+
		"\u0000\u0142\u0143\u0005M\u0000\u0000\u0143\u0144\u0005E\u0000\u0000\u0144"+
		"\u0145\u0005N\u0000\u0000\u0145\u0146\u0005T\u0000\u0000\u0146D\u0001"+
		"\u0000\u0000\u0000\u0147\u0148\u0007\u0000\u0000\u0000\u0148\u0149\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0006\"\u0000\u0000\u014aF\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0005T\u0000\u0000\u014c\u014d\u0005A\u0000\u0000"+
		"\u014d\u014e\u0005B\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f"+
		"\u0150\u0006#\u0000\u0000\u0150H\u0001\u0000\u0000\u0000\u0151\u0152\u0005"+
		"U\u0000\u0000\u0152\u0153\u0005N\u0000\u0000\u0153\u0154\u0005T\u0000"+
		"\u0000\u0154\u0155\u0005A\u0000\u0000\u0155\u0156\u0005B\u0000\u0000\u0156"+
		"\u0157\u0001\u0000\u0000\u0000\u0157\u0158\u0006$\u0000\u0000\u0158J\u0001"+
		"\u0000\u0000\u0000\u0159\u015c\u0007\u0001\u0000\u0000\u015a\u015c\u0003"+
		"\u0001\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015a\u0001"+
		"\u0000\u0000\u0000\u015cL\u0001\u0000\u0000\u0000\u015d\u015e\u0007\u0002"+
		"\u0000\u0000\u015eN\u0001\u0000\u0000\u0000\u015f\u0161\u0003K%\u0000"+
		"\u0160\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000"+
		"\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000"+
		"\u0163\u0168\u0001\u0000\u0000\u0000\u0164\u0167\u0003K%\u0000\u0165\u0167"+
		"\u0003M&\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166\u0165\u0001\u0000"+
		"\u0000\u0000\u0167\u016a\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000"+
		"\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169P\u0001\u0000\u0000"+
		"\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016b\u016c\u00039\u001c\u0000"+
		"\u016c\u016d\u0003O\'\u0000\u016d\u016e\u0003\u0005\u0002\u0000\u016e"+
		"R\u0001\u0000\u0000\u0000\u0005\u0000\u015b\u0162\u0166\u0168\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}