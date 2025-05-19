package HW_02_Flights.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BasePageDriverInitialization {

    public static WebDriver driver;




    public BasePageDriverInitialization(){
        if (driver == null) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.hotwire.com/");

    }}

    public static void chromeDriverPathMac(){
        System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");
    }

    public static void chromeDriverPathWindowsJob(){
        System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");
    }

    public static void chromeDriverPathWindowsHome(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\campe\\Downloads\\Automation\\chromedriver-win64\\chromedriver.exe");
    }

    public static void driverQuit(){
        driver.quit();
    }




}
