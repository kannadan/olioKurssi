package viikkotehtava2;

/**
 * Created by Joonas on 23.5.2016.
 */

import Harjoitus3.Listener;

public class Tontti {
    private Rakennus talo = null;
    private String nimi, sijainti, pintaAla;

    public Tontti(){
        Listener sc = new Listener();
        System.out.println("Anna tontin nimi");
        this.nimi = sc.getString();
        System.out.println("anna tontin LEVEYS koordinaatti");
        String leveys = sc.getString();
        System.out.println("anna tontin PITUUS koordinaatti");
        String pituus = sc.getString();
        this.sijainti = "Leveys: " + leveys + "," + "Pituus: " + pituus;
        System.out.println("Anna tontin pinta-ala");
        this.pintaAla = sc.getString();
        System.out.println("");
        talo = new Rakennus();
    }

    public Tontti(String nimi, String sijainti, String pintaAla) {
        this.nimi = nimi;
        this.sijainti = sijainti;
        this.pintaAla = pintaAla;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getSijainti() {
        return sijainti;
    }

    public void setSijainti(String sijainti) {
        this.sijainti = sijainti;
    }

    public String getPintaAla() {
        return pintaAla;
    }

    public void setPintaAla(String pintaAla) {
        this.pintaAla = pintaAla;
    }



}
