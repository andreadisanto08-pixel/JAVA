
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        Gestore g = new Gestore();
        Scanner scanner = new Scanner(System.in);
        int scelta = -1;
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;


        while(scelta != 0)
        {
            System.out.println("\n----CLINICA MEDICA-----");
            System.out.println("1.Nuova visita");
            System.out.println("2.storico paziente");
            System.out.println("0.Esci");
            System.out.println("Scegli cosa vuoi fare:");
            scelta = scanner.nextInt();
            scanner.nextLine();

            if(scelta == 1)
            {
                for(int i=0;i<g.getMedici().size();i++)
                {
                    System.out.println(g + "\n");
                }
                
                System.out.println("Inserisci il codice fiscale : ");
                String cf = scanner.nextLine();
                System.out.println("Inserisci l'ID del medico: ");
                int  idMedico = scanner.nextInt();
                scanner.nextLine();
                try {
                    Paziente p = g.cercaPaziente(cf);
                    System.out.println("Paziente trovato");
                    Medico m = g.cercaMedico(idMedico);
                    System.out.println("Medico trovato");
                    String percorso = "Archivio/" + p.getCodice_fiscale() + ".txt";
                    Visita v = new Visita(m, p, "10:30", "16 gennaio", "cuore");
                    System.out.println(v);
                    fileWriter = new FileWriter(percorso);
                    bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write("visita");
                    System.out.println("Archiviazione completata!");
                } catch (IOException e) {
                    System.out.println("Errore!");
                }
                 catch (PersonaNonTrovataException e) {
                    System.out.println("Persona non trovata");
                }
                finally{
                    try {
                        if (bufferedWriter != null) 
                        {
                            bufferedWriter.close();
                        }
                        
                    } catch (IOException ex) {
                        System.out.println("Errore!");
                        
                    }
                }
            }
        }
        
    }  

    
}
