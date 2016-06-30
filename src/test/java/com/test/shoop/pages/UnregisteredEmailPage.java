package com.test.shoop.pages;

import com.test.shoop.helper.Constants;
import com.test.shoop.utility.AbstractDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by thadeus on 14/06/16.
 */
public class UnregisteredEmailPage extends AbstractDriver {

    @FindBy(css = Constants.loginPopup)
    private WebElement loginPopup;
    @FindBy(xpath = Constants.loginLink)
    private WebElement loginLink;
    @FindBy(xpath=Constants.userName)
    private WebElement userName;
    @FindBy(xpath = Constants.password)
    private WebElement password;
    @FindBy(xpath = Constants.loginButton)
    private WebElement loginButton;
    @FindBy(css = Constants.rememberMe)
    private WebElement rememberMe;
    @FindBy(xpath =Constants.invalidemailPassword)
    private WebElement invalidemailPassword;




    public void ClickOnRememberMeCheckBox(){
        waitForElementDisplay(rememberMe);
        rememberMe.click();

    }
    public void enterUnregisteredEmailAddressOnShoop(){
        waitForElementDisplay(userName);
        userName.sendKeys("tseyana+GGGGTester@gmail.com");
        enterUserPasssword();
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
