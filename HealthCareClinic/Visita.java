
public class Visita {
    private Medico medico;
    private Paziente paziente;
    private String ora;
    private String data;
    private String diagnosi;

    public Visita(Medico medico,Paziente paziente, String ora,String data,String diagnosi){
        this.medico = medico;
        this.paziente = paziente;
        this.ora = ora; 
        this.data = data;
        this.diagnosi = diagnosi;
    }
    
    
    public String getData() {
        return data;
    }
    public String getDiagnosi() {
        return diagnosi;
    }
    public Medico getMedico() {
        return medico;
    }
    public String getOra() {
        return ora;
    }
    public Paziente getPaziente() {
        return paziente;
    }
    
    
    public void setData(String data) {
        this.data = data;
    }
    public void setDiagnosi(String diagnosi) {
        this.diagnosi = diagnosi;
    }public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public void setOra(String ora) {
        this.ora = ora;
    }public void setPaziente(Paziente paziente) {
        this.paziente = paziente;
    }

    @Override
    public String toString(){

        return "la visita è prenotata con il medico " + medico.getCognome() + " al paziente " + paziente.getCognome() + " il giorno "+ data + " alle ore " + ora + " per " + diagnosi;
    }
    

    
}
