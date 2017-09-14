package com.test.shoop.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by thadeus on 07/07/16.
 */
public class UnregisteredEmailPageObjects {

    @FindBy(xpath = "//a[contains(@href,'je-me-connecte')]")
    public WebElement loginLink;
    @FindBy(xpath = "//input[@type='email']")
    public WebElement userName;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement emailpassword;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;
    @FindBy(xpath = "html/body/div[1]/div/div[1]/h1/span[2]")
    public WebElement logi;
    @FindBy(css = ".qp-flash-notification.active")
    public static WebElement loggedIn;
    @FindBy(css = "h1.greeting-header > span.ng-binding.ng-scope")
    public WebElement confirmUserLogged;
    @FindBy(xpath = "html/body/header/div[2]/div/div[1]/ul/li[1]/a/span/span")
    public WebElement myAccount;
    @FindBy(css = ".ng-scope:contains('Mon compte')")
    public WebElement userAccount;
    @FindBy(xpath = "//*[@id='signOut']")
    public WebElement signOutLink;
    @FindBy(xpath="html/body/div[2]/msm-shoop/div/msm-login-page/div/div/div/div/div/div/div/msm-error-codes/ul/li/span/p")
    public WebElement incorrectlogindetails;
    @FindBy(css = "#persist_signin")
    public WebElement rememberMe;
    @FindBy(xpath ="html/body/div[2]/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[2]/div")
    public WebElement invalidemailPassword;
   @FindBy(xpath= "//input[@type='password']")
    public WebElement password;





}
