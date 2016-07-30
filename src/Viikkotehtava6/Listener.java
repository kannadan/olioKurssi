package Viikkotehtava6;

/**
 * Created by Joonas on 20.5.2016.
 * Class for catching user input
 */
import java.util.Scanner;

@SuppressWarnings("Duplicates")     // IDE juttu
public class Listener {
    private Scanner kuulija;

    public Listener(){
        kuulija = new Scanner(System.in);
    }

    public int getInt(){        // Lukee int arvoja. Ei hyväksy muita kuin int.
        boolean error = true;
        int tulos = 0;
        while (error){
            if (kuulija.hasNextInt()){
                tulos = kuulija.nextInt();
                error = false;
            }
            else{
                kuulija.nextLine();
                System.out.println("Not an int");
            }
        }
        kuulija.nextLine();
        return tulos;
    }

    public String getString(){
        String tulos = kuulija.nextLine();
        return tulos;
    }

    public double getDouble(){
        double tulos = kuulija.nextDouble();
        kuulija.nextLine();
        return tulos;
    }


}
