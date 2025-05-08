package HW_01_emag_var1.pages;

import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    //Constructor
    public HomePage(WebDriver driver) {

        this.driver=driver;
    }

    public String getTitle(){
        // get EMAG title
        return driver.getTitle();
    }






}
