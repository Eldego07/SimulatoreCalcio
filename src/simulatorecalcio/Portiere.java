/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulatorecalcio;

/**
 * Classe Portiere che eredita da Giocatore
 * @author casolaro.diego
 */
public class Portiere extends Giocatore{
    private int difesa;
    
    /**Costruttore
     * Costruttore di un Portiere
     * @param nome nome del Portiere
     * @param cognome cognome del Portiere
     * @param forza forza del Portiere
     * @param difesa difesa del Portiere
     */
    public Portiere(String nome, String cognome, int forza, int difesa){
        super(nome,cognome,forza);
        this.difesa=difesa;
    }
    
    /**Override del metodo infortunio
     * Infortunio che rimuove la forza al Portiere
     * @param danno di quanto si indebolisce il Portiere
     */
    @Override
    public void infortunio(int danno){
        this.forza-=danno+1;
        if(this.forza<=0){
            this.forza=0;
        }
    }

    /**Metodo getDifesa
     * @return restituisce la difesa del Portiere
     */
    public int getDifesa() {
        return difesa;
    }

    /**Metodo setDifesa
     * Imposta il valore di difesa del Portiere
     */
    public void setDifesa(int difesa) {
        this.difesa = difesa;
    }

    /**Override del metodo equals
     * 
     * @param obj portiere con cui confrontarlo
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
        final Portiere other = (Portiere) obj;
        return this.difesa == other.difesa;
    }

    /**Override del metodo toString
     * 
     * @return il nuovo output della classe Portiere
     */
    @Override
    public String toString() {
        return "portiere {" + super.toString() + ", " + difesa + " di difesa}";
    }
    
    
}
