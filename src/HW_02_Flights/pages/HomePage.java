package HW_02_Flights.pages;


import HW_02_Flights.base.BasePageDriverInitialization;
import HW_02_Flights.utils.Utils;
import jdk.jshell.execution.Util;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePageDriverInitialization {

   // WebDriver driver;
    // constructor

//  public HomePage(WebDriver driver){
//       this.driver = driver;
//    }

    // Selectors section


    // Methodes section
    public String getUrl(){
        return driver.getCurrentUrl();
    }

    public void waitForPageToBeLoaded(){
        Utils.implicitlyWaitThreeSeconds();
    }



}
