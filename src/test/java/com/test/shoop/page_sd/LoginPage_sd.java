package com.test.shoop.page_sd;

import com.test.shoop.pages.LoginPage;
import com.test.shoop.utility.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Thadeus Ssweanyana on 3/21/2016.
 */
public class LoginPage_sd {
LoginPage login = PageFactory.initElements(Driver.driver,LoginPage.class);

    @When("^I click on the login button$")
    public void i_click_on_the_login_button() throws Throwable {
        login.clickOnLoginLink();

    }

    @And("^I enter my username and password$")
    public void i_enter_my_username_and_password() throws Throwable {

    }

    @Then("^I should be logged in$")
    public void i_should_be_logged_in() throws Throwable {

    }




}
