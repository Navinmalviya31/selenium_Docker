package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    protected WebDriver driver;
    @BeforeTest
    public void setUpDriver(ITestContext itx) throws MalformedURLException {
        String host = "localhost";
        DesiredCapabilities dc;
        if(System.getProperty("BROWSER")!= null && System.getProperty("BROWSER")
                .equalsIgnoreCase("firefox")){
            dc = DesiredCapabilities.firefox();
        }
        else{
            dc= DesiredCapabilities.chrome();
        }
        if(System.getProperty("HUB_HOST")!=null){
            host = System.getProperty("HUB_HOST");
            }
        String completeURL = "http://"+ host + ":4444/wd/hub";
        this.driver = new RemoteWebDriver(new URL(completeURL), dc);
        String testName= itx.getCurrentXmlTest().getName();
        dc.setCapability("test", "testName");
        
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }}
