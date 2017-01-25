grammar SSL;


/******************* LEXICO *********************/
    
 TKSCRIPT : 'script::'
          ;

IDENTIFICADOR      : ('a'..'z' | 'A'..'Z' | '_')('a'..'z' | 'A'..'Z' | '_' 
                     | '0'..'9')*
                   ;

ACAO               : '"'  (~('"'))* '"'
                   ;


ESPACOS       : (' ' | '\t' | '\r' | '\n') {  skip(); } 
              ;

// Testar: tirar o '\n' do ESPACOS e colocar no meio das regras sintáticas onde pode ter enter, explicitamente

/******************* SINTATICO ********************/

script             : TKSCRIPT IDENTIFICADOR '{' script_cont '}'
                   ;

script_cont        : decl_principais (cena)+
                   ;    

decl_principais    : decl_autores decl_personagens decl_cenarios ordem_cenas
                   ; 

cena               : 'scene::' IDENTIFICADOR '{' cena_cont '}'
                   ;

cena_cont          : decl_cenario cmd
                   ;     

cmd                : ACAO cmd | fala cmd
                   ;

chamada_personagem : '<' IDENTIFICADOR '>'
                   ;

decl_personagens   : 'characters' ':' IDENTIFICADOR (',' IDENTIFICADOR)* 
                     'end_characters'
                   ;

decl_cenarios      : 'scenarios' ':' IDENTIFICADOR (',' IDENTIFICADOR)* 
                     'end_scenarios'
                   ;

decl_cenario       : 'scenario' ':' IDENTIFICADOR 
                     'end_scenario'
                   ;      

decl_autores       : 'authors' ':' IDENTIFICADOR (',' IDENTIFICADOR)* 
                     'end_authors'
                   ;

ordem_cenas        : 'sceneorder' ':' IDENTIFICADOR (',' IDENTIFICADOR)* 
                     'end_sceneorder'
                   ;

fala               : chamada_personagem ':' CONTEUDO_FALA
                   ; 
