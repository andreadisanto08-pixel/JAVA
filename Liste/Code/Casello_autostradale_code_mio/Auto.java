package Casello_autostradale_code_mio;

public class Auto {
    private String targa;
    private double tasseggio;
    private Auto puntatoreNext;
    public Auto(String targa,double tasseggio){  
        this.targa = targa;
        this.tasseggio = tasseggio;
        this.puntatoreNext = null;
    }
    public Auto getPuntatoreNext() {
        return puntatoreNext;
    }
    public String getTarga() {
        return targa;
    }
    public double getTasseggio() {
        return tasseggio;
    }
    public void setPuntatoreNext(Auto puntatoreNext) {
        this.puntatoreNext = puntatoreNext;
    }
   
}