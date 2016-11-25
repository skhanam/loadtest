package com.test.shoop.page_stepdef;

import org.openqa.selenium.support.PageFactory;

import com.test.shoop.config.AbstractDriver;
import com.test.shoop.pages.ValidateErrorMessageRegisteredPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ValidatedErrorMessageRegisteredStepDef extends AbstractDriver{
	
ValidateErrorMessageRegisteredPage vemrp = PageFactory.initElements(driver, ValidateErrorMessageRegisteredPage.class);
	
	@And("^I click on the register for free button on regiser page$")
	public void i_click_on_the_register_for_free_button_on_regiser_page(){
		vemrp.clickOnRegisterButton();
	}
	
	@Then("^I should see a error message as \"([^\"]*)\" for email field$")
	public void i_should_see_a_error_message_as_for_email_field(String errorEmailReg){
		vemrp.validateEmailErrorMessage(errorEmailReg);
	}
	
	@And("^I should see a error message as \"([^\"]*)\" for password field$")
	public void i_should_see_a_error_message_as_for_password_field(String errorPassReg){
		vemrp.validatePasswordErrorMessage(errorPassReg);
	}
	
	@And("^I should see a error message as \"([^\"]*)\" for terms section$")
	public void i_should_see_a_error_message_as_for_terms_section(String errorTermsReg){
		vemrp.validateTermsErrorMessage(errorTermsReg);
	}


}
