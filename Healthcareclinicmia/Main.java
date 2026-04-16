import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Gestore g = new Gestore();
        Scanner scanner = new Scanner(System.in);
        FileWriter filewriter = null ;
        BufferedWriter bufferedWriter = null;
        int scelta = -1;

        while(scelta !=0)
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
                for(int i=0;i<1;i++)
                {
                    System.out.println(g);
                }

                System.out.println("Inserisci il codice fiscale : ");
                String codf = scanner.nextLine();
                System.out.println("Inserisci l'ID del medico: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                try 
                {
                    Medico m = g.cercaMedico(id);
                    System.out.println("Medico trovato");
                    Paziente p = g.cercaPaziente(codf);
                    System.out.println("Paziente trovato");
                    System.out.println("Inserisci l'ora : ");
                    String orario = scanner.nextLine();
                    System.out.println("Inserisci giorno");
                    String giornata = scanner.nextLine();
                    Visita v = new Visita(m, p, orario, giornata);
                    System.out.println(v);
                    String percorso = "Archivio/" + p.getCf() + ".txt";
                    filewriter = new FileWriter(percorso,true);
                    bufferedWriter = new BufferedWriter(filewriter);
                    bufferedWriter.write(v.toString());
                    System.out.println("\nArchiviazione completata");

                } catch (IOException e) 
                {
                    System.out.println("Errore!");
                }
                catch (PersonaNonTrovataException ex)
                {
                    System.out.println("Persona non trovata");
                }
                finally
                {
                    try
                    {
                        if(bufferedWriter != null)
                        {
                            bufferedWriter.close();
                        }
                    }
                    catch (IOException ex)
                    {
                        System.out.println("Errore!");
                    }
                }
            }
        }  
    }









        









        

    }
    

