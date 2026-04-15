package HealthCareClinic;

public class Paziente {
    private String codice_fiscale;
    private String cognome;
    private String nome;

    public Paziente(String nome,String cognome,String codice_fiscale){
        this.codice_fiscale = codice_fiscale;
        this.cognome = cognome;
        this.nome = nome;

    }

    public String getCodice_fiscale() {
        return codice_fiscale;
    }
    public String getCognome() {
        return cognome;
    }
    public String getNome() {
        return nome;
    }
    public void setCodice_fiscale(String codice_fiscale) {
        this.codice_fiscale = codice_fiscale;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
