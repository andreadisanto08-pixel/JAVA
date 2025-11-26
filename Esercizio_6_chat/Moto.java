package Esercizio_6_chat;

public class Moto extends Veicolo {
    private int cilindrataCC;

    public Moto(String marca, int velocitaMax, int cilindrataCC) {
        super(marca, velocitaMax);
        this.cilindrataCC = cilindrataCC;
    }

    public void impennata() {
        System.out.println("La moto sta impennando!");
    }

    @Override
    public void frena() {
        System.out.println("La Moto frena usando freno anteriore e posteriore.");
    }
}
