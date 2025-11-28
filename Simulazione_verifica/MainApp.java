package Simulazione_verifica;

import java.util.Scanner;


public class MainApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Articolo[] panini= new Articolo[3];
        panini[0]= new Articolo("toast",2);
        panini[1]= new Articolo("hamburger",3);
        panini[2]= new Articolo("chicken",4);
       

        Articolo[] bibite= new Articolo[3];
        bibite[0]= new Articolo("cocacola",2);
        bibite[1]= new Articolo("acqua",3);
        bibite[2]= new Articolo("sprite",4);

        int scelta=-1;
        while(scelta!=0)
        {
            System.out.println("--MENU--");
            System.out.println("1) Scegli Panino");
            System.out.println("2) Scegli Bibita");
            System.out.println("3) Visualizza Totale");
            System.out.println("Che cosa vuoi fare?:");
            scelta = input.nextInt();
            switch (scelta) 
            {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
            
                default:
                    break;
            }
        }



        }







    }

     
    

