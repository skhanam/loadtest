package com.test.shoop.pages;

import com.test.shoop.helper.Constants;
import com.test.shoop.utility.Driver;
import org.junit.Assert;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.DrivenSeleniumLauncher;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by thadeus on 13/04/16.
 */
public class MemberTestActivityPage extends Driver{

    @FindBy(xpath = Constants.memberArea)
    private WebElement memberArea;
    @FindBy(xpath = Constants.loginLink)
    private WebElement loginLiknk;
    @FindBy(xpath = Constants.myAccountButton)
    private WebElement myAccountButton;
    @FindBy(xpath = Constants.yourBalanceLink)
    private WebElement yourBalanceLink;
    @FindBy(xpath = Constants.paymentbutton)
    private WebElement paymentbutton;
    @FindBy(xpath = Constants.myactiviyButton)
    private WebElement myactiviyButton;
    @FindBy(xpath = Constants.userActivityPage)
    private WebElement userActivityPage;
    @FindBy(xpath = Constants.settingButton)
    private  WebElement settingButton;
    @FindBy(xpath = Constants.emailModifierLink)
    private WebElement emailModifierLink;
    @FindBy(xpath = Constants.logOutButton )
    private WebElement logOutButton;

    String memberTabs= "//*[@id='user.activity.%s']";


    public void clickOnSignInLink(){
       waitForElementDisplay(loginLiknk);
        loginLiknk.click();
    }

    public void clickOnMyActivityPage(){
        waitForElementDisplay(myactiviyButton);
        myactiviyButton.click();


    }
    public void validateOnMyActivityPage(){
        waitForElementDisplay(userActivityPage);
        assertTrue(userActivityPage.isDisplayed());
    }

    public void clickOnMPaymentsPage(){
        waitForElementDisplay(paymentbutton);
        paymentbutton.click();


    }
    public void validateOnPaymentsPage(){
        waitForElementDisplay(yourBalanceLink);
        assertTrue(yourBalanceLink.isDisplayed());
    }
    public void clickAndAndvalidateOnSettingPage(){
        waitForElementDisplay(settingButton);
        settingButton.click();

    }
    public void validateOnEditEmailSettingPage(){
        assertTrue(emailModifierLink.isDisplayed());
    }

    public void clickOnSignoutLink(){
        waitForElementDisplay(logOutButton);
        logOutButton.click();

    }
    public void validateSignOutComplete(){
        waitForElementDisplay(loginLiknk);
        assertTrue(loginLiknk.isDisplayed());

    }
}
