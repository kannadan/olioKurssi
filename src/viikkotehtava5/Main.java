package viikkotehtava5;

/**
 * Created by Joonas on 29.7.2016.
 */

import java.util.ArrayList;
public class Main {


    public static void main(String[] args) {
        ArrayList<Tontti> tontit = new ArrayList<Tontti>();
        Listener sc = new Listener();
        System.out.println("Montako tonttia luodaan?");
        int arvo = sc.getInt();
        for (int i = 0; i < arvo; i++){
            tontit.add(new Tontti());
            System.out.println("\n");
        }
        System.out.println("\nTulostetaan Tonttien tiedot...\n");
        for (int i = 0; i < arvo; i++){
            System.out.println("Tontin numero " + (i+1) + " tiedot:\n");
            tontit.get(i).printInfo();
        }
    }



}
