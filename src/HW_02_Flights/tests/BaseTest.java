package HW_02_Flights.tests;

import HW_02_Flights.pages.FlightsPage;
import HW_02_Flights.pages.HomePage;
import HW_02_Flights.base.BasePageDriverInitialization;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public HomePage home;
    public FlightsPage flights;

    @BeforeSuite
    public void initDriver(){

      //  BasePageDriverInitialization.setupMac();
        BasePageDriverInitialization.driverSetupWindows();

    }

    @BeforeTest
    public void createObjects(){
       home = new HomePage();
       flights = new FlightsPage();

    }

    @AfterSuite
    public void driverQuit(){

     // BasePageDriverInitialization.driverQuit();

    }
}
