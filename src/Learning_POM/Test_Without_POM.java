package Learning_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_Without_POM {

        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");
            //   System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");


            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-search-engine-choice-screen");

            //Instantiating chrome driver
            WebDriver driver = new ChromeDriver(options);

            //Opening web application
            driver.get("https://demoqa.com/books");

            //Locating the Login button and clicking on it
            driver.findElement(By.id("login")).click();

            //Locating the username & password and passing the credentials
            driver.findElement(By.id("userName")).sendKeys("gunjankaushik");
            driver.findElement(By.id("password")).sendKeys("Password@123");

            //Click on the login button
            driver.findElement(By.id("login")).click();

            //Click on Logout button
            driver.findElement(By.id("submit")).click();

            //Close driver instance
            driver.quit();
        }

    }

