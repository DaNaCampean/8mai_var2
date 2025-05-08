package HW_01_emag_var1.BrowserSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeSetup {

   public WebDriver driverSetupMac(){
       System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");

       ChromeOptions options = new ChromeOptions();
       options.addArguments("--disable-search-engine-choice-screen");

       WebDriver driver = new ChromeDriver(options);
       chromeMaximize(driver);
       return driver;
    }

    public WebDriver driverSetupWindows(){
        System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

        public void chromeMaximize(WebDriver driverChrome) {
        driverChrome.manage().window().maximize();
    }




}
