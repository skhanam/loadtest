package com.test.shoop.pages;

import com.test.shoop.pageobjects.LoginPageObjects;

import com.test.shoop.pageobjects.MemberActivityPageObjects;
import com.test.shoop.config.AbstractDriver;
import com.test.shoop.config.Utility;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

/**
 * Created by thadeus on 13/04/16.
 */
public class MemberActivityPage extends AbstractDriver {

    MemberActivityPageObjects  mempo = new MemberActivityPageObjects();
    Actions action = new Actions(driver);


    public MemberActivityPage() {

       PageFactory.initElements(AbstractDriver.driver, mempo);
        LoginPageObjects loginpo = new LoginPageObjects();


   }

    public void clickOnSignInLink(){
        waitForElementDisplay(mempo.loginLiknk);
        mempo.loginLiknk.click();
    }


    public void clickOnMyActivityPage(){
        waitForElementDisplay(mempo.myactivityButton);
        mempo.myactivityButton.click();

    }
    public void validateOnMyActivityPage(){

        waitForElementDisplay(mempo.userActivityPage);
        assertTrue(mempo.userActivityPage.isDisplayed());
    }

    public void clickOnMPaymentsPage(){
        waitForElementDisplay(mempo.paymentbutton);
        mempo.paymentbutton.click();

    }
    public void validateOnPaymentsPage(String title) throws InterruptedException{
    	  driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
          String pageTitle = driver.getTitle();
    	 Assert.assertTrue(title.equals(pageTitle));
        
    }

    public void clickAndAndvalidateUserOnSettingPage(){
        waitForElementDisplay(mempo.settingButton);
        mempo.settingButton.click();

    }
    public void validateOnEditEmailSettingPage(){
        waitForElementDisplay(mempo.settingPage);
        assertTrue(mempo.settingPage.isDisplayed());
    }

    public void clickOnSignoutLink(){
        waitForElementDisplay(mempo.logOutButton);
        mempo.logOutButton.click();
       }

    public void validateSignOutComplete(){
    	waitForElementDisplay(mempo.loginLiknk);
        assertTrue(mempo.loginLiknk.isDisplayed());
      }
}
