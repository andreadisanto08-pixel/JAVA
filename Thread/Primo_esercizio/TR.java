package Thread.Primo_esercizio;

public class TR implements Runnable {
    @Override
    public void run(){
        for(int i = 0 ; i<5 ; i++)
        {
            System.out.println("giro thread : " + i);
        }
    }

    
}
