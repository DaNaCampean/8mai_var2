package AlarmDaNaAutomation.pages.CustomerSite.CustomerSpecificPage;

import AlarmDaNaAutomation.base.BasePageDriver;
import AlarmDaNaAutomation.pages.CustomerSite.CustomerSpecificPage.SettingsPage.LoginInformationPage.LoginInformationPage;
import AlarmDaNaAutomation.pages.CustomerSite.CustomerSpecificPage.SettingsPage.LoginInformationPage.SiteAppearancePage;
import AlarmDaNaAutomation.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class CustomerHomePage extends BasePageDriver {
    //Locators section

    By customerNameXPath = By.xpath("//span[text() = 'PM360R_243D17']");
    By settingsXPath = By.xpath("//p[text() = 'Settings']");
    By homeXPath = By.xpath("//p[text() = 'Home']");
    By refreshXPath = By.xpath("//button[@aria-label = 'Reload Application']");
    By backXPath = By.xpath("/html");


    //Methods section

    public String colorScheme(){
        // Locate the <html> element . Checking color-scheme
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
        System.out.println("BEFORE CLICK SETTINGS");
        Utils.implicitlyWaitFiveSeconds();
        driver.findElement(settingsXPath).click();
        System.out.println("AFTER click settings");
    }

    public void selectHome(){
        System.out.println("select HOME");

        Utils.waitForElementVisible(driver,homeXPath,15);
        Utils.implicitlyWaitFiveSeconds();
        driver.findElement(homeXPath).click();
    }

    public void refreshApp(){
        driver.findElement(refreshXPath).click();
        Utils.implicitlyWaitFiveSeconds();
        System.out.println("refreshhhh");
    }

    public Color darkModeAppliedRGBA(){
        By backgroundColor = By.xpath("//body[contains(@class,'base-background ember-application')]");

        Color backgroundColour = Color.fromString(driver.findElement(backgroundColor).getCssValue("background-color"));
        System.out.println("color = " + backgroundColour);
        assert backgroundColour.asRgba().equals("rgba(5, 5, 5, 1)"); //dark
        //assert backgroundColour.asRgba().equals("rgba(240, 240, 240, 1)"); //light

        System.out.println("ok background");
        return backgroundColour;

    }

    public Color highContrastAppliedRGBA(){

      //  By contrastXPath = By.xpath("//div[@class='md view-container surface ember-view']");
          By contrastXPath = By.xpath("div[@id='app-page']");

        Color contrastColor = Color.fromString(driver.findElement(contrastXPath).getCssValue("color"));
        System.out.println("color contrast = " + contrastColor);
//        assert contrastColor.asRgba().equals("rgba(221, 221, 222, 1)"); //off
//        System.out.println("contrast off");

        assert contrastColor.asRgba().equals("rgba(255, 255, 255, 1)"); //on
        System.out.println("contrast ON");
        return contrastColor;
    }

    public Color toggleBlue(){


        By contrastXPath =By.xpath("//input[@class='high-contrast' and @type='checkbox']");
        driver.findElement(contrastXPath).click();
        Color toggleColor = Color.fromString(driver.findElement(contrastXPath).getCssValue("outline-color"));
        System.out.println("TOGGLE COLOR = " + toggleColor);
//        assert contrastColor.asRgba().equals("rgba(221, 221, 222, 1)"); //off
//        System.out.println("contrast off");


        assert toggleColor.asRgba().equals("rgba(45, 164, 240, 1)"); //on
       // assert toggleColor.asRgba().equals("rgba(51, 51, 51, 1)"); //on

        System.out.println("toggle BLUE!!!!!!!!!!!!!");
        return toggleColor;
    }

}
