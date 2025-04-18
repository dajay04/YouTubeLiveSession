package youtube_lec_wise.lecutre4;

public class FactTest
{
    public static void main(String[] args)
    {
     int no = 5; int fact = 1;

     for(int i = 1;i<=no; i++)
     {
         fact = fact *i; // fact = 24 *5 = 120
     }

        System.out.println("Factorial of a number:"+ no +" = " + fact);
    }
}
