package t3cc2;

/**
 *
 * @author daniel
 */
public class EntradaTabelaDeSimbolos {
    private String nome;
    private TipoVariavel tipo; 
    
    public EntradaTabelaDeSimbolos(String nome, TipoVariavel tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public TipoVariavel getTipo() {
        return tipo;
    }
    
    @Override
    public String toString() {
        return nome+"("+tipo+")";
    }
}
