/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulatorecalcio;

import java.util.*;

/**
 * Classe MainSimulatore
 * @author casolaro.diego
 */
public class MainSimulatore {
    public void avvia(){
        Scanner input = new Scanner(System.in);
        
        Squadra sA = new Squadra("Napoli", "Stadio Diego Armando Maradona");

        sA.aggiungiGiocatore(new Portiere("Alex", "Meret", 82, 81));
        sA.aggiungiGiocatore(new Difensore("Giovanni", "Di Lorenzo", 83));
        sA.aggiungiGiocatore(new Difensore("Amir", "Rrahmani", 83));
        sA.aggiungiGiocatore(new Difensore("Alessandro", "Buongiorno", 82));
        sA.aggiungiGiocatore(new Difensore("Miguel", "Gutierrez", 81));
        sA.aggiungiGiocatore(new Centrocampista("Scott", "McTominay", 85));
        sA.aggiungiGiocatore(new Centrocampista("Kevin", "De Bruyne", 87));
        sA.aggiungiGiocatore(new Centrocampista("Stanislav", "Lobotka", 83));
        sA.aggiungiGiocatore(new Centrocampista("Andre'-Franck", "Zambo Anguissa", 82));
        sA.aggiungiGiocatore(new Centrocampista("Billy", "Gilmour", 74));
        sA.aggiungiGiocatore(new Attaccante("Romelu", "Lukaku", 84));
        
        Squadra sB = new Squadra("Malmo FF", "Eleda Stadion");
        
        sB.aggiungiGiocatore(new Portiere("Robin", "Olsen", 73, 77));
        sB.aggiungiGiocatore(new Difensore("Gabriel", "Busanello", 73));
        sB.aggiungiGiocatore(new Difensore("Jens Stryger", "Larsen", 72));
        sB.aggiungiGiocatore(new Difensore("Hugo", "Bolin", 70));
        sB.aggiungiGiocatore(new Centrocampista("Lasse Berg", "Johnsen", 74));
        sB.aggiungiGiocatore(new Centrocampista("Otto", "Rosengren", 71));
        sB.aggiungiGiocatore(new Centrocampista("Pontus", "Jansson", 73));
        sB.aggiungiGiocatore(new Centrocampista("Oliver", "Berg", 67));
        sB.aggiungiGiocatore(new Attaccante("Erik", "Botheim", 71));
        sB.aggiungiGiocatore(new Attaccante("Anders", "Christiansen", 72));
        sB.aggiungiGiocatore(new Attaccante("Daniel", "Guthjohnsen", 73));
        
        Squadra sC = new Squadra("Barcelona FC", "Spotify Camp Nou");
        
        sC.aggiungiGiocatore(new Portiere("Joan", "Garcia", 83, 85));
        sC.aggiungiGiocatore(new Difensore("Alejandro", "Balde", 83));
        sC.aggiungiGiocatore(new Difensore("Pau", "Cubarsi", 82));
        sC.aggiungiGiocatore(new Difensore("Ronald", "Araujo", 83));
        sC.aggiungiGiocatore(new Difensore("Jules", "Kounde", 87));
        sC.aggiungiGiocatore(new Centrocampista("Pedri", "Gonzalez", 89));
        sC.aggiungiGiocatore(new Centrocampista("Frenkie", "De Jong", 87));
        sC.aggiungiGiocatore(new Centrocampista("Dani", "Olmo", 85));
        sC.aggiungiGiocatore(new Attaccante("Raphinha", "Dias", 89));
        sC.aggiungiGiocatore(new Attaccante("Ferran", "Torres", 83));
        sC.aggiungiGiocatore(new Attaccante("Lamine", "Yamal", 89));
        
        int scelta = 0;
        Squadra sCasa = null, sTrasferta = null;
        
        while (scelta < 1 || scelta > 3) {
            System.out.println("Scegli la squadra di casa");
            System.out.println("1. Napoli");
            System.out.println("2. Malmo");
            System.out.println("3. Barcelona");
            scelta = input.nextInt();
            switch (scelta) {
                case 1:
                    sCasa = sA;
                    scelta = 0;
                    while (scelta < 1 || scelta > 2) {
                        System.out.println("Scegli la squadra in trasferta");
                        System.out.println("1. Malmo");
                        System.out.println("2. Barcelona");
                        scelta = input.nextInt();
                        if (scelta == 1)
                            sTrasferta = sB;
                        else if (scelta == 2)
                            sTrasferta = sC;
                    }
                    break;
                case 2:
                    sCasa = sB;
                    scelta = 0;
                    while (scelta < 1 || scelta > 2) {
                        System.out.println("Scegli la squadra in trasferta");
                        System.out.println("1. Napoli");
                        System.out.println("2. Barcelona");
                        scelta = input.nextInt();
                        if (scelta == 1)
                            sTrasferta = sA;
                        else if (scelta == 2)
                            sTrasferta = sC;
                    }
                    break;
                case 3:
                    sCasa = sC;
                    scelta = 0;
                    while (scelta < 1 || scelta > 2) {
                        System.out.println("Scegli la squadra in trasferta");
                        System.out.println("1. Napoli");
                        System.out.println("2. Malmo");
                        scelta = input.nextInt();
                        if (scelta == 1)
                            sTrasferta = sA;
                        else if (scelta == 2)
                            sTrasferta = sB;
                    }
                    break;
                default:
                    break;
            }
        }
        
        
        Partita p = new Partita(sCasa, sTrasferta);
        p.gioca();
        System.out.println(p);
    }
}
