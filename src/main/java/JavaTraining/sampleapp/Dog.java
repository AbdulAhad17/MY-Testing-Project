package JavaTraining.sampleapp;

/**
 * Created by aahad on 2/13/2018.
 */

public class Dog extends Animal {

    public Dog() {
        System.out.println("Dog()");
    }

    @Override
    public void playSound() {
        System.out.println("Dog: bhaoooo");
    }
}