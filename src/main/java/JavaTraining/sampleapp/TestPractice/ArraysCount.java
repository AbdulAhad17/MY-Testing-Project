package JavaTraining.sampleapp.TestPractice;

/**
 * Created by aahad on 3/18/2018.
 */
public class ArraysCount
{
    public static void main(String[] args) {
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        //for (int i : my_array)
        int length = my_array.length;
       // sum += i;
       // System.out.println("The sum is " + sum);
        System.out.println(length);
        for (int i : my_array)
            sum=sum+i;
        System.out.println(sum);



    }
}

