// Generated from src/t3cc2/SSL.g4 by ANTLR 4.5.3
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		TKSCRIPT=18, IDENTIFICADOR=19, ACAO=20, CONTEUDO_FALA=21, ESPACOS=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"TKSCRIPT", "IDENTIFICADOR", "ACAO", "CONTEUDO_FALA", "ESPACOS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'scene::'", "'<'", "'>'", "'characters'", "':'", 
		"','", "'end_characters'", "'scenarios'", "'end_scenarios'", "'scenario'", 
		"'end_scenario'", "'authors'", "'end_authors'", "'sceneorder'", "'end_sceneorder'", 
		"'script::'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "TKSCRIPT", "IDENTIFICADOR", "ACAO", 
		"CONTEUDO_FALA", "ESPACOS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u00e0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\7\24\u00c5\n\24\f\24\16\24\u00c8\13"+
		"\24\3\25\3\25\7\25\u00cc\n\25\f\25\16\25\u00cf\13\25\3\25\3\25\3\26\3"+
		"\26\6\26\u00d5\n\26\r\26\16\26\u00d6\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\u00d6\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\6\5\2C\\aac"+
		"|\6\2\62;C\\aac|\3\2,,\5\2\13\f\17\17\"\"\u00e2\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3"+
		"\2\2\2\t;\3\2\2\2\13=\3\2\2\2\r?\3\2\2\2\17J\3\2\2\2\21L\3\2\2\2\23N\3"+
		"\2\2\2\25]\3\2\2\2\27g\3\2\2\2\31u\3\2\2\2\33~\3\2\2\2\35\u008b\3\2\2"+
		"\2\37\u0093\3\2\2\2!\u009f\3\2\2\2#\u00aa\3\2\2\2%\u00b9\3\2\2\2\'\u00c2"+
		"\3\2\2\2)\u00c9\3\2\2\2+\u00d2\3\2\2\2-\u00dd\3\2\2\2/\60\7}\2\2\60\4"+
		"\3\2\2\2\61\62\7\177\2\2\62\6\3\2\2\2\63\64\7u\2\2\64\65\7e\2\2\65\66"+
		"\7g\2\2\66\67\7p\2\2\678\7g\2\289\7<\2\29:\7<\2\2:\b\3\2\2\2;<\7>\2\2"+
		"<\n\3\2\2\2=>\7@\2\2>\f\3\2\2\2?@\7e\2\2@A\7j\2\2AB\7c\2\2BC\7t\2\2CD"+
		"\7c\2\2DE\7e\2\2EF\7v\2\2FG\7g\2\2GH\7t\2\2HI\7u\2\2I\16\3\2\2\2JK\7<"+
		"\2\2K\20\3\2\2\2LM\7.\2\2M\22\3\2\2\2NO\7g\2\2OP\7p\2\2PQ\7f\2\2QR\7a"+
		"\2\2RS\7e\2\2ST\7j\2\2TU\7c\2\2UV\7t\2\2VW\7c\2\2WX\7e\2\2XY\7v\2\2YZ"+
		"\7g\2\2Z[\7t\2\2[\\\7u\2\2\\\24\3\2\2\2]^\7u\2\2^_\7e\2\2_`\7g\2\2`a\7"+
		"p\2\2ab\7c\2\2bc\7t\2\2cd\7k\2\2de\7q\2\2ef\7u\2\2f\26\3\2\2\2gh\7g\2"+
		"\2hi\7p\2\2ij\7f\2\2jk\7a\2\2kl\7u\2\2lm\7e\2\2mn\7g\2\2no\7p\2\2op\7"+
		"c\2\2pq\7t\2\2qr\7k\2\2rs\7q\2\2st\7u\2\2t\30\3\2\2\2uv\7u\2\2vw\7e\2"+
		"\2wx\7g\2\2xy\7p\2\2yz\7c\2\2z{\7t\2\2{|\7k\2\2|}\7q\2\2}\32\3\2\2\2~"+
		"\177\7g\2\2\177\u0080\7p\2\2\u0080\u0081\7f\2\2\u0081\u0082\7a\2\2\u0082"+
		"\u0083\7u\2\2\u0083\u0084\7e\2\2\u0084\u0085\7g\2\2\u0085\u0086\7p\2\2"+
		"\u0086\u0087\7c\2\2\u0087\u0088\7t\2\2\u0088\u0089\7k\2\2\u0089\u008a"+
		"\7q\2\2\u008a\34\3\2\2\2\u008b\u008c\7c\2\2\u008c\u008d\7w\2\2\u008d\u008e"+
		"\7v\2\2\u008e\u008f\7j\2\2\u008f\u0090\7q\2\2\u0090\u0091\7t\2\2\u0091"+
		"\u0092\7u\2\2\u0092\36\3\2\2\2\u0093\u0094\7g\2\2\u0094\u0095\7p\2\2\u0095"+
		"\u0096\7f\2\2\u0096\u0097\7a\2\2\u0097\u0098\7c\2\2\u0098\u0099\7w\2\2"+
		"\u0099\u009a\7v\2\2\u009a\u009b\7j\2\2\u009b\u009c\7q\2\2\u009c\u009d"+
		"\7t\2\2\u009d\u009e\7u\2\2\u009e \3\2\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1"+
		"\7e\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7g\2\2\u00a4"+
		"\u00a5\7q\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7f\2\2\u00a7\u00a8\7g\2\2"+
		"\u00a8\u00a9\7t\2\2\u00a9\"\3\2\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7p"+
		"\2\2\u00ac\u00ad\7f\2\2\u00ad\u00ae\7a\2\2\u00ae\u00af\7u\2\2\u00af\u00b0"+
		"\7e\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7g\2\2\u00b3"+
		"\u00b4\7q\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7f\2\2\u00b6\u00b7\7g\2\2"+
		"\u00b7\u00b8\7t\2\2\u00b8$\3\2\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7e\2"+
		"\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7r\2\2\u00be\u00bf"+
		"\7v\2\2\u00bf\u00c0\7<\2\2\u00c0\u00c1\7<\2\2\u00c1&\3\2\2\2\u00c2\u00c6"+
		"\t\2\2\2\u00c3\u00c5\t\3\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7(\3\2\2\2\u00c8\u00c6\3\2\2\2"+
		"\u00c9\u00cd\7,\2\2\u00ca\u00cc\n\4\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf"+
		"\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d1\7,\2\2\u00d1*\3\2\2\2\u00d2\u00d4\7/\2\2\u00d3"+
		"\u00d5\13\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3"+
		"\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7%\2\2\u00d9"+
		"\u00da\7g\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7f\2\2\u00dc,\3\2\2\2\u00dd"+
		"\u00de\t\5\2\2\u00de\u00df\b\27\2\2\u00df.\3\2\2\2\6\2\u00c6\u00cd\u00d6"+
		"\3\3\27\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}