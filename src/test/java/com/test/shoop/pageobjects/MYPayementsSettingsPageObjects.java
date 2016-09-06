package com.test.shoop.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by thadeus on 21/07/16.
 */
public class MYPayementsSettingsPageObjects {


	@FindBy(css = ".container.ng-binding")
    public WebElement memberPayementsPages;
    @FindBy(xpath = "//*[@id='user.settings.general']")
    public  WebElement generalSettings;
   @FindBy(xpath = "//*[@id='menu-categories']/div[1]/ul/li[3]/ul/li[3]/a")
    public WebElement bankingInfoLink;
    @FindBy(xpath = "html/body/div[2]/div/ui-view/div/div/div/div[2]/div[2]/div/div[1]/div[3]/a")
    public WebElement modifiedPaymenyLink;
    @FindBy(xpath = "//*[@name = 'bic']")
    public WebElement codeBicField;
    @FindBy(xpath= "//*[@name='iban']")
    public WebElement iBANField;
    @FindBy(xpath = "//*[@name ='holder_name']")
    public WebElement nameField;
    @FindBy(xpath= "//*[@name='password']")
    public WebElement passwordField;
    @FindBy(id = "bacsInternationalForm-save")
    public WebElement paymentRecordButton;
    @FindBy(css = ".qp-btn.danger")
    public WebElement alertAccountAdded;
    @FindBy(xpath = "html/body/div[5]/div/div/div[2]/button[1]")
    public WebElement alertPaymentAccount;
    @FindBy(xpath = "html/body/div[2]/div/ui-view/div/div/div/div[2]/div[2]/div/div[1]/div[3]/span")
    public WebElement updateDone;
    @FindBy(xpath = "//div[@class='tr paypal-row-edit tr']/div[3]/a")
    public WebElement paypalEditButton;
    @FindBy(xpath = "//button[@class= 'qp-btn paypal-link-button ng-binding ng-scope']")
    public WebElement paypalLinkMyAccountutton;
    @FindBy(xpath = "//*[@id='email']")
    public WebElement paypalEmail;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement paypalPassword;
    @FindBy(xpath = "//*[@id='content']/h1")
    public WebElement validatePaypalLoginPage;
    @FindBy(xpath = "//*[@id='btnLogin']")
    public WebElement paypalLoginButton;
    @FindBy(xpath = "//*[@id='content']/p")
    public WebElement validateSuccessmessage;
    @FindBy(xpath = "//*[@id='agreeConsent']")
    public WebElement agreeButton;
    @FindBy(xpath = "//div[@class='td']/form/div[2]/div/button[1]")
    public WebElement dissociatePaypallink;
    @FindBy(xpath = "//a[@id='signOut']")
    public WebElement logOutButton;
    @FindBy(xpath = "//span[@class='inline-notification e2e-inline-notification ng-isolate-scope successful']")
    public WebElement paypalLinkaddedSuccessMessage;
    
    
    
    
}
