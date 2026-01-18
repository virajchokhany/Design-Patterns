package Behaviour.Strategy;

public class client {
    public static void main(String[] args) {
        PaymentStrategy paymentStrategy = new CreditCard();
        PaymentStrategy upiStrategy = new UpiPayment();

        PaymentContext paymentContext = new PaymentContext(paymentStrategy);
        paymentContext.pay(100.0);
        paymentContext.setPaymentStrategy(upiStrategy);
        paymentContext.pay(100.0);
    }
}
