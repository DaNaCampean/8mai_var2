package HW_02_Flights.tests;

import HW_02_Flights.base.BasePageDriverInitialization;
import HW_02_Flights.pages.HomePage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public HomePage home;

    // init driver

    //objects creation

    // quit

    @BeforeSuite
    public void initDriver(){
        System.out.println("Sunt in initDriver");
        BasePageDriverInitialization.chromeDriverPathWindowsJob();
        //  BasePage_driver_browser_init.driverSetupMac();
    }
//

    @BeforeTest
    public void createObjects(){
        home = new HomePage();



    }

    @AfterSuite
    public void tearDown(){
        System.out.println("sunt in teardown from base test");
        BasePageDriverInitialization.driverQuit();

    }

}
