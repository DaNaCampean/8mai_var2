package HW_02_Flights.utility;

import HW_02_Flights.base.BasePageDriverInitialization;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Utility extends BasePageDriverInitialization {

    public static void implicitlyWaitThreeSeconds(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
}
