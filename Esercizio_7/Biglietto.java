package JAVA.Esercizio_7;


public class Biglietto {
    private int numeroPosto;
    private String settore;
    private double prezzoBase;
    private boolean isVenduto;


    
    public Biglietto(int numeroPosto,String settore,double prezzoBase,boolean isVenduto){
        this.numeroPosto=numeroPosto;
        this.settore=settore;
        this.isVenduto=isVenduto;
        this.prezzoBase=prezzoBase;
    }



    public void setterIsVenduto(boolean isVenduto){
        this.isVenduto=isVenduto;
    }

    public boolean getterIsVenduto(){
        return this.isVenduto;
    }
    public int getternumeroPosto(){
        return this.numeroPosto;
    }
    public double getterPrezzoBase(){
        return this.prezzoBase;
    }
    public String getterSettore(){
        return this.settore;
    }
    

}
