// Generated from src/la_compiler/LA.g4 by ANTLR 4.5.3
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
		RULE_declaracao_global = 18, RULE_parametros_opcional = 19, RULE_parametro = 20, 
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
		"parametros_opcional", "parametro", "var_opcional", "mais_parametros", 
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

	    private void stop(String a) {
	        throw new ParseCancellationException(a);
	    }

	    PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
	    PilhaDeTabelas tabelaDeRegistros = new PilhaDeTabelas();
	    TabelaDeSimbolos tabelaDeTipos = new TabelaDeSimbolos("tipos");
	    String erro = "";

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

			                  // tabela de símbolos global e tipos padrão da linguaguem
			                  pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global"));
			                  tabelaDeTipos.adicionarSimbolo("inteiro", "inteiro");
			                  tabelaDeTipos.adicionarSimbolo("real", "real");
			                  tabelaDeTipos.adicionarSimbolo("literal", "literal");
			                  tabelaDeTipos.adicionarSimbolo("logico", "logico");
			                
			setState(121);
			declaracoes();
			setState(122);
			match(T__0);
			setState(123);
			corpo();
			setState(124);
			match(T__1);

			                  // desempilha a tabela global
			                  pilhaDeTabelas.desempilhar();
			                  // caso o erro não esteja vazio, significa que a semântica não está correta
			                  // "erro" terá informações sobre o erro
			                  if (erro != "") throw new RuntimeException(erro);
			                
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
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__20) | (1L << T__24))) != 0)) {
				{
				{
				setState(127);
				decl_local_global();
				}
				}
				setState(132);
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
			setState(135);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				declaracao_local();
				}
				break;
			case T__20:
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
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
		public VariavelContext variavel;
		public Token id;
		public Tipo_basicoContext tb;
		public TipoContext t;
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(LAParser.IDENTIFICADOR, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
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
			setState(155);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(T__2);
				setState(138);
				((Declaracao_localContext)_localctx).variavel = variavel();

				                  for (String s : ((Declaracao_localContext)_localctx).variavel.identificadores) {
				                    if (pilhaDeTabelas.topo().existeSimbolo(s))
				                      // necessário verificar se a variável ja foi declarada antes
				                      erro += "Linha " + ((Declaracao_localContext)_localctx).variavel.linha + ": identificador "+ s +" ja declarado anteriormente\n";
				                    else {
				                      // verifica se a variável é de um tipo válido. Caso for válido adicionamos ela na tabela de símbolos do escopo atual
				                      if (tabelaDeTipos.existeSimbolo(((Declaracao_localContext)_localctx).variavel.tipoSimbolo)) {
				                        pilhaDeTabelas.topo().adicionarSimbolo(s, ((Declaracao_localContext)_localctx).variavel.tipoSimbolo);
				                        if (tabelaDeRegistros.existeTabela(((Declaracao_localContext)_localctx).variavel.tipoSimbolo)!=null) {
				                          // caso o tipo da variável for um registro, declaramos os componentes desse tipo na variável
				                          TabelaDeSimbolos tabelaDoRegistro = tabelaDeRegistros.existeTabela(((Declaracao_localContext)_localctx).variavel.tipoSimbolo);
				                          for (EntradaTabelaDeSimbolos t: tabelaDoRegistro.getSimbolos()){
				                            pilhaDeTabelas.topo().adicionarSimbolo(s+"."+t.getNome(), t.getTipo());
				                          }
				                        } else {
				                          // se o tipo não for identificado pode ser que ele tenha sido declarado como um registro
				                          // Ex: tipo: <registro> | <tipo_extendido>
				                          if (tabelaDeRegistros.existeTabela("registro")!=null){
				                            TabelaDeSimbolos tabelaDoRegistro = tabelaDeRegistros.existeTabela("registro");
				                            for (EntradaTabelaDeSimbolos t: tabelaDoRegistro.getSimbolos()){
				                              pilhaDeTabelas.topo().adicionarSimbolo(s+"."+t.getNome(), t.getTipo());
				                            }
				                          }
				                        }
				                      } else {
				                        // caso o tipo não tenha sido identificado, a variável erro identifica como "tipo não declarado"
				                        erro += "Linha " + ((Declaracao_localContext)_localctx).variavel.linha + ": tipo " + ((Declaracao_localContext)_localctx).variavel.tipoSimbolo + " nao declarado\n";
				                        pilhaDeTabelas.topo().adicionarSimbolo(s, ((Declaracao_localContext)_localctx).variavel.tipoSimbolo);
				                      }
				                    }
				                  }
				                
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(T__3);
				setState(142);
				((Declaracao_localContext)_localctx).id = match(IDENTIFICADOR);
				setState(143);
				match(T__4);
				setState(144);
				((Declaracao_localContext)_localctx).tb = tipo_basico();
				setState(145);
				match(T__5);
				setState(146);
				valor_constante();

				                  // verifica se a nova variável já foi declarada antes no escopo atual
				                  // caso não tenha sido, adicionamos ela na tabela de simbolos do escopo atual
				                  if (pilhaDeTabelas.topo().existeSimbolo(((Declaracao_localContext)_localctx).id.getText()))
				                    erro += "Linha " + ((Declaracao_localContext)_localctx).id.getLine() + ": identificador " + ((Declaracao_localContext)_localctx).id.getText() + " ja declarado anteriormente\n";
				                  else
				                    pilhaDeTabelas.topo().adicionarSimbolo(((Declaracao_localContext)_localctx).id.getText(), ((Declaracao_localContext)_localctx).tb.tipoSimbolo);
				                
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(T__6);
				setState(150);
				((Declaracao_localContext)_localctx).id = match(IDENTIFICADOR);
				setState(151);
				match(T__4);
				setState(152);
				((Declaracao_localContext)_localctx).t = tipo(((Declaracao_localContext)_localctx).id.getText());

				                  // verifica se a nova variável já foi declarada antes no escopo atual
				                  // caso não tenha sido, adicionamos ela na tabela de simbolos do escopo atual
				                  // além disso, adicionamos a variável na tabelaDeTipos, afinal é de um novo tipo
				                  if (pilhaDeTabelas.topo().existeSimbolo(((Declaracao_localContext)_localctx).id.getText())) 
				                    erro += "Linha " + ((Declaracao_localContext)_localctx).id.getLine() + ": identificador " + ((Declaracao_localContext)_localctx).id.getText() + " ja declarado anteriormente\n";
				                  else{
				                    pilhaDeTabelas.topo().adicionarSimbolo(((Declaracao_localContext)_localctx).id.getText(), ((Declaracao_localContext)_localctx).t.tipoSimbolo);
				                    tabelaDeTipos.adicionarSimbolo(((Declaracao_localContext)_localctx).id.getText(), ((Declaracao_localContext)_localctx).t.tipoSimbolo);
				                  }
				                
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
		public List<String> identificadores;
		public String tipoSimbolo;
		public int linha;
		public Token id;
		public Mais_varContext mv;
		public TipoContext tp;
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(LAParser.IDENTIFICADOR, 0); }
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
		((VariavelContext)_localctx).identificadores =  new ArrayList<String>(); ((VariavelContext)_localctx).tipoSimbolo =  ""; ((VariavelContext)_localctx).linha =  -1;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			((VariavelContext)_localctx).id = match(IDENTIFICADOR);
			setState(158);
			dimensao();
			setState(159);
			((VariavelContext)_localctx).mv = mais_var();
			setState(160);
			match(T__4);
			setState(161);
			((VariavelContext)_localctx).tp = tipo(_localctx.tipoSimbolo);

			                  int i = 0;
			                  ((VariavelContext)_localctx).tipoSimbolo =  ((VariavelContext)_localctx).tp.tipoSimbolo;
			                  _localctx.identificadores.add(((VariavelContext)_localctx).id.getText());
			                  _localctx.identificadores.addAll(((VariavelContext)_localctx).mv.identificadores);
			                  if (((VariavelContext)_localctx).mv.linha == -1)
			                    ((VariavelContext)_localctx).linha =  ((VariavelContext)_localctx).id.getLine();
			                  else
			                    ((VariavelContext)_localctx).linha =  ((VariavelContext)_localctx).mv.linha;
			                
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
		public List<String> identificadores;
		public int linha;
		public Token id;
		public List<DimensaoContext> dimensao() {
			return getRuleContexts(DimensaoContext.class);
		}
		public DimensaoContext dimensao(int i) {
			return getRuleContext(DimensaoContext.class,i);
		}
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(LAParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(LAParser.IDENTIFICADOR, i);
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
		((Mais_varContext)_localctx).identificadores =  new ArrayList<String>(); ((Mais_varContext)_localctx).linha =  -1;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(164);
				match(T__7);
				setState(165);
				((Mais_varContext)_localctx).id = match(IDENTIFICADOR);

				                  if (!pilhaDeTabelas.existeSimbolo(((Mais_varContext)_localctx).id.getText()))
				                  {
				                    _localctx.identificadores.add(((Mais_varContext)_localctx).id.getText());
				                    ((Mais_varContext)_localctx).linha =  ((Mais_varContext)_localctx).id.getLine();
				                  }
				                  else
				                  {
				                    // retorna erro quando a variável já foi declarada antes
				                    erro += "Linha " + ((Mais_varContext)_localctx).id.getLine() + ": identificador " + ((Mais_varContext)_localctx).id.getText() + " ja declarado anteriormente\n";
				                  }
				                
				setState(167);
				dimensao();
				}
				}
				setState(172);
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

	public static class IdentificadorContext extends ParserRuleContext {
		public String simbolo;
		public int linha;
		public String tipoSimbolo;
		public Token id;
		public Outros_identContext id2;
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(LAParser.IDENTIFICADOR, 0); }
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
		((IdentificadorContext)_localctx).simbolo =  ""; ((IdentificadorContext)_localctx).linha =  -1; ((IdentificadorContext)_localctx).tipoSimbolo =  "NONE";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			ponteiros_opcionais();
			setState(174);
			((IdentificadorContext)_localctx).id = match(IDENTIFICADOR);
			setState(175);
			dimensao();
			setState(176);
			((IdentificadorContext)_localctx).id2 = outros_ident();

			                  _localctx.simbolo += (((IdentificadorContext)_localctx).id!=null?((IdentificadorContext)_localctx).id.getText():null) + ((IdentificadorContext)_localctx).id2.simbolo;
			                  ((IdentificadorContext)_localctx).linha =  ((IdentificadorContext)_localctx).id.getLine();
			                  ((IdentificadorContext)_localctx).tipoSimbolo =  pilhaDeTabelas.topo().getTipoSimbolo(_localctx.simbolo);
			                
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
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(179);
				match(T__8);
				}
				}
				setState(184);
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
		public String simbolo;
		public IdentificadorContext id;
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
		 ((Outros_identContext)_localctx).simbolo =  ""; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(185);
				match(T__9);
				setState(186);
				((Outros_identContext)_localctx).id = identificador();

				                  ((Outros_identContext)_localctx).simbolo =  "." + ((Outros_identContext)_localctx).id.simbolo;
				                
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
		public String simbolo;
		public Exp_aritmeticaContext ea;
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
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
		 ((DimensaoContext)_localctx).simbolo =  ""; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(191);
				match(T__10);
				setState(192);
				((DimensaoContext)_localctx).ea = exp_aritmetica();
				setState(193);
				match(T__11);
				setState(194);
				dimensao();

				                  ((DimensaoContext)_localctx).simbolo =  "[" + ((DimensaoContext)_localctx).ea.simbolo + "]";
				                
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
		public String tipoRegistro;
		public String tipoSimbolo;
		public List<String> identificadores;
		public RegistroContext reg;
		public RegistroContext registro;
		public Tipo_estendidoContext tipo_estendido;
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TipoContext(ParserRuleContext parent, int invokingState, String tipoRegistro) {
			super(parent, invokingState);
			this.tipoRegistro = tipoRegistro;
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

	public final TipoContext tipo(String tipoRegistro) throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState(), tipoRegistro);
		enterRule(_localctx, 20, RULE_tipo);
		((TipoContext)_localctx).tipoSimbolo = ""; ((TipoContext)_localctx).identificadores =  new ArrayList<String>();
		try {
			setState(205);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				((TipoContext)_localctx).reg = ((TipoContext)_localctx).registro = registro(_localctx.tipoRegistro);

				                  ((TipoContext)_localctx).tipoSimbolo =  ((TipoContext)_localctx).reg.tipoRegistro; 
				                  _localctx.identificadores.addAll(((TipoContext)_localctx).registro.identificadores);
				                
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
				setState(202);
				((TipoContext)_localctx).tipo_estendido = tipo_estendido();

				                  ((TipoContext)_localctx).tipoSimbolo =  ((TipoContext)_localctx).tipo_estendido.tipoSimbolo;
				                
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
		public List<String> identificadores;
		public int linha;
		public IdentificadorContext ide;
		public Mais_identContext mid;
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
		((Mais_identContext)_localctx).identificadores =  new ArrayList<String>(); ((Mais_identContext)_localctx).linha = -1;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(207);
				match(T__7);
				setState(208);
				((Mais_identContext)_localctx).ide = identificador();
				setState(209);
				((Mais_identContext)_localctx).mid = mais_ident();

				                  _localctx.identificadores.add(((Mais_identContext)_localctx).ide.simbolo);
				                  _localctx.identificadores.addAll(((Mais_identContext)_localctx).mid.identificadores);
				                  ((Mais_identContext)_localctx).linha =  ((Mais_identContext)_localctx).ide.linha;
				                
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
		public List<String> identificadores;
		public String tipoSimbolo;
		public int linha;
		public VariavelContext variavel;
		public Mais_variaveisContext mva;
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
		((Mais_variaveisContext)_localctx).identificadores =  new ArrayList<String>(); ((Mais_variaveisContext)_localctx).tipoSimbolo =  ""; ((Mais_variaveisContext)_localctx).linha = -1;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if (_la==IDENTIFICADOR) {
				{
				setState(214);
				((Mais_variaveisContext)_localctx).variavel = variavel();
				setState(215);
				((Mais_variaveisContext)_localctx).mva = mais_variaveis();

				                    _localctx.identificadores.addAll(((Mais_variaveisContext)_localctx).variavel.identificadores);
				                    ((Mais_variaveisContext)_localctx).tipoSimbolo = ((Mais_variaveisContext)_localctx).variavel.tipoSimbolo;
				                    ((Mais_variaveisContext)_localctx).linha = ((Mais_variaveisContext)_localctx).variavel.linha;
				                    _localctx.identificadores.addAll(((Mais_variaveisContext)_localctx).mva.identificadores);
				                  
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
		public String tipoSimbolo;
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
		((Tipo_basicoContext)_localctx).tipoSimbolo = "";
		try {
			setState(228);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(T__12);
				((Tipo_basicoContext)_localctx).tipoSimbolo =  "literal";
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(T__13);
				((Tipo_basicoContext)_localctx).tipoSimbolo =  "inteiro";
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(T__14);
				((Tipo_basicoContext)_localctx).tipoSimbolo =  "real";
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				match(T__15);
				((Tipo_basicoContext)_localctx).tipoSimbolo =  "logico";
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

	public static class Tipo_basico_identContext extends ParserRuleContext {
		public String tipoSimbolo;
		public Tipo_basicoContext tb;
		public Token ide;
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
			setState(235);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				((Tipo_basico_identContext)_localctx).tb = tipo_basico();

				                  ((Tipo_basico_identContext)_localctx).tipoSimbolo =  ((Tipo_basico_identContext)_localctx).tb.tipoSimbolo;
				                
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				((Tipo_basico_identContext)_localctx).ide = match(IDENTIFICADOR);

				                  ((Tipo_basico_identContext)_localctx).tipoSimbolo =  ((Tipo_basico_identContext)_localctx).ide.getText();
				                
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
		public String tipoSimbolo;
		public Tipo_basico_identContext tbi;
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
		((Tipo_estendidoContext)_localctx).tipoSimbolo = "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			ponteiros_opcionais();
			setState(238);
			((Tipo_estendidoContext)_localctx).tbi = tipo_basico_ident();

			                  ((Tipo_estendidoContext)_localctx).tipoSimbolo =  ((Tipo_estendidoContext)_localctx).tbi.tipoSimbolo;
			                
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
			setState(241);
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
		public String nomeRegistro;
		public String tipoRegistro;
		public List<String> identificadores;
		public VariavelContext variavel;
		public Mais_variaveisContext mais_variaveis;
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Mais_variaveisContext mais_variaveis() {
			return getRuleContext(Mais_variaveisContext.class,0);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RegistroContext(ParserRuleContext parent, int invokingState, String nomeRegistro) {
			super(parent, invokingState);
			this.nomeRegistro = nomeRegistro;
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

	public final RegistroContext registro(String nomeRegistro) throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState(), nomeRegistro);
		enterRule(_localctx, 34, RULE_registro);
		((RegistroContext)_localctx).identificadores =  new ArrayList<String>();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__18);

			                  pilhaDeTabelas.empilhar(new TabelaDeSimbolos("registro"));
			                  if (!_localctx.nomeRegistro.equals(""))
			                    tabelaDeRegistros.empilhar(new TabelaDeSimbolos(_localctx.nomeRegistro));
			                  else
			                    tabelaDeRegistros.empilhar(new TabelaDeSimbolos("registro"));
			                
			setState(245);
			((RegistroContext)_localctx).variavel = variavel();
			setState(246);
			((RegistroContext)_localctx).mais_variaveis = mais_variaveis();

			                  for (String s1 : ((RegistroContext)_localctx).variavel.identificadores)
			                  {
			                    tabelaDeRegistros.topo().adicionarSimbolo(s1, ((RegistroContext)_localctx).variavel.tipoSimbolo);
			                    _localctx.identificadores.add(s1);
			                  }
			                  for (String s2 : ((RegistroContext)_localctx).mais_variaveis.identificadores)
			                  {
			                    tabelaDeRegistros.topo().adicionarSimbolo(s2, ((RegistroContext)_localctx).mais_variaveis.tipoSimbolo);
			                    _localctx.identificadores.add(s2);
			                  }
			                  ((RegistroContext)_localctx).tipoRegistro =  ((RegistroContext)_localctx).variavel.tipoSimbolo;
			                
			setState(248);
			match(T__19);

			                  pilhaDeTabelas.desempilhar();
			                
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
		public Token ide;
		public Tipo_estendidoContext tes;
		public Parametros_opcionalContext parametros_opcional() {
			return getRuleContext(Parametros_opcionalContext.class,0);
		}
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(LAParser.IDENTIFICADOR, 0); }
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
			setState(275);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(T__20);
				setState(252);
				((Declaracao_globalContext)_localctx).ide = match(IDENTIFICADOR);

				                  // ao ser declarado o procedimento, um identificador válido (não declarado) para ele é necessário
				                  // uma nova tabela de símbolos é empilhada no começo e desempilhada no termino
				                  if (pilhaDeTabelas.topo().existeSimbolo(((Declaracao_globalContext)_localctx).ide.getText()))
				                    erro += "Linha " + ((Declaracao_globalContext)_localctx).ide.getLine() + ": identificador " + ((Declaracao_globalContext)_localctx).ide.getText() + " ja declarado anteriormente\n";
				                  else
				                  {
				                    pilhaDeTabelas.topo().adicionarSimbolo(((Declaracao_globalContext)_localctx).ide.getText(), "procedimento");
				                    pilhaDeTabelas.empilhar(new TabelaDeSimbolos("procedimento"));
				                  }
				                
				setState(254);
				match(T__21);
				setState(255);
				parametros_opcional();
				setState(256);
				match(T__22);
				setState(257);
				declaracoes_locais();
				setState(258);
				comandos();
				setState(259);
				match(T__23);

				                  pilhaDeTabelas.desempilhar();
				                
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(T__24);
				setState(263);
				((Declaracao_globalContext)_localctx).ide = match(IDENTIFICADOR);

				                  // ao ser declarado o procedimento, um identificador válido (não declarado) para ele é necessário
				                  // nova tabela de símbolos é empilhada no começo e desempilhada no termino
				                  if (pilhaDeTabelas.topo().existeSimbolo(((Declaracao_globalContext)_localctx).ide.getText()))
				                    erro += "Linha " + ((Declaracao_globalContext)_localctx).ide.getLine() + ": identificador " + ((Declaracao_globalContext)_localctx).ide.getText() + " ja declarado anteriormente\n";
				                  else
				                  {
				                    pilhaDeTabelas.empilhar(new TabelaDeSimbolos("funcao"));
				                  }
				                
				setState(265);
				match(T__21);
				setState(266);
				parametros_opcional();
				setState(267);
				match(T__22);
				setState(268);
				match(T__4);
				setState(269);
				((Declaracao_globalContext)_localctx).tes = tipo_estendido();
				setState(270);
				declaracoes_locais();
				setState(271);
				comandos();
				setState(272);
				match(T__25);

				                  pilhaDeTabelas.desempilhar();
				                  // no escopo atual, empilhamos um símbolo correspondente ao nome da função
				                  pilhaDeTabelas.topo().adicionarSimbolo(((Declaracao_globalContext)_localctx).ide.getText(), ((Declaracao_globalContext)_localctx).tes.tipoSimbolo);
				                
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

	public static class Parametros_opcionalContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public Parametros_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParametros_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParametros_opcional(this);
		}
	}

	public final Parametros_opcionalContext parametros_opcional() throws RecognitionException {
		Parametros_opcionalContext _localctx = new Parametros_opcionalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parametros_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__26) | (1L << IDENTIFICADOR))) != 0)) {
				{
				setState(277);
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
		public IdentificadorContext ide;
		public Tipo_estendidoContext tes;
		public Var_opcionalContext var_opcional() {
			return getRuleContext(Var_opcionalContext.class,0);
		}
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public Mais_parametrosContext mais_parametros() {
			return getRuleContext(Mais_parametrosContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
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
			setState(280);
			var_opcional();
			setState(281);
			((ParametroContext)_localctx).ide = identificador();
			setState(282);
			mais_ident();
			setState(283);
			match(T__4);
			setState(284);
			((ParametroContext)_localctx).tes = tipo_estendido();
			setState(285);
			mais_parametros();

			                  if (pilhaDeTabelas.topo().existeSimbolo(((ParametroContext)_localctx).ide.simbolo))
			                    erro += "Linha " + ((ParametroContext)_localctx).ide.linha + ": identificador " + ((ParametroContext)_localctx).ide.simbolo + "ja declarado anteriormente\n";
			                  else
			                  {
			                    pilhaDeTabelas.topo().adicionarSimbolo(((ParametroContext)_localctx).ide.simbolo, ((ParametroContext)_localctx).tes.tipoSimbolo);
			                    if (tabelaDeRegistros.existeTabela(((ParametroContext)_localctx).tes.tipoSimbolo) != null)
			                    {
			                      TabelaDeSimbolos tabelaDoRegistro = tabelaDeRegistros.existeTabela(((ParametroContext)_localctx).tes.tipoSimbolo);
			                      for (String s : tabelaDoRegistro.getNomesSimbolos())
			                        pilhaDeTabelas.topo().adicionarSimbolo(((ParametroContext)_localctx).ide.simbolo + s, ((ParametroContext)_localctx).tes.tipoSimbolo);
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
			setState(289);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(288);
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
			setState(293);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(291);
				match(T__7);
				setState(292);
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
			setState(298);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6))) != 0)) {
				{
				setState(295);
				declaracao_local();
				setState(296);
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
			setState(300);
			declaracoes_locais();
			setState(301);
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
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__32) | (1L << T__35) | (1L << T__38) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << IDENTIFICADOR))) != 0)) {
				{
				{
				setState(303);
				cmd();
				}
				}
				setState(308);
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
		public String tipoComando;
		public IdentificadorContext ide1;
		public Mais_identContext mid1;
		public Token ide2;
		public Outros_identContext oid;
		public ExpressaoContext exp;
		public Token ide3;
		public Token ret;
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
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
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
		((CmdContext)_localctx).tipoComando = "";
		try {
			setState(380);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(T__27);
				setState(310);
				match(T__21);
				setState(311);
				((CmdContext)_localctx).ide1 = identificador();
				setState(312);
				((CmdContext)_localctx).mid1 = mais_ident();
				 
				                  // verifica se simbolos já foram declarados
				                  if(!pilhaDeTabelas.existeSimbolo(((CmdContext)_localctx).ide1.simbolo)) {
				                    erro += "Linha " + ((CmdContext)_localctx).ide1.linha + ": identificador " + ((CmdContext)_localctx).ide1.simbolo + " nao declarado\n";
				                  }
				                  for (String s : ((CmdContext)_localctx).mid1.identificadores)
				                  {
				                    if(!pilhaDeTabelas.existeSimbolo(s)) {
				                      erro+="Linha " + ((CmdContext)_localctx).ide1.linha + ": identificador " + s + " nao declarado\n";
				                    }
				                  }    
				                
				setState(314);
				match(T__22);
				((CmdContext)_localctx).tipoComando =  "leia";
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(T__28);
				setState(318);
				match(T__21);
				setState(319);
				expressao();
				setState(320);
				mais_expressao();
				setState(321);
				match(T__22);

				                  ((CmdContext)_localctx).tipoComando =  "escreva";
				                
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				match(T__29);
				setState(325);
				expressao();
				setState(326);
				match(T__30);
				setState(327);
				comandos();
				setState(328);
				senao_opcional();
				setState(329);
				match(T__31);

				                  ((CmdContext)_localctx).tipoComando =  "escreva";
				                
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
				match(T__32);
				setState(333);
				exp_aritmetica();
				setState(334);
				match(T__33);
				setState(335);
				selecao();
				setState(336);
				senao_opcional();
				setState(337);
				match(T__34);

				                  ((CmdContext)_localctx).tipoComando =  "caso";
				                
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 5);
				{
				setState(340);
				match(T__35);
				setState(341);
				match(IDENTIFICADOR);
				setState(342);
				match(T__36);
				setState(343);
				exp_aritmetica();
				setState(344);
				match(T__37);
				setState(345);
				exp_aritmetica();
				setState(346);
				match(T__38);
				setState(347);
				comandos();
				setState(348);
				match(T__39);

				                  ((CmdContext)_localctx).tipoComando =  "para";
				                
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 6);
				{
				setState(351);
				match(T__40);
				setState(352);
				expressao();
				setState(353);
				match(T__38);
				setState(354);
				comandos();
				setState(355);
				match(T__41);

				                  ((CmdContext)_localctx).tipoComando =  "enquanto";
				                
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 7);
				{
				setState(358);
				match(T__38);
				setState(359);
				comandos();
				setState(360);
				match(T__37);
				setState(361);
				expressao();

				                  ((CmdContext)_localctx).tipoComando =  "faca";
				                
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 8);
				{
				setState(364);
				match(T__42);
				setState(365);
				((CmdContext)_localctx).ide2 = match(IDENTIFICADOR);
				setState(366);
				((CmdContext)_localctx).oid = outros_ident();
				setState(367);
				dimensao();
				setState(368);
				match(T__36);
				setState(369);
				((CmdContext)_localctx).exp = expressao();

				                  // verifica se os simbolos da atribuicao sao compativeis
				                  ((CmdContext)_localctx).tipoComando =  "expoente";
				                  String tipoExpressao = ((CmdContext)_localctx).exp.tipoSimbolo;
				                  String tipoIdentificador = pilhaDeTabelas.topo().getTipoSimbolo(((CmdContext)_localctx).ide2.getText());
				                  if (!tipoExpressao.equals(tipoIdentificador))
				                    erro += "Linha " + ((CmdContext)_localctx).ide2.getLine() + ": atribuicao nao compativel para ^" + ((CmdContext)_localctx).ide2.getText() + ((CmdContext)_localctx).oid.simbolo + "\n";
				                
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 9);
				{
				setState(372);
				((CmdContext)_localctx).ide3 = match(IDENTIFICADOR);
				setState(373);
				chamada_atribuicao((((CmdContext)_localctx).ide3!=null?((CmdContext)_localctx).ide3.getText():null));

				                  // verifica se o simbolo ja foi declarado
				                  if (!pilhaDeTabelas.existeSimbolo(((CmdContext)_localctx).ide3.getText())) {
				                    erro += "Linha " + ((CmdContext)_localctx).ide3.getLine() + ": identificador " + ((CmdContext)_localctx).ide3.getText() + " nao declarado\n";
				                  }
				                
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 10);
				{
				setState(376);
				((CmdContext)_localctx).ret = match(T__43);
				setState(377);
				expressao();

				                  // verifica escopo atual e escopo do comando
				                  String atual = pilhaDeTabelas.topo().getEscopo();
				                  if (!atual.equals("funcao"))
				                    erro += "Linha " + ((CmdContext)_localctx).ret.getLine() + ": comando retorne nao permitido nesse escopo\n";
				                
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
		public String tipoSimbolo;
		public ExpressaoContext exp;
		public Mais_expressaoContext mex;
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
		((Mais_expressaoContext)_localctx).tipoSimbolo = "NONE";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(382);
				match(T__7);
				setState(383);
				((Mais_expressaoContext)_localctx).exp = expressao();
				setState(384);
				((Mais_expressaoContext)_localctx).mex = mais_expressao();

				                    // verifica se os tipos sao compativeis
				                    if (((Mais_expressaoContext)_localctx).mex.tipoSimbolo.equals("NONE"))
				                      ((Mais_expressaoContext)_localctx).tipoSimbolo =  ((Mais_expressaoContext)_localctx).exp.tipoSimbolo;
				                    else
				                    {
				                      if (((Mais_expressaoContext)_localctx).exp.tipoSimbolo.equals(((Mais_expressaoContext)_localctx).mex.tipoSimbolo) || (((Mais_expressaoContext)_localctx).exp.tipoSimbolo.equals("inteiro") || ((Mais_expressaoContext)_localctx).exp.tipoSimbolo.equals("real")) && (((Mais_expressaoContext)_localctx).mex.tipoSimbolo.equals("real") || ((Mais_expressaoContext)_localctx).mex.tipoSimbolo.equals("inteiro")))
				                          ((Mais_expressaoContext)_localctx).tipoSimbolo =  _localctx.tipoSimbolo;
				                      else
				                          ((Mais_expressaoContext)_localctx).tipoSimbolo =  "incompativel";
				                    }  
				                  
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
			setState(391);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(389);
				match(T__44);
				setState(390);
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
		public String identificadorInicial;
		public Outros_identContext oid;
		public DimensaoContext dim;
		public Token atr;
		public ExpressaoContext exp;
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
		public Chamada_atribuicaoContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Chamada_atribuicaoContext(ParserRuleContext parent, int invokingState, String identificadorInicial) {
			super(parent, invokingState);
			this.identificadorInicial = identificadorInicial;
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

	public final Chamada_atribuicaoContext chamada_atribuicao(String identificadorInicial) throws RecognitionException {
		Chamada_atribuicaoContext _localctx = new Chamada_atribuicaoContext(_ctx, getState(), identificadorInicial);
		enterRule(_localctx, 58, RULE_chamada_atribuicao);
		try {
			setState(403);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(T__21);
				setState(394);
				argumentos_opcional();
				setState(395);
				match(T__22);
				}
				break;
			case T__9:
			case T__10:
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				((Chamada_atribuicaoContext)_localctx).oid = outros_ident();
				setState(398);
				((Chamada_atribuicaoContext)_localctx).dim = dimensao();
				setState(399);
				((Chamada_atribuicaoContext)_localctx).atr = match(T__36);
				setState(400);
				((Chamada_atribuicaoContext)_localctx).exp = expressao();

				                  if (pilhaDeTabelas.existeSimbolo(_localctx.identificadorInicial + ((Chamada_atribuicaoContext)_localctx).oid.simbolo))
				                  {
				                    // verifica se os tipos sao compativeis
				                    String tpi = pilhaDeTabelas.topo().getTipoSimbolo(_localctx.identificadorInicial + ((Chamada_atribuicaoContext)_localctx).oid.simbolo);
				                    String te = ((Chamada_atribuicaoContext)_localctx).exp.tipoSimbolo;
				                    String ti = null;

				                    if(tabelaDeRegistros.existeTabela(te)!=null) {
				                        TabelaDeSimbolos t = tabelaDeRegistros.existeTabela(te);
				                        ti = t.getTipoSimbolo(tpi);
				                    }
				                    if (!(tpi.equals(te) || (tpi.equals("inteiro") && te.equals("real") || tpi.equals("real")) && (te.equals("inteiro") || ti != null)))
				                           erro += "Linha " + ((Chamada_atribuicaoContext)_localctx).atr.getLine() + ": atribuicao nao compativel para " + _localctx.identificadorInicial + ((Chamada_atribuicaoContext)_localctx).oid.simbolo + ((Chamada_atribuicaoContext)_localctx).dim.simbolo +"\n";
				                  }
				                
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
			setState(408);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__16 - 17)) | (1L << (T__17 - 17)) | (1L << (T__21 - 17)) | (1L << (T__42 - 17)) | (1L << (T__46 - 17)) | (1L << (T__50 - 17)) | (1L << (T__57 - 17)) | (1L << (IDENTIFICADOR - 17)) | (1L << (INTEIRO - 17)) | (1L << (REAL - 17)) | (1L << (CADEIA - 17)))) != 0)) {
				{
				setState(405);
				expressao();
				setState(406);
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
			setState(410);
			constantes();
			setState(411);
			match(T__4);
			setState(412);
			comandos();
			setState(413);
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
			setState(416);
			_la = _input.LA(1);
			if (_la==T__46 || _la==INTEIRO) {
				{
				setState(415);
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
			setState(418);
			numero_intervalo();
			setState(419);
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
			setState(423);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(421);
				match(T__7);
				setState(422);
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
			setState(425);
			op_unario();
			setState(426);
			match(INTEIRO);
			setState(427);
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
			setState(433);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(429);
				match(T__45);
				setState(430);
				op_unario();
				setState(431);
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
			setState(436);
			_la = _input.LA(1);
			if (_la==T__46) {
				{
				setState(435);
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
		public String tipoSimbolo;
		public String simbolo;
		public TermoContext ter;
		public Outros_termosContext ote;
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
		((Exp_aritmeticaContext)_localctx).tipoSimbolo = "NONE"; ((Exp_aritmeticaContext)_localctx).simbolo = "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			((Exp_aritmeticaContext)_localctx).ter = termo();
			setState(439);
			((Exp_aritmeticaContext)_localctx).ote = outros_termos();

			                    // verifica se tipos são compativeis
			                    // caso não sejam, a expressão é incompativel
			                    ((Exp_aritmeticaContext)_localctx).simbolo =  ((Exp_aritmeticaContext)_localctx).ter.simbolo;
			                    if (((Exp_aritmeticaContext)_localctx).ote.tipoSimbolo.equals("NONE"))
			                      ((Exp_aritmeticaContext)_localctx).tipoSimbolo =  ((Exp_aritmeticaContext)_localctx).ter.tipoSimbolo;
			                    else
			                    {
			                      if (((Exp_aritmeticaContext)_localctx).ter.tipoSimbolo.equals(((Exp_aritmeticaContext)_localctx).ote.tipoSimbolo) || (((Exp_aritmeticaContext)_localctx).ter.tipoSimbolo.equals("inteiro") || ((Exp_aritmeticaContext)_localctx).ter.tipoSimbolo.equals("real")) && (((Exp_aritmeticaContext)_localctx).ote.tipoSimbolo.equals("real") || ((Exp_aritmeticaContext)_localctx).ote.tipoSimbolo.equals("inteiro")))
			                        ((Exp_aritmeticaContext)_localctx).tipoSimbolo =  ((Exp_aritmeticaContext)_localctx).ter.tipoSimbolo;
			                      else
			                        ((Exp_aritmeticaContext)_localctx).tipoSimbolo =  "incompativel";
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
			setState(442);
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
			setState(444);
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
		public String tipoSimbolo;
		public String simbolo;
		public FatorContext fat;
		public Outros_fatoresContext outros_fatores() {
			return getRuleContext(Outros_fatoresContext.class,0);
		}
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
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
		((TermoContext)_localctx).tipoSimbolo = "NONE"; ((TermoContext)_localctx).simbolo = "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			((TermoContext)_localctx).fat = fator();
			setState(447);
			outros_fatores();

			                  ((TermoContext)_localctx).tipoSimbolo =  ((TermoContext)_localctx).fat.tipoSimbolo;
			                  ((TermoContext)_localctx).simbolo =  ((TermoContext)_localctx).fat.simbolo;
			                
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
		public String tipoSimbolo;
		public TermoContext ter;
		public Outros_termosContext ote;
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
		((Outros_termosContext)_localctx).tipoSimbolo = "NONE";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(450);
				op_adicao();
				setState(451);
				((Outros_termosContext)_localctx).ter = termo();
				setState(452);
				((Outros_termosContext)_localctx).ote = outros_termos();

				                    // verifica se tipos são compativeis
				                    if (((Outros_termosContext)_localctx).ote.tipoSimbolo.equals("NONE"))
				                      ((Outros_termosContext)_localctx).tipoSimbolo =  ((Outros_termosContext)_localctx).ter.tipoSimbolo;
				                    else
				                    {
				                      if (((Outros_termosContext)_localctx).ter.tipoSimbolo.equals(((Outros_termosContext)_localctx).ote.tipoSimbolo) || (((Outros_termosContext)_localctx).ter.tipoSimbolo.equals("inteiro") || ((Outros_termosContext)_localctx).ter.tipoSimbolo.equals("real")) && (((Outros_termosContext)_localctx).ote.tipoSimbolo.equals("real") || ((Outros_termosContext)_localctx).ote.tipoSimbolo.equals("inteiro")))
				                        ((Outros_termosContext)_localctx).tipoSimbolo =  ((Outros_termosContext)_localctx).ter.tipoSimbolo;
				                      else
				                        ((Outros_termosContext)_localctx).tipoSimbolo =  "incompativel";
				                    }  
				                  
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
		public String tipoSimbolo;
		public String simbolo;
		public ParcelaContext par;
		public Outras_parcelasContext outras_parcelas() {
			return getRuleContext(Outras_parcelasContext.class,0);
		}
		public ParcelaContext parcela() {
			return getRuleContext(ParcelaContext.class,0);
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
		((FatorContext)_localctx).tipoSimbolo = "NONE"; ((FatorContext)_localctx).simbolo = "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			((FatorContext)_localctx).par = parcela();
			setState(458);
			outras_parcelas();

			                  ((FatorContext)_localctx).tipoSimbolo =  ((FatorContext)_localctx).par.tipoSimbolo;
			                  ((FatorContext)_localctx).simbolo =  ((FatorContext)_localctx).par.simbolo;
			                
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
			setState(465);
			_la = _input.LA(1);
			if (_la==T__47 || _la==T__48) {
				{
				setState(461);
				op_multiplicacao();
				setState(462);
				fator();
				setState(463);
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
		public String tipoSimbolo;
		public String simbolo;
		public Parcela_unarioContext pun;
		public Parcela_nao_unarioContext pnn;
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
			setState(474);
			switch (_input.LA(1)) {
			case T__21:
			case T__42:
			case T__46:
			case IDENTIFICADOR:
			case INTEIRO:
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				op_unario();
				setState(468);
				((ParcelaContext)_localctx).pun = parcela_unario();

				                  ((ParcelaContext)_localctx).tipoSimbolo =  ((ParcelaContext)_localctx).pun.tipoSimbolo;
				                  ((ParcelaContext)_localctx).simbolo =  ((ParcelaContext)_localctx).pun.simbolo;
				                
				}
				break;
			case T__50:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				((ParcelaContext)_localctx).pnn = parcela_nao_unario();

				                  ((ParcelaContext)_localctx).tipoSimbolo =  ((ParcelaContext)_localctx).pnn.tipoSimbolo;
				                  ((ParcelaContext)_localctx).simbolo =  ((ParcelaContext)_localctx).pnn.simbolo;
				                
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
		public String simbolo;
		public int linha;
		public String tipoSimbolo;
		public Token ide1;
		public Outros_identContext oid;
		public Token ide2;
		public Chamada_partesContext cpa;
		public Token INTEIRO;
		public Token REAL;
		public ExpressaoContext exp;
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(LAParser.IDENTIFICADOR, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
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
		((Parcela_unarioContext)_localctx).tipoSimbolo = "NONE"; ((Parcela_unarioContext)_localctx).simbolo = ""; ((Parcela_unarioContext)_localctx).linha = -1;
		try {
			setState(495);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				match(T__42);
				setState(477);
				((Parcela_unarioContext)_localctx).ide1 = match(IDENTIFICADOR);
				setState(478);
				((Parcela_unarioContext)_localctx).oid = outros_ident();
				setState(479);
				dimensao();

				                    _localctx.simbolo += ((Parcela_unarioContext)_localctx).ide1.getText() + ((Parcela_unarioContext)_localctx).oid.simbolo;
				                    ((Parcela_unarioContext)_localctx).linha =  ((Parcela_unarioContext)_localctx).ide1.getLine();
				                   
				                    if(!pilhaDeTabelas.existeSimbolo(((Parcela_unarioContext)_localctx).ide1.getText() + ((Parcela_unarioContext)_localctx).oid.simbolo)) {
				                        erro += "Linha " + ((Parcela_unarioContext)_localctx).ide1.getLine() + ": identificador " + ((Parcela_unarioContext)_localctx).ide1.getText() + ((Parcela_unarioContext)_localctx).oid.simbolo + " nao declarado\n";
				                    }
				                    if(((Parcela_unarioContext)_localctx).oid.simbolo.equals("")) 
				                        ((Parcela_unarioContext)_localctx).tipoSimbolo =  pilhaDeTabelas.topo().getTipoSimbolo(_localctx.simbolo);
				                    else
				                        ((Parcela_unarioContext)_localctx).tipoSimbolo =  tabelaDeRegistros.getTipoSimbolo(((Parcela_unarioContext)_localctx).oid.simbolo.substring(1));
				                  
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				((Parcela_unarioContext)_localctx).ide2 = match(IDENTIFICADOR);
				setState(483);
				((Parcela_unarioContext)_localctx).cpa = chamada_partes(((Parcela_unarioContext)_localctx).ide2.getText());

				                    _localctx.simbolo += ((Parcela_unarioContext)_localctx).ide2.getText() + ((Parcela_unarioContext)_localctx).cpa.outrosIdentificadores;
				                    ((Parcela_unarioContext)_localctx).linha =  ((Parcela_unarioContext)_localctx).ide2.getLine();
				                    if (!pilhaDeTabelas.existeSimbolo(_localctx.simbolo)){ 
				                      erro += "Linha " + ((Parcela_unarioContext)_localctx).ide2.getLine() + ": identificador " + _localctx.simbolo + " nao declarado\n";
				                    
				                    } else
				                    {
				                      if (((Parcela_unarioContext)_localctx).cpa.tipoSimbolo.equals("NONE"))
				                        ((Parcela_unarioContext)_localctx).tipoSimbolo =  pilhaDeTabelas.topo().getTipoSimbolo(_localctx.simbolo);
				                      else
				                        ((Parcela_unarioContext)_localctx).tipoSimbolo =  ((Parcela_unarioContext)_localctx).cpa.tipoSimbolo;
				                    }
				                  
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				((Parcela_unarioContext)_localctx).INTEIRO = match(INTEIRO);

				                    ((Parcela_unarioContext)_localctx).tipoSimbolo =  "inteiro";
				                    ((Parcela_unarioContext)_localctx).simbolo =  ((Parcela_unarioContext)_localctx).INTEIRO.getText();
				                  
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(488);
				((Parcela_unarioContext)_localctx).REAL = match(REAL);

				                    ((Parcela_unarioContext)_localctx).tipoSimbolo =  "real";
				                    ((Parcela_unarioContext)_localctx).simbolo =  ((Parcela_unarioContext)_localctx).REAL.getText();
				                  
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(490);
				match(T__21);
				setState(491);
				((Parcela_unarioContext)_localctx).exp = expressao();
				setState(492);
				match(T__22);

				                    ((Parcela_unarioContext)_localctx).tipoSimbolo =  ((Parcela_unarioContext)_localctx).exp.tipoSimbolo;
				                  
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
		public String simbolo;
		public int linha;
		public String tipoSimbolo;
		public Token ide;
		public Outros_identContext oid;
		public Token CADEIA;
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(LAParser.IDENTIFICADOR, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
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
		((Parcela_nao_unarioContext)_localctx).simbolo = ""; ((Parcela_nao_unarioContext)_localctx).linha = -1; ((Parcela_nao_unarioContext)_localctx).tipoSimbolo = "NONE";
		try {
			setState(505);
			switch (_input.LA(1)) {
			case T__50:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				match(T__50);
				setState(498);
				((Parcela_nao_unarioContext)_localctx).ide = match(IDENTIFICADOR);
				setState(499);
				((Parcela_nao_unarioContext)_localctx).oid = outros_ident();

				                        _localctx.simbolo += ((Parcela_nao_unarioContext)_localctx).ide.getText() + ((Parcela_nao_unarioContext)_localctx).oid.simbolo;
				                        ((Parcela_nao_unarioContext)_localctx).linha =  ((Parcela_nao_unarioContext)_localctx).ide.getLine();
				                        ((Parcela_nao_unarioContext)_localctx).tipoSimbolo =  pilhaDeTabelas.getTipoSimbolo(_localctx.simbolo);
				                      
				setState(501);
				dimensao();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				((Parcela_nao_unarioContext)_localctx).CADEIA = match(CADEIA);

				                        ((Parcela_nao_unarioContext)_localctx).tipoSimbolo =  "literal";
				                        ((Parcela_nao_unarioContext)_localctx).simbolo =  ((Parcela_nao_unarioContext)_localctx).CADEIA.getText();
				                      
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
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__51) {
				{
				{
				setState(507);
				match(T__51);
				setState(508);
				parcela();
				}
				}
				setState(513);
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
		public String identificadorInicial;
		public String tipoSimbolo;
		public String outrosIdentificadores;
		public Outros_identContext oid;
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public Chamada_partesContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Chamada_partesContext(ParserRuleContext parent, int invokingState, String identificadorInicial) {
			super(parent, invokingState);
			this.identificadorInicial = identificadorInicial;
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

	public final Chamada_partesContext chamada_partes(String identificadorInicial) throws RecognitionException {
		Chamada_partesContext _localctx = new Chamada_partesContext(_ctx, getState(), identificadorInicial);
		enterRule(_localctx, 98, RULE_chamada_partes);
		((Chamada_partesContext)_localctx).tipoSimbolo = "NONE"; ((Chamada_partesContext)_localctx).outrosIdentificadores = "";
		try {
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				match(T__21);
				setState(515);
				expressao();
				setState(516);
				mais_expressao();
				setState(517);
				match(T__22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				((Chamada_partesContext)_localctx).oid = outros_ident();
				setState(520);
				dimensao();

				                    ((Chamada_partesContext)_localctx).outrosIdentificadores =  ((Chamada_partesContext)_localctx).oid.simbolo;
				                    ((Chamada_partesContext)_localctx).tipoSimbolo =  pilhaDeTabelas.topo().getTipoSimbolo(_localctx.identificadorInicial + ((Chamada_partesContext)_localctx).oid.simbolo);
				                  
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
		public String tipoSimbolo;
		public String simbolo;
		public Exp_aritmeticaContext ear;
		public Op_opcionalContext opp;
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
		((Exp_relacionalContext)_localctx).tipoSimbolo = "NONE"; ((Exp_relacionalContext)_localctx).simbolo = "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			((Exp_relacionalContext)_localctx).ear = exp_aritmetica();
			setState(527);
			((Exp_relacionalContext)_localctx).opp = op_opcional();

			                    ((Exp_relacionalContext)_localctx).simbolo =  ((Exp_relacionalContext)_localctx).ear.simbolo;
			                    if (((Exp_relacionalContext)_localctx).opp.tipoSimbolo.equals("NONE"))
			                      ((Exp_relacionalContext)_localctx).tipoSimbolo =  ((Exp_relacionalContext)_localctx).ear.tipoSimbolo;
			                    else
			                      ((Exp_relacionalContext)_localctx).tipoSimbolo =  ((Exp_relacionalContext)_localctx).opp.tipoSimbolo;
			                  
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
		public String tipoSimbolo;
		public Op_relacionalContext opr;
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
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
		((Op_opcionalContext)_localctx).tipoSimbolo = "NONE";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0)) {
				{
				setState(530);
				((Op_opcionalContext)_localctx).opr = op_relacional();
				setState(531);
				exp_aritmetica();

				                  ((Op_opcionalContext)_localctx).tipoSimbolo =  ((Op_opcionalContext)_localctx).opr.tipoSimbolo;
				                
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
		public String tipoSimbolo;
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
		((Op_relacionalContext)_localctx).tipoSimbolo = "NONE";
		try {
			setState(548);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				match(T__5);
				((Op_relacionalContext)_localctx).tipoSimbolo = "logico";
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				match(T__52);
				((Op_relacionalContext)_localctx).tipoSimbolo = "logico";
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 3);
				{
				setState(540);
				match(T__53);
				((Op_relacionalContext)_localctx).tipoSimbolo = "logico";
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 4);
				{
				setState(542);
				match(T__54);
				((Op_relacionalContext)_localctx).tipoSimbolo = "logico";
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 5);
				{
				setState(544);
				match(T__55);
				((Op_relacionalContext)_localctx).tipoSimbolo = "logico";
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 6);
				{
				setState(546);
				match(T__56);
				((Op_relacionalContext)_localctx).tipoSimbolo = "logico";
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

	public static class ExpressaoContext extends ParserRuleContext {
		public String tipoSimbolo;
		public String simbolo;
		public Termo_logicoContext tlo;
		public Outros_termos_logicosContext outros_termos_logicos() {
			return getRuleContext(Outros_termos_logicosContext.class,0);
		}
		public Termo_logicoContext termo_logico() {
			return getRuleContext(Termo_logicoContext.class,0);
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
		((ExpressaoContext)_localctx).tipoSimbolo = "NONE"; ((ExpressaoContext)_localctx).simbolo = "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			((ExpressaoContext)_localctx).tlo = termo_logico();
			setState(551);
			outros_termos_logicos();

			                  ((ExpressaoContext)_localctx).tipoSimbolo =  ((ExpressaoContext)_localctx).tlo.tipoSimbolo;
			                  ((ExpressaoContext)_localctx).simbolo =  ((ExpressaoContext)_localctx).tlo.simbolo;
			                
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
			setState(555);
			_la = _input.LA(1);
			if (_la==T__57) {
				{
				setState(554);
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
		public String tipoSimbolo;
		public String simbolo;
		public Fator_logicoContext flo;
		public Outros_fatores_logicosContext outros_fatores_logicos() {
			return getRuleContext(Outros_fatores_logicosContext.class,0);
		}
		public Fator_logicoContext fator_logico() {
			return getRuleContext(Fator_logicoContext.class,0);
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
		((Termo_logicoContext)_localctx).tipoSimbolo = "NONE"; ((Termo_logicoContext)_localctx).simbolo = "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			((Termo_logicoContext)_localctx).flo = fator_logico();
			setState(558);
			outros_fatores_logicos();

			                  ((Termo_logicoContext)_localctx).tipoSimbolo =  ((Termo_logicoContext)_localctx).flo.tipoSimbolo;
			                  ((Termo_logicoContext)_localctx).simbolo =  ((Termo_logicoContext)_localctx).flo.simbolo;
			                
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
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__58) {
				{
				{
				setState(561);
				match(T__58);
				setState(562);
				termo_logico();
				}
				}
				setState(567);
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
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__59) {
				{
				{
				setState(568);
				match(T__59);
				setState(569);
				fator_logico();
				}
				}
				setState(574);
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
		public String tipoSimbolo;
		public String simbolo;
		public Parcela_logicaContext plo;
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
		((Fator_logicoContext)_localctx).tipoSimbolo = "NONE"; ((Fator_logicoContext)_localctx).simbolo = "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			op_nao();
			setState(576);
			((Fator_logicoContext)_localctx).plo = parcela_logica();

			                  ((Fator_logicoContext)_localctx).tipoSimbolo =  ((Fator_logicoContext)_localctx).plo.tipoSimbolo;
			                  ((Fator_logicoContext)_localctx).simbolo =  ((Fator_logicoContext)_localctx).plo.simbolo;
			                
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
		public String tipoSimbolo;
		public String simbolo;
		public Exp_relacionalContext ere;
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
		((Parcela_logicaContext)_localctx).tipoSimbolo = "NONE"; ((Parcela_logicaContext)_localctx).simbolo = "";
		try {
			setState(586);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				match(T__16);
				((Parcela_logicaContext)_localctx).tipoSimbolo =  "logico";
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				match(T__17);
				((Parcela_logicaContext)_localctx).tipoSimbolo =  "logico";
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
				setState(583);
				((Parcela_logicaContext)_localctx).ere = exp_relacional();

				                    ((Parcela_logicaContext)_localctx).tipoSimbolo =  ((Parcela_logicaContext)_localctx).ere.tipoSimbolo;
				                    ((Parcela_logicaContext)_localctx).simbolo =  ((Parcela_logicaContext)_localctx).ere.simbolo;
				                  
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3F\u024f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\7\3\u0083\n\3\f\3\16\3\u0086\13\3\3\4"+
		"\3\4\5\4\u008a\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5\u009e\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\7\7\u00ab\n\7\f\7\16\7\u00ae\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\7\t\u00b7\n\t\f\t\16\t\u00ba\13\t\3\n\3\n\3\n\3\n\5\n\u00c0\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u00c8\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u00d0\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00d7\n\r\3\16\3\16\3\16\3\16\5\16"+
		"\u00dd\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e7\n\17\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u00ee\n\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0116\n\24\3\25\5\25\u0119\n\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\5\27\u0124\n\27\3\30\3\30\5\30\u0128"+
		"\n\30\3\31\3\31\3\31\5\31\u012d\n\31\3\32\3\32\3\32\3\33\7\33\u0133\n"+
		"\33\f\33\16\33\u0136\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u017f\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u0186\n\35\3\36\3\36\5\36\u018a\n\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\5\37\u0196\n\37\3 \3 \3 \5 \u019b\n \3!\3!\3!"+
		"\3!\3!\3\"\5\"\u01a3\n\"\3#\3#\3#\3$\3$\5$\u01aa\n$\3%\3%\3%\3%\3&\3&"+
		"\3&\3&\5&\u01b4\n&\3\'\5\'\u01b7\n\'\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3+"+
		"\3+\3,\3,\3,\3,\3,\5,\u01ca\n,\3-\3-\3-\3-\3.\3.\3.\3.\5.\u01d4\n.\3/"+
		"\3/\3/\3/\3/\3/\3/\5/\u01dd\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u01f2\n\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u01fc\n\61\3\62\3\62\7\62"+
		"\u0200\n\62\f\62\16\62\u0203\13\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\5\63\u020f\n\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\5\65\u0219\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\5\66\u0227\n\66\3\67\3\67\3\67\3\67\38\58\u022e\n8\39\39\39\39\3"+
		":\3:\7:\u0236\n:\f:\16:\u0239\13:\3;\3;\7;\u023d\n;\f;\16;\u0240\13;\3"+
		"<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\5=\u024d\n=\3=\2\2>\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvx\2\5\4\2\23\24@B\3\2\62\63\4\2\61\61\64\64\u024e\2z\3\2\2\2\4\u0084"+
		"\3\2\2\2\6\u0089\3\2\2\2\b\u009d\3\2\2\2\n\u009f\3\2\2\2\f\u00ac\3\2\2"+
		"\2\16\u00af\3\2\2\2\20\u00b8\3\2\2\2\22\u00bf\3\2\2\2\24\u00c7\3\2\2\2"+
		"\26\u00cf\3\2\2\2\30\u00d6\3\2\2\2\32\u00dc\3\2\2\2\34\u00e6\3\2\2\2\36"+
		"\u00ed\3\2\2\2 \u00ef\3\2\2\2\"\u00f3\3\2\2\2$\u00f5\3\2\2\2&\u0115\3"+
		"\2\2\2(\u0118\3\2\2\2*\u011a\3\2\2\2,\u0123\3\2\2\2.\u0127\3\2\2\2\60"+
		"\u012c\3\2\2\2\62\u012e\3\2\2\2\64\u0134\3\2\2\2\66\u017e\3\2\2\28\u0185"+
		"\3\2\2\2:\u0189\3\2\2\2<\u0195\3\2\2\2>\u019a\3\2\2\2@\u019c\3\2\2\2B"+
		"\u01a2\3\2\2\2D\u01a4\3\2\2\2F\u01a9\3\2\2\2H\u01ab\3\2\2\2J\u01b3\3\2"+
		"\2\2L\u01b6\3\2\2\2N\u01b8\3\2\2\2P\u01bc\3\2\2\2R\u01be\3\2\2\2T\u01c0"+
		"\3\2\2\2V\u01c9\3\2\2\2X\u01cb\3\2\2\2Z\u01d3\3\2\2\2\\\u01dc\3\2\2\2"+
		"^\u01f1\3\2\2\2`\u01fb\3\2\2\2b\u0201\3\2\2\2d\u020e\3\2\2\2f\u0210\3"+
		"\2\2\2h\u0218\3\2\2\2j\u0226\3\2\2\2l\u0228\3\2\2\2n\u022d\3\2\2\2p\u022f"+
		"\3\2\2\2r\u0237\3\2\2\2t\u023e\3\2\2\2v\u0241\3\2\2\2x\u024c\3\2\2\2z"+
		"{\b\2\1\2{|\5\4\3\2|}\7\3\2\2}~\5\62\32\2~\177\7\4\2\2\177\u0080\b\2\1"+
		"\2\u0080\3\3\2\2\2\u0081\u0083\5\6\4\2\u0082\u0081\3\2\2\2\u0083\u0086"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\5\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u008a\5\b\5\2\u0088\u008a\5&\24\2\u0089\u0087\3\2"+
		"\2\2\u0089\u0088\3\2\2\2\u008a\7\3\2\2\2\u008b\u008c\7\5\2\2\u008c\u008d"+
		"\5\n\6\2\u008d\u008e\b\5\1\2\u008e\u009e\3\2\2\2\u008f\u0090\7\6\2\2\u0090"+
		"\u0091\7?\2\2\u0091\u0092\7\7\2\2\u0092\u0093\5\34\17\2\u0093\u0094\7"+
		"\b\2\2\u0094\u0095\5\"\22\2\u0095\u0096\b\5\1\2\u0096\u009e\3\2\2\2\u0097"+
		"\u0098\7\t\2\2\u0098\u0099\7?\2\2\u0099\u009a\7\7\2\2\u009a\u009b\5\26"+
		"\f\2\u009b\u009c\b\5\1\2\u009c\u009e\3\2\2\2\u009d\u008b\3\2\2\2\u009d"+
		"\u008f\3\2\2\2\u009d\u0097\3\2\2\2\u009e\t\3\2\2\2\u009f\u00a0\7?\2\2"+
		"\u00a0\u00a1\5\24\13\2\u00a1\u00a2\5\f\7\2\u00a2\u00a3\7\7\2\2\u00a3\u00a4"+
		"\5\26\f\2\u00a4\u00a5\b\6\1\2\u00a5\13\3\2\2\2\u00a6\u00a7\7\n\2\2\u00a7"+
		"\u00a8\7?\2\2\u00a8\u00a9\b\7\1\2\u00a9\u00ab\5\24\13\2\u00aa\u00a6\3"+
		"\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\r\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\5\20\t\2\u00b0\u00b1\7?\2\2"+
		"\u00b1\u00b2\5\24\13\2\u00b2\u00b3\5\22\n\2\u00b3\u00b4\b\b\1\2\u00b4"+
		"\17\3\2\2\2\u00b5\u00b7\7\13\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2"+
		"\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\21\3\2\2\2\u00ba\u00b8"+
		"\3\2\2\2\u00bb\u00bc\7\f\2\2\u00bc\u00bd\5\16\b\2\u00bd\u00be\b\n\1\2"+
		"\u00be\u00c0\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\23"+
		"\3\2\2\2\u00c1\u00c2\7\r\2\2\u00c2\u00c3\5N(\2\u00c3\u00c4\7\16\2\2\u00c4"+
		"\u00c5\5\24\13\2\u00c5\u00c6\b\13\1\2\u00c6\u00c8\3\2\2\2\u00c7\u00c1"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\25\3\2\2\2\u00c9\u00ca\5$\23\2\u00ca"+
		"\u00cb\b\f\1\2\u00cb\u00d0\3\2\2\2\u00cc\u00cd\5 \21\2\u00cd\u00ce\b\f"+
		"\1\2\u00ce\u00d0\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00cc\3\2\2\2\u00d0"+
		"\27\3\2\2\2\u00d1\u00d2\7\n\2\2\u00d2\u00d3\5\16\b\2\u00d3\u00d4\5\30"+
		"\r\2\u00d4\u00d5\b\r\1\2\u00d5\u00d7\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\31\3\2\2\2\u00d8\u00d9\5\n\6\2\u00d9\u00da\5\32\16"+
		"\2\u00da\u00db\b\16\1\2\u00db\u00dd\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\33\3\2\2\2\u00de\u00df\7\17\2\2\u00df\u00e7\b\17"+
		"\1\2\u00e0\u00e1\7\20\2\2\u00e1\u00e7\b\17\1\2\u00e2\u00e3\7\21\2\2\u00e3"+
		"\u00e7\b\17\1\2\u00e4\u00e5\7\22\2\2\u00e5\u00e7\b\17\1\2\u00e6\u00de"+
		"\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\35\3\2\2\2\u00e8\u00e9\5\34\17\2\u00e9\u00ea\b\20\1\2\u00ea\u00ee\3\2"+
		"\2\2\u00eb\u00ec\7?\2\2\u00ec\u00ee\b\20\1\2\u00ed\u00e8\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\37\3\2\2\2\u00ef\u00f0\5\20\t\2\u00f0\u00f1\5\36"+
		"\20\2\u00f1\u00f2\b\21\1\2\u00f2!\3\2\2\2\u00f3\u00f4\t\2\2\2\u00f4#\3"+
		"\2\2\2\u00f5\u00f6\7\25\2\2\u00f6\u00f7\b\23\1\2\u00f7\u00f8\5\n\6\2\u00f8"+
		"\u00f9\5\32\16\2\u00f9\u00fa\b\23\1\2\u00fa\u00fb\7\26\2\2\u00fb\u00fc"+
		"\b\23\1\2\u00fc%\3\2\2\2\u00fd\u00fe\7\27\2\2\u00fe\u00ff\7?\2\2\u00ff"+
		"\u0100\b\24\1\2\u0100\u0101\7\30\2\2\u0101\u0102\5(\25\2\u0102\u0103\7"+
		"\31\2\2\u0103\u0104\5\60\31\2\u0104\u0105\5\64\33\2\u0105\u0106\7\32\2"+
		"\2\u0106\u0107\b\24\1\2\u0107\u0116\3\2\2\2\u0108\u0109\7\33\2\2\u0109"+
		"\u010a\7?\2\2\u010a\u010b\b\24\1\2\u010b\u010c\7\30\2\2\u010c\u010d\5"+
		"(\25\2\u010d\u010e\7\31\2\2\u010e\u010f\7\7\2\2\u010f\u0110\5 \21\2\u0110"+
		"\u0111\5\60\31\2\u0111\u0112\5\64\33\2\u0112\u0113\7\34\2\2\u0113\u0114"+
		"\b\24\1\2\u0114\u0116\3\2\2\2\u0115\u00fd\3\2\2\2\u0115\u0108\3\2\2\2"+
		"\u0116\'\3\2\2\2\u0117\u0119\5*\26\2\u0118\u0117\3\2\2\2\u0118\u0119\3"+
		"\2\2\2\u0119)\3\2\2\2\u011a\u011b\5,\27\2\u011b\u011c\5\16\b\2\u011c\u011d"+
		"\5\30\r\2\u011d\u011e\7\7\2\2\u011e\u011f\5 \21\2\u011f\u0120\5.\30\2"+
		"\u0120\u0121\b\26\1\2\u0121+\3\2\2\2\u0122\u0124\7\35\2\2\u0123\u0122"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124-\3\2\2\2\u0125\u0126\7\n\2\2\u0126"+
		"\u0128\5*\26\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128/\3\2\2\2"+
		"\u0129\u012a\5\b\5\2\u012a\u012b\5\60\31\2\u012b\u012d\3\2\2\2\u012c\u0129"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d\61\3\2\2\2\u012e\u012f\5\60\31\2\u012f"+
		"\u0130\5\64\33\2\u0130\63\3\2\2\2\u0131\u0133\5\66\34\2\u0132\u0131\3"+
		"\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\65\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\7\36\2\2\u0138\u0139\7\30"+
		"\2\2\u0139\u013a\5\16\b\2\u013a\u013b\5\30\r\2\u013b\u013c\b\34\1\2\u013c"+
		"\u013d\7\31\2\2\u013d\u013e\b\34\1\2\u013e\u017f\3\2\2\2\u013f\u0140\7"+
		"\37\2\2\u0140\u0141\7\30\2\2\u0141\u0142\5l\67\2\u0142\u0143\58\35\2\u0143"+
		"\u0144\7\31\2\2\u0144\u0145\b\34\1\2\u0145\u017f\3\2\2\2\u0146\u0147\7"+
		" \2\2\u0147\u0148\5l\67\2\u0148\u0149\7!\2\2\u0149\u014a\5\64\33\2\u014a"+
		"\u014b\5:\36\2\u014b\u014c\7\"\2\2\u014c\u014d\b\34\1\2\u014d\u017f\3"+
		"\2\2\2\u014e\u014f\7#\2\2\u014f\u0150\5N(\2\u0150\u0151\7$\2\2\u0151\u0152"+
		"\5@!\2\u0152\u0153\5:\36\2\u0153\u0154\7%\2\2\u0154\u0155\b\34\1\2\u0155"+
		"\u017f\3\2\2\2\u0156\u0157\7&\2\2\u0157\u0158\7?\2\2\u0158\u0159\7\'\2"+
		"\2\u0159\u015a\5N(\2\u015a\u015b\7(\2\2\u015b\u015c\5N(\2\u015c\u015d"+
		"\7)\2\2\u015d\u015e\5\64\33\2\u015e\u015f\7*\2\2\u015f\u0160\b\34\1\2"+
		"\u0160\u017f\3\2\2\2\u0161\u0162\7+\2\2\u0162\u0163\5l\67\2\u0163\u0164"+
		"\7)\2\2\u0164\u0165\5\64\33\2\u0165\u0166\7,\2\2\u0166\u0167\b\34\1\2"+
		"\u0167\u017f\3\2\2\2\u0168\u0169\7)\2\2\u0169\u016a\5\64\33\2\u016a\u016b"+
		"\7(\2\2\u016b\u016c\5l\67\2\u016c\u016d\b\34\1\2\u016d\u017f\3\2\2\2\u016e"+
		"\u016f\7-\2\2\u016f\u0170\7?\2\2\u0170\u0171\5\22\n\2\u0171\u0172\5\24"+
		"\13\2\u0172\u0173\7\'\2\2\u0173\u0174\5l\67\2\u0174\u0175\b\34\1\2\u0175"+
		"\u017f\3\2\2\2\u0176\u0177\7?\2\2\u0177\u0178\5<\37\2\u0178\u0179\b\34"+
		"\1\2\u0179\u017f\3\2\2\2\u017a\u017b\7.\2\2\u017b\u017c\5l\67\2\u017c"+
		"\u017d\b\34\1\2\u017d\u017f\3\2\2\2\u017e\u0137\3\2\2\2\u017e\u013f\3"+
		"\2\2\2\u017e\u0146\3\2\2\2\u017e\u014e\3\2\2\2\u017e\u0156\3\2\2\2\u017e"+
		"\u0161\3\2\2\2\u017e\u0168\3\2\2\2\u017e\u016e\3\2\2\2\u017e\u0176\3\2"+
		"\2\2\u017e\u017a\3\2\2\2\u017f\67\3\2\2\2\u0180\u0181\7\n\2\2\u0181\u0182"+
		"\5l\67\2\u0182\u0183\58\35\2\u0183\u0184\b\35\1\2\u0184\u0186\3\2\2\2"+
		"\u0185\u0180\3\2\2\2\u0185\u0186\3\2\2\2\u01869\3\2\2\2\u0187\u0188\7"+
		"/\2\2\u0188\u018a\5\64\33\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		";\3\2\2\2\u018b\u018c\7\30\2\2\u018c\u018d\5> \2\u018d\u018e\7\31\2\2"+
		"\u018e\u0196\3\2\2\2\u018f\u0190\5\22\n\2\u0190\u0191\5\24\13\2\u0191"+
		"\u0192\7\'\2\2\u0192\u0193\5l\67\2\u0193\u0194\b\37\1\2\u0194\u0196\3"+
		"\2\2\2\u0195\u018b\3\2\2\2\u0195\u018f\3\2\2\2\u0196=\3\2\2\2\u0197\u0198"+
		"\5l\67\2\u0198\u0199\58\35\2\u0199\u019b\3\2\2\2\u019a\u0197\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b?\3\2\2\2\u019c\u019d\5D#\2\u019d\u019e\7\7\2\2\u019e"+
		"\u019f\5\64\33\2\u019f\u01a0\5B\"\2\u01a0A\3\2\2\2\u01a1\u01a3\5@!\2\u01a2"+
		"\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3C\3\2\2\2\u01a4\u01a5\5H%\2\u01a5"+
		"\u01a6\5F$\2\u01a6E\3\2\2\2\u01a7\u01a8\7\n\2\2\u01a8\u01aa\5D#\2\u01a9"+
		"\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aaG\3\2\2\2\u01ab\u01ac\5L\'\2\u01ac"+
		"\u01ad\7@\2\2\u01ad\u01ae\5J&\2\u01aeI\3\2\2\2\u01af\u01b0\7\60\2\2\u01b0"+
		"\u01b1\5L\'\2\u01b1\u01b2\7@\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01af\3\2\2"+
		"\2\u01b3\u01b4\3\2\2\2\u01b4K\3\2\2\2\u01b5\u01b7\7\61\2\2\u01b6\u01b5"+
		"\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7M\3\2\2\2\u01b8\u01b9\5T+\2\u01b9\u01ba"+
		"\5V,\2\u01ba\u01bb\b(\1\2\u01bbO\3\2\2\2\u01bc\u01bd\t\3\2\2\u01bdQ\3"+
		"\2\2\2\u01be\u01bf\t\4\2\2\u01bfS\3\2\2\2\u01c0\u01c1\5X-\2\u01c1\u01c2"+
		"\5Z.\2\u01c2\u01c3\b+\1\2\u01c3U\3\2\2\2\u01c4\u01c5\5R*\2\u01c5\u01c6"+
		"\5T+\2\u01c6\u01c7\5V,\2\u01c7\u01c8\b,\1\2\u01c8\u01ca\3\2\2\2\u01c9"+
		"\u01c4\3\2\2\2\u01c9\u01ca\3\2\2\2\u01caW\3\2\2\2\u01cb\u01cc\5\\/\2\u01cc"+
		"\u01cd\5b\62\2\u01cd\u01ce\b-\1\2\u01ceY\3\2\2\2\u01cf\u01d0\5P)\2\u01d0"+
		"\u01d1\5X-\2\u01d1\u01d2\5Z.\2\u01d2\u01d4\3\2\2\2\u01d3\u01cf\3\2\2\2"+
		"\u01d3\u01d4\3\2\2\2\u01d4[\3\2\2\2\u01d5\u01d6\5L\'\2\u01d6\u01d7\5^"+
		"\60\2\u01d7\u01d8\b/\1\2\u01d8\u01dd\3\2\2\2\u01d9\u01da\5`\61\2\u01da"+
		"\u01db\b/\1\2\u01db\u01dd\3\2\2\2\u01dc\u01d5\3\2\2\2\u01dc\u01d9\3\2"+
		"\2\2\u01dd]\3\2\2\2\u01de\u01df\7-\2\2\u01df\u01e0\7?\2\2\u01e0\u01e1"+
		"\5\22\n\2\u01e1\u01e2\5\24\13\2\u01e2\u01e3\b\60\1\2\u01e3\u01f2\3\2\2"+
		"\2\u01e4\u01e5\7?\2\2\u01e5\u01e6\5d\63\2\u01e6\u01e7\b\60\1\2\u01e7\u01f2"+
		"\3\2\2\2\u01e8\u01e9\7@\2\2\u01e9\u01f2\b\60\1\2\u01ea\u01eb\7A\2\2\u01eb"+
		"\u01f2\b\60\1\2\u01ec\u01ed\7\30\2\2\u01ed\u01ee\5l\67\2\u01ee\u01ef\7"+
		"\31\2\2\u01ef\u01f0\b\60\1\2\u01f0\u01f2\3\2\2\2\u01f1\u01de\3\2\2\2\u01f1"+
		"\u01e4\3\2\2\2\u01f1\u01e8\3\2\2\2\u01f1\u01ea\3\2\2\2\u01f1\u01ec\3\2"+
		"\2\2\u01f2_\3\2\2\2\u01f3\u01f4\7\65\2\2\u01f4\u01f5\7?\2\2\u01f5\u01f6"+
		"\5\22\n\2\u01f6\u01f7\b\61\1\2\u01f7\u01f8\5\24\13\2\u01f8\u01fc\3\2\2"+
		"\2\u01f9\u01fa\7B\2\2\u01fa\u01fc\b\61\1\2\u01fb\u01f3\3\2\2\2\u01fb\u01f9"+
		"\3\2\2\2\u01fca\3\2\2\2\u01fd\u01fe\7\66\2\2\u01fe\u0200\5\\/\2\u01ff"+
		"\u01fd\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2"+
		"\2\2\u0202c\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0205\7\30\2\2\u0205\u0206"+
		"\5l\67\2\u0206\u0207\58\35\2\u0207\u0208\7\31\2\2\u0208\u020f\3\2\2\2"+
		"\u0209\u020a\5\22\n\2\u020a\u020b\5\24\13\2\u020b\u020c\b\63\1\2\u020c"+
		"\u020f\3\2\2\2\u020d\u020f\3\2\2\2\u020e\u0204\3\2\2\2\u020e\u0209\3\2"+
		"\2\2\u020e\u020d\3\2\2\2\u020fe\3\2\2\2\u0210\u0211\5N(\2\u0211\u0212"+
		"\5h\65\2\u0212\u0213\b\64\1\2\u0213g\3\2\2\2\u0214\u0215\5j\66\2\u0215"+
		"\u0216\5N(\2\u0216\u0217\b\65\1\2\u0217\u0219\3\2\2\2\u0218\u0214\3\2"+
		"\2\2\u0218\u0219\3\2\2\2\u0219i\3\2\2\2\u021a\u021b\7\b\2\2\u021b\u0227"+
		"\b\66\1\2\u021c\u021d\7\67\2\2\u021d\u0227\b\66\1\2\u021e\u021f\78\2\2"+
		"\u021f\u0227\b\66\1\2\u0220\u0221\79\2\2\u0221\u0227\b\66\1\2\u0222\u0223"+
		"\7:\2\2\u0223\u0227\b\66\1\2\u0224\u0225\7;\2\2\u0225\u0227\b\66\1\2\u0226"+
		"\u021a\3\2\2\2\u0226\u021c\3\2\2\2\u0226\u021e\3\2\2\2\u0226\u0220\3\2"+
		"\2\2\u0226\u0222\3\2\2\2\u0226\u0224\3\2\2\2\u0227k\3\2\2\2\u0228\u0229"+
		"\5p9\2\u0229\u022a\5r:\2\u022a\u022b\b\67\1\2\u022bm\3\2\2\2\u022c\u022e"+
		"\7<\2\2\u022d\u022c\3\2\2\2\u022d\u022e\3\2\2\2\u022eo\3\2\2\2\u022f\u0230"+
		"\5v<\2\u0230\u0231\5t;\2\u0231\u0232\b9\1\2\u0232q\3\2\2\2\u0233\u0234"+
		"\7=\2\2\u0234\u0236\5p9\2\u0235\u0233\3\2\2\2\u0236\u0239\3\2\2\2\u0237"+
		"\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238s\3\2\2\2\u0239\u0237\3\2\2\2"+
		"\u023a\u023b\7>\2\2\u023b\u023d\5v<\2\u023c\u023a\3\2\2\2\u023d\u0240"+
		"\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023fu\3\2\2\2\u0240"+
		"\u023e\3\2\2\2\u0241\u0242\5n8\2\u0242\u0243\5x=\2\u0243\u0244\b<\1\2"+
		"\u0244w\3\2\2\2\u0245\u0246\7\23\2\2\u0246\u024d\b=\1\2\u0247\u0248\7"+
		"\24\2\2\u0248\u024d\b=\1\2\u0249\u024a\5f\64\2\u024a\u024b\b=\1\2\u024b"+
		"\u024d\3\2\2\2\u024c\u0245\3\2\2\2\u024c\u0247\3\2\2\2\u024c\u0249\3\2"+
		"\2\2\u024dy\3\2\2\2*\u0084\u0089\u009d\u00ac\u00b8\u00bf\u00c7\u00cf\u00d6"+
		"\u00dc\u00e6\u00ed\u0115\u0118\u0123\u0127\u012c\u0134\u017e\u0185\u0189"+
		"\u0195\u019a\u01a2\u01a9\u01b3\u01b6\u01c9\u01d3\u01dc\u01f1\u01fb\u0201"+
		"\u020e\u0218\u0226\u022d\u0237\u023e\u024c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}