package t3cc2;

/**
 *
 * @author daniel
 */
public class Saida {
    public boolean modificado = false;
    private StringBuffer texto = new StringBuffer();
    
    public void println(String txt) {
        modificado = true;
        texto.append(txt).append("\n");
    }
    
    public void clear() {
        texto = new StringBuffer();
    }
    
    public String getTexto() {
        return texto.toString();
    }

    void print(String message) {
        modificado = true;
        texto.append(message);
    }
}
