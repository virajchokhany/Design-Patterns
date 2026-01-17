package Factory.FactoryGoF;

public class EmailNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Notifying via Email");
    }
    
}
