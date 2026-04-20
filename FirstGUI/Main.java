import javax.swing.JFrame; // Importa la classe per creare la finestra principale
import javax.swing.JPanel; // Importa la classe per creare i contenitori (pannelli)
import java.awt.BorderLayout; // Importa il gestore di posizionamento BorderLayout (Nord, Sud, Centro, ecc.)
import java.awt.GridLayout; // Importa il gestore di posizionamento GridLayout (griglia a righe e colonne)
import javax.swing.BorderFactory; // Importa la classe per creare i margini (bordi) attorno ai componenti

public class Main { // Definizione della classe principale

    public Main() { // Metodo costruttore: viene eseguito quando scrivi "new Main()"
        
        JFrame frame = new JFrame(); // Crea fisicamente l'oggetto della finestra
        JPanel panel = new JPanel(); // Crea un pannello (un contenitore invisibile per raggruppare elementi)

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));// Crea un bordo vuoto (margine interno) di 30px sopra, 30px a sinistra, 10px sotto e 30px a destra
        panel.setLayout(new GridLayout(0, 1)); // Imposta il layout del pannello: 0 righe significa "quante ne servono", 1 colonna sola

        // Aggiunge il pannello al centro della finestra principale
        frame.add(panel, BorderLayout.CENTER);

        frame.setSize(1000, 1000);
        
        // Dice al programma di chiudersi completamente quando premi la "X" della finestra
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Imposta il testo che appare nella barra in alto della finestra
        frame.setTitle("La mia GUI");
        
        // Ridimensiona automaticamente la finestra in base alla dimensione dei componenti contenuti
        frame.pack();
        
        // Rende la finestra visibile (di base le finestre Java vengono create nascoste)
        frame.setVisible(true);
    }

    public static void main(String[] args) { 
        new Main(); 
    }
}