package Gestione_Magazzino_Merci;
public class Pacco 
{

    private String codice;
    private String descrizione;
    private double peso;
    private Pacco next;

    public Pacco(String codice,String descrizione,double peso){
        this.codice = codice;
        this.descrizione = descrizione;
        this.peso = peso;
        this.next = null;
    }
    
    public String getCodice() {
        return codice;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public Pacco getNext() {
        return next;
    }
    public double getPeso() {
        return peso;
    }
    public void setNext(Pacco next){
        this.next = next;
    }
    public String toString() {
        return "Il codice del pacco è" + codice + "la descrizione è " + descrizione + "il peso è " + peso;

    }
    
}
