/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t3cc2;

/**
 *
 * @author gabri
 */
public class Comando{
    String tipo;
    String personagem;
    String data;

    public Comando() {
    }

    public Comando(String tipo, String data) {
        this.tipo = tipo;
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }
            

    @Override
    public String toString() {
        String comando = "";
        comando+= "\t\tTipo :" + tipo + '\n';
        comando+= "\t\tPersonagem: " + personagem + '\n';
        comando+= "\t\tData :" + data + '\n';
        return comando;
    }
}
