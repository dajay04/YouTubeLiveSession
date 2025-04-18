package youtube_lec_wise.lecture8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRunner
{
    public static void main(String[] args)
    {
        LoginTest obj = new LoginTest("Dahiya");
        String Name= obj.getData(); // Stored into varibake
        System.out.println(Name); // we r pritning that varobale
    }
}
