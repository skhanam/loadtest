package com.test.shoop.pages;

import com.test.shoop.pageobjects.RegistrationPageObjects;
import com.test.shoop.config.AbstractDriver;
import com.test.shoop.config.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.logging.Logger;
import org.junit.Assert;
import com.test.shoop.config.AbstractDriver;


/**
 * Created by thadeus on 24/06/16.
 */
public class RegistrationPage extends AbstractDriver {
    Actions action = new Actions(driver);
   RegistrationPageObjects reg = PageFactory.initElements(driver, RegistrationPageObjects.class);
    private static Logger logger = Logger.getLogger("InfoLogging");
    final String email = "autotest"+System.currentTimeMillis()+"@quidco.com";

 
    public void clickOnRegistrationLink(){
        waitForElementDisplay(reg.registerLink);
        Utility.acceptCookies(driver);
        reg.registerLink.click();
    }


    public void doDefaultRegister(){
        waitForElementDisplay(reg.registerLink);
       reg.registerLink.click();
        reg.firstName.sendKeys("autotest");
        reg.name.sendKeys("foo");
        waitForElementDisplay(reg.userName);
        reg.userName.sendKeys(email);
        reg.emailpassword.sendKeys("Testquality09!");
    }
    public void validaterErrorMessageForTermsandConditions(String terms_conds){
        wait.until(ExpectedConditions.visibilityOf(reg.regErrorMessaging));
        Assert.assertEquals(reg.regErrorMessaging.getText(),terms_conds);
    }

    public void enterFirstNameandName(String firstname,String name){
        waitForElementDisplay(reg.firstName);
        reg.firstName.sendKeys(firstname);
        reg.name.sendKeys(name);
    }

    public void enterUsernameAndPassWord(){
        waitForElementDisplay(reg.userName);
//        final String email = UUID.randomUUID().toString() + "staging" + "qa@quidco.com";

        reg.userName.sendKeys(email);
        reg.emailpassword.sendKeys("Testquality9!");
    }

    public void enterEmailAddressAndPassword(){
 //       for (int idx=0;idx<1; ++idx){
//            UID userid = new UID();
//            final String email =userid.toString().hashCode() +"@quidco.com";
//            final String email = "autotest"+System.currentTimeMillis()+"@gmail.com";
        	waitForElementDisplay(reg.userName);
            logger.info("email being created :"+email);
            reg.userName.sendKeys(email);
            reg.emailpassword.sendKeys("Hannah123L");

    }
    public void acceptShoopTermsAndConditions(){
        ((JavascriptExecutor)driver).executeScript("document.getElementById(\"acceptTerms\").click()");

    }

    public void validateShoopLatestEmailOffersCheckBoxIsChecked(){
            reg.acceptToReceiveShoopOffers.click();
             Assert.assertTrue( reg.acceptToReceiveShoopOffers.isSelected());
    }
    
    public void clickOnRegisterForFreeButton(){
    	 reg.regButton.sendKeys(Keys.TAB);
         reg.regButton.sendKeys(Keys.ENTER);
       
    }

    public void validateNewUserRegistered(String greetings){
        waitForElementDisplay(reg.welcomeGreetings);
        Assert.assertTrue(reg.welcomeGreetings.getText().contains(greetings));

    }
    
    public void validateBICErrorMessage(String errorBIC){
    	waitForElementDisplay(reg.errorMessageBIC);
    	String message = reg.errorMessageBIC.getText();
    	Assert.assertTrue(message.contains(errorBIC));
    }

    public void validateIBANErrorMessage(String errorIBAN){
    	waitForElementDisplay(reg.errorMessageIBAN);
    	String message = reg.errorMessageIBAN.getText();
    	Assert.assertTrue(message.contains(errorIBAN));
    
    }
    
    public void validateEmailErrorMessage(String errorEmail){
    	waitForElementDisplay(reg.errorMessageEmail);
    	String message = reg.errorMessageEmail.getText();
    	Assert.assertTrue(message.contains(errorEmail));
    }
    
    public void validatePasswordErrorMessage(String errorPassword){
    	waitForElementDisplay(reg.errorMessagePassword);
    	String message = reg.errorMessagePassword.getText();
    	Assert.assertTrue(message.contains(errorPassword));
    }
}
