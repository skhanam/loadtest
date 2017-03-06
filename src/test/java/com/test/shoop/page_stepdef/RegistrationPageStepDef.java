package com.test.shoop.page_stepdef;

import com.test.shoop.pages.LoginPage;
import com.test.shoop.pages.RegistrationPage;
import com.test.shoop.config.AbstractDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import static com.test.shoop.config.AbstractDriver.driver;

/**
 * Created by thadeus on 24/06/16.
 */
public class RegistrationPageStepDef {
    LoginPage login = PageFactory.initElements(driver,LoginPage.class);

    RegistrationPage reg = PageFactory.initElements(driver,RegistrationPage.class);

    @When("^I click on the register link$")
    public void i_click_on_the_register_link() throws Throwable {
        reg.clickOnRegistrationLink();
    }

    @And("^I enter firstname as \"([^\"]*)\" and last name as \"([^\"]*)\"$")
    public void i_enter_firstname_as_and_last_name_as(String firstname, String name){
       reg.enterFirstNameandName(firstname,name);
    }

    @When("^I enter my email and password$")
    public void i_enter_my_email_and_password() throws Throwable {
        reg.enterEmailAddressAndPassword();
       // reg.enterUsernameAndPassWord();
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
    
    @Then("^I should see error message as \"([^\"]*)\" for BIC$")
    public void i_should_see_error_message_as_for_BIC(String errorBIC){
    	reg.validateBICErrorMessage(errorBIC);
    }
    
    @And("^I should see error message as \"([^\"]*)\" for IBAN$")
    public void i_should_see_error_message_as_for_IBAN(String errorIBAN){
    	reg.validateIBANErrorMessage(errorIBAN);
    }
    
    @And("^I should see error message as \"([^\"]*)\" for email field$")
    public void i_should_see_error_message_as_for_email_field(String errorEmail){
    	reg.validateEmailErrorMessage(errorEmail);
    }
    
    @And("^I should see error message as \"([^\"]*)\" for password field$")
    public void i_should_see_error_message_as_for_password_field(String errorPassword){
    	reg.validatePasswordErrorMessage(errorPassword);
    }
    

}
