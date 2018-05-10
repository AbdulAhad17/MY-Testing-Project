package JavaTraining.sampleapp;

/**
 * Created by aahad on 2/15/2018.
 */
public class MainAnimal
{
    public static void main(String[] args) {
        Animal cat = new Cat();
        callFunctions(cat);

        Animal dog = new Dog();
        callFunctions(dog);

        Animal kangaroo = new Kangaroo();
        callFunctions(kangaroo);
    }

    public static void callFunctions(Animal obj) {
        obj.walk();
        obj.playSound();
    }

}
