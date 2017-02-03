// Generated from src\t3cc2\SSL.g4 by ANTLR 4.5.3
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
		TKSCRIPT=1, TKSCENE=2, TKCHARACTERS=3, TKENDCHARACTERS=4, TKSCENARIO=5, 
		TKENDSCENARIO=6, TKSCENARIOS=7, TKENDSCENARIOS=8, TKAUTHORS=9, TKENDAUTHORS=10, 
		TKSCENEORDER=11, TKENDSCENEORDER=12, TKCOMMA=13, TKCOLON=14, TKLT=15, 
		TKGT=16, TKLCBRACKETS=17, TKRCBRACKETS=18, STRING=19, ACAO=20, IDENTIFICADOR=21, 
		ESPACOS=22;
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
		public TerminalNode TKLCBRACKETS() { return getToken(SSLParser.TKLCBRACKETS, 0); }
		public Script_contContext script_cont() {
			return getRuleContext(Script_contContext.class,0);
		}
		public TerminalNode TKRCBRACKETS() { return getToken(SSLParser.TKRCBRACKETS, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSLVisitor ) return ((SSLVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
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
			match(TKLCBRACKETS);
			setState(29);
			script_cont();
			setState(30);
			match(TKRCBRACKETS);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSLVisitor ) return ((SSLVisitor<? extends T>)visitor).visitScript_cont(this);
			else return visitor.visitChildren(this);
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
			} while ( _la==TKSCENE );
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSLVisitor ) return ((SSLVisitor<? extends T>)visitor).visitDecl_principais(this);
			else return visitor.visitChildren(this);
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
		public TerminalNode TKSCENE() { return getToken(SSLParser.TKSCENE, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(SSLParser.IDENTIFICADOR, 0); }
		public TerminalNode TKLCBRACKETS() { return getToken(SSLParser.TKLCBRACKETS, 0); }
		public Cena_contContext cena_cont() {
			return getRuleContext(Cena_contContext.class,0);
		}
		public TerminalNode TKRCBRACKETS() { return getToken(SSLParser.TKRCBRACKETS, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSLVisitor ) return ((SSLVisitor<? extends T>)visitor).visitCena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CenaContext cena() throws RecognitionException {
		CenaContext _localctx = new CenaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(TKSCENE);
			setState(44);
			match(IDENTIFICADOR);
			setState(45);
			match(TKLCBRACKETS);
			setState(46);
			cena_cont();
			setState(47);
			match(TKRCBRACKETS);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSLVisitor ) return ((SSLVisitor<? extends T>)visitor).visitCena_cont(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSLVisitor ) return ((SSLVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd);
		try {
			setState(58);
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
			case TKLT:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				fala();
				setState(55);
				cmd();
				}
				break;
			case TKRCBRACKETS:
				enterOuterAlt(_localctx, 3);
				{
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
		public TerminalNode TKLT() { return getToken(SSLParser.TKLT, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(SSLParser.IDENTIFICADOR, 0); }
		public TerminalNode TKGT() { return getToken(SSLParser.TKGT, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSLVisitor ) return ((SSLVisitor<? extends T>)visitor).visitChamada_personagem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Chamada_personagemContext chamada_personagem() throws RecognitionException {
		Chamada_personagemContext _localctx = new Chamada_personagemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_chamada_personagem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(TKLT);
			setState(61);
			match(IDENTIFICADOR);
			setState(62);
			match(TKGT);
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
		public TerminalNode TKCHARACTERS() { return getToken(SSLParser.TKCHARACTERS, 0); }
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SSLParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SSLParser.IDENTIFICADOR, i);
		}
		public TerminalNode TKENDCHARACTERS() { return getToken(SSLParser.TKENDCHARACTERS, 0); }
		public List<TerminalNode> TKCOMMA() { return getTokens(SSLParser.TKCOMMA); }
		public TerminalNode TKCOMMA(int i) {
			return getToken(SSLParser.TKCOMMA, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSLVisitor ) return ((SSLVisitor<? extends T>)visitor).visitDecl_personagens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_personagensContext decl_personagens() throws RecognitionException {
		Decl_personagensContext _localctx = new Decl_personagensContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decl_personagens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(TKCHARACTERS);
			setState(65);
			match(IDENTIFICADOR);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKCOMMA) {
				{
				{
				setState(66);
				match(TKCOMMA);
				setState(67);
				match(IDENTIFICADOR);
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(TKENDCHARACTERS);
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
		public TerminalNode TKSCENARIOS() { return getToken(SSLParser.TKSCENARIOS, 0); }
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SSLParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SSLParser.IDENTIFICADOR, i);
		}
		public TerminalNode TKENDSCENARIOS() { return getToken(SSLParser.TKENDSCENARIOS, 0); }
		public List<TerminalNode> TKCOMMA() { return getTokens(SSLParser.TKCOMMA); }
		public TerminalNode TKCOMMA(int i) {
			return getToken(SSLParser.TKCOMMA, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSLVisitor ) return ((SSLVisitor<? extends T>)visitor).visitDecl_cenarios(this);
			else return visitor.visitChildren(this);
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
			match(TKSCENARIOS);
			setState(76);
			match(IDENTIFICADOR);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKCOMMA) {
				{
				{
				setState(77);
				match(TKCOMMA);
				setState(78);
				match(IDENTIFICADOR);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			match(TKENDSCENARIOS);
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
		public TerminalNode TKSCENARIO() { return getToken(SSLParser.TKSCENARIO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(SSLParser.IDENTIFICADOR, 0); }
		public TerminalNode TKENDSCENARIO() { return getToken(SSLParser.TKENDSCENARIO, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSLVisitor ) return ((SSLVisitor<? extends T>)visitor).visitDecl_cenario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_cenarioContext decl_cenario() throws RecognitionException {
		Decl_cenarioContext _localctx = new Decl_cenarioContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_decl_cenario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(TKSCENARIO);
			setState(87);
			match(IDENTIFICADOR);
			setState(88);
			match(TKENDSCENARIO);
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
		public TerminalNode TKAUTHORS() { return getToken(SSLParser.TKAUTHORS, 0); }
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SSLParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SSLParser.IDENTIFICADOR, i);
		}
		public TerminalNode TKENDAUTHORS() { return getToken(SSLParser.TKENDAUTHORS, 0); }
		public List<TerminalNode> TKCOMMA() { return getTokens(SSLParser.TKCOMMA); }
		public TerminalNode TKCOMMA(int i) {
			return getToken(SSLParser.TKCOMMA, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSLVisitor ) return ((SSLVisitor<? extends T>)visitor).visitDecl_autores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_autoresContext decl_autores() throws RecognitionException {
		Decl_autoresContext _localctx = new Decl_autoresContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_decl_autores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(TKAUTHORS);
			setState(91);
			match(IDENTIFICADOR);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKCOMMA) {
				{
				{
				setState(92);
				match(TKCOMMA);
				setState(93);
				match(IDENTIFICADOR);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(TKENDAUTHORS);
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
		public TerminalNode TKSCENEORDER() { return getToken(SSLParser.TKSCENEORDER, 0); }
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SSLParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SSLParser.IDENTIFICADOR, i);
		}
		public TerminalNode TKENDSCENEORDER() { return getToken(SSLParser.TKENDSCENEORDER, 0); }
		public List<TerminalNode> TKCOMMA() { return getTokens(SSLParser.TKCOMMA); }
		public TerminalNode TKCOMMA(int i) {
			return getToken(SSLParser.TKCOMMA, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSLVisitor ) return ((SSLVisitor<? extends T>)visitor).visitOrdem_cenas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordem_cenasContext ordem_cenas() throws RecognitionException {
		Ordem_cenasContext _localctx = new Ordem_cenasContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ordem_cenas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(TKSCENEORDER);
			setState(102);
			match(IDENTIFICADOR);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKCOMMA) {
				{
				{
				setState(103);
				match(TKCOMMA);
				setState(104);
				match(IDENTIFICADOR);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(TKENDSCENEORDER);
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
		public TerminalNode TKCOLON() { return getToken(SSLParser.TKCOLON, 0); }
		public TerminalNode STRING() { return getToken(SSLParser.STRING, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SSLVisitor ) return ((SSLVisitor<? extends T>)visitor).visitFala(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FalaContext fala() throws RecognitionException {
		FalaContext _localctx = new FalaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fala);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			chamada_personagem();
			setState(113);
			match(TKCOLON);
			setState(114);
			match(STRING);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30w\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\6\3%\n\3\r\3"+
		"\16\3&\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7=\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\tG\n\t\f\t"+
		"\16\tJ\13\t\3\t\3\t\3\n\3\n\3\n\3\n\7\nR\n\n\f\n\16\nU\13\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\fa\n\f\f\f\16\fd\13\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\7\rl\n\r\f\r\16\ro\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2p\2\34\3\2\2\2\4\"\3\2\2\2"+
		"\6(\3\2\2\2\b-\3\2\2\2\n\63\3\2\2\2\f<\3\2\2\2\16>\3\2\2\2\20B\3\2\2\2"+
		"\22M\3\2\2\2\24X\3\2\2\2\26\\\3\2\2\2\30g\3\2\2\2\32r\3\2\2\2\34\35\7"+
		"\3\2\2\35\36\7\27\2\2\36\37\7\23\2\2\37 \5\4\3\2 !\7\24\2\2!\3\3\2\2\2"+
		"\"$\5\6\4\2#%\5\b\5\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\5\3\2"+
		"\2\2()\5\26\f\2)*\5\20\t\2*+\5\22\n\2+,\5\30\r\2,\7\3\2\2\2-.\7\4\2\2"+
		"./\7\27\2\2/\60\7\23\2\2\60\61\5\n\6\2\61\62\7\24\2\2\62\t\3\2\2\2\63"+
		"\64\5\24\13\2\64\65\5\f\7\2\65\13\3\2\2\2\66\67\7\26\2\2\67=\5\f\7\28"+
		"9\5\32\16\29:\5\f\7\2:=\3\2\2\2;=\3\2\2\2<\66\3\2\2\2<8\3\2\2\2<;\3\2"+
		"\2\2=\r\3\2\2\2>?\7\21\2\2?@\7\27\2\2@A\7\22\2\2A\17\3\2\2\2BC\7\5\2\2"+
		"CH\7\27\2\2DE\7\17\2\2EG\7\27\2\2FD\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2"+
		"\2\2IK\3\2\2\2JH\3\2\2\2KL\7\6\2\2L\21\3\2\2\2MN\7\t\2\2NS\7\27\2\2OP"+
		"\7\17\2\2PR\7\27\2\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2"+
		"US\3\2\2\2VW\7\n\2\2W\23\3\2\2\2XY\7\7\2\2YZ\7\27\2\2Z[\7\b\2\2[\25\3"+
		"\2\2\2\\]\7\13\2\2]b\7\27\2\2^_\7\17\2\2_a\7\27\2\2`^\3\2\2\2ad\3\2\2"+
		"\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\f\2\2f\27\3\2\2\2gh\7\r"+
		"\2\2hm\7\27\2\2ij\7\17\2\2jl\7\27\2\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn"+
		"\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\16\2\2q\31\3\2\2\2rs\5\16\b\2st\7\20"+
		"\2\2tu\7\25\2\2u\33\3\2\2\2\b&<HSbm";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}