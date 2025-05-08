package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class HW_01_emag {

    public static void main (String[] args) {


        System.out.println("STARTTTTTTTTTTTTTTTTTT");


        //System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");

        System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://emag.ro");

        //asserts

        String actualTitle = driver.getTitle();
        String expectedTitle = "eMAG.ro - Căutarea nu se oprește niciodată";
        assertEquals(actualTitle, expectedTitle, "Verific ca sunt pe partea de start emag"); // doar daca nu e ok

        System.out.println("ASSERT OK");
        String expectedTitle1 = "eMAG.ă";
       // assertEquals(actualTitle, expectedTitle1, "nu sunt pe emag"); // doar daca nu e ok);

        //System.out.println("ASSERT upsssss");

        //  WebElement firstNameField = driver.findElement(By.id("firstname"));
        WebElement searchField = driver.findElement(By.id("searchboxTrigger"));
        searchField.sendKeys("aspiratoare");

        //searchField.click();
        searchField.submit();
      //  searchField.sendKeys(Keys.RETURN);

       // Așteaptă pentru rezultate
      driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        // XPATH - search for aspiratoare
        List<WebElement> aspirators = driver.findElements(By.xpath("//div[@class='card-item card-standard js-product-data js-card-clickable']/a"));


       // WebElement productCard = driver.findElement(By.xpath("//div[@class='card-item card-standard js-product-data js-card-clickable ' and @data-product-id='3300004']"));
       //  WebElement productCard = driver.findElement(By.xpath("//div[@class='card-item card-standard js-product-data js-card-clickable ' and @data-product-id='3300004']"));
        WebElement productCard = driver.findElement(By.xpath("//div[@class = 'card-item card-standard js-product-data js-card-clickable '][3]"));
        productCard.click();
        //Initializing the web element via the By.className locator strategy
     //   WebElement element = driver.findElement(By.className("card_grid.js-products-container card-collection list-view-updated show-me-a-grid"));
//Verifying that element was found (!null) and printing a message
        if (productCard != null)
            System.out.println("Element found by className");
//Closing

      WebElement addToCart = driver.findElement(By.xpath("//div[@class='flex-shrink-1 flex-grow-1']"));
        addToCart.click();
      /* try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
           e.printStackTrace();
       }

*/
       // WebElement viewCartFromAlert = driver.findElement(By.xpath("//div[@class='table-cell col-xs-12 col-sm-2 col-md-2 d-none d-md-table-cell']"));
        WebElement viewCartFromAlert = driver.findElement(By.xpath("//a[@data-dismiss = 'modal']"));

        viewCartFromAlert.click();
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement favButton = driver.findElement(By.id("my_wishlist"));
        favButton.click();

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement cosulMeu = driver.findElement(By.id("my_cart"));
        cosulMeu.click();
        System.out.println("before FIND");

        WebElement stergeElement = driver.findElement(By.xpath("//div[@class='line-item line-item-footer d-none d-md-block']/div[@class='mb-1']/button[@class='btn btn-link outline-0 fs-12 fs-md-14 btn-remove-product gtm_rp080219 remove-product']"));

        //WebElement stergeElement = driver.findElement(By.xpath("/div[@class='line-item line-item-footer d-md-none']/div[@class='mb-1']/button[normalize-space(text())='Sterge']"));



       // WebElement stergeElement = driver.findElement(By.xpath("//div[@class='line-item line-item-footer d-none d-md-block']//button[@class='btn btn-link outline-0 fs-12 fs-md-14 btn-remove-product gtm_rp080219 remove-product'][normalize-space()='Sterge']"));


        System.out.println("AFTER FIND, BEFORE CLICK");


       // WebElement stergeElement = driver.findElement(By.linkText("Sterge"));
        stergeElement.click();




        System.out.println("CLICKL????");









    }
}
