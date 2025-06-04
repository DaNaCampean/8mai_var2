import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {

        WebDriver driver;

        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();



        driver.manage().getCookies(); // Returns the List of all Cookies
        driver.get("https://www.hotwire.com");

         driver.manage().deleteAllCookies(); // Deletes all the cookies
        driver.get("https://www.hotwire.com");

    }
}
