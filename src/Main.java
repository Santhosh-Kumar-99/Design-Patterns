import factory.AnimalFactory;
import factory.Dog;
import singleton.SingletonEager;
import singleton.SingletonLazy;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        //Singleton Eager
        System.out.println(SingletonEager.getInstance());
        System.out.println(SingletonEager.getInstance());

        //Singleton Lazy
        System.out.println(SingletonLazy.getInstance());
        System.out.println(SingletonLazy.getInstance());

        //Factory
        System.out.println(AnimalFactory.produceAnimal(Dog.class));
        System.out.println(AnimalFactory.produceAnimalWithString("cat"));
    }
}