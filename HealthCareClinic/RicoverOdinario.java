package HealthCareClinic;

public class RicoverOdinario extends Paziente {
    private double tariffa_base = 100.00;
    private  boolean pasto_personalizzato;

    public RicoverOdinario(String nome, int codiceCartellaClinica, double tariffaBase, boolean pasto_personalizzato) {
        super(nome, codiceCartellaClinica, tariffaBase);
        this.pasto_personalizzato = pasto_personalizzato;
    }

    @Override
    public double calcolaCostoRicovero(int giorni){

        double tariffa_giornaliera = 100.00;

        if(pasto_personalizzato == true){
            tariffa_giornaliera = tariffa_giornaliera +20.00;
        } else{
            tariffa_giornaliera = tariffa_giornaliera;
        }
        double costoTotale = tariffa_giornaliera * giorni;

        return costoTotale;
    }

    
}