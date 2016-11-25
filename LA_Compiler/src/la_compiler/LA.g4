grammar LA;

@members {
  static String grupo = "<551554, 551872, 551805, 551724>"; 

    private void stop(String a) {
        throw new ParseCancellationException(a);
    }

    PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
    PilhaDeTabelas tabelaDeRegistros = new PilhaDeTabelas();
    TabelaDeSimbolos tabelaDeTipos = new TabelaDeSimbolos("tipos");
    String erro = "";
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

/******************* SINTATICO E SEMÂNTICO ********************/

programa      : 
              {
                // tabela de símbolos global e tipos padrão da linguaguem
                pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global"));
                tabelaDeTipos.adicionarSimbolo("inteiro", "inteiro");
                tabelaDeTipos.adicionarSimbolo("real", "real");
                tabelaDeTipos.adicionarSimbolo("literal", "literal");
                tabelaDeTipos.adicionarSimbolo("logico", "logico");
              }

              declaracoes 'algoritmo' corpo 'fim_algoritmo'

              {
                // desempilha a tabela global
                pilhaDeTabelas.desempilha();
                // caso o erro não esteja vazio, significa que a semântica não está correta
                // "erro" terá informações sobre o erro
                if (erro != "") throw new RuntimeException(erro);
              }
              ;

declaracoes   : (decl_local_global)*
              ;

decl_local_global
              : declaracao_local  | declaracao_global
              ;

declaracao_local
              : 'declare' variavel 
              {
                for (String s: $variavel.nomes) {
                  if (pilhaDeTabelas.topo().existeSimbolos(s))
                    // necessário verificar se a variável ja foi declarada antes
                    erro += "Linha " + $variavel.linha + ": identificador  "+ s +" ja declarado anteriormente\n";
                  else{
                    // verifica se a variável é de um tipo válido. Caso for válido adicionamos ela na tabela de símbolos do escopo atual
                    if (TabelaDeTipos.existeSimbolos($variavel.tipoSimbolo)) {
                      pilhaDeTabelas.topo().adicionarSimbolo(s, $variavel.tipoSimbolo);
                      if (TabelasDeRegistros.existeTabela($variavel.tipoSimbolo)!=null) {
                        // caso o tipo da variável for um registro, declaramos os componentes desse tipo na variável
                        TabelaDeSimbolos tabelaRegistro = TabelasDeRegistros.existeTabela($variavel.tipoSimbolo);
                        for (EntradaTabelaDeSimbolos t: tabelaRegistro.getSimbolos()){
                          pilhaDeTabelas.topo().adicionarSimbolo(s+"."+t.getNome(), t.getTipo());
                        }
                      } else{
                        // se o tipo não for identificado pode ser que ele tenha ido declarado como um registro
                        // Ex: tipo: <registro> | <tipo_extendido>
                        if (TabelasDeRegistros.existeTabela("registro")!=null){
                          TabelaDeSimbolos tabelaRegistro = TabelasDeRegistros.existeTabela("registro");
                          for (EntradaTabelaDeSimbolos t: tabelaRegistro.getSimbolos()){
                            pilhaDeTabelas.topo().adicionarSimbolo(s+"."+t.getNome(), t.getTipo());
                          }
                        }
                      }
                    } else{
                      // caso o tipo não tenha sido identificado, a variável erro identifica como "tipo não declarado"
                      erro = += "Linha " + $variavel.linha + ": tipo " + $variavel.tipoSimbolo + "nao declarado \n";
                      pilhaDeTabelas.topo().adicionarSimbolo(s, $variavel.tipoSimbolo);
                    }
                  }

                }
              }

              | 'constante' id=IDENTIFICADOR ':' tb=tipo_basico '=' valor_constante
              {
                // verifica se a nova variável já foi declarada antes no escopo atual
                // caso não tenha sido, adicionamos ela na tabela de simbolos do escopo atual
                if (pilhaDeTabelas.topo().existeSimbolos($id.getText()))
                  erro += "Linha " + $id.getLine() + ": identificador " + $id.getText() + " ja declarado anteriormente\n";
                else
                  pilhaDeTabelas.topo().adicionarSimbolo($id.getText(), $tb.tipoSimbolo);
              }

              | 'tipo' id=IDENTIFICADOR ':' t=tipo[$id.getText()]
              {
                // verifica se a nova variável já foi declarada antes no escopo atual
                // caso não tenha sido, adicionamos ela na tabela de simbolos do escopo atual
                // além disso, adicionamos a variável na tabelaDeTipos, afinal é de um novo tipo
                if (pilhaDeTabelas.topo().existeSimbolos($id.getText()))
                  erro += "Linha " + $id.getLine() + ": identificador " + $id.getText() + " ja declarado anteriormente\n";
                else{
                  pilhaDeTabelas.topo().adicionarSimbolo($id.getText(), $t.tipoSimbolo);
                  tabelaDeTipos.adicionarSimbolo($id.getText(), $t.tipoSimbolo);
                }

              }
              ;

variavel      // retorna  lista de identificadores, tipo deles e a linha em que foram declarados 
              returns [List<String> nomes, String tipoSimbolo, int linha] 
              @init {$nomes = new ArrayList<String>(); $tipoSimbolo = ""; $linha = -1;}
              : id=IDENTIFICADOR dimensao mv=mais_var ':' tp=tipo[$tipoSimbolo]
              {
                int i = 0;
                $tipoSimbolo = $tp.tipoSimbolo;
                $nomes.add($id.getText());
                $nomes.addAll($mv.nomes);
                if ($mv.linha == -1)
                  $linha = $id.getLine();
                else
                  $linha = $mv.linha;
              }
              ;

mais_var      // pode retornar uma lista vazia por ser recursiva e não obrigatória
              returns [List<string> nomes, int linha]
              @init {$nomes = new ArrayList<String>(); $linha = -1}
              : (',' id=IDENTIFICADOR
              {
                if (!pilhaDeTabelas.existeSimbolo($id.getText()))
                {
                  $nomes.add($id.getText());
                  $linha = $id.getLine();
                }
                else
                {
                  // retorna erro quando a variável já foi declarada antes
                  erro += "Linha " + $id.getLine() + ": identificador " + $id.getText() + " ja declarado anteriormente\n";
                }
              }
              dimensao mais_var)?
              ;

identificador //retorna o nome, o tipo e a linha em que foi declarado o identificador
              returns [String txt, int linha, String tipoSimbolo]
              @init{$txt = ""; $linha = -1; $tipoSimbolo = "NONE";}
              :ponteiros_opcionais id=IDENTIFICADOR dimensao id2=outros_ident
              {
                $txt += $id.text + $id2.txt;
                $linha = $id.getLine();
                $tipoSimbolo = pilhaDeTabelas.topo().getTipoSimbolo($txt);
              }
              ;

ponteiros_opcionais
              : ('^')*
              ; 

outros_ident  //retorna o nome do campo
              returns [ String txt]
              @init{ $txt = ""; }
              : ('.' id=identificador)?
              {
                $txt = "."+$id.txt;
              }
              ;

dimensao      //retorna um campo texto para operacoes com vetores
              : ('[' exp_aritmetica ']' dimensao)?
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