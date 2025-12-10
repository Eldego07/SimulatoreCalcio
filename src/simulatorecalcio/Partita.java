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
public class Partita {
    private Squadra squadraCasa;
    private Squadra squadraTrasferta;
    private String risultato;
    private int forzaC, forzaT;
    private Random random=new Random();
    private GestoreMessaggi gM;
   
    public Partita(Squadra squadraCasa, Squadra squadraTrasferta){
        this.squadraTrasferta=squadraTrasferta;
        this.squadraCasa=squadraCasa;
        forzaC=this.squadraCasa.getForzaTot();
        forzaT=this.squadraTrasferta.getForzaTot();
        this.gM = new GestoreMessaggi();
    }
   
    public void gioca(){
        for(int i=0;i<90;i++){
            int prob=random.nextInt(0,100),danno,rndGioca;
            boolean squadraScelta;
            rndGioca = random.nextInt(0,11);
            if(forzaC>=(forzaT*1.5)&&prob>3&&prob<26){
                //codice di richiamo per mettere un gol alla squadra 1
                prob=random.nextInt(0,100);
                if(prob>25&&prob<55){
                    squadraTrasferta.setGoal(squadraTrasferta.getGoal() + 1);
                    gM.stampaGoal(squadraTrasferta, squadraTrasferta.getGiocatoreN(rndGioca));
                }
                else{
                    squadraCasa.setGoal(squadraCasa.getGoal() + 1);
                    gM.stampaGoal(squadraCasa, squadraCasa.getGiocatoreN(rndGioca));
                }
            }
            else if(forzaC>forzaT&&prob>3&&prob<13){
                //codice di richiamo per mettere un gol alla squadra 1
                prob=random.nextInt(0,100);
                if(prob>25&&prob<70){
                    squadraTrasferta.setGoal(squadraTrasferta.getGoal() + 1);
                    gM.stampaGoal(squadraTrasferta, squadraTrasferta.getGiocatoreN(rndGioca));
                }
                else{
                    squadraCasa.setGoal(squadraCasa.getGoal() + 1);
                    gM.stampaGoal(squadraCasa, squadraCasa.getGiocatoreN(rndGioca));
                }
            }
            else if(forzaC<forzaT/1.5&&prob>3&&prob<26){
                //codice di richiamo per mettere un gol alla squadra 2
                prob=random.nextInt(0,100);
                if(prob>25&&prob<50){
                    squadraCasa.setGoal(squadraCasa.getGoal() + 1);
                    gM.stampaGoal(squadraCasa, squadraCasa.getGiocatoreN(rndGioca));
                }
                else {
                    squadraTrasferta.setGoal(squadraTrasferta.getGoal() + 1);
                    gM.stampaGoal(squadraTrasferta, squadraTrasferta.getGiocatoreN(rndGioca));
                }
            }
            else if(forzaC<=forzaT&&prob>3&&prob<13){
                //codice di richiamo per mettere un gol alla squadra 2
                prob=random.nextInt(0,100);
                if(prob>25&&prob<70){
                    squadraCasa.setGoal(squadraCasa.getGoal() + 1);
                    gM.stampaGoal(squadraCasa, squadraCasa.getGiocatoreN(rndGioca));
                }
                else{
                    squadraTrasferta.setGoal(squadraTrasferta.getGoal() + 1);
                    gM.stampaGoal(squadraTrasferta, squadraTrasferta.getGiocatoreN(rndGioca));
                }
            }
            //codice di richiamo all'infortunio
            if(prob >= 0 && prob <= 3){
                danno = random.nextInt(1,50);
                squadraScelta = random.nextBoolean();
                rndGioca = random.nextInt(0,11);
                if(squadraScelta){
                   squadraCasa.getGiocatoreN(rndGioca).infortunio(danno);
                   gM.stampaInfortunio(squadraCasa, squadraCasa.getGiocatoreN(rndGioca));
                }
                else{
                   squadraTrasferta.getGiocatoreN(rndGioca).infortunio(danno);
                   gM.stampaInfortunio(squadraTrasferta, squadraTrasferta.getGiocatoreN(rndGioca));
                }
            }
        }
    }

    public Squadra getSquadraCasa() {
        return squadraCasa;
    }

    public void setSquadraCasa(Squadra squadraCasa) {
        this.squadraCasa = squadraCasa;
    }

    public Squadra getSquadraTrasferta() {
        return squadraTrasferta;
    }

    public void setSquadraTrasferta(Squadra squadraTrasferta) {
        this.squadraTrasferta = squadraTrasferta;
    }

    public String getRisultato() {
        return risultato;
    }

    public void setRisultato(String risultato) {
        this.risultato = risultato;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Partita other = (Partita) obj;
        if (!Objects.equals(this.risultato, other.risultato)) {
            return false;
        }
        if (!Objects.equals(this.squadraCasa, other.squadraCasa)) {
            return false;
        }
        return Objects.equals(this.squadraTrasferta, other.squadraTrasferta);
    }

    @Override
    public String toString() {
        return "La partita fra la squadra di casa " + squadraCasa.getNome() + " e la squadra di trasferta " + squadraTrasferta.getNome() + " e' finita " + squadraCasa.getGoal() + " - " + squadraTrasferta.getGoal();
    }
}
