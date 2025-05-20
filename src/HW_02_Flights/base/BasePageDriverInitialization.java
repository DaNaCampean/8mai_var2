package HW_02_Flights.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BasePageDriverInitialization {

    public static WebDriver driver;
    // constructor

    public BasePageDriverInitialization() {
            System.out.println("INITIALIZATION ");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-search-engine-choice-screen");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
           driver.get("https://hotwire.com");

  }

    public static void setupMac(){
        System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");

    }

    public static void driverSetupWindows(){
        System.out.println("driversetupWindows");
        System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");
//        System.out.println("INITIALIZATION ");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-search-engine-choice-screen");
//        driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
//        driver.get("https://hotwire.com");

    }
    public static void driverQuit(){
        driver.quit();;
    }

}




