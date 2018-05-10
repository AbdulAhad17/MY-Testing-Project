package JavaTraining.sampleapp;

/**
 * Created by aahad on 2/8/2018.
 */
public class FactorialAndPrimeNumberMain
{
    public static void main(String args[])
    {

        FactorialAndPrimeNumber fap = new FactorialAndPrimeNumber(7,6  );
        int y=fap.findFactorial();
        System.out.println(y);
        int x = fap.Prime();
        
        if (x==1)
        {
            System.out.println("This is Prime Number");
        }
        else System.out.println("This is not Prime Number");

    }


}
