package JavaTraining.sampleapp;

/**
 * Created by aahad on 2/14/2018.
 */
public class SingleTonClass {

    private static SingleTonClass obj = null;

    public static SingleTonClass getInstance() {
        if (obj == null) {
            obj = new SingleTonClass();
            return obj;
        }
        return obj;

    }



    private SingleTonClass()
        {


        }






    public void sayHello() {
        System.out.println( "Hello, World from!" );

    }
}
