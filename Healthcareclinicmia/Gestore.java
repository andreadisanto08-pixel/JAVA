import java.util.*;
import java.io.*;

public class Gestore {

    private ArrayList<Medico> medici = new ArrayList<>();
    private ArrayList<Paziente> pazienti = new ArrayList<>();

    public Gestore(){

        medici.add(new Medico("marco", "Calderoli", "cuore", 78));
        medici.add(new Medico("ruben", "della rocca", "fegato", 96));

        pazienti.add(new Paziente("lucas", "muscolo", "DSN456"));
        pazienti.add(new Paziente("diego", "baldi", "DSN798"));

    }

    public ArrayList<Medico> getMedici(){
        return medici;
    }
    public ArrayList<Paziente> getPazienti(){
        return pazienti;
    }


    @Override
    public String toString(){
        return "i medici sono : " + medici + "i pazienti sono : " + pazienti;
    }


    public Medico cercaMedico(int ID) throws PersonaNonTrovataException {
        for(int i = 0;i<medici.size();i++)
        {
            Medico m = medici.get(i);
            if(m.getID() == ID)
            {
                return m;
            }
        }
        throw new PersonaNonTrovataException("nessuna persona trovata!");
    }


    public Paziente cercaPaziente(String cf) throws PersonaNonTrovataException{
        for(int i = 0; i<pazienti.size();i++)
        {
            Paziente p = pazienti.get(i);
            if(p.getCf().equals(cf))
            {
                return p; 
            }
        }
        throw new PersonaNonTrovataException("nessuna persona trovata!");
    }




    
}
