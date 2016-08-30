package com.test.shoop.pages;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.test.shoop.config.AbstractDriver;
import com.test.shoop.config.Utility;
import com.test.shoop.pageobjects.UpdateUserPageObjects;

/**
 * Created by thadeus on 16/06/16.
 */
public class UpdateUserDetailsPage extends AbstractDriver {

    UpdateUserPageObjects uupo = PageFactory.initElements(driver,UpdateUserPageObjects.class);
    Actions action = new Actions(driver);

      public void clickOnGeneralSettingsLinkLoggedInUser() {
        waitForElementDisplay(uupo.generalSettings);
        uupo.generalSettings.click();
    }

    public void clickOnNameRecordButton() {
        waitForElementDisplay(uupo.submitEditDataButton);
        action.
                click(uupo.submitEditDataButton).
                build().
                perform();
    }
    public void clickOnUserNameRecordButton(){
        waitForElementDisplay(uupo.usernamerRecordButton);
        uupo.usernamerRecordButton.click();
    }
    public void clickOnGenderRecordButton(){
     waitForElementDisplay(uupo.genderRecordButton);
        uupo.genderRecordButton.click();
    }
    public void clickOnDateOfBirthRecordButton(){
        waitForElementDisplay(uupo.doBRecordButton);
        uupo.doBRecordButton.click();

    }
    public void clickOnEmailRecordButton(){
        waitForElementDisplay(uupo.emailRecordButton);
        uupo.emailRecordButton.sendKeys(Keys.TAB);
        //uupo.emailRecordButton.sendKeys(Keys.ENTER);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", uupo.emailRecordButton);
       // action.moveToElement(uupo.emailRecordButton).click().build().perform();
        //uupo.emailRecordButton.click();

    }
    public void clickOnPostCodeRecordButton(){
        waitForElementDisplay(uupo.postcodeRecordButton);
        uupo.postcodeRecordButton.click();

    }

    public void enterNewFirstNameAndSurnameTOEdit(String f_name, String s_name) {
        waitForElementDisplay(uupo.editFname);
        uupo.editFname.clear();
        uupo.editFname.sendKeys(f_name);
        uupo.editLname.clear();
        uupo.editLname.sendKeys(s_name);
    }


    public void enterNewEmailAndRe_enterEmailTocomfirmNewEmail(String n_Email, String c_Email) {
        waitForElementDisplay(uupo.editEmail);
        uupo.editEmail.clear();
        uupo.editEmail.sendKeys(n_Email);
        waitForElementDisplay(uupo.emailConfirmation);
        uupo.emailConfirmation.clear();
        uupo.emailConfirmation.sendKeys(c_Email);
    }

    public void enterNewPasswordToModify(String u_password) {
        waitForElementDisplay(uupo.editPassword);
        uupo.editPassword.clear();
        uupo.editPassword.sendKeys(u_password);
    }

    public void validateYourModificationIsSuccessfulMessageDisplayed(String success_text) {
        waitForElementDisplay(uupo.successfulUpdates);
        Assert.assertTrue(uupo.successfulUpdates.getText().contains(success_text));

    }

    public void clickonNameModifierLink() {
        waitForElementDisplay(uupo.nameModifierLink);
        uupo.nameModifierLink.click();
    }

    public void clickEmailModifyLink() {
        waitForElementDisplay(uupo.emailModifierLink);
        uupo.emailModifierLink.click();

    }

    public void enterNewUserName(String n_userName) {
        waitForElementDisplay(uupo.editUserName);
        uupo.editUserName.clear();
        uupo.editUserName.sendKeys(n_userName);
    }


    public void clickOnGenderModifyLink() {
        waitForElementDisplay(uupo.genderModifierLink);
        uupo.genderModifierLink.click();
    }
    public void clickToSelectMaleGenderasOption(String sexType) {
        waitForElementDisplay(uupo.malesex);
        uupo.malesex.click();
    }

    public void clickDateOfBirthModifyLink() {
        waitForElementDisplay(uupo.dateOFBirthModiefierLink);
        uupo.dateOFBirthModiefierLink.click();

    }

    public void clickOnModifyUsernameLink() {
        waitForElementDisplay(uupo.usernameModifierLink);
        uupo.usernameModifierLink.click();
    }
    public void clickOnModifyPostCodeLink() {
        waitForElementDisplay(uupo.postCodeModiefier);
        uupo.postCodeModiefier.click();
    }

    public void selectDayOfBirthToEditDOB(String d_birth){
        waitForElementDisplay(uupo.dayOFBirth);
        uupo.dayOFBirth.click();
      
        
    }
      
    public void selectMonthOfBirthToEditDOB(String m_birth){
        waitForElementDisplay(uupo.monthOFBirth);
        uupo.monthOFBirth.click();

    }

    public void selectYearOfBirthToEditDOB(String y_bith){
        waitForElementDisplay(uupo.yearOFBirth);
        uupo.yearOFBirth.click();

    }
    public void enterNewPostCodeToEditExistingPostCode(String n_postCode){
        waitForElementDisplay(uupo.editPostcode);
        uupo.editPostcode.clear();
        uupo.editPostcode.sendKeys(n_postCode);
    }

}
