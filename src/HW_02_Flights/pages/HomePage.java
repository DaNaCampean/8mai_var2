package HW_02_Flights.pages;

import HW_02_Flights.base.BasePageDriverInitialization;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePageDriverInitialization {

    // Selectors section

    //click on Flights tab - double click
    By flightsClickXPath = By.xpath("//div[@data-bdd = 'farefinder-option-flights' and @class = 'farefinder-option inactive']");


    // Instantiate the Actions class needed for double click
   static Actions actions = new Actions(driver);

    // Methodes section

    public void flightsTab (){
        WebElement flightsClick = driver.findElement(flightsClickXPath);
        // Perform double-click
        actions.doubleClick(flightsClick).perform();
    }










}
