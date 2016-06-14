package com.test.shoop.pages;

import com.test.shoop.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by thadeus on 14/06/16.
 */
public class UnregisteredEmailTest extends Driver{

    @FindBy(css = "h1.mb20 > span.ng-scope")
    private WebElement loginPopup;
    @FindBy(xpath = "//a[contains(@href,'je-me-connecte')]")
    private WebElement loginLink;
    @FindBy(name="username")
    private WebElement userName;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;
    @FindBy(css = "#persist_signin")
    private WebElement rememberMe;

    @FindBy(xpath ="html/body/div[2]/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[2]/div")
    private WebElement invalidemailPassword;

    public void ClickOnRememberMeCheckBox(){
        waitForElementDisplay(rememberMe);
        rememberMe.click();

    }
    public void enterUnregisteredEmailAddressOnShoop(){
        waitForElementDisplay(userName);
        userName.sendKeys("tseyana+GGGGTester@gmail.com");
    }
    public void enterUserPasssword(){
        waitForElementDisplay(password);
        password.sendKeys("kalanzi09");
    }

    public void clickOnUnLoginButton(){
        waitForElementDisplay(loginButton);
        loginButton.click();
    }


    public void validateInvalidEmailPasswordISDisplayed(String invalid_info){
        waitForElementDisplay(invalidemailPassword);
        assertTrue(invalidemailPassword.getText().contains(invalid_info));

    }

}
