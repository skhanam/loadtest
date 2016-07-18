package com.test.shoop.page_stepdef;

import com.test.shoop.pages.HomePage;
import cucumber.api.java.en.Given;

/**
 * Created by thadeus on 18/07/16.
 */
public class HomePageStepDef {
    HomePage homePage = new HomePage();
    @Given("^I go to shoop home Page$")
    public void i_go_to_shoop_home_Page() throws Throwable {
        homePage.navigateToHomePage();
        homePage.getUrl();

    }
}
