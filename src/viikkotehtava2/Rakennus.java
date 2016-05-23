package viikkotehtava2;

import Harjoitus3.Listener;

/**
 * Created by Joonas on 23.5.2016.
 */
public class Rakennus {
    private String pintaAla;
    private int huoneLkm, asukasLkm = 0;
    private Asukas[] asukkaat = new Asukas[asukasLkm];

    public Rakennus(){
        Listener sc = new Listener();
        System.out.println("Anna rakennuksen pinta-ala");
        pintaAla = sc.getString();
        System.out.println("Anna huoneiden lukumäärä");
        huoneLkm = sc.getInt();
        System.out.println("Montako asukasta asuu talossa");
        asukasLkm = sc.getInt();
        asukkaat = new Asukas[asukasLkm];
        System.out.println("");
        for (int x = 0; x < asukasLkm; x++){
            System.out.println("Asukkaan nro " + (x+1) + " tiedot");
            asukkaat[x] = new Asukas();
        }
    }

    public Rakennus(final String pintaAla, final int huoneLkm){
        this.pintaAla = pintaAla;
        this.huoneLkm = huoneLkm;
    }

    public void addAsukas(Asukas asukas){
        asukasLkm++;
        Asukas[] temp = asukkaat.clone();
        asukkaat = new Asukas[asukasLkm];
        for (x = 0; x< asukasLkm-1; x++){
            asukkaat[x] = temp[x];
        }
        asukkaat[asukasLkm] = asukas;
    }

    public void setAsukkaat(Asukas[] asukkaat){
        this.asukkaat = asukkaat;
    }

    public String getPintaAla() {
        return pintaAla;
    }

    public void setPintaAla(String pintaAla) {
        this.pintaAla = pintaAla;
    }

    public int getHuoneLkm() {
        return huoneLkm;
    }

    public void setHuoneLkm(int huoneLkm) {
        this.huoneLkm = huoneLkm;
    }

    public int getAsukasLkm() {
        return asukasLkm;
    }

    public void setAsukasLkm(int asukasLkm) {
        this.asukasLkm = asukasLkm;
    }
}
