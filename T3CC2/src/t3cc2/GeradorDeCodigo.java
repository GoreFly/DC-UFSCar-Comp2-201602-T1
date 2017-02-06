package t3cc2;

import java.io.File;
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
        printCharacters();
        
    }
    
    public void printStyle(PrintWriter saida){
        //Style
        saida.print("\t<style>\n");

        saida.print("\t.script-title{\n");
        saida.print("\t\tborder-style: solid;\n");
        saida.print("\t\twidth: 1000px;\n");
        saida.print("\t\tborder-width:0px;");
        saida.print("\t\ttext-align:center;");
        saida.print("\t\ttext-shadow: 1px 1px 0px #fff, 3px 2px 0px rgba(0,0,0,0.15);");         
        saida.print("\t}\n");

        saida.print("\t.authors, .characters, .scenarios{\n");
        saida.print("\t\tfont-weight: lighter;\n");
        saida.print("\t\tborder-radius: 8px;\n");
        saida.print("\t\twidth: 1000px;\n");
        saida.print("\t\tborder: 1px solid black;\n");
        saida.print("\t\tpadding-left: 10px;\n");
        saida.print("\t\tmargin-bottom: 10px;\n");
        saida.print("\t}\n");

        saida.print("\t.authors-title, .characters-title, .scenarios-title{\n");
        saida.print("\t\tmargin-top: 10px;\n");
        saida.print("\t}\n");

        saida.print("\t.author-item, .characters-item, .scenarios-item{\n");
        saida.print("\t\tpadding-left: 1cm;\n");
        saida.print("\t}\n");

        saida.print("\t.scene{\n");
        saida.print("\t\tpadding-left: 1cm;\n");
        saida.print("\t}\n");

        saida.print("\t.scene-scenario-title, .scene-characters{\n");
        saida.print("\t\tpadding-left: 1cm;\n");
        saida.print("\t\tmargin-top: 10px;\n");
        saida.print("\t\tmargin-bottom: 10px;\n");
        saida.print("\t}\n");

        saida.print("\t.scene-scenario{\n");
        saida.print("\t\tpadding-left: 2cm;\n");
        saida.print("\t\tfont-weight: lighter;\n");
        saida.print("\t}\n");

        saida.print("\t.scene-cmd{\n");
        saida.print("\t\tpadding-left: 1cm;\n");
        saida.print("\t}\n");

        saida.print("\t.scene-characters-item{\n");
        saida.print("\t\tpadding-left: 1cm;\n");
        saida.print("\t\tfont-weight: lighter;\n");
        saida.print("\t}\n");

        saida.print("\t.actor{\n");
        saida.print("\t\tfont-weight: bold;\n");
        saida.print("\t}\n");

        saida.print("\t.declare-title, .scenes-title{\n");
        saida.print("\t\twidth: 1000px;\n");
        saida.print("\t\ttext-shadow: 1px 1px 0px #fff, 5px 3px 0px rgba(0,0,0,0.15);\n");
        saida.print("\t\ttext-align: center;\n");
        saida.print("\t}\n");

        saida.print("\t.scene{\n");
        saida.print("\t\tborder-radius: 8px;\n");
        saida.print("\t\twidth: 1000px;\n");
        saida.print("\t\tborder: 1px solid black;\n");
        saida.print("\t\tpadding: 10px;\n");
        saida.print("\t\tmargin-bottom: 10px;\n");
        saida.print("\t}\n");

        saida.print("\t.scene-title{\n");
        saida.print("\t\tmargin-top: 10px;\n");
        saida.print("\t}\n");

        saida.print("\t</style>\n");
        saida.print("\n");
    }
    
    public void printScript(){
        try{
            String path = "Script";
            path += script.getNome();
            File file = new File(path);
            file.mkdirs();
            path += "/scriptGeral.html";
            PrintWriter saida = new PrintWriter(path, "UTF-8");
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
            printStyle(saida);
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
                    saida.print("</p>\n");
                    saida.print("\t\t\t\t<h4 class=\"scene-characters\">Personagens: </h4><p class=\"scene-characters-item\">");
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
                            saida.print("</p>\n");
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
            System.out.println(e.toString());
        }
    }
    
    public void printCharacters(){
        try{
            for(String character : script.getPersonagens()){
                String path = "Script";
                path += script.getNome();
                path += "/script" + character + ".html";
                PrintWriter saida = new PrintWriter(path, "UTF-8");
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
                printStyle(saida);
                //Corpo
                saida.print("<body>\n");
                //Titulo com o nome do script
                saida.print("\t<h1 class=\"script-title\">");
                saida.print(script.getNome());
                saida.print("</h1>\n");
                
                //Cenas
                saida.print("\t<div class=\"scenes\">\n");
                saida.print("\t\t<h2 class=\"scenes-title\">Cenas</h2>\n");
                for(String cena : script.getOrdemCenas()){
                    Cena cenaTmp = script.getCena(cena);
                    if(cenaTmp != null){
                        if(cenaTmp.getPersonagens().contains(character)){
                            saida.print("\t\t<div class=\"scene \">\n");
                            saida.print("\t\t\t<h3 class=\"scene-title\">Cena: ");
                            saida.print(cena);
                            saida.print("</h3>\n");
                            saida.print("\t\t\t\t<h4 class=\"scene-scenario-title\">Cenario: </h4><p class=\"scene-scenario\">");
                            saida.print(cenaTmp.getCenario());
                            saida.print("</p>\n");
                            saida.print("\t\t\t\t<h4 class=\"scene-characters\">Personagens: </h4><p class=\"scene-characters-item\">");
                            for(String personagem : cenaTmp.getPersonagens()){
                                saida.print(personagem);
                                saida.print(" ");
                            }
                            saida.print("</p>\n");
                            saida.print("\t\t\t\t<div class=\"scene-cmd\">\n");
                            for(Comando comando : cenaTmp.getComandos()){
                                if(comando.getTipo().equals("FALA")){
                                    saida.print("\t\t\t\t\t<p class=\"scene-cmd speech\"><span class=\"actor\">");
                                    saida.print(comando.getPersonagem());
                                    saida.print(":</span> ");
                                    saida.print(comando.getData());
                                    saida.print("</p>\n");
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
                }
                saida.print("\t</div>\n");
                saida.print("</body>\n");
                saida.print("</html>");
                saida.close();
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
    
}
