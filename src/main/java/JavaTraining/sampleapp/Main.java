package JavaTraining.sampleapp;

//import static JavaTraining.sampleapp.Factorial.findFactorial;

/**
 * Created by aahad on 2/6/2018.
 */
public class Main {
    public static void main(String args[]) {
        int no = 6;
        Factorial fac = new Factorial(no);
        long answer = fac.findFactorial();
        System.out.println( "Factorial of " + no + " is: " + answer );

        no =4;
        fac.setNo( no );
        answer = fac.findFactorial();
        System.out.println( "Factorial of " + no + " is: " + answer );

    }
}

