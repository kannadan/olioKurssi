package viikkotehtävä4;

/**
 * Created by Joonas on 23.7.2016.
 */
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Kassajono jono = new Kassajono();
        int cycles = rand.nextInt(1000);
        int action;
        for (int i = 0; i < cycles; i++){
            action = rand.nextInt(2);
            if (action == 0){
                jono.lisaaElementti(new Asiakas());
            }
            else{
                jono.palautaElementti();
            }
        }
        System.out.println("\n\nUUSIA ASIAKKAITA EI OTETA SISÄÄN, SISÄLLÄ OLEVAT PALVELLAAN\n");
        while(!jono.onkoJonoTyhja()){
            jono.palautaElementti();
        }
        System.out.println("\nKierroksia oli " + cycles);
    }
}
