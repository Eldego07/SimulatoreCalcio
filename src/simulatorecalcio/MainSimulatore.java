/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulatorecalcio;

import java.util.*;

/**
 *
 * @author casolaro.diego
 */
public class MainSimulatore {
    public void avvia(){
        Scanner input = new Scanner(System.in);
        
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
        gB1 = new Portiere("Robin", "Olsen", 73, 77);
        gB2 = new Difensore("Gabriel", "Busanello", 73);
        gB3 = new Difensore("Jens Stryger", "Larsen", 72);
        gB4 = new Difensore("Hugo", "Bolin", 70);
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
        
        Squadra sC = new Squadra("Barcelona FC", "Spotify Camp Nou");
        Giocatore gC1, gC2, gC3, gC4, gC5, gC6, gC7, gC8, gC9, gC10, gC11;
        gC1 = new Portiere("Joan", "Garcia", 83, 85);
        gC2 = new Difensore("Alejandro", "Balde", 83);
        gC3 = new Difensore("Pau", "Cubarsi", 82);
        gC4 = new Difensore("Ronald", "Araujo", 83);
        gC5 = new Difensore("Jules", "Kounde", 87);
        gC6 = new Centrocampista("Pedri", "Gonzalez", 89);
        gC7 = new Centrocampista("Frenkie", "De Jong", 87);
        gC8 = new Centrocampista("Dani", "Olmo", 85);
        gC9 = new Attaccante("Raphinha", "Dias", 89);
        gC10 = new Attaccante("Ferran", "Torres", 83);
        gC11 = new Attaccante("Lamine", "Yamal", 89);
        
        sC.aggiungiGiocatore(gC1);
        sC.aggiungiGiocatore(gC2);
        sC.aggiungiGiocatore(gC3);
        sC.aggiungiGiocatore(gC4);
        sC.aggiungiGiocatore(gC5);
        sC.aggiungiGiocatore(gC6);
        sC.aggiungiGiocatore(gC7);
        sC.aggiungiGiocatore(gC8);
        sC.aggiungiGiocatore(gC9);
        sC.aggiungiGiocatore(gC10);
        sC.aggiungiGiocatore(gC11);
        
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
