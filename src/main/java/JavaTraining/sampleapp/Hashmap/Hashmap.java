package JavaTraining.sampleapp.Hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aahad on 3/14/2018.
 */
public class Hashmap
{
        public static void main(String args[]){
            HashMap<Integer,String> hm=new HashMap<Integer,String>();
            hm.put(100,"a");
            hm.put(101,"b");
            hm.put(100,"a");
            for(Map.Entry m:hm.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
            }
         //  String S =  hm.get( 101 );

           // System.out.println(S);


        }
    }

