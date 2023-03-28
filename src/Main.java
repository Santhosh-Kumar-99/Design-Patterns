import singleton.SingletonEager;
import singleton.SingletonLazy;

public class Main {
    public static void main(String[] args) {
        //Singleton Eager
        System.out.println(SingletonEager.getInstance());
        System.out.println(SingletonEager.getInstance());

        //Singleton Lazy
        System.out.println(SingletonLazy.getInstance());
        System.out.println(SingletonLazy.getInstance());
    }
}