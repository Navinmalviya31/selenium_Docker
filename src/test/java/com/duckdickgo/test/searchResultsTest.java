package com.duckdickgo.test;

import com.duckduckgo.scenarios.searchResults;
import com.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class searchResultsTest extends BaseTest {

    @Parameters({"keyword"})
    @Test
    public void searchResultTest(String keyword){
        searchResults sr = new searchResults(driver);
        sr.searchDuck(keyword);
        int nuOfVideos = sr.getvideos();
        System.out.println(nuOfVideos);
        Assert.assertTrue(nuOfVideos>0);

    }


}
