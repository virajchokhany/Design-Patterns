package Builder.Classic;

public class UserBuider {

    String name;
    int age;
    String email;
    String address;

    public UserBuider(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public UserBuider setEmail(String email){
        this.email = email;
        return this;
    }

    public UserBuider setAddress(String address){
        this.address = address;
        return this;
    }

    public User build(){
        return new User(this);
    }
}
