package com.flight.scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageObjects {
        public static WebElement element;
    public static String RegisForm_FirstNameS = "firstName";
    public static String RegisForm_LastName = "lastName";
    public static String RegisForm_UserName = "email";
    public static String RegisForm_Pass = "password";
    public static String RegisForm_ConfPass = "confirmPassword";
    public static String RegisForm_Submit = "register";
    public static String RegisConf_Flights = "flight-link";
    public static String flightDetails_Cont = "findFlights";
    public static String selectFlight_Cont = "reserveFlights";
    public static String enterBilling = "buyFlights";
    public static String flightItinerary_Conf = "Flight Confirmation";
    public static String flightItinerary_Price = "//*[@id=\"confirm-table\"]/tbody/tr[3]/td[2]/font";


        public static WebElement RegisForm_FirstName(WebDriver driver){
            element = driver.findElement(By.name(RegisForm_FirstNameS));
            return element;
        }
        public static WebElement RegisForm_LastName(WebDriver driver){
            element = driver.findElement(By.name(RegisForm_LastName));
            return element;
        }
        public static WebElement RegisForm_Uname(WebDriver driver) {
            element = driver.findElement(By.name(RegisForm_UserName));
            return element;
        }

        public static WebElement RegisForm_Pass(WebDriver driver){
            element = driver.findElement(By.name(RegisForm_Pass));
            return element;
        }
        public static WebElement RegisForm_ConfPass(WebDriver driver){
            element = driver.findElement(By.name(RegisForm_ConfPass));
            return element;
        }
        public static WebElement RegisForm_Submit(WebDriver driver){
            element = driver.findElement(By.name(RegisForm_Submit));
            return element;
        }
        public static WebElement RegisConf_Flights(WebDriver driver){
            element = driver.findElement(By.name(RegisConf_Flights));
            return element;
        }
        public static WebElement flightDetails_Cont(WebDriver driver){
            element = driver.findElement(By.name(flightDetails_Cont));
            return element;
        }
        public static WebElement selectFlight_Cont(WebDriver driver){
            element = driver.findElement(By.name(selectFlight_Cont));
            return element;
        }
        public static WebElement enterBilling(WebDriver driver){
            element = driver.findElement(By.name(enterBilling));
            return element;
        }
        public static WebElement flightItinerary_Conf(WebDriver driver){
            element = driver.findElement(By.name(flightItinerary_Conf));
            return element;
        }
        public static WebElement flightItinerary_Price(WebDriver driver){
            element = driver.findElement(By.name(flightItinerary_Price));
            return element;
        }


}
