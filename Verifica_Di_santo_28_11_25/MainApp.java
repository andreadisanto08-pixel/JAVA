import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        SpazioFiera[] spazi = new SpazioFiera[10];
        spazi[0]= new SpazioFiera(1, 10, 300, false);
        spazi[1]= new SpazioFiera(2, 20, 400, true);
        spazi[2]= new SpazioFiera(3, 30, 500, false);
        spazi[3]= new SpazioFiera(4, 40, 600, true);
        spazi[4]= new SpazioFiera(5, 50, 700, false);
        spazi[5]= new SpazioFiera(6, 60, 800, true);
        spazi[6]= new SpazioFiera(7, 70, 900, true);
        spazi[7]= new SpazioFiera(8, 80, 1000, false);
        spazi[8]= new SpazioFiera(9, 90, 1100, false);
        spazi[9]= new SpazioFiera(10, 100, 1200, true);

        
        int scelta1;
        int scelta=-1;
        while (scelta!=0) 
        {
            System.out.println("\n\n-----MENU-----");
            System.out.println("\n1)Visualizza spazi disponibili");
            System.out.println("\n2)Prenota uno spazio");
            System.out.println("\n3)Report Finanziario e Ordinato");
            System.out.println("\n4)Cerca metratura per codice");
            System.out.println("\n0)Esci");
            System.out.println("\nCosa vuoi fare?");
            scelta = input.nextInt();
            input.nextLine();
            switch (scelta) {
                case 1 :
                    System.out.println("\nSPAZI DISPONIBILI:    ");
                    for(int i=0;i<spazi.length;i++)
                    {
                        System.out.println("\nLo spazio e disponibile?:   " + spazi[i].getterIsPrenotato());
                    }
                    break;

                case 2 :
                    System.out.println("\nVuoi prenotare uno spazio? :) (premi 1 per prenotare e 0 per uscire)");
                    scelta1 = input.nextInt();
                    input.nextLine();
                    if(scelta1 == 1)
                    {
                        System.out.println("\nlo spazio 1 e prenotato?");
                        System.out.println("\n "+ spazi[0].getterIsPrenotato());
                        System.out.println("\nPrenotiamolo");
                        System.out.println("\nOra e prenotato?");
                        spazi[0]= new SpazioFiera(scelta, scelta1, scelta, true);
                        System.out.println("\n "+ spazi[0].getterIsPrenotato());
                        System.out.println("\nHAI PRENOTATO IL NUMERO 1");
                    }
                    else if (scelta1 == 0)
                    {
                        System.out.println("Non hai prenotato niente :(");
                    }
                    break;

                case 3 :

                    
                    break;

                case 4 :
                    
                    break;

                default:
                    break;
            }









        }
        
    }
    
}
