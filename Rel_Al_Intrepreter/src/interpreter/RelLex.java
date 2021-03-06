// Generated from RelLex.g4 by ANTLR 4.5
package interpreter;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RelLex extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, PROJECT=2, NATURAL=3, CARTESIAN=4, ATTRIBUTE=5, PREDICATE=6, 
		RELATION=7, WS=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SELECT", "PROJECT", "NATURAL", "CARTESIAN", "ATTRIBUTE", "PREDICATE", 
		"RELATION", "WS", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
		"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", 
		"Z"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "PROJECT", "NATURAL", "CARTESIAN", "ATTRIBUTE", "PREDICATE", 
		"RELATION", "WS"
	};
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


	public RelLex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RelLex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\n\u00cc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\7\6{\n\6\f\6\16\6~\13\6\3\6\3\6\3\7\3\7\7\7\u0084\n\7\f\7"+
		"\16\7\u0087\13\7\3\7\3\7\3\b\3\b\7\b\u008d\n\b\f\b\16\b\u0090\13\b\3\t"+
		"\6\t\u0093\n\t\r\t\16\t\u0094\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\4|\u0085\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\2\25\2\27\2\31\2\33"+
		"\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2"+
		"A\2C\2E\2\3\2 \3\2aa\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2CC"+
		"cc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2"+
		"LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4"+
		"\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\u00b5"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3G\3\2\2\2\5N\3\2\2\2\7Y\3\2\2\2\tf\3\2"+
		"\2\2\13x\3\2\2\2\r\u0081\3\2\2\2\17\u008a\3\2\2\2\21\u0092\3\2\2\2\23"+
		"\u0098\3\2\2\2\25\u009a\3\2\2\2\27\u009c\3\2\2\2\31\u009e\3\2\2\2\33\u00a0"+
		"\3\2\2\2\35\u00a2\3\2\2\2\37\u00a4\3\2\2\2!\u00a6\3\2\2\2#\u00a8\3\2\2"+
		"\2%\u00aa\3\2\2\2\'\u00ac\3\2\2\2)\u00ae\3\2\2\2+\u00b0\3\2\2\2-\u00b2"+
		"\3\2\2\2/\u00b4\3\2\2\2\61\u00b6\3\2\2\2\63\u00b8\3\2\2\2\65\u00ba\3\2"+
		"\2\2\67\u00bc\3\2\2\29\u00be\3\2\2\2;\u00c0\3\2\2\2=\u00c2\3\2\2\2?\u00c4"+
		"\3\2\2\2A\u00c6\3\2\2\2C\u00c8\3\2\2\2E\u00ca\3\2\2\2GH\5\67\34\2HI\5"+
		"\33\16\2IJ\5)\25\2JK\5\33\16\2KL\5\27\f\2LM\59\35\2M\4\3\2\2\2NO\5\61"+
		"\31\2OP\5\65\33\2PQ\5/\30\2QR\5%\23\2RS\5\33\16\2ST\5\27\f\2TU\59\35\2"+
		"UV\5#\22\2VW\5/\30\2WX\5-\27\2X\6\3\2\2\2YZ\5-\27\2Z[\5\23\n\2[\\\59\35"+
		"\2\\]\5;\36\2]^\5\65\33\2^_\5\23\n\2_`\5)\25\2`a\t\2\2\2ab\5%\23\2bc\5"+
		"/\30\2cd\5#\22\2de\5-\27\2e\b\3\2\2\2fg\5\27\f\2gh\5\23\n\2hi\5\65\33"+
		"\2ij\59\35\2jk\5\33\16\2kl\5\67\34\2lm\5#\22\2mn\5\23\n\2no\5-\27\2op"+
		"\t\2\2\2pq\5\61\31\2qr\5\65\33\2rs\5/\30\2st\5\31\r\2tu\5;\36\2uv\5\27"+
		"\f\2vw\59\35\2w\n\3\2\2\2x|\7)\2\2y{\13\2\2\2zy\3\2\2\2{~\3\2\2\2|}\3"+
		"\2\2\2|z\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7)\2\2\u0080\f\3\2\2"+
		"\2\u0081\u0085\7]\2\2\u0082\u0084\13\2\2\2\u0083\u0082\3\2\2\2\u0084\u0087"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u0089\7_\2\2\u0089\16\3\2\2\2\u008a\u008e\t\3\2\2"+
		"\u008b\u008d\t\4\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\20\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0093\t\5\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\b\t\2\2\u0097"+
		"\22\3\2\2\2\u0098\u0099\t\6\2\2\u0099\24\3\2\2\2\u009a\u009b\t\7\2\2\u009b"+
		"\26\3\2\2\2\u009c\u009d\t\b\2\2\u009d\30\3\2\2\2\u009e\u009f\t\t\2\2\u009f"+
		"\32\3\2\2\2\u00a0\u00a1\t\n\2\2\u00a1\34\3\2\2\2\u00a2\u00a3\t\13\2\2"+
		"\u00a3\36\3\2\2\2\u00a4\u00a5\t\f\2\2\u00a5 \3\2\2\2\u00a6\u00a7\t\r\2"+
		"\2\u00a7\"\3\2\2\2\u00a8\u00a9\t\16\2\2\u00a9$\3\2\2\2\u00aa\u00ab\t\17"+
		"\2\2\u00ab&\3\2\2\2\u00ac\u00ad\t\20\2\2\u00ad(\3\2\2\2\u00ae\u00af\t"+
		"\21\2\2\u00af*\3\2\2\2\u00b0\u00b1\t\22\2\2\u00b1,\3\2\2\2\u00b2\u00b3"+
		"\t\23\2\2\u00b3.\3\2\2\2\u00b4\u00b5\t\24\2\2\u00b5\60\3\2\2\2\u00b6\u00b7"+
		"\t\25\2\2\u00b7\62\3\2\2\2\u00b8\u00b9\t\26\2\2\u00b9\64\3\2\2\2\u00ba"+
		"\u00bb\t\27\2\2\u00bb\66\3\2\2\2\u00bc\u00bd\t\30\2\2\u00bd8\3\2\2\2\u00be"+
		"\u00bf\t\31\2\2\u00bf:\3\2\2\2\u00c0\u00c1\t\32\2\2\u00c1<\3\2\2\2\u00c2"+
		"\u00c3\t\33\2\2\u00c3>\3\2\2\2\u00c4\u00c5\t\34\2\2\u00c5@\3\2\2\2\u00c6"+
		"\u00c7\t\35\2\2\u00c7B\3\2\2\2\u00c8\u00c9\t\36\2\2\u00c9D\3\2\2\2\u00ca"+
		"\u00cb\t\37\2\2\u00cbF\3\2\2\2\7\2|\u0085\u008e\u0094\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}