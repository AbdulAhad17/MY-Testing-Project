package JavaTraining.sampleapp;

/**
 * Created by aahad on 2/27/2018.
 */
public class StringReverse2 {

    public static void main(String args[]) {
        //System.out.println(reversestring("NISUM"));
        System.out.println(  );
       String result =  reversestring( "NISUM" );
        System.out.println(result);

    }

    public static String reversestring(String s) {

            //String s = "NISUM";

            //convert String to character array
            // by using toCharArray
            char[] try1 = s.toCharArray();

            for (int i = try1.length - 1; i >= 0; i--) {
                 //try1.toString();
                 //System.out.print(try1[i]);

                  //System.out.println(String);


            }

            //return new String( s );

        s=String.valueOf( try1 );
        return s;



    }


}

//  public static void reversestring(String reverse)
// Class of ReverseString
//  {
//     {
//        String input = "NISUM";

//convert String to character array
// by using toCharArray
//         char[] try1 = input.toCharArray();

//       for (int i = try1.length-1; i>=0; i--)
//          System.out.print(try1[i]);

// return new String(try1);
//   }
//  }
// }