package Factory.FactoryGoF;

public class SMSNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Notifying via SMS");
    }
    
}
