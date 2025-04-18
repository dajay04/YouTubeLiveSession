package youtube_lec_wise.lecture8;

import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class WaitUtilityClass
{
        public static void implicitWaitTest(WebDriver driver, int seconds)
        {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
        }
}
