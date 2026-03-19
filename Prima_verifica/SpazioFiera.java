/**
 * @author Andrea Di Santo
 * Questa classe e una classe che contiene 4 attribbuti. 3 di tipo int 
 * e 1 di tipo boolean.
 * Sono incapsulati infatti sono messi come private e per accedere a loro
 * un altra classe dovra usare i metodi getter e setter.
 * Il costruttore di questa classe agisce da stampino creando il progetto 
 * dell oggetto.
 * @version 1
*/
public class SpazioFiera {

    private int codiceUnivoco;
    private int metriQuadri;
    private int costoBase;
    private boolean isPrenotato;

    public SpazioFiera(int codiceUnivoco,int metriQuadri,int costoBase,boolean isPrenotato){

        this.codiceUnivoco = codiceUnivoco;
        this.metriQuadri = metriQuadri;
        this.costoBase = costoBase;
        this.isPrenotato = isPrenotato;
    }

    public int getterCodiceUnivoco(){
        return codiceUnivoco;
    }
    public int getterMetriQuadri(){
        return metriQuadri;
    }
    public int getterCostoBase(){
        return costoBase;
    }
    public boolean getterIsPrenotato(){
        return isPrenotato;
    }



    public void setterCodiceUnivoco(){
        this.codiceUnivoco = codiceUnivoco;
    }

    public void setterMetriQuadri(){
        this.metriQuadri = metriQuadri;
    }

    public void setterCostoBase(){
        this.costoBase = costoBase;
    }

    public void setterIsPrenotato(){
        this.isPrenotato = isPrenotato;
    }

    
}
