grammar LA;

@members{
static String grupo = "<551554, 551872, 551805, 551724>"; 

    private void stop(String a){
        throw new ParseCancellationException(a);
    }

    private void erroSemantico(String a){
        outSemantico.println(a);
    }

    PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();

    Saida outSemantico = new Saida();
}

/******************* LEXICO *********************/

IDENTIFICADOR : ('a'..'z' | 'A'..'Z' | '_')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*
              ;

INTEIRO       : ('0'..'9')+
              ;
REAL          : ('0'..'9')+ '.' ('0'..'9')+
              ;

CADEIA        : '"' (~('"'))* '"'
              ;

COMENTARIO    : '{' ~('{' | '}')* '}' { skip(); }
              ;

ESPACOS       : (' ' | '\t' | '\r' | '\n') {  skip(); } 
              ;

NAO_COMENTARIO: '{' ~('\r' | '\n' | '}')* '\n'
                { stop("Linha " + getLine() + ": comentario nao fechado"); }
              ;
ERRO          : . { stop("Linha " + getLine() + ": " + getText() + " - simbolo nao identificado"); }
              ;

/******************* SINTATICO ********************/

programa      : declaracoes 'algoritmo' corpo 'fim_algoritmo'
              ;

declaracoes   : (decl_local_global)*
              ;

decl_local_global
              : declaracao_local  | declaracao_global
              ;

declaracao_local
              : 'declare' variavel | 'constante' IDENTIFICADOR ':' tipo_basico '=' valor_constante
              | 'tipo' IDENTIFICADOR ':' tipo
              ;

variavel      : IDENTIFICADOR dimensao mais_var ':' tipo
              ;

mais_var      : (',' IDENTIFICADOR dimensao mais_var)?
              ;

identificador : ponteiros_opcionais IDENTIFICADOR dimensao outros_ident
              ;

ponteiros_opcionais
              : ('^')*
              ; 

outros_ident  : ('.' identificador)?
              ;

dimensao      : ('[' exp_aritmetica ']' dimensao)?
              ;

tipo          : registro | tipo_estendido
              ;

mais_ident    : (',' identificador mais_ident)?
              ;

mais_variaveis: (variavel mais_variaveis)?
              ;

tipo_basico   : 'literal' | 'inteiro' | 'real' | 'logico'
              ;

tipo_basico_ident
              : tipo_basico | IDENTIFICADOR
              ;

tipo_estendido: ponteiros_opcionais tipo_basico_ident
              ;

valor_constante
              : CADEIA | INTEIRO | REAL | 'verdadeiro' | 'falso'
              ;

registro      : 'registro' variavel mais_variaveis 'fim_registro'
              ;

declaracao_global
              : 'procedimento' IDENTIFICADOR '(' parametros_opicional ')' declaracoes_locais comandos 'fim_procedimento'
              | 'funcao' IDENTIFICADOR '(' parametros_opicional ')' ':' tipo_estendido declaracoes_locais comandos 'fim_funcao'
              ;

parametros_opicional
              : (parametro)?
              ;

parametro     : var_opcional identificador mais_ident ':' tipo_estendido mais_parametros
              ;

var_opcional  : ('var')?
              ;

mais_parametros
              : (',' parametro)?
              ;

declaracoes_locais
              : (declaracao_local declaracoes_locais)?
              ;

corpo         : declaracoes_locais comandos
              ;

comandos      : (cmd)*
              ;

cmd           : 'leia' '(' identificador mais_ident ')'
              | 'escreva' '(' expressao mais_expressao ')'
              | 'se' expressao 'entao' comandos senao_opcional 'fim_se'
              | 'caso' exp_aritmetica 'seja' selecao senao_opcional 'fim_caso'
              | 'para' IDENTIFICADOR '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' comandos 'fim-para'
              | 'enquanto' expressao 'faca' comandos 'fim_enquanto'
              | 'faca' comandos 'ate' expressao
              | 'ˆ' IDENTIFICADOR outros_ident dimensao '<-' expressao
              | IDENTIFICADOR chamada_atribuicao
              | 'retorne' expressao
              ;

mais_expressao: (',' expressao mais_expressao)?
              ;

senao_opcional: ('senao' comandos)?
              ;

chamada_atribuicao
              : '('argumentos_opcional ')' | outros_ident dimensao '<-' expressao
              ;

argumentos_opcional
              : (expressao mais_expressao)?
              ;

selecao       : constantes ':' comandos mais_selecao
              ;

mais_selecao  : (selecao)?
              ;

constantes    : numero_intervalo mais_contantes
              ;

mais_contantes: (',' constantes)?
              ;

numero_intervalo
              : op_unario INTEIRO intervalo_opcional
              ;

intervalo_opcional
              : ('..' op_unario INTEIRO)?
              ;

op_unario     : ('-')?
              ;

exp_aritmetica: termo outros_termos
              ;

op_multiplicacao
              : '*' | '/'
              ;

op_adicao     : '+' | '-'
              ;

termo         : fator outros_fatores
              ;

outros_termos : (op_adicao termo outros_termos)?
              ;

fator         : parcela outras_parcelas
              ;

outros_fatores: (op_multiplicacao fator outros_fatores)?
              ;

parcela       : op_unario parcela_unario | parcela_nao_unario
              ;

parcela_unario: 'ˆ' IDENTIFICADOR outros_ident dimensao 
              | IDENTIFICADOR chamada_partes | INTEIRO | REAL 
              | '(' expressao ')'
              ;

parcela_nao_unario
              : '&' IDENTIFICADOR outros_ident dimensao
              | CADEIA
              ;

outras_parcelas
              : ('%' parcela)*
              ;

chamada_partes: '(' expressao mais_expressao ')' | outros_ident dimensao  |
              ;

exp_relacional: exp_aritmetica op_opcional
              ;

op_opcional   : (op_relacional exp_aritmetica)?
              ;

op_relacional : '=' | '<>' | '>=' | '<=' | '>' | '<'
              ;

expressao     : termo_logico outros_termos_logicos
              ;

op_nao        : ('nao')?
              ;

termo_logico  : fator_logico outros_fatores_logicos
              ;

outros_termos_logicos
              : ('ou' termo_logico)*
              ;

outros_fatores_logicos
              : ('e' fator_logico)*
              ;

fator_logico  : op_nao parcela_logica
              ;

parcela_logica: 'verdadeiro' | 'falso' | exp_relacional
              ;             