package JavaTraining.sampleapp;

/**
 * Created by aahad on 3/1/2018.
 */
public class counteveryletter {


    public void counteveryletter(String s) {
        char[] chars = s.toCharArray();
        // s = "aaabbaccd";
        char temp = 0;
        temp = s.charAt( 0 );
        int count = 0;
        String str2 = new String();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt( i ) == temp) {
                count++;
                System.out.println( count );

                //System.out.println(count = temp++);

                //  System.out.println(count);

                // System.out.println(i);

            }

            // System.out.println(str2);


        }

        // return str2;
    }


    public static void CountLetterUsingAscii(String str) {
        //char[] character = str.toCharArray();

        int[] alphabet = new int[26];

        char ch, ch2;
        int ascii = 'a';
        int index;


        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = 0;

        }
        for (int j = 0; j < str.length(); j++) {

            ch = str.charAt( j );

            index = ch - ascii;

            alphabet[index]++;
        }

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] != 0) {
                ch2 = (char) (i + ascii);

                System.out.println( String.valueOf( ch2 ) + alphabet[i] );

            }


        }
    }

    String temp1 = "()";
}