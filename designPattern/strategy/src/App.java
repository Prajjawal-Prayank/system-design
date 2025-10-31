import paymentservice.IPaymentStrategy;
import paymentservice.impl.CashPaymentStrategy;
import paymentservice.impl.ChequePaymentStrategy;
import paymentservice.impl.CreditCardPaymentStrategy;

public class App {
    public static void main(String[] args) throws Exception {
        IPaymentStrategy paymentStrategy = null;

        // cash payment
        paymentStrategy = new CashPaymentStrategy();
        paymentStrategy.makePayment(10);

        // credit card payment
        paymentStrategy = new CreditCardPaymentStrategy();
        paymentStrategy.makePayment(100);

        // cheque payment
        paymentStrategy = new ChequePaymentStrategy();
        paymentStrategy.makePayment(500);
    }
}
