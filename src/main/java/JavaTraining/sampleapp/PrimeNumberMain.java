package JavaTraining.sampleapp;

/**
 * Created by aahad on 2/8/2018.
 */
public class PrimeNumberMain
{
    public static void main(String args[])
    {
        int p = 10;
        PrimeNumber obj = new PrimeNumber(p);
       int ret = obj.Prime();

       if(ret==0)
       {
           System.out.println("This is not Prime Number " + p);
       }
       else System.out.println("This is Prime Number " + p);

    }
}
