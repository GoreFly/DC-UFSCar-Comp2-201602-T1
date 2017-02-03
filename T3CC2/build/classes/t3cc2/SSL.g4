grammar SSL;


/******************* LEXICO *********************/
    
TKSCRIPT        : 'script::'
                ;
TKSCENE         : 'scene::'
                ;
TKCHARACTERS    : 'characters:'
                ;
TKENDCHARACTERS : 'end_characters'
                ;
TKSCENARIO      : 'scenario:'
                ;
TKENDSCENARIO   : 'end_scenario'
                ;
TKSCENARIOS     : 'scenarios:'
                ;
TKENDSCENARIOS  : 'end_scenarios'
                ;
TKAUTHORS       : 'authors:'
                ;
TKENDAUTHORS    : 'end_authors'
                ;
TKSCENEORDER    : 'sceneorder:'
                ;
TKENDSCENEORDER : 'end_sceneorder'
                ;
TKCOMMA         : ','
                ;
TKCOLON         : ':'
                ;
TKLT            : '<'
                ;
TKGT            : '>'
                ;
TKLCBRACKETS    : '{'
                ;
TKRCBRACKETS    : '}'
                ;

STRING          : '"' (~('"'))* '"'
                ;

ACAO            : '*' (~('*'))* '*'
                ;

IDENTIFICADOR   : ('a'..'z' | 'A'..'Z' | '_')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*
                ;

ESPACOS         : (' ' | '\t' | '\r' | '\n') {  skip(); } 
                ;

/******************* SINTATICO ********************/

script              : TKSCRIPT IDENTIFICADOR TKLCBRACKETS script_cont TKRCBRACKETS 
                    ;

script_cont         : decl_principais (cena)+
                    ;    

decl_principais     : decl_autores decl_personagens decl_cenarios ordem_cenas
                    ; 

cena                : TKSCENE  IDENTIFICADOR TKLCBRACKETS  cena_cont TKRCBRACKETS 
                    ;

cena_cont           : decl_cenario cmd
                    ;     

cmd                 : ACAO cmd | fala cmd |
                    ;

chamada_personagem : TKLT IDENTIFICADOR TKGT
                   ;

decl_personagens   : TKCHARACTERS IDENTIFICADOR (TKCOMMA IDENTIFICADOR)* 
                     TKENDCHARACTERS
                   ;

decl_cenarios      : TKSCENARIOS  IDENTIFICADOR (TKCOMMA IDENTIFICADOR)* 
                     TKENDSCENARIOS 
                   ;

decl_cenario       : TKSCENARIO  IDENTIFICADOR
                     TKENDSCENARIO 
                   ;      

decl_autores       : TKAUTHORS  IDENTIFICADOR (TKCOMMA IDENTIFICADOR)* 
                     TKENDAUTHORS 
                   ;

ordem_cenas        : TKSCENEORDER  IDENTIFICADOR (TKCOMMA IDENTIFICADOR)* 
                     TKENDSCENEORDER 
                   ;

fala               : chamada_personagem TKCOLON STRING
                   ; 
