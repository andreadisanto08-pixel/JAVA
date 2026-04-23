package Casello_autostradale_code_mio;

public class Coda{
    private Double importoTotale;
    private Auto head;
    
    public Coda(){
        this.head = null;
        this.importoTotale = 0.0;
    }

    public void Push(String targa,double tasseggio){
        Auto  autonuova = new Auto(targa,tasseggio);
        if(head == null)
        {
            head = autonuova;
        }
        else
        {
            Auto temp = head;
            while(temp.getPuntatoreNext() != null)
            {
                temp = temp.getPuntatoreNext();
            }
            temp.setPuntatoreNext(autonuova);
            System.out.println("Macchina aggiunta in coda");
        }

    }

    public void pop(){
        if(head == null)
        {
            System.out.println("Lista vuota");
        }
        double pedaggio = head.getTasseggio();
        importoTotale = importoTotale + pedaggio;
        System.out.println("la macchina ha pagato " + importoTotale + " ed è uscita ");
        head = head.getPuntatoreNext();
    }

    public void stampaCoda(){
        if(head == null)
        {
            System.out.println("Lista vuota");
            return;
        }
        System.out.println("-----------CODA-----------");
        Auto temp = head;

        while(temp != null )
        {
            System.out.println("Targa : " + head.getTarga() + " | " + " Costo  : " + temp.getTasseggio() );
            temp = temp.getPuntatoreNext();
        }
        System.out.println("--------------------------");
    }


}