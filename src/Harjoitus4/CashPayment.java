package Harjoitus4;

/**
 * Created by Joonas on 22.5.2016.
 */
public class CashPayment extends Payment {

    public CashPayment(double amount) {
        super(amount);
        System.out.println("Cash object made");
        System.out.println("");
    }

    @Override
    public void printPaymentDetails() {
        System.out.println("Amount paid is " + amount);
        System.out.println("Paid in cash");
        System.out.println("");
    }
}
