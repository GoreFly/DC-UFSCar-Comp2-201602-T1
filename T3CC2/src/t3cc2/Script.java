/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t3cc2;

import java.util.ArrayList;
import java.util.List;

public class Script {
    
    String nome;
    List<String> autores;
    List<String> personagens;
    List<String> cenarios;
    List<String> ordemCenas;
    List<Cena> cenas;
    
    
    
    public Script() {
        autores = new ArrayList<String>();
        personagens = new ArrayList<String>();
        cenarios = new ArrayList<String>();
        ordemCenas = new ArrayList<String>();
        cenas = new ArrayList<Cena>();
    }

    public Script(String nome, List<String> autores, List<String> personagens, List<String> cenarios, List<String> ordemCenas, List<Cena> cenas) {
        this.nome = nome;
        this.autores = autores;
        this.personagens = personagens;
        this.cenarios = cenarios;
        this.ordemCenas = ordemCenas;
        this.cenas = cenas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getAutores() {
        return autores;
    }

    public void setAutores(List<String> autores) {
        this.autores = autores;
    }
    
    public void addAutores(String autor){
        autores.add(autor);
    }
    
    public void removeAutores(String autor){
        autores.remove(autores.indexOf(autor));
    }

    public List<String> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<String> personagens) {
        this.personagens = personagens;
    }
    
    public void addPersonagens(String personagem){
        personagens.add(personagem);
    }
    
    public void removePersonagens(String personagem){
        personagens.remove(personagens.indexOf(personagem));
    }

    public List<String> getCenarios() {
        return cenarios;
    }

    public void setCenarios(List<String> cenarios) {
        this.cenarios = cenarios;
    }
    
    public void addCenarios(String cenario){
        cenarios.add(cenario);
    }
    
    public void removeCenarios(String cenario){
        cenarios.remove(cenarios.indexOf(cenario));
    }

    public List<String> getOrdemCenas() {
        return ordemCenas;
    }

    public void setOrdemCenas(List<String> ordemCenas) {
        this.ordemCenas = ordemCenas;
    }
    
    public void addOrdemCenas(String cena){
        ordemCenas.add(cena);
    }
    
    public void removeOrdemCenas(String cena){
        ordemCenas.remove(ordemCenas.indexOf(cena));
    }

    public List<Cena> getCenas() {
        return cenas;
    }

    public void setCenas(List<Cena> cenas) {
        this.cenas = cenas;
    }
    
    public void addCenas(Cena cena){
        cenas.add(cena);
    }
    
    public void removeCenas(Cena cena){
        cenas.remove(cenas.indexOf(cena));
    }
    
    public Cena getCena(String nome){
        for(Cena cena : cenas){
            if (cena.getNome().equals(nome))
                    return cena;
        }
        return null;
    }

    @Override
    public String toString() {
        String script = "";
        script+= "Nome :" + nome + '\n';
        script+= "Autores :" + autores + '\n';
        script+= "Personagens :" + personagens + '\n';
        script+= "Cenarios : " + cenarios + '\n';
        script+= "Ordem Cenas :" + ordemCenas + '\n';
        script+= "Cenas : \n" + cenas.toString() + '\n';
        
        return script;
    } 
}

