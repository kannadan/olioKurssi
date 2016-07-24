package viikkotehtävä4;

/**
 * Created by Joonas on 23.7.2016.
 */

public class Kassajono implements JonoInterface{
    private int pituus = 5;

    public Kassajono() {
        private Asiakas[] asiakkaat = Asiakas[pituus];
    }



    @Override
    public void palauataElementti() {

    }

    @Override
    public boolean onkoJonoTyhja() {
        return false;
    }

    @Override
    public boolean onkoJonoOlemassa() {
        return false;
    }
}
