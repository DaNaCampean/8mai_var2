package selenium;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebElementActions {
    public static void main(String[] args) {
//Initializing the url strings
        String url1 =
                "https://www-archive.mozilla.org/projects/ui/accessibility/unix/testcase/html/";
//Setting the driver path
        System.setProperty("webdriver.chrome.driver",
                "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");
//Creating WebDriver instance
        WebDriver driver = new ChromeDriver();
//Maximizing the window

        driver.manage().window().maximize();
//Navigating to the page
        driver.get(url1);
//Initializing the webElements we will be using
//The firstName input text box:
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
//Submit button
        WebElement submitButton = driver.findElement(By.xpath("//table[@summary='Button test cases']//button[@type='submit']"));
//Radio Button 1
        WebElement radioButton1 = driver.findElement(By.id("rbutton1"));
//Label for First Name input
        WebElement label = driver.findElement(By.xpath("//label[@for='firstname']"));
//Verifying that the first name input text box is displayed
        boolean isFirstNameInputDisplayed = firstNameInput.isDisplayed();
        System.out.println("First name input is displayed: " + isFirstNameInputDisplayed);
//Verifying that the first name input text box is enabled
        boolean isFirstNameInputEnabled = firstNameInput.isEnabled();
        System.out.println("First name input is enabled: " + isFirstNameInputEnabled);
//Using the sendKeys command on the firstNameInput text box
        firstNameInput.sendKeys("MyFirstName");
//Getting the text for the label of firstName
        String labelFirstNameInput = label.getText();
        System.out.println("The innerText of the labelFirstNameInput element is: " +
                labelFirstNameInput);
//Clearing the firstName input text box
        firstNameInput.clear();
//Clicking the first radio button
        radioButton1.click();
//Verifying that radioButton1 is selected
        Boolean isRadioButtonSelected = radioButton1.isSelected();
        System.out.println("Radio button is selected: " + isRadioButtonSelected);
//Getting the CssValue of radioButton1
        String cssValueRadioButton = radioButton1.getCssValue("background-color");
        System.out.println("Background color of radioButton1 is " + cssValueRadioButton);
//Getting the name attribute of radioButton1
        String nameAttributeOfRadioButton1 = radioButton1.getAttribute("name");
        System.out.println("The value of the 'name' attribute of radioButton1 element is " +
                nameAttributeOfRadioButton1);
//Getting the tagName of radioButton1
        String tagNameOfRadioButton1 = radioButton1.getTagName();
        System.out.println("The tag name of radioButton1 is " + tagNameOfRadioButton1);
//Getting the size of radioButton1
        Dimension dimensions = radioButton1.getSize();
        System.out.println("Height of radioButton1: " + dimensions.height);
        System.out.println("Width of radioButton1: " + dimensions.width);
//Getting the location of radioButton1
        Point point = radioButton1.getLocation();
        System.out.println("X coordinate of radioButton1: " + point.x);
        System.out.println("Y coordinate of radioButton1: " + point.y);
//Submitting on the submit button
        submitButton.submit();
//Closing the browser
        driver.quit();
    }
}