package Esercizio_6_chat;

public class TestParcoAuto {

    public static void main(String[] args) {

        // 1. Istanziazione oggetti
        Veicolo v1 = new Veicolo("Generic", 140);
        Auto a1 = new Auto("Fiat", 180, 5);
        Berlina b1 = new Berlina("BMW", 240, 5, 480);
        Moto m1 = new Moto("Yamaha", 220, 600);

        // 2. Array polimorfico
        Veicolo[] inventarioParco = { v1, a1, b1, m1 };

        // 3. Ciclo con polimorfismo
        for (Veicolo v : inventarioParco) {
            v.avvia();
            v.frena();

            // 4. instanceof + downcasting
            if (v instanceof Berlina) {
                Berlina berlina = (Berlina) v;
                berlina.apriBagagliaio();
            }

            System.out.println("---");
        }

        // 5. Ricerca veicolo con velocità massima
        Veicolo maxVel = inventarioParco[0];
        for (Veicolo v : inventarioParco) {
            if (v.getVelocitaMax() > maxVel.getVelocitaMax()) {
                maxVel = v;
            }
        }

        System.out.println("Il veicolo più veloce è della marca: " + maxVel.getMarca() +
                           " con velocità max: " + maxVel.getVelocitaMax() + " km/h");
    }
}
