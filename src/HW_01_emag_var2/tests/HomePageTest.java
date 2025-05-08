package HW_01_emag_var2.tests;

import HW_01_emag_var2.base.BasePage_driver_browser_init;
import HW_01_emag_var2.pages.HomePage;
import HW_01_emag_var2.pages.CosulMeuPage;
import HW_01_emag_var2.pages.ProductDetailsPage;
import HW_01_emag_var2.pages.SearchResultsPage;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomePageTest extends BaseTests {


    //  private HomePage home;
    //private SearchResultsPage search;
    //private ProductDetailsPage productDetailsPage;
    //private CosulMeuPage cosulMeu;


  /*  @BeforeTest
    public void createObjects(){
        home = new HomePage();
        //Create object of SearchResultsPage
        search = new SearchResultsPage();
        productDetailsPage = new ProductDetailsPage();
        cosulMeu = new CosulMeuPage();
        BasePage_driver_browser_init.waitResults();

    }
    */




    @Test
    public  void checkTitle(){
        //  HomePage home = new HomePage();
        System.out.print("CHECK that EMAG opens ok, by Title - ");
        assertEquals(home.getTitle(), "eMAG.ro - Căutarea nu se oprește niciodată", "Verific ca sunt pe partea de start emag"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - landing page EMAG opens correctly");
    }

    //test

    @Test
    public void searchAspiratoare(){
        //search for aspiratoare

        // search for aspiratoare and submit
        search.searchTextField("aspiratoare");

        //assert - Check that search results is correct
        System.out.print("CHECK that search by aspiratoare page is correct. I used URL verification - ");
        assertEquals(search.getCurrentURL(), "https://www.emag.ro/search/aspiratoare", "The URL for searching results is not correct"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - search results page is displayed");

    }

    @Test
    public void selectAspirator() {
        // Așteaptă pentru rezultate - daca nu pun asta.... nu imi gaseste urmatorul XPath
        BasePage_driver_browser_init.waitResults();


        // get data for assert - aspirator name from search page
        String dataName = search.returnDataName();
        // select the 3rd aspirator
        search.selectProduct();


        String productName = productDetailsPage.productGetText();

        System.out.print("CHECK that the 3rd aspirator details page opens - ");
        assertEquals(productName, dataName, "The page opened is not correct"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - correct page is displayed");

        cosulMeu.addToCartClick();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //assert - Check that "Add to Cart " worked by verifying that "Produsul a fost adaugat in cos" text appears on the alert
        System.out.print("CHECK that the product was added to cart - ");
        assertEquals(cosulMeu.confirmationText(), "Produsul a fost adaugat in cos", "Produsul a fost adaugat in cos text is not correct or displayed"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - The product was added to cart.");
        cosulMeu.viewCartFromAlert();
        //assert - Check that "Cosul meu" page opens.
        System.out.print("CHECK that the Cosul meu page opens (opened from Alert) - ");
        assertEquals(cosulMeu.viewCosulMeuHeaderText(), "Coșul meu", "Cosul meu text is not correct or displayed"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - The cart opens.");

        //assert - Check that "Cosul meu" page opens from View Cart Menu - top right
        cosulMeu.clickCosulMeuMenu();
        System.out.print("CHECK that the Cosul meu page opens (opened from the menu) - ");
        assertEquals(cosulMeu.viewCosulMeuHeaderText(), "Coșul meu", "Cosul meu text is not correct or displayed"); // doar daca nu e ok apare acest mesaj
        System.out.println("PASSED - The cart opens.");

        cosulMeu.deleteProduct(); //am localizat butonul sterge + produs sters
        System.out.print("CHECK that the Cosul meu nu mai contine nici un produs - ");
        String searchedTextPartial = "Cosul tau de cumparaturi nu contine produse.";
        boolean verifyText = cosulMeu.deletedMessageText().contains(searchedTextPartial);
        assertTrue(verifyText, "Produsul nu a fost corect sters; nu gasim mesajul Cosul tau de cumparaturi nu contine produse");
        System.out.println("PASSED - The product was correctly deleted.");
    }






}