package selenium.LearningPOM_udemy.basePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import selenium.LearningPOM_udemy.pages.crm.accounts.AccountsPage;

public class TopMenu {

    /* encapsulation!!!!!!!!!

    means that top menu class will be encapsulated in all the pages classes where we have commom functionality like this.
     *
     * TopMenu IS A Page ???
     *
     * HomePage HAS A TopMenu
     * AccountsPAge HAS A TopMenu
     *
     * Page HAS A TopMenu
     *
     *
     */

    WebDriver driver;

    public TopMenu(WebDriver driver){
//constructor
        this.driver = driver;
    }

    public void gotoHome() {

    }

    public void gotoFeeds() {

    }

    public void gotoLeads() {

    }

    public AccountsPage gotoAccounts() {
// era void

        System.out.println("goto accounts from TopMenu page");
// cum putem accesa driverul??????
     //    Page.driver.findElement() - daca nu vrem asa.....atunci creeam driver aici sus si apoi creem un constructor
        //asa am creeat o referinta si va trebui folosit (driver) cand accesam top menu
              // pt ca am adaugat aici sus driver, putem acum folosi...    driver.findElement(... )

      // WebElement element =  driver.findElement(By.xpath("//span[text()='Accounts']"));
       driver.findElement(By.xpath("//div[@data-value='Accounts']")).click();

return new AccountsPage();

    }

    public void gotoContacts() {

    }


    public void signOut(){


    }

}


