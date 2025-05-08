package selenium.LearningPOM_udemy.pages.crm.accounts;


import org.openqa.selenium.By;
import selenium.LearningPOM_udemy.basePackage.Page;
import selenium.LearningPOM_udemy.basePackage.TopMenu;

public class CreateAccountPage  extends Page {


	public void createAccount(String accountName){
		System.out.println("CREATE ACCount from Create account page");


		driver.findElement(By.xpath("//input[@id='Crm_Accounts_ACCOUNTNAME_LInput']")).sendKeys(accountName);
		
	}

}


