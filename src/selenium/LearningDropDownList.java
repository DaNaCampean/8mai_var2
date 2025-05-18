package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LearningDropDownList {
    public static void main (String[] args) {


        // System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");
        // System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\campe\\Downloads\\Automation\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www-archive.mozilla.org/projects/ui/accessibility/unix/testcase/html/");

       //find element for the dropdown
        WebElement dropDown = driver.findElement(By.id("options"));
        //create ojcet of select class
        Select select = new Select(dropDown);
        //select the 4 th option. the index starts with 0
        select.selectByIndex(3);
        System.out.println("BY INDEX = " + dropDown.getText());
        System.out.println("Selected Option = " + select.getFirstSelectedOption().getText());

        // select by value - option5

        select.selectByValue("stock");
        System.out.println("By value, option 5 = " + select.getFirstSelectedOption().getText());


        // select by visibleText, option 3

        select.selectByVisibleText("option3");
        System.out.println("By visibleText, option 3 = " + select.getFirstSelectedOption().getText());

// The Select class provides the following methods to get the options from a dropdown:
// ● getOptions()
// ● getFirstSelectedOption
// ● getSelectedOptions()

       // getOptions
        List<WebElement> alloptions = select.getOptions();
        System.out.println("ALL options = " + alloptions.getFirst().getText());

        // getFirstSelectedOption
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        System.out.println("FirstSelectedOption = " + firstSelectedOption.getText());

       // getAllSelectedOptions
       List<WebElement> getAllSelectedOptions = select.getAllSelectedOptions();
        System.out.println("ALL selected = " + getAllSelectedOptions.getFirst().getText());




        driver.quit();


    }
}
