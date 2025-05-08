package selenium.LearningPOM_udemy.testcases;

import org.testng.annotations.Test;
import selenium.LearningPOM_udemy.basePackage.Page;
import selenium.LearningPOM_udemy.pages.ZooAppPage;
import selenium.LearningPOM_udemy.pages.crm.accounts.AccountsPage;
import selenium.LearningPOM_udemy.pages.crm.accounts.CreateAccountPage;

public class CreateAccountTest {

    @Test
    public void createAccountTest(){
        ZooAppPage zp = new ZooAppPage();
        zp.goToCRM();
        AccountsPage account = Page.menu.gotoAccounts();
        CreateAccountPage cap = account.gotoCreateAccounts();
        cap.createAccount("Dana");
    }
}
