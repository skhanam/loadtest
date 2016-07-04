package com.test.shoop.pages;

import com.test.shoop.helper.Constants;
import com.test.shoop.pageobjects.RegistrationPageObjects;
import com.test.shoop.utility.AbstractDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.UUID;
import static org.junit.Assert.assertTrue;

/**
 * Created by thadeus on 24/06/16.
 */
public class RegistrationPage extends AbstractDriver {
    Actions act = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver,20);
   RegistrationPageObjects reg = new RegistrationPageObjects();
public RegistrationPage()

    {

        PageFactory.initElements(AbstractDriver.driver, reg);

    }
    public void clickOnRegistrationLink(){
        waitForElementDisplay(reg.registerLink);
        reg.registerLink.click();
    }


    public void doDefaultRegister(){
        waitForElementDisplay(reg.registerLink);
       reg.registerLink.click();
        waitForElementDisplay(reg.userName);
        final String email = UUID.randomUUID().toString() + "qa@quidco.com";
        reg.userName.sendKeys(email);
        reg.emailpassword.sendKeys("Testquality09!");

    }

    public void validaterErrorMessageForTermsandConditions(String terms_conds){
        waitForElementDisplay(reg.regErrorMessaging);
        assertTrue(reg.regErrorMessaging.isDisplayed());
        //assertTrue(regErrorMessaging.getText().contains(terms_conds));
    }

    public void enterUsernameAndPassWord(){
        waitForElementDisplay(reg.userName);
        final String email = UUID.randomUUID().toString() + "qa@quidco.com";
        reg.userName.sendKeys(email);
        reg.emailpassword.sendKeys("Testquality09!");
    }
    public void acceptShoopTermsAndConditions(){
        waitForElementDisplay(reg.regTermsAndConditions);
                                 act.
        click(reg.regTermsAndConditions).
                             build().
                            perform();

    }

    public void validateShoopLatestEmailOffersCheckBoxIsChecked(){
       reg.acceptToReceiveShoopOffers.click();
        assertTrue( reg.acceptToReceiveShoopOffers.isSelected());
    }
    public void clickOnRegisterForFreeButton(){
        reg.regButton.click();
    }

    public void validateNewUserRegistered(String greetings){
        waitForElementDisplay(reg.welcomeGreetings);
        assertTrue(reg.welcomeGreetings.getText().contains(greetings));

    }


}
