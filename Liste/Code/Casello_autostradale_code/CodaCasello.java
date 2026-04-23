package Casello_autostradale_code;

public class CodaCasello {
    private Auto head;
    private double incassoTotale;

    public CodaCasello(){
        this.head = null;
        this.incassoTotale = 0.0;
    }

    public void push(String targa,double prezzo){
        Auto nuovaAuto = new Auto(targa, prezzo);
        if(head == null)
        {
            head = nuovaAuto;
        }
        else
        {
            Auto temp = head;
            while( temp.getPuntatoreNext() != null)
            {
                temp = temp.getPuntatoreNext();
            }
            temp.setPuntatore(nuovaAuto);
        }
    }

    public void pop(){
        if(head == null)
        {
            System.out.println("Non ci sono auto da rimuovere");
        }
        else
        {
            Double pedaggio = head.getPedaggio();
            incassoTotale = incassoTotale + pedaggio;
            System.out.println(" L'auto con targa " + head.getTarga() + " ha pagato : " + head.getPedaggio());
            head = head.getPuntatoreNext();
            System.out.println("Macchina uscita dalla coda correttamente");

        }
    }
    
    public void visualizzaCoda() {
    if (head == null) {
        System.out.println("La coda è vuota.");
        return;
    }

    System.out.println("--- STATO DELLA CODA ---");
    Auto temp = head; 
    
    while (temp != null)
    {
        System.out.println("Targa: " + temp.getTarga() + " | Pedaggio: " + temp.getPedaggio() + "euro");
        temp = temp.getPuntatoreNext();
    }
    System.out.println("------------------------");
}
}
