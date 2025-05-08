package HW_01_emag_var1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage {

    WebDriver driver;

    //Constructor
    public ProductDetailsPage(WebDriver driver) {

        this.driver=driver;
    }

    //Locator
    By productDetailsXpATH = By.xpath("//h1[@class='page-title']");

    public String productGetText(){
       WebElement productDetails = driver.findElement(productDetailsXpATH);
        return productDetails.getText();
    }
}