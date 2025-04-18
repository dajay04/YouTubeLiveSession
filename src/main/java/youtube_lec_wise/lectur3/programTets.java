package youtube_lec_wise.lectur3;

import java.util.Scanner;

public class programTets
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 2 number which you want to provide for calcluation");
        int num1, num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        char ch;
        System.out.println("Enter (*/+/-/ /) operation that uou wanted on those numebrs");
        ch = sc.next().charAt(0);

        switch (ch)
        {
            case '+':
                System.out.println("Result is : "+ num1 + num2);
            break;
            case '-':
                System.out.println("Result is : "+ (num1 - num2));
                break;
            case '*':
                System.out.println("Result is : "+ num1 * num2);
                break;
            case '/':
                System.out.println("Result is : "+ num1/num2);
                break;
            default:
                System.out.println("Please provide correct symbols");
                break;
        }


    }
}
