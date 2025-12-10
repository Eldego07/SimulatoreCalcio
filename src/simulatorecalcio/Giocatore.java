/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulatorecalcio;

import java.util.Objects;

/**
 *
 * @author casolaro.diego
 */
public class Giocatore {
    protected String nome;
    protected String cognome;
    protected int forza;
    
    /**Costruttore
     * Costruttore di un Giocatore
     * @param nome nome dell'Giocatore
     * @param cognome cognome dell'Giocatore
     * @param forza forza dell'Giocatore
     */
    public Giocatore(String nome, String cognome, int forza) {
        this.nome = nome;
        this.cognome = cognome;
        this.forza = forza;
    }
    
    /**Metodo Infortunio
     * Infortunio che rimuove la forza all'Giocatore
     * @param danno di quanto si indebolisce l'Giocatore
     */
    public void infortunio(int danno){
        this.forza-=danno;
        if(this.forza<=0){
            this.forza=0;
        }
    }

    /**Metodo getNome
     * 
     * @return restituisce il nome del Giocatore
     */
    public String getNome() {
        return nome;
    }

    /**Metodo getCognome
     * 
     * @return restituisce il cognome del Giocatore
     */
    public String getCognome() {
        return cognome;
    }

    /**Metodo getForza
     * 
     * @return restituisce la forza del Giocatore
     */
    public int getForza() {
        return forza;
    }

    /**Metodo setNome
     * Imposta il Nome del Giocatore
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**Metodo setCognome
     * Imposta il Cognome del Giocatore
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**Metodo setForza
     * Imposta la Forza del Giocatore
     */
    public void setForza(int forza) {
        this.forza = forza;
    }

    /**Override del metodo equals
     * 
     * @param obj giocatore con cui confrontarlo
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
        final Giocatore other = (Giocatore) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.cognome, other.cognome);
    }

    /**Override del metodo toString
     * 
     * @return il nuovo output della classe Giocatore
     */
    @Override
    public String toString() {
        return nome + " " + cognome + ", " + forza + " di forza";
    }
    
    
}
