/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulatorecalcio;

/**
 *
 * @author casolaro.diego
 */
public class Difensore extends Giocatore{
    
    /**Costruttore
     * Costruttore di un Difensore
     * @param nome nome dell'Difensore
     * @param cognome cognome dell'Difensore
     * @param forza forza dell'Difensore
     */
    public Difensore( String nome, String cognome, int forza) {
        super(nome, cognome, forza);
    }
    
    /**Override del metodo infortunio
     * Infortunio che rimuove la forza all'Difensore
     * @param danno di quanto si indebolisce l'Difensore
     */
    @Override
    public void infortunio(int danno){
        this.forza-=danno+3;
        if(this.forza<=0){
            this.forza=0;
        }
    }

    /**Override del metodo toString
     * 
     * @return il nuovo output della classe Difensore
     */
    @Override
    public String toString() {
        return "difensore {" + super.toString() + "}";
    }
}
