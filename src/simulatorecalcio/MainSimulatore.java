/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulatorecalcio;

import java.util.*;
import java.io.*;

/**
 * Classe MainSimulatore
 * @author casolaro.diego
 */
public class MainSimulatore {
    public void avvia(){
        ArrayList<Giocatore> lista = new ArrayList<>();
        ArrayList<Squadra> squadre = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("calciatoriFOFA.txt"))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] campi = linea.split(",");

                String nome = campi[0];
                String cognome = campi[1];
                int overall = Integer.parseInt(campi[2]);
                String ruolo = campi[3];
                String squadra = campi[4];
                Giocatore g;
                Squadra s = null;
                
                switch (ruolo) {
                    case "Portiere":
                        g = new Portiere(nome, cognome, overall, overall);
                        break;
                    case "Difensore":
                        g = new Difensore(nome, cognome, overall);
                        break;
                    case "Centrocampista":
                        g = new Centrocampista(nome, cognome, overall);
                        break;
                    case "Attaccante":
                        g = new Attaccante(nome, cognome, overall);
                        break;
                    default:
                        g = null;
                        break;
                }
                
                for (Squadra sq : squadre) {
                    if (sq.getNome().equals(squadra)) {
                    s = sq;
                    break;
                    }
                }
                
                if (s == null) {
                    s = new Squadra(squadra, squadra);
                    squadre.add(s);
                }
                
                if (g != null) {
                    s.aggiungiGiocatore(g);
                }

                lista.add(g);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Stampa di controllo
        for (Squadra sq : squadre) {
            System.out.println(sq.getNome());
        }
        
        GestoreMessaggi gM = new GestoreMessaggi();
        Scanner input = new Scanner(System.in);
        
        Squadra sCasa = null, sTrasferta = null;
        String scelta = null;
        boolean valido = false;
        
        
        while (!valido) {
            System.out.println("");
            System.out.println("Inserisci la squadra in casa (Es. Bayern Munchen, FC Barcelona)");
            scelta = input.nextLine();
            for (Squadra sq : squadre) {
                if (sq.getNome().equals(scelta)) {
                    sCasa = sq;
                    valido = true;
                }
            }
        }
        
        valido = false;
        
        while (!valido) {
            System.out.println("");
            System.out.println("Inserisci la squadra in trasferta (Es. Bayern Munchen, FC Barcelona)");
            scelta = input.nextLine();
            for (Squadra sq : squadre) {
                if (sq.getNome().equals(scelta)) {
                    sTrasferta = sq;
                    valido = true;
                }
            }
        }
        

        
        System.out.println("");
        gM.stampaStadio(sCasa, sTrasferta);
        Partita p = new Partita(sCasa, sTrasferta);
        p.gioca();
        System.out.println(p);
    }
}
