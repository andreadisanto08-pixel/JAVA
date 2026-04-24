import java.util.*;

public class Main {
    public static void main(String[] args) {


        CodaBanca coda = new CodaBanca();
        Scanner scanner = new Scanner(System.in);
        int scelta;

        do {
            System.out.println("\n");
            System.out.println("-------BANCA-------");
            System.out.println("1.Inserisci cliente");
            System.out.println("2.Visualizza coda");
            System.out.println("3.Togli un cliente dalla coda");
            System.out.println("4.Mostra saldo della giornata");
            System.out.println("Cosa vuoi fare?");
            System.out.println("-------------------");
            scelta = scanner.nextInt();
            scanner.nextLine();
            
            switch (scelta) 
            {
                case 1:
                    System.out.println("Inserisci il nome : ");
                    String nome = scanner.nextLine();
                    System.out.println("Inserisci il cognome : ");
                    String cognome = scanner.nextLine();
                    System.out.println("Inserisci saldo");
                    double saldo = scanner.nextDouble();
                    scanner.nextLine();
                    coda.push(nome,cognome,saldo);
                    break;
                case 2:
                    coda.visualizzaCoda();
                    break;
                case 3:
                    coda.pop();
                    break;
                case 4:
                    coda.mostrasaldo();
                    break;

                default:
                    break;
            }
        } while (scelta != 0);;
        
    }
    
}
