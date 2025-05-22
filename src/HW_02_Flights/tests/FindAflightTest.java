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
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class FindAflightTest extends BaseTest {

    @Test
    public  void flightsTest(){

        // Verify that correct URL, hotwire.com opens.
        String myURL = home.getUrl();
        System.out.println("URL = " + myURL);
        Assert.assertEquals(myURL, "https://www.hotwire.com/", "Verific ca s-a accesat pagina corecta");
        System.out.println("Passed - correct URL: " + myURL + "opens");

        // Verify that "Flights Tab was selected
        home.selectFlights();


        String flightsTabText = flights.getText();
        Assert.assertEquals(flightsTabText, "Find a flight", "Verific ca s-a apasat Tabul de Flights");
        System.out.println("Passed - correct Flights page opens");

        //Fly from: LAX

        flights.FillFlyFromTextField();


        // Fly To: Bucharest Otopeni
        flights.FillFlyToTextField();

        // From date - 7 days from today

        // To date - 14 days from today

        // 2 adults

        // search flights


        home.waitForPageToBeLoaded();
        flights.getCurrentDate();
        flights.ToBeRefactor();




    }


}