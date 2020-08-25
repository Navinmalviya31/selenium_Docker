package com.flight.scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageFactoryActions {
    public static void flightNavigationActions() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://vins-udemy.s3.amazonaws.com/docker/docker-book-flight.html");
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name(pageObjects.RegisForm_FirstNameS)));
        pageObjects.RegisForm_FirstName(driver).sendKeys("test");
        pageObjects.RegisForm_LastName(driver).sendKeys("last");
        pageObjects.RegisForm_Uname(driver).sendKeys("user");
        pageObjects.RegisForm_Pass(driver).sendKeys("pass");
        pageObjects.flightItinerary_Conf(driver).sendKeys("pass");
        pageObjects.RegisForm_Submit(driver).click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name(pageObjects.RegisConf_Flights)));
        pageObjects.RegisConf_Flights(driver).click();
        pageObjects.flightDetails_Cont(driver).click();
        pageObjects.selectFlight_Cont(driver).click();
        pageObjects.enterBilling(driver).click();
        String price = pageObjects.flightItinerary_Price(driver).getText();

    }


}
