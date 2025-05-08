package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class LearningBasicsSelenium {
        public static void main(String[] args) {
         //   System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");

           System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");
            //Setting the path to the browser driver:
           // The path must be explicitly set. One way to do this is by using the ‘System.setProperty’ method, which can set up various driver
           // specific properties, such as
            // CHROME::::: webdriver.chrome.driver for chrome
            // FIREFOX::::::     or webdriver.gecko.driver for   firefox.
            //driver.get("https://www.google.com");
            //SafariOptions options = new SafariOptions();
         //   WebDriver driver = new SafariDriver();


           //Object instantiation of WebDriver
            WebDriver driver = new ChromeDriver();

            /*Once the WebDriver instantiates, we will navigate to our web page. There are two ways to do
this:
1. driver.get(“URL”) - Navigates to the URL passed as an argument and waits until the
page loads.
2. driver.navigate().to(“URL”) - Navigates to the URL passed as an argument and doesn’t
wait for the page to load. Additionally, it maintains the browser history in order to
navigate forward and back. /*

             */

           // driver.navigate().to("https://www.google.com");

            driver.get("https://www.google.com");
            /*
            Generally when Selenium WebDriver opens the browser, it doesn’t open the browser in a full
window, which is how users use any browsers. We should also open the browser in full-size., so we need to maximize the window
             */
            driver.manage().window().maximize();
            String title = driver.getTitle();
            System.out.println("The page title is: " + title);

            driver.navigate().to("https://www-archive.mozilla.org/projects/ui/accessibility/unix/testcase/html/");
            driver.navigate().to("https://www-archive.mozilla.org/products/");
            driver.navigate().back();
            driver.navigate().forward();
            driver.navigate().to("https://www-archive.mozilla.org/projects/ui/accessibility/unix/testcase/html/");
            driver.navigate().refresh();
          //  driver.quit();

            driver.get("https://www.google.com/");
// Opens a new window and switches to new window
            driver.switchTo().newWindow(WindowType.WINDOW);
// Opens LambdaTest homepage in the newly opened window
            driver.navigate().to("https://www.lambdatest.com/");

            driver.get("https://www.google.com/");
// Opens a new window and switches to new window
            driver.switchTo().newWindow(WindowType.TAB);
// Opens LambdaTest homepage in the newly opened tab
            driver.navigate().to("https://www.lambdatest.com/");

           //driver.close();
            driver.quit();


        }
    }



