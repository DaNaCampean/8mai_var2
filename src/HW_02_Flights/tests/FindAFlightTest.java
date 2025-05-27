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



import org.testng.Assert;
import org.testng.annotations.Test;


public class FindAFlightTest extends BaseTest {

    @Test
    public  void flightsTest(){

        // Verify that correct URL, hot wire.com opens.
        String myURL = home.getUrl();
        System.out.println("URL = " + myURL);
        Assert.assertEquals(myURL, "https://www.hotwire.com/", "Verified that the correct page was shown, by URL");
        System.out.println("Passed - correct URL: " + myURL + "opens");

        // Verify that Flights Tab was selected
        home.selectFlights();
        String flightsTabText = flights.getTextSearchButton();
        Assert.assertEquals(flightsTabText, "Find a flight", "Verified that Flights tab was pressed, by checking Find a flight TEXT from search button  ");
        System.out.println("Passed - correct Flights Tab page opens");

        //Fly from: LAX

        //flights.FillFlyFromTextField();
        Assert.assertEquals(flights.FillFlyFromTextField(), "Los Angeles, CA, United States of America (LAX-Los Angeles Intl.)", "Verified that LAX was correctly selected, by getAttribute(value) ");
        System.out.println("Passed - LAX is correctly selected");


        // Fly To: Bucharest OTP
        Assert.assertEquals(flights.FillFlyToTextField(), "Bucharest, Romania (OTP-Henri Coanda Intl.)", "Verified that OTP was correctly selected, by getAttribute(value) ");
        System.out.println("Passed - OTP is correctly selected");

        // From date - 7 days from today

        // To date - 14 days from today

        // 2 adults

        // search flights


        //home.waitForPageToBeLoaded();
        flights.getCurrentDate();
        flights.ToBeRefactor();
//test



    }


}