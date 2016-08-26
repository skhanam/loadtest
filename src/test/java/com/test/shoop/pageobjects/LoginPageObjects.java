package com.test.shoop.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shabanakhanum on 6/30/16.
 * 
 */

public class LoginPageObjects {
	
    @FindBy(name ="login-link")
    public WebElement loginLink;
    @FindBy(xpath = "//input[@type='email']")
    public WebElement userName;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement emailpassword;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;
    @FindBy(xpath = "html/body/div[1]/div/div[1]/h1/span[2]")
    public WebElement logi;
    @FindBy(xpath= "html/body/header/div[2]/div/div[1]/ul/li[1]/a/span/span")
    public WebElement loggedIn;
    @FindBy(xpath= "//html/body/div[2]/div/div[1]/h1/span/span")
    public WebElement successMessage;
    @FindBy(css = "h1.greeting-header > span.ng-binding.ng-scope")
    public WebElement confirmUserLogged;
    @FindBy(xpath = "html/body/header/div[2]/div/div[1]/ul/li[1]/a/span/span")
    public WebElement myAccount;
    @FindBy(css = ".ng-scope:contains('Mon compte')")
    public WebElement userAccount;
    @FindBy(xpath = "//*[@id='signOut']")
    public WebElement signOutLink;
    @FindBy(xpath = "html/body/div[1]/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[2]/div")
    public WebElement incorrectlogindetails;
    @FindBy(xpath = "//div[@class='container']/a[2]")
	public WebElement cookie;
 
}
