package AlarmDaNaAutomation.pages.CustomerSite.CustomerSpecificPage.SettingsPage.LoginInformationPage;

import AlarmDaNaAutomation.base.BasePageDriver;
import AlarmDaNaAutomation.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

public class SiteAppearancePage extends BasePageDriver {

    //Locators section

    By darkModeTextXPath = By.xpath("//span[text() = 'Dark Mode']");
    By highContrastTextXPath = By.xpath("//span[text() = 'High Contrast']");
    By pageHeaderSiteAppearanceXPath = By.xpath("//h1[text() = 'Site Appearance']");
    By darkModeToogleXPath = By.xpath("//input[@class='dark-mode']");
    By highContrastToogleXPath = By.xpath("//input[@class='high-contrast' and @type='checkbox']");
    By saveButtonXPath = By.xpath("//span[text() = 'Save']");
    By notificationSave = By.xpath("//p[@class='notification-text' and text()='Your preferences have been updated.']");

    //Methods section

    public String returnAttributeDarkMode(String attribute){
        System.out.println("TEXT = " + driver.findElement(darkModeTextXPath).getText());
        return driver.findElement(darkModeToogleXPath).getDomAttribute(attribute);
    }

    public String returnAttributeContrast(String attribute){
        System.out.println("TEXT = " + driver.findElement(highContrastTextXPath).getText());
        return driver.findElement(highContrastToogleXPath).getDomAttribute(attribute);
    }
    public void darkModeClick(){
         driver.findElement(darkModeToogleXPath).click();
       // System.out.println("toogle = " + returnAttributeDarkMode("data-checked"));

    }

    public void contrastClick(){

        driver.findElement(highContrastToogleXPath).click();
    }

    public By pageHeaderName(){
        return pageHeaderSiteAppearanceXPath;
    }

    public void saveClick(){

        driver.findElement(saveButtonXPath).click();
    }
    public String returnNotificationSave(){
        Utils.waitForElementVisible(driver, notificationSave,15);
        System.out.println("TEXT = " + driver.findElement(notificationSave).getText());
        return driver.findElement(notificationSave).getText();
    }





}
