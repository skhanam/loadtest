package com.test.shoop.pages;

import com.test.shoop.helper.Constants;
<<<<<<< HEAD
=======
import com.test.shoop.pageobjects.LoginPageObjects;
>>>>>>> ac177e21239f16fcabc17f5264133f73c8d2f62e
import com.test.shoop.pageobjects.MemberActivityPageObjects;
import com.test.shoop.utility.AbstractDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

/**
 * Created by thadeus on 13/04/16.
 */
public class MemberActivityPage extends AbstractDriver {
    MemberActivityPageObjects activity = new MemberActivityPageObjects();
    Actions action = new Actions(driver);
   public MemberActivityPage() {

<<<<<<< HEAD
       PageFactory.initElements(AbstractDriver.driver, activity);
=======
    MemberActivityPageObjects  mempo = new MemberActivityPageObjects();
    LoginPageObjects loginpo = new LoginPageObjects();
>>>>>>> ac177e21239f16fcabc17f5264133f73c8d2f62e

   }

    public void clickOnSignInLink(){
<<<<<<< HEAD
       waitForElementDisplay(activity.loginLiknk);
        activity.loginLiknk.click();
    }

    public void clickOnMyActivityPage(){
        waitForElementDisplay(activity.myactiviyButton);
        activity.myactiviyButton.click();
=======
       waitForElementDisplay(loginpo.loginLink);
        loginpo.loginLink.click();
    }

    public void clickOnMyActivityPage(){
        waitForElementDisplay(mempo.myactivityButton);
        mempo.myactivityButton.click();
>>>>>>> ac177e21239f16fcabc17f5264133f73c8d2f62e


    }
    public void validateOnMyActivityPage(){
<<<<<<< HEAD
        waitForElementDisplay(activity.userActivityPage);
        assertTrue(activity.userActivityPage.isDisplayed());
    }

    public void clickOnMPaymentsPage(){
        waitForElementDisplay(activity.paymentbutton);
        activity.paymentbutton.click();
=======
        waitForElementDisplay(mempo.userActivityPage);
        assertTrue(mempo.userActivityPage.isDisplayed());
    }

    public void clickOnMPaymentsPage(){
        waitForElementDisplay(mempo.paymentbutton);
        mempo.paymentbutton.click();
>>>>>>> ac177e21239f16fcabc17f5264133f73c8d2f62e


    }
    public void validateOnPaymentsPage(){
<<<<<<< HEAD
        waitForElementDisplay(activity.yourBalanceLink);
        assertTrue(activity.yourBalanceLink.isDisplayed());
    }
    public void clickAndAndvalidateOnSettingPage(){
        waitForElementDisplay(activity.settingButton);
        activity.settingButton.click();

    }
    public void validateOnEditEmailSettingPage(){
        waitForElementDisplay(activity.settingPage);
        assertTrue(activity.settingPage.isDisplayed());
    }

    public void clickOnSignoutLink() {
        waitForElementDisplay(activity.logOutButton);
        //if(myAccountButton.isDisplayed()){
        activity.logOutButton.click();
        // }
=======
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



>>>>>>> ac177e21239f16fcabc17f5264133f73c8d2f62e
    }

    public void validateSignOutComplete(){
<<<<<<< HEAD
        waitForElementDisplay(activity.loginLiknk);
        assertTrue(activity.loginLiknk.isDisplayed());
=======
        waitForElementDisplay(loginpo.loginLink);
        assertTrue(loginpo.loginLink.isDisplayed());
>>>>>>> ac177e21239f16fcabc17f5264133f73c8d2f62e

    }
}
