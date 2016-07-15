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
    @FindBy(xpath = "//*[contains(@name,'year')]")
    public WebElement dayOFBirth;
    @FindBy(xpath = "//*[contains(@name,'month')]")
    public WebElement monthOFBirth;
    @FindBy(xpath = "//*[contains(@name,'year')]")
    public WebElement yearOFBirth;
    @FindBy(css = "a[e2e-edit-row='postcode']")
    public WebElement postCodeModiefier;
    @FindBy(xpath = "//*[contains(@name,'post_code')]")
    public WebElement editPostcode;
    @FindBy(css = "#male")
    public WebElement malesex;
    @FindBy(css = "#female")
    public WebElement Femalesex;
    @FindBy(xpath = "//*[contains(@type,'submit')]")
    public WebElement submitEditDataButton;
    @FindBy(xpath="html/body/div[2]/div/ui-view/div/div/div/div[2]/div/div[2]/div[2]/div[2]/form/div[4]/div/button[1]")
    public WebElement emailRecordButton;
    @FindBy(xpath="html/body/div[2]/div/ui-view/div/div/div/div[2]/div/div[3]/div[2]/div[2]/form/div[2]/div/button[1]")
    public WebElement usernamerRecordButton;
    @FindBy(xpath="html/body/div[2]/div/ui-view/div/div/div/div[2]/div/div[4]/div[2]/div[2]/form/div[2]/div/button[1]")
    public WebElement genderRecordButton;
    @FindBy(xpath="html/body/div[2]/div/ui-view/div/div/div/div[2]/div/div[5]/div[2]/div[2]/form/div[2]/div/button[1]")
    public WebElement doBRecordButton;
    @FindBy(xpath="html/body/div[2]/div/ui-view/div/div/div/div[2]/div/div[6]/div[2]/div[2]/form/div[2]/div/button[1]")
    public WebElement postcodeRecordButton;
    @FindBy(xpath = "//*[@id='user.settings.general']")
    public WebElement generalSettings;
    @FindBy(css = ".inline-notification.ng-isolate-scope.successful")
    public WebElement successfulUpdates;

}
