package com.test.shoop.pageobjects;

import com.test.shoop.helper.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by thadeus on 04/07/16.
 */
public class RegistrationPageObjects {

    @FindBy(xpath = Constants.registrationLink)
   public WebElement registerLink;
    @FindBy(xpath= Constants.userName)
   public WebElement userName;
    @FindBy(xpath = Constants.password)
   public WebElement password;
   public WebElement userEmail;
    @FindBy(name = "password")
   public WebElement emailpassword;
    @FindBy(xpath=Constants.acceptToReceiveShoopOffers)
   public WebElement acceptToReceiveShoopOffers;
    @FindBy(xpath = Constants.regTermsAndConditions)
   public WebElement regTermsAndConditions;
    @FindBy(xpath = Constants.loginButton)
   public WebElement regButton;
    @FindBy(css = Constants.welcomeGreetings)
   public WebElement welcomeGreetings;
//    @FindBy(css = Constants.loggedIn)
//   public WebElement loggedIn;
    @FindBy(css=Constants.regErrorMessage)
   public WebElement regErrorMessaging;
    @FindBy(css=".greeting-header>span")
   public WebElement regGreetings;
    
}
