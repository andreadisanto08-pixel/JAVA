package Casello_autostradale_code;

public class Auto{
    private String targa;
    private double pedaggio;
    private Auto puntatoreNext;

    public Auto(String targa,double pedaggio){
        this.pedaggio = pedaggio;
        this.targa = targa;
        this.puntatoreNext = null;
    }
    public double getPedaggio() {
        return pedaggio;
    }
    public Auto getPuntatoreNext() {
        return puntatoreNext;
    }
    public String getTarga() {
        return targa;
    }

    public void setPuntatore(Auto puntatoreNext) {
        this.puntatoreNext = puntatoreNext;
    }


}