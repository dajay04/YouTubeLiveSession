package youtube_lec_wise.lecture6;

public class MaxandMinTest
{
    public static void main(String[] args)
    {
        int arr[]= {10,25,30,8,70};
        int max = arr[0]; // max and min as 10
        int min = arr[0];
        int SecondMax = Integer.MIN_VALUE;
        int SecondMin = Integer.MAX_VALUE;
        // Find Max and Min in array
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>max) // 25 > 10
            {
                    max = arr[i];
            }
            if(arr[i]<min) // 8 < 10
            {
                min = arr[i];
            }
        }

        // Find Max and Min in array
        for (int i=0;i<arr.length;i++)
        {
            if( (arr[i] > SecondMax) && (arr[i]<max))
            {
                SecondMax = arr[i];
            }
            if( (arr[i] < SecondMin) && (arr[i]>min))
            {
                SecondMin = arr[i];
            }

        }


        System.out.println("Maximum Element in Array :" + max);
        System.out.println("2nd Maximum Element in Array :" + SecondMax);
        System.out.println("2nd Minimum Element in Array :" + SecondMin);
        System.out.println("Minimum Element in Array :" + min);
    }
}
