package Learning_POM.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import Learning_POM.pages.Dashboard;
import Learning_POM.pages.HomePage;
import Learning_POM.pages.LoginPage;

public class Login_TC1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");
        //   System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/books");

        //Creating object of home page
        HomePage home = new HomePage(driver);

        //Creating object of Login page
        LoginPage login = new LoginPage(driver);

        //Creating object of Dashboard
        Dashboard dashboard = new Dashboard(driver);

        //Click on Login button
        home.clickLogin();

        //Enter username & password
        login.enterUsername("danac");
        login.enterPassword("Test@123");

        //Click on login button
        login.clickLogin();
        Thread.sleep(3000);


        //Capture the page heading and print on console
       // System.out.println("The page heading is --- " +dashboard.getHeading());

        //Click on Logout button
        dashboard.clickLogout();

        //Close browser instance
        driver.quit();
    }

}