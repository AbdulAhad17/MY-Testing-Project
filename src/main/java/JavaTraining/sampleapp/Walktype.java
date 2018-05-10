package JavaTraining.sampleapp;

/**
 * Created by aahad on 2/15/2018.
 */
public enum Walktype
{
    NONE("None"),
    JUMP("Jump"),
    WALK("Walk");

    private String desc;

    private Walktype(String desc) {
        this.desc = desc;
    }

    public String getDescription() {
        return this.desc;
    }
}
