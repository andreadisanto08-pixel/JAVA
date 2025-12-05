package Esercizio_7;


import java.util.Scanner;
public class BiglietteriaApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        Biglietto[] biglietti = new Biglietto[10];
        biglietti[0] = new Biglietto(1,"A",15,true);
        biglietti[1] = new Biglietto(2,"A",15,false);
        biglietti[2] = new Biglietto(3,"A",15,false);
        biglietti[3] = new Biglietto(4,"B",20,true);
        biglietti[4] = new Biglietto(5,"B",20,false);
        biglietti[5] = new Biglietto(6,"B",20,false);
        biglietti[6] = new Biglietto(7,"C",30,true);
        biglietti[7] = new Biglietto(8,"C",30,false);
        biglietti[8] = new Biglietto(9,"C",30,true);
        biglietti[9] = new Biglietto(10,"D",50,true);
        
        int scelta=-1;
        while(scelta!=0)
        {
            System.out.println("\n\n-----MENU-----");
            System.out.println("\n1)Visualizza posti disponibili");
            System.out.println("\n2)Compra un biglietto");
            System.out.println("\n3)Report incassi e Sconto per i vip");
            System.out.println("\n4)Esci");
            System.out.println("\nCosa vuoi fare?");
            scelta = input.nextInt();
            input.nextLine();
            switch (scelta)
            {
                case 1:
                    System.out.println("\nI posti disponibili sono:");
                    for(int i=0;i<biglietti.length;i++)
                    {
                        if(biglietti[i].getterIsVenduto() == false)
                        {
                            System.out.println("numero posto:   "  +biglietti[i].getternumeroPosto() + "   settore:      "
                            +biglietti[i].getterSettore() + "    prezzobase:     "+biglietti[i].getterPrezzoBase());
                        }
                    }
                break;

                case 2:
                    

                break;
                case 3:

                break;
                case 4:
                   System.out.println("\nPremi zero per uscire :(");
                break;

            }

        }








    }
    
    

}
