public class Migliorprezzo implements Runnable{
    private int[] costi;
    private int prezzominimo;

    public Migliorprezzo(int[] costi){
        this.costi= costi;
        this.prezzominimo = 0;
    }

    public int getPrezzominimo() {
        return prezzominimo;
    }
   
    @Override
    public void run() {
        for(int i=0;i<costi.length;i++)
        {
            prezzominimo = costi[i];
            if(prezzominimo < costi[i+1])
            {
                prezzominimo = costi[i+1];
            }
            try {
                Thread.sleep(150); 
            } catch (InterruptedException e) {
                System.out.println("Interrotto");
            }
        }
        System.out.println("Ricerca hotel miglior prezzo terminata");

        
        
    }
    
}
