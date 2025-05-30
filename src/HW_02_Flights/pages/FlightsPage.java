package HW_02_Flights.pages;

import HW_02_Flights.base.BasePageDriverInitialization;
import HW_02_Flights.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class FlightsPage extends BasePageDriverInitialization {

    Actions actions = new Actions(driver);// Instantiate the Actions class needed passengers popup


    // Selectors section
    By findAFlightTextXPath = By.xpath("//span[text()='Find a flight']"); //"Find a Flight" text from the button
    By searchFlyFromTextField = By.xpath("//div[@class='col-xs-12 margin-top-6']/div[@class='location-typeahead']/div[contains(@class, 'hw-form-group form-group floating-label')]/input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis']"); // Fly from textField
    By searchFlyToTextField = By.xpath("//div[@class='col-xs-12 margin-top-4']/div[@class='location-typeahead']/div[contains(@class, 'hw-form-group form-group floating-label')]/input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis']");
    By dateFormXPath = By.xpath("   //div[@data-bdd='farefinder-flight-startdate-input']");
    By fromToFieldDropDownXPath = By.xpath("//ul[@class='dropdown-menu large']");
    By fromFieldSelectLaxXPath = By.xpath("//li/a/b[contains(text(), 'LAX')]");
    By toFieldSelectOtpXPath = By.xpath("//li[a[contains(text(), 'OTP')]]");

    String setDepartingDateXPath ="//td[@aria-label='%s']";
    // %s
    String setReturningDateXPath="//td[@aria-label='%s']";

    By readDepartingDateXPath = By.xpath("//input[@name='startDate']");
    By readReturningDateXPath = By.xpath("//input[@name='endDate']");

    By passengersDropDownXPath = By.xpath("//input[@name='farefinder-occupant-selector-flight']");

    By passengersDropXPath = By.xpath("//span[@class='guest-picker__popover Tooltip Tooltip--bottom Tooltip--popover Tooltip--lg in fade']");
    By selectAdultsXPath = By.xpath("//*[name()='svg' and @data-id='SVG_PLUS__16']");// 2x Adults
    By selectDonePassengersXPath = By.xpath("//span[@class='btn__label' and text()='Done']"); // DONE button

    By readPassengersXPath = By.xpath("//input[@name='farefinder-occupant-selector-flight']");

    By searchFlightsXPath = By.xpath("//div[@class = 'submit-button']");


    // Methods section

    public String getTextSearchButton() {
        WebElement buttonText = driver.findElement(findAFlightTextXPath);
        return buttonText.getText();
    }

    public String FillFlyFromTextField() {
        WebElement searchTextField = driver.findElement(searchFlyFromTextField);
        searchTextField.sendKeys("LAX");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(fromToFieldDropDownXPath));
        driver.findElement(fromFieldSelectLaxXPath).click();
        return searchTextField.getDomAttribute("value");
        }

public String FillFlyToTextField() {
        WebElement searchTextField = driver.findElement(searchFlyToTextField);
        searchTextField.sendKeys("Bucharest");
        Utils.implicitlyWaitThreeSeconds();
        driver.findElement(fromToFieldDropDownXPath);
        driver.findElement(toFieldSelectOtpXPath).click();
        return searchTextField.getDomAttribute("value");
    }

    public List<String> datesChoosing(){
        // create Date WebElements
        WebElement dateForm = driver.findElement(dateFormXPath);
        //click on date form
        dateForm.click();

        LocalDate currentDate = Utils.returnCurrentDate(); //retrieve the current date

        // Set the Departing date with current date + 7 and returning date with current date +14

        LocalDate departingDate = currentDate.plusDays(7);
        LocalDate returningDate = currentDate.plusDays(14);

        // Format the date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String departingDateString = departingDate.format(formatter);
        String returningDateString = returningDate.format(formatter);
//        By setDepartingDateXPath = By.xpath("//td[@aria-label='" + departingDateString + "']");
//        By setReturningDateXPath= By.xpath("//td[@aria-label='" + returningDateString + "']");

        driver.findElement(By.xpath(String.format(setDepartingDateXPath, departingDateString))).click();
        driver.findElement(By.xpath(String.format(setReturningDateXPath, returningDateString))).click();

        System.out.println("valoarea din xpath = " + String.format(setReturningDateXPath, returningDateString ));

        String startDate = driver.findElement(readDepartingDateXPath).getDomAttribute("value");
        String endDate = driver.findElement(readReturningDateXPath).getDomAttribute("value");

        return Arrays.asList(startDate,endDate);

    }

    public String passengersSelection(){
        WebElement passengers = driver.findElement(passengersDropDownXPath);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // passengers.click();
        actions.click(passengers).perform();   // dropdown passengers

        driver.findElement(passengersDropXPath);
        driver.findElement(selectAdultsXPath).click(); // 2x Adults
        driver.findElement(selectDonePassengersXPath).click(); // DONE button

        return driver.findElement(readPassengersXPath).getDomAttribute("value");


    }

    public void findAFlight(){
        //search flights

        WebElement searchFlight = driver.findElement(searchFlightsXPath);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        // passengers.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


        searchFlight.click();
     //  WebElement assertFinal = driver.findElement(By.xpath("//span[contains(text(),'Choose departing flight')]"));
//
//        Utils.waitForElementVisible(driver, (By) assertFinal,10);


       // return assertFinal.getText();
    }


}




