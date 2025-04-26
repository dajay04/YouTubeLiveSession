import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.*;

public class ArrayListExample
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("openwindow")).click();

       Set<String> windowSet= driver.getWindowHandles();

        System.out.println("Prinitng out windonw handle set data"+ windowSet);
       // Itwrate using for each loop
        for (String handle: windowSet)
        {
            driver.switchTo().window(handle);
            System.out.println(driver.getTitle());
        }

    }
}
