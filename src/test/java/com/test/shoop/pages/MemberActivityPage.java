package com.test.shoop.pages;

import com.test.shoop.helper.Constants;
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

       PageFactory.initElements(AbstractDriver.driver, activity);

   }

    public void clickOnSignInLink(){
       waitForElementDisplay(activity.loginLiknk);
        activity.loginLiknk.click();
    }

    public void clickOnMyActivityPage(){
        waitForElementDisplay(activity.myactiviyButton);
        activity.myactiviyButton.click();


    }
    public void validateOnMyActivityPage(){
        waitForElementDisplay(activity.userActivityPage);
        assertTrue(activity.userActivityPage.isDisplayed());
    }

    public void clickOnMPaymentsPage(){
        waitForElementDisplay(activity.paymentbutton);
        activity.paymentbutton.click();


    }
    public void validateOnPaymentsPage(){
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
    }

    public void validateSignOutComplete(){
        waitForElementDisplay(activity.loginLiknk);
        assertTrue(activity.loginLiknk.isDisplayed());

    }
}
