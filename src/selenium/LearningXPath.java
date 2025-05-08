package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningXPath {

    public static void main(String[] args) {

        // System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");
        System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www-archive.mozilla.org/projects/ui/accessibility/unix/testcase/html/");

        //Initializing the web elements via the By.xpath locator strategy
        WebElement emailInputField = driver.findElement(By.xpath("//input[@id='email']"));
        WebElement secondButton = driver.findElement(By.xpath("//input[@name='B2s']"));
        //Verifying that element was found (!null) and printing a message
        if (emailInputField != null && secondButton !=null)
            System.out.println("Elements found by xpath");
//Closing the browser
        driver.quit();



    }
}
