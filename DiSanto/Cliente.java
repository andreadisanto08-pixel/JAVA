public class Cliente {
    private String nome,cognome;
    private double saldo;
    private Cliente puntatoreNext;
    
    public Cliente(String nome,String cognome,double saldo){
        this.nome = nome;
        this.cognome = cognome;
        this.saldo = saldo;
        this.puntatoreNext = null;
    }  
    public String getCognome() {
        return cognome;
    }
    public String getNome() {
        return nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public Cliente getPuntatoreNext() {
        return puntatoreNext;
    }
    public void setPuntatoreNext(Cliente puntatoreNext) {
        this.puntatoreNext = puntatoreNext;
    }  
}
