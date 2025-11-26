package Esercizio_6;

public class Veicolo {
    private String marca;
    private int velocitaMax;

    public Veicolo(String marca, int velocitaMax) {
        this.marca = marca;
        this.velocitaMax = velocitaMax;
    }

    public String getMarca() {
        return marca;
    }

    public int getVelocitaMax() {
        return velocitaMax;
    }

    public void avvia() {
        System.out.println("Il veicolo di marca " + marca + " si sta avviando.");
    }

    public void frena() {
        System.out.println("Il veicolo sta frenando.");
    }
}
