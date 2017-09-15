package com.test.shoop.pages;

import com.test.shoop.config.AbstractDriver;
import com.test.shoop.config.Utility;
import com.test.shoop.pageobjects.FrequentlyAskedQuestionPageObjects;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;



/**
 * Created by thadeus on 14/07/16.
 */
public class FrequentlyAskedQuestionsPage extends AbstractDriver {
    
	FrequentlyAskedQuestionPageObjects questions = PageFactory.initElements(driver, FrequentlyAskedQuestionPageObjects.class);
      WebDriverWait driverWait = new WebDriverWait(driver, 200);

    public void clickOnByTheWaywhatsTheCashbackLink() {
        waitForElementDisplay(questions.whatsthecashback);
        questions.whatsthecashback.click();
    }

    public void validateTheWaywhatsTheCashbackLink(String c_back) {
        waitForElementDisplay(questions.whatsthecashbackText);
        driverWait.toString().contains(c_back);
        String whatsCashBack = questions.whatsthecashbackText.getText();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        assertTrue(whatsCashBack.contains(c_back));
     }

    public void clickOnShoopHowHeMakesMoneyLink() {
        waitForElementDisplay(questions.howShoopMakesMoney);
        questions.howShoopMakesMoney.click();
    }

    public void validateShoopHowHeMakesMoney(String text_cash) {
        waitForElementDisplay(questions.howShoopMakesMoneyText);
        driverWait.toString().contains(text_cash);
        String shoopMakesMoney = questions.howShoopMakesMoneyText.getText();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        assertTrue(shoopMakesMoney.contains(text_cash));
    }

    public void clickOnIsItSafeAndSecureLink() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions.safeSecure);
        waitForElementDisplay(questions.safeSecure);
        //questions.safeSecure.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", questions.safeSecure);

    }

    public void validatesIsItSafeAndSecureLink(String s_secure) {
        waitForElementDisplay(questions.safeSecureText);
       driverWait.toString().contains(s_secure);
        String safeSecure = questions.safeSecureText.getText();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
         assertTrue(safeSecure.contains(s_secure));

    }

    public void clickOncanWeConsultTheOffersBeforeSignUpLink() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions.consultOfferB4SigningUp);
       waitForElementDisplay(questions.consultOfferB4SigningUp);
        //questions.consultOfferB4SigningUp.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", questions.consultOfferB4SigningUp);
    }

    public void validateCanWeConsultTheOffersBeforeSignUpLink(String offer_signUp) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions.consultOfferB4SigningUp);
        driverWait.toString().contains(offer_signUp);
        String consultOffer = questions.consultOfferB4SigningUpText.getText();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        assertTrue(consultOffer.contains(offer_signUp));
    }

    public void clickOnHowMuchWillIEarnLink() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions.HowMuchToEarn);
    	waitForElementDisplay(questions.HowMuchToEarn);
       // questions.HowMuchToEarn.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", questions.HowMuchToEarn);
    }

    public void ValidateHowMuchWillEarnLink(String c_earing) {
    	waitForElementDisplay(questions.HowMuchToEarnText);
    	driverWait.toString().contains(c_earing);
    	String howMuchToEarn = questions.HowMuchToEarnText.getText();
    	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    	assertTrue(howMuchToEarn.contains(c_earing));

    }

    public void clickOnhowITWorksLink() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions.HowItWorks);
    	waitForElementDisplay(questions.HowItWorks);
         //questions.HowItWorks.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", questions.HowItWorks);
   }
    
    public void validateHowITWorksLink(String w_texy) {
        waitForElementDisplay(questions.HowItWorksText);
        driverWait.toString().contains(w_texy);
        String howItWorks = questions.HowItWorksText.getText();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        assertTrue(howItWorks.contains(w_texy));
    }

    public void clickOnTheContactLink(){  
    	//Utility.acceptCookies(driver);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions.contactUs);
    	//JavascriptExecutor js = (JavascriptExecutor) driver;
      //	js.executeScript("window.scrollBy(0,250)", "");
        waitForElementDisplay(questions.contactUs);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", questions.contactUs);
    }
    
    public void ValidateOnTheContactLinkPage(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questions.contactPage);
    	 waitForElementDisplay(questions.contactPage);
    	 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        assertTrue(questions.contactPage.isDisplayed());
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.getTitle();
    }

}