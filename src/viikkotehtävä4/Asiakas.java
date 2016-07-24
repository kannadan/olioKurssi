package viikkotehtävä4;

/**
 * Created by Joonas on 23.7.2016.
 */
import java.util.Random;
public class Asiakas {
    Random rand = new Random();
    int tyyppi, numero;
    Maksu maksu;

    public Asiakas() {
        tyyppi = rand.nextInt(2);
        numero = rand.nextInt(10000);
        if (tyyppi == 1){
            maksu = new Kateismaksu();
        }
        else{
            maksu = new Luottokorttimaksu();
        }
    }

    public void maksa(){
        System.out.println("\tAsiakas:");
        System.out.println("\tAsiakasnumero: " + numero);
        maksu.invoice();
        System.out.println("\tmaksoi ostoksen");
    }
}
