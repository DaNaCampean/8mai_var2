package selenium.LearningPOM_udemy.testcases;

import org.testng.annotations.AfterSuite;
import selenium.LearningPOM_udemy.basePackage.Page;

public class BaseTest {

    @AfterSuite
    public void tearDown(){
      Page.quit();

    }
}
