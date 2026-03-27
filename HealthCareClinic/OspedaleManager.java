package HealthCareClinic;
import java.util.ArrayList;

public class OspedaleManager {

    ArrayList<Paziente> pazienti = new ArrayList<Paziente>(30);

    public void aggiungiPaziente(Paziente paziente) throws OspedalePienoException{
        
        if(pazienti.size()>30)
        {
            throw new OspedalePienoException();
        }
        else{
            pazienti.add(paziente);
            System.out.println("Paziente aggiunto");
        }

    }
}
