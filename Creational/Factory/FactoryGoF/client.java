package Factory.FactoryGoF;

public class client {
    public static void main(String[] args) {
        NotificationFactory emailNotificationFactory = new EmailNotificationFactory();
        emailNotificationFactory.notifyUser();
    }
}
