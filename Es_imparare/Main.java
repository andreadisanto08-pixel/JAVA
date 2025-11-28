package Es_imparare;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Persona[] persone = new Persona[3];
        
        Persona persona1 = new Persona("Andrea","Disanto",17,"blu");
        Persona persona2 = new Persona("Mario","Russo",18,"rosso");
        Persona persona3 = new Persona("Davide","Regola",19,"marrone");
        
        persone[0] = persona1;
        persone[1] = persona2;
        persone[2] = persona3;

        
        System.out.println(persona1.eta);
        System.out.println(persona2.eta);

        

        Addizione(343,55);

        int[] numeri = new int[3];
        numeri[0] = 10;
        numeri[1] = 40;
        numeri[2] = 70;
        System.out.println("Lunghezza dell array e " +numeri.length);

        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci l'eta:");
        int eta = input.nextInt();
        input.nextLine();

        System.out.println("Inserisci il nome:");
        String nome = input.nextLine();

        System.out.println("Inserisci il cognome");
        String cognome = input.nextLine();

        System.out.println("la tua eta e "+ eta + " il tuo nome e "+ nome + " il tuo cgonome e "+ cognome);

    }

    static void Addizione(int a,int b){
        int risultato = a + b;
        System.out.println(risultato);
    }





}
