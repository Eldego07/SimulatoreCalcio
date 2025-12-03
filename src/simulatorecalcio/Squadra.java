/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulatorecalcio;

import java.util.*;

/**
 * Classe Squadra
 * @author casolaro.diego
 */
public class Squadra {
    private String nome;
    private String stadio;
    private int forzaTot;
    private ArrayList<Giocatore> giocatori;

    /**
     * 
     * @param nome
     * @param stadio 
     */
    public Squadra(String nome, String stadio) {
        this.nome = nome;
        this.stadio = stadio;
        this.giocatori = new ArrayList<>(11);
        this.forzaTot = 0;
    }

    /**
     * 
     * @param g 
     */
    public void aggiungiGiocatore(Giocatore g) {
        if (g != null && !giocatori.contains(g)) {
            giocatori.add(g);
            forzaTot += g.getForza();
        }
    }
    
    /**
     * 
     * @param g 
     */
    public void rimuoviGiocatore(Giocatore g) {
        if (g != null && giocatori.contains(g)) {
            giocatori.remove(g);
            forzaTot -= g.getForza();
        }
    }
    
    /**
     * 
     * @return 
     */
    public String getNome() {
        return nome;
    }

    /**
     * 
     * @return 
     */
    public String getStadio() {
        return stadio;
    }

    /**
     * 
     * @return 
     */
    public int getForzaTot() {
        return forzaTot;
    }

    /**
     * 
     * @return 
     */
    public ArrayList<Giocatore> getGiocatori() {
        return giocatori;
    }

    /**
     * 
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * 
     * @param stadio 
     */
    public void setStadio(String stadio) {
        this.stadio = stadio;
    }

    /**
     * 
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Squadra other = (Squadra) obj;
        return Objects.equals(this.nome, other.nome);
    }

    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "La squadra " + nome + " ha come stadio " + stadio + ", la forza totale " + forzaTot + " e i suoi giocatori sono " + giocatori;
    }
}
