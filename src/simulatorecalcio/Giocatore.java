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
public class Giocatore {
    protected String nome;
    protected String cognome;
    protected int forza;
    
    public Giocatore(String nome, String cognome, int forza) {
        this.nome = nome;
        this.cognome = cognome;
        this.forza = forza;
    }
    
    public void infortunio(){
        
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getForza() {
        return forza;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setForza(int forza) {
        this.forza = forza;
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
        final Giocatore other = (Giocatore) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.cognome, other.cognome);
    }

    @Override
    public String toString() {
        return nome + " " + cognome + ", " + forza + " di forza";
    }
    
    
}
