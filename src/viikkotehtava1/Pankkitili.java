package viikkotehtava1;

/**
 * Created by Joonas on 21.5.2016.
 */
public class Pankkitili {

    private String tilinumero, omistaja;
    private double saldo;

    public Pankkitili(String nimi, String tilinumero, double saldo){
        this.tilinumero = tilinumero;
        omistaja = nimi;
        this.saldo = saldo;
    }

    public Pankkitili(String nimi, String tilinumero){
        this.tilinumero = tilinumero;
        omistaja = nimi;
        this.saldo = 0;
    }


    public void setTilinumero(String tilinumero) {
        this.tilinumero = tilinumero;
    }

    public void setOmistaja(String omistaja) {
        this.omistaja = omistaja;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public String getTilinumero() {
        return tilinumero;
    }

    public String getOmistaja() {
        return omistaja;
    }

    public double getSaldo() {
        return saldo;
    }

    public void talletus(double raha){
        if (raha > 0) {
            saldo += raha;
        }
        else{
            System.out.println("Ei voi tallettaa negatiivista summaa");
        }
    }

    public void otto(double raha){
        if (raha < 0){
            System.out.println("Ei voi nostaa negatiivista summaa");
        }
        else if (saldo > raha) {
            saldo -= raha;
        }
        else{
           System.out.println("Tilillä ei ole tarpeeksi rahaa");
        }
    }

    public void info(){
        System.out.println("Tilinumero: " + tilinumero);
        System.out.println("Tilin omistaja: " + omistaja);
        System.out.println("Tilin saldo: " + saldo);
        System.out.println("");
    }

}
