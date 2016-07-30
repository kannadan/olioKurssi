package Viikkotehtava6;

/**
 * Created by Joonas on 30.7.2016.
 */
import java.util.ArrayList;
public class Main {

    public static Character tarkistus(String sana, Hirsipuu peli){
        sana = sana.toUpperCase();
        Listener sc = new Listener();
        boolean valmis = false;
        while (!valmis) {
            while (sana.length() != 1) {
                System.out.println("vain yksi merkki. yritä uudestaan");
                sana = sc.getString().toUpperCase();
            }
            if (peli.arvaukset().contains(sana.charAt(0))) {
                System.out.println("merkki jo arvattu");
                sana = "jee";
            }
            else{
                valmis = true;
            }
        }
        Character c = sana.charAt(0);
        return c;
    }

    public static void main(String[] args) {
        Listener sc = new Listener();
        System.out.println("HIRSIPUU\n\n");
        System.out.println("Anna tiedoston nimi. Muista .txt");
        String tiedosto = sc.getString();
        Sanalista sanat = new Sanalista("Viikkotehtava6/" + tiedosto);
        //System.out.println("Montako vuoroa pelissä on?");     "Ei voi piirtää hirsipuuta järkevästi jos pelaaja päättää vuorot.
        //int vuorot = sc.getInt();
        Hirsipuu peli = new Hirsipuu(sanat, 10);
        Piirra piirtaja = new Piirra();
        piirtaja.setVaihe(11);
        System.out.println("\n" + peli.getUserWord());
        String arvaus;
        Character merkki;
        while (true){
            System.out.println("Arvaa merkki.");
            arvaus = sc.getString();
            merkki = tarkistus(arvaus, peli);
            peli.arvaa(merkki);
            if (peli.onLoppu()){
                if (peli.isVoitto()){
                    piirtaja.setVaihe(peli.arvauksiaOnJaljella());
                    System.out.println("\n" + peli.getUserWord());
                    System.out.println("\n\nOnneksi olkoon, voitit pelin\nSana oli:\t" + peli.getSana());
                }
                else{
                    piirtaja.setVaihe(peli.arvauksiaOnJaljella());
                    System.out.println("\n" + peli.getUserWord());
                    System.out.println("\n\nPeli päättyi, Hävisit pelin.\nSana oli:\t" + peli.getSana());
                }
                break;

            }
            piirtaja.setVaihe(peli.arvauksiaOnJaljella());
            System.out.println("\n" + peli.getUserWord());
            System.out.println("yrityksiä jäljellä " + peli.arvauksiaOnJaljella());


        }
    }
}
