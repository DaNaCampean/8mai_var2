package HW_02_Flights.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.time.LocalDate;
import static HW_02_Flights.base.BasePageDriverInitialization.driver;

public class Utils {
//in utils, we can use wait for elements to be visible , rather than  implicit wait with seconds
    // take screenshots

    public static void implicitlyWaitThreeSeconds(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    // wait until the element became visible
    public static void waitForElementVisible(WebDriver driver, By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Wait until the element is clickable
    public static void waitForElementClickable(WebDriver driver, WebElement locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


    public static LocalDate returnCurrentDate(){
        // Set the current date

       return LocalDate.now();

    }


}

