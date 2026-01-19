public class User implements IUser{
    int id;
    String name,email,phoneNo;
    static int counter = 0;
    NotificationStrategy notificationStrategy;

    public User(String name, String email, String phoneNo,NotificationStrategy notificationStrategy) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.id = counter++;
        this.notificationStrategy = notificationStrategy;
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public String getEmail() {
        // TODO Auto-generated method stub
        return email;
    }

    @Override
    public String getPhoneNo() {
        // TODO Auto-generated method stub
        return phoneNo;
    }
    @Override
    public void notifyUser() {
        notificationStrategy.notifyUser(this);
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(!(obj instanceof User))return false;
        if(this == obj)return true;
        User user = (User)(obj);
        return this.id == user.id;
    }

    @Override
    public int hashCode(){
        return Integer.hashCode(id);
    }
    
}
