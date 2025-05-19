package HW_02_Flights.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BasePageDriverInitialization {

     WebDriver driver;
    // constructor

    public BasePageDriverInitialization(){
        this.driver = driver;
    }
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-search-engine-choice-screen");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    public void driverQuit(){
        driver.quit();;
    }

}
