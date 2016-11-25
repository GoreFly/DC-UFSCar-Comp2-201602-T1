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

    public TabelaDeSimbolos topo() {
        return pilha.peek();
    }

    public boolean existeSimbolo(String nome) {
        for (TabelaDeSimbolos ts : pilha) {
            if (ts.existeSimbolo(nome)) {
                return true;
            }
        }
        return false;
    }

    public void desempilhar() {
        TabelaDeSimbolos ret = pilha.pop();
        //Saida.println(ret.toString());
    }

    public List getTodasTabelas() {
        return pilha;
    }
    
    // retorna tipo do simbolo
    public String getTipoSimbolo (String nome) {
        TabelaDeSimbolos ts = null;
        
        // procura a tabela que contém o simbolo passado por param
        for (TabelaDeSimbolos aux : pilha) {
            if (aux.existeSimbolo(nome)) {
                ts = aux;
                break;
            }
        }
        
        String tipo = ts.getTipoSimbolo(nome);
        return tipo;        
    }
    
    // retorna a tabela de simbolos se existir tabela com mesmo nome
    public TabelaDeSimbolos existeTabela(String nome) {
        for (TabelaDeSimbolos ts:pilha) {
            if (ts.getEscopo().equals(nome)) {
                return ts;
            }
        }
        return null;
    }
}
