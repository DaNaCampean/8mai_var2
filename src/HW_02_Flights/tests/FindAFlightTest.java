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

//        WebElement assertFinal = driver.findElement(By.xpath("//span[contains(text(),'Choose departing flight')]"));
//        String textAsser = assertFinal.getText();
//        System.out.println("getTEXT = "+ textAsser);
//       assertEquals(textAsser, "Choose departing flight", "Verify ca a mers Search Flights - loading page"); // only if is not ok , is shown this message

        //  FirefoxDriver newBrowser = new FirefoxDriver();
        //  newBrowser.get(myUrl);
        //  System.out.println("URL = " + myUrl);


        // WebElement assertFinal = driver.findElement(By.xpath("//span[contains(text(),'Choose departing flight')]"));
        // String textAsser = assertFinal.getText();
        // System.out.println("getTEXT = "+ textAsser);
        //  assertEquals(textAsser, "Choose departing flight", "Verify ca a mers Search Flights - loading page"); //only if is not ok , is shown this message


//        assert first - Los Angeles to Bucharest
//
//        System.out.println("LosAngelesToOTP = ");
//       WebElement finalAssert = driver.findElement(By.xpath("//h2[@class='uitk-heading uitk-heading-5']"));
//
//      String textAsser = finalAssert.getText();
//       System.out.println("getTEXT = "+ textAsser);
//       assertEquals(textAsser, "Los Angeles to Bucharest", "Verify ca a mers Search Flights - loading page"); // only if is not ok , is shown this message
//
//<span class="">Choose departing flight</span>
//       Asser second - Recommended
//
//        System.out.println("Final  = ");
//        WebElement finalAssert1 = driver.findElement(By.xpath("//h5[@class='uitk-heading uitk-heading-5']"));
//
//        String textAsser1 = finalAssert1.getText();
//        System.out.println("getTEXT = "+ textAsser1);
//        assertEquals(textAsser1, "Recommended departing flights", "Verify ca a mers Search Flights"); // only if is not ok , is shown this message

    }


}