/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulatorecalcio;

/**
 *
 * @author casolaro.diego
 */
public class Portiere extends Giocatore{
    private int difesa;
    
    public Portiere(String nome, String cognome, int forza, int difesa){
        super(nome,cognome,forza);
        this.difesa=difesa;
    }
    
    @Override
    public void infortunio(int danno){
        this.forza-=danno+1;
    }

    public int getDifesa() {
        return difesa;
    }

    public void setDifesa(int difesa) {
        this.difesa = difesa;
    }


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

    @Override
    public String toString() {
        return "Portiere{" + "difesa=" + difesa + '}';
    }
    
    
}
