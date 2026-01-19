public class EmailNotificationStrategy implements NotificationStrategy{

    @Override
    public void notifyUser(IUser user) {
        // TODO Auto-generated method stub
        System.out.println("Notifying user via Email "+user.getName()+" "+user.getEmail()+" "+user.getPhoneNo());
    }
    
}
