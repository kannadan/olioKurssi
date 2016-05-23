package viikkotehtava2;

import Harjoitus3.Listener;

/**
 * Created by Joonas on 23.5.2016.
 */
public class Asukas {
    private String nimi, syntymaAika;

    public Asukas(){
        Listener sc = new Listener();
        System.out.println("Anna asukkaalle nimi");
        nimi = sc.getString();
        System.out.println("Anna asukkaan syntymäaika");
        syntymaAika = sc.getString();
        System.out.println("");
    }

    public Asukas(String nimi, String syntymaAika){
        this.nimi = nimi;
        this.syntymaAika = syntymaAika;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getSyntymaAika() {
        return syntymaAika;
    }

    public void setSyntymaAika(String syntymaAika) {
        this.syntymaAika = syntymaAika;
    }

    public void printInfo(){
        System.out.println("Asukkaan nimi on " + nimi);
        System.out.println("Asukas on syntynyt "+ syntymaAika);
    }
}
