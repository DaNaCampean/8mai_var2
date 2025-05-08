package selenium;

/*

1. https://www.hotwire.com/
2. Flights
3. From LAX
4. To Bucharest Otopeni
5. From date - 7 days from today
6. To date - 14 days from today
7. 2 adults

 */


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class HW_02_Flights {

    public static void main(String[] args) {




      //System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");
     System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");


      //  ChromeOptions options = new ChromeOptions();
     //   options.addArguments("--disable-search-engine-choice-screen");

//WebDriver driver = new ChromeDriver(options);
      WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.hotwire.com/");

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement flightsClick = driver.findElement(By.xpath("//div[@data-bdd = 'farefinder-option-flights' and @class = 'farefinder-option inactive']"));
      //  flightsClick.click();
     // flightsClick.click();

        // Instantiate the Actions class
        Actions actions = new Actions(driver);

        // Perform double-click
        actions.doubleClick(flightsClick).perform();

       // "--disable-search-engine-choice-screen"

        WebElement searchField = driver.findElement(By.xpath("//input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis']"));
        searchField.sendKeys("LAX");

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        searchField.sendKeys(Keys.RETURN);

        String text = searchField.getText();
        System.out.println("Textul de la FROM ESTE: "+ searchField.getText());
        searchField.clear();

        WebElement searchLAX = driver.findElement(By.xpath("//div[@class='col-xs-12 margin-top-4']/div[@class='location-typeahead']/div[@class='hw-form-group form-group floating-label empty has-icon']/input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis']"));
        searchLAX.sendKeys("dana");

        WebElement searchLAX2 = driver.findElement(By.xpath("//div[@class='col-xs-12 margin-top-4']/div[@class='location-typeahead']/div[@class='hw-form-group form-group floating-label empty has-icon']/input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis']"));

        searchLAX2.sendKeys("dana2222");

        searchField.sendKeys("non empty add new");

        //putem cauta searchurile.... cu text, sau xpart cu startWith.... pe ideea ca sunt dinamice


       // WebElement searchTO_nonEmpty = driver.findElement(By.cssSelector("div.hw-form-group input[placeholder='Destination city or airport']"));
        //varianta simpla: "input[placeholder='Destination city or airport']");
//        searchTO_nonEmpty.sendKeys("non empty DANAA");

        //asta :dD::D MERGEEEE
        // //div[@class='col-xs-12 margin-top-4']/div[@class='location-typeahead']/div[starts-with(@class, 'hw-form-group form-group floating-label')]
        //-------
      //  <input class="form-control hw-input hw-input-icon type__400__regular text-ellipsis" aria-invalid="false" aria-label="" placeholder="Origin city or airport" data-bdd="farefinder-flight-origin-input" id="" type="text" autocomplete="#$%^@#$$#" value="Los Angeles, CA, United States of America (LAX-Los Angeles Intl.)" data-gtm-form-interact-field-id="0">

            //    <div class=""


       // value="Los Angeles, CA, United States of America (LAX-Los Angeles Intl.)"

       // <input class="form-control hw-input hw-input-icon type__400__regular text-ellipsis" aria-invalid="false" aria-label="" placeholder="Destination city or airport" data-bdd="farefinder-flight-destination-input" id="" type="text" autocomplete="#$%^@#$$#" value="Asdal Church, Hirtshals, Nordjylland, Denmark" data-gtm-form-interact-field-id="1">


        //div[@class='col-xs-12 margin-top-4']/div[@class='location-typeahead']/div[starts-with(@class,'hw-form-group form-group floating-label not-empty has-icon has-feedback')]


            }
}
