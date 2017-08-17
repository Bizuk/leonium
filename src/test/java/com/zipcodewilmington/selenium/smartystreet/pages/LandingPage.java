package com.zipcodewilmington.selenium.smartystreet.pages;


import com.zipcodewilmington.selenium.tools.browsertools.WebCrawl;
import com.zipcodewilmington.selenium.tools.browsertools.WebPage;
import org.openqa.selenium.By;

/**
 * Created by leon on 8/17/17.
 */
public class LandingPage extends WebPage {
    public final By byButtonDemo = By.id("#header-demo");

    public LandingPage(WebCrawl crawler) {
        super(crawler);
    }

}