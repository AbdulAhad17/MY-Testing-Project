package JavaTraining.sampleapp.Test3;

/**
 * Created by aahad on 3/5/2018.
 */
public class Stack
{
    private int[] array = new int[10];
    private int x=0;

    public  Stack()
    {
    }

    void push(int value)
    {
        array[x] = value;
        x++;

    }

    int pop()
    {

        //int abc = 0;
        //array = a[x];
        x--;

        int t;
        t = array[x];

        return t;

    }

}
