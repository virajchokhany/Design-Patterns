package Behaviour.Strategy;

public class CreditCard implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Paying amount : "+amount+" via Credit Card");
    }
    
}
