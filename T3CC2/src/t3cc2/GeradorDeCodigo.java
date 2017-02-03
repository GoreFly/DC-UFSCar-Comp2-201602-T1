package t3cc2;

public class GeradorDeCodigo extends SSLBaseListener {
	
	Saida saida;

	public GeradorDeCodigo(Saida saida) {
		this.saida = saida;
	}

    @Override
    public void enterScript(SSLParser.ScriptContext ctx) {
        saida.print("<!doctype html>\n");
        saida.print("\n");
        saida.print("<html lang=\"en\">\n");
        saida.print("<head>\n");
        saida.print("  <meta charset=\"utf-8\">\n");
        saida.print("\n");
        saida.print("  <title>");
        saida.print(ctx.IDENTIFICADOR().getText());
        saida.print("</title>\n");
        saida.print("  <meta name=\"description\" content=\"");
        saida.print(ctx.IDENTIFICADOR().getText());
        saida.print(" script\">\n");
        saida.print("\n");
        saida.print("  <link rel=\"stylesheet\" href=\"styles.css\">");
        saida.print("</head>\n");
        saida.print("\n");
        saida.print("<body>\n");
    }

    @Override
    public void exitScript(SSLParser.ScriptContext ctx) {
        saida.print("</body>\n");
        saida.print("</html>");
    }
    
    

        

	
        
}
