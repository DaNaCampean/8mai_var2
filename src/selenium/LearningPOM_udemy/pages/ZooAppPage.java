package selenium.LearningPOM_udemy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.LearningPOM_udemy.basePackage.Page;
import selenium.LearningPOM_udemy.pages.crm.CRMHomePage;

public class ZooAppPage extends Page {

  //  WebDriver driver; // REMOVE THIS CAND FACEM EXTENDS

    // REMOVE THIS CAND FACEM EXTENDS
    /*public ZooAppPage(WebDriver driver){
        this.driver = driver;
    }

     */

    public void  goToChat(){
        System.out.println("Chat");

    }

    public CRMHomePage goToCRM(){
        //AICI ERA VOID
        System.out.println("CRM");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //driver.findElement(By.xpath("//div[@class='app-nm' and text()='CRM']")).click();
       WebElement crm =  driver.findElement(By.xpath(" //div[@class='tc']/a/div[text()='CRM']"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        crm.click();


        return new CRMHomePage();
    }

    public void gotoSales(){
        System.out.println("SALES");
    }

}
