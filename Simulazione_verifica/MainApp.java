package Simulazione_verifica;
import java.util.Scanner;


public class MainApp {
    public static void main(String[] args) {

        scanner input = new Scanner(System.in);

        Articolo[] panini = {
        new Articolo("hamburger",5.50),
        new Articolo("toast",5.50),
        new Articolo("ham",5.50)
        };
        Articolo[] bibite = {
        new Articolo("acqua",5.50),
        new Articolo("coca cola",5.5),
        new Articolo("tè",5.50)
        };
        int scelta = -1;
        while(scelta!=0)
        {
            System.out.println("\n===== MENU PRINCIPALE =====");
            System.out.println("1 Aggiungi Panino");
            System.out.println("2 Aggiungi Bibita");
            System.out.println("3 Mostra Totale e Paga");
            System.out.println("4 Elenca Articoli per Prezzo (Bubble Sort)");
            System.out.println("0 Esci");
            System.out.print("Scelta: ");
            scelta=input.nextInt();
            if(scelta == 1)
            {
                System.out.println("Scegli un panino");

            }
            else if(scelta == 2)
            {

            }
            else if(scelta == 3)


        }







    }

     
    
}
