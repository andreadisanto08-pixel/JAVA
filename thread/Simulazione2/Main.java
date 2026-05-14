public class Main {
    public static void main(String[] args) {
        

        int[] array = {1000,2500,3000,1500};
        calcoloRisorse CalcoloRisorse = new calcoloRisorse(array);
        EvacuazioneArea evacuazioneArea = new EvacuazioneArea();
        SegnaleRadio segnaleRadio = new SegnaleRadio();
        Thread t1 = new Thread(CalcoloRisorse);
        Thread t2 = new Thread(evacuazioneArea);
        Thread t3 = new Thread(segnaleRadio);
        t1.start();
        t2.start();
        t3.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("interroto");
        }
        t3.interrupt();
        try {
            t1.join();
            t2.join();
            t3.join(); 
        } catch (InterruptedException e) {
            System.out.println("Interrotto");
        }
        System.out.println("report finale      totale fondi : " + CalcoloRisorse.getTotaleFondi());




    }
    
}
