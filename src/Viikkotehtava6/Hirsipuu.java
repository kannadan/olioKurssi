package Viikkotehtava6;

import java.util.ArrayList;

/**
 * Created by Joonas on 30.7.2016.
 */

import java.util.Random;
import java.util.ArrayList;
public class Hirsipuu {

    private int vuorot = 0, koko = 0, oikein = 0;
    private Sanalista sanasto = null;
    private String sana = "", userWord = "_ ";
    private ArrayList<Character> merkit = new ArrayList<Character>();
    private ArrayList<Character> vanhat = new ArrayList<Character>();
    private boolean valmis = false, voitto = false;

    public Hirsipuu(Sanalista sanat, int vuorot){
        this.vuorot = vuorot;
        sanasto = sanat;
        Random rand = new Random();
        int index = rand.nextInt(sanasto.getKoko());
        sana = sanasto.annaSanat().get(index);
        koko = sana.length();
        merkit.add('_');
        for (int i = 1; i< koko; i++){
            userWord = userWord + "_ ";
            merkit.add('_');
        }
    }

    public boolean arvaa( Character merkki ){
        vanhat.add(merkki);
        boolean tulos = false;
        for (int i = 0; i< koko; i++){
            if (sana.charAt(i) == merkki){
                merkit.set(i, merkki);
                tulos = true;
                oikein++;
            }
        }
        userWord = "";
        for (int i = 0; i< koko; i++){
            userWord = userWord + merkit.get(i) + " ";
        }
        if (!tulos) {
            vuorot--;
        }
        if (oikein == koko ){
            valmis = true;
            voitto = true;
        }
        if (vuorot == 0){
            valmis = true;
        }
        return tulos;
    }


    public ArrayList<Character> arvaukset(){
        return vanhat;
    }

    public int arvauksiaOnJaljella(){
        return vuorot;
    }

    public String sana( ){
        return sana;
    }

    public boolean onLoppu(){
        return valmis;

    }

    public String getUserWord(){
        return userWord;
    }

    public String getSana(){
        return sana;
    }
    public boolean isVoitto(){
        return voitto;
    }
}
