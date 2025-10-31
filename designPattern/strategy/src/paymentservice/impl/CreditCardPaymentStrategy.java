package paymentservice.impl;

import paymentservice.IPaymentStrategy;

public class CreditCardPaymentStrategy implements IPaymentStrategy {

    @Override
    public void makePayment(int amount) {
        System.out.println("Payment of Rs " + amount + " done by Credit Card.");
    }
    
}
