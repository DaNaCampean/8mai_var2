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
    By backgroundColorXPath = By.xpath("//body[@class='base-background ember-application dark is-touch-screen']");




    //Methods section

    public String customerName(){
        Utils.waitForElementVisible(driver,customerNameXPath,15);
        return driver.findElement(customerNameXPath).getText();
    }

    public String pageHeaderName(By elementXPath){
        System.out.println("base = ");
        return driver.findElement(elementXPath).getText();

    }

    public void selectSettings(){
        driver.findElement(settingsXPath).click();
    }

    public void selectHome(){
        driver.findElement(homeXPath).click();
    }

    public void refreshApp(){
        driver.findElement(refreshXPath).click();
        Utils.implicitlyWaitThreeSeconds();
        System.out.println("refreshhhh");
    }
    public void isDarkMode(){
        String culoare = driver.findElement(backgroundColorXPath).getText();
        System.out.println(culoare);

        Utils.implicitlyWaitThreeSeconds();
        System.out.println("refreshhhh");
    }
}
