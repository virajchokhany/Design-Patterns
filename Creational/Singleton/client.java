package Singleton;

public class client {
    public static void main(String[] args) {
        DoubleLocking doubleLocking = DoubleLocking.getInstance();
        System.out.println(doubleLocking.toString());
    }
}
