package AlarmDaNaAutomation.tests;

import AlarmDaNaAutomation.base.BasePageDriver;
import AlarmDaNaAutomation.pages.CustomerSite.CustomerSpecificPage.CustomerHomePage;
import AlarmDaNaAutomation.pages.CustomerSite.HomePage;
import AlarmDaNaAutomation.pages.CustomerSite.LogInPage;
import AlarmDaNaAutomation.pages.CustomerSite.CustomerSpecificPage.SettingsPage.SettingsHomePage;
import org.testng.annotations.*;

public class BaseTest {
    public HomePage home;
    public LogInPage login;
    public SettingsHomePage settings;
    public CustomerHomePage customer;

    @BeforeSuite
    public void initDriver(){

        BasePageDriver.driverSetUpWindows();

    }

    @BeforeTest
    public void createObjects(){
        home = new HomePage();
        login = new LogInPage();
        settings = new SettingsHomePage();
        customer = new CustomerHomePage();

    }

    @AfterSuite
    public void browserQuit(){

       BasePageDriver.browserQuit();

    }


}




