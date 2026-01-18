package Behaviour.Strategy;

public class PaymentContext {
    PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void setPaymentStrategy(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void pay(double amount){
        this.strategy.pay(amount);
    }
}
