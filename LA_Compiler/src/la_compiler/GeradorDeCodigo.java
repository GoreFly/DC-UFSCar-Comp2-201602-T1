package la_compiler;

public class GeradorDeCodigo extends LABaseListener {
	
	StringBuffer saida;

	public GeradorDeCodigo(StringBuffer saida) {
		this.saida = saida;
	}

	@Override
	public void enterPrograma(LAParser.ProgramaContext ctx) {
		saida.append("#include <stdio.h>\n");
		saida.append("#include <stdlib.h>\n");
		saida.append("#include <int main(){\n");
	}

	@Override
	public void exitPrograma(LAParser.ProgramaContext ctx) {
		saida.append("return 0\n");
		saida.append("}\n");
	}

	@Override
	public void enterCmd(LAParser.CmdContext ctx) {
		if (ctx.tipoComando.equals("leia")) {
			saida.append("scanf(\"%" + verifica_tipo(ctx.expressao().tipoSimbolo) + "\"," + ctx.expressao().simbolo + ");\n");
		} else {
			if (ctx.tipoComando.equals("se"))
				saida.append("if(<expressao>){\n");
		}
	}

	@Override
	public void enterComandos (LAParser.ComandosContext ctx) {

	}

	@Override
	public void enterDeclaracao_local(LAParser.Declaracao_localContext ctx) {
		if(ctx.variavel.tipoSimbolo.equals("inteiro")) {
                    saida.append("int "); 
                    saida.append(ctx.variavel.identificadores.toString().substring(1, ctx.variavel.identificadores.toString().length()-1));
                    saida.append(";\n");
                } else {
                    if(ctx.variavel.tipoSimbolo.equals("real")) {
                        saida.append("float ");
                        saida.append(ctx.variavel.identificadores.toString().substring(1, ctx.variavel.identificadores.toString().length()-1));
                        saida.append(";\n");
                    } else {
			if(ctx.variavel.tipoSimbolo.equals("literal")) {
                            saida.append("char ");
                            saida.append(ctx.variavel.identificadores.toString().substring(1, ctx.variavel.identificadores.toString().length()-1));
                            saida.append("[80];\n");
                        } else {
                            if(ctx.variavel.tipoSimbolo.equals("logico")) {
                                saida.append("bool ");
                                saida.append(ctx.variavel.identificadores.toString().substring(1, ctx.variavel.identificadores.toString().length()-1));
                                saida.append(";\n");
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
