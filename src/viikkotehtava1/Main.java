package viikkotehtava1;


/**
 * Created on 21.5.2016.
 */
public class Main {

    public static void main(String[] args){
        Kysely asiakas = new Kysely();
        Pankkitili tili = new Pankkitili(asiakas.nimi, asiakas.numero, asiakas.summa);
        tili.info();
        tili.otto(150);
        tili.info();
        tili.talletus(133);
        tili.info();
        tili.otto(-100);
        tili.otto(10000);
        tili.talletus(-100);

    }

}
