package youtube_lec_wise.lecutre4;

public class FibonacciTest
{
    static int a =0 ;
    static  int b = 1 ;
    static int c;
    public static void main(String[] args)
    {
        System.out.println( a + " "+ b);
        pritnFib(6);
    }

   static void pritnFib(int i)
    {
        if(i>=1)
        {
            c= a+ b;
            System.out.println(c);
            a = b;
            b= c;
            pritnFib(i-1);
        }
    }
}
