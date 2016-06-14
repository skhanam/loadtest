package com.test.shoop.page_sd;

import com.test.shoop.pages.UnregisteredEmailTest;
import com.test.shoop.utility.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 14/06/16.
 */
public class UnregisteredEmailTest_sd {
    UnregisteredEmailTest unregisteredEmailTest = PageFactory.initElements(Driver.driver,UnregisteredEmailTest.class);

    @When("^I enter an email address that is not registered with Shoop$")
    public void i_enter_an_email_address_that_is_not_registered_with_Shoop() throws Throwable {
        unregisteredEmailTest.enterUnregisteredEmailAddressOnShoop();

    }

    @When("^I enter my password$")
    public void i_enter_my_password() throws Throwable {
        unregisteredEmailTest.enterUserPasssword();

    }
    @When("^I click on the login button$")
    public void i_click_on_the_login_button() throws Throwable {
        unregisteredEmailTest.clickOnUnLoginButton();

    }

    @Then("^I should see \"([^\"]*)\" text displayed$")
    public void i_should_see_text_displayed(String arg1) throws Throwable {
        unregisteredEmailTest.validateInvalidEmailPasswordISDisplayed(arg1);

    }

}
