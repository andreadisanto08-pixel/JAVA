import java.util.ArrayList;

public class Gestore{

    private ArrayList<Medico> medici = new ArrayList<>();
    private ArrayList<Paziente> pazienti = new ArrayList<>();

    public Gestore(){

        medici.add(new Medico(601, "alessandro", "martino", "pediatria"));
        medici.add(new Medico(703, "alessio", "martinez", "cardiologia"));

        pazienti.add(new Paziente("marco", "calderoli", "34432" ));
        pazienti.add(new Paziente("Andrea", "anita", "343232"));

    }

    public ArrayList<Medico> getMedici() {
        return medici;
    }
    public ArrayList<Paziente> getPazienti(){
        return pazienti;
    }
    @Override
    public String toString() {
       return " Medici " + medici + " \n " + " pazienti " + pazienti;
    }
    


    public Paziente cercaPaziente(String codice_fiscale) throws PersonaNonTrovataException{
        for(int i=0;i<pazienti.size();i++)
        {
            Paziente p = pazienti.get(i);
            if(p.getCodice_fiscale().equals(codice_fiscale))
            {
                return p;
            }
        }
        throw new PersonaNonTrovataException("Persona non trovata");
    }
    public Medico cercaMedico(int ID) throws PersonaNonTrovataException{
        for(int i=0;i<medici.size();i++)
        {
            Medico m = medici.get(i);
            if(m.getID() == ID)
            {
                return m;
            }
        }
        throw new PersonaNonTrovataException("persona non trovata");
}
}
