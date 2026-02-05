/*+
@author Andrea Di Santo
La classe articolo 


*/
package Simulazione_verifica;

public class Articolo {

    private String nome;
    private double prezzo;
    private final double IVA = 0.04;

    public Articolo(String nome,double prezzo){

        this.nome = nome;
        this.prezzo = prezzo;

    }

    public String getNome(){
        return nome;
    }
    public Double getPrezzo(){
        return prezzo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }

    }




