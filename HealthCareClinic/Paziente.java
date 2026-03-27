package HealthCareClinic;

public abstract class Paziente {
    private String nome;
    private int codiceCartellaClinica;
    private double tariffaBase;


    public Paziente(String nome, int codiceCartellaClinica, double tariffaBase
    ) {
        this.nome = nome;
        this.codiceCartellaClinica = codiceCartellaClinica;
        this.tariffaBase = tariffaBase;
    }

    public abstract double calcolaCostoRicovero(int giorni);


    public int getCodiceCartellaClinica() {
        return codiceCartellaClinica;
    }
    public String getNome() {
        return nome;
    }
    public double getTariffabase(){
        return tariffaBase;
    }


}
