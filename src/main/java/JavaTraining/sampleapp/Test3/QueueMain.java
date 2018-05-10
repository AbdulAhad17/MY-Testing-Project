package JavaTraining.sampleapp.Test3;

/**
 * Created by aahad on 3/6/2018.
 */
public class QueueMain
{
    public static void main(String args[]) {
        Queue queue=new Queue();

        queue.push( 2 );
        queue.push( 3 );
        queue.push( 5 );
        queue.push( 9 );
        queue.push( 4 );

        System.out.println(queue.pop());

       System.out.println(queue.pop());

        System.out.println(queue.pop());

        queue.push( 15 );
        queue.push( 40 );


        System.out.println(queue.pop());

        System.out.println(queue.pop());

       // System.out.println(queue.pop());

    }
}
