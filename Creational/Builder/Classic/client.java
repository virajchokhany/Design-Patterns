package Builder.Classic;

public class client {
    public static void main(String[] args) {
        UserBuider buider = new UserBuider("Viraj", 27);
        buider.setAddress("ABC");
        buider.setEmail("viraj@xyz.com");
        User viraj = buider.build();
        System.out.println(viraj);
    }
}
