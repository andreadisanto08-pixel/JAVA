public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        try {
            thread.join();
            
        } catch (InterruptedException e) {
            System.out.println("thread interroto");
        }





        System.out.println("Sono il thread main");
    }
    
}
