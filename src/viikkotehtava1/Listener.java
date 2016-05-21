package viikkotehtava1;

/**
 * Created by Joonas on 20.5.2016.
 * Class for catching user input
 */
import java.util.Scanner;

public class Listener {
    private Scanner kuulija;

    public Listener(){
        kuulija = new Scanner(System.in);
    }

    public int getInt(){
        int tulos = kuulija.nextInt();
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
