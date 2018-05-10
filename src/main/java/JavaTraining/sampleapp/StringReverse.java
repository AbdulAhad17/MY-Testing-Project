package JavaTraining.sampleapp;

/**
 * Created by aahad on 2/26/2018.
 */
public class StringReverse {

    //StringBuilder sb = new StringBuilder();
    public static void main(String args[])
    {
        System.out.println(reverse2("AliWaqas"));


        //System.out.println(str3( "NISUM");
       // str3( "NISUM" );


    }/*

    *//*public static  String reverse(String str) {
        str ="ahad";
        String str2 = new String ();
        for (int i = str.length() - 1; i>=0; i--){
            char ch = str.charAt( i );
            str2 = str2 + ch;
        }

        return str2;
    }*//*


    public static void str3(String str3) {
        str3 = "NISUM";

        //str3.codePointCount( 0,4 );

      //  System.out.println(str3.);
        //char ch1;
        //char ch2;
        //int j = 0;
        //for (int i = str3.length() - 1; i >= 0; i--) {
          //  System.out.println( "Str value bla " + str3.indexOf( 0 ) );
            ;

           // ch1 = str3.charAt( i );
            //ch2 = str3.charAt( j );

          *//*  char temp=ch1;
            str3.charAt( i )=str3.charAt( j );
                    ch2;*//*
//        }

            // str3.codePointCount( 0,4 );


            //return str3;
            //   }


            //String str2 = new String();




        }*/

        public static String reverse2(String str)
        {
            char[] abc = str.toCharArray();
           // int a,b;

            for (int a=abc.length-1,b=0;(a-b)>=0;a--,b++)
            {
                char c = abc[b];
                abc[b]=abc[a];
                abc[a] =c;
            }
        return new String( abc );
        }}



    // Class of ReverseString
    //{
     ///   {
      //      String input = "GeeksForGeeks";

            // convert String to character array
            // by using toCharArray
    //        char[] try1 = input.toCharArray();

     //       for (int i = try1.length-1; i>=0; i--)
     //           System.out.print(try1[i]);

      //      return new String(try1);
    //    }
  //  }
//    }//