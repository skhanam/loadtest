package com.test.shoop.page_stepdef;

import com.test.shoop.pages.RegistrationPage;
import com.test.shoop.utility.DriverFactory;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 24/06/16.
 */
public class RegistrationPageStepDef {


    RegistrationPage reg = PageFactory.initElements(DriverFactory.driver,RegistrationPage.class);

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

}
