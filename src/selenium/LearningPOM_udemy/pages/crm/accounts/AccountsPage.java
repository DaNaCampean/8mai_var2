package selenium.LearningPOM_udemy.pages.crm.accounts;

import org.openqa.selenium.By;
import selenium.LearningPOM_udemy.basePackage.Page;
import selenium.LearningPOM_udemy.basePackage.TopMenu;


public class AccountsPage extends Page {
	
	

	
	public CreateAccountPage  gotoCreateAccounts(){
		//era void
		System.out.println("create account from accountPage class");

		driver.findElement(By.xpath(" //button[normalize-space()='Create Account']")).click();

		// menu.signOut(); - accesam asta din topMenu
		return new CreateAccountPage();

	}
	
	
	public void gotoImportAccounts(){
		
		
	}

}

