package viikkotehtävä3;

/**
 * Created by Joonas on 23.7.2016.
 */
public class Main {

    static void printSubscriptionInvoice(Subscription subs){
        String lehti, tyyppi, tilaaja, osoite, kuukausia, koko;
        int aika, alennus;
        double hinta;
        lehti = "Lehden nimi on:\n" + subs.getLehden_nimi();
        if (subs instanceof RegularSubscription){
            tyyppi = "normaali tilaus";
            aika = ((RegularSubscription) subs).getKesto();
            hinta = subs.getHinta();
            hinta = hinta*aika;
            koko = "Tälle ajalle kokonais hinnaksi tulee:\n" + hinta + " euroa";
        }
        else {
            tyyppi = "kestotilaus";
            aika = 12;
            alennus = ((StandingSubscription) subs).getAlennus();
            hinta = subs.getHinta();
            hinta = hinta*(1-(alennus/100.0));
            koko = "Kestotilaajana vuosimaksuksesi tulee:\n" + (hinta*12) + " euroa";
        }
        tyyppi = "Tilauksen tyyppi on:\n" + tyyppi;
        tilaaja = "Tilaaja on:\n" + subs.getTilaajan_nimi();
        osoite = "Tilaus osoite on:\n" + subs.getToimitusosoite();
        kuukausia = "Tilaus kuukausia on:\n" + aika;
        System.out.println(tyyppi);
        System.out.println(lehti);
        System.out.println(tilaaja);
        System.out.println(osoite);
        System.out.println(kuukausia);
        System.out.println(koko);



    }

    public static void main(String[] args) {
        String lehti, tyyppi, tilaaja, osoite;
        int aika, alennus;
        double hinta;
        Listener sc = new Listener();
        System.out.println("Tehdään normaali tilaus \nMinkä lehden tilaat?");
        lehti = sc.getString();
        System.out.println("Mikä on nimesi?");
        tilaaja = sc.getString();
        System.out.println("Mikä on toimitusosoite?");
        osoite = sc.getString();
        System.out.println("Monenko kuukauden tilaus?");
        aika = sc.getInt();
        System.out.println("Mikä on lehden kuukausi hinta");
        hinta = sc.getDouble();
        Subscription sub1 = new RegularSubscription(lehti, tilaaja, osoite, hinta, aika);

        System.out.println("\nTehdään kestotilaus \nMinkä lehden tilaat?");
        lehti = sc.getString();
        System.out.println("Mikä on nimesi?");
        tilaaja = sc.getString();
        System.out.println("Mikä on toimitusosoite?");
        osoite = sc.getString();
        System.out.println("Mikä on lehden kuukausi hinta");
        hinta = sc.getDouble();
        System.out.println("Mikä on alennus prosentti?");
        alennus = sc.getInt();
        Subscription sub2 = new StandingSubscription(lehti, tilaaja, osoite, hinta, alennus);
        System.out.println("\nTilaus 1");
        printSubscriptionInvoice(sub1);
        System.out.println("\nTilaus 2");
        printSubscriptionInvoice(sub2);

    }
}
