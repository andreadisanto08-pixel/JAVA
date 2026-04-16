package HealthCareClinic;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
    
        Gestore g = new Gestore();
        Scanner scanner = new Scanner(System.in);
        int scelta = -1;

        while(scelta != 0)
        {
            System.out.println("\n----CLINICA MEDICA-----");
            System.out.println("1.Nuova visita");
            System.out.println("2.storico paziente");
            System.out.println("0.Esci");
            System.out.println("Scehli cosa vuoi fare:");
            scelta = scanner.nextInt();

            if(scelta == 1)
            {

            }
    }
    }  

    
}
