package com.test.shoop.pages;

import com.test.shoop.helper.Constants;
import com.test.shoop.utility.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Thadeus Ssweanyana on 3/21/2016.
 */
public class LoginPage extends DriverFactory {
    Actions build = new Actions(DriverFactory.driver);


    @FindBy(xpath = Constants.loginLink)
    private WebElement loginLink;
    @FindBy(xpath = Constants.userName)
    private WebElement userName;
    @FindBy(xpath = Constants.emailpassword)
    private WebElement emailpassword;
    @FindBy(xpath = Constants.loginButton)
    private WebElement loginButton;
    @FindBy(xpath = Constants.logi)
    private WebElement logi;
    @FindBy(css = Constants.loggedIn)
    private WebElement loggedIn;
    @FindBy(css = Constants.confirmUserLogged)
    private WebElement confirmUserLogged;
    @FindBy(xpath = Constants.myAccount)
    private WebElement myAccount;
    @FindBy(css = Constants.userAccount)
    private WebElement userAccount;
    @FindBy(css = Constants.signOutLink)
    private WebElement signOutLink;
    @FindBy(xpath = Constants.incorrectlogindetails)
    private WebElement incorrectlogindetails;


    public void clickOnLoginLink() {
        waitForElementDisplay(loginLink);
        if(loggedIn.isDisplayed())
        loginLink.click();
    }

    public void doDefaultLogin() {
        loginLink.click();
        waitForElementDisplay(userName);
        userName.sendKeys("t.ssewanyana@quidco.com");
        emailpassword.clear();
        emailpassword.sendKeys("kalanzi09");
        loginButton.click();

    }

    public void enterUsername() {

        waitForElementDisplay(userName);
        userName.sendKeys("t.ssewanyana@quidco.com");

    }

    public void clickLoginButton() {
        waitForElementDisplay(loginButton);
        loginButton.click();
    }

    public void enterMemberPassword() {
        emailpassword.clear();
        emailpassword.sendKeys("kalanzi09");
    }

    public void validateUserLoggedIn() {
        waitForElementDisplay(loggedIn);
        loggedIn.click();
        assertTrue(loggedIn.isDisplayed());
    }

    public void loginMember() {
        waitForElementDisplay(loginLink);
        loginLink.click();
        userName.sendKeys("t.ssewanyana@quidco.com");
        emailpassword.sendKeys("kalanzi09");
        loggedIn.click();
    }

    public void logOutUser() {
        waitForElementDisplay(myAccount);
        build.click(myAccount).build().perform();
        build.moveToElement(signOutLink).
                click().
                build().
                perform();
    }


    public void enterUsernameAndIncorrectPassWord() {
        waitForElementDisplay(userName);
        userName.sendKeys("t.ssewanyana@quidco.com");
        emailpassword.sendKeys("kalanzi0");
        loginButton.click();
    }

    public void validateUserInvaliddetailsIsdisplayed() {
        waitForElementDisplay(loggedIn);
        assertTrue(incorrectlogindetails.isDisplayed());
        System.out.println(incorrectlogindetails.getText());

    }

    public void validateUserIsLogged() {
        waitForElementDisplay(loginLink);
        if (loginLink.isDisplayed()) {
            doDefaultLogin();
        }
    }
}

