package com.flight.scenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageFactoryAction1 {
    private WebDriver driver;
    private WebDriverWait wait;


    @FindBy(name= "firstName")
    private WebElement RegisForm_FirstName;

    @FindBy(name ="lastName")
    private WebElement RegisForm_LastName;

    @FindBy(name ="email")
    private WebElement RegisForm_UserName;

    @FindBy(name ="password")
    private WebElement RegisForm_Pass;

    @FindBy(name ="confirmPassword")
    private WebElement RegisForm_ConfPass;

    @FindBy(name = "register")
    private  WebElement RegisForm_Submit;

    @FindBy(id = "flight-link")
    private WebElement RegisConf_Flights;

    @FindBy(name = "passCount")
    private WebElement noOfPassengers;

    @FindBy(name = "findFlights")
    private WebElement flightDetails_Cont;

    @FindBy(name = "reserveFlights")
    private WebElement selectFlight_Cont;

    @FindBy(name = "buyFlights")
    private WebElement enterBilling;

    @FindBy(xpath = "//*[@id=\"confirm-table\"]/tbody/tr[3]/td[2]/font")
    private WebElement flightItinerary_Price;

    public pageFactoryAction1(WebDriver driver){
        this.driver = driver;

        this.wait = new WebDriverWait(driver, 20);
        PageFactory.initElements(driver, this);
    }

    public void registrationForm(String firstName, String lastName, String userName, String password, String confPassword){

        driver.get("http://vins-udemy.s3.amazonaws.com/docker/docker-book-flight.html");
        this.wait.until(ExpectedConditions.visibilityOf(this.RegisForm_FirstName));
        this.RegisForm_FirstName.sendKeys(firstName);
        this.RegisForm_LastName.sendKeys(lastName);
        this.RegisForm_UserName.sendKeys(userName);
        this.RegisForm_Pass.sendKeys(password);
        this.RegisForm_ConfPass.sendKeys(confPassword);
        this.RegisForm_Submit.click();
    }

    public void regisConfPage(){
        this.wait.until(ExpectedConditions.visibilityOf(this.RegisConf_Flights));
        this.RegisConf_Flights.click();
    }

    public void flightDetails(String noOfPassengers1){
        this.wait.until(ExpectedConditions.visibilityOf(this.flightDetails_Cont));
        Select Passengers = new Select(this.noOfPassengers);
        Passengers.selectByVisibleText(noOfPassengers1);
        this.flightDetails_Cont.click();
    }

    public void selectFlight(){
        this.wait.until(ExpectedConditions.visibilityOf(this.selectFlight_Cont));
        this.selectFlight_Cont.click();
    }

    public void billingDetails(){
        this.wait.until(ExpectedConditions.visibilityOf(this.enterBilling));
        this.enterBilling.click();
    }
    public String getFlightItinerary(){
        this.wait.until(ExpectedConditions.visibilityOf(this.flightItinerary_Price));
        String price = this.flightItinerary_Price.getText();
        System.out.println(price);
        return price;
            }
}
