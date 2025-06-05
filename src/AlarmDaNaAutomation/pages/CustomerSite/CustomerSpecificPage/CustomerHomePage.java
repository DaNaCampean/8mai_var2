package AlarmDaNaAutomation.pages.CustomerSite.CustomerSpecificPage;

import AlarmDaNaAutomation.base.BasePageDriver;
import AlarmDaNaAutomation.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CustomerHomePage extends BasePageDriver {
    //Locators section

    By customerNameXPath = By.xpath("//span[text() = 'PM360R_243D17']");
    By settingsXPath = By.xpath("//p[text() = 'Settings']");
    By homeXPath = By.xpath("//p[text() = 'Home']");
    By refreshXPath = By.xpath("//button[@aria-label = 'Reload Application']");
    By backXPath = By.xpath("/html");


    //Methods section

    public String colorTheme(){
        // Locate the <html> element
        WebElement htmlElement = driver.findElement(backXPath);
        String colorTheme="";

        // Get the 'style' attribute
        String styleAttribute = htmlElement.getDomAttribute("style");
        if (styleAttribute.contains("color-scheme: dark")){
            System.out.println("Background = DARK");
            colorTheme = "dark";
        }
        else if (styleAttribute.contains("color-scheme: light")){
            colorTheme = "light";
        }
        return colorTheme;
        }

    public String customerName(){
        Utils.waitForElementVisible(driver,customerNameXPath,15);
        return driver.findElement(customerNameXPath).getText();
    }

    public String pageHeaderName(By elementXPath){
        System.out.println("base = ");
        return driver.findElement(elementXPath).getText();

    }

    public void selectSettings(){
        Utils.waitForElementVisible(driver,settingsXPath,15);
        driver.findElement(settingsXPath).click();
    }

    public void selectHome(){
        Utils.waitForElementVisible(driver,homeXPath,15);
        driver.findElement(homeXPath).click();
    }

    public void refreshApp(){
        driver.findElement(refreshXPath).click();
        Utils.implicitlyWaitFiveSeconds();
        System.out.println("refreshhhh");
    }

}
