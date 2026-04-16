

public class Medico {
    private int ID;
    private String nome;
    private String cognome;
    private String specializazione;

    public Medico(int ID,String nome,String cognome,String specializazione){
        this.ID = ID;
        this.nome = nome;
        this.cognome = cognome;
        this.specializazione = specializazione;

    }

    public String getCognome() {
        return cognome;
    }
    public int getID() {
        return ID;
    }
    public String getNome() {
        return nome;
    }
    public String getSpecializazione() {
        return specializazione;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSpecializazione(String specializazione) {
        this.specializazione = specializazione;
    }
    @Override
    public String toString() {
        return " NOME: "   + nome + " COGNOME: " + cognome + "SPECIALIZZAZIONE: " + specializazione + " ID: " + ID + " \n ";
    }






    
}
