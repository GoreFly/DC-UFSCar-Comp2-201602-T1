// Generated from la_compiler\src\la_compiler\LA.g4 by ANTLR 4.5.3
package la_compiler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, IDENTIFICADOR=61, INTEIRO=62, REAL=63, CADEIA=64, COMENTARIO=65, 
		ESPACOS=66, NAO_COMENTARIO=67, ERRO=68;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_local_global = 2, RULE_declaracao_local = 3, 
		RULE_variavel = 4, RULE_mais_var = 5, RULE_identificador = 6, RULE_ponteiros_opcionais = 7, 
		RULE_outros_ident = 8, RULE_dimensao = 9, RULE_tipo = 10, RULE_mais_ident = 11, 
		RULE_mais_variaveis = 12, RULE_tipo_basico = 13, RULE_tipo_basico_ident = 14, 
		RULE_tipo_estendido = 15, RULE_valor_constante = 16, RULE_registro = 17, 
		RULE_declaracao_global = 18, RULE_parametros_opicional = 19, RULE_parametro = 20, 
		RULE_var_opcional = 21, RULE_mais_parametros = 22, RULE_declaracoes_locais = 23, 
		RULE_corpo = 24, RULE_comandos = 25, RULE_cmd = 26, RULE_mais_expressao = 27, 
		RULE_senao_opcional = 28, RULE_chamada_atribuicao = 29, RULE_argumentos_opcional = 30, 
		RULE_selecao = 31, RULE_mais_selecao = 32, RULE_constantes = 33, RULE_mais_contantes = 34, 
		RULE_numero_intervalo = 35, RULE_intervalo_opcional = 36, RULE_op_unario = 37, 
		RULE_exp_aritmetica = 38, RULE_op_multiplicacao = 39, RULE_op_adicao = 40, 
		RULE_termo = 41, RULE_outros_termos = 42, RULE_fator = 43, RULE_outros_fatores = 44, 
		RULE_parcela = 45, RULE_parcela_unario = 46, RULE_parcela_nao_unario = 47, 
		RULE_outras_parcelas = 48, RULE_chamada_partes = 49, RULE_exp_relacional = 50, 
		RULE_op_opcional = 51, RULE_op_relacional = 52, RULE_expressao = 53, RULE_op_nao = 54, 
		RULE_termo_logico = 55, RULE_outros_termos_logicos = 56, RULE_outros_fatores_logicos = 57, 
		RULE_fator_logico = 58, RULE_parcela_logica = 59;
	public static final String[] ruleNames = {
		"programa", "declaracoes", "decl_local_global", "declaracao_local", "variavel", 
		"mais_var", "identificador", "ponteiros_opcionais", "outros_ident", "dimensao", 
		"tipo", "mais_ident", "mais_variaveis", "tipo_basico", "tipo_basico_ident", 
		"tipo_estendido", "valor_constante", "registro", "declaracao_global", 
		"parametros_opicional", "parametro", "var_opcional", "mais_parametros", 
		"declaracoes_locais", "corpo", "comandos", "cmd", "mais_expressao", "senao_opcional", 
		"chamada_atribuicao", "argumentos_opcional", "selecao", "mais_selecao", 
		"constantes", "mais_contantes", "numero_intervalo", "intervalo_opcional", 
		"op_unario", "exp_aritmetica", "op_multiplicacao", "op_adicao", "termo", 
		"outros_termos", "fator", "outros_fatores", "parcela", "parcela_unario", 
		"parcela_nao_unario", "outras_parcelas", "chamada_partes", "exp_relacional", 
		"op_opcional", "op_relacional", "expressao", "op_nao", "termo_logico", 
		"outros_termos_logicos", "outros_fatores_logicos", "fator_logico", "parcela_logica"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'algoritmo'", "'fim_algoritmo'", "'declare'", "'constante'", "':'", 
		"'='", "'tipo'", "','", "'^'", "'.'", "'['", "']'", "'literal'", "'inteiro'", 
		"'real'", "'logico'", "'verdadeiro'", "'falso'", "'registro'", "'fim_registro'", 
		"'procedimento'", "'('", "')'", "'fim_procedimento'", "'funcao'", "'fim_funcao'", 
		"'var'", "'leia'", "'escreva'", "'se'", "'entao'", "'fim_se'", "'caso'", 
		"'seja'", "'fim_caso'", "'para'", "'<-'", "'ate'", "'faca'", "'fim-para'", 
		"'enquanto'", "'fim_enquanto'", "'ˆ'", "'retorne'", "'senao'", "'..'", 
		"'-'", "'*'", "'/'", "'+'", "'&'", "'%'", "'<>'", "'>='", "'<='", "'>'", 
		"'<'", "'nao'", "'ou'", "'e'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "IDENTIFICADOR", "INTEIRO", "REAL", "CADEIA", "COMENTARIO", "ESPACOS", 
		"NAO_COMENTARIO", "ERRO"
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
	public String getGrammarFileName() { return "LA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	static String grupo = "<551554, 551872, 551805, 551724>"; 

	    private void stop(String a){
	        throw new ParseCancellationException(a);
	    }

	    private void erroSemantico(String a){
	        outSemantico.println(a);
	    }

	    PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();

	    Saida outSemantico = new Saida();

	public LAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			declaracoes();
			setState(121);
			match(T__0);
			setState(122);
			corpo();
			setState(123);
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

	public static class DeclaracoesContext extends ParserRuleContext {
		public List<Decl_local_globalContext> decl_local_global() {
			return getRuleContexts(Decl_local_globalContext.class);
		}
		public Decl_local_globalContext decl_local_global(int i) {
			return getRuleContext(Decl_local_globalContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracoes(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__20) | (1L << T__24))) != 0)) {
				{
				{
				setState(125);
				decl_local_global();
				}
				}
				setState(130);
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

	public static class Decl_local_globalContext extends ParserRuleContext {
		public Declaracao_localContext declaracao_local() {
			return getRuleContext(Declaracao_localContext.class,0);
		}
		public Declaracao_globalContext declaracao_global() {
			return getRuleContext(Declaracao_globalContext.class,0);
		}
		public Decl_local_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_local_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDecl_local_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDecl_local_global(this);
		}
	}

	public final Decl_local_globalContext decl_local_global() throws RecognitionException {
		Decl_local_globalContext _localctx = new Decl_local_globalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_local_global);
		try {
			setState(133);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				declaracao_local();
				}
				break;
			case T__20:
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				declaracao_global();
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

	public static class Declaracao_localContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(LAParser.IDENTIFICADOR, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracao_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracao_local(this);
		}
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_local);
		try {
			setState(148);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(T__2);
				setState(136);
				variavel();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(T__3);
				setState(138);
				match(IDENTIFICADOR);
				setState(139);
				match(T__4);
				setState(140);
				tipo_basico();
				setState(141);
				match(T__5);
				setState(142);
				valor_constante();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(T__6);
				setState(145);
				match(IDENTIFICADOR);
				setState(146);
				match(T__4);
				setState(147);
				tipo();
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

	public static class VariavelContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(LAParser.IDENTIFICADOR, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Mais_varContext mais_var() {
			return getRuleContext(Mais_varContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(IDENTIFICADOR);
			setState(151);
			dimensao();
			setState(152);
			mais_var();
			setState(153);
			match(T__4);
			setState(154);
			tipo();
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

	public static class Mais_varContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(LAParser.IDENTIFICADOR, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Mais_varContext mais_var() {
			return getRuleContext(Mais_varContext.class,0);
		}
		public Mais_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_var(this);
		}
	}

	public final Mais_varContext mais_var() throws RecognitionException {
		Mais_varContext _localctx = new Mais_varContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mais_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(156);
				match(T__7);
				setState(157);
				match(IDENTIFICADOR);
				setState(158);
				dimensao();
				setState(159);
				mais_var();
				}
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

	public static class IdentificadorContext extends ParserRuleContext {
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(LAParser.IDENTIFICADOR, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitIdentificador(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			ponteiros_opcionais();
			setState(164);
			match(IDENTIFICADOR);
			setState(165);
			dimensao();
			setState(166);
			outros_ident();
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

	public static class Ponteiros_opcionaisContext extends ParserRuleContext {
		public Ponteiros_opcionaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponteiros_opcionais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterPonteiros_opcionais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitPonteiros_opcionais(this);
		}
	}

	public final Ponteiros_opcionaisContext ponteiros_opcionais() throws RecognitionException {
		Ponteiros_opcionaisContext _localctx = new Ponteiros_opcionaisContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ponteiros_opcionais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(168);
				match(T__8);
				}
				}
				setState(173);
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

	public static class Outros_identContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Outros_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutros_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutros_ident(this);
		}
	}

	public final Outros_identContext outros_ident() throws RecognitionException {
		Outros_identContext _localctx = new Outros_identContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_outros_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(174);
				match(T__9);
				setState(175);
				identificador();
				}
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

	public static class DimensaoContext extends ParserRuleContext {
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDimensao(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dimensao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(178);
				match(T__10);
				setState(179);
				exp_aritmetica();
				setState(180);
				match(T__11);
				setState(181);
				dimensao();
				}
				break;
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

	public static class TipoContext extends ParserRuleContext {
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo);
		try {
			setState(187);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				registro();
				}
				break;
			case T__8:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				tipo_estendido();
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

	public static class Mais_identContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public Mais_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_ident(this);
		}
	}

	public final Mais_identContext mais_ident() throws RecognitionException {
		Mais_identContext _localctx = new Mais_identContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mais_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(189);
				match(T__7);
				setState(190);
				identificador();
				setState(191);
				mais_ident();
				}
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

	public static class Mais_variaveisContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Mais_variaveisContext mais_variaveis() {
			return getRuleContext(Mais_variaveisContext.class,0);
		}
		public Mais_variaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_variaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_variaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_variaveis(this);
		}
	}

	public final Mais_variaveisContext mais_variaveis() throws RecognitionException {
		Mais_variaveisContext _localctx = new Mais_variaveisContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mais_variaveis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_la = _input.LA(1);
			if (_la==IDENTIFICADOR) {
				{
				setState(195);
				variavel();
				setState(196);
				mais_variaveis();
				}
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

	public static class Tipo_basicoContext extends ParserRuleContext {
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo_basico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo_basico(this);
		}
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo_basico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class Tipo_basico_identContext extends ParserRuleContext {
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(LAParser.IDENTIFICADOR, 0); }
		public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo_basico_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo_basico_ident(this);
		}
	}

	public final Tipo_basico_identContext tipo_basico_ident() throws RecognitionException {
		Tipo_basico_identContext _localctx = new Tipo_basico_identContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo_basico_ident);
		try {
			setState(204);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				tipo_basico();
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(IDENTIFICADOR);
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

	public static class Tipo_estendidoContext extends ParserRuleContext {
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public Tipo_basico_identContext tipo_basico_ident() {
			return getRuleContext(Tipo_basico_identContext.class,0);
		}
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo_estendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo_estendido(this);
		}
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tipo_estendido);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			ponteiros_opcionais();
			setState(207);
			tipo_basico_ident();
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

	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(LAParser.CADEIA, 0); }
		public TerminalNode INTEIRO() { return getToken(LAParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(LAParser.REAL, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitValor_constante(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !(((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__16 - 17)) | (1L << (T__17 - 17)) | (1L << (INTEIRO - 17)) | (1L << (REAL - 17)) | (1L << (CADEIA - 17)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class RegistroContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Mais_variaveisContext mais_variaveis() {
			return getRuleContext(Mais_variaveisContext.class,0);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitRegistro(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_registro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__18);
			setState(212);
			variavel();
			setState(213);
			mais_variaveis();
			setState(214);
			match(T__19);
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

	public static class Declaracao_globalContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(LAParser.IDENTIFICADOR, 0); }
		public Parametros_opicionalContext parametros_opicional() {
			return getRuleContext(Parametros_opicionalContext.class,0);
		}
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracao_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracao_global(this);
		}
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaracao_global);
		try {
			setState(236);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(T__20);
				setState(217);
				match(IDENTIFICADOR);
				setState(218);
				match(T__21);
				setState(219);
				parametros_opicional();
				setState(220);
				match(T__22);
				setState(221);
				declaracoes_locais();
				setState(222);
				comandos();
				setState(223);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(T__24);
				setState(226);
				match(IDENTIFICADOR);
				setState(227);
				match(T__21);
				setState(228);
				parametros_opicional();
				setState(229);
				match(T__22);
				setState(230);
				match(T__4);
				setState(231);
				tipo_estendido();
				setState(232);
				declaracoes_locais();
				setState(233);
				comandos();
				setState(234);
				match(T__25);
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

	public static class Parametros_opicionalContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public Parametros_opicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_opicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParametros_opicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParametros_opicional(this);
		}
	}

	public final Parametros_opicionalContext parametros_opicional() throws RecognitionException {
		Parametros_opicionalContext _localctx = new Parametros_opicionalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parametros_opicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__26) | (1L << IDENTIFICADOR))) != 0)) {
				{
				setState(238);
				parametro();
				}
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

	public static class ParametroContext extends ParserRuleContext {
		public Var_opcionalContext var_opcional() {
			return getRuleContext(Var_opcionalContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public Mais_parametrosContext mais_parametros() {
			return getRuleContext(Mais_parametrosContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			var_opcional();
			setState(242);
			identificador();
			setState(243);
			mais_ident();
			setState(244);
			match(T__4);
			setState(245);
			tipo_estendido();
			setState(246);
			mais_parametros();
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

	public static class Var_opcionalContext extends ParserRuleContext {
		public Var_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterVar_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitVar_opcional(this);
		}
	}

	public final Var_opcionalContext var_opcional() throws RecognitionException {
		Var_opcionalContext _localctx = new Var_opcionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(248);
				match(T__26);
				}
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

	public static class Mais_parametrosContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public Mais_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_parametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_parametros(this);
		}
	}

	public final Mais_parametrosContext mais_parametros() throws RecognitionException {
		Mais_parametrosContext _localctx = new Mais_parametrosContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mais_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(251);
				match(T__7);
				setState(252);
				parametro();
				}
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

	public static class Declaracoes_locaisContext extends ParserRuleContext {
		public Declaracao_localContext declaracao_local() {
			return getRuleContext(Declaracao_localContext.class,0);
		}
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public Declaracoes_locaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes_locais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracoes_locais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracoes_locais(this);
		}
	}

	public final Declaracoes_locaisContext declaracoes_locais() throws RecognitionException {
		Declaracoes_locaisContext _localctx = new Declaracoes_locaisContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declaracoes_locais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6))) != 0)) {
				{
				setState(255);
				declaracao_local();
				setState(256);
				declaracoes_locais();
				}
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

	public static class CorpoContext extends ParserRuleContext {
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCorpo(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			declaracoes_locais();
			setState(261);
			comandos();
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

	public static class ComandosContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__32) | (1L << T__35) | (1L << T__38) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << IDENTIFICADOR))) != 0)) {
				{
				{
				setState(263);
				cmd();
				}
				}
				setState(268);
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

	public static class CmdContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Senao_opcionalContext senao_opcional() {
			return getRuleContext(Senao_opcionalContext.class,0);
		}
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(LAParser.IDENTIFICADOR, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Chamada_atribuicaoContext chamada_atribuicao() {
			return getRuleContext(Chamada_atribuicaoContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cmd);
		try {
			setState(327);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(T__27);
				setState(270);
				match(T__21);
				setState(271);
				identificador();
				setState(272);
				mais_ident();
				setState(273);
				match(T__22);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(T__28);
				setState(276);
				match(T__21);
				setState(277);
				expressao();
				setState(278);
				mais_expressao();
				setState(279);
				match(T__22);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				match(T__29);
				setState(282);
				expressao();
				setState(283);
				match(T__30);
				setState(284);
				comandos();
				setState(285);
				senao_opcional();
				setState(286);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				match(T__32);
				setState(289);
				exp_aritmetica();
				setState(290);
				match(T__33);
				setState(291);
				selecao();
				setState(292);
				senao_opcional();
				setState(293);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				match(T__35);
				setState(296);
				match(IDENTIFICADOR);
				setState(297);
				match(T__36);
				setState(298);
				exp_aritmetica();
				setState(299);
				match(T__37);
				setState(300);
				exp_aritmetica();
				setState(301);
				match(T__38);
				setState(302);
				comandos();
				setState(303);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 6);
				{
				setState(305);
				match(T__40);
				setState(306);
				expressao();
				setState(307);
				match(T__38);
				setState(308);
				comandos();
				setState(309);
				match(T__41);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 7);
				{
				setState(311);
				match(T__38);
				setState(312);
				comandos();
				setState(313);
				match(T__37);
				setState(314);
				expressao();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 8);
				{
				setState(316);
				match(T__42);
				setState(317);
				match(IDENTIFICADOR);
				setState(318);
				outros_ident();
				setState(319);
				dimensao();
				setState(320);
				match(T__36);
				setState(321);
				expressao();
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 9);
				{
				setState(323);
				match(IDENTIFICADOR);
				setState(324);
				chamada_atribuicao();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 10);
				{
				setState(325);
				match(T__43);
				setState(326);
				expressao();
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

	public static class Mais_expressaoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public Mais_expressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_expressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_expressao(this);
		}
	}

	public final Mais_expressaoContext mais_expressao() throws RecognitionException {
		Mais_expressaoContext _localctx = new Mais_expressaoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mais_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(329);
				match(T__7);
				setState(330);
				expressao();
				setState(331);
				mais_expressao();
				}
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

	public static class Senao_opcionalContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Senao_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterSenao_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitSenao_opcional(this);
		}
	}

	public final Senao_opcionalContext senao_opcional() throws RecognitionException {
		Senao_opcionalContext _localctx = new Senao_opcionalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_senao_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(335);
				match(T__44);
				setState(336);
				comandos();
				}
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

	public static class Chamada_atribuicaoContext extends ParserRuleContext {
		public Argumentos_opcionalContext argumentos_opcional() {
			return getRuleContext(Argumentos_opcionalContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Chamada_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterChamada_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitChamada_atribuicao(this);
		}
	}

	public final Chamada_atribuicaoContext chamada_atribuicao() throws RecognitionException {
		Chamada_atribuicaoContext _localctx = new Chamada_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_chamada_atribuicao);
		try {
			setState(348);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(T__21);
				setState(340);
				argumentos_opcional();
				setState(341);
				match(T__22);
				}
				break;
			case T__9:
			case T__10:
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				outros_ident();
				setState(344);
				dimensao();
				setState(345);
				match(T__36);
				setState(346);
				expressao();
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

	public static class Argumentos_opcionalContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public Argumentos_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterArgumentos_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitArgumentos_opcional(this);
		}
	}

	public final Argumentos_opcionalContext argumentos_opcional() throws RecognitionException {
		Argumentos_opcionalContext _localctx = new Argumentos_opcionalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_argumentos_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__16 - 17)) | (1L << (T__17 - 17)) | (1L << (T__21 - 17)) | (1L << (T__42 - 17)) | (1L << (T__46 - 17)) | (1L << (T__50 - 17)) | (1L << (T__57 - 17)) | (1L << (IDENTIFICADOR - 17)) | (1L << (INTEIRO - 17)) | (1L << (REAL - 17)) | (1L << (CADEIA - 17)))) != 0)) {
				{
				setState(350);
				expressao();
				setState(351);
				mais_expressao();
				}
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

	public static class SelecaoContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Mais_selecaoContext mais_selecao() {
			return getRuleContext(Mais_selecaoContext.class,0);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitSelecao(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_selecao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			constantes();
			setState(356);
			match(T__4);
			setState(357);
			comandos();
			setState(358);
			mais_selecao();
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

	public static class Mais_selecaoContext extends ParserRuleContext {
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public Mais_selecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_selecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_selecao(this);
		}
	}

	public final Mais_selecaoContext mais_selecao() throws RecognitionException {
		Mais_selecaoContext _localctx = new Mais_selecaoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mais_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_la = _input.LA(1);
			if (_la==T__46 || _la==INTEIRO) {
				{
				setState(360);
				selecao();
				}
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

	public static class ConstantesContext extends ParserRuleContext {
		public Numero_intervaloContext numero_intervalo() {
			return getRuleContext(Numero_intervaloContext.class,0);
		}
		public Mais_contantesContext mais_contantes() {
			return getRuleContext(Mais_contantesContext.class,0);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitConstantes(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constantes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			numero_intervalo();
			setState(364);
			mais_contantes();
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

	public static class Mais_contantesContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public Mais_contantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_contantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_contantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_contantes(this);
		}
	}

	public final Mais_contantesContext mais_contantes() throws RecognitionException {
		Mais_contantesContext _localctx = new Mais_contantesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mais_contantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(366);
				match(T__7);
				setState(367);
				constantes();
				}
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

	public static class Numero_intervaloContext extends ParserRuleContext {
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public TerminalNode INTEIRO() { return getToken(LAParser.INTEIRO, 0); }
		public Intervalo_opcionalContext intervalo_opcional() {
			return getRuleContext(Intervalo_opcionalContext.class,0);
		}
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterNumero_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitNumero_intervalo(this);
		}
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_numero_intervalo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			op_unario();
			setState(371);
			match(INTEIRO);
			setState(372);
			intervalo_opcional();
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

	public static class Intervalo_opcionalContext extends ParserRuleContext {
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public TerminalNode INTEIRO() { return getToken(LAParser.INTEIRO, 0); }
		public Intervalo_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalo_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterIntervalo_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitIntervalo_opcional(this);
		}
	}

	public final Intervalo_opcionalContext intervalo_opcional() throws RecognitionException {
		Intervalo_opcionalContext _localctx = new Intervalo_opcionalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_intervalo_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(374);
				match(T__45);
				setState(375);
				op_unario();
				setState(376);
				match(INTEIRO);
				}
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

	public static class Op_unarioContext extends ParserRuleContext {
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_unario(this);
		}
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_op_unario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_la = _input.LA(1);
			if (_la==T__46) {
				{
				setState(380);
				match(T__46);
				}
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

	public static class Exp_aritmeticaContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Outros_termosContext outros_termos() {
			return getRuleContext(Outros_termosContext.class,0);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterExp_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitExp_aritmetica(this);
		}
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exp_aritmetica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			termo();
			setState(384);
			outros_termos();
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

	public static class Op_multiplicacaoContext extends ParserRuleContext {
		public Op_multiplicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_multiplicacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_multiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_multiplicacao(this);
		}
	}

	public final Op_multiplicacaoContext op_multiplicacao() throws RecognitionException {
		Op_multiplicacaoContext _localctx = new Op_multiplicacaoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_op_multiplicacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_la = _input.LA(1);
			if ( !(_la==T__47 || _la==T__48) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class Op_adicaoContext extends ParserRuleContext {
		public Op_adicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_adicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_adicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_adicao(this);
		}
	}

	public final Op_adicaoContext op_adicao() throws RecognitionException {
		Op_adicaoContext _localctx = new Op_adicaoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_op_adicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_la = _input.LA(1);
			if ( !(_la==T__46 || _la==T__49) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class TermoContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Outros_fatoresContext outros_fatores() {
			return getRuleContext(Outros_fatoresContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_termo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			fator();
			setState(391);
			outros_fatores();
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

	public static class Outros_termosContext extends ParserRuleContext {
		public Op_adicaoContext op_adicao() {
			return getRuleContext(Op_adicaoContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Outros_termosContext outros_termos() {
			return getRuleContext(Outros_termosContext.class,0);
		}
		public Outros_termosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutros_termos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutros_termos(this);
		}
	}

	public final Outros_termosContext outros_termos() throws RecognitionException {
		Outros_termosContext _localctx = new Outros_termosContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_outros_termos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(393);
				op_adicao();
				setState(394);
				termo();
				setState(395);
				outros_termos();
				}
				break;
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

	public static class FatorContext extends ParserRuleContext {
		public ParcelaContext parcela() {
			return getRuleContext(ParcelaContext.class,0);
		}
		public Outras_parcelasContext outras_parcelas() {
			return getRuleContext(Outras_parcelasContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			parcela();
			setState(400);
			outras_parcelas();
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

	public static class Outros_fatoresContext extends ParserRuleContext {
		public Op_multiplicacaoContext op_multiplicacao() {
			return getRuleContext(Op_multiplicacaoContext.class,0);
		}
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Outros_fatoresContext outros_fatores() {
			return getRuleContext(Outros_fatoresContext.class,0);
		}
		public Outros_fatoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_fatores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutros_fatores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutros_fatores(this);
		}
	}

	public final Outros_fatoresContext outros_fatores() throws RecognitionException {
		Outros_fatoresContext _localctx = new Outros_fatoresContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_outros_fatores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_la = _input.LA(1);
			if (_la==T__47 || _la==T__48) {
				{
				setState(402);
				op_multiplicacao();
				setState(403);
				fator();
				setState(404);
				outros_fatores();
				}
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

	public static class ParcelaContext extends ParserRuleContext {
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_parcela);
		try {
			setState(412);
			switch (_input.LA(1)) {
			case T__21:
			case T__42:
			case T__46:
			case IDENTIFICADOR:
			case INTEIRO:
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				op_unario();
				setState(409);
				parcela_unario();
				}
				break;
			case T__50:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				parcela_nao_unario();
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

	public static class Parcela_unarioContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(LAParser.IDENTIFICADOR, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Chamada_partesContext chamada_partes() {
			return getRuleContext(Chamada_partesContext.class,0);
		}
		public TerminalNode INTEIRO() { return getToken(LAParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(LAParser.REAL, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_unario(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_parcela_unario);
		try {
			setState(427);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				match(T__42);
				setState(415);
				match(IDENTIFICADOR);
				setState(416);
				outros_ident();
				setState(417);
				dimensao();
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(IDENTIFICADOR);
				setState(420);
				chamada_partes();
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				match(INTEIRO);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(422);
				match(REAL);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(423);
				match(T__21);
				setState(424);
				expressao();
				setState(425);
				match(T__22);
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

	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(LAParser.IDENTIFICADOR, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(LAParser.CADEIA, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_nao_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_nao_unario(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parcela_nao_unario);
		try {
			setState(435);
			switch (_input.LA(1)) {
			case T__50:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(T__50);
				setState(430);
				match(IDENTIFICADOR);
				setState(431);
				outros_ident();
				setState(432);
				dimensao();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				match(CADEIA);
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

	public static class Outras_parcelasContext extends ParserRuleContext {
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public Outras_parcelasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outras_parcelas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutras_parcelas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutras_parcelas(this);
		}
	}

	public final Outras_parcelasContext outras_parcelas() throws RecognitionException {
		Outras_parcelasContext _localctx = new Outras_parcelasContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_outras_parcelas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__51) {
				{
				{
				setState(437);
				match(T__51);
				setState(438);
				parcela();
				}
				}
				setState(443);
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

	public static class Chamada_partesContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Chamada_partesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_partes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterChamada_partes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitChamada_partes(this);
		}
	}

	public final Chamada_partesContext chamada_partes() throws RecognitionException {
		Chamada_partesContext _localctx = new Chamada_partesContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_chamada_partes);
		try {
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(T__21);
				setState(445);
				expressao();
				setState(446);
				mais_expressao();
				setState(447);
				match(T__22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				outros_ident();
				setState(450);
				dimensao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Exp_relacionalContext extends ParserRuleContext {
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public Op_opcionalContext op_opcional() {
			return getRuleContext(Op_opcionalContext.class,0);
		}
		public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterExp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitExp_relacional(this);
		}
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_exp_relacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			exp_aritmetica();
			setState(456);
			op_opcional();
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

	public static class Op_opcionalContext extends ParserRuleContext {
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public Op_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_opcional(this);
		}
	}

	public final Op_opcionalContext op_opcional() throws RecognitionException {
		Op_opcionalContext _localctx = new Op_opcionalContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_op_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0)) {
				{
				setState(458);
				op_relacional();
				setState(459);
				exp_aritmetica();
				}
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

	public static class Op_relacionalContext extends ParserRuleContext {
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_relacional(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class ExpressaoContext extends ParserRuleContext {
		public Termo_logicoContext termo_logico() {
			return getRuleContext(Termo_logicoContext.class,0);
		}
		public Outros_termos_logicosContext outros_termos_logicos() {
			return getRuleContext(Outros_termos_logicosContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			termo_logico();
			setState(466);
			outros_termos_logicos();
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

	public static class Op_naoContext extends ParserRuleContext {
		public Op_naoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_nao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_nao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_nao(this);
		}
	}

	public final Op_naoContext op_nao() throws RecognitionException {
		Op_naoContext _localctx = new Op_naoContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_op_nao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_la = _input.LA(1);
			if (_la==T__57) {
				{
				setState(468);
				match(T__57);
				}
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

	public static class Termo_logicoContext extends ParserRuleContext {
		public Fator_logicoContext fator_logico() {
			return getRuleContext(Fator_logicoContext.class,0);
		}
		public Outros_fatores_logicosContext outros_fatores_logicos() {
			return getRuleContext(Outros_fatores_logicosContext.class,0);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTermo_logico(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_termo_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			fator_logico();
			setState(472);
			outros_fatores_logicos();
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

	public static class Outros_termos_logicosContext extends ParserRuleContext {
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public Outros_termos_logicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos_logicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutros_termos_logicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutros_termos_logicos(this);
		}
	}

	public final Outros_termos_logicosContext outros_termos_logicos() throws RecognitionException {
		Outros_termos_logicosContext _localctx = new Outros_termos_logicosContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_outros_termos_logicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__58) {
				{
				{
				setState(474);
				match(T__58);
				setState(475);
				termo_logico();
				}
				}
				setState(480);
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

	public static class Outros_fatores_logicosContext extends ParserRuleContext {
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public Outros_fatores_logicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_fatores_logicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutros_fatores_logicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutros_fatores_logicos(this);
		}
	}

	public final Outros_fatores_logicosContext outros_fatores_logicos() throws RecognitionException {
		Outros_fatores_logicosContext _localctx = new Outros_fatores_logicosContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_outros_fatores_logicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__59) {
				{
				{
				setState(481);
				match(T__59);
				setState(482);
				fator_logico();
				}
				}
				setState(487);
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

	public static class Fator_logicoContext extends ParserRuleContext {
		public Op_naoContext op_nao() {
			return getRuleContext(Op_naoContext.class,0);
		}
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitFator_logico(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_fator_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			op_nao();
			setState(489);
			parcela_logica();
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

	public static class Parcela_logicaContext extends ParserRuleContext {
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_logica(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_parcela_logica);
		try {
			setState(494);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				match(T__17);
				}
				break;
			case T__21:
			case T__42:
			case T__46:
			case T__50:
			case IDENTIFICADOR:
			case INTEIRO:
			case REAL:
			case CADEIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
				exp_relacional();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3F\u01f3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\2\3\3\7\3\u0081\n\3\f\3\16\3\u0084\13\3\3\4\3\4\5\4"+
		"\u0088\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0097"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u00a4\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\7\t\u00ac\n\t\f\t\16\t\u00af\13\t\3\n\3\n\5\n\u00b3\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\5\13\u00ba\n\13\3\f\3\f\5\f\u00be\n\f\3\r"+
		"\3\r\3\r\3\r\5\r\u00c4\n\r\3\16\3\16\3\16\5\16\u00c9\n\16\3\17\3\17\3"+
		"\20\3\20\5\20\u00cf\n\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00ef\n\24\3\25\5\25\u00f2\n"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\5\27\u00fc\n\27\3\30\3\30"+
		"\5\30\u0100\n\30\3\31\3\31\3\31\5\31\u0105\n\31\3\32\3\32\3\32\3\33\7"+
		"\33\u010b\n\33\f\33\16\33\u010e\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u014a\n\34\3\35"+
		"\3\35\3\35\3\35\5\35\u0150\n\35\3\36\3\36\5\36\u0154\n\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u015f\n\37\3 \3 \3 \5 \u0164\n"+
		" \3!\3!\3!\3!\3!\3\"\5\"\u016c\n\"\3#\3#\3#\3$\3$\5$\u0173\n$\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\5&\u017d\n&\3\'\5\'\u0180\n\'\3(\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3+\3,\3,\3,\3,\5,\u0190\n,\3-\3-\3-\3.\3.\3.\3.\5.\u0199\n.\3/\3"+
		"/\3/\3/\5/\u019f\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\5\60\u01ae\n\60\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u01b6"+
		"\n\61\3\62\3\62\7\62\u01ba\n\62\f\62\16\62\u01bd\13\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u01c8\n\63\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\5\65\u01d0\n\65\3\66\3\66\3\67\3\67\3\67\38\58\u01d8\n8\39\39\3"+
		"9\3:\3:\7:\u01df\n:\f:\16:\u01e2\13:\3;\3;\7;\u01e6\n;\f;\16;\u01e9\13"+
		";\3<\3<\3<\3=\3=\3=\5=\u01f1\n=\3=\2\2>\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\7\3"+
		"\2\17\22\4\2\23\24@B\3\2\62\63\4\2\61\61\64\64\4\2\b\b\67;\u01ea\2z\3"+
		"\2\2\2\4\u0082\3\2\2\2\6\u0087\3\2\2\2\b\u0096\3\2\2\2\n\u0098\3\2\2\2"+
		"\f\u00a3\3\2\2\2\16\u00a5\3\2\2\2\20\u00ad\3\2\2\2\22\u00b2\3\2\2\2\24"+
		"\u00b9\3\2\2\2\26\u00bd\3\2\2\2\30\u00c3\3\2\2\2\32\u00c8\3\2\2\2\34\u00ca"+
		"\3\2\2\2\36\u00ce\3\2\2\2 \u00d0\3\2\2\2\"\u00d3\3\2\2\2$\u00d5\3\2\2"+
		"\2&\u00ee\3\2\2\2(\u00f1\3\2\2\2*\u00f3\3\2\2\2,\u00fb\3\2\2\2.\u00ff"+
		"\3\2\2\2\60\u0104\3\2\2\2\62\u0106\3\2\2\2\64\u010c\3\2\2\2\66\u0149\3"+
		"\2\2\28\u014f\3\2\2\2:\u0153\3\2\2\2<\u015e\3\2\2\2>\u0163\3\2\2\2@\u0165"+
		"\3\2\2\2B\u016b\3\2\2\2D\u016d\3\2\2\2F\u0172\3\2\2\2H\u0174\3\2\2\2J"+
		"\u017c\3\2\2\2L\u017f\3\2\2\2N\u0181\3\2\2\2P\u0184\3\2\2\2R\u0186\3\2"+
		"\2\2T\u0188\3\2\2\2V\u018f\3\2\2\2X\u0191\3\2\2\2Z\u0198\3\2\2\2\\\u019e"+
		"\3\2\2\2^\u01ad\3\2\2\2`\u01b5\3\2\2\2b\u01bb\3\2\2\2d\u01c7\3\2\2\2f"+
		"\u01c9\3\2\2\2h\u01cf\3\2\2\2j\u01d1\3\2\2\2l\u01d3\3\2\2\2n\u01d7\3\2"+
		"\2\2p\u01d9\3\2\2\2r\u01e0\3\2\2\2t\u01e7\3\2\2\2v\u01ea\3\2\2\2x\u01f0"+
		"\3\2\2\2z{\5\4\3\2{|\7\3\2\2|}\5\62\32\2}~\7\4\2\2~\3\3\2\2\2\177\u0081"+
		"\5\6\4\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\5\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0088\5\b\5\2"+
		"\u0086\u0088\5&\24\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\7\3"+
		"\2\2\2\u0089\u008a\7\5\2\2\u008a\u0097\5\n\6\2\u008b\u008c\7\6\2\2\u008c"+
		"\u008d\7?\2\2\u008d\u008e\7\7\2\2\u008e\u008f\5\34\17\2\u008f\u0090\7"+
		"\b\2\2\u0090\u0091\5\"\22\2\u0091\u0097\3\2\2\2\u0092\u0093\7\t\2\2\u0093"+
		"\u0094\7?\2\2\u0094\u0095\7\7\2\2\u0095\u0097\5\26\f\2\u0096\u0089\3\2"+
		"\2\2\u0096\u008b\3\2\2\2\u0096\u0092\3\2\2\2\u0097\t\3\2\2\2\u0098\u0099"+
		"\7?\2\2\u0099\u009a\5\24\13\2\u009a\u009b\5\f\7\2\u009b\u009c\7\7\2\2"+
		"\u009c\u009d\5\26\f\2\u009d\13\3\2\2\2\u009e\u009f\7\n\2\2\u009f\u00a0"+
		"\7?\2\2\u00a0\u00a1\5\24\13\2\u00a1\u00a2\5\f\7\2\u00a2\u00a4\3\2\2\2"+
		"\u00a3\u009e\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\r\3\2\2\2\u00a5\u00a6\5"+
		"\20\t\2\u00a6\u00a7\7?\2\2\u00a7\u00a8\5\24\13\2\u00a8\u00a9\5\22\n\2"+
		"\u00a9\17\3\2\2\2\u00aa\u00ac\7\13\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\21\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00b1\7\f\2\2\u00b1\u00b3\5\16\b\2\u00b2\u00b0\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\23\3\2\2\2\u00b4\u00b5\7\r\2\2\u00b5"+
		"\u00b6\5N(\2\u00b6\u00b7\7\16\2\2\u00b7\u00b8\5\24\13\2\u00b8\u00ba\3"+
		"\2\2\2\u00b9\u00b4\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\25\3\2\2\2\u00bb"+
		"\u00be\5$\23\2\u00bc\u00be\5 \21\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2"+
		"\2\2\u00be\27\3\2\2\2\u00bf\u00c0\7\n\2\2\u00c0\u00c1\5\16\b\2\u00c1\u00c2"+
		"\5\30\r\2\u00c2\u00c4\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c3\u00c4\3\2\2\2"+
		"\u00c4\31\3\2\2\2\u00c5\u00c6\5\n\6\2\u00c6\u00c7\5\32\16\2\u00c7\u00c9"+
		"\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\33\3\2\2\2\u00ca"+
		"\u00cb\t\2\2\2\u00cb\35\3\2\2\2\u00cc\u00cf\5\34\17\2\u00cd\u00cf\7?\2"+
		"\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\37\3\2\2\2\u00d0\u00d1"+
		"\5\20\t\2\u00d1\u00d2\5\36\20\2\u00d2!\3\2\2\2\u00d3\u00d4\t\3\2\2\u00d4"+
		"#\3\2\2\2\u00d5\u00d6\7\25\2\2\u00d6\u00d7\5\n\6\2\u00d7\u00d8\5\32\16"+
		"\2\u00d8\u00d9\7\26\2\2\u00d9%\3\2\2\2\u00da\u00db\7\27\2\2\u00db\u00dc"+
		"\7?\2\2\u00dc\u00dd\7\30\2\2\u00dd\u00de\5(\25\2\u00de\u00df\7\31\2\2"+
		"\u00df\u00e0\5\60\31\2\u00e0\u00e1\5\64\33\2\u00e1\u00e2\7\32\2\2\u00e2"+
		"\u00ef\3\2\2\2\u00e3\u00e4\7\33\2\2\u00e4\u00e5\7?\2\2\u00e5\u00e6\7\30"+
		"\2\2\u00e6\u00e7\5(\25\2\u00e7\u00e8\7\31\2\2\u00e8\u00e9\7\7\2\2\u00e9"+
		"\u00ea\5 \21\2\u00ea\u00eb\5\60\31\2\u00eb\u00ec\5\64\33\2\u00ec\u00ed"+
		"\7\34\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00da\3\2\2\2\u00ee\u00e3\3\2\2\2"+
		"\u00ef\'\3\2\2\2\u00f0\u00f2\5*\26\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3"+
		"\2\2\2\u00f2)\3\2\2\2\u00f3\u00f4\5,\27\2\u00f4\u00f5\5\16\b\2\u00f5\u00f6"+
		"\5\30\r\2\u00f6\u00f7\7\7\2\2\u00f7\u00f8\5 \21\2\u00f8\u00f9\5.\30\2"+
		"\u00f9+\3\2\2\2\u00fa\u00fc\7\35\2\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3"+
		"\2\2\2\u00fc-\3\2\2\2\u00fd\u00fe\7\n\2\2\u00fe\u0100\5*\26\2\u00ff\u00fd"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100/\3\2\2\2\u0101\u0102\5\b\5\2\u0102"+
		"\u0103\5\60\31\2\u0103\u0105\3\2\2\2\u0104\u0101\3\2\2\2\u0104\u0105\3"+
		"\2\2\2\u0105\61\3\2\2\2\u0106\u0107\5\60\31\2\u0107\u0108\5\64\33\2\u0108"+
		"\63\3\2\2\2\u0109\u010b\5\66\34\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\65\3\2\2\2\u010e\u010c"+
		"\3\2\2\2\u010f\u0110\7\36\2\2\u0110\u0111\7\30\2\2\u0111\u0112\5\16\b"+
		"\2\u0112\u0113\5\30\r\2\u0113\u0114\7\31\2\2\u0114\u014a\3\2\2\2\u0115"+
		"\u0116\7\37\2\2\u0116\u0117\7\30\2\2\u0117\u0118\5l\67\2\u0118\u0119\5"+
		"8\35\2\u0119\u011a\7\31\2\2\u011a\u014a\3\2\2\2\u011b\u011c\7 \2\2\u011c"+
		"\u011d\5l\67\2\u011d\u011e\7!\2\2\u011e\u011f\5\64\33\2\u011f\u0120\5"+
		":\36\2\u0120\u0121\7\"\2\2\u0121\u014a\3\2\2\2\u0122\u0123\7#\2\2\u0123"+
		"\u0124\5N(\2\u0124\u0125\7$\2\2\u0125\u0126\5@!\2\u0126\u0127\5:\36\2"+
		"\u0127\u0128\7%\2\2\u0128\u014a\3\2\2\2\u0129\u012a\7&\2\2\u012a\u012b"+
		"\7?\2\2\u012b\u012c\7\'\2\2\u012c\u012d\5N(\2\u012d\u012e\7(\2\2\u012e"+
		"\u012f\5N(\2\u012f\u0130\7)\2\2\u0130\u0131\5\64\33\2\u0131\u0132\7*\2"+
		"\2\u0132\u014a\3\2\2\2\u0133\u0134\7+\2\2\u0134\u0135\5l\67\2\u0135\u0136"+
		"\7)\2\2\u0136\u0137\5\64\33\2\u0137\u0138\7,\2\2\u0138\u014a\3\2\2\2\u0139"+
		"\u013a\7)\2\2\u013a\u013b\5\64\33\2\u013b\u013c\7(\2\2\u013c\u013d\5l"+
		"\67\2\u013d\u014a\3\2\2\2\u013e\u013f\7-\2\2\u013f\u0140\7?\2\2\u0140"+
		"\u0141\5\22\n\2\u0141\u0142\5\24\13\2\u0142\u0143\7\'\2\2\u0143\u0144"+
		"\5l\67\2\u0144\u014a\3\2\2\2\u0145\u0146\7?\2\2\u0146\u014a\5<\37\2\u0147"+
		"\u0148\7.\2\2\u0148\u014a\5l\67\2\u0149\u010f\3\2\2\2\u0149\u0115\3\2"+
		"\2\2\u0149\u011b\3\2\2\2\u0149\u0122\3\2\2\2\u0149\u0129\3\2\2\2\u0149"+
		"\u0133\3\2\2\2\u0149\u0139\3\2\2\2\u0149\u013e\3\2\2\2\u0149\u0145\3\2"+
		"\2\2\u0149\u0147\3\2\2\2\u014a\67\3\2\2\2\u014b\u014c\7\n\2\2\u014c\u014d"+
		"\5l\67\2\u014d\u014e\58\35\2\u014e\u0150\3\2\2\2\u014f\u014b\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u01509\3\2\2\2\u0151\u0152\7/\2\2\u0152\u0154\5\64\33\2"+
		"\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154;\3\2\2\2\u0155\u0156\7"+
		"\30\2\2\u0156\u0157\5> \2\u0157\u0158\7\31\2\2\u0158\u015f\3\2\2\2\u0159"+
		"\u015a\5\22\n\2\u015a\u015b\5\24\13\2\u015b\u015c\7\'\2\2\u015c\u015d"+
		"\5l\67\2\u015d\u015f\3\2\2\2\u015e\u0155\3\2\2\2\u015e\u0159\3\2\2\2\u015f"+
		"=\3\2\2\2\u0160\u0161\5l\67\2\u0161\u0162\58\35\2\u0162\u0164\3\2\2\2"+
		"\u0163\u0160\3\2\2\2\u0163\u0164\3\2\2\2\u0164?\3\2\2\2\u0165\u0166\5"+
		"D#\2\u0166\u0167\7\7\2\2\u0167\u0168\5\64\33\2\u0168\u0169\5B\"\2\u0169"+
		"A\3\2\2\2\u016a\u016c\5@!\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"C\3\2\2\2\u016d\u016e\5H%\2\u016e\u016f\5F$\2\u016fE\3\2\2\2\u0170\u0171"+
		"\7\n\2\2\u0171\u0173\5D#\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"G\3\2\2\2\u0174\u0175\5L\'\2\u0175\u0176\7@\2\2\u0176\u0177\5J&\2\u0177"+
		"I\3\2\2\2\u0178\u0179\7\60\2\2\u0179\u017a\5L\'\2\u017a\u017b\7@\2\2\u017b"+
		"\u017d\3\2\2\2\u017c\u0178\3\2\2\2\u017c\u017d\3\2\2\2\u017dK\3\2\2\2"+
		"\u017e\u0180\7\61\2\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180M\3"+
		"\2\2\2\u0181\u0182\5T+\2\u0182\u0183\5V,\2\u0183O\3\2\2\2\u0184\u0185"+
		"\t\4\2\2\u0185Q\3\2\2\2\u0186\u0187\t\5\2\2\u0187S\3\2\2\2\u0188\u0189"+
		"\5X-\2\u0189\u018a\5Z.\2\u018aU\3\2\2\2\u018b\u018c\5R*\2\u018c\u018d"+
		"\5T+\2\u018d\u018e\5V,\2\u018e\u0190\3\2\2\2\u018f\u018b\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190W\3\2\2\2\u0191\u0192\5\\/\2\u0192\u0193\5b\62\2\u0193"+
		"Y\3\2\2\2\u0194\u0195\5P)\2\u0195\u0196\5X-\2\u0196\u0197\5Z.\2\u0197"+
		"\u0199\3\2\2\2\u0198\u0194\3\2\2\2\u0198\u0199\3\2\2\2\u0199[\3\2\2\2"+
		"\u019a\u019b\5L\'\2\u019b\u019c\5^\60\2\u019c\u019f\3\2\2\2\u019d\u019f"+
		"\5`\61\2\u019e\u019a\3\2\2\2\u019e\u019d\3\2\2\2\u019f]\3\2\2\2\u01a0"+
		"\u01a1\7-\2\2\u01a1\u01a2\7?\2\2\u01a2\u01a3\5\22\n\2\u01a3\u01a4\5\24"+
		"\13\2\u01a4\u01ae\3\2\2\2\u01a5\u01a6\7?\2\2\u01a6\u01ae\5d\63\2\u01a7"+
		"\u01ae\7@\2\2\u01a8\u01ae\7A\2\2\u01a9\u01aa\7\30\2\2\u01aa\u01ab\5l\67"+
		"\2\u01ab\u01ac\7\31\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01a0\3\2\2\2\u01ad"+
		"\u01a5\3\2\2\2\u01ad\u01a7\3\2\2\2\u01ad\u01a8\3\2\2\2\u01ad\u01a9\3\2"+
		"\2\2\u01ae_\3\2\2\2\u01af\u01b0\7\65\2\2\u01b0\u01b1\7?\2\2\u01b1\u01b2"+
		"\5\22\n\2\u01b2\u01b3\5\24\13\2\u01b3\u01b6\3\2\2\2\u01b4\u01b6\7B\2\2"+
		"\u01b5\u01af\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6a\3\2\2\2\u01b7\u01b8\7"+
		"\66\2\2\u01b8\u01ba\5\\/\2\u01b9\u01b7\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bcc\3\2\2\2\u01bd\u01bb\3\2\2\2"+
		"\u01be\u01bf\7\30\2\2\u01bf\u01c0\5l\67\2\u01c0\u01c1\58\35\2\u01c1\u01c2"+
		"\7\31\2\2\u01c2\u01c8\3\2\2\2\u01c3\u01c4\5\22\n\2\u01c4\u01c5\5\24\13"+
		"\2\u01c5\u01c8\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01be\3\2\2\2\u01c7\u01c3"+
		"\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c8e\3\2\2\2\u01c9\u01ca\5N(\2\u01ca\u01cb"+
		"\5h\65\2\u01cbg\3\2\2\2\u01cc\u01cd\5j\66\2\u01cd\u01ce\5N(\2\u01ce\u01d0"+
		"\3\2\2\2\u01cf\u01cc\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0i\3\2\2\2\u01d1"+
		"\u01d2\t\6\2\2\u01d2k\3\2\2\2\u01d3\u01d4\5p9\2\u01d4\u01d5\5r:\2\u01d5"+
		"m\3\2\2\2\u01d6\u01d8\7<\2\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"o\3\2\2\2\u01d9\u01da\5v<\2\u01da\u01db\5t;\2\u01dbq\3\2\2\2\u01dc\u01dd"+
		"\7=\2\2\u01dd\u01df\5p9\2\u01de\u01dc\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0"+
		"\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1s\3\2\2\2\u01e2\u01e0\3\2\2\2"+
		"\u01e3\u01e4\7>\2\2\u01e4\u01e6\5v<\2\u01e5\u01e3\3\2\2\2\u01e6\u01e9"+
		"\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8u\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01ea\u01eb\5n8\2\u01eb\u01ec\5x=\2\u01ecw\3\2\2\2\u01ed"+
		"\u01f1\7\23\2\2\u01ee\u01f1\7\24\2\2\u01ef\u01f1\5f\64\2\u01f0\u01ed\3"+
		"\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01ef\3\2\2\2\u01f1y\3\2\2\2(\u0082\u0087"+
		"\u0096\u00a3\u00ad\u00b2\u00b9\u00bd\u00c3\u00c8\u00ce\u00ee\u00f1\u00fb"+
		"\u00ff\u0104\u010c\u0149\u014f\u0153\u015e\u0163\u016b\u0172\u017c\u017f"+
		"\u018f\u0198\u019e\u01ad\u01b5\u01bb\u01c7\u01cf\u01d7\u01e0\u01e7\u01f0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}