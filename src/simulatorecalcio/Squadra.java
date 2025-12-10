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
    private int difesaTot;
    private int goal;
    private ArrayList<Giocatore> giocatori;

    /**
     * Metodo Costruttore di Squadra
     * @param nome della squadra
     * @param stadio della squadra
     */
    public Squadra(String nome, String stadio) {
        this.nome = nome;
        this.stadio = stadio;
        this.giocatori = new ArrayList<>(11);
        this.forzaTot = 0;
        this.difesaTot = 0;
        this.goal = 0;
    }

    /**
     * Metodo che aggiunge un giocatore alla squadra
     * @param g il giocatore da aggiungere
     */
    public void aggiungiGiocatore(Giocatore g) {
        if (g != null && !giocatori.contains(g)) {
            if (g instanceof Portiere portiere)
                difesaTot += portiere.getDifesa();
            giocatori.add(g);
            forzaTot += g.getForza();
        }
    }
    
    /**
     * Metodo che rimuove un giocatore dalla squadra
     * @param g il giocatore da rimuovere
     */
    public void rimuoviGiocatore(Giocatore g) {
        if (g != null && giocatori.contains(g)) {
            if (g instanceof Portiere portiere)
                difesaTot -= portiere.getDifesa();
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
    public Giocatore getGiocatoreN(int n) {
        return giocatori.get(n);
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
    public int getDifesaTot() {
        return difesaTot;
    }
    
    /**
     * 
     * @return 
     */
    public int getGoal() {
        return goal;
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
     * @param goal
     */
    public void setGoal(int goal) {
        this.goal = goal;
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
