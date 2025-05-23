package HW_02_Flights.pages;

import HW_02_Flights.base.BasePageDriverInitialization;
import HW_02_Flights.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
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

    Actions actions = new Actions(driver);
    //a[contains(@aria-label, ‘logo_’)]


    // Methodes section

    public void getCurrentDate() {
        Utils.returnCurrentDate();
    }

    public String getText() {
        WebElement buttonText = driver.findElement(findAFlightTextXPath);
        return buttonText.getText();

    }

    public void FillFlyFromTextField() {


        /*WebElement searchTextField = driver.findElement(searchFlyFromTextField);
        searchTextField.sendKeys("LAX");

        Utils.implicitlyWaitThreeSeconds();
        WebElement searchDropDown = driver.findElement(By.xpath("//ul[@class='dropdown-menu large']"));
        System.out.println("text otp? = "+ searchDropDown.getText());
        searchDropDown = driver.findElement(By.xpath("//li/a/b[contains(text(), 'LAX')]"));
        System.out.printf("text otp? = %s%n", searchDropDown.getTagName());
        System.out.printf("text otp? ="+searchDropDown.getAccessibleName());
        searchDropDown.click();*/

        WebElement searchTextField = driver.findElement(searchFlyFromTextField);
        searchTextField.sendKeys("LAX");
      //  Utils.waitForElementVisible(driver, By.xpath("//ul[@class='dropdown-menu large']"), 3);
      //  waitForElementVisible(WebDriver driver, By locator, int timeoutInSeconds)
      //  WebElement searchDropDown = driver.findElement(By.xpath("//ul[@class='dropdown-menu large']"));
        //Utils.waitForElementVisible(driver, (By) searchDropDown, 3);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
      WebElement searchDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='dropdown-menu large']")));

        System.out.println("text otp? = " + searchDropDown.getText());

        searchDropDown = driver.findElement(By.xpath("//li/a/b[contains(text(), 'LAX')]"));
        Utils.waitForElementClickable(driver, searchDropDown,3);
        searchDropDown.click();
        }





public void FillFlyToTextField() {
        WebElement searchTextField = driver.findElement(searchFlyToTextField);
        searchTextField.sendKeys("Bucharest");
        Utils.implicitlyWaitThreeSeconds();
        WebElement searchDropDown = driver.findElement(By.xpath("//ul[@class='dropdown-menu large']"));
        System.out.println("text otp? = "+ searchDropDown.getText());
        searchDropDown = driver.findElement(By.xpath("//li[a[contains(text(), 'OTP')]]"));
        System.out.printf("text otp? = %s%n", searchDropDown.getTagName());
        System.out.printf("text otp? ="+searchDropDown.getAccessibleName());
        searchDropDown.click();
    }

    public void ToBeRefactor(){
        // click date
        driver.findElement(By.xpath("   //div[@data-bdd='farefinder-flight-startdate-input']")).click();


        driver.findElement(By.xpath("//*[name()='svg' and @data-id = 'SVG_CHEVRON_RIGHT__16']")).click();
        driver.findElement(By.xpath("//*[name()='svg' and @data-id = 'SVG_CHEVRON_LEFT__16']")).click();


        LocalDate currentDate = Utils.returnCurrentDate();

        // Set the current date

        System.out.println("local = " + currentDate);
        // Add 28 days
        LocalDate startDate = currentDate.plusDays(2);
        LocalDate endDate = currentDate.plusDays(8);
// Format the date if needed
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String startDateString = startDate.format(formatter);
        String endDateString = endDate.format(formatter);


        System.out.println("START Date = " + startDate);
        System.out.println("END DATE = " + endDate);



        driver.findElement(By.xpath("//td[@aria-label='" + startDateString + "']")).click();

        driver.findElement(By.xpath("//td[@aria-label='" + endDateString + "']")).click();



//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//
//
//        WebElement passengers = driver.findElement(By.xpath("//input[@name='farefinder-occupant-selector-flight']"));
//       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//
//
//        Actions actions = new Actions(driver);
//         //passengers.click();
//        actions.click(passengers).perform();   // dropdown passengers
//        System.out.println("dropDown? = " + passengers.getText());
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//
//
//        WebElement searchDropDown = driver.findElement(By.xpath("//span[@class='guest-picker__popover Tooltip Tooltip--bottom Tooltip--popover Tooltip--lg in fade']"));
//
//        System.out.println(" popup= "+ searchDropDown.getText());


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


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



        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        //search flights

        WebElement searchFlight = driver.findElement(By.xpath("//div[@class = 'submit-button']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        // passengers.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

       // actions.click(searchFlight).perform();
         searchFlight.click();

        // driver.switchTo().newWindow(WindowType.TAB);
        String myUrl = driver.getCurrentUrl();
        driver.get(myUrl);



        //  Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        System.out.println("ASSERT:");


//        WebElement assertFinal = driver.findElement(By.xpath("//span[contains(text(),'Choose departing flight')]"));
//        String textAsser = assertFinal.getText();
//        System.out.println("getTEXT = "+ textAsser);
//       assertEquals(textAsser, "Choose departing flight", "Verify ca a mers Search Flights - loading page"); // only if is not ok , is shown this message

        FirefoxDriver newBrowser = new FirefoxDriver();
        newBrowser.get(myUrl);
        System.out.println("URL = " + myUrl);

        WebElement assertFinal = driver.findElement(By.xpath("//span[contains(text(),'Choose departing flight')]"));
        String textAsser = assertFinal.getText();
        System.out.println("getTEXT = "+ textAsser);
        assertEquals(textAsser, "Choose departing flight", "Verify ca a mers Search Flights - loading page"); //only if is not ok , is shown this message


//        assert first - Los Angeles to Bucharest
//
//        System.out.println("LosAngelesToOTP = ");
//       WebElement finalAssert = driver.findElement(By.xpath("//h2[@class='uitk-heading uitk-heading-5']"));
//
//      String textAsser = finalAssert.getText();
//       System.out.println("getTEXT = "+ textAsser);
//       assertEquals(textAsser, "Los Angeles to Bucharest", "Verify ca a mers Search Flights - loading page"); // only if is not ok , is shown this message
//
//<span class="">Choose departing flight</span>
//       Asser second - Recommended
//
//        System.out.println("Final  = ");
//        WebElement finalAssert1 = driver.findElement(By.xpath("//h5[@class='uitk-heading uitk-heading-5']"));
//
//        String textAsser1 = finalAssert1.getText();
//        System.out.println("getTEXT = "+ textAsser1);
//        assertEquals(textAsser1, "Recommended departing flights", "Verify ca a mers Search Flights"); // only if is not ok , is shown this message
    }
}




