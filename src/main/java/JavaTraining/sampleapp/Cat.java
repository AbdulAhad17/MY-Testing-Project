package JavaTraining.sampleapp;

/**
 * Created by aahad on 2/13/2018.
 */
public class Cat extends Animal {

    public Cat() {
        System.out.println("Cat()");
    }

    @Override
    public void playSound() {
        System.out.println("Cat: Mewhhh");
    }
}
