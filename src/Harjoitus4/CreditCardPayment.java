package Harjoitus4;

/**
 * Created by Joonas on 22.5.2016.
 */
public class CreditCardPayment extends Payment {

    private String creditCardNumber;

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public CreditCardPayment(double amount, String number) {
        super(amount);
        creditCardNumber = number;
        System.out.println("Credit card object made");
        System.out.println("");
    }

    @Override
    public void printPaymentDetails() {
        System.out.println("Payment amount is " + amount);
        System.out.println("Payment maid with credit card");
        System.out.println("Credit card number is " + creditCardNumber);
        System.out.println("");
    }
}
