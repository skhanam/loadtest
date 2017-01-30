package com.test.shoop.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by thadeus on 04/07/16.
 */
public class RegistrationPageObjects {
    @FindBy(xpath = "//category-icons[@class='pull-right ng-scope']/div/ul/li[1]/a")
	public WebElement registerLink;
    @FindBy(xpath="html/body/div[2]/div/div[2]/div[1]/div/div[2]/form/div[4]/label")
//    @FindBy(name="accepted_terms")
    public WebElement regTermsAndConditions;
    @FindBy(xpath ="html/body/div[2]/div/div[2]/div[1]/div/div[2]/form/div[4]/label/span[1]/span")
    public WebElement acceptToReceiveShoopOffers;
    @FindBy(xpath ="html/body/div[2]/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[2]/div")
    public WebElement invalidemailPassword;
    @FindBy(css =".greeting-header>span")
    public WebElement welcomeGreetings;
    @FindBy(xpath  ="html/body/div[2]/div/div[2]/div[1]/div/div[2]/form/div[5]/div/span/span")
    public WebElement regErrorMessage;
    @FindBy(xpath = ".e2e-list-merchant-name.ng-binding")
    public WebElement searchResult ;
    @FindBy(xpath = ".//*[@id='menu-categories']/div[1]/div")
    public WebElement menuCategory;
    @FindBy(xpath = "#courses-en-ligne-drive")
    public WebElement pageTopTab;
    @FindBy(xpath= "//input[@name='email']")
    public WebElement userName;
    @FindBy(xpath="//input[@type='password']")
    public WebElement password;
    public WebElement userEmail;
    @FindBy(name = "password")
    public WebElement emailpassword;
//    @FindBy(xpath =".//*button[@type='submit']")
    @FindBy(id ="register-submit")
    public WebElement regButton;
    @FindBy(css=".error.ng-scope>span")
    public WebElement regErrorMessaging;
    @FindBy(xpath ="//form[@name = 'bacsInternationalForm.form']/div[1]/div/div/p")
    public WebElement errorMessageBIC;
    @FindBy(xpath ="//form[@name = 'bacsInternationalForm.form']/div[2]/div/div/p")
    public WebElement errorMessageIBAN;
    @FindBy(xpath ="//form[@name = 'bacsInternationalForm.form']/div[3]/div/div/p")
    public WebElement errorMessageEmail;
    @FindBy(xpath ="//form[@name = 'bacsInternationalForm.form']/div[4]/div/div/p")
    public WebElement errorMessagePassword;
    
}
