package com.test.shoop.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by thadeus on 04/07/16.
 */
public class RegistrationPageObjects {

    @FindBy(xpath = "//category-icons[@class='pull-right ng-scope']/div/ul/li[1]/a")
	public WebElement registerLink;
    @FindBy(xpath="//form[@name='registerForm']/div[5]/label")
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
    @FindBy(xpath= "//form[@name='registerForm']/div[1]/input")
    public WebElement firstName;
    @FindBy(xpath= "//form[@name='registerForm']/div[2]/input")
    public WebElement name;
    @FindBy(xpath= "//input[@name='email']")
    public WebElement userName;
    @FindBy(xpath="//input[@type='password']")
    public WebElement password;
    public WebElement userEmail;
    @FindBy(name = "password")
    public WebElement emailpassword;
    @FindBy(id ="register-submit")
    public WebElement regButton;
    @FindBy(xpath ="//form[@name = 'bacsInternationalForm.form']/div[1]/div/div/p")
    public WebElement errorMessageBIC;
    @FindBy(xpath ="//form[@name = 'bacsInternationalForm.form']/div[2]/div/div/p")
    public WebElement errorMessageIBAN;
    @FindBy(xpath ="//form[@name = 'bacsInternationalForm.form']/div[3]/div/div/p")
    public WebElement errorMessageEmail;
    @FindBy(xpath ="//form[@name = 'bacsInternationalForm.form']/div[4]/div/div/p")
    public WebElement errorMessagePassword;
    @FindBy(xpath="html/body/div[2]/msm-shoop/div/msm-register-page/div/div[2]/div/div[1]/form/div[7]/label/input[@id='acceptTerms']")
    public WebElement acceptTerms;
    @FindBy(xpath="html/body/div[2]/msm-shoop/div/msm-register-page/div/div[2]/div/div[1]/form/div[5]/div/span")
    public WebElement regErrorMessaging;
    
}
