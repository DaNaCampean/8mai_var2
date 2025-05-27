package HW_02_Flights.pages;


import HW_02_Flights.base.BasePageDriverInitialization;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePageDriverInitialization {

   // WebDriver driver;
    // constructor

//  public HomePage(WebDriver driver){
//       this.driver = driver;
//    }

    // Selectors section

    // click on Flights tab - double click
   // WebElement flightsClick = driver.findElement(By.xpath("//div[@data-bdd = 'farefinder-option-flights' and @class = 'farefinder-option inactive']"));

    // var 2:
    By flightsTabXPath = By.xpath("//div[@data-bdd = 'farefinder-option-flights' and @class = 'farefinder-option inactive']");



    // Methods section
    public String getUrl(){
        return driver.getCurrentUrl();
    }


    public void selectFlights(){
        WebElement flightsClick = driver.findElement(flightsTabXPath);
        // Instantiate the Actions class needed for double click
        Actions actions = new Actions(driver);

        // Perform double-click
        actions.doubleClick(flightsClick).perform();
    }




}
