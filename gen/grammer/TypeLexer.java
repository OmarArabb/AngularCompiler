// Generated from C:/Users/n_alb/IdeaProjects/AngularCompiler/src/grammer/TypeLexer.g4 by ANTLR 4.13.2
package grammer;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TypeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, FOR=3, DO=4, WHILE=5, FUNCTION=6, RETURN=7, FOREACH=8, ARROW=9, 
		TYPE=10, VARIABLE_TYPE=11, PLUS=12, MINUS=13, TIMES=14, DIVIDE=15, EQUAL=16, 
		EQUAL_EQUAL=17, NOT_EQUAL=18, GREATER=19, GREATER_EQUAL=20, LESS=21, LESS_EQUAL=22, 
		INCREMENT=23, DECREMENT=24, PLUS_EQUAL=25, MINUS_EQUAL=26, MUL_ASSIGN=27, 
		DIV_ASSIGN=28, MOD_ASSIGN=29, LPAREN=30, RPAREN=31, LBRACKET=32, RBRACKET=33, 
		SEMICOLON=34, COMMA=35, COLON=36, DOT=37, IMPORT=38, EXPORT=39, FROM=40, 
		AND=41, OR=42, IDENTIFIER=43, NUMBER=44, STRING=45, BOOLEAN=46, WHITESPACE=47, 
		COMMENT=48, BLOCK_COMMENT=49, CLASS=50, LBRACE=51, RBRACE=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "FOR", "DO", "WHILE", "FUNCTION", "RETURN", "FOREACH", 
			"ARROW", "TYPE", "VARIABLE_TYPE", "PLUS", "MINUS", "TIMES", "DIVIDE", 
			"EQUAL", "EQUAL_EQUAL", "NOT_EQUAL", "GREATER", "GREATER_EQUAL", "LESS", 
			"LESS_EQUAL", "INCREMENT", "DECREMENT", "PLUS_EQUAL", "MINUS_EQUAL", 
			"MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "LPAREN", "RPAREN", "LBRACKET", 
			"RBRACKET", "SEMICOLON", "COMMA", "COLON", "DOT", "IMPORT", "EXPORT", 
			"FROM", "AND", "OR", "IDENTIFIER", "NUMBER", "STRING", "BOOLEAN", "WHITESPACE", 
			"COMMENT", "BLOCK_COMMENT", "CLASS", "LBRACE", "RBRACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'for'", "'do'", "'while'", "'function'", "'return'", 
			"'forEach'", "'=>'", null, null, "'+'", "'-'", "'*'", "'/'", "'='", "'=='", 
			"'!='", "'>'", "'>='", "'<'", "'<='", "'++'", "'--'", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'('", "')'", "'['", "']'", "';'", "','", "':'", 
			"'.'", "'import'", "'export'", "'from'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "FOR", "DO", "WHILE", "FUNCTION", "RETURN", "FOREACH", 
			"ARROW", "TYPE", "VARIABLE_TYPE", "PLUS", "MINUS", "TIMES", "DIVIDE", 
			"EQUAL", "EQUAL_EQUAL", "NOT_EQUAL", "GREATER", "GREATER_EQUAL", "LESS", 
			"LESS_EQUAL", "INCREMENT", "DECREMENT", "PLUS_EQUAL", "MINUS_EQUAL", 
			"MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "LPAREN", "RPAREN", "LBRACKET", 
			"RBRACKET", "SEMICOLON", "COMMA", "COLON", "DOT", "IMPORT", "EXPORT", 
			"FROM", "AND", "OR", "IDENTIFIER", "NUMBER", "STRING", "BOOLEAN", "WHITESPACE", 
			"COMMENT", "BLOCK_COMMENT", "CLASS", "LBRACE", "RBRACE"
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


	public TypeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TypeLexer.g4"; }

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
		"\u0004\u00004\u017c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
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
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00b4\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00c1"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!"+
		"\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001("+
		"\u0001)\u0001)\u0001)\u0001*\u0001*\u0005*\u011d\b*\n*\f*\u0120\t*\u0001"+
		"+\u0004+\u0123\b+\u000b+\f+\u0124\u0001+\u0001+\u0004+\u0129\b+\u000b"+
		"+\f+\u012a\u0003+\u012d\b+\u0001,\u0001,\u0005,\u0131\b,\n,\f,\u0134\t"+
		",\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0003-\u0141\b-\u0001.\u0004.\u0144\b.\u000b.\f.\u0145\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u0001/\u0005/\u014e\b/\n/\f/\u0151\t/\u0001"+
		"/\u0001/\u00010\u00010\u00010\u00010\u00050\u0159\b0\n0\f0\u015c\t0\u0001"+
		"0\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00051\u016a\b1\n1\f1\u016d\t1\u00012\u00012\u00052\u0171\b2"+
		"\n2\f2\u0174\t2\u00013\u00013\u00053\u0178\b3\n3\f3\u017b\t3\u0001\u015a"+
		"\u00004\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\""+
		"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4\u0001\u0000\u0006\u0004\u0000$$"+
		"AZ__az\u0005\u0000$$09AZ__az\u0001\u000009\u0003\u0000\n\n\r\r\"\"\u0003"+
		"\u0000\t\n\r\r  \u0003\u0000\n\n\r\r  \u018d\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000"+
		"\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?"+
		"\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000"+
		"\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000"+
		"\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M"+
		"\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000"+
		"\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000"+
		"\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000["+
		"\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000"+
		"\u0000\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000"+
		"\u0000e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000\u0001i"+
		"\u0001\u0000\u0000\u0000\u0003l\u0001\u0000\u0000\u0000\u0005q\u0001\u0000"+
		"\u0000\u0000\u0007u\u0001\u0000\u0000\u0000\tx\u0001\u0000\u0000\u0000"+
		"\u000b~\u0001\u0000\u0000\u0000\r\u0087\u0001\u0000\u0000\u0000\u000f"+
		"\u008e\u0001\u0000\u0000\u0000\u0011\u0096\u0001\u0000\u0000\u0000\u0013"+
		"\u00b3\u0001\u0000\u0000\u0000\u0015\u00c0\u0001\u0000\u0000\u0000\u0017"+
		"\u00c2\u0001\u0000\u0000\u0000\u0019\u00c4\u0001\u0000\u0000\u0000\u001b"+
		"\u00c6\u0001\u0000\u0000\u0000\u001d\u00c8\u0001\u0000\u0000\u0000\u001f"+
		"\u00ca\u0001\u0000\u0000\u0000!\u00cc\u0001\u0000\u0000\u0000#\u00cf\u0001"+
		"\u0000\u0000\u0000%\u00d2\u0001\u0000\u0000\u0000\'\u00d4\u0001\u0000"+
		"\u0000\u0000)\u00d7\u0001\u0000\u0000\u0000+\u00d9\u0001\u0000\u0000\u0000"+
		"-\u00dc\u0001\u0000\u0000\u0000/\u00df\u0001\u0000\u0000\u00001\u00e2"+
		"\u0001\u0000\u0000\u00003\u00e5\u0001\u0000\u0000\u00005\u00e8\u0001\u0000"+
		"\u0000\u00007\u00eb\u0001\u0000\u0000\u00009\u00ee\u0001\u0000\u0000\u0000"+
		";\u00f1\u0001\u0000\u0000\u0000=\u00f3\u0001\u0000\u0000\u0000?\u00f5"+
		"\u0001\u0000\u0000\u0000A\u00f7\u0001\u0000\u0000\u0000C\u00f9\u0001\u0000"+
		"\u0000\u0000E\u00fb\u0001\u0000\u0000\u0000G\u00fd\u0001\u0000\u0000\u0000"+
		"I\u00ff\u0001\u0000\u0000\u0000K\u0101\u0001\u0000\u0000\u0000M\u0108"+
		"\u0001\u0000\u0000\u0000O\u010f\u0001\u0000\u0000\u0000Q\u0114\u0001\u0000"+
		"\u0000\u0000S\u0117\u0001\u0000\u0000\u0000U\u011a\u0001\u0000\u0000\u0000"+
		"W\u0122\u0001\u0000\u0000\u0000Y\u012e\u0001\u0000\u0000\u0000[\u0140"+
		"\u0001\u0000\u0000\u0000]\u0143\u0001\u0000\u0000\u0000_\u0149\u0001\u0000"+
		"\u0000\u0000a\u0154\u0001\u0000\u0000\u0000c\u0162\u0001\u0000\u0000\u0000"+
		"e\u016e\u0001\u0000\u0000\u0000g\u0175\u0001\u0000\u0000\u0000ij\u0005"+
		"i\u0000\u0000jk\u0005f\u0000\u0000k\u0002\u0001\u0000\u0000\u0000lm\u0005"+
		"e\u0000\u0000mn\u0005l\u0000\u0000no\u0005s\u0000\u0000op\u0005e\u0000"+
		"\u0000p\u0004\u0001\u0000\u0000\u0000qr\u0005f\u0000\u0000rs\u0005o\u0000"+
		"\u0000st\u0005r\u0000\u0000t\u0006\u0001\u0000\u0000\u0000uv\u0005d\u0000"+
		"\u0000vw\u0005o\u0000\u0000w\b\u0001\u0000\u0000\u0000xy\u0005w\u0000"+
		"\u0000yz\u0005h\u0000\u0000z{\u0005i\u0000\u0000{|\u0005l\u0000\u0000"+
		"|}\u0005e\u0000\u0000}\n\u0001\u0000\u0000\u0000~\u007f\u0005f\u0000\u0000"+
		"\u007f\u0080\u0005u\u0000\u0000\u0080\u0081\u0005n\u0000\u0000\u0081\u0082"+
		"\u0005c\u0000\u0000\u0082\u0083\u0005t\u0000\u0000\u0083\u0084\u0005i"+
		"\u0000\u0000\u0084\u0085\u0005o\u0000\u0000\u0085\u0086\u0005n\u0000\u0000"+
		"\u0086\f\u0001\u0000\u0000\u0000\u0087\u0088\u0005r\u0000\u0000\u0088"+
		"\u0089\u0005e\u0000\u0000\u0089\u008a\u0005t\u0000\u0000\u008a\u008b\u0005"+
		"u\u0000\u0000\u008b\u008c\u0005r\u0000\u0000\u008c\u008d\u0005n\u0000"+
		"\u0000\u008d\u000e\u0001\u0000\u0000\u0000\u008e\u008f\u0005f\u0000\u0000"+
		"\u008f\u0090\u0005o\u0000\u0000\u0090\u0091\u0005r\u0000\u0000\u0091\u0092"+
		"\u0005E\u0000\u0000\u0092\u0093\u0005a\u0000\u0000\u0093\u0094\u0005c"+
		"\u0000\u0000\u0094\u0095\u0005h\u0000\u0000\u0095\u0010\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005=\u0000\u0000\u0097\u0098\u0005>\u0000\u0000\u0098"+
		"\u0012\u0001\u0000\u0000\u0000\u0099\u009a\u0005n\u0000\u0000\u009a\u009b"+
		"\u0005u\u0000\u0000\u009b\u009c\u0005m\u0000\u0000\u009c\u009d\u0005b"+
		"\u0000\u0000\u009d\u009e\u0005e\u0000\u0000\u009e\u00b4\u0005r\u0000\u0000"+
		"\u009f\u00a0\u0005s\u0000\u0000\u00a0\u00a1\u0005t\u0000\u0000\u00a1\u00a2"+
		"\u0005r\u0000\u0000\u00a2\u00a3\u0005i\u0000\u0000\u00a3\u00a4\u0005n"+
		"\u0000\u0000\u00a4\u00b4\u0005g\u0000\u0000\u00a5\u00a6\u0005b\u0000\u0000"+
		"\u00a6\u00a7\u0005o\u0000\u0000\u00a7\u00a8\u0005o\u0000\u0000\u00a8\u00a9"+
		"\u0005l\u0000\u0000\u00a9\u00aa\u0005e\u0000\u0000\u00aa\u00ab\u0005a"+
		"\u0000\u0000\u00ab\u00b4\u0005n\u0000\u0000\u00ac\u00ad\u0005v\u0000\u0000"+
		"\u00ad\u00ae\u0005o\u0000\u0000\u00ae\u00af\u0005i\u0000\u0000\u00af\u00b4"+
		"\u0005d\u0000\u0000\u00b0\u00b1\u0005a\u0000\u0000\u00b1\u00b2\u0005n"+
		"\u0000\u0000\u00b2\u00b4\u0005y\u0000\u0000\u00b3\u0099\u0001\u0000\u0000"+
		"\u0000\u00b3\u009f\u0001\u0000\u0000\u0000\u00b3\u00a5\u0001\u0000\u0000"+
		"\u0000\u00b3\u00ac\u0001\u0000\u0000\u0000\u00b3\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b4\u0014\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005v\u0000\u0000"+
		"\u00b6\u00b7\u0005a\u0000\u0000\u00b7\u00c1\u0005r\u0000\u0000\u00b8\u00b9"+
		"\u0005l\u0000\u0000\u00b9\u00ba\u0005e\u0000\u0000\u00ba\u00c1\u0005t"+
		"\u0000\u0000\u00bb\u00bc\u0005c\u0000\u0000\u00bc\u00bd\u0005o\u0000\u0000"+
		"\u00bd\u00be\u0005n\u0000\u0000\u00be\u00bf\u0005s\u0000\u0000\u00bf\u00c1"+
		"\u0005t\u0000\u0000\u00c0\u00b5\u0001\u0000\u0000\u0000\u00c0\u00b8\u0001"+
		"\u0000\u0000\u0000\u00c0\u00bb\u0001\u0000\u0000\u0000\u00c1\u0016\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0005+\u0000\u0000\u00c3\u0018\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0005-\u0000\u0000\u00c5\u001a\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0005*\u0000\u0000\u00c7\u001c\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0005/\u0000\u0000\u00c9\u001e\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0005=\u0000\u0000\u00cb \u0001\u0000\u0000\u0000\u00cc\u00cd\u0005"+
		"=\u0000\u0000\u00cd\u00ce\u0005=\u0000\u0000\u00ce\"\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0005!\u0000\u0000\u00d0\u00d1\u0005=\u0000\u0000\u00d1"+
		"$\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005>\u0000\u0000\u00d3&\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0005>\u0000\u0000\u00d5\u00d6\u0005=\u0000"+
		"\u0000\u00d6(\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005<\u0000\u0000\u00d8"+
		"*\u0001\u0000\u0000\u0000\u00d9\u00da\u0005<\u0000\u0000\u00da\u00db\u0005"+
		"=\u0000\u0000\u00db,\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005+\u0000"+
		"\u0000\u00dd\u00de\u0005+\u0000\u0000\u00de.\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0005-\u0000\u0000\u00e0\u00e1\u0005-\u0000\u0000\u00e10\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0005+\u0000\u0000\u00e3\u00e4\u0005=\u0000"+
		"\u0000\u00e42\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005-\u0000\u0000\u00e6"+
		"\u00e7\u0005=\u0000\u0000\u00e74\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005"+
		"*\u0000\u0000\u00e9\u00ea\u0005=\u0000\u0000\u00ea6\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0005/\u0000\u0000\u00ec\u00ed\u0005=\u0000\u0000\u00ed"+
		"8\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005%\u0000\u0000\u00ef\u00f0\u0005"+
		"=\u0000\u0000\u00f0:\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005(\u0000"+
		"\u0000\u00f2<\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005)\u0000\u0000\u00f4"+
		">\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005[\u0000\u0000\u00f6@\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0005]\u0000\u0000\u00f8B\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0005;\u0000\u0000\u00faD\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0005,\u0000\u0000\u00fcF\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005"+
		":\u0000\u0000\u00feH\u0001\u0000\u0000\u0000\u00ff\u0100\u0005.\u0000"+
		"\u0000\u0100J\u0001\u0000\u0000\u0000\u0101\u0102\u0005i\u0000\u0000\u0102"+
		"\u0103\u0005m\u0000\u0000\u0103\u0104\u0005p\u0000\u0000\u0104\u0105\u0005"+
		"o\u0000\u0000\u0105\u0106\u0005r\u0000\u0000\u0106\u0107\u0005t\u0000"+
		"\u0000\u0107L\u0001\u0000\u0000\u0000\u0108\u0109\u0005e\u0000\u0000\u0109"+
		"\u010a\u0005x\u0000\u0000\u010a\u010b\u0005p\u0000\u0000\u010b\u010c\u0005"+
		"o\u0000\u0000\u010c\u010d\u0005r\u0000\u0000\u010d\u010e\u0005t\u0000"+
		"\u0000\u010eN\u0001\u0000\u0000\u0000\u010f\u0110\u0005f\u0000\u0000\u0110"+
		"\u0111\u0005r\u0000\u0000\u0111\u0112\u0005o\u0000\u0000\u0112\u0113\u0005"+
		"m\u0000\u0000\u0113P\u0001\u0000\u0000\u0000\u0114\u0115\u0005&\u0000"+
		"\u0000\u0115\u0116\u0005&\u0000\u0000\u0116R\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0005|\u0000\u0000\u0118\u0119\u0005|\u0000\u0000\u0119T\u0001"+
		"\u0000\u0000\u0000\u011a\u011e\u0007\u0000\u0000\u0000\u011b\u011d\u0007"+
		"\u0001\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d\u0120\u0001"+
		"\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001"+
		"\u0000\u0000\u0000\u011fV\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000"+
		"\u0000\u0000\u0121\u0123\u0007\u0002\u0000\u0000\u0122\u0121\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u012c\u0001\u0000"+
		"\u0000\u0000\u0126\u0128\t\u0000\u0000\u0000\u0127\u0129\u0007\u0002\u0000"+
		"\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000"+
		"\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000"+
		"\u0000\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u0126\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012dX\u0001\u0000\u0000\u0000"+
		"\u012e\u0132\u0005\"\u0000\u0000\u012f\u0131\b\u0003\u0000\u0000\u0130"+
		"\u012f\u0001\u0000\u0000\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132"+
		"\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133"+
		"\u0135\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135"+
		"\u0136\u0005\"\u0000\u0000\u0136Z\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0005t\u0000\u0000\u0138\u0139\u0005r\u0000\u0000\u0139\u013a\u0005u"+
		"\u0000\u0000\u013a\u0141\u0005e\u0000\u0000\u013b\u013c\u0005f\u0000\u0000"+
		"\u013c\u013d\u0005a\u0000\u0000\u013d\u013e\u0005l\u0000\u0000\u013e\u013f"+
		"\u0005s\u0000\u0000\u013f\u0141\u0005e\u0000\u0000\u0140\u0137\u0001\u0000"+
		"\u0000\u0000\u0140\u013b\u0001\u0000\u0000\u0000\u0141\\\u0001\u0000\u0000"+
		"\u0000\u0142\u0144\u0007\u0004\u0000\u0000\u0143\u0142\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0006.\u0000\u0000\u0148^\u0001\u0000\u0000\u0000\u0149"+
		"\u014a\u0005/\u0000\u0000\u014a\u014b\u0005/\u0000\u0000\u014b\u014f\u0001"+
		"\u0000\u0000\u0000\u014c\u014e\b\u0005\u0000\u0000\u014d\u014c\u0001\u0000"+
		"\u0000\u0000\u014e\u0151\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000"+
		"\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0152\u0001\u0000"+
		"\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152\u0153\u0006/\u0000"+
		"\u0000\u0153`\u0001\u0000\u0000\u0000\u0154\u0155\u0005/\u0000\u0000\u0155"+
		"\u0156\u0005*\u0000\u0000\u0156\u015a\u0001\u0000\u0000\u0000\u0157\u0159"+
		"\t\u0000\u0000\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0159\u015c\u0001"+
		"\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015a\u0158\u0001"+
		"\u0000\u0000\u0000\u015b\u015d\u0001\u0000\u0000\u0000\u015c\u015a\u0001"+
		"\u0000\u0000\u0000\u015d\u015e\u0005*\u0000\u0000\u015e\u015f\u0005/\u0000"+
		"\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161\u00060\u0000\u0000"+
		"\u0161b\u0001\u0000\u0000\u0000\u0162\u0163\u0005c\u0000\u0000\u0163\u0164"+
		"\u0005l\u0000\u0000\u0164\u0165\u0005a\u0000\u0000\u0165\u0166\u0005s"+
		"\u0000\u0000\u0166\u0167\u0005s\u0000\u0000\u0167\u016b\u0001\u0000\u0000"+
		"\u0000\u0168\u016a\u0007\u0004\u0000\u0000\u0169\u0168\u0001\u0000\u0000"+
		"\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000"+
		"\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016cd\u0001\u0000\u0000\u0000"+
		"\u016d\u016b\u0001\u0000\u0000\u0000\u016e\u0172\u0005{\u0000\u0000\u016f"+
		"\u0171\u0007\u0004\u0000\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0171"+
		"\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u0001\u0000\u0000\u0000\u0173f\u0001\u0000\u0000\u0000\u0174\u0172"+
		"\u0001\u0000\u0000\u0000\u0175\u0179\u0005}\u0000\u0000\u0176\u0178\u0007"+
		"\u0004\u0000\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0178\u017b\u0001"+
		"\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u017a\u0001"+
		"\u0000\u0000\u0000\u017ah\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000"+
		"\u0000\u0000\u000f\u0000\u00b3\u00c0\u011e\u0124\u012a\u012c\u0132\u0140"+
		"\u0145\u014f\u015a\u016b\u0172\u0179\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}