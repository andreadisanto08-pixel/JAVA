package HealthCareClinic;

public class RicoveroDayHospital extends Paziente {
    private double tariffa_base = 100.00;

    public RicoveroDayHospital(String nome,int codiceCartellaClinica,double tariffaBase){
        super(nome, codiceCartellaClinica, tariffaBase);

    }
    
    @Override
    public double calcolaCostoRicovero(int giorni){
        double tariffa_giornaliera = 100.00;

        if(giorni > 5)
        {
            double prezzoScontato = tariffa_giornaliera * ((tariffa_giornaliera * 20)/100);
            return prezzoScontato;
        }
        else
        {
            return tariffa_giornaliera;
        }
    }

}
