import java.util.concurrent.*;

public class EvacuazioneArea implements Runnable{  
    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {
            System.out.println("-T meno" + i + " secondi all evacuazione");
            try {
                TimeUnit.SECONDS.sleep(1);
                
            } catch (InterruptedException e) {
                System.out.println("Interrotto");
                return;
            }
            System.out.println("procedura di evacuazione compromessa");
        }
    }
    
}
