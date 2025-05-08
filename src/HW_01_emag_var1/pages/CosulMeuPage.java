package HW_01_emag_var1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CosulMeuPage {

     WebDriver driver;

    //constructor
     public CosulMeuPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locator for Add to cart from produc details page
    By addToCartXPath = By.xpath("//div[@class='flex-shrink-1 flex-grow-1']");

    //Method for click on AddToCart button

    public void addToCartClick(){
        WebElement addToCart = driver.findElement(addToCartXPath);
        addToCart.click();
    }

    // Locator for view Cart button from Alert popup
    By viewCartXPath = By.xpath("//a[@data-dismiss = 'modal']");

    // Method for viewCartFromAlert

    public void viewCartFromAlert (){
        WebElement viewCartFromAlert = driver.findElement(viewCartXPath); //XPath for "Vezi detalii cos" button
        viewCartFromAlert.click(); //press "Vezi detalii cos button. "cosul" meu page opens ( opened from Alert)
    }

    // Locator for confirmation text
    By confirmationXPath = By.xpath("//span[@class='d-none d-sm-block']"); //search for confirmation text

    //method for reading the text from the page: "Produsul a fost adaugat in cos"
    public String confirmationText (){
       WebElement addToCartConfirmation = driver.findElement(confirmationXPath);
       return addToCartConfirmation.getText();
    }

    //Locator for CosulMeu text
    By cosulMeuTextXPath = By.xpath("//h1[text()='Coșul meu']");

    public String viewCosulMeuHeaderText (){
        WebElement cosulMeuText = driver.findElement(cosulMeuTextXPath);
        return cosulMeuText.getText();
    }

    //lOCATOR FOR Cosul meu button from the menu - right top
    By cosulMeuMenu = By.id("my_cart");

    public void clickCosulMeuMenu (){
        WebElement cosulMeu = driver.findElement(cosulMeuMenu);
         cosulMeu.click(); //press "Cosul meu button. "cosul" meu page opens ( opened from the menu)
    }

    //Locator for delete product
    By deleteProductXPath = By.xpath("//div[@class='line-item line-item-footer d-none d-md-block']/div[@class='mb-1']/button[@class='btn btn-link outline-0 fs-12 fs-md-14 btn-remove-product gtm_rp080219 remove-product']");
//am localizat butonul sterge

    public void deleteProduct () {
        WebElement stergeElement = driver.findElement(deleteProductXPath);
        stergeElement.click(); //produs sters
    }

    By deletedMessageXPath = By.xpath("//p[@class='mb-0']"); //search for textul: Cosul tau de cumparaturi nu contine produse.

    public String deletedMessageText (){
        WebElement deletedMessage = driver.findElement(deletedMessageXPath);
        return deletedMessage.getText();
    }
}



