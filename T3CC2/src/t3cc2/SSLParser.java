// Generated from src/t3cc2/SSL.g4 by ANTLR 4.5.3
package t3cc2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		TKSCRIPT=18, IDENTIFICADOR=19, ACAO=20, CONTEUDO_FALA=21, ESPACOS=22;
	public static final int
		RULE_script = 0, RULE_script_cont = 1, RULE_decl_principais = 2, RULE_cena = 3, 
		RULE_cena_cont = 4, RULE_cmd = 5, RULE_chamada_personagem = 6, RULE_decl_personagens = 7, 
		RULE_decl_cenarios = 8, RULE_decl_cenario = 9, RULE_decl_autores = 10, 
		RULE_ordem_cenas = 11, RULE_fala = 12;
	public static final String[] ruleNames = {
		"script", "script_cont", "decl_principais", "cena", "cena_cont", "cmd", 
		"chamada_personagem", "decl_personagens", "decl_cenarios", "decl_cenario", 
		"decl_autores", "ordem_cenas", "fala"
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

	@Override
	public String getGrammarFileName() { return "SSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode TKSCRIPT() { return getToken(SSLParser.TKSCRIPT, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(SSLParser.IDENTIFICADOR, 0); }
		public Script_contContext script_cont() {
			return getRuleContext(Script_contContext.class,0);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).exitScript(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(TKSCRIPT);
			setState(27);
			match(IDENTIFICADOR);
			setState(28);
			match(T__0);
			setState(29);
			script_cont();
			setState(30);
			match(T__1);
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

	public static class Script_contContext extends ParserRuleContext {
		public Decl_principaisContext decl_principais() {
			return getRuleContext(Decl_principaisContext.class,0);
		}
		public List<CenaContext> cena() {
			return getRuleContexts(CenaContext.class);
		}
		public CenaContext cena(int i) {
			return getRuleContext(CenaContext.class,i);
		}
		public Script_contContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script_cont; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).enterScript_cont(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).exitScript_cont(this);
		}
	}

	public final Script_contContext script_cont() throws RecognitionException {
		Script_contContext _localctx = new Script_contContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_script_cont);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			decl_principais();
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				cena();
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
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

	public static class Decl_principaisContext extends ParserRuleContext {
		public Decl_autoresContext decl_autores() {
			return getRuleContext(Decl_autoresContext.class,0);
		}
		public Decl_personagensContext decl_personagens() {
			return getRuleContext(Decl_personagensContext.class,0);
		}
		public Decl_cenariosContext decl_cenarios() {
			return getRuleContext(Decl_cenariosContext.class,0);
		}
		public Ordem_cenasContext ordem_cenas() {
			return getRuleContext(Ordem_cenasContext.class,0);
		}
		public Decl_principaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_principais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).enterDecl_principais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).exitDecl_principais(this);
		}
	}

	public final Decl_principaisContext decl_principais() throws RecognitionException {
		Decl_principaisContext _localctx = new Decl_principaisContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_principais);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			decl_autores();
			setState(39);
			decl_personagens();
			setState(40);
			decl_cenarios();
			setState(41);
			ordem_cenas();
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

	public static class CenaContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(SSLParser.IDENTIFICADOR, 0); }
		public Cena_contContext cena_cont() {
			return getRuleContext(Cena_contContext.class,0);
		}
		public CenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).enterCena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).exitCena(this);
		}
	}

	public final CenaContext cena() throws RecognitionException {
		CenaContext _localctx = new CenaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__2);
			setState(44);
			match(IDENTIFICADOR);
			setState(45);
			match(T__0);
			setState(46);
			cena_cont();
			setState(47);
			match(T__1);
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

	public static class Cena_contContext extends ParserRuleContext {
		public Decl_cenarioContext decl_cenario() {
			return getRuleContext(Decl_cenarioContext.class,0);
		}
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public Cena_contContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cena_cont; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).enterCena_cont(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).exitCena_cont(this);
		}
	}

	public final Cena_contContext cena_cont() throws RecognitionException {
		Cena_contContext _localctx = new Cena_contContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cena_cont);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			decl_cenario();
			setState(50);
			cmd();
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

	public static class CmdContext extends ParserRuleContext {
		public TerminalNode ACAO() { return getToken(SSLParser.ACAO, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public FalaContext fala() {
			return getRuleContext(FalaContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd);
		try {
			setState(57);
			switch (_input.LA(1)) {
			case ACAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(ACAO);
				setState(53);
				cmd();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				fala();
				setState(55);
				cmd();
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

	public static class Chamada_personagemContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(SSLParser.IDENTIFICADOR, 0); }
		public Chamada_personagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_personagem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).enterChamada_personagem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).exitChamada_personagem(this);
		}
	}

	public final Chamada_personagemContext chamada_personagem() throws RecognitionException {
		Chamada_personagemContext _localctx = new Chamada_personagemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_chamada_personagem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__3);
			setState(60);
			match(IDENTIFICADOR);
			setState(61);
			match(T__4);
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

	public static class Decl_personagensContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SSLParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SSLParser.IDENTIFICADOR, i);
		}
		public Decl_personagensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_personagens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).enterDecl_personagens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).exitDecl_personagens(this);
		}
	}

	public final Decl_personagensContext decl_personagens() throws RecognitionException {
		Decl_personagensContext _localctx = new Decl_personagensContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decl_personagens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__5);
			setState(64);
			match(T__6);
			setState(65);
			match(IDENTIFICADOR);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(66);
				match(T__7);
				setState(67);
				match(IDENTIFICADOR);
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(T__8);
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

	public static class Decl_cenariosContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SSLParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SSLParser.IDENTIFICADOR, i);
		}
		public Decl_cenariosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_cenarios; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).enterDecl_cenarios(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).exitDecl_cenarios(this);
		}
	}

	public final Decl_cenariosContext decl_cenarios() throws RecognitionException {
		Decl_cenariosContext _localctx = new Decl_cenariosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_decl_cenarios);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__9);
			setState(76);
			match(T__6);
			setState(77);
			match(IDENTIFICADOR);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(78);
				match(T__7);
				setState(79);
				match(IDENTIFICADOR);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(T__10);
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

	public static class Decl_cenarioContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(SSLParser.IDENTIFICADOR, 0); }
		public Decl_cenarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_cenario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).enterDecl_cenario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).exitDecl_cenario(this);
		}
	}

	public final Decl_cenarioContext decl_cenario() throws RecognitionException {
		Decl_cenarioContext _localctx = new Decl_cenarioContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_decl_cenario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__11);
			setState(88);
			match(T__6);
			setState(89);
			match(IDENTIFICADOR);
			setState(90);
			match(T__12);
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

	public static class Decl_autoresContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SSLParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SSLParser.IDENTIFICADOR, i);
		}
		public Decl_autoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_autores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).enterDecl_autores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).exitDecl_autores(this);
		}
	}

	public final Decl_autoresContext decl_autores() throws RecognitionException {
		Decl_autoresContext _localctx = new Decl_autoresContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_decl_autores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__13);
			setState(93);
			match(T__6);
			setState(94);
			match(IDENTIFICADOR);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(95);
				match(T__7);
				setState(96);
				match(IDENTIFICADOR);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(T__14);
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

	public static class Ordem_cenasContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SSLParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SSLParser.IDENTIFICADOR, i);
		}
		public Ordem_cenasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordem_cenas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).enterOrdem_cenas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).exitOrdem_cenas(this);
		}
	}

	public final Ordem_cenasContext ordem_cenas() throws RecognitionException {
		Ordem_cenasContext _localctx = new Ordem_cenasContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ordem_cenas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__15);
			setState(105);
			match(T__6);
			setState(106);
			match(IDENTIFICADOR);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(107);
				match(T__7);
				setState(108);
				match(IDENTIFICADOR);
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(T__16);
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

	public static class FalaContext extends ParserRuleContext {
		public Chamada_personagemContext chamada_personagem() {
			return getRuleContext(Chamada_personagemContext.class,0);
		}
		public TerminalNode CONTEUDO_FALA() { return getToken(SSLParser.CONTEUDO_FALA, 0); }
		public FalaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fala; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).enterFala(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SSLListener ) ((SSLListener)listener).exitFala(this);
		}
	}

	public final FalaContext fala() throws RecognitionException {
		FalaContext _localctx = new FalaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fala);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			chamada_personagem();
			setState(117);
			match(T__6);
			setState(118);
			match(CONTEUDO_FALA);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30{\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\6\3%\n\3\r\3"+
		"\16\3&\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\5\7<\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\tG\n\t\f\t"+
		"\16\tJ\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\nS\n\n\f\n\16\nV\13\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\fd\n\f\f\f\16\fg\13"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\rp\n\r\f\r\16\rs\13\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2s\2\34\3"+
		"\2\2\2\4\"\3\2\2\2\6(\3\2\2\2\b-\3\2\2\2\n\63\3\2\2\2\f;\3\2\2\2\16=\3"+
		"\2\2\2\20A\3\2\2\2\22M\3\2\2\2\24Y\3\2\2\2\26^\3\2\2\2\30j\3\2\2\2\32"+
		"v\3\2\2\2\34\35\7\24\2\2\35\36\7\25\2\2\36\37\7\3\2\2\37 \5\4\3\2 !\7"+
		"\4\2\2!\3\3\2\2\2\"$\5\6\4\2#%\5\b\5\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&"+
		"\'\3\2\2\2\'\5\3\2\2\2()\5\26\f\2)*\5\20\t\2*+\5\22\n\2+,\5\30\r\2,\7"+
		"\3\2\2\2-.\7\5\2\2./\7\25\2\2/\60\7\3\2\2\60\61\5\n\6\2\61\62\7\4\2\2"+
		"\62\t\3\2\2\2\63\64\5\24\13\2\64\65\5\f\7\2\65\13\3\2\2\2\66\67\7\26\2"+
		"\2\67<\5\f\7\289\5\32\16\29:\5\f\7\2:<\3\2\2\2;\66\3\2\2\2;8\3\2\2\2<"+
		"\r\3\2\2\2=>\7\6\2\2>?\7\25\2\2?@\7\7\2\2@\17\3\2\2\2AB\7\b\2\2BC\7\t"+
		"\2\2CH\7\25\2\2DE\7\n\2\2EG\7\25\2\2FD\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3"+
		"\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7\13\2\2L\21\3\2\2\2MN\7\f\2\2NO\7\t\2\2"+
		"OT\7\25\2\2PQ\7\n\2\2QS\7\25\2\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2"+
		"\2UW\3\2\2\2VT\3\2\2\2WX\7\r\2\2X\23\3\2\2\2YZ\7\16\2\2Z[\7\t\2\2[\\\7"+
		"\25\2\2\\]\7\17\2\2]\25\3\2\2\2^_\7\20\2\2_`\7\t\2\2`e\7\25\2\2ab\7\n"+
		"\2\2bd\7\25\2\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3"+
		"\2\2\2hi\7\21\2\2i\27\3\2\2\2jk\7\22\2\2kl\7\t\2\2lq\7\25\2\2mn\7\n\2"+
		"\2np\7\25\2\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2"+
		"\2\2tu\7\23\2\2u\31\3\2\2\2vw\5\16\b\2wx\7\t\2\2xy\7\27\2\2y\33\3\2\2"+
		"\2\b&;HTeq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}