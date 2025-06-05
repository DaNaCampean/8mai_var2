package AlarmDaNaAutomation.pages.CustomerSite.CustomerSpecificPage.SettingsPage;

import AlarmDaNaAutomation.base.BasePageDriver;
import AlarmDaNaAutomation.pages.CustomerSite.CustomerSpecificPage.CustomerHomePage;
import AlarmDaNaAutomation.pages.CustomerSite.HomePage;
import AlarmDaNaAutomation.utils.Utils;
import org.openqa.selenium.By;

public class SettingsHomePage extends BasePageDriver {

    //Locators section

    By loginInfoXPath = By.xpath("//h2[text() = 'Login Information']");
    By pageHeaderSettingXPath = By.xpath("//h1[text() = 'Settings']");




    //Methods section


    public void selectLoginInfo(){
        Utils.waitForElementVisible(driver,loginInfoXPath,15);
        driver.findElement(loginInfoXPath).click();
    }
    public By pageHeaderName(){

        return pageHeaderSettingXPath;
    }




}
