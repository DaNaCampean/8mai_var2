package HW_01_emag_var2.tests;

import HW_01_emag_var2.base.BasePage_driver_browser_init;
import HW_01_emag_var2.pages.CosulMeuPage;
import HW_01_emag_var2.pages.HomePage;
import HW_01_emag_var2.pages.ProductDetailsPage;
import HW_01_emag_var2.pages.SearchResultsPage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTests {

    public HomePage home;
    public SearchResultsPage search;
    public ProductDetailsPage productDetailsPage;
    public CosulMeuPage cosulMeu;

    @BeforeSuite
    public void initDriver(){
        System.out.println("Sunt in initDriver");
       BasePage_driver_browser_init.driverSetupWindows();
      //  BasePage_driver_browser_init.driverSetupMac();
    }


    @BeforeTest
    public void createObjects(){
        home = new HomePage();
        //Create object of SearchResultsPage
        search = new SearchResultsPage();
        productDetailsPage = new ProductDetailsPage();
        cosulMeu = new CosulMeuPage();


    }

    @AfterSuite
    public void tearDown(){
        System.out.println("sunt in teardown from base test");
        BasePage_driver_browser_init.browserQuit();

    }
}