package JavaTraining.sampleapp;

/**
 * Created by aahad on 2/8/2018.
 */
public class PrimeNumber
{
    private int num;

    public PrimeNumber(int num)
                {
                    this.num = num;
                  }


    public int Prime(){


        int number=num;
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
