/* package HW_02_Flights;

empty:
<div class="location-typeahead"><label class="heading-300">Fly to</label><div class="hw-form-group form-group floating-label empty has-icon">                 <input class="form-control hw-input hw-input-icon type__400__regular text-ellipsis" aria-invalid="false" aria-label="" placeholder="Destination city or airport" data-bdd="farefinder-flight-destination-input" id="" type="text" autocomplete="#$%^@#$$#" value=""                                                                  data-gtm-form-interact-field-id="1"><label class="has-icon" for=""></label><span class="form-control-icon"><span class="SVGIcon"><svg focusable="false" data-id="SVG_HW_FUNCTIONAL_PIN" width="16px" height="16px" viewBox="0 0 16 16"><path stroke="none" fill="currentColor" id="a" d="M7.855 7.153A1.814 1.814 0 0 1 5.72 5.025a1.814 1.814 0 0 1 1.426-1.42A1.814 1.814 0 0 1 9.28 5.733a1.814 1.814 0 0 1-1.426 1.42M7.53 0H7.47C4.442 0 2 2.593 2 5.706 2 10.91 5.948 14.8 7.155 15.869a.517.517 0 0 0 .69 0C9.05 14.8 13 10.91 13 5.706 13 2.593 10.6 0 7.529 0"></path></svg></span></span></div></div>
filled:
<div class="location-typeahead"><label class="heading-300">Fly to</label><div class="hw-form-group form-group floating-label not-empty has-icon has-feedback"><input class="form-control hw-input hw-input-icon type__400__regular text-ellipsis" aria-invalid="false" aria-label="" placeholder="Destination city or airport" data-bdd="farefinder-flight-destination-input" id="" type="text" autocomplete="#$%^@#$$#" value="Los Angeles, CA, United States of America (LAX-Los Angeles Intl.)" data-gtm-form-interact-field-id="1"><label class="has-icon" for=""></label><span class="form-control-icon"><span class="SVGIcon"><svg focusable="false" data-id="SVG_HW_FUNCTIONAL_PIN" width="16px" height="16px" viewBox="0 0 16 16"><path stroke="none" fill="currentColor" id="a" d="M7.855 7.153A1.814 1.814 0 0 1 5.72 5.025a1.814 1.814 0 0 1 1.426-1.42A1.814 1.814 0 0 1 9.28 5.733a1.814 1.814 0 0 1-1.426 1.42M7.53 0H7.47C4.442 0 2 2.593 2 5.706 2 10.91 5.948 14.8 7.155 15.869a.517.517 0 0 0 .69 0C9.05 14.8 13 10.91 13 5.706 13 2.593 10.6 0 7.529 0"></path></svg></span></span><span class="form-control-feedback"><div><span class="SVGIcon"><svg focusable="false" data-id="SVG_HW_FUNCTIONAL_RESET" width="16px" height="16px" viewBox="0 0 16 16"><path stroke="none" fill="currentColor" id="a" d="M8 16A8 8 0 1 0 8 0a8 8 0 0 0 0 16zm3.063-12.48l1.508 1.508-3.017 3.018 3.017 3.017-1.508 1.508-3.018-3.017-3.017 3.017-1.508-1.508 3.017-3.018L3.52 5.028 5.028 3.52l3.017 3.017 3.018-3.017z"></path></svg></span></div></span></div></div>


//div[@class='location-typeahead']///input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis']


//div[@class='location-typeahead']/label[@class='heading-300' and text()='Fly to']/input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis']

/
//span[@class='btn__label' and text()='Done']"


       // click on field
        WebElement searchFieldFrom = driver.findElement(By.xpath("//input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis']"));
        WebElement searchFieldTo =  driver.findElement(By.xpath("//div[@class='col-xs-12 margin-top-4']/div[@class='location-typeahead']/div[@class='hw-form-group form-group floating-label empty has-icon']/input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis']"));

to: //div[@class='col-xs-12 margin-top-4']/div[@class='location-typeahead']/input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis']


        searchFieldFrom.sendKeys("LAX");

       text field drop down?
        WebElement searchDropDown = driver.findElement(By.xpath("//ul[@class='dropdown-menu large']"));



     //   System.out.println(searchDropDown.getText());
     //   System.out.println("de selectat = " + mySelect.getFirstSelectedOption().getText());
        searchFieldFrom.click();


        String text = searchFieldFrom.getText();
        System.out.println("Textul de la FROM ESTE: " + searchDropDown.getText());


        WebElement searchFieldTo = driver.findElement(By.xpath("//div[@class='col-xs-12 margin-top-4']/div[@class='location-typeahead']/div[@class='hw-form-group form-group floating-label empty has-icon']/input[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis']"));
        searchFieldTo.sendKeys("Bucharest");
        searchDropDown = driver.findElement(By.xpath("//ul[@class='dropdown-menu large']"));

        System.out.println("textttt otp? = "+ searchDropDown.getText());
        searchDropDown = driver.findElement(By.xpath("//li[a[contains(text(), 'BUH')]]"));
        System.out.println("SELECTED ONE? = "+ searchDropDown.getText());
        // searchField.click();
        searchDropDown.click();




        // //ul[@class='dropdown-menu large typeahead-scroll']/li[a[contains(text(), 'BUH')]]

        // click date
        driver.findElement(By.xpath("   //div[@data-bdd='farefinder-flight-startdate-input']")).click();


        driver.findElement(By.xpath("//*[name()='svg' and @data-id = 'SVG_CHEVRON_RIGHT__16']")).click();
        driver.findElement(By.xpath("//*[name()='svg' and @data-id = 'SVG_CHEVRON_LEFT__16']")).click();


        Calendar cal = Calendar.getInstance();
        String currentMonthMMM = new SimpleDateFormat("MMM").format(cal.getTime());
        System.out.println("cURRENT month MMM = " + currentMonthMMM);


        System.out.println("-------------------------------------------");
        // Set the current date
        LocalDate currentDate = LocalDate.of(2025, 5, 5); // May 5, 2025
        currentDate = LocalDate.now();
        System.out.println("local = " + currentDate);
        // Add 28 days
        LocalDate startDate = currentDate.plusDays(7);
        LocalDate endDate = currentDate.plusDays(14);

        // Format the date if needed
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String startDateString = startDate.format(formatter);
        String endDateString = endDate.format(formatter);

        System.out.println("STARTTT Date = " + startDateString);
        System.out.println("ENDDDD DATE = " + endDateString);



        driver.findElement(By.xpath("//td[@aria-label='" + startDateString + "']")).click();

        driver.findElement(By.xpath("//td[@aria-label='" + endDateString + "']")).click();


        Thread.sleep(1000);


        WebElement passengers = driver.findElement(By.xpath("//input[@name='farefinder-occupant-selector-flight']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));


        // passengers.click();
        actions.click(passengers).perform();   // dropdown passengers
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));



        driver.findElement(By.xpath("//*[name()='svg' and @data-id='SVG_PLUS__16']")).click(); // 2xadulti
        driver.findElement(By.xpath("//span[@class='btn__label' and text()='Done']")).click(); // DONE button



        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


        //search flights

        WebElement searchFlight = driver.findElement(By.xpath("//div[@class = 'submit-button']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        // passengers.click();
        Thread.sleep(5000);

        actions.click(searchFlight).perform();
      //  searchFlight.click();

        // driver.switchTo().newWindow(WindowType.TAB);
        String myUrl = driver.getCurrentUrl();
        driver.get(myUrl);



        //  Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        System.out.println("ASSERTTTTTT:");
        //"//text()='Recommended departing flights'"));

        //<span class="">Choose departing flight</span>
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

//        WebElement assertfinal = driver.findElement(By.xpath("//span[contains(text(),'Choose departing fligh')]"));
//        String textAsser = assertfinal.getText();
//        System.out.println("getTEXTTT = "+ textAsser);
//       assertEquals(textAsser, "Choose departing fligh", "Verific ca a mers Search Flights - loading page"); // doar daca nu e ok apare acest mesaj

        FirefoxDriver newbr = new FirefoxDriver();
        newbr.get(myUrl);
        System.out.println("URL = " + myUrl);

        WebElement assertfinal = driver.findElement(By.xpath("//span[contains(text(),'Choose departing flight')]"));
        String textAsser = assertfinal.getText();
        System.out.println("getTEXTTT = "+ textAsser);
        assertEquals(textAsser, "Choose departing fligh", "Verific ca a mers Search Flights - loading page"); // doar daca nu e ok apare acest mesaj


        //assert first - Los Angeles to Bucharest

//        System.out.println("LosAngelesToOTP = ");
//        WebElement finalAssert = driver.findElement(By.xpath("//h2[@class='uitk-heading uitk-heading-5']"));
//
//        String textAsser = finalAssert.getText();
//        System.out.println("getTEXTTT = "+ textAsser);
//        assertEquals(textAsser, "Los Angeles to Bucharest", "Verific ca a mers Search Flights - loading page"); // doar daca nu e ok apare acest mesaj

//<span class="">Choose departing flight</span>
        //Asser second - Recommended
/*
        System.out.println("Final  = ");
        WebElement finalAssert1 = driver.findElement(By.xpath("//h5[@class='uitk-heading uitk-heading-5']"));

        String textAsser1 = finalAssert1.getText();
        System.out.println("getTEXTTT = "+ textAsser1);
        assertEquals(textAsser1, "Recommended departing flights", "Verific ca a mers Search Flights"); // doar daca nu e ok apare acest mesaj

*/


        // driver.quit();


