package com.test.shoop.pages;

import org.junit.Assert;
/**
 * Created by laxmimaddali on 07/09/16.
 */
import org.openqa.selenium.support.PageFactory;

import com.test.shoop.config.AbstractDriver;
import com.test.shoop.pageobjects.ValidateErrorMessageLoginPageObjects;

public class ValidateErrorMessageLoginPage extends AbstractDriver{
	
	
	ValidateErrorMessageLoginPageObjects vemlpo = PageFactory.initElements(driver, ValidateErrorMessageLoginPageObjects.class);
	
	public void clickOnToLoginOption(){
		waitForElementDisplay(vemlpo.toLoginButton);
		vemlpo.toLoginButton.click();
	}
	
	public void clickOnSignInButton(){
		waitForElementDisplay(vemlpo.signinButton);
		vemlpo.signinButton.click();
	}
	
	public void validateEmailErrorMessage(String emailError){
		waitForElementDisplay(vemlpo.emailErrorMessage);
		String emailErrorText = vemlpo.emailErrorMessage.getText();
	    Assert.assertTrue(emailError.contains(emailErrorText));
	}
	
	public void validatePasswordErrorMessage(String passError){
		waitForElementDisplay(vemlpo.passwordErrorMessage);
		String passErrorText = vemlpo.passwordErrorMessage.getText();
		Assert.assertTrue(passError.contains(passErrorText));
	}

}
