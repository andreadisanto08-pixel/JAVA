package Gestione_Magazzino_Merci;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int scelta = -1;
        Pila pila = new Pila();

        while(scelta !=0)
        {
            System.out.println("1.Aggiungi pacco");
            System.out.println("2.Togli pacco");
            System.out.println("3.Visualizza pila");
            System.out.println("0 per uscire");
            System.out.println("Cosa vuoi fare ?");
            scelta = scanner.nextInt();
            scanner.nextLine();

            if(scelta == 1)
            {
                System.out.println("Insersici codice");
                String c = scanner.nextLine();
                System.out.println("Insersici descrizione");
                String d = scanner.nextLine();
                System.out.println("Insersici peso");
                double p = scanner.nextDouble();
                scanner.nextLine();
                pila.push(c, d, p);
                System.out.println(" Il pacco con codice " + c + " descrizione " + d + " peso: " + p + " è stato aggiunto");
            }

            if(scelta == 2 )
            {
                pila.pop();
                
            }
            if(scelta == 3)
            {
                pila.stampaPila();
            }
        }
    }
    
}
