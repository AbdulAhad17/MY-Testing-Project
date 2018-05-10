package JavaTraining.sampleapp;

/**
 * Created by aahad on 2/15/2018.
 */
public class Kangaroo extends Animal {

    public Kangaroo() {
        super(2, Walktype.JUMP);
        System.out.println("Kangaroo()");
    }

    @Override
    public void playSound() {
        System.out.println("blah...");
    }

}
