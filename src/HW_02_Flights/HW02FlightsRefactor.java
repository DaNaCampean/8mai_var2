package HW_02_Flights;

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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;




public class HW02FlightsRefactor {


    public static void main(String[] args) throws InterruptedException {


      //  System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\campe\\Downloads\\Automation\\chromedriver-win64\\chromedriver.exe");


      //  ChromeOptions options = new ChromeOptions();
        //  options.addArguments("--disable-search-engine-choice-screen");
        // options.addArguments("--incognito");
        //  options.addArguments("--disable-application-cache");


        // Comment out headless for visibility
        //   options.addArguments("--headless");

      //  options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36");

      //  options.addArguments("--disable-blink-features=AutomationControlled"); //remove browser being controlled by automation.
      //  options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));// also related to prevent the browser is controled by automation
     //   options.setExperimentalOption("useAutomationExtension", false);// "remove" automation flag
     //   options.setCapability("acceptInsecureCerts", true);//accept insecure certificates


      //  WebDriver driver = new ChromeDriver(options);
     //   WebDriver driver = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();



        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.hotwire.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        //click on Flights tab - double click
        WebElement flightsClick = driver.findElement(By.xpath("//div[@data-bdd = 'farefinder-option-flights' and @class = 'farefinder-option inactive']"));


        // Instantiate the Actions class needed for double click
        Actions actions = new Actions(driver);

        // Perform double-click
        actions.doubleClick(flightsClick).perform();


        WebElement searchField = driver.findElement(By.xpath("//input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis']"));
        searchField.sendKeys("LAX");

        WebElement searchDropDown = driver.findElement(By.xpath("//ul[@class='dropdown-menu large']"));

        // todo: remove this
//        Select select = new Select(searchDropDown);
//        System.out.println(select.getOptions());
//        System.out.println(select.getAllSelectedOptions());
      //  Select mySelect = new Select(searchDropDown);

     //   System.out.println(searchDropDown.getText());
     //   System.out.println("de selectat = " + mySelect.getFirstSelectedOption().getText());
        searchField.click();


        String text = searchField.getText();
        System.out.println("Textul de la FROM ESTE: " + searchDropDown.getText());


        WebElement searchLAX = driver.findElement(By.xpath("//div[@class='col-xs-12 margin-top-4']/div[@class='location-typeahead']/div[@class='hw-form-group form-group floating-label empty has-icon']/input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis']"));
        searchLAX.sendKeys("OTP");
        searchDropDown = driver.findElement(By.xpath("//ul[@class='dropdown-menu large']"));
        System.out.println("textttt otp? = "+ searchDropDown.getText());


        searchField.click();


        driver.findElement(By.xpath("   //div[@data-bdd='farefinder-flight-startdate-input']")).click();


        driver.findElement(By.xpath("//*[name()='svg' and @data-id = 'SVG_CHEVRON_RIGHT__16']")).click();
        driver.findElement(By.xpath("//*[name()='svg' and @data-id = 'SVG_CHEVRON_LEFT__16']")).click();


        Calendar cal = Calendar.getInstance();
        String currentMonthMMM = new SimpleDateFormat("MMM").format(cal.getTime());
        System.out.println("cURRENT month MMM = " + currentMonthMMM);


        System.out.println("-------------------------------------------");
        // Set the current date
        LocalDate currentDate = LocalDate.of(2025, 5, 5); // May 5, 2025
        currentDate = LocalDate.now();
        System.out.println("local = " + currentDate);
        // Add 28 days
        LocalDate startDate = currentDate.plusDays(35);
        LocalDate endDate = currentDate.plusDays(40);

        // Format the date if needed
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String startDateString = startDate.format(formatter);
        String endDateString = endDate.format(formatter);

        System.out.println("STARTTT Date = " + startDateString);
        System.out.println("ENDDDD DATE = " + endDateString);
        // Output: Target Date after 28 days: June 2, 2025


        driver.findElement(By.xpath("//td[@aria-label='" + startDateString + "']")).click();

        driver.findElement(By.xpath("//td[@aria-label='" + endDateString + "']")).click();


        Thread.sleep(1000);


        WebElement passengers = driver.findElement(By.xpath("//input[@name='farefinder-occupant-selector-flight']"));

        //Thread.sleep(1000);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));


        // passengers.click();
        actions.click(passengers).perform();   // dropdown passengers
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));



        driver.findElement(By.xpath("//*[name()='svg' and @data-id='SVG_PLUS__16']")).click(); // 2xadulti
        driver.findElement(By.xpath("//span[@class='btn__label' and text()='Done']")).click(); // DONE button



        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


        //search flights

        WebElement searchFlight = driver.findElement(By.xpath("//div[@class = 'submit-button']"));


        // Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        // passengers.click();



        // actions.click(searchFlight).perform();
        searchFlight.click();

        // driver.switchTo().newWindow(WindowType.TAB);
        String myUrl = driver.getCurrentUrl();
        driver.get(myUrl);

        //  Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        System.out.println("ASSERTTTTTT:");
        //"//text()='Recommended departing flights'"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        // Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        //assert first - Los Angeles to Bucharest

//        System.out.println("LosAngelesToOTP = ");
//        WebElement finalAssert = driver.findElement(By.xpath("//h2[@class='uitk-heading uitk-heading-5']"));
//
//        String textAsser = finalAssert.getText();
//        System.out.println("getTEXTTT = "+ textAsser);
//        assertEquals(textAsser, "Los Angeles to Bucharest", "Verific ca a mers Search Flights - loading page"); // doar daca nu e ok apare acest mesaj


        //Asser second - Recommended
/*
        System.out.println("Final  = ");
        WebElement finalAssert1 = driver.findElement(By.xpath("//h5[@class='uitk-heading uitk-heading-5']"));

        String textAsser1 = finalAssert1.getText();
        System.out.println("getTEXTTT = "+ textAsser1);
        assertEquals(textAsser1, "Recommended departing flights", "Verific ca a mers Search Flights"); // doar daca nu e ok apare acest mesaj

*/


        // driver.quit();


    }
}

