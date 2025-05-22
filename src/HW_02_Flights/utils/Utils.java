package HW_02_Flights.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static HW_02_Flights.base.BasePageDriverInitialization.driver;

public class Utils {
//in utils, ar merge: waituri...mai bine de folosit esre wait for element to be displayed decat implicit waut cu secunde
    // take screenshots

    public static void implicitlyWaitThreeSeconds(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    // Așteaptă până când elementul devine vizibil
    public static WebElement waitForElementVisible(WebDriver driver, By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Așteaptă până când elementul este clicabil
    public static WebElement waitForElementClickable(WebDriver driver, By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


    public static LocalDate returnCurrentDate(){
        // Set the current date

        LocalDate currentDate = LocalDate.now();
        System.out.println("Current DATE = " + currentDate);
        return currentDate;
    }


}

