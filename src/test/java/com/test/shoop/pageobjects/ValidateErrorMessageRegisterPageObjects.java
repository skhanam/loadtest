package com.test.shoop.pageobjects;
/**
 * Created by laxmimaddali on 08/09/16.
*/
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValidateErrorMessageRegisterPageObjects {
	
	 @FindBy(id ="register-submit")
	 public WebElement registerButton;
	 @FindBy(xpath ="//form[@name ='registerForm']/div[1]/div/span/span")
	 public WebElement errorEmailReg;
	 @FindBy(xpath ="//form[@name ='registerForm']/div[3]/div/span/span")
	 public WebElement errorPasswordReg;
	 @FindBy(xpath ="//form[@name ='registerForm']/div[5]/div/span/span")
	 public WebElement errorTermsReg;
}
