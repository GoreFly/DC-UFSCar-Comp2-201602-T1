/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t3cc2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author gabri
 */
public class SSLVisit extends SSLBaseVisitor<Void>{
        
    public TabelaDeSimbolos tabela;

    public SSLVisit() {
        tabela = new TabelaDeSimbolos();
    }

    @Override
    public Void visitScript(SSLParser.ScriptContext ctx) {
        super.visitScript(ctx); //To change body of generated methods, choose Tools | Templates.
        List<EntradaTabelaDeSimbolos> check = new ArrayList<EntradaTabelaDeSimbolos>();
        check = tabela.getEntradasTipo(TipoVariavel.SCENE);
        if (!check.isEmpty()){
            System.out.print(check.toString());
            String erro = "Cena(s) ";
            for(EntradaTabelaDeSimbolos entrada : check)
                erro += entrada.getNome() + " ";
            throw new RuntimeException(erro + " não declarada(s)");
        }
        
        return null;
    }
    

    @Override
    public Void visitDecl_autores(SSLParser.Decl_autoresContext ctx){
        for(TerminalNode item : ctx.IDENTIFICADOR()){
            tabela.adicionarSimbolo(item.getText(),TipoVariavel.AUTHOR);
        } 
        return null;
    }
    
    @Override
    public Void visitDecl_personagens(SSLParser.Decl_personagensContext ctx){
        for(TerminalNode item : ctx.IDENTIFICADOR()){
            tabela.adicionarSimbolo(item.getText(),TipoVariavel.CHARACTER);
        } 
        return null;
    }
    
    @Override
    public Void visitDecl_cenarios(SSLParser.Decl_cenariosContext ctx){
        for(TerminalNode item : ctx.IDENTIFICADOR()){
            tabela.adicionarSimbolo(item.getText(),TipoVariavel.SCENARIO);
        } 
        return null;
    }
    
    @Override 
    public Void visitOrdem_cenas(SSLParser.Ordem_cenasContext ctx) {
        for(TerminalNode item : ctx.IDENTIFICADOR()){
            tabela.adicionarSimbolo(item.getText(),TipoVariavel.SCENE);
        } 
        return null;
    }
    
    @Override
    public Void visitChamada_personagem(SSLParser.Chamada_personagemContext ctx) {
        if(tabela.getSimbolo(ctx.IDENTIFICADOR().getText()) == null){
            throw new RuntimeException("Personagem " + ctx.IDENTIFICADOR().getText() + " não declarado(Linha " + ctx.getStart().getLine() + ")");
        }
        return null;
    }
    
    @Override
    public Void visitDecl_cenario(SSLParser.Decl_cenarioContext ctx){
        if(tabela.getSimbolo(ctx.IDENTIFICADOR().getText()) == null)
            throw new RuntimeException("Cenário " + ctx.IDENTIFICADOR().getText() + " não declarado(Linha " + ctx.getStart().getLine() + ")");
        return null;
    }
    
    @Override 
    public Void visitCena(SSLParser.CenaContext ctx) {
        tabela.removeEntrada(ctx.IDENTIFICADOR().getText());
        return visitChildren(ctx); 
    }
    
    @Override 
    public Void visitCmd(SSLParser.CmdContext ctx) {
        if(ctx.ACAO() != null){
            String acao = ctx.ACAO().getText();
            Pattern p = Pattern.compile("<([a-z]|[A-Z]|'_')([a-z]|[A-Z]|'_'|[0-9])*>");
            Matcher m = p.matcher(acao);
            while(m.find()){
                String character = m.group().replaceAll("[\\<\\>]", "");
                if(tabela.getSimbolo(character) == null){
                    throw new RuntimeException("Personagem : " + character +" nao declarado (Linha " + ctx.getStart().getLine() + ")");
                }
            }
        }
        super.visitCmd(ctx);
        return null;
    }
}
