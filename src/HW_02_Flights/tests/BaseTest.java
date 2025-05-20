package HW_02_Flights.tests;


import HW_02_Flights.pages.HomePage;
import HW_02_Flights.base.BasePageDriverInitialization;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public HomePage home;


    @BeforeSuite
    public void initDriver(){
        System.out.println("Sunt in initDriver");
      //  BasePageDriverInitialization.setUp();
        BasePageDriverInitialization.driverSetupWindows();


    }
//
    @BeforeTest
    public void createObjects(){
        home = new HomePage();

    }

    @AfterSuite
    public void driverQuit(){
        System.out.println("sunt in teardown from base test");
      //  BasePageDriverInitialization.driverQuit();
        BasePageDriverInitialization.driverQuit();

    }
}
