public class SegnaleRadio implements Runnable {
    @Override
    public void run() {
        while(!Thread.interrupted())
        {
            System.out.println("Ping radio...");
            try {
                Thread.sleep(300);
                
            } catch (InterruptedException e) {
                System.out.println("Trasmissione radio interrota dal comando centrale");
                return;
            }

        }
        
    }
}
