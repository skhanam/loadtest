package com.test.shoop.page_stepdef;

import com.test.shoop.pages.UnregisteredEmailPage;
import com.test.shoop.config.AbstractDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 14/06/16.
 */
public class UnregisteredEmailStepDef {
    UnregisteredEmailPage unregisteredEmailTest = PageFactory.initElements(AbstractDriver.driver,UnregisteredEmailPage.class);


    @When("^I enter an email address that is not registered on Shoop$")
    public void i_enter_an_email_address_that_is_not_registered_on_Shoop() throws Throwable {
         unregisteredEmailTest.enterUnregisteredEmailAddressOnShoop();


    }
    @Then("^I should see \"([^\"]*)\" text displayed$")
    public void i_should_see_text_displayed(String arg1) throws Throwable {
        unregisteredEmailTest.validateInvalidEmailPasswordISDisplayed(arg1);

    }

}
