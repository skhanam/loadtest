package com.test.shoop.page_stepdef;

import com.test.shoop.pages.LoginPage;
import com.test.shoop.pages.RegistrationPage;
import com.test.shoop.utility.AbstractDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 24/06/16.
 */
public class RegistrationPageStepDef {
    LoginPage login = PageFactory.initElements(AbstractDriver.driver,LoginPage.class);

    RegistrationPage reg = PageFactory.initElements(AbstractDriver.driver,RegistrationPage.class);

    @When("^I click on the register link$")
    public void i_click_on_the_register_link() throws Throwable {
        reg.clickOnRegistrationLink();
    }

    @When("^I enter my email and password$")
    public void i_enter_my_email_and_password() throws Throwable {
        reg.enterUsernameAndPassWord();
    }

    @When("^I accept shoop terms and conditions$")
    public void i_accept_shoop_terms_and_conditions() throws Throwable {
        reg.acceptShoopTermsAndConditions();
    }

    @When("^I click on the register for free button$")
    public void i_click_on_the_register_for_free_button() throws Throwable {
        reg.clickOnRegisterForFreeButton();
    }
    @When("^I click on to accept latest email offers$")
    public void i_click_on_to_accept_latest_email_offers() throws Throwable {
        reg.validateShoopLatestEmailOffersCheckBoxIsChecked();
    }

    @Then("^I should see agreeting message\"([^\"]*)\" for new registered user$")
    public void i_should_see_agreeting_message_for_new_registered_user(String arg1) throws Throwable {
                reg.validateNewUserRegistered(arg1);
    }

    @When("^I register with my email address and password$")
    public void i_register_with_my_email_address_and_password() throws Throwable {
        login.newUserlogout();
        reg.doDefaultRegister();
    }

    @When("^I click on the register button$")
    public void i_click_on_the_register_button() throws Throwable {
        reg.clickOnRegisterForFreeButton();
    }

    @Then("^I should see message \"([^\"]*)\" advising me to accept the terms and conditions$")
    public void i_should_see_message_advising_me_to_accept_the_terms_and_conditions(String arg1) throws Throwable {
        reg.validaterErrorMessageForTermsandConditions(arg1);
    }

}
