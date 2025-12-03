/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulatorecalcio;

import java.util.Objects;

/**
 *
 * @author casolaro.diego
 */
public class Partita {
    private Squadra squadraCasa;
    private Squadra squadraTrasferta;
    private String risultato;
    
    public Partita(Squadra squadraCasa, Squadra squadraTrasferta){
        this.squadraTrasferta=squadraTrasferta;
        this.squadraCasa=squadraCasa;
    }
    
    public void gioca(){
        
    }
    
    public void evento(){
        
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
