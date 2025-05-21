package HW_02_Flights.utils;

import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static HW_02_Flights.base.BasePageDriverInitialization.driver;

public class Utils {
//in utils, ar merge: waituri...mai bine de folosit esre wait for element to be displayed decat implicit waut cu secunde
    // take screenshots

    public static void implicitlyWaitThreeSeconds(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public static void returnCurrentDate(){
        // Set the current date
        LocalDate currentDate = LocalDate.of(2025, 5, 5); // May 5, 2025
        System.out.println("set the current date = " + currentDate);
        currentDate = LocalDate.now();
        System.out.println("local = " + currentDate);


        // Format the date if needed
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String startDateString = currentDate.format(formatter);

        System.out.println("STARTTT Date = " + startDateString);

    }


}

