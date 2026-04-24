package Gestione_Magazzino_Merci;

public class Pila {
    private Pacco head;
    private double pesoSpedito;

    public Pila(){
        this.head = null;
        this.pesoSpedito = 0.0;
    }

    public void push(String c,String d,double p){
        Pacco nuovoPacco = new Pacco(c, d, p);
        nuovoPacco.setpuntatoreNext(head);
        head = nuovoPacco;  
    }

    public void pop(){
        if(head == null)
        {
            System.out.println("magazzino vuoto");
            return;
        }

        Pacco rimosso = head;
        pesoSpedito = pesoSpedito + rimosso.getPeso();
        head = head.getpuntatoreNext();
        System.out.println("Il pacco rimosso è : " + rimosso.getCodice());
    }

    public void stampaPila(){
        if(head == null)
        {
            System.out.println("Pila vuota non ci sono pacchi");
            return;
        }
        System.out.println("-------------PILA-------------");
        Pacco temp = head;
        while(temp != null)
        {
            System.out.println("Codice  : " + temp.getCodice() + " Peso : " + temp.getPeso());
            temp = temp.getpuntatoreNext();
        }
        System.out.println("------------------------------");
    }
    
}
