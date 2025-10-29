package youtube_lec_wise.lectur3;

public class Program3Test
{
    public static void main(String[] args)
    {
        int year =2002;

        if((year % 400 ==0)      ||   (year % 4 ==0 && year %100 !=0 )      )
        {
            System.out.println("Provided Year is Leap Year");
        }
        else
        {
            System.out.println("Provided Year is Not a Leap Year");
        }

    }
}
