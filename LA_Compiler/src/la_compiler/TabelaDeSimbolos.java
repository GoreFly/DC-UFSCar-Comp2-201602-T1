package la_compiler;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class TabelaDeSimbolos {
    private String escopo;
    private List<EntradaTabelaDeSimbolos> simbolos;
    
    public TabelaDeSimbolos(String escopo) {
        simbolos = new ArrayList<EntradaTabelaDeSimbolos>();
        this.escopo = escopo;
    }
    
    public void adicionarSimbolo(String nome, String tipo) {
        simbolos.add(new EntradaTabelaDeSimbolos(nome,tipo));
    }
    
    public void adicionarSimbolos(List<String> nomes, String tipo) {
        for(String s:nomes) {
            simbolos.add(new EntradaTabelaDeSimbolos(s, tipo));
        }
    }
    
    public boolean existeSimbolo(String nome) {
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            if(etds.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }
    
    // retorna um simbolo
    public EntradaTabelaDeSimbolos getSimbolo (String nome) {
        for (EntradaTabelaDeSimbolos etds:simbolos) {
            if (etds.getNome().equals(nome)) {
                return etds;
            }
        }
        return null;
    }
    
    // retorna tipo do simbolo
    public String getTipoSimbolo(String nome) {
        for (EntradaTabelaDeSimbolos etds:simbolos) {
            if (etds.getNome().equals(nome)) {
                return etds.getTipo();
            }
        }
        
        return "NONE";
    }
    
    // retorna o escopo
    public String getEscopo() {
        return this.escopo;
    }
    
    // retorna lista com os nomes dos simbolos
    public List<String> getNomesSimbolos() {
        List<String> atribs = new ArrayList<String>();
        for (int i = 0; i < simbolos.size(); i++) 
            atribs.add("." + simbolos.get(i).getNome());
        
        return atribs;
    }
    
    // retorna lista com os tipos dos simbolos
    public List<String> getTiposSimbolos() {
        List<String> atribs = new ArrayList<String>();
        for (int i = 0; i < simbolos.size(); i++) 
            atribs.add(simbolos.get(i).getTipo());
        
        return atribs;
    }
    
    // retorna lista com os simbolos
    public List<EntradaTabelaDeSimbolos> getSimbolos() {
        List<EntradaTabelaDeSimbolos> atribs = new ArrayList<EntradaTabelaDeSimbolos>();
        for (int i = 0; i < simbolos.size(); i++)
            atribs.add(simbolos.get(i));
        
        return atribs;
    }
    
    @Override
    public String toString() {
        String ret = "Escopo: "+escopo;
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            ret += "\n   "+etds;
        }
        return ret;
    }
}
