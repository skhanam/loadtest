package com.test.shoop.page_stepdef;

import com.test.shoop.config.AbstractDriver;
import com.test.shoop.pages.MYPayementsSettingsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 21/07/16.
 */
public class MYPaymentsSettingsPageStepDef {

MYPayementsSettingsPage paymentsPage = PageFactory.initElements(AbstractDriver.driver, MYPayementsSettingsPage.class);


    @Given("^I go to member \"([^\"]*)\" payments page$")
    public void i_go_to_member_payments_page(String arg1) throws Throwable {
       paymentsPage.goToMYPaymentSettingsPage(arg1);
    }

    @When("^I click on modify link for payment account$")
    public void i_click_on_modify_link_for_payment_account() throws Throwable {
       paymentsPage.clickOnModifyYourBillingInformationLink();
    }

    @When("^I enter my account number as \"([^\"]*)\"$")
    public void i_enter_my_account_number_as(String arg1) throws Throwable {
     paymentsPage.enterCodeBIC(arg1);
    }

    @When("^I enter my sort as \"([^\"]*)\"$")
    public void i_enter_my_sort_as(String arg1) throws Throwable {
        paymentsPage.enterIBAN(arg1);


    }

    @When("^I enter my new email as \"([^\"]*)\"$")
    public void i_enter_my_new_email_as(String arg1) throws Throwable {
        paymentsPage.enterTitulaireDuCompte(arg1);

    }

    @When("^I enter my new password as\"([^\"]*)\"$")
    public void i_enter_my_new_password_as(String arg1) throws Throwable {
        paymentsPage.enterMotDePasseShoop(arg1);

    }

    @When("^I click on account payment record button$")
    public void i_click_on_account_payment_record_button() throws Throwable {
        paymentsPage.clickOnPaymentRecordButton();

    }
    @When("^I click on Yes to accept user account update terms and conditions$")
    public void i_click_on_Yes_to_accept_user_account_update_terms_and_conditions() throws Throwable {
        paymentsPage.acceptAccountPayementUpdatedTermsAndCond();
    }

    @Then("^I should see successfuly\"([^\"]*)\" updated text$")
    public void i_should_see_successfuly_updated_text(String arg1) throws Throwable {
        paymentsPage.validateMemberPaymentsSuccessfullyUpdated(arg1);

    }

}
