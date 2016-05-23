package viikkotehtava2;

import Harjoitus3.Listener;

/**
 * Created by Joonas on 23.5.2016.
 */
public class Main {

    public static void main(String[] args) {
        Tontti[] tontit;
        int tonttienLkm;
        Listener sc = new Listener();
        System.out.println("Montako tonttia luodaan");
        tonttienLkm = sc.getInt();
        tontit = new Tontti[tonttienLkm];
        for (int i = 0; i < tonttienLkm; i++){
            tontit[i] = new Tontti();
        }
        tontit[0].printAllInfo();
    }


}
