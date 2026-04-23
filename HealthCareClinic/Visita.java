public class Visita {
   private Medico medico;
   private Paziente paziente;
   private String ora;
   private String data;
   
   public Visita(Medico medico,Paziente paziente,String ora,String data){
    this.data = data;
    this.medico = medico;
    this.paziente = paziente;
    this.ora = ora;
   }
   public String getData() {
       return data;
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
   public void setOra(String ora) {
       this.ora = ora;
   }
   @Override
   public String toString(){
    return "\n" + "-la visita e stata prenotata al dottore : " + medico.getCognome() + "       al paziente : " + paziente.getCognome() +  "     alle ore : " + ora + "       il giorno : " + data +  "\n";
   }

}