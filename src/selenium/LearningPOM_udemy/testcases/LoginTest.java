package selenium.LearningPOM_udemy.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.LearningPOM_udemy.basePackage.Page;
import selenium.LearningPOM_udemy.pages.HomePage;
import selenium.LearningPOM_udemy.pages.LoginPage;
import selenium.LearningPOM_udemy.pages.ZooAppPage;
import selenium.LearningPOM_udemy.pages.crm.accounts.AccountsPage;
import selenium.LearningPOM_udemy.pages.crm.accounts.CreateAccountPage;

public class LoginTest extends BaseTest {

    @Test
    public  void loginTest(){

        HomePage home = new HomePage();
        LoginPage lp = home.goToLogIn();
        lp.doLogin("dana.campean@yahoo.com", "Softvision@10");
        ZooAppPage zp = new ZooAppPage();
       zp.goToCRM();
      AccountsPage account = Page.menu.gotoAccounts();
       CreateAccountPage cap = account.gotoCreateAccounts();
        cap.createAccount("Dana");
       // Assert.fail("Create account test fail");

    }

    /*

    @Test
    public void createAccountTest(){
        ZooAppPage zp = new ZooAppPage();
        zp.goToCRM();
        AccountsPage account = Page.menu.gotoAccounts();
        CreateAccountPage cap = account.gotoCreateAccounts();
        cap.createAccount("Dana");
    }

     */



}

