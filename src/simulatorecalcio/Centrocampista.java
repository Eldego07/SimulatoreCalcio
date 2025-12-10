/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulatorecalcio;

/**
 *
 * @author casolaro.diego
 */
public class Centrocampista extends Giocatore {
    
    /**Costruttore
     * Costruttore di un Centrocampista
     * @param nome nome dell'Centrocampista
     * @param cognome cognome dell'Centrocampista
     * @param forza forza dell'Centrocampista
     */
    public Centrocampista(String nome, String cognome, int forza){
        super (nome, cognome, forza);
    }
    
    /**Override del metodo infortunio
     * Infortunio che rimuove la forza all'Centrocampista
     * @param danno di quanto si indebolisce l'Centrocampista
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
