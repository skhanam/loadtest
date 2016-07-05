package com.test.shoop.pages;

import com.test.shoop.helper.Constants;
import com.test.shoop.pageobjects.LoginPageObjects;
import com.test.shoop.pageobjects.MemberActivityPageObjects;
import com.test.shoop.utility.AbstractDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

/**
 * Created by thadeus on 13/04/16.
 */
public class MemberActivityPage extends AbstractDriver {

    MemberActivityPageObjects  mempo = new MemberActivityPageObjects();
    LoginPageObjects loginpo = new LoginPageObjects();


    public void clickOnSignInLink(){
       waitForElementDisplay(loginpo.loginLink);
        loginpo.loginLink.click();
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
    public void validateOnPaymentsPage(){
        waitForElementDisplay(mempo.yourBalanceLink);
        assertTrue(mempo.yourBalanceLink.isDisplayed());
    }
    public void clickAndAndvalidateOnSettingPage(){
        waitForElementDisplay(mempo.settingButton);
        mempo.settingButton.click();

    }
    public void validateOnEditEmailSettingPage(){
        waitForElementDisplay(mempo.settingPage);
        assertTrue(mempo.settingPage.isDisplayed());
    }

    public void clickOnSignoutLink(){
        waitForElementDisplay(mempo.logOutButton);
       //if(myAccountButton.isDisplayed()){
        mempo.logOutButton.click();
       //}



    }
    public void validateSignOutComplete(){
        waitForElementDisplay(loginpo.loginLink);
        assertTrue(loginpo.loginLink.isDisplayed());

    }
}
