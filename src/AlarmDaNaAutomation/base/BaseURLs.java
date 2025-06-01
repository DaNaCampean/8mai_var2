package AlarmDaNaAutomation.base;

import static AlarmDaNaAutomation.base.BasePageDriver.driver;

public class BaseURLs {

    public static void getCustomerSiteURL(){
        driver.get("https://international.alarm.com/adc/");
    }

    public static void getDealerSiteURL(){
        driver.get("https://alarmadmin.alarm.com/");
    }


    }




