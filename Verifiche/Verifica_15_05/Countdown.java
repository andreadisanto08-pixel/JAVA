import java.util.concurrent.*;

public class Countdown implements Runnable{
     
    @Override
    public void run() {
        for(int i=1;i<6;i++)
        {
            System.out.println("Sessione in scadenza... -" + i + " secondi");
            try {
                TimeUnit.SECONDS.sleep(1);  
            } catch (InterruptedException e) {
                System.out.println("Timer resettato dal utente");
            }
        }
        System.out.println("Tempo scaduto");
        
    }
    
}
