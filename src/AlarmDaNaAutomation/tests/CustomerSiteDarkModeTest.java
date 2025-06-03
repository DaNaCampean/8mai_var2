package AlarmDaNaAutomation.tests;

import AlarmDaNaAutomation.base.BasePageDriver;
import AlarmDaNaAutomation.base.BaseURLs;
import AlarmDaNaAutomation.utils.Utils;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerSiteDarkModeTest extends BaseTest{



    @BeforeMethod

    public void preconditions(){
        BaseURLs.goToCustomerSiteURL();
        home.clickSignIn();
        login.signInWithCredentials();
        settings.selectSettings();
        settings.selectLoginInfo();
        loginInformation.selectSiteAppearance();
        String attribute = siteAppearance.returnAttributeDarkMode("data-checked");
        if (attribute.equals("true")){
            siteAppearance.darkModeClick();
        }
       attribute = siteAppearance.returnAttributeContrast("data-checked");
        if (attribute.equals("true")){
            siteAppearance.contrastClick();
        }
        siteAppearance.saveClick();
        System.out.println("Preconditions/ requirements: CHECKED");





    }


//    @Test
//    public void darkModeSiteAppearance() {
//
//       System.out.println("TEST CASE: CX-T1557 - Dark Mode: Permission for customers associated with dealer 1/1115");
//
//        BaseURLs.goToCustomerSiteURL();
//        // Verify that correct URL, alarm.com opens.
//        String myURL = home.getUrl();
//        // System.out.println("URL = " + myURL);
//        Assert.assertEquals(myURL, "https://international.alarm.com/adc/", "Verified that the correct page was shown, by URL");
//        System.out.println("STEP 1 - Passed - correct URL (ALARM HOME PAGE): " + myURL + " opens");
//
//        //click on Sign In button
//        home.clickSignIn();
//        myURL = login.getUrl();
//        Assert.assertEquals(myURL, "https://www.alarm.com/login.aspx", "Verified that the correct LogIn page was shown, by URL");
//        System.out.println("STEP 2 - Passed - correct URL(SIGN IN): " + myURL + " opens");
//
//        //Step: Login to customer site
//        //Expected Result: Verify logged into customer site
//        login.signInWithCredentials();
//        String customerSiteName = (customer.customerName());
//        Assert.assertEquals(customerSiteName, "PM360R_243D17", "Verified that the correct customer page opens, by cuatomer name ");
//        System.out.println("STEP 3 - Passed - correct Customer account LOGGED IN: " + customerSiteName + " opens");
//
//        //Step: Navigate to Settings --> Login Information
//        //Expected Result: Verify page loads
//
//        settings.selectSettings();
//        By headerNameBy = settings.pageHeaderName();
//        String headerName = home.pageHeaderName(headerNameBy);
//        Assert.assertEquals(headerName, "Settings", "Verified that the correct  page opens, by page header ");
//        System.out.println("STEP 4 - Passed - correct page: " + headerName + " opens");
//
//        settings.selectLoginInfo();
//        headerNameBy = loginInformation.pageHeaderName();
//        headerName = home.pageHeaderName(headerNameBy);
//
//        Assert.assertEquals(headerName, "Login Information", "Verified that the correct  page opens, by page header ");
//        System.out.println("STEP 5 - Passed - correct page: " + headerName + " opens");
//
//        //Step: Look at options under “Login Information”
//        // Expected Result: Verify “Site Appearance” is listed as an option
//
//        String optionsToFind = loginInformation.optionsText("siteApperanceXPath");
//        Assert.assertEquals(optionsToFind, "Site Appearance", "Verified that Site Appearance option is available ");
//        System.out.println("STEP 6 - Passed - Correct option is available on the page: " + optionsToFind);
//
//
//
//    }
//
//    @Test
//    public void darkModeToogle() {
//
//        System.out.println("\n");
//        System.out.println("TEST CASE: CX-T1556 (1.0)Dark Mode: Toggling Dark Mode ON/OFF (Functional)");
//
//        //STEP 1:  Login to customer site
//        // Expected Result: Verify logged into customer site
//
//        BaseURLs.goToCustomerSiteURL();
//        home.clickSignIn();
//        login.signInWithCredentials();
//        String customerSiteName = (customer.customerName());
//        Assert.assertEquals(customerSiteName, "PM360R_243D17", "Verified that the correct customer page opens, by cuatomer name ");
//        System.out.println("STEP 1 - Passed - correct Customer account LOGGED IN: " + customerSiteName + " opens");
//
//
//        //STEP 2:  Click Settings in left nav menu
//        //Expected Result: Verify Settings page loads
//
//        settings.selectSettings();
//        By headerNameBy = settings.pageHeaderName();
//        String headerName = home.pageHeaderName(headerNameBy);
//        Assert.assertEquals(headerName, "Settings", "Verified that the correct  page opens, by page header ");
//        System.out.println("STEP 2 - Passed - correct page: " + headerName + " opens");
//
//        //STEP 3:  Click “Login Information” and then click “Site Appearance”
//        //Expected Result: Verify Site Appearance page loads and displays 2 toggle buttons (one for dark mode and one for high contrast)
//
//        settings.selectLoginInfo();
//        loginInformation.selectSiteAppearance();
//        headerNameBy = siteAppearance.pageHeaderName();
//        headerName = home.pageHeaderName(headerNameBy);
//
//        Assert.assertEquals(headerName, "Site Appearance", "Verified that the correct  page opens, by page header ");
//        System.out.println("STEP 3.1 - Passed - correct page: " + headerName + " opens");
//
//       // and displays 2 toggle buttons (one for dark mode and one for high contrast)
//
//        String attribute = siteAppearance.returnAttributeDarkMode("type");
//        Assert.assertEquals(attribute, "checkbox", "Verified that there is a toogle button for Dark Mode, by getDomAttribute ");
//        System.out.println("STEP 3.2 - Passed - there is a toogle button for Dark Mode ");
//
//        attribute = siteAppearance.returnAttributeContrast();
//        Assert.assertEquals(attribute, "checkbox", "Verified that there is a toogle button for High Contrast, by getDomAttribute ");
//        System.out.println("STEP 3.3 - Passed - there is a toogle button for High Contrast ");
//
//        //STEP 4: Step Click toggle for Dark Mode to on/enabled
//        //Expected Result: Verify toggle UI change (should turn blue)
//
//        siteAppearance.darkModeClick();
//        attribute = siteAppearance.returnAttributeDarkMode("data-checked");
//        Assert.assertEquals(attribute, "true", "Verified that the toogle button for dark Mode is ON/ENABLED, by getDomAttribute ");
//        System.out.println("STEP 4 - Passed - The toogle button for DARK MODE is ON/ENABLED");
//
//        System.out.println("DON'T KNOW HOW TO SEE IF IT IS BLUE");
//
//        //STEP5:  Click toggle for Dark Mode to off/disabled
//        //Expected Result: Verify toggle UI change (color should change to black)
//
//        siteAppearance.darkModeClick();
//        attribute = siteAppearance.returnAttributeDarkMode("data-checked");
//        Assert.assertEquals(attribute, "false", "Verified that the toogle button for dark Mode is OFF/DISABLED, by getDomAttribute ");
//        System.out.println("STEP 5 - Passed - The toogle button for DARK MODE is OFF/DISABLED");
//
//        System.out.println("DON'T KNOW HOW TO SEE IF IT IS black");
//
//    }

    @Test
    public void dealer() {
        System.out.println("\n");
        System.out.println("TEST CASE: CX-T1556 (1.0)Dark Mode: Toggling Dark Mode ON/OFF (Functional)");

        //STEP 1:  Login to customer site
        // Expected Result: Verify logged into customer site

        BaseURLs.goToCustomerSiteURL();
        home.clickSignIn();
        login.signInWithCredentials();
        String customerSiteName = (customer.customerName());
        Assert.assertEquals(customerSiteName, "PM360R_243D17", "Verified that the correct customer page opens, by cuatomer name ");
        System.out.println("STEP 1 - Passed - correct Customer account LOGGED IN: " + customerSiteName + " opens");


       // STEP 2: Go to “Settings” and click “Login Information”
      //  Expected Result: Verify page loads

       // settings.selectSettings();
        customer.selectSettings();
        settings.selectLoginInfo();
        By headerNameBy = loginInformation.pageHeaderName();
        String headerName = home.pageHeaderName(headerNameBy);

        Assert.assertEquals(headerName, "Login Information", "Verified that the correct  page opens, by page header ");
        System.out.println("STEP 2 - Passed - correct page: " + headerName + " opens");

//        STEP 3: Click “Site Appearance”
//        Expected Result: Verify page loads

        loginInformation.selectSiteAppearance();
        headerNameBy = siteAppearance.pageHeaderName();
        headerName = home.pageHeaderName(headerNameBy);
        Assert.assertEquals(headerName, "Site Appearance", "Verified that the correct  page opens, by page header ");
        System.out.println("STEP 3 - Passed - correct page: " + headerName + " opens");


//        STEP 4: Click Toggle for Dark mode to ON
//        Expected Result: Verify toggle UI change (should change to blue)
        siteAppearance.darkModeClick();
        String attribute = siteAppearance.returnAttributeDarkMode("data-checked");
        Assert.assertEquals(attribute, "true", "Verified that the toogle button for dark Mode is ON/ENABLED, by getDomAttribute ");
        System.out.println("STEP 4 - Passed - The toogle button for DARK MODE is ON/ENABLED");

        System.out.println("DON'T KNOW HOW TO SEE IF IT IS BLUE");

//        STEP 5: Click Save
//        Expected Result: Verify UI confirms setting has been saved

        siteAppearance.saveClick();
        String notificationText = siteAppearance.returnNotificationSave();
        Assert.assertEquals(notificationText, "Your preferences have been updated.", "Verified that the DarkMode toogle change is Saved. Verified the Notification text");
        System.out.println("STEP 5 - Passed - The notification for saving the DarkMode toogle is correct: "+ notificationText );

//        STEP 6: Navigate back to home screen
//        Expected Result: Verify dark mode is applied

         customer.selectHome();
         String colorTheme = customer.colorTheme();
         Assert.assertEquals(colorTheme, "dark", "Verified that the DarkMode is applied, by checking color-scheme");
         System.out.println("STEP 6 - Passed - The dark Mode is applied ");


//        STEP 7: Refresh page
//        Expected Result: Verify dark mode is still applied

        customer.refreshApp();
        Assert.assertEquals(customer.colorTheme(), "dark", "Verified that the DarkMode is still applied after Refresh, by checking color-scheme");
        System.out.println("STEP 6 - Passed - The dark Mode is still applied after Refresh");

//        STEP 8: Repeat for Dark + High contrast mode
//        Expected Result: Verify dark + high contrast mode remains applied after saving and refreshing the page

        //   STEP 8.1 Click Toggle for High Contrast to ON
//        Expected Result: Verify toggle UI change (should change to blue)

        // settings.selectSettings();
        customer.selectSettings();
        settings.selectLoginInfo();
        loginInformation.selectSiteAppearance();


        siteAppearance.contrastClick();
        attribute = siteAppearance.returnAttributeContrast("data-checked");
        Assert.assertEquals(attribute, "true", "Verified that the toogle button forHigh Contrast is ON/ENABLED, by getDomAttribute ");
        System.out.println("STEP 8.1 - Passed - The toogle button for High Contrast is ON/ENABLED");

        System.out.println("DON'T KNOW HOW TO SEE IF IT IS BLUE");

//        STEP 8.2: Click Save
//        Expected Result: Verify UI confirms setting has been saved

        siteAppearance.saveClick();
        notificationText = siteAppearance.returnNotificationSave();
        Assert.assertEquals(notificationText, "Your preferences have been updated.", "Verified that the High Contrast toogle change is Saved. Verified the Notification text");
        System.out.println("STEP 8.2 - Passed - The notification for saving the High Contrast toogle is correct: "+ notificationText );

//        STEP 8.3: Navigate back to home screen
//        Expected Result: Verify High Contrast is applied

        customer.selectHome();
        System.out.println("NEED to check High CONTRAST");
//        String colorTheme = customer.colorTheme();
//        Assert.assertEquals(colorTheme, "dark", "Verified that the DarkMode is applied, by checking color-scheme");
//        System.out.println("STEP 8.3 - Passed - The dark Mode is applied ");


//        STEP 8.4: Refresh page
//        Expected Result: Verify High Contrast is still applied

        customer.refreshApp();
//        Assert.assertEquals(customer.colorTheme(), "dark", "Verified that the DarkMode is still applied after Refresh, by checking color-scheme");
//        System.out.println("STEP 6 - Passed - The dark Mode is still applied after Refresh");
        System.out.println("NEED to check High CONTRAST");


    }
}
