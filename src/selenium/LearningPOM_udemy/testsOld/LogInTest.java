package selenium.LearningPOM_udemy.testsOld;


//import selenium.LearningPOM_udemy.pages.HomePage;
//import selenium.LearningPOM_udemy.pages.LoginPage;
//import selenium.LearningPOM_udemy.pages.ZooAppPage;

import selenium.LearningPOM_udemy.basePackage.Page;
import selenium.LearningPOM_udemy.pages.HomePage;
import selenium.LearningPOM_udemy.pages.LoginPage;
import selenium.LearningPOM_udemy.pages.ZooAppPage;
import selenium.LearningPOM_udemy.pages.crm.accounts.AccountsPage;
import selenium.LearningPOM_udemy.pages.crm.accounts.CreateAccountPage;

public class LogInTest extends Page {


    public static void main(String[] args) {

    //REMOVE THE BELOW, PT CA LE-AM PUS DINCOLO
       /* // System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://zoho.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        */

        /*
        VARIANTA INITIALA:

        HomePage home = new HomePage();
        home.goToLogIn();
        LoginPage login = new LoginPage();
        login.doLogin("dana.campean@yahoo.com", "Softvision@10");
        ZooAppPage zp = new ZooAppPage();
        zp.goToCRM();
        Page.menu.gotoAccounts();
        AccountsPage account = new AccountsPage();
        account.gotoCreateAccounts();
        CreateAccountPage cap = new CreateAccountPage();
        cap.createAccount("Dana");

         */
        /*
        CHANGES CU COMENTARII
         HomePage home = new HomePage();
        // home.goToLogIn(); - asta era initial....
        LoginPage lp = home.goToLogIn(); //asta am pus
//dam remove la next one
      //  LoginPage login = new LoginPage();


      //   LoginPage login = new LoginPage(driver); - ASTA E ORIGINAL INAINTE DE EXTENDS

        // asta era inainte
      //  login.doLogin("dana.campean@yahoo.com", "Softvision@10");

        //acum punem asta:
      //  lp.doLogin("dana.campean@yahoo.com", "Softvision@10");

        //reedit cu partea de jos:
        ZooAppPage zp = lp.doLogin("dana.campean@yahoo.com", "Softvision@10");


        //do.Login is responsable for going to ZooApp page...asa ca facem next:
       //  ZooAppPage zp = new ZooAppPage(); - delete asta si add next:
//        ZooAppPage zp = lp.doLogin("dana.campean@yahoo.com", "Softvision@10");
        //dar de fapt o editam sus

        //zp.goToCRM(); - asta ne va duce la CARM HOME PAGE...
        //editam si punem:

        CRMHomePage cp = zp.goToCRM();

         */
        //varianta finala:
// CELE DE MAI JOS COR FI IMPARTITE IN DIFERITE TESTE....bazat pe spatiile mele.
        HomePage home = new HomePage();
        LoginPage lp = home.goToLogIn();

        ZooAppPage zp = lp.doLogin("dana.campean@yahoo.com", "Softvision@10");
        zp.goToCRM();

        AccountsPage account = Page.menu.gotoAccounts();
        CreateAccountPage cap = account.gotoCreateAccounts();
        cap.createAccount("Dana");


        // driver.manage.window.maximize(); - these are 3 different methods, coming from 3 different clase
        // nu creeam obiecte,straint forward....we are getting them
        // from clases, si sunt returnate din metode din clase
        //PON zice ca fiecare metoda e responsabila sa te duca in o pagina si sa returneze un object of that page.
       // daca pove de goto login, ....


       // home.goToSignUp();
       // home.goToSupport();


    }


}
