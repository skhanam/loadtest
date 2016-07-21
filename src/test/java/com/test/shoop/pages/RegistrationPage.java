package com.test.shoop.pages;
import com.test.shoop.pageobjects.RegistrationPageObjects;
import com.test.shoop.config.AbstractDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;

/**
 * Created by thadeus on 24/06/16.
 */
public class RegistrationPage extends AbstractDriver {
    Actions action = new Actions(driver);
   RegistrationPageObjects reg = new RegistrationPageObjects();
    private static Logger logger = Logger.getLogger("InfoLogging");
    final String email = "autotest"+System.currentTimeMillis()+"@quidco.com";

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
//        final String email = "autotest"+System.currentTimeMillis() +"staging"+ "@quidco.com";

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
//        final String email = UUID.randomUUID().toString() + "staging" + "qa@quidco.com";

        reg.userName.sendKeys(email);
        reg.emailpassword.sendKeys("Testquality9!");
    }

    public void enterEmailAddressAndPassword(){
        for (int idx=0;idx<1; ++idx){
//            UID userid = new UID();
//            final String email =userid.toString().hashCode() +"@quidco.com";
//            final String email = "autotest"+System.currentTimeMillis()+"@gmail.com";
            logger.info("email being created :"+email);
            reg.userName.sendKeys(email);
            reg.emailpassword.sendKeys("Hannah123L");
        }
    }
    public void acceptShoopTermsAndConditions(){
            waitForElementDisplay(reg.regTermsAndConditions);
            action.moveToElement(reg.regTermsAndConditions).click().build().perform();
           
//         reg.regTermsAndConditions.click();

    }

    public void validateShoopLatestEmailOffersCheckBoxIsChecked(){
            reg.acceptToReceiveShoopOffers.click();
             assertTrue( reg.acceptToReceiveShoopOffers.isSelected());
    }
    public void clickOnRegisterForFreeButton(){
       // scrollPageIncreaseElementVisibilty();
        waitForElementDisplay(reg.regButton);
        reg.regButton.sendKeys(Keys.TAB);
        reg.regButton.sendKeys(Keys.ENTER);
        //reg.regButton.click();
    }

    public void validateNewUserRegistered(String greetings){
        waitForElementDisplay(reg.welcomeGreetings);
        assertTrue(reg.welcomeGreetings.getText().contains(greetings));

    }


}
