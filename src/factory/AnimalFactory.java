package factory;

import java.lang.reflect.InvocationTargetException;

public class AnimalFactory {

    /** Better Performance **/
    public static Animal produceAnimal(Class<? extends  Animal> animalClass) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
      return animalClass.getDeclaredConstructor().newInstance();
    }

    /** Jvm would need to parse the string perform case-insensitive comparison
     * and execute the code.
     */
    public static Animal produceAnimalWithString(String type){
        if(type.equalsIgnoreCase("dog")){
            return new Dog();
        }else if (type.equalsIgnoreCase("cat")){
            return new Cat();
        }else{
            throw new IllegalArgumentException("Invalid animal type " + type);
        }
    }
}
