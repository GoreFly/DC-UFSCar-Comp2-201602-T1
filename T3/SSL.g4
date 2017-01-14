grammar LA;

@members {
  static String grupo = "<551554, 551872, 551805, 551724>"; 
}

/******************* LEXICO *********************/

IDENTIFICADOR      : ('a'..'z' | 'A'..'Z' | '_')('a'..'z' | 'A'..'Z' | '_' 
                     | '0'..'9')*
                   ;

CADEIA-CHAR        : ('a'..'z' | 'A'..'Z' | '_'| '#'| '%'| '*'| '.'| ',' 
                     | '/' | '0'..'9')
                   ;

/******************* SINTATICO ********************/

script             : "script::" CADEIA-CHAR '{' script-cont '}'
                   ;

script-cont        : decl-principais (cena)+
                   ;    

decl-principais    : decl-autores decl-personagens decl-cenarios ordem-cenas
                   ; 

cena               : "scene::" CADEIA-CHAR '{' cena-cont '}'
                   ;

cena-cont          : decl-cenario cmd
                   ;     

cmd                : acao cmd | fala cmd
                   ;

chamada-personagem : '<' IDENTIFICADOR '>'
                   ;

decl-personagens   : "characters" ':' IDENTIFICADOR (',' IDENTIFICADOR)* 
                     "end-characters"
                   ;

decl-cenarios      : "scenarios" ':' IDENTIFICADOR (',' IDENTIFICADOR)* 
                     "end-scenarios"
                   ;

decl-cenario       : "scenario" ':' IDENTIFICADOR 
                     "end-scenario"
                   ;      

decl-autores       : "authors" ':' IDENTIFICADOR (',' IDENTIFICADOR)* 
                     "end-authors"
                   ;

ordem-cenas        : "sceneorder" ':' IDENTIFICADOR (',' IDENTIFICADOR)* 
                     "end-sceneorder"
                   ;
                   
acao               : '*'  (~('*') | chamada-personagem)* '*''
                   ;

fala               : chamada-personagem ':' (CADEIA-CHAR)+
                   ; 
