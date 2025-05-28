package HW_02_Flights_no_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.hotwire.com/");

    }
}
