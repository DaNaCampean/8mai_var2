package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.hotwire.com/";
        driver.get(url);
        driver.manage().window().maximize();
        //WebElement selectFlights = driver.findElement(By.xpath("//div[@data-bdd = 'farefinder-option-flights']"));
     // WebElement selectFlights = driver.findElement(By.xpath("//a[@href = 'https://www.hotwire.com/flights/']"));
        WebElement selectFlights = driver.findElement(By.xpath("//div[@data-bdd='farefinder-option-flights']"));
        selectFlights.submit();


        //div[@data-bdd='farefinder-option-flights']
    }
}
