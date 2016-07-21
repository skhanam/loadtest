package com.test.shoop.pages;

import com.test.shoop.config.AbstractDriver;
import com.test.shoop.pageobjects.MYPayementsSettingsPageObjects;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;


/**
 * Created by thadeus on 21/07/16.
 */
public class MYPayementsSettingsPage extends AbstractDriver {
    HomePage homePage = new HomePage();
    MYPayementsSettingsPageObjects payment =new MYPayementsSettingsPageObjects();

    public MYPayementsSettingsPage () {
        PageFactory.initElements(AbstractDriver.driver,payment);
    }

    public void goToMYPaymentSettingsPage(String pageLink){
        String paymentUrl = homePage.getUrl();
        String paymentPage = paymentUrl+ "/c/"+ pageLink;
        driver.get( paymentPage);

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
        payment.codeBicField.sendKeys(accout_num);

    }
    public void enterIBAN(String sort_code){
        payment.iBANField.sendKeys(sort_code);

    }
    public void enterTitulaireDuCompte(String n_Name){
            payment.nameField.sendKeys(n_Name);
    }
    public void enterMotDePasseShoop(String n_password){
        payment.passwordField.sendKeys(n_password);

    }
    public void clickOnPaymentRecordButton(){
        payment.paymentRecordButton.click();

    }
    public void acceptAccountPayementUpdatedTermsAndCond(){
        waitForElementDisplay(payment.alertAccountAdded);
        driver.switchTo().alert().accept();
        payment.alertAccountAdded.click();

    }
    public void validateMemberPaymentsSuccessfullyUpdated(String updated_accounts){
        waitForElementDisplay(payment.updateDone);
        assertTrue(payment.updateDone.getText().contains(updated_accounts));
    }

}
