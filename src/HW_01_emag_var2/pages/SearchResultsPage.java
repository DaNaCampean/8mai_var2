package HW_01_emag_var2.pages;
import HW_01_emag_var2.base.BasePage_driver_browser_init;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchResultsPage extends BasePage_driver_browser_init {

    //selectors section

    //Locator for search textField
    By searchTextFieldById = By.id("searchboxTrigger");

    // XPath for selecting the 3rd aspirator
    By productCardByXPath = By.xpath("//div[@class = 'card-item card-standard js-product-data js-card-clickable '][2]");

    //xPath for aspirator details page to be used for assert
    By productDetailsXPath = By.xpath(" //h1[@class='page-title']");


    //Method to enter search text

    public void searchTextField (String searchText){
        WebElement searchField = driver.findElement(searchTextFieldById);
        searchField.sendKeys(searchText);
        searchField.submit();
    }

    //method for getting current URL for asserts
    public String getCurrentURL(){
        // get EMAG page URL
        return driver.getCurrentUrl();
    }

    // method for getting data for assert - aspirator name from search page
    public String returnDataName () {
        WebElement product = driver.findElement(productCardByXPath);
        return product.getAttribute("data-name");

    }

    //method for selecting the 3rd aspirator
    public void selectProduct (){
        WebElement product = driver.findElement(productCardByXPath);
        product.click(); // select the 3rd aspirator

        // Get  the value of the data-name attribute for the third apirator from search page

    }

    public String getProductTitle(){
        WebElement productTitle = driver.findElement(productDetailsXPath);
        // get product selected title
        return productTitle.getText();
    }


}