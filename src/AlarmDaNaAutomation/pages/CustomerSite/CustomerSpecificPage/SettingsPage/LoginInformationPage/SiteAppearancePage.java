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

    public void backToggle(){
        // <body class="base-background ember-application dark">
        //<body class="base-background ember-application">
       // By backgroundColor = By.xpath("//body[contains(@class,'dark')]");
        By backgroundColor = By.xpath("//body[contains(@class,'base-background ember-application')]");

       // Color RGBA_COLOUR = Color.fromString("rgba(5, 5, 5, 1)");
        Color loginButtonBackgroundColour = Color.fromString(driver.findElement(backgroundColor).getCssValue("background-color"));
        System.out.println("color = " + loginButtonBackgroundColour);
        assert loginButtonBackgroundColour.asRgba().equals("rgba(5, 5, 5, 1)"); //dark
        //assert loginButtonBackgroundColour.asRgba().equals("rgba(240, 240, 240, 1)"); //light

        System.out.println("ok background");
        System.out.println("contrast on");

        //CONTRAST
        By contrastXPath = By.xpath("//div[@class='md view-container surface ember-view']");

        Color contrastColor = Color.fromString(driver.findElement(contrastXPath).getCssValue("color"));
        System.out.println("color contrast = " + contrastColor);
//        assert contrastColor.asRgba().equals("rgba(221, 221, 222, 1)"); //off
//        System.out.println("contrast off");

         assert contrastColor.asRgba().equals("rgba(255, 255, 255, 1)"); //on
        System.out.println("contrast ON");
    }



}
