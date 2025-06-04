package HW_02_Flights.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Collections;


public class BasePageDriverInitialization {

    public static WebDriver driver;

    // constructor

    public BasePageDriverInitialization() {

        if (driver == null) {  // daca nu pun this null, the browser opens de 2 ori: odata for home page si o data for FLIGHTS PAGE din baseTest create objects

            System.out.println("INITIALIZATION ");
//            ChromeOptions options = new ChromeOptions();
//          //  options.addArguments("--disable-search-engine-choice-screen");
//          //  options.addArguments("--disable-application-cache");
//           // options.addArguments("--disable-extensions");
//           // options.addArguments("--disable-http2");
//
//            //use clean browser options:
//            options.addArguments("--no-sandbox");
//            options.addArguments("--disable-dev-shm-usage");
//            options.addArguments("--disable-gpu");
//            options.addArguments("--disable-features=NetworkService");
//            options.addArguments("--disable-features=VizDisplayCompositor");
//            options.addArguments("--disable-quic");
//            options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
//            options.setExperimentalOption("useAutomationExtension", false);
//            driver = new ChromeDriver(options);
//            driver.manage().window().maximize();
            driver = new FirefoxDriver();
            driver.get("https://hotwire.com");

        }

  }

    public static void setupMac(){
        System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");

    }

    public static void driverSetupWindows(){
        System.out.println("driver setup Windows");
       System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");
     //   System.setProperty("webdriver.chrome.driver", "C:\\Users\\campe\\Downloads\\Automation\\chromedriver-win64\\chromedriver.exe");
     // System.setProperty("webdriver.chrome.driver", "C:\\Users\\dcampean\\Desktop\\java-automation\\chromedriver-win64\\chromedriver.exe");

    }
    public static void driverQuit(){
        driver.quit();
    }


}




