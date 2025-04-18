package youtube_lec_wise.lecture9;

import java.io.IOException;

public class DemoException
{
    public static void main(String[] args)
    {
        try
        {
            int a = 10 / 0; // Code which occur an exception
        }
        catch (ArithmeticException e)
        {
            throw new RuntimeException();
        }
        finally
        {
            System.out.println("Finally Code is here");
        }
        System.out.println("Line After Exception");
    }
}
