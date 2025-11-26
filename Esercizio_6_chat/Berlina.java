package Esercizio_6_chat;

public class Berlina extends Auto {
    private int bagagliaioLitri;

    public Berlina(String marca, int velocitaMax, int numeroPosti, int bagagliaioLitri) {
        super(marca, velocitaMax, numeroPosti);
        this.bagagliaioLitri = bagagliaioLitri;
    }

    public void apriBagagliaio() {
        System.out.println("Bagagliaio aperto! Capacità: " + bagagliaioLitri + " litri.");
    }

    @Override
    public void suonaClacson() {
        System.out.println("Beep-Beep!");
    }
}

