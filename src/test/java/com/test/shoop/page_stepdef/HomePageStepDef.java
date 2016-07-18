package com.test.shoop.page_stepdef;

import com.test.shoop.pages.HomePage;
import com.test.shoop.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by thadeus on 18/07/16.
 */
public class HomePageStepDef {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Given("^I go to shoop home Page$")
    public void i_go_to_shoop_home_Page() throws Throwable {
        homePage.navigateToHomePage();
        homePage.getUrl();

    }

    @Given("^user logged in$")
    public void user_logged_in() throws Throwable {
        loginPage.doDefaultLogin();
    }

    @When("^I click on the login link$")
    public void i_click_on_the_login_link() throws Throwable {
        loginPage.clickOnLoginLink();

    }

    @And("^I enter my username$")
    public void i_enter_my_username() throws Throwable {
        loginPage.enterUsername();
    }

    @And("^I enter my password$")
    public void i_enter_my_password() throws Throwable {
        loginPage.enterMemberPassword();
    }
    @And("^I click on the login button$")
    public void i_click_on_login_button() throws Throwable {
        loginPage.clickLoginButton();
    }

    @Then("^I should be logged in to my account$")
    public void i_should_be_logged_in_to_my_account() throws Throwable {
        loginPage.validateUserLoggedIn();
    }

}
