package youtube_lec_wise.lecture6;

public class MissingElementTest
{
    public static void main(String[] args)
    {
        int arr[] = {1,2,4,5,6,7};
        int n = 7;
        int total = n * (n+1) / 2; //  28
        int sum =0;

        for( int i: arr)
        {
            sum = sum + i;
        }

        System.out.println("Missing Element is: " + (total- sum) );

    }
}
