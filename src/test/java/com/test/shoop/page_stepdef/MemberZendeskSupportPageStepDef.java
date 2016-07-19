package com.test.shoop.page_stepdef;

import com.test.shoop.config.AbstractDriver;
import com.test.shoop.pages.MemberZenDeskSupportPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.PageFactory.initElements;

/**
 * Created by thadeus on 19/07/16.
 */
public class MemberZendeskSupportPageStepDef {
    MemberZenDeskSupportPage supportPage = initElements(AbstractDriver.driver,MemberZenDeskSupportPage.class);


    @When("^I click on the 'Aide' link in the top right hand corner$")
    public void i_click_on_the_Aide_link_in_the_top_right_hand_corner() throws Throwable {
        supportPage.clickOnTheAidLink();

    }

    @Then("^I should be on the zendesk portal$")
    public void i_should_be_on_the_zendesk_portal() throws Throwable {
        supportPage.ValidateUserOnSupportPage();

    }

}
