package viikkotehtävä3;

/**
 * Created by Joonas on 23.7.2016.
 */

public class Subscription {

    private String lehden_nimi, tilaajan_nimi, toimitusosoite;
    private double hinta;

    public Subscription(String lehden_nimi, String tilaajan_nimi, String toimitusosoite, double hinta) {
        this.lehden_nimi = lehden_nimi;
        this.tilaajan_nimi = tilaajan_nimi;
        this.toimitusosoite = toimitusosoite;
        this.hinta = hinta;
    }

    public String getLehden_nimi() {
        return lehden_nimi;
    }

    public void setLehden_nimi(String lehden_nimi) {
        this.lehden_nimi = lehden_nimi;
    }

    public String getTilaajan_nimi() {
        return tilaajan_nimi;
    }

    public void setTilaajan_nimi(String tilaajan_nimi) {
        this.tilaajan_nimi = tilaajan_nimi;
    }

    public String getToimitusosoite() {
        return toimitusosoite;
    }

    public void setToimitusosoite(String toimitusosoite) {
        this.toimitusosoite = toimitusosoite;
    }

    public double getHinta() {
        return hinta;
    }

    public void setHinta(double hinta) {
        this.hinta = hinta;
    }
}
