package youtube_lec_wise.lecture9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SeleniumCheckHandling
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");

        By loginButton = By.id("login");
        SeleniumCheckHandling obj = new SeleniumCheckHandling();
        obj.clickElement(loginButton,driver);

    }

    public void clickElement( By locator, WebDriver driver) {
        try {
            driver.findElement(locator).click();
        }
        catch (Exception e)
        {
            System.out.println("Element is Clicking Passed TT");
            takeScreenShot(driver,"Albreta");
        }
        finally {
            driver.quit();
        }
    }

    public void takeScreenShot( WebDriver driver, String fileName)
    {
        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Files.copy(src.toPath(), Paths.get(fileName + ".png"));
        }
        catch ( Exception e)
        {
            System.out.println("Screen Shot Captured Failed");
        }
    }
}
