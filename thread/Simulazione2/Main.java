public class Main{
    public static void main(String[] args) {
        SegnaleRadio segnaleRadio = new SegnaleRadio();
        Thread t = new Thread(segnaleRadio);
        t.start();
        t.interrupt();
    }
}