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
import static org.testng.AssertJUnit.assertEquals;

public class FlightsPage extends BasePageDriverInitialization {

    // Selectors section

    By findAFlightTextXPath = By.xpath("//span[text()='Find a flight']"); //"Find a Flight" text from the button
    By searchFlyFromTextField = By.xpath("//div[@class='col-xs-12 margin-top-6']/div[@class='location-typeahead']/div[contains(@class, 'hw-form-group form-group floating-label')]/input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis']"); // Fly from textField
    By searchFlyToTextField = By.xpath("//div[@class='col-xs-12 margin-top-4']/div[@class='location-typeahead']/div[contains(@class, 'hw-form-group form-group floating-label')]/input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis']");
    By dateFormXPath = By.xpath("   //div[@data-bdd='farefinder-flight-startdate-input']");
    By fromDateXPath = By.xpath("//*[name()='svg' and @data-id = 'SVG_CHEVRON_RIGHT__16']");
    By toDateXPath = By.xpath("//*[name()='svg' and @data-id = 'SVG_CHEVRON_LEFT__16']");
//    By departingDateClickXPath = By.xpath("//td[@aria-label='" + departingDateString + "']");
//    By returningDateClickXPath = By.xpath("//td[@aria-label='" + returningDateString + "']");




    Actions actions = new Actions(driver);



    // Methods section

    public void getCurrentDate() {
        Utils.returnCurrentDate();
    }

    public String getTextSearchButton() {
        WebElement buttonText = driver.findElement(findAFlightTextXPath);
        return buttonText.getText();

    }



    public String FillFlyFromTextField() {


        WebElement searchTextField = driver.findElement(searchFlyFromTextField);
        searchTextField.sendKeys("LAX");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement searchDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='dropdown-menu large']")));

      //  System.out.println("text otp? = " + searchDropDown.getText());

        searchDropDown = driver.findElement(By.xpath("//li/a/b[contains(text(), 'LAX')]"));
        Utils.waitForElementClickable(driver, searchDropDown,3);
        searchDropDown.click();
        //WebElement dana = driver.findElement(By.xpath("//div[@class='col-xs-12 margin-top-6']/div[@class='location-typeahead']/div[contains(@class, 'hw-form-group form-group floating-label')]/input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis']"));
        return searchTextField.getDomAttribute("value");
        }





public String FillFlyToTextField() {
        WebElement searchTextField = driver.findElement(searchFlyToTextField);
        searchTextField.sendKeys("Bucharest");
        Utils.implicitlyWaitThreeSeconds();
        WebElement searchDropDown = driver.findElement(By.xpath("//ul[@class='dropdown-menu large']"));
        System.out.println("text otp? = "+ searchDropDown.getText());
        searchDropDown = driver.findElement(By.xpath("//li[a[contains(text(), 'OTP')]]"));
        System.out.printf("text otp? = %s%n", searchDropDown.getTagName());
        System.out.printf("text otp? ="+searchDropDown.getAccessibleName());
        searchDropDown.click();
        return searchTextField.getDomAttribute("value");
    }

    public void datesChoosing(){
        // create Date WebElements
        WebElement dateForm = driver.findElement(dateFormXPath);
        //click on date form
        dateForm.click();

        // WebElement fromDate = driver.findElement(fromDateXPath);
        //click on Departing date
        //   fromDate.click();

        //   WebElement toDate = driver.findElement(toDateXPath);
        //click on Returning date
        //  toDate.click();






        LocalDate currentDate = Utils.returnCurrentDate(); //retrieve the current date

        // Set the Departing date with current date + 7 and returning date with current date +14

        LocalDate departingDate = currentDate.plusDays(7);
        LocalDate returningDate = currentDate.plusDays(14);

        // Format the date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String departingDateString = departingDate.format(formatter);
        String returningDateString = returningDate.format(formatter);

        driver.findElement(By.xpath("//td[@aria-label='" + departingDateString + "']")).click();

        driver.findElement(By.xpath("//td[@aria-label='" + returningDateString + "']")).click();
    }

    public void passengersSelection(){
        WebElement passengers = driver.findElement(By.xpath("//input[@name='farefinder-occupant-selector-flight']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // passengers.click();
        actions.click(passengers).perform();   // dropdown passengers


        WebElement searchDropDown = driver.findElement(By.xpath("//span[@class='guest-picker__popover Tooltip Tooltip--bottom Tooltip--popover Tooltip--lg in fade']"));

        System.out.println(" popup= "+ searchDropDown.getText());
        // searchField.click();


        driver.findElement(By.xpath("//*[name()='svg' and @data-id='SVG_PLUS__16']")).click(); // 2x Adults
        driver.findElement(By.xpath("//span[@class='btn__label' and text()='Done']")).click(); // DONE button

    }

    public void findAFlight(){
        //search flights

        WebElement searchFlight = driver.findElement(By.xpath("//div[@class = 'submit-button']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        // passengers.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        // actions.click(searchFlight).perform();
        searchFlight.click();
    }

    public void ToBeRefactor(){

       datesChoosing();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


        passengersSelection();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        findAFlight();



        //  Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));




    }
}




