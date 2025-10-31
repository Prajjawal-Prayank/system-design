package paymentservice.impl;

import paymentservice.IPaymentStrategy;

public class ChequePaymentStrategy implements IPaymentStrategy {

    @Override
    public void makePayment(int amount) {
        System.out.println("Payment of Rs " + amount + " done by Cheque.");
    }
    
}
