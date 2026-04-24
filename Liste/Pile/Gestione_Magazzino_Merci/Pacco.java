package Gestione_Magazzino_Merci;
public class Pacco 
{

    private String codice;
    private String descrizione;
    private double peso;
    private Pacco puntatoreNext;

    public Pacco(String codice,String descrizione,double peso){
        this.codice = codice;
        this.descrizione = descrizione;
        this.peso = peso;
        this.puntatoreNext= null;
    }
    
    public String getCodice() {
        return codice;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public Pacco getpuntatoreNext() {
        return puntatoreNext;
    }
    public double getPeso() {
        return peso;
    }
    public void setpuntatoreNext(Pacco puntatoreNext){
        this.puntatoreNext = puntatoreNext;
    }
    public String toString() {
        return "Il codice del pacco è" + codice + "la descrizione è " + descrizione + "il peso è " + peso;

    }
    
}
