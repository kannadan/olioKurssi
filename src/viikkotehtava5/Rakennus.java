package viikkotehtava5;


/**
 * Created by Joonas on 23.5.2016.
 */
import java.util.ArrayList;
public class Rakennus {

    private String tyyppi;
    private int asukasLkm = 0, talotyyppi, asunnot, huoneLkm, talonAsukkaat = 0;
    private ArrayList<ArrayList<Asukas>> asunnotLista = new ArrayList<ArrayList<Asukas>>();
    private ArrayList<String> pintaAlat = new ArrayList<String>();
    private ArrayList<Integer> asunnonHuoneet = new ArrayList<Integer>();
    private Listener sc = new Listener();

    public Rakennus(){
        System.out.println("Mitä tyyppiä talo on?\n\tJos talo on KERROSTALO, syötä numero 1\n\tJos talo on RIVITALO, " +
                "syötä numero 2\n\tJos talo on OMAKOTITALO, syötä numero 3");
        talotyyppi = sc.getInt();
        switch (talotyyppi){
            case 1:
                tyyppi = "Kerrostalo";
                break;
            case 2:
                tyyppi = "Rivitalo";
                break;
            case 3:
                tyyppi = "Omakotitalo";
                break;
        }
        if (talotyyppi != 3){
            System.out.println("Montako asuntoa talossa on?");
            asunnot = sc.getInt();
            for (int i = 0; i < asunnot; i++){
                ArrayList<Asukas> asukkaat = new ArrayList<Asukas>();
                System.out.println("Montako asukasta asunnossa numero " + (i+1) + " on");
                asukasLkm = sc.getInt();
                talonAsukkaat += asukasLkm;
                for (int b = 0; b < asukasLkm; b++){
                    asukkaat.add(new Asukas());
                }
                asunnotLista.add(asukkaat);
                System.out.println("Mikä on asunnon numero "+ (i+1) + " pinta-ala?");
                String pa = sc.getString();
                pintaAlat.add(i, pa);
                System.out.println("Montako huonetta asunnossa numero " + (i+1) + " on?");
                huoneLkm = sc.getInt();
                asunnonHuoneet.add(huoneLkm);

            }
        }
        else{
            System.out.println("Montako asukasta omakotitalossa asuu?");
            asukasLkm = sc.getInt();
            talonAsukkaat += asukasLkm;
            ArrayList<Asukas> asukkaat = new ArrayList<Asukas>();
            for (int b = 0; b < asukasLkm; b++){
                asukkaat.add(new Asukas());
            }
            asunnotLista.add(asukkaat);
            System.out.println("Montako huonetta talossa on?");
            huoneLkm = sc.getInt();
            asunnonHuoneet.add(huoneLkm);
            System.out.println("Mikä on talon pinta-ala?");
            String pa = sc.getString();
            pintaAlat.add(pa);

        }
    }


    public int getAsunnot(){
        return this.asunnot;
    }


    public int getAsukasLkm() {
        return talonAsukkaat;
    }

    public void addAsukas(int numero){
        asunnotLista.get(numero).add(new Asukas());
    }

    public void removeAsukas(int numero){
        asunnotLista.get(numero).remove(asunnotLista.get(numero).size());
    }

    public void printInfo(){
        System.out.println("Rakennuksen tiedot:\n");
        System.out.println("\tTyyppi: \t" + tyyppi);
        if (tyyppi != "Omakotitalo"){
            System.out.println("\tAsuntoja:\t" + asunnot);
            for (int i = 0; i < asunnot; i++) {
                System.out.println("\nAsunnon numero " + (i+1) + " tiedot:");
                System.out.println("\tAsunnon pinta-ala:\t" + pintaAlat.get(i));
                System.out.println("\tHuoneita:\t" + asunnonHuoneet.get(i));
                System.out.println("\tAsukkaita:\t" + asunnotLista.get(i).size());
                for (int b = 0; b < asunnotLista.get(i).size(); b++){
                    asunnotLista.get(i).get(b).printInfo();
                }
            }
        }
        else {
            System.out.println("\nTalon tiedot:");
            System.out.println("\tPinta-ala:\t" + pintaAlat.get(0));
            System.out.println("\tHuoneita:\t" + asunnonHuoneet.get(0));
            System.out.println("\tAsukkaita:\t" + asunnotLista.get(0).size());
            for (int b = 0; b < asunnotLista.get(0).size(); b++) {
                asunnotLista.get(0).get(b).printInfo();
            }
        }
        System.out.println("\n");
    }

}
