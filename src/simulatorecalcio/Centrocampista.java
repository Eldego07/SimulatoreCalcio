/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulatorecalcio;

/**
 * Classe Centrocampista che eredita da Giocatore
 * @author casolaro.diego
 */
public class Centrocampista extends Giocatore {
    
    /**Costruttore
     * Costruttore di un Centrocampista
     * @param nome nome del Centrocampista
     * @param cognome cognome del Centrocampista
     * @param forza forza del Centrocampista
     */
    public Centrocampista(String nome, String cognome, int forza){
        super (nome, cognome, forza);
    }
    
    /**Override del metodo infortunio
     * Infortunio che rimuove la forza al Centrocampista
     * @param danno di quanto si indebolisce il Centrocampista
     */
    @Override
    public void infortunio(int danno){
        this.forza-=danno+4;
        if(this.forza<=0){
            this.forza=0;
        }
    }

    /**Override del metodo toString
     * 
     * @return il nuovo output della classe Centrocampista
     */
    @Override
    public String toString() {
        return "centrocampista {" + super.toString() + "}";
    }
}
