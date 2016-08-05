package com.test.shoop.pages;

import com.test.shoop.config.UserCredentials;
import com.test.shoop.page_stepdef.LoginPageStepDef;
import com.test.shoop.pageobjects.LoginPageObjects;
import com.test.shoop.config.AbstractDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Thadeus Ssweanyana on 3/21/2016.
 */
public class LoginPage extends AbstractDriver {

    Actions build = new Actions(AbstractDriver.driver);
    LoginPageObjects loginpo = new LoginPageObjects();
    UserCredentials credentials;
    private static Logger logger = Logger.getLogger("InfoLogging");

    public LoginPage( ) {
        // loadPage();
        PageFactory.initElements(driver,loginpo);
    }



    public void clickOnLoginLink() {
         waitForElementDisplay(loginpo.loginLink);
        loginpo.loginLink.click();
    }

    public void clickOnHomePageLoginLink(){
        if (loginpo.myAccount.isDisplayed()){
            logOutUser();
              }
        clickOnLoginLink();
    }


    public void doDefaultLogin() {
        loginpo.loginLink.click();
        waitForElementDisplay(loginpo.userName);
        credentials = new UserCredentials("quidcoqa@quidco.com","testQA!12");
        loginpo.userName.sendKeys(credentials.getUserName());
        loginpo.emailpassword.clear();
        loginpo.emailpassword.sendKeys(credentials.getPassword());
        loginpo.loginButton.click();

    }

    public void enterUsername() {
        waitForElementDisplay(loginpo.userName);
        loginpo.userName.clear();
        loginpo.userName.sendKeys("quidcoqa@quidco.com");

    }

    public void clickLoginButton() {
        waitForElementDisplay(loginpo.loginButton);
        loginpo.loginButton.click();
    }

    public void enterMemberPassword() {
        loginpo.emailpassword.clear();
        loginpo.emailpassword.sendKeys("testQA!12");
    }

    public void validateUserLoggedIn() {
        waitForElementDisplay(loginpo.loggedIn);
        assertTrue(loginpo.loggedIn.isDisplayed());
    }

    public void loginMember() {
        waitForElementDisplay(loginpo.loginLink);
        loginpo.loginLink.click();
        loginpo.userName.sendKeys("quidcoqa@quidco.com");
        loginpo.emailpassword.sendKeys("testQA!12");
        loginpo.loggedIn.click();
    }

    public void logOutUser() {
        waitForElementDisplay(loginpo.myAccount);
        build.click(loginpo.myAccount).build().perform();
        loginpo.signOutLink.click();
       build.moveToElement(loginpo.signOutLink).
                click().
                build().
                perform();
    }


    public void enterUsernameAndIncorrectPassWord() {
        waitForElementDisplay(loginpo.userName);
        loginpo.userName.sendKeys("quidcoqa@quidco.com");
        loginpo.emailpassword.sendKeys("kalanzi0");
        loginpo.loginButton.click();
    }

    public void validateUserInvaliddetailsIsdisplayed() {
        waitForElementDisplay(loginpo.loggedIn);
        assertTrue(loginpo.incorrectlogindetails.isDisplayed());
        logger.info(loginpo.incorrectlogindetails.getText());

    }
    public void newUserlogout(){
        if (loginpo.myAccount.isDisplayed()){
            logOutUser();

     }

    }

    public void validateUserIsLogged() {
        logger.info("print the webelemnt  :  "+ loginpo.loginLink);
        waitForElementDisplay(loginpo.loginLink);
        if (loginpo.loginLink.isDisplayed()) {
            doDefaultLogin();
        }
    }

}

