package la_compiler;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class PilhaDeTabelas {

    private LinkedList<TabelaDeSimbolos> pilha;

    public PilhaDeTabelas() {
        pilha = new LinkedList<TabelaDeSimbolos>();
    }

    public void empilhar(TabelaDeSimbolos ts) {
        pilha.push(ts);
    }
    
    public void desempilhar() {
        TabelaDeSimbolos ret = pilha.pop();
        //Saida.println(ret.toString());
    }

    public TabelaDeSimbolos topo() {
        return pilha.peek();
    }
    
    public List getTodasTabelas() {
        return pilha;
    }
    
    // verifica se o símbolo está em alguma tabela de símbolos da pilha de tabelas
    public boolean existeSimbolo(String simbolo) {
        for (TabelaDeSimbolos ts : pilha) {
            if (ts.existeSimbolo(simbolo)) {
                return true;
            }
        }
        return false;
    }
    
    // retorna tipo do simbolo
    public String getTipoSimbolo (String simbolo) {
        TabelaDeSimbolos ts = null;
        
        // procura a tabela que contém o simbolo passado por param
        for (TabelaDeSimbolos aux : pilha) {
            if (aux.existeSimbolo(simbolo)) {
                ts = aux;
                break;
            }
        }
        
        String tipo = ts.getTipoSimbolo(simbolo);
        return tipo;        
    }
    
    // retorna a tabela de simbolos se existir tabela com mesmo nome
    public TabelaDeSimbolos existeTabela(String simbolo) {
        for (TabelaDeSimbolos ts:pilha) {
            if (ts.getEscopo().equals(simbolo)) {
                return ts;
            }
        }
        return null;
    }
    
    // Retorna a tabela que contém o símbolo
    public TabelaDeSimbolos getTabelaSimbolo(String simbolo) {
        for (TabelaDeSimbolos ts : pilha) {
            if (ts.existeSimbolo(simbolo)) {
                return ts;
            }
        }
        return null;
    }
}
