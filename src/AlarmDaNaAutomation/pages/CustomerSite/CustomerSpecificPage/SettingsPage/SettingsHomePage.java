package AlarmDaNaAutomation.pages.CustomerSite.CustomerSpecificPage.SettingsPage;

import AlarmDaNaAutomation.base.BasePageDriver;
import AlarmDaNaAutomation.utils.Utils;
import org.openqa.selenium.By;

public class SettingsHomePage extends BasePageDriver {

    //Locators section
    By settingsXPath = By.xpath("//p[text() = 'Settings']");
    By loginInfoXPath = By.xpath("//h2[text() = 'Login Information']");
    By siteApperanceXPath = By.xpath("//p[text() = 'Site Appearance']");


    //Methods section

    public void selectSettings(){
        driver.findElement(settingsXPath).click();
    }
    public void selectLoginInfo(){
        Utils.waitForElementVisible(driver,loginInfoXPath,15);
        driver.findElement(loginInfoXPath).click();
    }
    public void selectSiteAppearance(){
        Utils.waitForElementVisible(driver,siteApperanceXPath,15);
        driver.findElement(siteApperanceXPath).click();

    }

}
