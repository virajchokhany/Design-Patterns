public class client {
    public static void main(String[] args) {
        IUser mom = new User("Vinita", "vinita@xyz.com", "456", new EmailNotificationStrategy());
        IUser ashu = new User("Ashu", "ashu@xyz.com", "123", new MobileNotificationStrategy());

        Youtube virajChannel = new Channel();
        virajChannel.register(mom);
        virajChannel.register(ashu);

        virajChannel.notifySubscribers();
    }
}
