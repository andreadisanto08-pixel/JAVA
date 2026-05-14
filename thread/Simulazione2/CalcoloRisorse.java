public class CalcoloRisorse implements Runnable{
    private int[] fondi;
    private int totale;
    
    public CalcoloRisorse(int[] fondi,int totale){
        this.fondi=fondi;
        this.totale = 0;
    }

    public int[] getFondi() {
        return fondi;
    }

    @Override
    public void run(){
        for(int i=0;i<fondi.length;i++)
        {
            totale=totale + fondi[i];
        }
        try {
            Thread.sleep(200);
            
        } catch (InterruptedException e) {
            System.out.println("Interrotto");
        
        }

    }
    
}
