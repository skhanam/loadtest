package com.test.shoop.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shabanakhanum on 7/15/16.
 */
public class UpdateUserPageObjects {

    @FindBy(css = "a[e2e-edit-row='name']")
    public WebElement nameModifierLink;
    @FindBy(xpath = "//*[contains(@name,'first_name')]")
    public WebElement editFname;
    @FindBy(xpath = "//*[contains(@name,'last_name')]")
    public WebElement editLname;
    @FindBy(xpath = "//*[contains(@type,'email')]")
    public WebElement editEmail;
    @FindBy(xpath = "//*[contains(@name,'confirmation')]")
    public WebElement emailConfirmation;
    @FindBy(xpath = "//*[contains(@name,'password' )]")
    public WebElement editPassword;
    @FindBy(css = "a[e2e-edit-row='email']")
    public WebElement emailModifierLink;
    @FindBy(xpath = "//*[contains(@name,'username')]")
    public WebElement editUserName;
    @FindBy(css = "a[e2e-edit-row='gender']")
    public WebElement genderModifierLink;
    @FindBy(css= "a[e2e-edit-row='username']")
    public WebElement usernameModifierLink;
    @FindBy(css = "a[e2e-edit-row='birthdate']")
    public WebElement dateOFBirthModiefierLink;
    @FindBy(xpath = "//*[@name='day']/option[9]")
    public WebElement dayOFBirth;
    @FindBy(xpath = "//*[contains(@name,'month')]/option[9]")
    public WebElement monthOFBirth;
    @FindBy(xpath = "//*[contains(@name,'year')]/option[81]")
    public WebElement yearOFBirth;
    @FindBy(css = "a[e2e-edit-row='postcode']")
    public WebElement postCodeModiefier;
    @FindBy(xpath = "//*[contains(@name,'post_code')]")
    public WebElement editPostcode;
    @FindBy(xpath = "//div[@class='form-group radio']/div/label[1]/span")
    public WebElement malesex;
    @FindBy(xpath = "//div[@class='form-group radio']/div/label[2]/span")
    public WebElement Femalesex;
    @FindBy(xpath = "//*[contains(@type,'submit')]")
    public WebElement submitEditDataButton;
    @FindBy(xpath="//*[@id='emailForm-save']")
    public WebElement emailRecordButton;
    @FindBy(xpath="//*[@id='userNameForm-save']")
    public WebElement usernamerRecordButton;
    @FindBy(xpath="//*[@id='genderForm-save']")
    public WebElement genderRecordButton;
    @FindBy(xpath="//*[@id='birthDateForm-save']")
    public WebElement doBRecordButton;
    @FindBy(xpath="//*[@id='postCodeForm-save']")
    public WebElement postcodeRecordButton;
    @FindBy(xpath = "//*[@id='user.settings.general']")
    public WebElement generalSettings;
    @FindBy(css = ".inline-notification.ng-isolate-scope.successful")
    public WebElement successfulUpdates;

}
