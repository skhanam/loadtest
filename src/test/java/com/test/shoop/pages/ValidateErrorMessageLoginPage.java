package com.test.shoop.pages;

import org.junit.Assert;
/**
 * Created by laxmimaddali on 07/09/16.
 */
import org.openqa.selenium.support.PageFactory;

import com.test.shoop.config.AbstractDriver;
import com.test.shoop.pageobjects.ValidateErrorMessageLoginPageObject;





public class ValidateErrorMessageLoginPage extends AbstractDriver{
	
	ValidateErrorMessageLoginPageObject vemlpo = PageFactory.initElements(driver, ValidateErrorMessageLoginPageObject.class);
	
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
		System.out.println("pass error is ----"+passErrorText);
		System.out.println("given pass error is "+passError );
		Assert.assertTrue(passError.contains(passErrorText));
	}

}
