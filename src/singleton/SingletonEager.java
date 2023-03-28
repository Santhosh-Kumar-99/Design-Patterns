package singleton;

public class SingletonEager {
    private  static SingletonEager singletonEager = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInstance(){
        return singletonEager;
    }

}
