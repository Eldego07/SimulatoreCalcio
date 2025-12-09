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
    private Random random=new Random();
    private GestoreMessaggi gM;
   
    public Partita(Squadra squadraCasa, Squadra squadraTrasferta){
        this.squadraTrasferta=squadraTrasferta;
        this.squadraCasa=squadraCasa;
        this.gM = new GestoreMessaggi();
    }
   
    public void gioca(){
        for(int i=0;i<90;i++){
            int prob=random.nextInt(0,100),danno,rndGioca;
            boolean squadraScelta;
            if(squadraCasa.getForzaTot()>=(squadraTrasferta.getForzaTot()*2)&&prob>3&&prob<26){
                //codice di richiamo per mettere un gol alla squadra 1
                squadraCasa.setGoal(squadraCasa.getGoal() + 1);
                gM.stampaGoal(squadraCasa);
            }
            else if(squadraCasa.getForzaTot()>squadraTrasferta.getForzaTot()&&prob>3&&prob<13){
                //codice di richiamo per mettere un gol alla squadra 1
                squadraCasa.setGoal(squadraCasa.getGoal() + 1);
                gM.stampaGoal(squadraCasa);
            }
            else if(squadraCasa.getForzaTot()<squadraTrasferta.getForzaTot()/2&&prob>3&&prob<26){
                //codice di richiamo per mettere un gol alla squadra 2
                squadraTrasferta.setGoal(squadraTrasferta.getGoal() + 1);
                gM.stampaGoal(squadraTrasferta);
            }
            else if(squadraCasa.getForzaTot()<=squadraTrasferta.getForzaTot()&&prob>3&&prob<13){
                //codice di richiamo per mettere un gol alla squadra 2
                squadraTrasferta.setGoal(squadraTrasferta.getGoal() + 1);
                gM.stampaGoal(squadraTrasferta);
            }
            //codice di richiamo all'infortunio
            if(prob >= 0 && prob <= 3){
                danno = random.nextInt(1,50);
                squadraScelta = random.nextBoolean();
                rndGioca = random.nextInt(0,11);
                if(squadraScelta){
                   squadraCasa.getGiocatoreN(rndGioca).infortunio(danno);
                }
                else{
                   squadraTrasferta.getGiocatoreN(rndGioca).infortunio(danno);
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
        return "Partita{" + "squadraCasa=" + squadraCasa + ", squadraTrasferta=" + squadraTrasferta + ", risultato=" + risultato + '}';
    }
}
