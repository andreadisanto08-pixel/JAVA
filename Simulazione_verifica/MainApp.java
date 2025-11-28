package Simulazione_verifica;

import java.util.Scanner;


public class MainApp {
    public static void main(String[] args) {

        int i=0;
        int f=0;

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
            System.out.println("\n\n--MENU--");
            System.out.println("1) Scegli Panino");
            System.out.println("2) Scegli Bibita");
            System.out.println("3)Quantita comprate");
            System.out.println("4) Visualizza Totale");
            System.out.println("Che cosa vuoi fare?:");
            scelta = input.nextInt();

            switch (scelta) 
            {
                case 1:
                    System.out.println("Questi sono i panini:");
                    for(int cont=0;cont<panini.length;cont++)
                    {
                        System.out.println("Nome:");
                        System.out.println(panini[cont].getNome());
                        System.out.println("Prezzo:");
                        System.out.println(panini[cont].getPrezzo());
                    }
                    System.out.println("\nChe panino vuoi:      ");
                    int sceltax = input.nextInt();
                    sceltax=sceltax-1;
                    System.out.println("\nHai scelto:   "+panini[sceltax].getNome());
                    i++;
                    break;

                case 2:
                    System.out.println("Questi sono le bibite:");
                    for(int cont1=0;cont1<bibite.length;cont1++)
                    {
                        System.out.println("Nome:");
                        System.out.println(bibite[cont1].getNome());
                        System.out.println("Prezzo:");
                        System.out.println(bibite[cont1].getPrezzo());

                    }
                    System.out.println("\nChe bibita vuoi:      ");
                    int sceltaxx = input.nextInt();
                    sceltaxx=sceltaxx-1;
                    System.out.println("\nHai scelto:   "+bibite[sceltaxx].getNome());
                    f++;

                    break;

                case 3:
                    System.out.println("Il totale degli articoli e :  "+i+"panini e "+f+"bibite");
                    System.out.println("Il totale dei panini e "+i);
                    System.out.println("Il totale delle bibite e "+f);

                    break;

                case 4:
                    System.out.println("\nIl totale e ");




                    break;






                default:
                    break;
            }
        }



        }







    }

     
    

