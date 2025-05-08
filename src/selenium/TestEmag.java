package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestEmag {


        public static void main(String[] args) {
            // Setează locația ChromeDriver

            //System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");

            System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");

            // Inițializează WebDriver
            WebDriver driver = new ChromeDriver();

            try {
                // Deschide emag.ro
                driver.get("https://www.emag.ro");

                // Maximizați fereastra
                driver.manage().window().maximize();

                // Așteaptă 2 secunde pentru ca pagina să se încarce
                driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

                // Găsește bara de căutare utilizând XPath
                WebElement searchBox = driver.findElement(By.xpath("//input[@name='query']"));

                // Caută "aspiratoare"
                searchBox.sendKeys("aspiratoare");
                searchBox.submit();

                // Așteaptă pentru rezultate
                driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

                // Găsește toate aspiratoarele listate utilizând XPath
                List<WebElement> aspirators = driver.findElements(By.xpath("//div[@class='js-products-container card-collection list-view-updated show-me-a-grid']/a"));

                // Verifică dacă există suficiente rezultate
                if (aspirators.size() >= 3) {
                    // Selectează al treilea aspirator
                    aspirators.get(2).click();
                } else {
                    System.out.println("Nu au fost găsite suficiente rezultate.");
                }

                // Așteaptă 5 secunde pentru a vizualiza detaliile produsului
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // Închide browserul
                driver.quit();
            }
        }
    }

