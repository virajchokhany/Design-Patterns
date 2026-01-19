public interface Youtube {
    void register(IUser user);
    void remove(IUser user);
    void notifySubscribers();
    
}
