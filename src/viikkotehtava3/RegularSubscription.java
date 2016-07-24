package viikkotehtävä3;

/**
 * Created by Joonas on 23.7.2016.
 */
public class RegularSubscription extends Subscription {

    private int kesto;

    public RegularSubscription(String lehden_nimi, String tilaajan_nimi, String toimitusosoite, double hinta, int kesto) {
        super(lehden_nimi, tilaajan_nimi, toimitusosoite, hinta);
        this.kesto = kesto;
    }

    public int getKesto() {
        return kesto;
    }

    public void setKesto(int kesto) {
        this.kesto = kesto;
    }
}
