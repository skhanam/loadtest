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

}
