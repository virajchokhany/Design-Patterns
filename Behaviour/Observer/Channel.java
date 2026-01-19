import java.util.HashSet;

public class Channel implements Youtube{
    HashSet<IUser> users;

    public Channel() {
        this.users = new HashSet<>();
    }
    @Override
    public void register(IUser user) {
        // TODO Auto-generated method stub
        users.add(user);
    }

    @Override
    public void remove(IUser user) {
        // TODO Auto-generated method stub
        users.remove(user);
    }

    @Override
    public void notifySubscribers() {
        // TODO Auto-generated method stub
        for(IUser user : users){
            user.notifyUser();
        }
    }
    
}
