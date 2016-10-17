package com.test.shoop.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shabanakhanum on 7/15/16.
 */
public class UpdateUserPageObjects {

    @FindBy(xpath = "//div[@class='settings-fields']/div[1]/div[1]/div/div[3]/div")
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
    @FindBy(xpath = "//div[@class='settings-fields']/div[2]/div[1]/div/div[3]/div")
    public WebElement emailModifierLink;
    @FindBy(xpath = "//*[contains(@name,'username')]")
    public WebElement editUserName;
    @FindBy(xpath = "//div[@class='settings-fields']/div[4]/div[1]/div/div[3]/div")
    public WebElement genderModifierLink;
    @FindBy(xpath= "//div[@class='settings-fields']/div[3]/div[1]/div/div[3]/div")
    public WebElement usernameModifierLink;
    @FindBy(xpath = "//div[@class='settings-fields']/div[5]/div[1]/div/div[3]/div")
    public WebElement dateOFBirthModiefierLink;
    @FindBy(xpath = "//*[@name='day']/option[9]")
    public WebElement dayOFBirth;
    @FindBy(xpath = "//*[contains(@name,'month')]/option[9]")
    public WebElement monthOFBirth;
    @FindBy(xpath = "//*[contains(@name,'year')]/option[81]")
    public WebElement yearOFBirth;
    @FindBy(xpath = "//div[@class='settings-fields']/div[6]/div[1]/div/div[3]/div")
    public WebElement postCodeModiefier;
    @FindBy(xpath = "//*[contains(@name,'post_code')]")
    public WebElement editPostcode;
    @FindBy(xpath = "//div[@class='row']/div[1]/div/label")
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
    @FindBy(xpath = "//ui-view[@class='ng-scope']/div[2]/div/div[1]/div[1]/div/p")
    public WebElement successMessageName;
    @FindBy(xpath = "//ui-view[@class='ng-scope']/div[2]/div/div[2]/div[1]/div/p")
    public WebElement successMessageEmail;
    @FindBy(xpath = "//ui-view[@class='ng-scope']/div[2]/div/div[3]/div[1]/div/p")
    public WebElement successMessageEditUserName;
    @FindBy(xpath = "//ui-view[@class='ng-scope']/div[2]/div/div[4]/div[1]/div/p")
    public WebElement successMessageGender;
    @FindBy(xpath = "//ui-view[@class='ng-scope']/div[2]/div/div[5]/div[1]/div/p")
    public WebElement successMessageDOB;
    @FindBy(xpath = "//ui-view[@class='ng-scope']/div[2]/div/div[6]/div[1]/div/p")
    public WebElement successMessagePostalCode;

}
