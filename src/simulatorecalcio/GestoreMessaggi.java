/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulatorecalcio;

/**
 * Classe GestoreMessaggi
 * @author tadde
 */
public class GestoreMessaggi {
    /**
     * Metodo che stampa un goal
     * @param s la squadra che ha fatto goal
     * @param g il giocatore che ha fatto goal
     * @param i il minuto in cui e' stato fatto il goal
     */
    public void stampaGoal(Squadra s, Giocatore g, int i) {
        System.out.println("Il giocatore " + g.toString() + " della squadra " + s.getNome() + " ha segnato al "+i+"'");
        System.out.println("");
    }
    
    /**
     * Metodo che stampa un infortunio
     * @param s la squadra che ha subito un infortunio
     * @param g il giocatore che ha subito un infortunio
     * @param i il minuto in cui e' avvenuto l'infortunio
     */
    public void stampaInfortunio(Squadra s, Giocatore g,int i) {
        System.out.println("Il giocatore " + g.toString() + " della squadra " + s.getNome() + " si e' infortunato al "+i+"'");
        System.out.println("");
    }    
    
     /**
     * Metodo che stampa lo stadio e le squadre prima della partita
     * @param s1 la squadra in casa
     * @param s2 la squadra in trasferta
     */
    public void stampaStadio(Squadra s1, Squadra s2) {
        System.out.println("-== Benvenuti allo stadio " + s1.getStadio() + ", dove giocheranno " + s1.getNome() + " e " + s2.getNome() + "! ==-");
        System.out.println("");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.getLogger(GestoreMessaggi.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }    
}
