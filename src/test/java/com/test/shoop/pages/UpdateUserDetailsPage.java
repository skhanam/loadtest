package com.test.shoop.pages;



import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


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

   /* public void validateYourModificationIsSuccessfulMessageDisplayed(String success_text) {
        waitForElementDisplay(uupo.successfulUpdates);
        Assert.assertTrue(uupo.successfulUpdates.getText().contains(success_text));

    }*/

    public void clickonNameModifierLink() {
    	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        waitForElementDisplay(uupo.nameModifierLink);
        uupo.nameModifierLink.click();
    }

    public void clickEmailModifyLink() {
    	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        waitForElementDisplay(uupo.emailModifierLink);
        uupo.emailModifierLink.click();

    }

    public void enterNewUserName(String n_userName) {
        waitForElementDisplay(uupo.editUserName);
        uupo.editUserName.clear();
        uupo.editUserName.sendKeys(n_userName);
    }


    public void clickOnGenderModifyLink() {
    	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    	//Utility.scrollDownWindow(driver, uupo.genderModifierLink);
        waitForElementDisplay(uupo.genderModifierLink);
        uupo.genderModifierLink.click();
    }
    public void clickToSelectMaleGenderasOption(String sexType) {
        waitForElementDisplay(uupo.malesex);
        uupo.malesex.isDisplayed();
    }

    public void clickDateOfBirthModifyLink() {
    	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        waitForElementDisplay(uupo.dateOFBirthModiefierLink);
        uupo.dateOFBirthModiefierLink.click();

    }

    public void clickOnModifyUsernameLink() {
    	Utility.scrollDownWindow(driver, uupo.usernameModifierLink);
    	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
         waitForElementDisplay(uupo.usernameModifierLink);
        uupo.usernameModifierLink.click();
    }
    public void clickOnModifyPostCodeLink() {
    	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
     	js.executeScript("window.scrollBy(0,60)", "");
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

    public void validateSuccessMessageName(String message){
    	 waitForElementDisplay(uupo.successMessageName);
    	 Assert.assertTrue(uupo.successMessageName.getText().contains(message));
    }
    public void validateSuccessMessageEmail(String message){
    	 waitForElementDisplay(uupo.successMessageEmail);
    	 Assert.assertTrue(uupo.successMessageEmail.getText().contains(message));
    	
    }
    public void validateSuccessMessageEditUsername(String message){
   	 waitForElementDisplay(uupo.successMessageEditUserName);
   	Assert.assertTrue(uupo.successMessageEditUserName.getText().contains(message));
   	
   }
    public void validateSuccessMessageGender(String message){
      	 waitForElementDisplay(uupo.successMessageGender);
      	Assert.assertTrue(uupo.successMessageGender.getText().contains(message));
      }
    public void validateSuccessMessageDOB(String message){
     	 waitForElementDisplay(uupo.successMessageDOB);
     	Assert.assertTrue(uupo.successMessageDOB.getText().contains(message));
     }
    public void validateSuccessMessagePostalCode(String message){
    	 waitForElementDisplay(uupo.successMessagePostalCode);
    	 Assert.assertTrue(uupo.successMessagePostalCode.getText().contains(message));
    }
    
}
