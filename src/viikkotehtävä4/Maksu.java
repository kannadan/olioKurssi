package viikkotehtävä4;

/**
 * Created by Joonas on 24.7.2016.
 */
import java.util.Random;
public class Maksu {
    Random rand = new Random();
    double summa = rand.nextInt(1000)*1.0;

    public void summa(){
        System.out.println("\tMaksun määrä: " + summa + " euroa");
    }
    public void invoice(){
        summa();
    }
}
