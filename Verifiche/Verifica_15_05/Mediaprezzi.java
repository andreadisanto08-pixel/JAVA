public class Mediaprezzi implements Runnable{
    private int[] prezzi;
    private int media;
    private int somma;

    
    public Mediaprezzi(int[] prezzi){
        this.prezzi = prezzi;
        this.media = 0;
    }
    

    @Override
    public void run() {
        
        for(int i = 0 ; i<prezzi.length;i++)
        {
             int somma = somma + prezzi[i];
             media = somma / prezzi.length;
            try {
                Thread.sleep(200);      
            } catch (InterruptedException e) {
                System.out.println("interrotto");    
            }
            System.out.println("Analisi prezzi voli completata");           
        }    
    }
    
}
