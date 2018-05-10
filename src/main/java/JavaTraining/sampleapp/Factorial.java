package JavaTraining.sampleapp;

/**
 * Created by aahad on 2/7/2018.
 */
public class Factorial
{
    private int no;

    public Factorial(int num) {
        this.no = num;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int findFactorial(){
    int r = no;
        for (int a=1;a<no;a++)
    {
        r*=a;
    }
    return r;
}

}
