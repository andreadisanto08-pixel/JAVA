public class Paziente {
    private String nome;
    private String cognome;
    private String cf;
    
    public Paziente(String nome,String cognome,String cf){
        this.nome = nome;
        this.cognome = cognome;
        this.cf = cf;
    }
    public String getCf() {
        return cf;
    }
    public String getCognome() {
        return cognome;
    }
    public String getNome() {
        return nome;
    }
    public void setCf(String cf) {
        this.cf = cf;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString(){
        return "     il nome e :" + nome + "     il cognome e : " + cognome + "     il cf e : " + cf + "\n"; 
    }
}
