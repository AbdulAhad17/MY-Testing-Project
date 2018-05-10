package JavaTraining.sampleapp.TestPractice;

import java.util.HashMap;

/**
 * Created by aahad on 3/19/2018.
 */
public class Hashmap
{
    public static void main (String args[])
    {
        HashMap<Integer, String> hmap=new HashMap<Integer, String>();
        HashMap<Integer,String> hmap2=new HashMap<Integer, String>(  );
        hmap.put( 1,"One" );
        hmap.put( 2,"Two" );
        hmap.put( 3,"Three" );
        hmap.put( 4,"Four" );
        hmap2=(HashMap)hmap.clone();

        hmap2.put( 5,"Five" );
        System.out.println(hmap2);
        System.out.println(hmap);
        System.out.println(hmap.get( 3 ));

    }
}
