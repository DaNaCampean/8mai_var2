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

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;


public class LearningCalendar {

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

      //  System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");
          System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");

        WebDriver driver = new ChromeDriver(options);

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




        driver.findElement(By.xpath("   //div[@data-bdd='farefinder-flight-startdate-input']")).click();


        driver.findElement(By.xpath("//*[name()='svg' and @data-id = 'SVG_CHEVRON_RIGHT__16']")).click();
        driver.findElement(By.xpath("//*[name()='svg' and @data-id = 'SVG_CHEVRON_LEFT__16']")).click();

        int dayMe = currentDay+28;
        int newday = currentDay+7;
        System.out.println("NEW DAY = " +newday);

        System.out.println("X - current day = " + currentDay);
        System.out.println("x - target day = current + 7 = " + newday);
        System.out.println("x- last day = curent +14 = " + dayMe);
        String selectDay = "May " + newday + ", 2025";
        System.out.println("selectday = "+selectDay);
        String selectDayLast ="May " +dayMe + ", 2025";;

        Calendar cal = Calendar.getInstance();
        String currentMonthMMM = new SimpleDateFormat("MMM").format(cal.getTime());
        System.out.println("cURRENT month MMM = " + currentMonthMMM);


                String.valueOf(currentMonth + dayMe + currentYear);


        System.out.println("selectdayLast = "+selectDayLast);

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


     //   driver.findElement(By.xpath("//td[@class='day no-gridlines selectable clickable' and @aria-label='"+selectDay+"']")).click();

       // driver.findElement(By.xpath("//td[@class='day no-gridlines selectable clickable' and @aria-label='"+formattedDate+"']")).click();

        driver.findElement(By.xpath("//td[@aria-label='"+selectDay+"']")).click();

       driver.findElement(By.xpath("//td[@aria-label='"+formattedDate+"']")).click();



        /*for (int i=0;i<jumpMonthsBy;i++){
            if(increment){
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();



            }else{
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();

            }*/


        Thread.sleep(1000);

       // select two adults:
        driver.findElement(By.xpath("//div[@data-bdd='farefinder-occupant-selector-flight-input']/input@name='farefinder-occupant-selector-flight']")).click();


        driver.findElement(By.xpath("//*[name()='svg' and @data-id='SVG_PLUS__16']")).click();
        driver.findElement(By.xpath("//span[@class='btn__label' and text()='Done']")).click();
//
//<input class="form-control" aria-invalid="false" readonly="" aria-label="" placeholder="" name="farefinder-occupant-selector-flight" id="farefinder-occupant-selector-flight-input" role="button" type="text" value="1 Adult, 0 Children"><label class="has-icon" for="farefinder-occupant-selector-flight-input"></label><span class="form-control-icon"><span class="SVGIcon"><svg focusable="false" data-id="SVG_HW_FUNCTIONAL_USER" width="16px" height="16px" viewBox="0 0 16 16"><path stroke="none" fill="currentColor" id="a" d="M8 8c1.852 0 3.572.573 4.844 1.614C14.254 10.767 15 12.419 15 14.39v1.082c0 .292-.23.528-.514.528H1.514A.521.521 0 0 1 1 15.472V14.39C1 10 4.628 8 8 8zm0-8a3.5 3.5 0 1 1 0 7 3.5 3.5 0 0 1 0-7z"></path></svg></span></span></div><div class="picker__overlay picker__overlay--selectable" role="button" tabindex="0"></div></div>


  //              /input[@id=farefinder-occupant-selector-flight-input']

        //div[@data-bdd='hw-form-group form-group floating-label not-empty has-icon is-readonly']

        // press find flights button: <span class="btn__label">Find a flight</span>
    }
    /*
<td class="day no-gridlines selectable clickable" data-column="3" data-row="1" tabindex="-1"
    aria-label="June 11, 2025" aria-hidden="false">

    <div class="day-availability"><div
    class="day-availability__content">
    <div class="day-availability__day">11</div></div></div></td>

*/
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

        String day = dateString.substring(0,firstIndex);
        targetDay = Integer.parseInt(day);

        String month =dateString.substring(firstIndex+1,lastIndex);
        targetMonth = Integer.parseInt(month);

        String year = dateString.substring(lastIndex+1, dateString.length());
        targetYear = Integer.parseInt(year);

    }

    public static void CalculateHowManyMonthsToJump() {

        if((targetMonth-currentMonth)>0) {
            jumpMonthsBy = (targetMonth-currentMonth);
        }else{
            jumpMonthsBy = (currentMonth-targetMonth);
            increment = false;

        }

    }

}




