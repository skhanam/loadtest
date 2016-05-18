package com.test.shoop.page_sd;

import com.test.shoop.pages.LoginPage;
import com.test.shoop.pages.MemberPage;
import com.test.shoop.utility.Driver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


/**
 * Created by thadeus on 13/04/16.
 */
public class MemberPage_sd {
    LoginPage login = PageFactory.initElements(Driver.driver,LoginPage.class);
    MemberPage memberpage= PageFactory.initElements(Driver.driver, MemberPage.class);

    @When("^I click on the login link$")
    public void i_click_on_the_login_link() throws Throwable {
        memberpage.clickOnSignInLink();

    }

    @Then("^I should be logged in to my account$")
    public void i_should_be_logged_in_to_my_account() throws Throwable {
        login.validateUserLoggedIn();

    }

    @Then("^The tabs listed below should be displayed$")
    public void the_tabs_listed_below_should_be_displayed(DataTable table)  throws Throwable {
        List<List<String>> tabs = table.raw();
        memberpage.validateTabsonAccountPage(tabs);

    }

    @When("^I click on the signout link$")
    public void i_click_on_the_signout_link() throws Throwable {
        memberpage.clickOnSignoutLink();

    }

    @Then("^I should be logged out of my account$")
    public void i_should_be_logged_out_of_my_account() throws Throwable {
        memberpage.validateSignOutComplete();

    }



}
