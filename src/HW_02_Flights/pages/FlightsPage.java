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
            searchTextField.click();

            Utils.implicitlyWaitThreeSeconds();
            searchDropDown = driver.findElement(By.xpath("//ul[@class='dropdown-menu large']"));
          //  System.out.println("textttt first field? = "+ searchDropDown.getText());
           // searchDropDown = driver.findElement(By.xpath("//li[a[contains(text(), 'LAX')]]"));
          //  System.out.println("textttt first field? = "+ searchDropDown.getText());
           // System.out.printf("textttt otp? = %s%n", searchDropDown.getTagName());
        } else {
            searchTextField = driver.findElement(searchFlyToTextField);
            searchTextField.sendKeys(text);
            Utils.implicitlyWaitThreeSeconds();
            searchDropDown = driver.findElement(By.xpath("//ul[@class='dropdown-menu large']"));
            System.out.println("textttt otp? = "+ searchDropDown.getText());
            searchDropDown = driver.findElement(By.xpath("//li[a[contains(text(), 'OTP')]]"));
            System.out.printf("textttt otp? = %s%n", searchDropDown.getTagName());
            System.out.printf("textttt otp? ="+searchDropDown.getAccessibleName());
        }


        searchDropDown.click();

    }
    public void clickOnFlyTextField(WebElement searchDropDown) {
         searchDropDown.click();

    }
}




