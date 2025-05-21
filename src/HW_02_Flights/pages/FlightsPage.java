package HW_02_Flights.pages;

import HW_02_Flights.base.BasePageDriverInitialization;
import HW_02_Flights.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FlightsPage extends BasePageDriverInitialization {

    // Selectors section

    By findAFlightTextXPath = By.xpath("//span[text()='Find a flight']"); //"Find a Flight" text from the button
    By searchFlyFromTextField = By.xpath("//div[@class='col-xs-12 margin-top-6']/div[@class='location-typeahead']/div[contains(@class, 'hw-form-group form-group floating-label')]/input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis']"); // Fly from textField
    By searchFlyToTextField = By.xpath("//div[@class='col-xs-12 margin-top-4']/div[@class='location-typeahead']/div[contains(@class, 'hw-form-group form-group floating-label')]/input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis']");


    //a[contains(@aria-label, ‘logo_’)]


    // Methodes section

    public void getCurrentDate() {
        Utils.returnCurrentDate();
    }

    public String getText() {
        WebElement buttonText = driver.findElement(findAFlightTextXPath);
        return buttonText.getText();

    }

    public void FillFlyTextField(String text, int textFieldNumber) {
        WebElement searchTextField,searchDropDown;

        if (textFieldNumber == 1) {
            searchTextField = driver.findElement(searchFlyFromTextField);
            searchTextField.sendKeys(text);
            searchDropDown = driver.findElement(By.xpath("//ul[@class='dropdown-menu large']"));
            searchDropDown = driver.findElement(By.xpath("//li[a[contains(text(), 'LAX')]]"));

        } else {
            searchTextField = driver.findElement(searchFlyToTextField);
            searchTextField.sendKeys(text);
            searchDropDown = driver.findElement(By.xpath("//ul[@class='dropdown-menu large']"));
            searchDropDown = driver.findElement(By.xpath("//li[a[contains(text(), 'BUH')]]"));
        }


        clickOnFlyTextField(searchTextField);

    }
    public void clickOnFlyTextField(WebElement searchDropDown) {
         searchDropDown.click();
    }
}




