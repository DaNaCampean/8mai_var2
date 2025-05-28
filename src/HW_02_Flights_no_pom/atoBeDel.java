/* package HW_02_Flights;








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


