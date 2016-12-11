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
ERRO          : . { stop("Linha " + getLine() + ": " + getText() + " - simbolo nao identificado\n"); }
              ;

/******************* SINTATICO E SEMÂNTICO ********************/

programa      : {
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
                  pilhaDeTabelas.desempilhar();
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
                  for (String s : $variavel.identificadores) {
                    if (pilhaDeTabelas.topo().existeSimbolo(s))
                      // necessário verificar se a variável ja foi declarada antes
                      erro += "Linha " + $variavel.linha + ": identificador  "+ s +" ja declarado anteriormente\n";
                    else {
                      // verifica se a variável é de um tipo válido. Caso for válido adicionamos ela na tabela de símbolos do escopo atual
                      if (tabelaDeTipos.existeSimbolo($variavel.tipoSimbolo)) {
                        pilhaDeTabelas.topo().adicionarSimbolo(s, $variavel.tipoSimbolo);
                        if (tabelaDeRegistros.existeTabela($variavel.tipoSimbolo)!=null) {
                          // caso o tipo da variável for um registro, declaramos os componentes desse tipo na variável
                          TabelaDeSimbolos tabelaDoRegistro = tabelaDeRegistros.existeTabela($variavel.tipoSimbolo);
                          for (EntradaTabelaDeSimbolos t: tabelaDoRegistro.getSimbolos()){
                            pilhaDeTabelas.topo().adicionarSimbolo(s+"."+t.getNome(), t.getTipo());
                          }
                        } else {
                          // se o tipo não for identificado pode ser que ele tenha ido declarado como um registro
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
                        erro += "Linha " + $variavel.linha + ": tipo " + $variavel.tipoSimbolo + " nao declarado\n";
                        pilhaDeTabelas.topo().adicionarSimbolo(s, $variavel.tipoSimbolo);
                      }
                    }
                  }
                }
              | 'constante' id=IDENTIFICADOR ':' tb=tipo_basico '=' valor_constante
                {
                  // verifica se a nova variável já foi declarada antes no escopo atual
                  // caso não tenha sido, adicionamos ela na tabela de simbolos do escopo atual
                  if (pilhaDeTabelas.topo().existeSimbolo($id.getText()))
                    erro += "Linha " + $id.getLine() + ": identificador " + $id.getText() + " ja declarado anteriormente\n";
                  else
                    pilhaDeTabelas.topo().adicionarSimbolo($id.getText(), $tb.tipoSimbolo);
                }
              | 'tipo' id=IDENTIFICADOR ':' t=tipo[$id.getText()]
                {
                  // verifica se a nova variável já foi declarada antes no escopo atual
                  // caso não tenha sido, adicionamos ela na tabela de simbolos do escopo atual
                  // além disso, adicionamos a variável na tabelaDeTipos, afinal é de um novo tipo
                  if (pilhaDeTabelas.topo().existeSimbolo($id.getText()))
                    erro += "Linha " + $id.getLine() + ": identificador " + $id.getText() + " ja declarado anteriormente\n";
                  else{
                    pilhaDeTabelas.topo().adicionarSimbolo($id.getText(), $t.tipoSimbolo);
                    tabelaDeTipos.adicionarSimbolo($id.getText(), $t.tipoSimbolo);
                  }
                }
              ;

variavel      // retorna  lista de identificadores, tipo deles e a linha em que foram declarados 
              returns [List<String> identificadores, String tipoSimbolo, int linha] 
              @init {$identificadores = new ArrayList<String>(); $tipoSimbolo = ""; $linha = -1;}
              : id=IDENTIFICADOR dimensao mv=mais_var ':' tp=tipo[$tipoSimbolo]
                {
                  int i = 0;
                  $tipoSimbolo = $tp.tipoSimbolo;
                  $identificadores.add($id.getText());
                  $identificadores.addAll($mv.identificadores);
                  if ($mv.linha == -1)
                    $linha = $id.getLine();
                  else
                    $linha = $mv.linha;
                }
              ;

mais_var      // pode retornar uma lista vazia por ser recursiva e não obrigatória
              returns [List<String> identificadores, int linha]
              @init {$identificadores = new ArrayList<String>(); $linha = -1;}
              : (',' id=IDENTIFICADOR
                {
                  if (!pilhaDeTabelas.existeSimbolo($id.getText()))
                  {
                    $identificadores.add($id.getText());
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
              returns [String simbolo, int linha, String tipoSimbolo]
              @init{$simbolo = ""; $linha = -1; $tipoSimbolo = "NONE";}
              : ponteiros_opcionais id=IDENTIFICADOR dimensao id2=outros_ident
                {
                  $simbolo += $id.text + $id2.simbolo;
                  $linha = $id.getLine();
                  $tipoSimbolo = pilhaDeTabelas.topo().getTipoSimbolo($simbolo);
                }
              ;

ponteiros_opcionais
              : ('^')*
              ; 

outros_ident  //retorna o nome do campo
              returns [ String simbolo]
              @init { $simbolo = ""; }
              : ('.' id=identificador
                {
                  $simbolo = "." + $id.simbolo;
                }
              )?
              ;

dimensao      //retorna um campo texto para operacoes com vetores
              returns [ String simbolo ]
              @init { $simbolo = ""; }
              : ('[' ea=exp_aritmetica ']' dimensao
                {
                  $simbolo = "[" + $ea.simbolo + "]";
                }
              )?
              ;

tipo[String tipoRegistro]          //retorna tipo correspondente e lista de nomes das variaveis desse tipo
              returns [String tipoSimbolo, List<String> identificadores]
              @init {$tipoSimbolo=""; $identificadores = new ArrayList<String>();}
              : reg=registro[$tipoRegistro] 
                {
                  $tipoSimbolo = $reg.tipoRegistro; 
                  $identificadores.addAll($registro.identificadores);
                }
              | tipo_estendido
                {
                  $tipoSimbolo = $tipo_estendido.tipoSimbolo;
                }
              ;

mais_ident    // retorna lista de variáveis declaradas e linhas das declarações
              returns [List<String> identificadores, int linha]
              @init {$identificadores = new ArrayList<String>(); $linha=-1;}
              : (',' ide=identificador mid=mais_ident
                {
                  $identificadores.add($ide.simbolo);
                  $identificadores.addAll($mid.identificadores);
                  $linha = $ide.linha;
                }
              )?
              ;

mais_variaveis  // retorna lista de variaveis declaradas, tipos e linhas das declarações
                returns [List<String> identificadores, String tipoSimbolo, int linha]
                @init {$identificadores = new ArrayList<String>(); $tipoSimbolo = ""; $linha=-1;}
                : (variavel mva=mais_variaveis
                  {
                    $identificadores.addAll($variavel.identificadores);
                    $tipoSimbolo=$variavel.tipoSimbolo;
                    $linha=$variavel.linha;
                    $identificadores.addAll($mva.identificadores);
                  }
                )?
                ;

tipo_basico   returns [String tipoSimbolo]
              @init {$tipoSimbolo="";}
              : 'literal' {$tipoSimbolo = "literal";}
              | 'inteiro' {$tipoSimbolo = "inteiro";}
              | 'real'    {$tipoSimbolo = "real";}
              | 'logico'  {$tipoSimbolo = "logico";}
              ;

tipo_basico_ident returns [String tipoSimbolo]
              : tb=tipo_basico 
                {
                  $tipoSimbolo = $tb.tipoSimbolo;
                } 
              | ide=IDENTIFICADOR 
                {
                  $tipoSimbolo = $ide.getText();
                }
              ;

tipo_estendido  returns [String tipoSimbolo]
              @init {$tipoSimbolo="";}
              : ponteiros_opcionais tbi=tipo_basico_ident
                {
                  $tipoSimbolo = $tbi.tipoSimbolo;
                }
              ;

valor_constante
              : CADEIA | INTEIRO | REAL | 'verdadeiro' | 'falso'
              ;

registro      [String nomeRegistro] returns[String tipoRegistro, List<String> identificadores]
              @init {$identificadores = new ArrayList<String>();}
              /* parametros: nome do registro
                 retorna: tipo do registro e lista de variáveis associadas
                 Ao ser declarado o registro, uma nova tabela de simbolos é empilhada. Essa tabela
                 armazena as variáveis locais. A tabela é desempilhada quando a declaração termina.
              */
              : 'registro'
                {
                  pilhaDeTabelas.empilhar(new TabelaDeSimbolos("registro"));
                  if (!$nomeRegistro.equals(""))
                    tabelaDeRegistros.empilhar(new TabelaDeSimbolos($nomeRegistro));
                  else
                    tabelaDeRegistros.empilhar(new TabelaDeSimbolos("registro"));
                } 
              variavel mais_variaveis
                {
                  for (String s1 : $variavel.identificadores)
                  {
                    tabelaDeRegistros.topo().adicionarSimbolo(s1, $variavel.tipoSimbolo);
                    $identificadores.add(s1);
                  }
                  for (String s2 : $mais_variaveis.identificadores)
                  {
                    tabelaDeRegistros.topo().adicionarSimbolo(s2, $mais_variaveis.tipoSimbolo);
                    $identificadores.add(s2);
                  }
                } 
              'fim_registro'
                {
                  pilhaDeTabelas.desempilhar();
                }
              ;

declaracao_global
              : 'procedimento' ide=IDENTIFICADOR
                {
                  // ao ser declarado o procedimento, um identificador válido (não declarado) para ele é necessário
                  // uma nova tabela de símbolos é empilhada no começo e desempilhada no termino
                  if (pilhaDeTabelas.topo().existeSimbolo($ide.getText()))
                    erro += "Linha " + $ide.getLine() + ": identificador " + $ide.getText() + " ja declarado anteriormente\n";
                  else
                  {
                    pilhaDeTabelas.topo().adicionarSimbolo($ide.getText(), "procedimento");
                    pilhaDeTabelas.empilhar(new TabelaDeSimbolos("procedimento"));
                  }
                } 
              '(' parametros_opcional ')' declaracoes_locais comandos 'fim_procedimento'
                {
                  pilhaDeTabelas.desempilhar();
                }
              | 'funcao' ide=IDENTIFICADOR
                {
                  // ao ser declarado o procedimento, um identificador válido (não declarado) para ele é necessário
                  // nova tabela de símbolos é empilhada no começo e desempilhada no termino
                  if (pilhaDeTabelas.topo().existeSimbolo($ide.getText()))
                    erro += "Linha " + $ide.getLine() + ": identificador " + $ide.getText() + " ja declarado anteriormente\n";
                  else
                  {
                    pilhaDeTabelas.empilhar(new TabelaDeSimbolos("funcao"));
                  }
                } 
              '(' parametros_opcional ')' ':' tes=tipo_estendido declaracoes_locais comandos 'fim_funcao'
                {
                  pilhaDeTabelas.desempilhar();
                  // no escopo atual, empilhamos um símbolo correspondente ao nome da função
                  pilhaDeTabelas.topo().adicionarSimbolo($ide.getText(), $tes.tipoSimbolo);
                }
              ;

parametros_opcional
              : (parametro)?
              ;

parametro     : var_opcional ide=identificador mais_ident ':' tes=tipo_estendido mais_parametros
              /*
                Verifica se o símbolo já foi declarado e empilha.
                Se o tipo do símbolo for um registro, faz as declarações na variável.
              */
                {
                  if (pilhaDeTabelas.topo().existeSimbolo($ide.simbolo))
                    erro += "Linha " + $ide.linha + ": identificador " + $ide.simbolo + "ja declarado anteriormente\n";
                  else
                  {
                    pilhaDeTabelas.topo().adicionarSimbolo($ide.simbolo, $tes.tipoSimbolo);
                    if (tabelaDeRegistros.existeTabela($tes.tipoSimbolo) != null)
                    {
                      TabelaDeSimbolos tabelaDoRegistro = tabelaDeRegistros.existeTabela($tes.tipoSimbolo);
                      for (String s : tabelaDoRegistro.getNomesSimbolos())
                        pilhaDeTabelas.topo().adicionarSimbolo($ide.simbolo + s, $tes.tipoSimbolo);
                    }
                  }
                }
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

cmd           returns [String tipoComando]
              @init {$tipoComando="";}
              : 'leia' '(' ide1=identificador mid1=mais_ident 
                { 
                  // verifica se simbolos já foram declarados
                  if(!pilhaDeTabelas.existeSimbolo($ide1.simbolo))
                    erro += "Linha " + $ide1.linha + ": identificador " + $ide1.simbolo + " nao declarado\n";
                  for (String s : $mid1.identificadores)
                  {
                    if(!pilhaDeTabelas.existeSimbolo(s))
                      erro+="Linha " + $ide1.linha + ": identificador " + s + " nao declarado\n";
                  }    
                }
              ')' {$tipoComando = "leia";}
              | 'escreva' '(' expressao mais_expressao ')'
                {
                  $tipoComando = "escreva";
                }
              | 'se' expressao 'entao' comandos senao_opcional 'fim_se'
                {
                  $tipoComando = "escreva";
                }
              | 'caso' exp_aritmetica 'seja' selecao senao_opcional 'fim_caso'
                {
                  $tipoComando = "caso";
                }
              | 'para' IDENTIFICADOR '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' comandos 'fim-para'
                {
                  $tipoComando = "para";
                }
              | 'enquanto' expressao 'faca' comandos 'fim_enquanto'
                {
                  $tipoComando = "enquanto";
                }
              | 'faca' comandos 'ate' expressao
                {
                  $tipoComando = "faca";
                }
              | 'ˆ' ide2=IDENTIFICADOR oid=outros_ident dimensao '<-' exp=expressao
                {
                  // verifica se os simbolos da atribuicao sao compativeis
                  $tipoComando = "expoente";
                  String tipoExpressao = $exp.tipoSimbolo;
                  String tipoIdentificador = pilhaDeTabelas.topo().getTipoSimbolo($ide2.getText());
                  if (!tipoExpressao.equals(tipoIdentificador))
                    erro += "Linha " + $ide2.getLine() + ": atribuicao nao compativel para ^" + $ide2.getText() + $oid.simbolo + "\n";
                }
              | ide3=IDENTIFICADOR chamada_atribuicao[$ide3.text]
                {
                  // verifica se o simbolo ja foi declarado
                  if (!pilhaDeTabelas.existeSimbolo($ide3.getText()))
                    erro += "Linha " + $ide3.getLine() + ": identificador " + $ide3.getText() + " nao declarado\n";
                }
              | ret='retorne' expressao
                {
                  // verifica escopo atual e escopo do comando
                  String atual = pilhaDeTabelas.topo().getEscopo();
                  if (!atual.equals("funcao"))
                    erro += "Linha " + $ret.getLine() + ": comando retorne nao permitido nesse escopo\n";
                }
              ;

mais_expressao  returns[String tipoSimbolo]
                @init {$tipoSimbolo="NONE";}
                : (',' exp=expressao mex=mais_expressao
                  {
                    // verifica se os tipos sao compativeis
                    if ($mex.tipoSimbolo.equals("NONE"))
                      $tipoSimbolo = $exp.tipoSimbolo;
                    else
                    {
                      if ($exp.tipoSimbolo.equals($mex.tipoSimbolo) || ($exp.tipoSimbolo.equals("inteiro") || $exp.tipoSimbolo.equals("real")) && ($mex.tipoSimbolo.equals("real") || $mex.tipoSimbolo.equals("inteiro")))
                          $tipoSimbolo = $tipoSimbolo;
                      else
                          $tipoSimbolo = "incompativel";
                    }  
                  }
                  )?
                ;

senao_opcional: ('senao' comandos)?
              ;

chamada_atribuicao [String identificadorInicial]
              : '('argumentos_opcional ')' 
              | oid=outros_ident dim=dimensao atr='<-' exp=expressao
                {
                  if (pilhaDeTabelas.existeSimbolo($identificadorInicial + $oid.simbolo))
                  {
                    // verifica se os tipos sao compativeis
                    String tpi = pilhaDeTabelas.topo().getTipoSimbolo($identificadorInicial + $oid.simbolo);
                    String te = $exp.tipoSimbolo;
                    if (!(tpi.equals(te) || (tpi.equals("inteiro") || tpi.equals("real")) && (te.equals("real") || te.equals("inteiro"))))
                           erro += "Linha " + $atr.getLine() + ": atribuicao nao compativel para " + $identificadorInicial + $oid.simbolo + $dim.simbolo +"\n";
                  }
                }
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

exp_aritmetica  // retorna um simbolo e seu tipo
                returns [String tipoSimbolo, String simbolo]
                @init {$tipoSimbolo="NONE"; $simbolo="";}
                : ter=termo ote=outros_termos
                  {
                    // verifica se tipos são compativeis
                    // caso não sejam, a expressão é incompativel
                    $simbolo = $ter.simbolo;
                    if ($ote.tipoSimbolo.equals("NONE"))
                      $tipoSimbolo = $ter.tipoSimbolo;
                    else
                    {
                      if ($ter.tipoSimbolo.equals($ote.tipoSimbolo) || ($ter.tipoSimbolo.equals("inteiro") || $ter.tipoSimbolo.equals("real")) && ($ote.tipoSimbolo.equals("real") || $ote.tipoSimbolo.equals("inteiro")))
                        $tipoSimbolo = $ter.tipoSimbolo;
                      else
                        $tipoSimbolo = "incompativel";
                    }
                  }
                ;

op_multiplicacao
              : '*' | '/'
              ;

op_adicao     : '+' | '-'
              ;

termo         // retorna símbolo e seu tipo
              returns [String tipoSimbolo, String simbolo]
              @init {$tipoSimbolo="NONE"; $simbolo="";}
              : fat=fator outros_fatores
                {
                  $tipoSimbolo = $fat.tipoSimbolo;
                  $simbolo = $fat.simbolo;
                }
              ;

outros_termos // retorna tipo do simbolo
              returns [String tipoSimbolo]
              @init {$tipoSimbolo="NONE";}
              : (op_adicao ter=termo ote=outros_termos
                  {
                    // verifica se tipos são compativeis
                    if ($ote.tipoSimbolo.equals("NONE"))
                      $tipoSimbolo = $ter.tipoSimbolo;
                    else
                    {
                      if ($ter.tipoSimbolo.equals($ote.tipoSimbolo) || ($ter.tipoSimbolo.equals("inteiro") || $ter.tipoSimbolo.equals("real")) && ($ote.tipoSimbolo.equals("real") || $ote.tipoSimbolo.equals("inteiro")))
                        $tipoSimbolo = $ter.tipoSimbolo;
                      else
                        $tipoSimbolo = "incompativel";
                    }  
                  }
                )?
              ;

fator         // retorna um simbolo e seu tipo
              returns [String tipoSimbolo, String simbolo]
              @init {$tipoSimbolo="NONE"; $simbolo="";}
              : par=parcela outras_parcelas
                {
                  $tipoSimbolo = $par.tipoSimbolo;
                  $simbolo = $par.simbolo;
                }
              ;

outros_fatores: (op_multiplicacao fator outros_fatores)?
              ;

parcela       // retorna um símbolo e seu tipo
              // verifica-se se os símbolos já foram declarados 
              returns [String tipoSimbolo, String simbolo]
              : op_unario pun=parcela_unario
                {
                  $tipoSimbolo = $pun.tipoSimbolo;
                  $simbolo = $pun.simbolo;
                } 
              | pnn=parcela_nao_unario
                {
                  $tipoSimbolo = $pnn.tipoSimbolo;
                  $simbolo = $pnn.simbolo;
                }
              ;

parcela_unario  // retorna um símbolo, seu tipo e a linha em que foi declarado
                // verifica-se se os símbolos já foram declarados
                returns [String simbolo, int linha, String tipoSimbolo]
                @init {$tipoSimbolo="NONE"; $simbolo=""; $linha=-1;}
                : 'ˆ' ide1=IDENTIFICADOR oid=outros_ident dimensao
                  {
                    $simbolo += $ide1.getText() + $oid.simbolo;
                    $linha = $ide1.getLine();
                   
                    if(!pilhaDeTabelas.existeSimbolo($ide1.getText() + $oid.simbolo))
                        erro += "Linha " + $ide1.getLine() + ": identificador " + $ide1.getText() + $oid.simbolo + " nao declarado\n";
                    if($oid.simbolo.equals("")) 
                        $tipoSimbolo = pilhaDeTabelas.topo().getTipoSimbolo($simbolo);
                    else
                        $tipoSimbolo = tabelaDeRegistros.getTipoSimbolo($oid.simbolo.substring(1));
                  } 
                | ide2=IDENTIFICADOR cpa=chamada_partes[$ide2.getText()] 
                  {
                    $simbolo += $ide2.getText() + $cpa.outrosIdentificadores;
                    $linha = $ide2.getLine();
                    if (!pilhaDeTabelas.existeSimbolo($simbolo))
                      erro += "Linha " + $ide2.getLine() + ": identificador " + $simbolo + " nao declarado \n";
                    else
                    {
                      if ($cpa.tipoSimbolo.equals("NONE"))
                        $tipoSimbolo = pilhaDeTabelas.topo().getTipoSimbolo($simbolo);
                      else
                        $tipoSimbolo = $cpa.tipoSimbolo;
                    }
                  }
                | INTEIRO 
                  {
                    $tipoSimbolo = "inteiro";
                    $simbolo = $INTEIRO.getText();
                  }
                | REAL 
                  {
                    $tipoSimbolo = "real";
                    $simbolo = $REAL.getText();
                  }
                | '(' exp=expressao ')'
                  {
                    $tipoSimbolo = $exp.tipoSimbolo;
                  }
                ;

parcela_nao_unario  // retorna um simbolo, seu topo e a linha em que foi declarado
                    returns [String simbolo, int linha, String tipoSimbolo]
                    @init {$simbolo=""; $linha=-1; $tipoSimbolo="NONE";}
                    : '&' ide=IDENTIFICADOR oid=outros_ident
                      {
                        $simbolo += $ide.getText() + $oid.simbolo;
                        $linha = $ide.getLine();
                        $tipoSimbolo = pilhaDeTabelas.getTipoSimbolo($simbolo);
                      } 
                    dimensao
                    | CADEIA
                      {
                        $tipoSimbolo = "literal";
                        $simbolo = $CADEIA.getText();
                      }
                    ;

outras_parcelas
              : ('%' parcela)*
              ;

chamada_partes  // o parametro serve para retornar o tipo do simbolo
                [String identificadorInicial]
                // retorna um simbolo e outros identificadores
                returns [String tipoSimbolo, String outrosIdentificadores]
                @init {$tipoSimbolo="NONE"; $outrosIdentificadores="";}
                : '(' expressao mais_expressao ')'
                | oid=outros_ident dimensao
                  {
                    $outrosIdentificadores = $oid.simbolo;
                    $tipoSimbolo = pilhaDeTabelas.topo().getTipoSimbolo($identificadorInicial + $oid.simbolo);
                  }
                |
                ;

exp_relacional  // retorna um simbolo e seu tipo
                returns [String tipoSimbolo, String simbolo]
                @init {$tipoSimbolo="NONE"; $simbolo="";}
                : ear=exp_aritmetica opp=op_opcional
                  {
                    $simbolo = $ear.simbolo;
                    if ($opp.tipoSimbolo.equals("NONE"))
                      $tipoSimbolo = $ear.tipoSimbolo;
                    else
                      $tipoSimbolo = $opp.tipoSimbolo;
                  }
                ;

op_opcional   // retorna o tipo de um simbolo 
              returns [String tipoSimbolo]
              @init {$tipoSimbolo="NONE";}
              : (opr=op_relacional exp_aritmetica
                {
                  $tipoSimbolo = $opr.tipoSimbolo;
                }
              )?
              ;

op_relacional // retorna o tipo de um simbolo
              returns [String tipoSimbolo]
              @init {$tipoSimbolo="NONE";}
              : '='   {$tipoSimbolo="logico";}
              | '<>'  {$tipoSimbolo="logico";}
              | '>='  {$tipoSimbolo="logico";}
              | '<='  {$tipoSimbolo="logico";}
              | '>'   {$tipoSimbolo="logico";}
              | '<'   {$tipoSimbolo="logico";}
              ;

expressao     // retorna um simbolo e seu tipo
              returns [String tipoSimbolo, String simbolo]
              @init {$tipoSimbolo="NONE"; $simbolo="";}
              : tlo=termo_logico outros_termos_logicos
                {
                  $tipoSimbolo = $tlo.tipoSimbolo;
                  $simbolo = $tlo.simbolo;
                }
              ;

op_nao        : ('nao')?
              ;

termo_logico  // retorna um simbolo e seu tipo
              returns [String tipoSimbolo, String simbolo]
              @init {$tipoSimbolo="NONE"; $simbolo="";}
              : flo=fator_logico outros_fatores_logicos
                {
                  $tipoSimbolo = $flo.tipoSimbolo;
                  $simbolo = $flo.simbolo;
                }
              ;

outros_termos_logicos
              : ('ou' termo_logico)*
              ;

outros_fatores_logicos
              : ('e' fator_logico)*
              ;

fator_logico  // retorna um simbolo e seu tipo
              returns [String tipoSimbolo, String simbolo]
              @init {$tipoSimbolo="NONE"; $simbolo="";}
              : op_nao plo=parcela_logica
                {
                  $tipoSimbolo = $plo.tipoSimbolo;
                  $simbolo = $plo.simbolo;
                }
              ;

parcela_logica  // retorna um simbolo e seu tipo
                returns [String tipoSimbolo, String simbolo]
                @init {$tipoSimbolo="NONE"; $simbolo="";}
                : 'verdadeiro' {$tipoSimbolo = "logico";}
                | 'falso' {$tipoSimbolo = "logico";}
                | ere=exp_relacional
                  {
                    $tipoSimbolo = $ere.tipoSimbolo;
                    $simbolo = $ere.simbolo;
                  }
                ;              