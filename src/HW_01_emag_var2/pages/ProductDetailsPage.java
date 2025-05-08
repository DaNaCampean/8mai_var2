package HW_01_emag_var2.pages;

import HW_01_emag_var2.base.BasePage_driver_browser_init;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage extends BasePage_driver_browser_init {

    //Locator
    By productDetailsXpATH = By.xpath("//h1[@class='page-title']");

    public String productGetText(){
        WebElement productDetails = driver.findElement(productDetailsXpATH);
        return productDetails.getText();
    }



}