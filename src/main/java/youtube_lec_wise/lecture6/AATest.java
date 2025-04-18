package youtube_lec_wise.lecture6;

public class AATest
{
    public static void main(String[] args)
    {
        int arr[]= {10,25,30,45,50};
        int key = 60;
        boolean found = false; // Negation -> Approach

        // Retirval of arrya
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("Element found at index no: "+ (i+1));
                found = true;
                break;
            }
        }
        if(found==false)
        {
            System.out.println("Element not found");
        }

    }


}

