package viikkotehtava5;

import Harjoitus3.Listener;

/**
 * Created by Joonas on 23.5.2016.
 */
public class Asukas {
    private String nimi;

    public Asukas(){
        Listener sc = new Listener();
        System.out.println("Anna asukkaalle nimi");
        nimi = sc.getString();
    }

    public Asukas(String nimi){
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }


    public void printInfo(){
        System.out.println(nimi);
    }
}
