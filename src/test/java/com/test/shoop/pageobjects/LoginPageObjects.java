package com.test.shoop.pageobjects;

import com.test.shoop.helper.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shabanakhanum on 6/30/16.
 */
public class LoginPageObjects {

    @FindBy(xpath = Constants.loginLink)
    public WebElement loginLink;
    @FindBy(xpath = Constants.userName)
    public WebElement userName;
    @FindBy(xpath = Constants.emailpassword)
    public WebElement emailpassword;
    @FindBy(xpath = Constants.loginButton)
    public WebElement loginButton;
    @FindBy(xpath = Constants.logi)
    public WebElement logi;
    @FindBy(css = Constants.loggedIn)
    public static WebElement loggedIn;
    @FindBy(css = Constants.confirmUserLogged)
    public WebElement confirmUserLogged;
    @FindBy(xpath = Constants.myAccount)
    public WebElement myAccount;
    @FindBy(css = Constants.userAccount)
    public WebElement userAccount;
    @FindBy(xpath = Constants.signOutLink)
    public WebElement signOutLink;
    @FindBy(xpath = Constants.incorrectlogindetails)
    public WebElement incorrectlogindetails;
}
