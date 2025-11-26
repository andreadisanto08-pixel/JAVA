package Esercizio_6_chat;

public class Auto extends Veicolo {
    private int numeroPosti;

    public Auto(String marca, int velocitaMax, int numeroPosti) {
        super(marca, velocitaMax);
        this.numeroPosti = numeroPosti;
    }

    public void suonaClacson() {
        System.out.println("Clacson: BEEP!");
    }

    @Override
    public void avvia() {
        System.out.println("L'Auto si avvia, cambio in posizione P.");
    }
}

