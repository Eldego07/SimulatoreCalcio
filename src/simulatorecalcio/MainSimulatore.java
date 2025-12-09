/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulatorecalcio;

/**
 *
 * @author casolaro.diego
 */
public class MainSimulatore {
    public void avvia(){
        Squadra sA = new Squadra("Napoli", "Stadio Diego Armando Maradona");
        Giocatore gA1, gA2, gA3, gA4, gA5, gA6, gA7, gA8, gA9, gA10, gA11;
        gA1 = new Portiere("Alex", "Meret", 82, 81);
        gA2 = new Difensore("Giovanni", "Di Lorenzo", 83);
        gA3 = new Difensore("Amir", "Rrahmani", 83);
        gA4 = new Difensore("Alessandro", "Buongiorno", 82);
        gA5 = new Difensore("Miguel", "Gutierrez", 81);
        gA6 = new Centrocampista("Scott", "McTominay", 85);
        gA7 = new Centrocampista("Kevin", "De Bruyne", 87);
        gA8 = new Centrocampista("Stanislav", "Lobotka", 83);
        gA9 = new Centrocampista("Andre'-Franck", "Zambo Anguissa", 82);
        gA10 = new Centrocampista("Billy", "Gilmour", 74);
        gA11 = new Attaccante("Romelu", "Lukaku", 84);
        
        sA.aggiungiGiocatore(gA1);
        sA.aggiungiGiocatore(gA2);
        sA.aggiungiGiocatore(gA3);
        sA.aggiungiGiocatore(gA4);
        sA.aggiungiGiocatore(gA5);
        sA.aggiungiGiocatore(gA6);
        sA.aggiungiGiocatore(gA7);
        sA.aggiungiGiocatore(gA8);
        sA.aggiungiGiocatore(gA9);
        sA.aggiungiGiocatore(gA10);
        sA.aggiungiGiocatore(gA11);
        
        Squadra sB = new Squadra("Malmo FF", "Eleda Stadion");
        Giocatore gB1, gB2, gB3, gB4, gB5, gB6, gB7, gB8, gB9, gB10, gB11;
        gB1 = new Portiere("Robin", "Olsen", 73, 81);
        gB2 = new Difensore("Gabriel", "Busanello", 83);
        gB3 = new Difensore("Jens Stryger", "Larsen", 83);
        gB4 = new Difensore("Hugo", "Bolin", 82);
        gB5 = new Centrocampista("Lasse Berg", "Johnsen", 74);
        gB6 = new Centrocampista("Otto", "Rosengren", 71);
        gB7 = new Centrocampista("Pontus", "Jansson", 73);
        gB8 = new Centrocampista("Oliver", "Berg", 67);
        gB9 = new Attaccante("Erik", "Botheim", 71);
        gB10 = new Attaccante("Anders", "Christiansen", 72);
        gB11 = new Attaccante("Daniel", "Guthjohnsen", 73);
        
        sB.aggiungiGiocatore(gB1);
        sB.aggiungiGiocatore(gB2);
        sB.aggiungiGiocatore(gB3);
        sB.aggiungiGiocatore(gB4);
        sB.aggiungiGiocatore(gB5);
        sB.aggiungiGiocatore(gB6);
        sB.aggiungiGiocatore(gB7);
        sB.aggiungiGiocatore(gB8);
        sB.aggiungiGiocatore(gB9);
        sB.aggiungiGiocatore(gB10);
        sB.aggiungiGiocatore(gB11);
        
        
    }
}
