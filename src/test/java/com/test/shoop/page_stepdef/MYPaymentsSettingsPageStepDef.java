package com.test.shoop.page_stepdef;
import com.test.shoop.config.AbstractDriver;
import com.test.shoop.pages.MYPayementsSettingsPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 21/07/16.
 */
public class MYPaymentsSettingsPageStepDef {

    MYPayementsSettingsPage paymentsPage = PageFactory.initElements(AbstractDriver.driver, MYPayementsSettingsPage.class);



    @Given("^I go to \"([^\"]*)\" page$")
    public void i_go_to_page(String arg1) throws Throwable {
        paymentsPage.goToMyPaymentSettingsPage(arg1);
    }
    @Then("^I click on the banking information link$")
    public void i_click_on_the_banking_information_link() throws Throwable {
        paymentsPage.moveToBankingInformationAndClick();
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
     
    @When("^I click on edit link of paypal account$")
    public void i_click_on_edit_link_of_paypal_account(){
    	paymentsPage.clickOnPaypalEditButton();
    }
    
    @And("^I click on link my paypal account button$")
    public void i_click_on_link_my_paypal_account_button(){
    	paymentsPage.clickOnLinkPapalAccountButton();
    }
    
    @Then("^I should be on the Paypal login page$")
    public void i_should_be_on_the_Paypal_login_page(){
    	paymentsPage.validatePaypalLoginPage();
    }
   
    @And("^I enter paypal account emailid as \"([^\"]*)\"$")
    public void i_enter_paypal_account_emailid_as(String emailid){
    	paymentsPage.enterPaypalEmail(emailid);
    }
    
    @And("^I enter paypal account password as \"([^\"]*)\"$")
    public void i_enter_paypal_account_password(String password){
    	paymentsPage.enterPaypalPassword(password);
   }
    
    @And("^I click on sign in button on paypal page$")
    public void i_click_on_sign_in_button_on_paypal_page(){
    	paymentsPage.clickOnPaypalLoginButton();
    }
    
    @Then("^I should see Hi message$")
    public void i_should_see_Hi_message(){
    	paymentsPage.validateSuccessMessage();
    }
     
    @Then("^I should see paypal account added Success message$")
    public void i_should_paypal_account_added_Success_message(){
    	paymentsPage.validatePaypalAccountLinkSuccessMessage();
    } 
    
    
    @And("^I click on Dissociate my paypal account button$")
    public void i_click_on_Dissociate_my_paypal_account_button(){
    	paymentsPage.clickOnDissociatePaypalLink();
    }
    
    @When("^I click on the signout link on paypal link page$")
    public void i_click_on_the_signout_link_on_paypal_link_page() throws Throwable {
    	paymentsPage.clickOnSignoutLink();
    	
    }

}
