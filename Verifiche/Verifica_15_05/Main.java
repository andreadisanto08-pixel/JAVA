public class Main {
    public static void main(String[] args) {
        
        int[] prezzivoli = {250,480,190,320};
        int[] prezzihotel = {120,85,150,60,200};

        Migliorprezzo migliorprezzo = new Migliorprezzo(prezzihotel);
        Mediaprezzi mediaprezzi = new Mediaprezzi(prezzivoli);
        Countdown countdown = new Countdown();

        Thread t1 = new Thread(migliorprezzo);
        Thread t2 = new Thread(mediaprezzi);
        Thread t3 = new Thread(countdown);

        t1.start();
        t2.start();
        t3.start();

        try {
            Thread.sleep(3000);    
        } catch (InterruptedException e) {
            System.out.println("interrotto");
        }
        t3.interrupt();
        try {
            t1.join();
            t2.join();
            t3.join();
            
        } catch (InterruptedException e) {
            System.out.println("Interrotto");
        }


        System.out.println("Report : " + migliorprezzo.getPrezzominimo());










    }
    
}
