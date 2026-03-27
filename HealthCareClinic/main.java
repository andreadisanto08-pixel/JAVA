package HealthCareClinic;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ArrayList<OspedaleManager> manager = new ArrayList<OspedaleManager>();

        manager.add(new OspedaleManager());

        RicoverOdinario p1 = new RicoverOdinario("mario", 0234, 100, true);
        RicoveroDayHospital p2 = new RicoveroDayHospital("rietto", 232, 100);

        try{
            for(int i=0;i<51;i++)
            {
                manager.get(0).aggiungiPaziente(p1);
            }
        }
        catch(OspedalePienoException e){

            System.out.println("hai raggiunto il limite di pazienti");
        }


        























    }
    
}
