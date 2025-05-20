package HW_02_Flights.pages;

import HW_02_Flights.base.BasePageDriverInitialization;
import HW_02_Flights.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FlightsPage extends BasePageDriverInitialization {

    // Selectors section

    By findAFlightTextXPath = By.xpath("//span[text()='Find a flight']"); //"Find a Flight" text from the button
    By searchFlyTextField = By.xpath("//input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis']"); // Fly from textField




    // Methodes section

    public void getCurrentDate(){
        Utils.returnCurrentDate();
    }

    public String getText(){
        WebElement buttonText = driver.findElement(findAFlightTextXPath);
        return buttonText.getText();

    }

    public void clickOnFlyTextField(String text){
        WebElement searchTextField = driver.findElement(searchFlyTextField);
        searchTextField.sendKeys(text);
    }



}
