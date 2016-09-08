package com.test.shoop.pages;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
/**
 * Created by laxmimaddali on 08/09/16.
*/
import com.test.shoop.config.AbstractDriver;
import com.test.shoop.pageobjects.ValidateErrorMessageRegisterPageObjects;

public class ValidateErrorMessageRegisterPage extends AbstractDriver{
	
	ValidateErrorMessageRegisterPageObjects vemrpo = PageFactory.initElements(driver, ValidateErrorMessageRegisterPageObjects.class);
	
	
	public void clickOnRegisterButton(){
		waitForElementDisplay(vemrpo.registerButton);
		vemrpo.registerButton.click();
		
	}
	
	public void validateEmailErrorMessage(String errorEmailReg){
		waitForElementDisplay(vemrpo.errorEmailReg);
		String message = vemrpo.errorEmailReg.getText();
		Assert.assertTrue(message.contains(errorEmailReg));
	}
	
	public void validatePasswordErrorMessage(String errorPassReg){
		waitForElementDisplay(vemrpo.errorPasswordReg);
		String message = vemrpo.errorPasswordReg.getText();
		Assert.assertTrue(message.contains(errorPassReg));
	}
	
	public void validateTermsErrorMessage(String errorTermsReg){
		waitForElementDisplay(vemrpo.errorTermsReg);
		String message = vemrpo.errorTermsReg.getText();
		Assert.assertTrue(message.contains(errorTermsReg));
	}

}
