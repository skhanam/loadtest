package com.test.shoop.pageobjects;


/**
 * Created by laxmimaddali on 07/09/16.
 */
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValidateErrorMessageLoginPageObjects {
	
	 @FindBy(xpath ="//*[@id='header-login-link']/span/span")
	 public WebElement toLoginButton;
	 @FindBy(xpath = "//button[@type='submit']")
	 public WebElement signinButton;
	 @FindBy(xpath ="//div[@class='row mb20']/div/form/div[1]/div/span/span")
	 public WebElement emailErrorMessage;
	 @FindBy(xpath ="//div[@class='row mb20']/div/form/div[3]/div/span/span")
	 public WebElement passwordErrorMessage;

	 
	 
}

