package JavaTraining.sampleapp;

/**
 * Created by aahad on 2/8/2018.
 */
public class perfectnumber 
{
    public static void main(String args[])
    {
        Integer no = 7;
       boolean isPerfectNum =  isPerfect(no);

       if(isPerfectNum){
           System.out.println( "This is Perfect Number" );
       } else
       {
           System.out.println( "This is NOT a Perfect Number" );
       }




    }

    public static boolean isPerfect(Integer no){

        boolean flag = false;
        //int number=6;
        int i;
        int sum=0;
        int temp=0;
        for(i=1;i<no;i++) {
            if (no % i == 0) {
                sum = sum+ i;
                //temp = sum + temp;

                if (sum == no) {

                    flag = true;
                } else {

                    flag = false;

            }


            }


        }

        return flag;
    }
}
