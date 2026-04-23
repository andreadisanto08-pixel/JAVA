package Casello_autostradale_code_mio;
import java.util.Scanner;



  public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Coda Casello = new Coda(); 
            int scelta = -1;
    
            while(scelta != 0 )
            {
                System.out.println("\n--- MENU CASELLO ---");
                System.out.println("1. Inserire un'auto in coda");
                System.out.println("2.Visualizza coda");
                System.out.println("3.Far uscire un'auto dalla coda");
                System.out.println("Cosa vuoi fare");
                scelta = scanner.nextInt();
                scanner.nextLine();
    
                if(scelta == 1)
                {
                    System.out.print("Inserisci targa: ");
                    String targa = scanner.nextLine();
                    System.out.print("Inserisci costo pedaggio: ");
                    double prezzo = scanner.nextDouble();
                    scanner.nextLine();
                    Casello.Push(targa , prezzo);
                    System.out.println("Auto aggiunta");
                }
                if(scelta == 2)
                {
                    Casello.stampaCoda();
                }
                if(scelta == 3)
                {
                    Casello.pop();
                }
    
            }
        }
        
    }
    
    



