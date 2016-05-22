package Harjoitus4;

/**
 * Created by Joonas on 21.5.2016.
 */
import Harjoitus3.Listener;
public class Main {

    private static Listener sc = new Listener();

    private static double getTotal(){
        Payment check = new Payment(0);
        double total;
        total = check.getSumma();
        return total;
    }

    public static void main(String[] args){
        double amount;
        String number;
        Payment maksu1;
        CashPayment maksu2;
        CreditCardPayment maksu3;

        //Kerää maksun tiedot
        System.out.println("give payment amount ");
        amount = sc.getDouble();
        System.out.println("give credit card number");
        number = sc.getString();

        //Luo kolme maksua eri maksuluokissa
        maksu1 = new Payment(amount);
        maksu2 = new CashPayment(amount);
        maksu3 = new CreditCardPayment(amount, number);

        //printtaa maksu detaljit
        maksu1.printPaymentDetails();
        maksu2.printPaymentDetails();
        maksu3.printPaymentDetails();

        //maksujen yhteismäärä
        System.out.println("Maksujen kokonais määrä on " + getTotal());
    }

}
