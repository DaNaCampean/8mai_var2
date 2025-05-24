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
        Assert.assertEquals(myURL, "https://www.hotwire.com/", "Verified that the correct page was shown");
        System.out.println("Passed - correct URL: " + myURL + "opens");

        // Verify that Flights Tab was selected
        home.selectFlights();


        String flightsTabText = flights.getText();
        Assert.assertEquals(flightsTabText, "Find a flight", "Verified that Flights tab was pressed ");
        System.out.println("Passed - correct Flights page opens");

        //Fly from: LAX

        flights.FillFlyFromTextField();


        // Fly To: Bucharest OTP
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