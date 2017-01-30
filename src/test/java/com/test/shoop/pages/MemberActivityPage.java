package com.test.shoop.pages;

import com.test.shoop.pageobjects.LoginPageObjects;

import com.test.shoop.pageobjects.MemberActivityPageObjects;
import com.test.shoop.config.AbstractDriver;
import com.test.shoop.config.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by thadeus on 13/04/16.
 */
public class MemberActivityPage extends AbstractDriver {

    MemberActivityPageObjects  mempo = PageFactory.initElements(driver, MemberActivityPageObjects.class);
    Actions action = new Actions(driver);
    LoginPageObjects loginpo = PageFactory.initElements(driver, LoginPageObjects.class);
    Logger LOGGER = Logger.getLogger("InfoLogging");


   public void clickOnSignInLink(){
        waitForElementDisplay(mempo.loginLiknk);
        mempo.loginLiknk.click();
    }


    public void clickOnMyActivityPage(){
        driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
        waitForElementDisplay(mempo.myactivityButton);
       mempo.myactivityButton.click();
       // action.moveToElement(mempo.myactivityButton).click().build().perform();

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
    	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        waitForElementDisplay(mempo.settingButton);
          String pageTitle = driver.getTitle();
          System.out.println("page title is --- "+pageTitle);
          driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
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
    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    	Utility.scrollUpWindow(driver);
        new WebDriverWait(driver, 1000).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='nav nav-mega ng-scope']/li[5]/a")));
        waitForElementDisplay(mempo.logOutButton);
        action.moveToElement(mempo.logOutButton).click().build().perform();
       // mempo.logOutButton.click();
       }

    public void validateSignOutComplete(){
    	waitForElementDisplay(mempo.loginLiknk);
        assertTrue(mempo.loginLiknk.isDisplayed());
      }
}
