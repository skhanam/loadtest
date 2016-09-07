package com.test.shoop.page_stepdef;

/**
 * Created by laxmimaddali on 07/09/16.
 */
import org.openqa.selenium.support.PageFactory;

import com.test.shoop.config.AbstractDriver;
import com.test.shoop.pages.ValidateErrorMessageLoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ValidateErrorMessageLoginPageStepDef extends AbstractDriver{
	
	
	ValidateErrorMessageLoginPage vemp = PageFactory.initElements(driver, ValidateErrorMessageLoginPage.class);
	
	@And("^I click on To Login option$")
	public void i_click_on_To_Login_option(){
		vemp.clickOnToLoginOption();
	}
	
	@And("^I click on SignIn button$")
	public void i_click_on_SignIn_button(){
		vemp.clickOnSignInButton();
	}
	
	@Then("^I should see email error message stating \"([^\"]*)\"$")
	public void i_should_see_error_message_stating_(String erroremail){
		vemp.validateEmailErrorMessage(erroremail);
	}
	
	@And("^I should also see pass error message as \"([^\"]*)\"$")
	public void i_should_also_see_error_message_as_(String errorpass){
		vemp.validatePasswordErrorMessage(errorpass);
	}

}

