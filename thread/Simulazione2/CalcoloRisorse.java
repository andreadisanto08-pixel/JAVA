public class calcoloRisorse implements Runnable {

    private int[] saldo;
    private int totaleFondi;
    
    public calcoloRisorse(int[] saldo){
        this.saldo= saldo;
        this.totaleFondi=0;
    }
    public int getTotaleFondi() {
        return totaleFondi;
    }
    @Override
    public void run() {
        for(int i=0;i<saldo.length;i++)
        {
            totaleFondi= totaleFondi+saldo[i];
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                System.out.println("Interrotto");
                return;
            }
            System.out.println("Calcolo risorse completato");
        }
        
    }
}
