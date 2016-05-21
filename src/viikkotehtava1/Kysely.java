package viikkotehtava1;


/**
 * Created by Joonas on 21.5.2016.
 * Asks info for the bank account creation
 */
public class Kysely {
    String nimi, numero;
    double summa;

    public Kysely(){
        Listener sc = new Listener();
        System.out.println("Anna nimi");
        nimi = sc.getString();
        System.out.println("Anna tilinumero");
        numero = sc.getString();
        System.out.println("Anna saldo");
        summa = sc.getDouble();
        System.out.println("");
    }
}
