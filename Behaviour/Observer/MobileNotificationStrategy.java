public class MobileNotificationStrategy implements NotificationStrategy{

    @Override
    public void notifyUser(IUser user) {
        // TODO Auto-generated method stub
        
        System.out.println("Notifying user via Mobile "+user.getName()+" "+user.getEmail()+" "+user.getPhoneNo());
    }
    
}
