public class Medico {
    private String nome;
    private String cognome;
    private String specializzazione;
    private int ID;

    public Medico(String nome,String cognome,String specializzazione,int ID){
        this.ID = ID;
        this.nome = nome;
        this.cognome = cognome;
        this.specializzazione = specializzazione;
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
    public String getSpecializzazione() {
        return specializzazione;
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
    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }
    @Override 
    public String toString(){
        return "    il nome e : " + nome + "    il cognome e : " + cognome + "    l'Id e : " + ID + "    specializzazione : " + specializzazione + "\n";
    }

    
}
