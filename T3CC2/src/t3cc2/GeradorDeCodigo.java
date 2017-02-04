package t3cc2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.antlr.v4.runtime.tree.TerminalNode;


public class GeradorDeCodigo extends SSLBaseListener {
	
    Script script;
    Cena cenaTmp;
    Comando comandoTmp;

    public GeradorDeCodigo() {
            this.script = new Script();
    }

    @Override
    public void enterScript(SSLParser.ScriptContext ctx) {
        script.setNome(ctx.IDENTIFICADOR().getText());
    }

    @Override
    public void enterDecl_autores(SSLParser.Decl_autoresContext ctx) {
        for(TerminalNode author : ctx.IDENTIFICADOR()){
            script.addAutores(author.getText());
        }
    }

    @Override
    public void enterDecl_cenarios(SSLParser.Decl_cenariosContext ctx) {
        for(TerminalNode scenario : ctx.IDENTIFICADOR()){
            script.addCenarios(scenario.getText());
        }
    }

    @Override
    public void enterDecl_personagens(SSLParser.Decl_personagensContext ctx) {
        for(TerminalNode character : ctx.IDENTIFICADOR()){
            script.addPersonagens(character.getText());
        }
    }

    @Override
    public void enterOrdem_cenas(SSLParser.Ordem_cenasContext ctx) {
        for(TerminalNode scene : ctx.IDENTIFICADOR()){
            script.addOrdemCenas(scene.getText());
        }
    }

    @Override
    public void enterCena(SSLParser.CenaContext ctx) {
        cenaTmp = new Cena();
        cenaTmp.setNome(ctx.IDENTIFICADOR().getText());
    }

    @Override
    public void enterDecl_cenario(SSLParser.Decl_cenarioContext ctx) {
        cenaTmp.setCenario(ctx.IDENTIFICADOR().getText());
    }

    @Override
    public void enterCmd(SSLParser.CmdContext ctx) {
        comandoTmp = new Comando();
        if(ctx.ACAO() == null){
            comandoTmp.setTipo("FALA");
        }else{
            comandoTmp.setTipo("ACAO");
            comandoTmp.setData(ctx.ACAO().getText().replaceAll("[\\*\\<\\>]", ""));
            String acao = ctx.ACAO().getText();
            Pattern p = Pattern.compile("<([a-z]|[A-Z]|'_')([a-z]|[A-Z]|'_'|[0-9])*>");
            Matcher m = p.matcher(acao);
            while(m.find()){
                String character = m.group().replaceAll("[\\<\\>]", "");
                cenaTmp.addPersonagens(character);
            }
        }
    }

    @Override
    public void enterFala(SSLParser.FalaContext ctx) {
        comandoTmp.setData(ctx.STRING().getText());
    }

    @Override
    public void enterChamada_personagem(SSLParser.Chamada_personagemContext ctx) {
        comandoTmp.setPersonagem(ctx.IDENTIFICADOR().getText());
        cenaTmp.addPersonagens(ctx.IDENTIFICADOR().getText());
    }

    @Override
    public void exitCmd(SSLParser.CmdContext ctx) {
//        if(comandoTmp.getTipo()!= null)
            cenaTmp.addComandos(comandoTmp);
    }

    @Override
    public void exitCena_cont(SSLParser.Cena_contContext ctx) {
        script.addCenas(cenaTmp);
    }

    @Override
    public void exitScript(SSLParser.ScriptContext ctx) {
        System.out.print(script.toString());
        printScript();
        
    }
    
    public void printScript(){
        try{
            PrintWriter saida = new PrintWriter("scriptGeral.html", "UTF-8");
            //Cabeçalho HTML
            saida.print("<!doctype html>\n");
            saida.print("\n");
            saida.print("<html lang=\"en\">\n");
            saida.print("<head>\n");
            saida.print("\t<meta charset=\"utf-8\">\n");
            saida.print("\n");
            saida.print("\t<title>");
            saida.print(script.getNome());
            saida.print("</title>\n");
            saida.print("\t<meta name=\"description\" content=\"");
            saida.print(script.getNome());
            saida.print(" script\">\n");
            saida.print("\n");
            saida.print("\t<link rel=\"stylesheet\" href=\"styles.css\">");
            saida.print("</head>\n");
            saida.print("\n");
            //Corpo
            saida.print("<body>\n");
            //Titulo com o nome do script
            saida.print("\t<h1 class=\"script-title\">");
            saida.print(script.getNome());
            saida.print("</h1>\n");
            //Declarações
            saida.print("\t<h2 class=\"declare-title\">Declarações</h2>\n");
            //Autores
            saida.print("\t<div class=\"authors\">\n");
            saida.print("\t\t<h2 class=\"authors-title\">Autores</h2>\n");
            for(String author : script.getAutores()){
                saida.print("\t\t<p class=\"author-item\">");
                saida.print(author);
                saida.print("</p>\n");
            }
            saida.print("\t</div>\n");
            //Personagens
            saida.print("\t<div class=\"characters\">\n");
            saida.print("\t\t<h2 class=\"characters-title\">Personagens</h2>\n");
            for(String character : script.getPersonagens()){
                saida.print("\t\t<p class=\"characters-item\">");
                saida.print(character);
                saida.print("</p>\n");
            }
            saida.print("\t</div>\n");
            //Cenários
            saida.print("\t<div class=\"scenarios\">\n");
            saida.print("\t\t<h2 class=\"scenarios-title\">Cenários</h2>\n");
            for(String scenario : script.getCenarios()){
                saida.print("\t\t<p class=\"scenarios-item\">");
                saida.print(scenario);
                saida.print("</p>\n");
            }
            saida.print("\t</div>\n");
            //Cenas
            saida.print("\t<div class=\"scenes\">\n");
            saida.print("\t\t<h2 class=\"scenes-title\">Cenas</h2>\n");
            for(String cena : script.getOrdemCenas()){
                Cena cenaTmp = script.getCena(cena);
                if(cenaTmp != null){
                    saida.print("\t\t<div class=\"scene \">\n");
                    saida.print("\t\t\t<h3 class=\"scene-title\">Cena: ");
                    saida.print(cena);
                    saida.print("</h3>\n");
                    saida.print("\t\t\t\t<h4 class=\"scene-scenario-title\">Cenario: </h4><p class=\"scene-scenario\">");
                    saida.print(cenaTmp.getCenario());
                    saida.print("</p>");
                    saida.print("\t\t\t\t<h4 class=\"scene-characters\">Personagens: </h4><p>");
                    for(String personagem : cenaTmp.getPersonagens()){
                        saida.print(personagem);
                        saida.print(" ");
                    }
                    saida.print("</p>\n");
                    saida.print("\t\t\t\t<div class=\"scene-cmd\">\n");
                    for(Comando comando : cenaTmp.getComandos()){
                        if(comando.getTipo() == "FALA"){
                            saida.print("\t\t\t\t\t<p class=\"scene-cmd speech\"><span class=\"actor\">");
                            saida.print(comando.getPersonagem());
                            saida.print(":</span> ");
                            saida.print(comando.getData());
                            saida.print("</p>");
                        }else{
                            saida.print("\t\t\t\t\t<p class=\"scene-cmd activity\">");
                            saida.print(comando.getData());
                            saida.print("</p>\n");
                        }
                    }
                    saida.print("\t\t\t\t</div>\n");
                    saida.print("\t\t</div>\n");
                }
            }
            saida.print("\t</div>\n");
            saida.print("</body>\n");
            saida.print("</html>");
            saida.close();
        } catch (IOException e) {
            // do something
        }
    }
    
}
