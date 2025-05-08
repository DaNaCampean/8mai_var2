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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Interaction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class HW_02_Flights {

    static int targetDay = 0,
            targetMonth = 0,
            targetYear = 0;

    static int currentDay = 0,
            currentMonth = 0,
            currentYear = 0;

    static int jumpMonthsBy = 0;
    static boolean increment = true;

    public static void main(String[] args) throws InterruptedException {


        String dateToSet = "22/05/2025";

        // get the current date
        getCurrentDate();
        System.out.println("current day = " + currentDay);
        System.out.println("current month = " + currentMonth);
        System.out.println("current year = " + currentYear);

        System.out.println("TargetDay = " + dateToSet);
        dateToSet = dateToSet + 7;
        System.out.println("TargetUpdated =" + dateToSet);

        //GET TARGER date
        //
        GetTargetDateMonthAndYear(dateToSet);
        System.out.println("targetDay = " + targetDay);
        System.out.println("target Month = " + targetMonth);
        System.out.println("target year = " + targetYear);

        // get Jump month

        CalculateHowManyMonthsToJump();
        System.out.println("Jump Month = " + jumpMonthsBy);
        System.out.println("increment = " + increment);

      //   System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");
       System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");


       // ChromeOptions options = new ChromeOptions();
      ///  options.addArguments("--disable-search-engine-choice-screen");

      //  WebDriver driver = new ChromeDriver(options);
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.hotwire.com/");

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //click on Flights tab - double click
        WebElement flightsClick = driver.findElement(By.xpath("//div[@data-bdd = 'farefinder-option-flights' and @class = 'farefinder-option inactive']"));
        //  flightsClick.click();
        // flightsClick.click();

        // Instantiate the Actions class needed for double click
        Actions actions = new Actions(driver);

        // Perform double-click
        actions.doubleClick(flightsClick).perform();


        WebElement searchField = driver.findElement(By.xpath("//input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis']"));
        searchField.sendKeys("LAX");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchField.click();

        //searchField.sendKeys(Keys.RETURN);

        String text = searchField.getText();
        System.out.println("Textul de la FROM ESTE: " + searchField.getText());
        //   searchField.clear();

        WebElement searchLAX = driver.findElement(By.xpath("//div[@class='col-xs-12 margin-top-4']/div[@class='location-typeahead']/div[@class='hw-form-group form-group floating-label empty has-icon']/input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis']"));
        searchLAX.sendKeys("OTP");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        searchField.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("   //div[@data-bdd='farefinder-flight-startdate-input']")).click();


        driver.findElement(By.xpath("//*[name()='svg' and @data-id = 'SVG_CHEVRON_RIGHT__16']")).click();
        driver.findElement(By.xpath("//*[name()='svg' and @data-id = 'SVG_CHEVRON_LEFT__16']")).click();

        int dayMe = currentDay + 28;
        int newday = currentDay + 7;
        System.out.println("NEW DAY = " + newday);

        System.out.println("X - current day = " + currentDay);
        System.out.println("x - target day = current + 7 = " + newday);
        System.out.println("x- last day = curent +14 = " + dayMe);
        String selectDay = "May " + newday + ", 2025";
        System.out.println("selectday = " + selectDay);
        String selectDayLast = "May " + dayMe + ", 2025";
        ;

        Calendar cal = Calendar.getInstance();
        String currentMonthMMM = new SimpleDateFormat("MMM").format(cal.getTime());
        System.out.println("cURRENT month MMM = " + currentMonthMMM);


        String.valueOf(currentMonth + dayMe + currentYear);


        System.out.println("selectdayLast = " + selectDayLast);

        System.out.println("-------------------------------------------");
        // Set the current date
        LocalDate currentDate = LocalDate.of(2025, 5, 5); // May 5, 2025
        currentDate = LocalDate.now();
        System.out.println("local = " + currentDate);
        // Add 28 days
        LocalDate targetDate = currentDate.plusDays(28);

        // Format the date if needed
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String formattedDate = targetDate.format(formatter);

        System.out.println("Target Date after 28 days: " + formattedDate);
        // Output: Target Date after 28 days: June 2, 2025




        driver.findElement(By.xpath("//td[@aria-label='" + selectDay + "']")).click();

        driver.findElement(By.xpath("//td[@aria-label='" + formattedDate + "']")).click();



        /*for (int i=0;i<jumpMonthsBy;i++){
            if(increment){
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();



            }else{
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();

            }*/


        Thread.sleep(1000);

        // select two adults:
       // driver.findElement(By.xpath("//*[name()='svg' and @data-id = 'SVG_HW_FUNCTIONAL_USER']")).click();

       WebElement passengers = driver.findElement(By.xpath("//input[@name='farefinder-occupant-selector-flight']"));
        Thread.sleep(1000);
     // passengers.click();

        actions.click(passengers).perform();





        driver.findElement(By.xpath("//*[name()='svg' and @data-id='SVG_PLUS__16']")).click();
        driver.findElement(By.xpath("//span[@class='btn__label' and text()='Done']")).click();

        WebElement searchFlight = driver.findElement(By.xpath("//div[@class = 'submit-button']"));
        Thread.sleep(1000);
        // passengers.click();

        actions.click(searchFlight).perform();

        // driver.findElement(By.xpath(" //div[@class = 'submit-button']")).submit();

   // driver.quit();



    }

    public static void getCurrentDate() {
        Calendar cal = Calendar.getInstance();
        currentDay = cal.get(Calendar.DAY_OF_MONTH);
        currentMonth = cal.get(Calendar.MONTH) + 1;
        // gregorian calendar...si asta arata cu o luna in urma
        currentYear = cal.get(Calendar.YEAR);
    }


    public static void GetTargetDateMonthAndYear(String dateString) {
        int firstIndex = dateString.indexOf("/");
        int lastIndex = dateString.lastIndexOf("/");

        String day = dateString.substring(0, firstIndex);
        targetDay = Integer.parseInt(day);

        String month = dateString.substring(firstIndex + 1, lastIndex);
        targetMonth = Integer.parseInt(month);

        String year = dateString.substring(lastIndex + 1, dateString.length());
        targetYear = Integer.parseInt(year);

    }

    public static void CalculateHowManyMonthsToJump() {

        if ((targetMonth - currentMonth) > 0) {
            jumpMonthsBy = (targetMonth - currentMonth);
        } else {
            jumpMonthsBy = (currentMonth - targetMonth);
            increment = false;

        }


    }
}
