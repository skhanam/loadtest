package com.test.shoop.pages;

import com.test.shoop.config.AbstractDriver;
import com.test.shoop.config.Utility;
import com.test.shoop.pageobjects.FrequentlyAskedQuestionPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
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
        waitForElementDisplay(questions.whatsthecashback);
        driverWait.toString().contains(c_back);
        String whatsCashBack = questions.whatsthecashback.getText();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        assertTrue(whatsCashBack.contains(c_back));
     }

    public void clickOnShoopHowHeMakesMoneyLink() {
        waitForElementDisplay(questions.howShoopMakesMoney);
        questions.howShoopMakesMoney.click();
    }

    public void validateShoopHowHeMakesMoney(String text_cash) {
        waitForElementDisplay(questions.howShoopMakesMoney);
        driverWait.toString().contains(text_cash);
        String shoopMakesMoney = questions.howShoopMakesMoney.getText();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        assertTrue(shoopMakesMoney.contains(text_cash));
    }

    public void clickOnIsItSafeAndSecureLink() {
        waitForElementDisplay(questions.safeSecure);
        Utility.scrollDownWindow(driver);
        questions.safeSecure.click();

    }

    public void validatesIsItSafeAndSecureLink(String s_secure) {
        waitForElementDisplay(questions.safeSecure);
        driverWait.toString().contains(s_secure);
        String safeSecure = questions.safeSecure.getText();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         assertTrue(safeSecure.contains(s_secure));

    }

    public void clickOncanWeConsultTheOffersBeforeSignUpLink() {
        waitForElementDisplay(questions.consultOfferB4SigningUp);
        Utility.scrollDownWindow(driver);
        questions.consultOfferB4SigningUp.click();
    }

    public void validateCanWeConsultTheOffersBeforeSignUpLink(String offer_signUp) {
        waitForElementDisplay(questions.consultOfferB4SigningUp);
        driverWait.toString().contains(offer_signUp);
        String consultOffer = questions.consultOfferB4SigningUp.getText();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        assertTrue(consultOffer.contains(offer_signUp));
    }

    public void clickOnHowMuchWillIEarnLink() {
    	waitForElementDisplay(questions.HowMuchToEarn);
    	Utility.scrollDownWindow(driver);
    	questions.HowMuchToEarn.click();
    }

    public void ValidateHowMuchWillEarnLink(String c_earing) {
    	waitForElementDisplay(questions.HowMuchToEarn);
    	driverWait.toString().contains(c_earing);
    	String howMuchToEarn = questions.HowMuchToEarn.getText();
    	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	assertTrue(howMuchToEarn.contains(c_earing));

    }

    public void clickOnhowITWorksLink() {
    	 waitForElementDisplay(questions.HowItWorks);
         Utility.scrollDownWindow(driver);
         questions.HowItWorks.click();
         
    }
    
    
    
    public void validateHowITWorksLink(String w_texy) {
        waitForElementDisplay(questions.HowItWorks);
        driverWait.toString().contains(w_texy);
        String howItWorks = questions.HowItWorks.getText();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        assertTrue(howItWorks.contains(w_texy));
    }

    public void clickOnTheContactLink(){  
    	Utility.acceptCookies(driver);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
      	js.executeScript("window.scrollBy(0,250)", "");
      	waitForElementDisplay(questions.contactUs);
           questions.contactUs.click();
    }
    
    public void ValidateOnTheContactLinkPage(){
    	 waitForElementDisplay(questions.contactPage);
    	 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        assertTrue(questions.contactPage.isDisplayed());
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.getTitle();
    }

}