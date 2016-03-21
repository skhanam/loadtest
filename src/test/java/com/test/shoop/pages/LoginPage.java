package com.test.shoop.pages;

import com.test.shoop.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Thadeus Ssweanyana on 3/21/2016.
 */
public class LoginPage extends Driver {

    @FindBy(css = "h1.mb20 > span.ng-scope")
    private WebElement loginPopup;
    @FindBy(xpath = "//li[2]/a/span/span")
    private WebElement loginLink;
    @FindBy(xpath= "//input[@type='email']")
    private WebElement username;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement emailpassword;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;
    @FindBy(css= "html/body/div[1]/div/div[1]/h1/span[2]")
    private WebElement loggedIn;
    @FindBy(css = "h1.greeting-header > span.ng-binding.ng-scope")
    private WebElement confirmUserLogged;



    public void clickOnLoginLink(){
        waitForElementDisplay(loginLink);
        loginLink.click();
    }
    public void enterUsernameAndPassWord(String u_name, String u_password){
        waitForElementDisplay(username);

    }

}
