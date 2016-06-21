package com.test.shoop.page_sd;

import com.test.shoop.pages.LoginPage;
import com.test.shoop.pages.SignedMemberTest;
import com.test.shoop.utility.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by thadeus on 13/04/16.
 */
public class SignedMemberTest_sd {
    LoginPage login = PageFactory.initElements(Driver.driver,LoginPage.class);
    SignedMemberTest memberpage= PageFactory.initElements(Driver.driver, SignedMemberTest.class);


    @Given("^I click on a member my activity link$")
    public void i_click_on_a_member_my_activity_link() throws Throwable {
        memberpage.clickOnMyActivityPage();
    }
    @Then("^I should be on the my activity page$")
    public void i_should_be_on_the_my_activity_page() throws Throwable {
        memberpage.validateOnMyActivityPage();
    }


        @Then("^I click on the  my payments  tab link$")
    public void i_click_on_the_my_payments_tab_link() throws Throwable {
        memberpage.clickOnMPaymentsPage();

    }
    @Then("^i should  see  the your balance on payments page$")
    public void i_should_see_the_your_balance_on_payments_page() throws Throwable {
        memberpage.validateOnPaymentsPage();
            }

    @Then("^I click on the setting link$")
    public void i_click_on_the_setting_link() throws Throwable {
        memberpage.clickAndAndvalidateOnSettingPage();
    }
    @Then("^I should see the  edit emaillink$")
    public void i_should_see_the_edit_emaillink() throws Throwable {
        memberpage.validateOnEditEmailSettingPage();
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
