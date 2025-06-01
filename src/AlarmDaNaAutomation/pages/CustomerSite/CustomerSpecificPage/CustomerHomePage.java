package AlarmDaNaAutomation.pages.CustomerSite.CustomerSpecificPage;

import AlarmDaNaAutomation.base.BasePageDriver;
import AlarmDaNaAutomation.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CustomerHomePage extends BasePageDriver {
    //Locators section

    By customerNameXPath = By.xpath("//span[text() = 'PM360R_243D17']");


    //Methods section

    public String customerName(){
        Utils.waitForElementVisible(driver,customerNameXPath,15);
        return driver.findElement(customerNameXPath).getText();
    }

    public String pageHeaderName(By elementXPath){
        System.out.println("base = ");
        return driver.findElement(elementXPath).getText();

    }
}
