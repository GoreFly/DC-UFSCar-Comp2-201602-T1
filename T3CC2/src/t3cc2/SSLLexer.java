// Generated from src\t3cc2\SSL.g4 by ANTLR 4.5.3
package t3cc2;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SSLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TKSCRIPT=1, TKSCENE=2, TKCHARACTERS=3, TKENDCHARACTERS=4, TKSCENARIO=5, 
		TKENDSCENARIO=6, TKSCENARIOS=7, TKENDSCENARIOS=8, TKAUTHORS=9, TKENDAUTHORS=10, 
		TKSCENEORDER=11, TKENDSCENEORDER=12, TKCOMMA=13, TKCOLON=14, TKLT=15, 
		TKGT=16, TKLCBRACKETS=17, TKRCBRACKETS=18, STRING=19, ACAO=20, IDENTIFICADOR=21, 
		ESPACOS=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TKSCRIPT", "TKSCENE", "TKCHARACTERS", "TKENDCHARACTERS", "TKSCENARIO", 
		"TKENDSCENARIO", "TKSCENARIOS", "TKENDSCENARIOS", "TKAUTHORS", "TKENDAUTHORS", 
		"TKSCENEORDER", "TKENDSCENEORDER", "TKCOMMA", "TKCOLON", "TKLT", "TKGT", 
		"TKLCBRACKETS", "TKRCBRACKETS", "STRING", "ACAO", "IDENTIFICADOR", "ESPACOS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'script::'", "'scene::'", "'characters:'", "'end_characters'", 
		"'scenario:'", "'end_scenario'", "'scenarios:'", "'end_scenarios'", "'authors:'", 
		"'end_authors'", "'sceneorder:'", "'end_sceneorder'", "','", "':'", "'<'", 
		"'>'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TKSCRIPT", "TKSCENE", "TKCHARACTERS", "TKENDCHARACTERS", "TKSCENARIO", 
		"TKENDSCENARIO", "TKSCENARIOS", "TKENDSCENARIOS", "TKAUTHORS", "TKENDAUTHORS", 
		"TKSCENEORDER", "TKENDSCENEORDER", "TKCOMMA", "TKCOLON", "TKLT", "TKGT", 
		"TKLCBRACKETS", "TKRCBRACKETS", "STRING", "ACAO", "IDENTIFICADOR", "ESPACOS"
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


	public SSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 21:
			ESPACOS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ESPACOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			  skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u00e3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\7"+
		"\24\u00ca\n\24\f\24\16\24\u00cd\13\24\3\24\3\24\3\25\3\25\7\25\u00d3\n"+
		"\25\f\25\16\25\u00d6\13\25\3\25\3\25\3\26\3\26\7\26\u00dc\n\26\f\26\16"+
		"\26\u00df\13\26\3\27\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"\3\2\7\3\2$$\3\2,,\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\u00e5"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2"+
		"\2\58\3\2\2\2\7@\3\2\2\2\tL\3\2\2\2\13[\3\2\2\2\re\3\2\2\2\17r\3\2\2\2"+
		"\21}\3\2\2\2\23\u008b\3\2\2\2\25\u0094\3\2\2\2\27\u00a0\3\2\2\2\31\u00ac"+
		"\3\2\2\2\33\u00bb\3\2\2\2\35\u00bd\3\2\2\2\37\u00bf\3\2\2\2!\u00c1\3\2"+
		"\2\2#\u00c3\3\2\2\2%\u00c5\3\2\2\2\'\u00c7\3\2\2\2)\u00d0\3\2\2\2+\u00d9"+
		"\3\2\2\2-\u00e0\3\2\2\2/\60\7u\2\2\60\61\7e\2\2\61\62\7t\2\2\62\63\7k"+
		"\2\2\63\64\7r\2\2\64\65\7v\2\2\65\66\7<\2\2\66\67\7<\2\2\67\4\3\2\2\2"+
		"89\7u\2\29:\7e\2\2:;\7g\2\2;<\7p\2\2<=\7g\2\2=>\7<\2\2>?\7<\2\2?\6\3\2"+
		"\2\2@A\7e\2\2AB\7j\2\2BC\7c\2\2CD\7t\2\2DE\7c\2\2EF\7e\2\2FG\7v\2\2GH"+
		"\7g\2\2HI\7t\2\2IJ\7u\2\2JK\7<\2\2K\b\3\2\2\2LM\7g\2\2MN\7p\2\2NO\7f\2"+
		"\2OP\7a\2\2PQ\7e\2\2QR\7j\2\2RS\7c\2\2ST\7t\2\2TU\7c\2\2UV\7e\2\2VW\7"+
		"v\2\2WX\7g\2\2XY\7t\2\2YZ\7u\2\2Z\n\3\2\2\2[\\\7u\2\2\\]\7e\2\2]^\7g\2"+
		"\2^_\7p\2\2_`\7c\2\2`a\7t\2\2ab\7k\2\2bc\7q\2\2cd\7<\2\2d\f\3\2\2\2ef"+
		"\7g\2\2fg\7p\2\2gh\7f\2\2hi\7a\2\2ij\7u\2\2jk\7e\2\2kl\7g\2\2lm\7p\2\2"+
		"mn\7c\2\2no\7t\2\2op\7k\2\2pq\7q\2\2q\16\3\2\2\2rs\7u\2\2st\7e\2\2tu\7"+
		"g\2\2uv\7p\2\2vw\7c\2\2wx\7t\2\2xy\7k\2\2yz\7q\2\2z{\7u\2\2{|\7<\2\2|"+
		"\20\3\2\2\2}~\7g\2\2~\177\7p\2\2\177\u0080\7f\2\2\u0080\u0081\7a\2\2\u0081"+
		"\u0082\7u\2\2\u0082\u0083\7e\2\2\u0083\u0084\7g\2\2\u0084\u0085\7p\2\2"+
		"\u0085\u0086\7c\2\2\u0086\u0087\7t\2\2\u0087\u0088\7k\2\2\u0088\u0089"+
		"\7q\2\2\u0089\u008a\7u\2\2\u008a\22\3\2\2\2\u008b\u008c\7c\2\2\u008c\u008d"+
		"\7w\2\2\u008d\u008e\7v\2\2\u008e\u008f\7j\2\2\u008f\u0090\7q\2\2\u0090"+
		"\u0091\7t\2\2\u0091\u0092\7u\2\2\u0092\u0093\7<\2\2\u0093\24\3\2\2\2\u0094"+
		"\u0095\7g\2\2\u0095\u0096\7p\2\2\u0096\u0097\7f\2\2\u0097\u0098\7a\2\2"+
		"\u0098\u0099\7c\2\2\u0099\u009a\7w\2\2\u009a\u009b\7v\2\2\u009b\u009c"+
		"\7j\2\2\u009c\u009d\7q\2\2\u009d\u009e\7t\2\2\u009e\u009f\7u\2\2\u009f"+
		"\26\3\2\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7g\2\2\u00a3"+
		"\u00a4\7p\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7t\2\2"+
		"\u00a7\u00a8\7f\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab"+
		"\7<\2\2\u00ab\30\3\2\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af"+
		"\7f\2\2\u00af\u00b0\7a\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7e\2\2\u00b2"+
		"\u00b3\7g\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7q\2\2"+
		"\u00b6\u00b7\7t\2\2\u00b7\u00b8\7f\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba"+
		"\7t\2\2\u00ba\32\3\2\2\2\u00bb\u00bc\7.\2\2\u00bc\34\3\2\2\2\u00bd\u00be"+
		"\7<\2\2\u00be\36\3\2\2\2\u00bf\u00c0\7>\2\2\u00c0 \3\2\2\2\u00c1\u00c2"+
		"\7@\2\2\u00c2\"\3\2\2\2\u00c3\u00c4\7}\2\2\u00c4$\3\2\2\2\u00c5\u00c6"+
		"\7\177\2\2\u00c6&\3\2\2\2\u00c7\u00cb\7$\2\2\u00c8\u00ca\n\2\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7$\2\2\u00cf"+
		"(\3\2\2\2\u00d0\u00d4\7,\2\2\u00d1\u00d3\n\3\2\2\u00d2\u00d1\3\2\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7,\2\2\u00d8*\3\2\2\2\u00d9\u00dd"+
		"\t\4\2\2\u00da\u00dc\t\5\2\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de,\3\2\2\2\u00df\u00dd\3\2\2\2"+
		"\u00e0\u00e1\t\6\2\2\u00e1\u00e2\b\27\2\2\u00e2.\3\2\2\2\6\2\u00cb\u00d4"+
		"\u00dd\3\3\27\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}