package com.test.shoop.pages;

import com.test.shoop.helper.Constants;
import com.test.shoop.config.AbstractDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;

/**
 * Created by thadeus on 16/06/16.
 */
public class UpdateUserDetailsPage extends AbstractDriver {
    Actions action = new Actions(driver);
    @FindBy(css = Constants.nameModifierLink)
    private WebElement nameModifierLink;
    @FindBy(xpath = Constants.editFname)
    private WebElement editFname;
    @FindBy(xpath = Constants.editLname)
    private WebElement editLname;
    @FindBy(xpath = Constants.editEmail)
    private WebElement editEmail;
    @FindBy(xpath = Constants.emailConfirmation)
    private WebElement emailConfirmation;
    @FindBy(xpath = Constants.editPassword)
    private WebElement editPassword;
    @FindBy(css = Constants.emailModifierLink)
    private WebElement emailModifierLink;
    @FindBy(xpath = Constants.editUsername)
    private WebElement editUserName;
    @FindBy(css = Constants.genderModifierLink)
    private WebElement genderModifierLink;
    @FindBy(css= Constants.usernameModifierLink)
    private WebElement usernameModifierLink;
    @FindBy(css = Constants.dateOFBirthModiefierLink)
    private WebElement dateOFBirthModiefierLink;
    @FindBy(xpath = Constants.dayOFBirth)
    private WebElement dayOFBirth;
    @FindBy(xpath = Constants.monthOFBirth)
    private WebElement monthOFBirth;
    @FindBy(xpath = Constants.yearOFBirth)
    private WebElement yearOFBirth;
    @FindBy(css = Constants.postCodeModiefier)
    private WebElement postCodeModiefier;
    @FindBy(xpath = Constants.editPositcode)
    private WebElement editPostcode;
    @FindBy(css = Constants.malesex)
    private WebElement malesex;
    @FindBy(css = Constants.Femalesex)
    private WebElement Femalesex;
    @FindBy(xpath = Constants.nameRecordButton)
    private WebElement submitEditDataButton;
    @FindBy(xpath=Constants.emailRecordButton)
    private WebElement emailRecordButton;
    @FindBy(xpath=Constants.usernameRecordButton)
    private WebElement usernamerRecordButton;
    @FindBy(xpath=Constants.genderRecordButton)
    private WebElement genderRecordButton;
    @FindBy(xpath=Constants.doBRecordButton )
    private WebElement doBRecordButton;
    @FindBy(xpath=Constants.postcodeRecordButton)
    private WebElement postcodeRecordButton;
    @FindBy(xpath = Constants.generalSettings)
    private WebElement generalSettings;
    @FindBy(css = Constants.successfulUpdates)
    private WebElement successfulUpdates;

    public void clickOnGeneralSettingsLinkLoggedInUser() {
        waitForElementDisplay(generalSettings);
        generalSettings.click();
    }

    public void clickOnNameRecordButton() {
        waitForElementDisplay(submitEditDataButton);
        action.
                click(submitEditDataButton).
                build().
                perform();
    }
    public void clickOnUserNameRecordButton(){
        waitForElementDisplay(usernamerRecordButton);
         usernamerRecordButton.click();
    }
    public void clickOnGenderRecordButton(){
     waitForElementDisplay(genderRecordButton);
        genderRecordButton.click();
    }
    public void clickOnDateOfBirthRecordButton(){
        waitForElementDisplay(doBRecordButton);
        doBRecordButton.click();

    }
    public void clickOnEmailRecordButton(){
        waitForElementDisplay(emailRecordButton);
        emailRecordButton.click();

    }
    public void clickOnPostCodeRecordButton(){
        waitForElementDisplay(postcodeRecordButton);
        postcodeRecordButton.click();

    }

    public void enterNewFirstNameAndSurnameTOEdit(String f_name, String s_name) {
        waitForElementDisplay(editFname);
        editFname.clear();
        editFname.sendKeys(f_name);
        editLname.clear();
        editLname.sendKeys(s_name);
    }


    public void enterNewEmailAndRe_enterEmailTocomfirmNewEmail(String n_Email, String c_Email) {
        waitForElementDisplay(editEmail);
        editEmail.clear();
        editEmail.sendKeys(n_Email);
        waitForElementDisplay(emailConfirmation);
        emailConfirmation.clear();
        emailConfirmation.sendKeys(c_Email);
    }

    public void enterNewPasswordToModify(String u_password) {
        waitForElementDisplay(editPassword);
        editPassword.clear();
        editPassword.sendKeys(u_password);
    }

    public void validateYourModificationIsSuccessfulMessageDisplayed(String success_text) {
        waitForElementDisplay(successfulUpdates);
        assertTrue(successfulUpdates.getText().contains(success_text));

    }

    public void clickonNameModifierLink() {
        waitForElementDisplay(nameModifierLink);
        nameModifierLink.click();
    }

    public void clickEmailModifyLink() {
        waitForElementDisplay(emailModifierLink);
        emailModifierLink.click();

    }

    public void enterNewUserName(String n_userName) {
        waitForElementDisplay(editUserName);
        editUserName.sendKeys(n_userName);
    }


    public void clickOnGenderModifyLink() {
        waitForElementDisplay(genderModifierLink);
        genderModifierLink.click();
    }
    public void clickToSelectMaleGenderasOption(String sexType) {
        waitForElementDisplay(malesex);
        malesex.click();
        assertTrue(malesex.isSelected());
    }

    public void clickDateOfBirthModifyLink() {
        waitForElementDisplay(dateOFBirthModiefierLink);
        dateOFBirthModiefierLink.click();

    }

    public void clickOnModifyUsernameLink() {
        waitForElementDisplay(usernameModifierLink);
        usernameModifierLink.click();
    }
    public void clickOnModifyPostCodeLink() {
        waitForElementDisplay(postCodeModiefier);
        postCodeModiefier.click();
    }

    public void selectDayOfBirthToEditDOB(String d_birth){
        waitForElementDisplay(dayOFBirth);
        Select day = new Select(dayOFBirth);
        day.selectByVisibleText(d_birth);}




    public void selectMonthOfBirthToEditDOB(String m_birth){
        waitForElementDisplay(monthOFBirth);
       Select month = new Select(monthOFBirth);
        month.selectByValue(m_birth);

    }

    public void selectYearOfBirthToEditDOB(String y_bith){
        waitForElementDisplay(yearOFBirth);
        Select year = new Select(yearOFBirth);
        year.selectByValue(y_bith);

    }
    public void enterNewPostCodeToEditExistingPostCode(String n_postCode){
        waitForElementDisplay(editPostcode);
        editPostcode.clear();
        editPostcode.sendKeys(n_postCode);
    }

    }
