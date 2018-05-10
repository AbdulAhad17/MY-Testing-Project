package JavaTraining.sampleapp;

/**
 * Created by aahad on 2/19/2018.
 */
public class Singletonmain {

    public static void main(String args[]) {
        SingleTonClass obj1 = SingleTonClass.getInstance();
        obj1.sayHello();

       // SingleTonClass obj2 = new SingleTonClass.getInstance();

       // SingleTonClass obj2 = SingleTonClass.getInstance();
       // obj2.sayHello();

    }
}
