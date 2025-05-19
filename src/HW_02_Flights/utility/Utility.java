package HW_02_Flights.utility;

import HW_02_Flights.base.BasePageDriverInitialization;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class Utility {

    WebDriver driver;
    public Utility(WebDriver driver){
        this.driver = driver;
    }

    public  void implicitlyWaitThreeSeconds(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }


}

