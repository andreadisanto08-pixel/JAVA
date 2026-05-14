public class SegnaleRadio implements Runnable {
    @Override
    public void run(){
        while(!Thread.currentThread().isInterrupted())
        {
            System.out.println("Ping radio in corso...");
            try {
                Thread.sleep(300);
                
            } catch (InterruptedException e) {
                System.out.println("Il thread è stato interrotto");
            }
        }

    }
    
}
