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
    public Difensore( String nome, String cognome, int forza) {
        super(nome, cognome, forza);
    }
    
    @Override
    public void infortunio(int danno){
        this.forza-=danno+3;
        if(this.forza<=0){
            this.forza=0;
        }
    }

    @Override
    public String toString() {
        return "difensore {" + super.toString() + "}";
    }
}
