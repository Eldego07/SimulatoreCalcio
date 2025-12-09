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

    public Attaccante( String nome, String cognome, int forza) {
        super(nome, cognome, forza);
    }
    
    @Override
    public void infortunio(int danno){
        this.forza-=danno+5;
        if(this.forza<=0){
            this.forza=0;
        }
    }

    @Override
    public String toString() {
        return "attaccante {" + super.toString() + "}";
    }
}
