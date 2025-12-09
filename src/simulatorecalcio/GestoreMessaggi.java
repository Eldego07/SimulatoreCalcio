/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulatorecalcio;

/**
 *
 * @author tadde
 */
public class GestoreMessaggi {
    public void stampaGoal(Squadra s, Giocatore g) {
        System.out.println("Il giocatore " + g.toString() + " della squadra " + s.getNome() + " ha segnato");
    }
    
    public void stampaInfortunio(Squadra s, Giocatore g) {
        System.out.println("Il giocatore " + g.toString() + " della squadra " + s.getNome() + " si e' infortunato");
    }    
}
