package JavaTraining.sampleapp;

/**
 * Created by aahad on 2/7/2018.
 */
public abstract class Animal {

    private Walktype walkType = Walktype.NONE;
    private int legsToWalk;

    public Animal() {
        System.out.println("Animal()");
        this.legsToWalk = 4;
        this.walkType = Walktype.WALK;
    }

    public Animal(int legsToWalk, Walktype walkType) {
        System.out.println("Animal(int, boolean)");
        this.legsToWalk = legsToWalk;
        this.walkType = walkType;
    }

    public void walk() {
        System.out.println("Animal: " + walkType.getDescription() + " on " + legsToWalk + " legs");
    }

    public abstract void playSound();
}
