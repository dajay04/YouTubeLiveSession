package youtube_lec_wise.lecutre4;

import java.util.logging.SocketHandler;

public class PrimeTest
{
    public static void main(String[] args)
    {
        int no=9; int temp =0;

        for(int i=2;i<=no-1;i++)
        {
            if(no%i==0) // 7 % 3 : 0
            {
                temp++; // temp =1
            }
        }
        if(temp>0)
        {
            System.out.println("Number provided is Not a Prime");
        }
        else // tepmp = 0
        {
            System.out.println("Number provided is a Prime");
        }

    }
}
