package Builder.Classic;

public class User {

    String name;
    int age;
    String email;
    String address;

    public User(UserBuider userBuider) {
        this.name = userBuider.name;
        this.age = userBuider.age;
        this.email = userBuider.email;
        this.address = userBuider.address;
    }

    @Override
    public String toString(){
        return this.name+" "+this.address+" "+this.age+" "+this.email;
    }
}
