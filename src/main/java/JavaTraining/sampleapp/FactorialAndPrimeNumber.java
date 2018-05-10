package JavaTraining.sampleapp;

/**
 * Created by aahad on 2/8/2018.
 */
public class FactorialAndPrimeNumber
{
    private int b;
    private int c;

    public FactorialAndPrimeNumber(int b,int c)
    {
        this.b=b;
        this.c=c;

    }

    public void setNo(int no1,int no2) {
        this.b = no1;
        this.c = no2;
    }

    public int findFactorial(){
        int r = b;
        for (int a=1;a<b;a++)
        {
            r*=a;
        }
        return r;
    }

    public int Prime(){


        int number=c;
        //int f;
        int i;
        //int j;

        for (i=2;i<number;i++)
        {
            if (number%i==0)
            {
                return 0;
            }

        }
        return 1;
    }

}



