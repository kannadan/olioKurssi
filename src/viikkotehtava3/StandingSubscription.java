package viikkotehtävä3;

/**
 * Created by Joonas on 23.7.2016.
 */
public class StandingSubscription extends Subscription {

    private int alennus;

    public StandingSubscription(String lehden_nimi, String tilaajan_nimi, String toimitusosoite, double hinta, int alennus) {
        super(lehden_nimi, tilaajan_nimi, toimitusosoite, hinta);
        this.alennus = alennus;
    }

    public int getAlennus() {
        return alennus;
    }

    public void setAlennus(int alennus) {
        this.alennus = alennus;
    }
}
