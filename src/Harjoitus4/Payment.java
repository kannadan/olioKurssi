package Harjoitus4;

/**
 * Created by Joonas on 22.5.2016.
 */
public class Payment {

    protected static double summa = 0;
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
        summa += amount;
    }

    public double getSumma(){
        return summa;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        summa = summa + (amount-this.amount);
        this.amount = amount;
    }

    public void printPaymentDetails(){
        System.out.println("Amount is " + amount);
        System.out.println("");
    }

}
