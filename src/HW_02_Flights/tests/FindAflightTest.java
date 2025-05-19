package HW_02_Flights.tests;

/*

1. https://www.hotwire.com/
2. Flights
3. From LAX
4. To Bucharest Otopeni
5. From date - 7 days from today
6. To date - 14 days from today
7. 2 adults

 */


import HW_02_Flights.base.BasePageDriverInitialization;
import HW_02_Flights.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.time.Duration;

public class FindAflightTest {


    public static void main(String[] args) throws InterruptedException {



        WebDriver driver;

        //Creating object of home page
        HomePage home = new HomePage();
        home.setup();


        driver.get("https://www.hotwire.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));



        // Verify current URL
        String myURL = home.getUrl();
        System.out.println("URL = " + myURL);
        Assert.assertEquals(myURL, "https://www.hotwire.com/", "Verific ca s-a accesat pagina corecta");
        System.out.println("Passed - correct URL: " + myURL);




    }


}