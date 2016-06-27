package com.test.shoop.pages;

import com.sun.org.apache.regexp.internal.RE;
import com.test.shoop.helper.Constants;
import com.test.shoop.utility.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.UUID;

import static org.junit.Assert.assertTrue;

/**
 * Created by thadeus on 24/06/16.
 */
public class RegistrationPage extends DriverFactory {
    Actions act = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver,20);
    @FindBy(xpath = "html/body/header/div[2]/div/div[1]/ul/li[1]/a/span/span")
    private WebElement registerLink;
    @FindBy(xpath= Constants.userName)
    private WebElement userName;
    @FindBy(xpath = Constants.password)
    private WebElement password;
    private WebElement userEmail;
    @FindBy(name = "password")
    private WebElement emailpassword;
    @FindBy(xpath= "html/body/div[2]/div/div[2]/div[1]/div/div[2]/form/div[3]/label/span[1]/span")
    private WebElement acceptShoopTerms;
    @FindBy(xpath = Constants.regTermsAndConditions)
    private WebElement regTermsAndConditions;
    @FindBy(xpath = Constants.loginButton)
    private WebElement regButton;
    @FindBy(css = Constants.regWelcome)
    private WebElement regWelcome;
    @FindBy(css = ".ng-scope:contains('Bonjour')")
    private WebElement welcomeText;
    @FindBy(css=Constants.regErrorMessage)
    private WebElement regErrorMessaging;
    @FindBy(css=".greeting-header>span")
    private WebElement regGreetings;


    public void clickOnRegistrationLink(){
        waitForElementDisplay(registerLink);
        registerLink.click();
    }

    public void doDefaultRegister(){
        waitForElementDisplay(registerLink);
        registerLink.click();
        final String email = UUID.randomUUID().toString() + "@quidco.com";
        userName.sendKeys(email);
        emailpassword.sendKeys("Testquality09!");

    }

    public void validaterErrorMessageForTermsandConditions(String terms_conds){
        waitForElementDisplay(regErrorMessaging);
        assertTrue(regErrorMessaging.isDisplayed());
        //assertTrue(regErrorMessaging.getText().contains(terms_conds));
    }

    public void enterUsernameAndPassWord(){
        waitForElementDisplay(userName);
        final String email = UUID.randomUUID().toString() + "@quidco.com";
        userName.sendKeys(email);
        emailpassword.sendKeys("Testquality09!");
    }
    public void acceptShoopTermsAndConditions(){
        waitForElementDisplay(regTermsAndConditions);
        act.
        click(regTermsAndConditions).
                build().
                perform();



    }

    public void validateShoopLatestEmailOffersCheckBoxIsChecked(){
        acceptShoopTerms.click();
        assertTrue( acceptShoopTerms.isSelected());
    }
    public void clickOnRegisterForFreeButton(){
        regButton.click();
    }

    public void validateNewUserRegistered(String greetings){
        waitForElementDisplay(regGreetings);
        assertTrue(regGreetings.getText().contains(greetings));

    }


}
