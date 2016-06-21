package com.test.shoop.pages;

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
public class SignedMemberTest extends Driver{

    @FindBy(xpath = "html/body/header/div[2]/div/div[3]/nav/div[1]/div/ul/li[2]/a")
    private WebElement memberArea;
    @FindBy(xpath = "html/body/header/div[2]/div/div[1]/ul/li[2]/a/span/span")
    private WebElement loginLiknk;
    @FindBy(xpath = "html/body/header/div[2]/div/div[1]/ul/li[1]/a/span/span")
    private WebElement myAccountButton;
    @FindBy(xpath = "html/body/div[2]/div/ui-view/div/p/span/span")
    private WebElement yourBalanceLink;
    @FindBy(xpath = "//*[@id='user.payments']")
    private WebElement paymentbutton;
    @FindBy(xpath = "//*[@id='user.activity.purchases']")
    private WebElement myactiviyButton;
    @FindBy(xpath = "//*[@id='col-date']")
    private WebElement calendarDate;
    @FindBy(xpath = "//*[@id='user.settings.general']")
    private  WebElement settingButton;
    @FindBy(xpath = "html/body/div[2]/div/ui-view/div/div/div/div[2]/div/div[2]/div[1]/div[1]")
    private WebElement editEmail;
    @FindBy(xpath = "//a[@id='signOut']")
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

        assertTrue(calendarDate.isDisplayed());
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
        assertTrue(editEmail.isDisplayed());
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
