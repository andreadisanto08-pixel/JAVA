package Gestione_Magazzino_Merci;

public class Pila {
    private Pacco first;
    private double pesoSpedito;

    public Pila(){
        this.first = null;
        this.pesoSpedito = 0.0;
    }

    public void push(String c,String d,double p){
        Pacco nuovo = new Pacco(c, d, p);
        nuovo.setNext(first);
        first = nuovo;
        
    }

    public String pop(){
        if(first == null){
            return "magazzino vuoto";
        }
        Pacco rimosso = first;
        this.pesoSpedito = this.pesoSpedito + rimosso.getPeso();
        first = first.getNext();
        return "Il pacco rimosso è " + rimosso.getCodice();
    }
    
    
}
