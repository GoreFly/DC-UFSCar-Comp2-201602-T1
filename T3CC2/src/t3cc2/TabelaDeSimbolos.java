package t3cc2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class TabelaDeSimbolos {
    private List<EntradaTabelaDeSimbolos> simbolos;
    
    public TabelaDeSimbolos() {
        simbolos = new ArrayList<EntradaTabelaDeSimbolos>();
    }
    
    public int adicionarSimbolo(String nome, TipoVariavel tipo) {
        if(jaFoiDeclarado(nome))
            throw new RuntimeException("Erro Semantico: Variavel " + nome + "ja foi declarado");
        
        simbolos.add(new EntradaTabelaDeSimbolos(nome,tipo));
        return simbolos.size()-1;
    }
    
    public boolean jaFoiDeclarado(String nome) {
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            if(etds.getNome().equals(nome))
                return true;
            }
        return false;
    }

    
    public void adicionarSimbolos(List<String> nomes, TipoVariavel tipo) {
        for(String s:nomes) {
            simbolos.add(new EntradaTabelaDeSimbolos(s, tipo));
        }
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
    public TipoVariavel getTipoSimbolo(String nome) {
        for (EntradaTabelaDeSimbolos etds:simbolos) {
            if (etds.getNome().equals(nome)) {
                return etds.getTipo();
            }
        }
        
        return null;
    }
    
    // retorna lista com os nomes dos simbolos
    public List<String> getNomesSimbolos() {
        List<String> atribs = new ArrayList<String>();
        for (int i = 0; i < simbolos.size(); i++) 
            atribs.add("." + simbolos.get(i).getNome());
        
        return atribs;
    }
    
    
    // retorna lista com os simbolos
    public List<EntradaTabelaDeSimbolos> getSimbolos() {
        List<EntradaTabelaDeSimbolos> atribs = new ArrayList<EntradaTabelaDeSimbolos>();
        for (int i = 0; i < simbolos.size(); i++)
            atribs.add(simbolos.get(i));
        
        return atribs;
    }
    
    //Remover entrada pelo nome
    public boolean removeEntrada(String nome){
        if(jaFoiDeclarado(nome)){
            simbolos.remove(getSimbolo(nome));
            return true;
        }
        return false;
    }
    
    //Retorna lista de entradas do tipo recebido
    public List<EntradaTabelaDeSimbolos> getEntradasTipo(TipoVariavel tipo){
        List<EntradaTabelaDeSimbolos> lista = new ArrayList<EntradaTabelaDeSimbolos>();
        for(EntradaTabelaDeSimbolos entrada : simbolos){
            if(entrada.getTipo()== tipo)
                lista.add(entrada);
        }
        return lista;
    }
    
    @Override
    public String toString() {
        String ret = "";
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            ret += "\n   "+etds;
        }
        return ret;
    }
}
