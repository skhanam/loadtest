package com.test.shoop.pages;
import com.test.shoop.config.AbstractDriver;
import com.test.shoop.pageobjects.MYPayementsSettingsPageObjects;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertTrue;


/**
 * Created by thadeus on 21/07/16.
 */
public class MYPayementsSettingsPage extends AbstractDriver {

    Actions action = new Actions(driver);
    HomePage homePage = new HomePage();
    MYPayementsSettingsPageObjects payment = new MYPayementsSettingsPageObjects();

    public void MYPayementsSettingsPage(){
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
    public void moveToBankingInformationAndClick(){
        waitForElementDisplay(payment.generalSettings);
        action.click(payment.generalSettings).
                moveToElement(payment.bankingInfoLink).
                click().
                build().
                perform();
    }

}
