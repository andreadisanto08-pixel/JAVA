package Thread.Primo_esercizio;

public class Main {
    public static void main(String[] args) {
        TR ttr = new TR();
        Thread thread = new Thread(ttr);
        thread.start();

        for (int i = 0; i<5 ; i++)
        {
            System.out.println("numero di fez : " + i );
        }











    }

    

    
}
