import java.util.*;

public class CodaBanca {
    Scanner scanner = new Scanner(System.in);
    private Cliente head;
    private double SaldoG;

    public CodaBanca(){
        this.head = null;
        this.SaldoG = 0.0;
    }


   public void push(String nome,String cognome,double saldo){
        Cliente nuovoCliente = new Cliente(nome, cognome ,saldo);
        if(head == null)
        {
            head = nuovoCliente;
        }
        else
        {
            Cliente temp = head;
            while( temp.getPuntatoreNext() != null)
            {
                temp = temp.getPuntatoreNext();
            }
            temp.setPuntatoreNext(nuovoCliente);
        }
    }

    public void pop(){
        if(head == null)
        {
            System.out.println("Non ci sono clienti da rimuovere");
        }
        else
        {
            System.out.println("saldo : " +  head.getSaldo() + " euro");
            System.out.println("1.Versare");
            System.out.println("2.Prelevare");
            System.out.println("Cosa vuoi fare ");
            int scelta = scanner.nextInt();
            scanner.nextLine();
            if(scelta == 1 )
            {
                System.out.println("Quanto si desidera versare : ");
                int importo = scanner.nextInt();
                double salddo = head.getSaldo();
                scanner.nextLine();
                salddo = salddo + importo;
                System.out.println("\n Il saldo finale è : " + salddo + " euro");
                SaldoG = SaldoG + importo; 
            }
            if(scelta == 2 )
            {
                System.out.println("Quanto si desidera prelevare : ");
                int importo = scanner.nextInt();
                double salddo = head.getSaldo();
                scanner.nextLine();
                salddo = salddo - importo;
                System.out.println(" \n Il saldo finale è : " + salddo + " euro");
                SaldoG = SaldoG - importo;
            }
            head = head.getPuntatoreNext();
            System.out.println("\n Cliente uscito dalla coda ");

        }
    }

    public void mostrasaldo(){
        System.out.println("Denaro transato fino ad adesso : " + SaldoG);
    }
    
    public void visualizzaCoda() {
    if (head == null)
    {
        System.out.println("La coda è vuota");
        return;
    }
    System.out.println("--- STATO DELLA CODA ---");
    Cliente temp = head; 
    while (temp != null)
    {
        System.out.println("Nome: " + temp.getNome() + " | Cognome: " + temp.getCognome() + " | saldo : " + temp.getSaldo() + " euro");
        temp = temp.getPuntatoreNext();
    }
    System.out.println("------------------------");
    }
}


   
