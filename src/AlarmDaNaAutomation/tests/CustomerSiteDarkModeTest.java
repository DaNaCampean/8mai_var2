package AlarmDaNaAutomation.tests;

import AlarmDaNaAutomation.base.BaseURLs;
import AlarmDaNaAutomation.utils.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerSiteDarkModeTest extends BaseTest{


    @Test
    public void darkModeSiteAppearance() {

        System.out.println("TEST CASE: CX-T1557 - Dark Mode: Permission for customers associated with dealer 1/1115");

       BaseURLs.getCustomerSiteURL();
        // Verify that correct URL, alarm.com opens.
        String myURL = home.getUrl();
        // System.out.println("URL = " + myURL);
        Assert.assertEquals(myURL, "https://international.alarm.com/adc/", "Verified that the correct page was shown, by URL");
        System.out.println("Passed - correct URL: " + myURL + " opens");

        //click on Sign In button
        home.clickSignIn();
        myURL = login.getUrl();
        Assert.assertEquals(myURL, "https://www.alarm.com/login.aspx", "Verified that the correct LogIn page was shown, by URL");
        System.out.println("Passed - correct URL: " + myURL + " opens");

        login.signInWithCredentials();
        String customerSiteName = (customer.customerName());
        Assert.assertEquals(customerSiteName, "PM360R_243D17", "Verified that the correct customer page opens, by cuatomer name ");
        System.out.println("Passed - correct Customer account: " + customerSiteName + " opens");


/*
2Step Navigate to Settings --> Login Information

Expected Result
Verify page loads

3Step Look at options under “Login Information”

Expected Result
Verify “Site Appearance” is listed as an option
 */
        settings.selectSettings();
        settings.selectLoginInfo();
        settings.selectSiteAppearance();
    }

    @Test
    public void darkModeToogle() {

        System.out.println("TEST CASE: CX-T1556 (1.0)Dark Mode: Toggling Dark Mode ON/OFF (Functional)");
        // Verify that correct URL, alarm.com opens.
        BaseURLs.getCustomerSiteURL();
        String myURL = home.getUrl();
        // System.out.println("URL = " + myURL);
        Assert.assertEquals(myURL, "https://international.alarm.com/adc/", "Verified that the correct page was shown, by URL");
        System.out.println("Passed - correct URL: " + myURL + " opens");

        //click on Sign In button
        home.clickSignIn();
        myURL = login.getUrl();
        Assert.assertEquals(myURL, "https://www.alarm.com/login.aspx", "Verified that the correct LogIn page was shown, by URL");
        System.out.println("Passed - correct URL: " + myURL + " opens");

        login.signInWithCredentials();
        String customerSiteName = (customer.customerName());
        Assert.assertEquals(customerSiteName, "PM360R_243D17", "Verified that the correct customer page opens, by cuatomer name ");
        System.out.println("Passed - correct Customer account: " + customerSiteName + " opens");


/*
2Step Navigate to Settings --> Login Information

Expected Result
Verify page loads

3Step Look at options under “Login Information”

Expected Result
Verify “Site Appearance” is listed as an option
 */
        settings.selectSettings();
        settings.selectLoginInfo();
        settings.selectSiteAppearance();
    }

    @Test
    public void dealer() {
        BaseURLs.getDealerSiteURL();
        Utils.implicitlyWaitThreeSeconds();
        System.out.println("dealer");
    }
}
