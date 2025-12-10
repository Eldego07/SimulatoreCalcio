/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulatorecalcio;

/**
 *
 * @author casolaro.diego
 */
public class Attaccante extends Giocatore{

    /**Costruttore
     * Costruttore di un Attaccante
     * @param nome nome dell'Attaccante
     * @param cognome cognome dell'Attaccante
     * @param forza forza dell'Attaccante
     */
    public Attaccante( String nome, String cognome, int forza) {
        super(nome, cognome, forza);
    }
    
    /**Override del metodo infortunio
     * Infortunio che rimuove la forza all'Attaccante
     * @param danno di quanto si indebolisce l'Attaccante
     */
    @Override
    public void infortunio(int danno){
        this.forza-=danno+5;
        if(this.forza<=0){
            this.forza=0;
        }
    }

    /**Override del metodo toString
     * 
     * @return il nuovo output della classe Attaccante
     */
    
    @Override
    public String toString() {
        return "attaccante {" + super.toString() + "}";
    }
}
