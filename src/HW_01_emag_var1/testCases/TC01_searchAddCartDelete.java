package HW_01_emag_var1.testCases;

import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

//import pages package
import HW_01_emag_var1.pages.HomePage;
import HW_01_emag_var1.BrowserSetup.ChromeSetup;
import HW_01_emag_var1.pages.SearchResultsPage;
import HW_01_emag_var1.pages.ProductDetailsPage;
import HW_01_emag_var1.pages.CosulMeuPage;

public class TC01_searchAddCartDelete {

    // methode for assert
    public static void verificationAssert(String actualResult, String expectedResult, String verifText){
        assertEquals(actualResult, expectedResult, verifText);
    }

    public static void main(String[] args) {

        // Create object of BrowserSetup
        ChromeSetup browserSetup = new ChromeSetup();

        WebDriver driver;

         driver = browserSetup.driverSetupMac(); // call Mac setup
        //driver = browserSetup.driverSetupWindows(); //call Windows setup

        driver.get("https://emag.ro");

        // Create object of Home page
        HomePage home = new HomePage(driver);

        System.out.print("CHECK that EMAG opens ok, by Title - ");
        verificationAssert(home.getTitle(), "eMAG.ro - Căutarea nu se oprește niciodată", "Verific ca sunt pe partea de start emag"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - landing page EMAG opens correctly");

        //search for aspiratoare

        //Create object of SearchResultsPage
        SearchResultsPage search = new SearchResultsPage(driver);

        // search for aspiratoare and submit
        search.searchTextField("aspiratoare");

        //assert - Check that search results is correct
        System.out.print("CHECK that search by aspiratoare page is correct. I used URL verification - ");
        verificationAssert(driver.getCurrentUrl(), "https://www.emag.ro/search/aspiratoare", "The URL for searching results is not correct"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - search results page is displayed");

        // Așteaptă pentru rezultate - daca nu pun asta.... nu imi gaseste urmatorul XPath
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // get data for assert - aspirator name from search page
        String dataName = search.returnDataName();
        // select the 3rd aspirator
        search.selectProduct();

        //Create object of ProductDetailsPage
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
        String productName = productDetailsPage.productGetText();

        System.out.print("CHECK that the 3rd aspirator details page opens - ");
        verificationAssert(productName,dataName, "The page opened is not correct"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - correct page is displayed");

        //Create object of CosulMeuPage
        CosulMeuPage cosulMeu = new CosulMeuPage(driver);

        //Adauga produsul in cos din details page
        cosulMeu.addToCartClick();


        // NOTA: Daca nu pun acest sleep, nu imi poate citi textul pentru assert, getText. Imi apare valoarea "" / empty string
        //NOTA 2: presimt ca acest sleep ar trebui adaugat in pages undeva, dar nu imi dau seama unde...poate ar fi trebuit in loc
        // de BrowserSetup package sa ii spun altfel, unde sa am chestii extra...


        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




        //assert - Check that "Add to Cart " worked by verifying that "Produsul a fost adaugat in cos" text appears on the alert
        System.out.print("CHECK that the product was added to cart - ");
        verificationAssert(cosulMeu.confirmationText(), "Produsul a fost adaugat in cos", "Produsul a fost adaugat in cos text is not correct or displayed"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - The product was added to cart.");
        cosulMeu.viewCartFromAlert();


        //assert - Check that "Cosul meu" page opens.
        System.out.print("CHECK that the Cosul meu page opens (opened from Alert) - ");
        verificationAssert(cosulMeu.viewCosulMeuHeaderText(), "Coșul meu", "Cosul meu text is not correct or displayed"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - The cart opens.");

        //assert - Check that "Cosul meu" page opens from View Cart Menu - top right
        cosulMeu.clickCosulMeuMenu();
        System.out.print("CHECK that the Cosul meu page opens (opened from the menu) - ");

        verificationAssert(cosulMeu.viewCosulMeuHeaderText(), "Coșul meu", "Cosul meu text is not correct or displayed"); // doar daca nu e ok apare acest mesaj

        System.out.println("PASSED - The cart opens.");


        cosulMeu.deleteProduct(); //am localizat butonul sterge + produs sters



        System.out.print("CHECK that the Cosul meu nu mai contine nici un produs - ");
        String searchedTextPartial = "Cosul tau de cumparaturi nu contine produse.";
        boolean verifyText = cosulMeu.deletedMessageText().contains(searchedTextPartial);
        assertTrue(verifyText, "Produsul nu a fost corect sters; nu gasim mesajul Cosul tau de cumparaturi nu contine produse");
        System.out.println("PASSED - The product was correctly deleted.");


        driver.close();


    }
}




