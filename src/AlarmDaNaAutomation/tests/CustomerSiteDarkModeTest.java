package AlarmDaNaAutomation.tests;

import AlarmDaNaAutomation.base.BasePageDriver;
import AlarmDaNaAutomation.base.BaseURLs;
import AlarmDaNaAutomation.utils.Utils;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerSiteDarkModeTest extends BaseTest{


    private static final Logger log = LoggerFactory.getLogger(CustomerSiteDarkModeTest.class);

    @Test
    public void darkModeSiteAppearance() {

        System.out.println("TEST CASE: CX-T1557 - Dark Mode: Permission for customers associated with dealer 1/1115");

       BaseURLs.getCustomerSiteURL();
        // Verify that correct URL, alarm.com opens.
        String myURL = home.getUrl();
        // System.out.println("URL = " + myURL);
        Assert.assertEquals(myURL, "https://international.alarm.com/adc/", "Verified that the correct page was shown, by URL");
        System.out.println("STEP1 - Passed - correct URL (ALARM HOME PAGE): " + myURL + " opens");

        //click on Sign In button
        home.clickSignIn();
        myURL = login.getUrl();
        Assert.assertEquals(myURL, "https://www.alarm.com/login.aspx", "Verified that the correct LogIn page was shown, by URL");
        System.out.println("STEP 2 - Passed - correct URL(SIGN IN): " + myURL + " opens");

        login.signInWithCredentials();
        String customerSiteName = (customer.customerName());
        Assert.assertEquals(customerSiteName, "PM360R_243D17", "Verified that the correct customer page opens, by cuatomer name ");
        System.out.println("STEP 3 - Passed - correct Customer account LOGGED IN: " + customerSiteName + " opens");




        settings.selectSettings();

        By dana = settings.pageHeaderName();
        String didi = home.pageHeaderName(dana);
        Assert.assertEquals(didi, "Settings", "Verified that the correct  page opens, by page header ");
        System.out.println("STEP 4 - Passed - correct page: " + didi + " opens");




        settings.selectLoginInfo();
        dana = loginInformation.pageHeaderName();
        didi = home.pageHeaderName(dana);

        Assert.assertEquals(didi, "Login Information", "Verified that the correct  page opens, by page header ");
        System.out.println("STEP 5 - Passed - correct page: " + didi + " opens");

       didi = loginInformation.optionsText("siteApperanceXPath");


        Assert.assertEquals(didi, "Site Appearance", "Verified that Site Appearance option is available ");
        System.out.println("STEP 6 - Passed - Correct option is available on the page: " + didi);


        loginInformation.selectSiteAppearance();
        dana = siteAppearance.pageHeaderName();
        didi = home.pageHeaderName(dana);

        Assert.assertEquals(didi, "Site Appearance", "Verified that the correct  page opens, by page header ");
        System.out.println("STEP 7 - Passed - correct page: " + didi + " opens");


        siteAppearance.dark();
        siteAppearance.contrast();
    }

    @Test
    public void darkModeToogle() {

        System.out.println("TEST CASE: CX-T1556 (1.0)Dark Mode: Toggling Dark Mode ON/OFF (Functional)");

    }

    @Test
    public void dealer() {
        BaseURLs.getDealerSiteURL();
        Utils.implicitlyWaitThreeSeconds();
        System.out.println("dealer");
    }
}
