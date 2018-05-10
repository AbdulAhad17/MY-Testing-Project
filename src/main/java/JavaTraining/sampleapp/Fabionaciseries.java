package JavaTraining.sampleapp;

/**
 * Created by aahad on 2/9/2018.
 */
public class Fabionaciseries
{
    public static void main(String args[])

    {
        int n1=1;
        int n2=1;
        int number=10;
        int i;
        int answer;
        int h;

        System.out.print(n1 + " , " + n2);
        for(i=2;i<number;i++)
        {
             //answer=(ln1-1)+(n2-1);
            answer = n1 + n2;
            n1=n2;
           n2=answer;

            System.out.print(" , " + answer);
        }





    }


}