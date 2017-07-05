package com.test.shoop.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by thadeus on 21/07/16.
 */
public class MYPayementsSettingsPageObjects {


	@FindBy(css = ".container.ng-binding")
    public WebElement memberPayementsPages;
    @FindBy(xpath = "//ul[@class='nav nav-mega ng-scope']/li[4]/a[@href='/utilisateur/parametres/general/']")
    public  WebElement generalSettings;
   @FindBy(xpath = "//ul[@class='qp-left-nav nav nav-pills-vertical nav-stacked']/li[3]/a")
    public WebElement bankingInfoLink;
    @FindBy(xpath = "//div[@class='settings-fields ng-scope']/div[1]/div[1]/div/div[3]/div/div")
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
    @FindBy(xpath = "//ui-view[@class='ng-scope']/div[2]/div[2]/div[1]/div[1]/div/p")
    public WebElement updateDone;
    @FindBy(xpath = "//div[@class='settings-fields ng-scope']/div[2]/div[1]/div/div[3]/div/div")
    public WebElement paypalModifyButton;
    @FindBy(xpath = "//button[@class= 'btn btn-primary ng-binding ng-scope']")
    public WebElement paypalLinkMyAccountutton;
    @FindBy(xpath = "//*[@id='email']")
    public WebElement paypalEmail;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement paypalPassword;
    @FindBy(xpath = "//*[@id='login']/div/div/h1")
    public WebElement validatePaypalLoginPage;
    @FindBy(xpath = "//*[@id='btnLogin']")
    public WebElement paypalLoginButton;
    @FindBy(xpath = "//*[@id='content']/p")
    public WebElement validateSuccessmessage;
    @FindBy(xpath = "//*[@id='agreeConsent']")
    public WebElement agreeButton;
    @FindBy(xpath = "//form[@class='form-horizontal ng-pristine ng-valid ng-scope']/div[2]/div/button[1]")
    public WebElement dissociatePaypallink;
    @FindBy(xpath = "//ul[@class='nav nav-mega ng-scope']/li[5]/a[@href='/deconnexion/']")
    public WebElement logOutButton;
    @FindBy(xpath = "//ui-view[@class='ng-scope']/div[2]/div[2]/div[2]/div[1]/div/p")
    public WebElement paypalLinkaddedSuccessMessage;
    
    
    
}
