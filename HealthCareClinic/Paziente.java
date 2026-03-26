package HealthCareClinic;

public abstract class Paziente {
    private String nomeDelPaziente;
    private int codiceCartellaClinica;
    private double tariffaBase;

    public Paziente(String nomeDelPaziente,int codiceCartellaClinica,double tariffaBase){
        this.nomeDelPaziente = nomeDelPaziente;
        this.codiceCartellaClinica = codiceCartellaClinica;
        this.tariffaBase = tariffaBase;
    }

    public abstract double calcolaCostoRicovero();
    
}
