package com.test.shoop.pages;

import com.test.shoop.utility.Driver;

import java.io.IOException;


/**
 * Created by sewadeus on 20/03/2016.
 */
public class HomePage extends Driver {

    public void navigateToHomePage(){
        driver.get(CONFIG.getProperty("HomePageUrl"));
    }

    public String getUrl(){
        return CONFIG.getProperty("HomePageUrl");
    }



}
