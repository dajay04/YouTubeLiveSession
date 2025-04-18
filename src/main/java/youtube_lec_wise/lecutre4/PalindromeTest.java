package youtube_lec_wise.lecutre4;

public class PalindromeTest
{
    public static void main(String[] args)
    {
        int no = 121;
        int temp = no; // temp = 1234

        int rev = 0; // at end of program , it holiding 4321 (121 == 121 -> True it is palindrome)
        int rem;

        while(temp!=0)
        {
            rem = temp%10; // 1
            rev = 10*rev + rem; // 4321
            temp = temp/10; // temp = 0
        }

        if(no == rev)
        {
            System.out.println("This no is Palindrome");
        }
        else
        {
            System.out.println("This no is not a Palindrome");
        }

    }
}
