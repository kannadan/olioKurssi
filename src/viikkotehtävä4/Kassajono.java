package viikkotehtävä4;

/**
 * Created by Joonas on 23.7.2016.
 */

public class Kassajono implements JonoInterface<Asiakas>{
    private int pituus = 5;
    private int jonoStart = 0;
    private int jonoEnd = 0;
    private Asiakas[] asiakkaat;
    private Asiakas[] temp;
    private int empty = 0;

    public Kassajono() {
        asiakkaat = new Asiakas[pituus];
    }

    @Override
    public void lisaaElementti(Asiakas henkilö){
        if (jonoEnd != jonoStart || onkoJonoTyhja() ){
            asiakkaat[jonoEnd] = henkilö;
            if (jonoEnd == pituus-1){
                jonoEnd = 0;
            }
            else {
                jonoEnd++;
            }
        }
        else{
            System.out.println("\nLAAJENNETAAN JONOA\n");
            temp = new Asiakas[pituus];
            int i = jonoStart;
            int j = 0;
            while(true){
                temp[j] = asiakkaat[i];
                if (i == pituus-1){
                    i = 0;
                }
                else{
                    i++;
                }
                if (j != pituus-1){
                    j++;
                }
                else{
                    break;
                }
            }
            jonoEnd = pituus;
            pituus = pituus + 5;
            asiakkaat = new Asiakas[pituus];
            for (i = 0; i <= pituus-6; i++){
                asiakkaat[i] = temp[i];
            }
            jonoStart = 0;
            asiakkaat[jonoEnd] = henkilö;
            jonoEnd++;
        }
        System.out.println("lisättiin asiakas jonoon");
        empty = 1;
    }

    @Override
    public void palautaElementti() {
        if (onkoJonoTyhja()){
            System.out.println("jono tyhjä");
        }
        else{
            System.out.println("Asiakas alkaa maksaa ostoksiaan:");
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException ex){
                Thread.currentThread().interrupt();
            }
            asiakkaat[jonoStart].maksa();
            if (jonoStart == pituus-1){
                jonoStart = 0;
            }
            else {
                jonoStart++;
            }
        }
        if (jonoStart == jonoEnd){
            empty = 0;
        }
        else{}

    }

    @Override
    public boolean onkoJonoTyhja() {
        if (empty == 0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean onkoJonoOlemassa() {
        if (asiakkaat.length >= 5) {
            return true;
        }
        else {
            return false;
        }
    }
}
