package viikkotehtävä4;

/**
 * Created by Joonas on 23.7.2016.
 */
import java.util.Random;
public class Kateismaksu extends Maksu{

    public Kateismaksu(){

    }

    @Override
    public void invoice(){
        System.out.println("\tKäteismaksu:");
        super.summa();
    }

}
