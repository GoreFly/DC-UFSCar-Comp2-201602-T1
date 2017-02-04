/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t3cc2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabri
 */
public class Cena{
        String nome;
        String cenario;
        List<Comando> comandos;
        List<String> personagens;

        public Cena() {
            comandos = new ArrayList<Comando>();
            personagens = new ArrayList<String>();
        }

        public Cena(String nome, String cenario, List<Comando> comandos, List<String> personagens) {
            this.nome = nome;
            this.cenario = cenario;
            this.comandos = comandos;
            this.personagens = personagens;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCenario() {
            return cenario;
        }

        public void setCenario(String cenario) {
            this.cenario = cenario;
        }

        public List<Comando> getComandos() {
            return comandos;
        }

        public void setComandos(List<Comando> comandos) {
            this.comandos = comandos;
        }
        
        public void addComandos(Comando comando){
            comandos.add(comando);
        }
        
        public void removeComandos(Comando comando){
            comandos.remove(comandos.indexOf(comando));
        }

        public List<String> getPersonagens() {
            return personagens;
        }

        public void setPersonagens(List<String> personagens) {
            this.personagens = personagens;
        }
        
        public void addPersonagens(String personagem){
            if(!personagens.contains(personagem))
                personagens.add(personagem);
        }
        
        public void removePersonagens(String personagem){
            personagens.remove(personagens.indexOf(personagem));
        }

        @Override
        public String toString() {
            String cena = "";
            cena+= "\tNome :" + nome + '\n';
            cena+= "\tCenario :" + cenario + '\n';
            cena+= "\tComandos :\n" + comandos.toString() + '\n';
            cena+= "\tPersonagens : " + personagens + '\n';
            return cena;
        }
        
    }