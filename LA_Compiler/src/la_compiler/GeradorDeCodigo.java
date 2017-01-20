package la_compiler;

public class GeradorDeCodigo extends LABaseListener {
	
	Saida saida;

	public GeradorDeCodigo(Saida saida) {
		this.saida = saida;
	}

	@Override
	public void enterPrograma(LAParser.ProgramaContext ctx) {
		saida.print("#include <stdio.h>\n");
		saida.print("#include <stdlib.h>\n");
		saida.print("int main(){\n");
	}

	@Override
	public void exitPrograma(LAParser.ProgramaContext ctx) {
		saida.print("return 0;\n");
		saida.print("}\n");
	}

	@Override
	public void enterCmd(LAParser.CmdContext ctx) {
		if (ctx.tipoComando.equals("leia")) {
                    if(!ctx.identificador().IDENTIFICADOR().toString().equals("char"))
			saida.print("scanf(\"%" + verifica_tipo(ctx.identificador().tipoSimbolo) + "\",&" + ctx.identificador().simbolo + ");\n");
                    else
                        saida.print("gets(" + ctx.identificador().simbolo + ");\n");
		} else {
			if (ctx.tipoComando.equals("escreva"))
				saida.print("printf(\"%" + verifica_tipo(ctx.expressao().tipoSimbolo) + "\"," + ctx.expressao().simbolo + ");\n");
		}
	}

	@Override
	public void enterComandos (LAParser.ComandosContext ctx) {
            
	}

	@Override
	public void enterDeclaracao_local(LAParser.Declaracao_localContext ctx) {
		if(ctx.variavel.tipoSimbolo.equals("inteiro")) {
                    saida.print("int "); 
                    saida.print(ctx.variavel.identificadores.toString().substring(1, ctx.variavel.identificadores.toString().length()-1));
                    saida.print(";\n");
                } else {
                    if(ctx.variavel.tipoSimbolo.equals("real")) {
                        saida.print("float ");
                        saida.print(ctx.variavel.identificadores.toString().substring(1, ctx.variavel.identificadores.toString().length()-1));
                        saida.print(";\n");
                    } else {
			if(ctx.variavel.tipoSimbolo.equals("literal")) {
                            saida.print("char ");
                            saida.print(ctx.variavel.identificadores.toString().substring(1, ctx.variavel.identificadores.toString().length()-1));
                            saida.print("[80];\n");
                        } else {
                            if(ctx.variavel.tipoSimbolo.equals("logico")) {
                                saida.print("bool ");
                                saida.print(ctx.variavel.identificadores.toString().substring(1, ctx.variavel.identificadores.toString().length()-1));
                                saida.print(";\n");
                            }
                        }
                    }
		}
	}

	public char verifica_tipo(String tipo) {
		if(tipo.equals("literal")) {
			return 's';
		} else {
			if(tipo.equals("inteiro")) {
				return 'd';
			} else {
				if (tipo.equals("real")) {
					return 'f';
				}
			}
		}
		return 'd';
	}
        
}
