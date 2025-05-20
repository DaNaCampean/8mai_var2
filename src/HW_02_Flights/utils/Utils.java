package HW_02_Flights.utils;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static HW_02_Flights.base.BasePageDriverInitialization.driver;

public class Utils {
//in utils, ar merge: waituri...mai bine de folosit esre wait for element to be displayed decat implicit waut cu secunde
    // take screenshots

    public static void implicitlyWaitThreeSeconds(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    public static void returnCurrentDate(){

    }


}

