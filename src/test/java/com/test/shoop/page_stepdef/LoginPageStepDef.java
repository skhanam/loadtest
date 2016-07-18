package com.test.shoop.page_stepdef;

import com.test.shoop.pages.HomePage;
import com.test.shoop.pages.LoginPage;
import com.test.shoop.config.AbstractDriver;
import com.test.shoop.pages.UpdateUserDetailsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Thadeus Ssweanyana on 3/21/2016.
 */
public class LoginPageStepDef {

    LoginPage login = PageFactory.initElements(AbstractDriver.driver,LoginPage.class);
    HomePage homePage = new HomePage();
    UpdateUserDetailsPage userDetails = PageFactory.initElements(AbstractDriver.driver,UpdateUserDetailsPage.class);

    @When("^I click on the login link$")
    public void i_click_on_the_login_link() throws Throwable {
        login.clickOnLoginLink();

    }

    @And("^I enter my username$")
    public void i_enter_my_username() throws Throwable {
        login.enterUsername();
    }

    @And("^I enter my password$")
    public void i_enter_my_password() throws Throwable {
        login.enterMemberPassword();
    }
    @And("^I click on the login button$")
    public void i_click_on_login_button() throws Throwable {
        login.clickLoginButton();
    }

    @Then("^I should be logged in to my account$")
    public void i_should_be_logged_in_to_my_account() throws Throwable {
        login.validateUserLoggedIn();
    }
    @And("^I am currently signed out$")
    public void i_am_currently_signed_out() throws Throwable {
        login.logOutUser();

    }

    @When("^I enter my username and an incorrect password$")
    public void i_enter_my_username_and_an_incorrect_password() throws Throwable {
        login.enterUsernameAndIncorrectPassWord();

    }

    @Then("^I should not be logged in$")
    public void i_should_not_be_logged_in() throws Throwable {
        login.validateUserInvaliddetailsIsdisplayed();

    }

    @Given("^I am currently signed in$")
    public void i_am_currently_signed_in() throws Throwable {
        login.validateUserInvaliddetailsIsdisplayed();
    }

    @Then("^I should be logged out$")
    public void i_should_be_logged_out() throws Throwable {
        login.logOutUser();

    }


    @Then("^I should see details changed succefully message\"([^\"]*)\" displayed$")
    public void i_should_see_details_changed_succefully_message_displayed(String arg1) throws Throwable {
        userDetails.validateYourModificationIsSuccessfulMessageDisplayed(arg1);

    }
    @Given("^I am logged into shoop$")
    public void i_am_logged_into_shoop() throws Throwable {
        homePage.navigateToHomePage();
        login.validateUserIsLogged();

    }


}
