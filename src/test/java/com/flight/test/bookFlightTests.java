package com.flight.test;

import com.flight.scenario.pageFactoryAction1;
import com.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class bookFlightTests extends BaseTest {

    //public WebDriver driver;
    private String expPrice;
    private String noOfPassengers;

    @BeforeTest
    @Parameters({"expPrice", "noOfPassengers"})
    public void paramValues(String expPrice, String noOfPassengers){
        this.expPrice = expPrice;
        this.noOfPassengers = noOfPassengers;
      //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\malvi\\chromedriver.exe");
        // this.driver = new ChromeDriver();
    }

    @Test
    public void pageFactoryActionTest(){
        pageFactoryAction1 pg = new pageFactoryAction1(driver);

        pg.registrationForm("navin", "malviya","testnavin", "test",
                "test");
        pg.regisConfPage();
        pg.flightDetails(noOfPassengers);
        pg.selectFlight();
        pg.billingDetails();
        String price = pg.getFlightItinerary();
        Assert.assertEquals(price, expPrice);

        }
   }
