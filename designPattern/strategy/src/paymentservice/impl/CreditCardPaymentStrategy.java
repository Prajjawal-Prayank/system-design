package paymentservice.impl;

import paymentservice.IPaymentStrategy;

public class CreditCardPaymentStrategy implements IPaymentStrategy {

    @Override
    public void makePayment(int amount) {
        System.out.println("Payment done by Credit Card.");
    }
    
}
