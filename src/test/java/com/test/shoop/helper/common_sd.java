package com.test.shoop.helper;
import com.test.shoop.pages.HomePage;
import com.test.shoop.pages.LoginPage;
import com.test.shoop.pages.UpdateUserDetailsPage;
import com.test.shoop.config.AbstractDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;



/**
 * Created by thadeus on 14/06/16.
 */
public class common_sd {
    HomePage homePage = new HomePage();
    LoginPage login = PageFactory.initElements(AbstractDriver.driver,LoginPage.class);
    UpdateUserDetailsPage userDetails = PageFactory.initElements(AbstractDriver.driver,UpdateUserDetailsPage.class);

    @When("^I click on the login link$")
    public void i_click_on_the_login_link() throws Throwable {
       login.clickOnLoginLink();

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
