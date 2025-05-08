package selenium.LearningPOM_udemy.basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;

public class Page {

    /*
    HomePage is a Page
    LoginPage is a Page
    ZohoAppPage is a Page
     */

    public  static WebDriver driver;
    public static TopMenu menu ;

    //daca le facem static, driverul se creeaza odata doar. daca vreti la fioecare test
    //alt browser, NU se face static.
    //daca nu e static, se porneste de 3 ori chromeul

    public Page(){

        if (driver==null){    //daca acest if nu e aici, se vor creea 3 browsere. Daca static nu e pus sus, acest if va fi true tot timpul.

             System.out.println("DRIVER NULL IFFFF");
           System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");
          // System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");

            Map<String, Object> prefs = new HashMap<String, Object>();
            prefs.put("profile.default_content_setting_values.notifications", 2);
            prefs.put("credentials_enable_service", false);
            prefs.put("profile.password_manager_enabled", false);

            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("prefs", prefs);
            options.addArguments("--disable-extensions");
            options.addArguments("--disable-infobars");

            options.addArguments("--disable-search-engine-choice-screen");

        //    WebDriver driver = new ChromeDriver(options);

            driver = new ChromeDriver(options);
            driver.get("http://zoho.com");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            menu = new TopMenu(driver);

        }

    }

    public static void quit() {
        driver.quit();
    }
}
