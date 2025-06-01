package AlarmDaNaAutomation.pages.CustomerSite.CustomerSpecificPage.SettingsPage.LoginInformationPage;

import AlarmDaNaAutomation.base.BasePageDriver;
import org.openqa.selenium.By;

public class SiteAppearancePage extends BasePageDriver {

    //Locators section

    By darkModeTextXPath = By.xpath("//span[text() = 'Dark Mode']");
    By highContrastTextXPath = By.xpath("//span[text() = 'High Contrast']");
     By pageHeaderSiteAppearanceXPath = By.xpath("//h1[text() = 'Site Appearance']");

    //Methods section

    public void dark(){
        System.out.println("TEXT = " + driver.findElement(darkModeTextXPath).getText());
    }

    public void contrast(){
        System.out.println("TEXT = " + driver.findElement(highContrastTextXPath).getText());
    }

    public By pageHeaderName(){
        return pageHeaderSiteAppearanceXPath;
    }



}
