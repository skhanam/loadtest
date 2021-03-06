package com.test.shoop.page_stepdef;

import com.test.shoop.pages.UpdateUserDetailsPage;
import com.test.shoop.config.AbstractDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 16/06/16.
 */
public class UpdateUserDetailsStepDef {

    UpdateUserDetailsPage userDetails = PageFactory.initElements(AbstractDriver.driver,UpdateUserDetailsPage.class);

    @Then("^I click on the my account settings tab$")
    public void i_click_on_the_my_account_settings_tab() throws Throwable {
        userDetails.clickOnGeneralSettingsLinkLoggedInUser();

    }

    @Given("^I click on modifier link for member names$")
    public void i_click_on_modifier_link_for_member_names() throws Throwable {
       userDetails.clickonNameModifierLink();
    }

    @When("^I enter a new first name as \"([^\"]*)\" and last name as\"([^\"]*)\"$")
    public void i_enter_a_new_first_name_as_and_last_name_as(String arg1, String arg2) throws Throwable {
        userDetails.enterNewFirstNameAndSurnameTOEdit(arg1,arg2);

    }
    @Given("^I click on name record button$")
    public void i_click_on_name_record_button() throws Throwable {
        userDetails.clickOnNameRecordButton();

    }
    @Given("^I click on modifier email modifier link$")
    public void i_click_on_modifier_email_modifier_link() throws Throwable {
          userDetails.clickEmailModifyLink();
    }
    @When("^I enter my new email \"([^\"]*)\" and enter email to confirm \"([^\"]*)\"$")
    public void i_enter_my_new_email_and_enter_email_to_confirm(String arg1, String arg2) throws Throwable {
        userDetails.enterNewEmailAndRe_enterEmailTocomfirmNewEmail(arg1,arg2);
    }

    @When("^I enter my new password as \"([^\"]*)\"$")
    public void i_enter_my_new_password_as(String arg1) throws Throwable {
        userDetails.enterNewPasswordToModify(arg1);
    }

    @Given("^i click on modify link for username$")
    public void i_click_on_modify_link_for_username() throws Throwable {
        userDetails.clickOnModifyUsernameLink();

            }

    @When("^I enter my new username as \"([^\"]*)\"$")
    public void i_enter_my_new_username_as(String arg1) throws Throwable {
        userDetails.enterNewUserName(arg1);

    }
    @When("^I click on username record button$")
    public void i_click_on_username_record_button() throws Throwable {
        userDetails.clickOnUserNameRecordButton();
    }
    @When("^I click on email record button$")
    public void i_click_on_email_record_button() throws Throwable {
        userDetails.clickOnEmailRecordButton();
    }

    @Given("^I click on the modify link for gender$")
    public void i_click_on_the_modify_link_for_gender() throws Throwable {
        userDetails.clickOnGenderModifyLink();

    }

    @When("^I click to select the \"([^\"]*)\" gender$")
    public void i_click_to_select_the_gender(String arg1) throws Throwable {
        userDetails.clickToSelectMaleGenderasOption(arg1);
    }
    @When("^I click on gender record button$")
    public void i_click_on_gender_record_button() throws Throwable {
      userDetails.clickOnGenderRecordButton();
    }

    @Given("^i click on modify link for date of birth$")
    public void i_click_on_modify_link_for_date_of_birth() throws Throwable {
        userDetails.clickDateOfBirthModifyLink();

    }
    @When("^I enter my new day of bith as\"([^\"]*)\"$")
    public void i_enter_my_new_day_of_bith_as(String arg1) throws Throwable {
         userDetails.selectDayOfBirthToEditDOB(arg1);
    }

    @When("^I enter my month of as\"([^\"]*)\"$")
    public void i_enter_my_month_of_as(String arg1) throws Throwable {
          userDetails.selectMonthOfBirthToEditDOB(arg1);
    }

    @When("^I enter and \"([^\"]*)\"of birth as$")
    public void i_enter_and_of_birth_as(String arg1) throws Throwable {
           userDetails.selectYearOfBirthToEditDOB(arg1);
    }
    @When("^I click on DOB record button$")
    public void i_click_on_DOB_record_button() throws Throwable {
       userDetails.clickOnDateOfBirthRecordButton();
    }

    @Given("^I click on the modify link for Postcode$")
    public void i_click_on_the_modify_link_for_Postcode() throws Throwable {
        userDetails.clickOnModifyPostCodeLink();

    }

    @When("^I enter my new post code as\"([^\"]*)\"$")
    public void i_enter_my_new_post_code_as(String arg1) throws Throwable {
        userDetails.enterNewPostCodeToEditExistingPostCode(arg1);

    }
    @When("^I click on postcode record button$")
    public void i_click_on_postcode_record_button() throws Throwable {
        userDetails.clickOnPostCodeRecordButton();

    }
    @Then("^I should see details changed succefully message\"([^\"]*)\" displayed for names$")
    public void i_should_see_details_changed_succefully_message_displayed_for_names(String message){
    	userDetails.validateSuccessMessageName(message);
    }
    @Then("^I should see details changed succefully message\"([^\"]*)\" displayed for email$")
    public void i_should_see_details_changed_succefully_message_displayed_for_email(String message){
    	userDetails.validateSuccessMessageEmail(message);
    }
    @Then("^I should see details changed succefully message\"([^\"]*)\" displayed for username$")
    public void i_should_see_details_changed_succefully_message_displayed_for_username(String message){
    	userDetails.validateSuccessMessageEditUsername(message);
    }
    @Then("^I should see details changed succefully message\"([^\"]*)\" displayed for gender$")
    public void i_should_see_details_changed_succefully_message_displayed_for_gender(String message){
    	userDetails.validateSuccessMessageGender(message);
    }
    @Then("^I should see details changed succefully message\"([^\"]*)\" displayed for DOB$")
    public void i_should_see_details_changed_succefully_message_displayed_for_DOB(String message){
    	userDetails.validateSuccessMessageDOB(message);
    }
    @Then("^I should see details changed succefully message\"([^\"]*)\" displayed for postal code$")
    public void i_should_see_details_changed_succefully_message_displayed_for_postal_code(String message){
    	userDetails.validateSuccessMessagePostalCode(message);
    }

}
