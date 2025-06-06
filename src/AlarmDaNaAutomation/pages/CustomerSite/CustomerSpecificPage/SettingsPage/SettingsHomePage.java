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
        System.out.println("before -select login info page");
        Utils.implicitlyWaitFiveSeconds();
        Utils.waitForElementVisible(driver,loginInfoXPath,30);
        System.out.println("before click site info");
        driver.findElement(loginInfoXPath).click();
        System.out.println("after click site info");
    }
    public By pageHeaderName(){

        return pageHeaderSettingXPath;
    }




}
