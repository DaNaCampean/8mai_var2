package HW_01_emag_var2.pages;

import HW_01_emag_var2.base.BasePage_driver_browser_init;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CosulMeuPage extends BasePage_driver_browser_init {

    //Locator for Add to cart from produc details page
    //  By addToCartXPath = By.xpath("//div[@class='flex-shrink-1 flex-grow-1']");

    By addToCartXPath = By.xpath("//div[@class='flex-shrink-1 flex-grow-1']//button[@type='submit']");

    // Locator for view Cart button from Alert popup
    By viewCartXPath = By.xpath("//a[@data-dismiss = 'modal']");

    // Locator for confirmation text
    By confirmationXPath = By.xpath("//span[@class='d-none d-sm-block']"); //search for confirmation text

    //Locator for CosulMeu text
    By cosulMeuTextXPath = By.xpath("//h1[text()='Coșul meu']");

    //lOCATOR FOR Cosul meu button from the menu - right top
    By cosulMeuMenu = By.id("my_cart");

    //Locator for delete product
    By deleteProductXPath = By.xpath("//div[@class='line-item line-item-footer d-none d-md-block']/div[@class='mb-1']/button[@class='btn btn-link outline-0 fs-12 fs-md-14 btn-remove-product gtm_rp080219 remove-product']");
    //am localizat butonul sterge

    By deletedMessageXPath = By.xpath("//p[@class='mb-0']"); //search for textul: Cosul tau de cumparaturi nu contine produse.


    //Method for click on AddToCart button

    public void addToCartClick(){

        WebElement addCart = driver.findElement(addToCartXPath);
        addCart.click();
    }

    // Method for viewCartFromAlert

    public void viewCartFromAlert (){
        WebElement viewCartFromAlert = driver.findElement(viewCartXPath); //XPath for "Vezi detalii cos" button
        viewCartFromAlert.click(); //press "Vezi detalii cos button. "cosul" meu page opens ( opened from Alert)
    }



    //method for reading the text from the page: "Produsul a fost adaugat in cos"
    public String confirmationText (){
        WebElement addToCartConfirmation = driver.findElement(confirmationXPath);
        return addToCartConfirmation.getText();
    }



    public String viewCosulMeuHeaderText (){
        WebElement cosulMeuText = driver.findElement(cosulMeuTextXPath);
        return cosulMeuText.getText();
    }



    public void clickCosulMeuMenu (){
        WebElement cosulMeu = driver.findElement(cosulMeuMenu);
        cosulMeu.click(); //press "Cosul meu button. "cosul" meu page opens ( opened from the menu)
    }



    public void deleteProduct () {
        WebElement stergeElement = driver.findElement(deleteProductXPath);
        stergeElement.click(); //produs sters
    }



    public String deletedMessageText (){
        WebElement deletedMessage = driver.findElement(deletedMessageXPath);
        return deletedMessage.getText();
    }
}