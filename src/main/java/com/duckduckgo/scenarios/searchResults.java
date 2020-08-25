package com.duckduckgo.scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class searchResults {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(id = "search_button_homepage")
    private WebElement submit;

    @FindBy(partialLinkText = "Videos")
    private WebElement videoLink;

    @FindBy(className = "tile--vid")
    private List<WebElement> videosList;

    public searchResults(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
        PageFactory.initElements(driver, this);
    }

    public void searchDuck(String keyword){
    driver.get("https://duckduckgo.com/");
    wait.until(ExpectedConditions.visibilityOf(this.searchBox));
    this.searchBox.sendKeys(keyword);
    this.submit.click();
    this.wait.until(ExpectedConditions.visibilityOf(this.videoLink));
    this.videoLink.click();
     }

     public int getvideos(){
        int numberOfVideos = this.videosList.size();
        return numberOfVideos;
     }
}
