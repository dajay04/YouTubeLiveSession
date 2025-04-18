package youtube_lec_wise.lecutre4;

public class RevsreStringTest
{
    public static void main(String[] args)
    {
        String name = "aja";
        String rev = "";
        int length =  name.length();

        for(int i=length-1;i>=0;i--)
        {
            rev = rev + name.charAt(i); // rev = yaja
        }
       if (name.equals(rev))
       {
           System.out.println("String is Palindrome");
       }
       else
       {
           System.out.println("String is Not a  Palindrome");
       }
    }
}
