package com.test.shoop.page_stepdef;

import com.test.shoop.pages.LoginPage;
import com.test.shoop.pages.UnregisteredEmailPage;
import com.test.shoop.utility.DriverFactory;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 14/06/16.
 */
public class UnregisteredEmailStepDef {
    UnregisteredEmailPage unregisteredEmailTest = PageFactory.initElements(DriverFactory.driver,UnregisteredEmailPage.class);
    LoginPage login = PageFactory.initElements(DriverFactory.driver,LoginPage.class);


    @When("^I try to login with an email address that is not registered with Shoop$")
    public void i_try_to_login_with_an_email_address_that_is_not_registered_with_Shoop() throws Throwable {
        login.clickOnLoginLink();
        unregisteredEmailTest.logInWithRandomUnRegisteredEmail();

    }


    @Then("^I should see \"([^\"]*)\" text displayed$")
    public void i_should_see_text_displayed(String arg1) throws Throwable {
        unregisteredEmailTest.validateInvalidEmailPasswordISDisplayed(arg1);

    }

}
