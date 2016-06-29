package com.test.shoop.pages;

import com.test.shoop.helper.Constants;
import com.test.shoop.utility.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.UUID;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by thadeus on 14/06/16.
 */
public class UnregisteredEmailPage extends DriverFactory {
    Actions action= new Actions(DriverFactory.driver);

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
    @FindBy(xpath = Constants.myAccount)
    private WebElement myAccount;
    @FindBy(xpath = Constants.signOutLink)
    private WebElement signOutLink;

public void clickOnHomePageLoginLink(){
    if (myAccount.isDisplayed()){
        myAccount.click();
        waitForElementDisplay(signOutLink);
      signOutLink.click();
    }
    loginLink.click();
}

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

    public void clickOnLoginButton(){
        waitForElementDisplay(loginButton);
        action.moveToElement(loginButton).
                click().
                build().
                perform();
    }
 public void logInWithRandomUnRegisteredEmail(){
     waitForElementDisplay(userName);
     final String mail = UUID.randomUUID().toString() + "@gmail.com";
     userName.sendKeys(mail);
     password.sendKeys("Testquality09!");
     clickOnLoginButton();

 }

    public void validateInvalidEmailPasswordISDisplayed(String invalid_info){
        waitForElementDisplay(invalidemailPassword);
        assertTrue(invalidemailPassword.getText().contains(invalid_info));

    }

}
