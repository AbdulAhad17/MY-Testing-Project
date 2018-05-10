package JavaTraining.sampleapp.Test3;

/**
 * Created by aahad on 3/6/2018.
 */
public class Queue
{
        private int[] array = new int[5];
        private int x=0;
        int z=0;

        public Queue()
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
            --x;


            int t;
            t = array[z];

            z++;

            return t;

        }

    }

