package com.example.tehtava;

/**
 * Created by Joonas on 18.5.2016.
 */
import java.util.Scanner;
public class tehtava2 {

    public static class Luvut {
        private int kpl, max, min, summa;
        private float avrg;

        public Luvut() {
            summa = 0;
            kpl = 0;
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
            avrg = 0;
        }

        public int getSumma() {
            return summa;
        }

        public void setUusi(final int uusi) {
            summa = summa + uusi;
            kpl++;
            avrg = (float)summa / kpl;
            if (uusi > max) {
                max = uusi;
            } else {
            }
            if (uusi < min) {
                min = uusi;
            } else {
            }
        }

        public float getAvrg() {
            return avrg;
        }

        public int getKpl() {
            return kpl;
        }

        public int getMax() {
            return max;
        }

        public int getMin() {
            return min;
        }
    }

    private static final Scanner lukija = new Scanner(System.in);

    public static void main(String[] args) {
        Luvut luokka = new Luvut();
        int kappale, summa, minimi, maximi;
        float keskiarvo;
        while (true) {
            System.out.println("Anna luku");
            int arvo = lukija.nextInt();
            if (arvo > 0) {
                luokka.setUusi(arvo);
            } else {
                break;
            }
        }
        kappale = luokka.getKpl();
        summa = luokka.getSumma();
        minimi = luokka.getMin();
        maximi = luokka.getMax();
        keskiarvo = luokka.getAvrg();
        System.out.printf("numeroita oli %s kappaletta.\n", kappale);
        System.out.println("keskiarvo = "+ keskiarvo);
        System.out.println("minimi = "+minimi);
        System.out.println("maksimi = "+maximi);
    }
}