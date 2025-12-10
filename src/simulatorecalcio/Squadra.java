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
     * Metodo get dell'attributo nome
     * @return l'attributo nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo get dell'attributo giocatori
     * @param n l'indice del giocatore da restituire
     * @return il giocatore
     */
    public Giocatore getGiocatoreN(int n) {
        return giocatori.get(n);
    }
    
    /**
     * Metodo get dell'attributo stadio
     * @return l'attributo stadio
     */
    public String getStadio() {
        return stadio;
    }

    /**
     * Metodo get dell'attributo forzaTot
     * @return l'attributo forzaTot
     */
    public int getForzaTot() {
        return forzaTot;
    }

    /**
     * Metodo get dell'attributo difesaTot
     * @return l'attributo difesaTot
     */
    public int getDifesaTot() {
        return difesaTot;
    }
    
    /**
     * Metodo get dell'attributo goal
     * @return l'attributo goal
     */
    public int getGoal() {
        return goal;
    }
    
    /**
     * Metodo get dell'attributo giocatori
     * @return l'attributo giocatori
     */
    public ArrayList<Giocatore> getGiocatori() {
        return giocatori;
    }

    /**
     * Metodo set dell'attributo nome
     * @param nome il nome da impostare
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Metodo set dell'attributo stadio
     * @param stadio lo stadio da impostare
     */
    public void setStadio(String stadio) {
        this.stadio = stadio;
    }
    
    /**
     * Metodo set dell'attributo goal
     * @param goal i goal da impostare
     */
    public void setGoal(int goal) {
        this.goal = goal;
    }

    /**Override del metodo equals
     * 
     * @param obj squadra con cui confrontarla
     * @return true se è uguale
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

    /**Override del metodo toString
     * 
     * @return il nuovo output della classe Squadra
     */
    @Override
    public String toString() {
        return "La squadra " + nome + " ha come stadio " + stadio + ", la forza totale " + forzaTot + " e i suoi giocatori sono " + giocatori;
    }
}
