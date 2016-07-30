package Viikkotehtava6;

/**
 * Created by Joonas on 30.7.2016.
 */

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
public class Sanalista {

    private ArrayList<String> sanasto = new ArrayList<String>();
    private int koko = 0;

    public Sanalista (String tiedosto){
        Charset utf = Charset.forName("UTF-8");
        try(BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(tiedosto), utf)))
        {
            String rivi;
            while ((rivi = file.readLine()) != null) {
                sanasto.add(rivi);
            }
        }
        catch (IOException ioe){
            System.out.println("Virhe lukemisessa");
            ioe.printStackTrace();
        }

        koko = sanasto.size();
        for (int i = 0; i < koko; i++){
            sanasto.set(i, sanasto.get(i).toUpperCase());
        }



    }

    public Sanalista (ArrayList<String> sanat){
        sanasto = sanat;
        koko = sanat.size();
    }

    public int getKoko(){
        return koko;
    }

    public ArrayList<String> annaSanat(){
        return sanasto;
    }

    public Sanalista sanatJoidenPituusOn( int pituus ){
        ArrayList<String> uusi = new ArrayList<String>();
        for (int i = 0; i< koko; i++){
            if (sanasto.get(i).length() == pituus){
                uusi.add(sanasto.get(i));
            }
        }
        return new Sanalista(uusi);
    }

    public Sanalista sanaJoissaMerkit( String mjono ) {
        ArrayList<String> uusi = new ArrayList<String>();
        mjono = mjono.toUpperCase();
        int suurempi = mjono.length();
        if (suurempi > koko){
            suurempi = koko;
        }
        for (int i = 0; i< koko; i++){
            boolean oikea = true;
            for (int b = 0; b < suurempi; b++){
                if (sanasto.get(i).charAt(b) == mjono.charAt(b) && mjono.charAt(b) != '_'){
                    continue;
                }
                else if (mjono.charAt(b) == '_'){
                    continue;
                }
                else{
                    oikea = false;
                    break;
                }
            }
            if (oikea){
                uusi.add(sanasto.get(i));
            }

        }
        return new Sanalista(uusi);
    }

    public void printSanat(){
        for (int i = 0; i < koko; i++){
            System.out.println(sanasto.get(i));
        }

    }


}
