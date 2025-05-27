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



import HW_02_Flights.utils.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;


public class FindAFlightTest extends BaseTest {

    @Test
    public  void flightsTest(){

        // Verify that correct URL, hot wire.com opens.
        String myURL = home.getUrl();
       // System.out.println("URL = " + myURL);
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


        LocalDate departingDate = Utils.returnCurrentDate().plusDays(7);
        LocalDate returningDate = Utils.returnCurrentDate().plusDays(14);

        //String dana = flights.datesChoosing();

        List<String> actualList = flights.datesChoosing();




        //DANA = 06/03/2025
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String departingDateString = departingDate.format(formatter);
        String returningDateString = returningDate.format(formatter);

        List<String> expectedList = Arrays.asList(departingDateString,returningDateString);





        Assert.assertEquals(actualList,expectedList , "Verified that startDate and endDate are correctly SET");
        System.out.println("Passed - Departing Date and Returning Dates are correctly selected");

        Utils.implicitlyWaitThreeSeconds();

        // 2 adults
        //flights.passengersSelection();


        Assert.assertEquals(flights.passengersSelection(), "2 Adults, 0 Children", "Verified that two Adults are correctly SET");
        System.out.println("Passed - 2 Adults are correctly selected");

        Utils.implicitlyWaitThreeSeconds();

        // search flights

        flights.findAFlight();
      // String finishText = flights.findAFlight();
        Utils.implicitlyWaitThreeSeconds();



      // Assert.assertEquals(finishText, "Choose departing flight", "Verify ca a mers Search Flights - loading page"); // only if is not ok , is shown this message



    }


}