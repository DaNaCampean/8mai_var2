package HW_01_emag_var2.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BasePage_driver_browser_init {

    public static WebDriver driver;

    public BasePage_driver_browser_init() {

        if (driver == null) {
            //  System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");
            //  System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-search-engine-choice-screen");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.get("https://emag.ro");
        }
    }
    public static void driverSetupWindows(){
        System.out.println("driversetupWindows");
        System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");
    }

    public static void driverSetupMac(){
        System.out.println("driversetupMac");
        System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");

    }

    public static void waitResults() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }


    public static void browserQuit() {
        driver.quit();
    }


}