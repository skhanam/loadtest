package com.test.shoop.pages;

import com.test.shoop.config.AbstractDriver;
import com.test.shoop.config.Utility;
import com.test.shoop.pageobjects.MYPayementsSettingsPageObjects;
import com.test.shoop.pages.HomePage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;


/**
 * Created by thadeus on 21/07/16.
 */
public class MYPayementsSettingsPage extends AbstractDriver {

    Actions action = new Actions(driver);
    HomePage homePage = new HomePage();
    MYPayementsSettingsPageObjects payment = PageFactory.initElements(AbstractDriver.driver,MYPayementsSettingsPageObjects.class);

    public MYPayementsSettingsPage(){
        PageFactory.initElements(AbstractDriver.driver, payment);
    }

    public void goToMyPaymentSettingsPage(String pageLink) {
        String paymentUrl = homePage.getUrl();
        String paymentPage = paymentUrl + "/utilisateur/"+"/parametres/" + pageLink;
        driver.get(paymentPage);
    }

    public void validateOnUserPaymentPage(){
        assertTrue(payment.memberPayementsPages.isDisplayed());
    }

    public void clickOnModifyYourBillingInformationLink(){
        waitForElementDisplay(payment.modifiedPaymenyLink);
        payment.modifiedPaymenyLink.click();

    }
    public void enterCodeBIC(String accout_num){
        waitForElementDisplay(payment.codeBicField);
        payment.codeBicField.clear();
        payment.codeBicField.sendKeys(accout_num);

    }
    public void enterIBAN(String sort_code){
    	payment.iBANField.clear();
        payment.iBANField.sendKeys(sort_code);

    }
    public void enterTitulaireDuCompte(String n_Name){
    	    payment.nameField.clear();
            payment.nameField.sendKeys(n_Name);
    }
    public void enterMotDePasseShoop(String n_password){
    	 payment.passwordField.clear();
        payment.passwordField.sendKeys(n_password);

    }
    public void clickOnPaymentRecordButton(){
    	Utility.scrollDownWindow(driver,payment.paymentRecordButton );
    	waitForElementDisplay(payment.paymentRecordButton);
        payment.paymentRecordButton.click();

    }
    public void acceptAccountPayementUpdatedTermsAndCond(){
        waitForElementDisplay(payment.alertAccountAdded);
        payment.alertAccountAdded.click();

    }
    public void validateMemberPaymentsSuccessfullyUpdated(String updated_accounts){
        waitForElementDisplay(payment.updateDone);
        assertTrue(payment.updateDone.getText().contains(updated_accounts));
    }
    public void moveToBankingInformationAndClick(){
        waitForElementDisplay(payment.generalSettings);
        payment.generalSettings.click();
        waitForElementDisplay(payment.bankingInfoLink);
        payment.bankingInfoLink.click();
        
       }
    
    public void clickOnPaypalEditButton(){
    	waitForElementDisplay(payment.paypalModifyButton);
    	payment.paypalModifyButton.click();
    }
    
    public void clickOnLinkPapalAccountButton(){
    	waitForElementDisplay(payment.paypalLinkMyAccountutton);
    	payment.paypalLinkMyAccountutton.click();
    }
    
    public void enterPaypalEmail(String email){
    	waitForElementDisplay(payment.paypalEmail);
    	payment.paypalEmail.sendKeys(email);
    }
    
    public void enterPaypalPassword(String password){
    	waitForElementDisplay(payment.paypalPassword);
    	payment.paypalPassword.sendKeys(password);
    }
    
    public void clickOnPaypalLoginButton(){
    	waitForElementDisplay(payment.paypalLoginButton);
    	payment.paypalLoginButton.click();
    }
    
    public void validatePaypalLoginPage(){
    	waitForElementDisplay(payment.validatePaypalLoginPage);
    	payment.validatePaypalLoginPage.isDisplayed();
    }
    
    public void validateSuccessMessage(){
    	waitForElementDisplay(payment.validateSuccessmessage);
    	payment.validateSuccessmessage.isDisplayed();
    }
    
    
    public void validatePaypalAccountLinkSuccessMessage(){
    	waitForElementDisplay(payment.paypalLinkaddedSuccessMessage);
    	payment.paypalLinkaddedSuccessMessage.isDisplayed();
    }
    
    public void clickOnDissociatePaypalLink(){
    	waitForElementDisplay(payment.dissociatePaypallink);
    	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
    	payment.dissociatePaypallink.click();
    	
    }
    
    public void clickOnSignoutLink(){
    	driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        Utility.scrollUpWindow(driver);
        waitForElementDisplay(payment.logOutButton);
        action.moveToElement(payment.logOutButton).click().build().perform();
        
       }
}

