package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class LearningWebElemenCommands {

    public static void main (String[] args) {


        System.out.println("STARTTTTTTTTTTTTTTTTTT");
       // System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");
        System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www-archive.mozilla.org/projects/ui/accessibility/unix/testcase/html/");

      //  WebElement firstNameField = driver.findElement(By.id("firstname"));
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        firstNameInput.sendKeys("DaNa");

       WebElement firstNameInput1 = driver.findElement(By.id("lastname"));
        firstNameInput1.sendKeys("Didi");
     //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);

        //MERG AMBELE????????
        WebElement emailText = driver.findElement(By.cssSelector("#email"));
        emailText.sendKeys("testEmailAdd");

        WebElement emailText2 = driver.findElement(By.cssSelector("input[id='email']"));
        emailText2.sendKeys("varianta 2");

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         firstNameInput.clear();
        //click on element ... text field

// ?????????????? de unde stii care web elem e cel mai ok de folosit? cand poti folosi mai multe?



       // erroare ????

        WebElement typeHereButton = driver.findElement(By.name("B1"));
        typeHereButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();


        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // findElements by tagname

       List<WebElement> tagNameFind = driver.findElements(By.tagName("inputss"));
       if (tagNameFind.size()!=0)
           System.out.println("List found = " + tagNameFind.size() + "times") ;
       else
           System.out.println("No tagName foud");




        // click on link

        // isDisplayed

        //isEnabled

        // isSelected
        System.out.println("STARTTTTTTTTTTTTTTTTTT3333333333333333");


      //  WebElement RadioButton1 = driver.findElement(By.id("rbutton1"));
        //Radio Button 1
          WebElement radioButton1 = driver.findElement(By.id("rbutton1"));

        System.out.println("xxxxxxxxxxxxxxxxx");
        WebElement RadioButton2 = driver.findElement(By.id("rbutton2"));
      //  System.out.println("RADIO BUTTONS");
     //  System.out.println("Radio B 1 = " + radioButton1.isSelected());
       RadioButton2.isSelected();
        System.out.println("Radio B 2 = " + RadioButton2.isSelected());
        //Verifying that radioButton1 is selected
        Boolean isRadioButtonSelected = radioButton1.isSelected();
        System.out.println("Radio button is selected: " + isRadioButtonSelected);
        //Verifying that radioButton1 is selected
       // Boolean isRadioButton2Selected = RadioButton2.isSelected();
       // System.out.println("Radio button2 is selected: " + isRadioButton2Selected);

//Getting


        // submit command

        //getText Command

        //getTagName Command

        //getCssValue Command

        // getAttribute Command

        // getSize Command

        // getLocation Command
        //

//Initializing the web element via the By.className locator strategy
        WebElement element = driver.findElement(By.className("toc"));
//Verifying that element was found (!null) and printing a message
        if (element != null)
            System.out.println("Element found by className");
//Closing






       driver.quit();



    }


}
