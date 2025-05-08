package selenium.LearningPOM_udemy.pages;

import org.openqa.selenium.By;
import selenium.LearningPOM_udemy.basePackage.Page;

public class HomePage extends Page {



    // WebDriver driver; -REMOVE THIS CAND FACEM EXTENDS
// this driver was never initialized. dar cel de dincolo cu new chrome was initializat.
   // de acceea da erpare cu thi. ca e missing

    //contructor of the Home Page class

    /*
     -REMOVE THIS CAND FACEM EXTENDS

    public HomePage(WebDriver driver){
        this.driver = driver;
    }*/

    public void goToSupport(){
        driver.findElement(By.linkText("Sign Up")).click();

    }

    public void goToSignUp()
    {
        driver.findElement(By.linkText("Sign Up")).click();

    }

    public LoginPage goToLogIn(){
//this method should return an object of login page..
        //initial era void in loc de LoginPage
        driver.findElement(By.linkText("Sign In")).click();
        System.out.println("SignIn page");
        return new LoginPage();
    }


    public void goToZohoEdu(){

    }

    public void goToLearnMore(){

    }

    public void validateFooterLinks(){

    }




}
