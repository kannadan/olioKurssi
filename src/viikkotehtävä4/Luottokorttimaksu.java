package viikkotehtävä4;

/**
 * Created by Joonas on 23.7.2016.
 */
import java.util.Random;
public class Luottokorttimaksu extends Maksu{
    int korttinumero;
    Random rad = new Random();

    public Luottokorttimaksu(){
        korttinumero = rand.nextInt(1000000);
    }
    @Override
    public void invoice(){
        System.out.println("\tLuottokorttimaksu kortilla: " + korttinumero);
        super.summa();
    }

}
