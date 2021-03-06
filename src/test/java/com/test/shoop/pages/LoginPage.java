package com.test.shoop.pages;
import com.test.shoop.config.UserCredentials;
import com.test.shoop.config.Utility;
import com.test.shoop.page_stepdef.LoginPageStepDef;
import com.test.shoop.pageobjects.LoginPageObjects;
import com.test.shoop.config.AbstractDriver;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


import java.util.concurrent.TimeUnit;
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
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        loginpo.loginLink.click();
        Utility.acceptCookies(driver);
         waitForElementDisplay(loginpo.userName);
        credentials = new UserCredentials("foo12666@bar.com","testQA!12");
        loginpo.userName.sendKeys(credentials.getUserName());
        loginpo.emailpassword.clear();
        loginpo.emailpassword.sendKeys(credentials.getPassword());
        Utility.scrollDownWindow(driver, loginpo.loginButton);
        loginpo.loginButton.click();

    }

    public void enterUsername() {
        waitForElementDisplay(loginpo.userName);
        loginpo.userName.clear();
        loginpo.userName.sendKeys("foo12666@bar.com");

    }

    public void clickLoginButton() {
    	 Utility.scrollDownWindow(driver,loginpo.loginButton );
        waitForElementDisplay(loginpo.loginButton);
        Utility.acceptCookies(driver);
        loginpo.loginButton.click();
    }

    public void enterMemberPassword() {
        loginpo.emailpassword.clear();
        loginpo.emailpassword.sendKeys("testQA!12");
    }

    public void validateUserLoggedIn() throws InterruptedException {
    	driver.manage().deleteAllCookies();
    	Thread.sleep(1000);
        waitForElementDisplay(loginpo.loggedIn);
        assertTrue(loginpo.loggedIn.isDisplayed());
    }

    public void loginMember() {
        waitForElementDisplay(loginpo.loginLink);
        loginpo.loginLink.click();
        loginpo.userName.sendKeys("foo12666@bar.com");
        loginpo.emailpassword.sendKeys("testQA!12");
        loginpo.loggedIn.click();
    }
    
    public void validateLoginPage(String message){
    	waitForElementDisplay(loginpo.successMessage);
    	String successMessage = loginpo.successMessage.getText();
    	Assert.assertTrue(successMessage.equals(message));
    }

    public void logOutUser() {
        driver.navigate().refresh();
        waitForElementDisplay(loginpo.myAccount);
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        build.click(loginpo.myAccount).build().perform();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        loginpo.signOutLink.click();
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

