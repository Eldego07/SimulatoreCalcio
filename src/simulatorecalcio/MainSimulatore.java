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
                    case "Portiere": g = new Portiere(nome, cognome, overall, overall);
                        break;
                    case "Difensore": g = new Difensore(nome, cognome, overall);
                        break;
                    case "Centrocampista": g = new Centrocampista(nome, cognome, overall);
                        break;
                    case "Attaccante": g = new Attaccante(nome, cognome, overall);
                        break;
                    default: g = null;
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
        Random rnd = new Random();
        
        Squadra sCasa = null, sTrasferta = null;
        String scelta = null;
        boolean valido = false;
        
        
        while (!valido) {
            System.out.println("");
            System.out.println("Inserisci la squadra in casa (Es. Bayern Munchen, FC Barcelona)");
            scelta = input.nextLine();
            for (Squadra sq : squadre) {
                if (sq.getNome().equalsIgnoreCase(scelta)) {
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
                if (sq.getNome().equalsIgnoreCase(scelta)) {
                    sTrasferta = sq;
                    valido = true;
                }
            }
        }
        
        Random rand = new Random();
        Squadra sCasaTitolare = new Squadra(sCasa.getNome(), sCasa.getStadio());
        boolean portiereInserito = false;

        while (sCasaTitolare.getGiocatori().size() < 11) {
            int indice = rand.nextInt(sCasa.getGiocatori().size());
            Giocatore g = sCasa.getGiocatori().get(indice);

            while (sCasaTitolare.getGiocatori().contains(g)) {
                indice = rand.nextInt(sCasa.getGiocatori().size());
                g = sCasa.getGiocatori().get(indice);
            }
            
            while (!portiereInserito) {
                if (g instanceof Portiere portiere) {
                    sCasaTitolare.aggiungiGiocatore(g);
                    portiereInserito = true;
                } else {
                    indice = rand.nextInt(sCasa.getGiocatori().size());
                    g = sCasa.getGiocatori().get(indice);
                }
            }

            if (!(g instanceof Portiere portiere)) {
                sCasaTitolare.aggiungiGiocatore(g);
            }
        }       
        
        Squadra sTrasfertaTitolare = new Squadra(sTrasferta.getNome(), sTrasferta.getStadio());
        portiereInserito = false;
        
        while (sTrasfertaTitolare.getGiocatori().size() < 11) {
            int indice = rand.nextInt(sTrasferta.getGiocatori().size());
            Giocatore g = sTrasferta.getGiocatori().get(indice);

            while (sCasaTitolare.getGiocatori().contains(g)) {
                indice = rand.nextInt(sCasa.getGiocatori().size());
                g = sCasa.getGiocatori().get(indice);
            }
            
            while (!portiereInserito) {
                if (g instanceof Portiere portiere) {
                    sTrasfertaTitolare.aggiungiGiocatore(g);
                    portiereInserito = true;
                } else {
                    indice = rand.nextInt(sTrasferta.getGiocatori().size());
                    g = sTrasferta.getGiocatori().get(indice);
                }
            }

            if (!(g instanceof Portiere portiere)) {
                sTrasfertaTitolare.aggiungiGiocatore(g);
            }
        }  

        
        System.out.println("");
        System.out.println(sCasaTitolare.toString());
        System.out.println("");
        System.out.println(sTrasfertaTitolare.toString());
        System.out.println("");
        gM.stampaStadio(sCasaTitolare, sTrasfertaTitolare);
        Partita p = new Partita(sCasaTitolare, sTrasfertaTitolare);
        p.gioca();
        System.out.println(p);
    }
}
