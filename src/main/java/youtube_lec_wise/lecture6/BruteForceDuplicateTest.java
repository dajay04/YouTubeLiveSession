package youtube_lec_wise.lecture6;

public class BruteForceDuplicateTest
{
    public static void main(String[] args)
    {
        int arr[] = { 4, 5, 6, 6, 4, 8, 4 };
        // i = 0 -> 4
        // j = 1 -> 5

        System.out.println("Duplicate Element:");
        for (int i =0 ; i<arr.length ; i++)
        {
            for (int j = i+1; j< arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }

    }
}
