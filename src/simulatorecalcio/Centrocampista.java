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
    public Centrocampista(String nome, String cognome, int forza){
        super (nome, cognome, forza);
    }
    public void infortunio(){

    }

    @Override
    public String toString() {
        return "Centrocampista{}";
    }
}
