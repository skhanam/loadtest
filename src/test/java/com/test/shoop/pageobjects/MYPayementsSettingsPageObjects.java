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
    @FindBy(xpath = "html/body/div[2]/div/ui-view/div/div/div/div[2]/div[2]/div/div[2]/div[1]")
    public WebElement codeBicField;
    @FindBy(xpath= "html/body/div[2]/div/ui-view/div/div/div/div[2]/div[2]/div/div[2]/div[2]/form/div[2]/div/input")
    public WebElement iBANField;
    @FindBy(xpath = "html/body/div[2]/div/ui-view/div/div/div/div[2]/div[2]/div/div[2]/div[2]/form/div[3]/div/input")
    public WebElement nameField;
    @FindBy(xpath= "html/body/div[2]/div/ui-view/div/div/div/div[2]/div[2]/div/div[2]/div[2]/form/div[6]/div/input")
    public WebElement passwordField;
    @FindBy(css = "#bacsInternationalForm-save")
    public WebElement paymentRecordButton;
    @FindBy(css = ".qp-btn.danger")
    public WebElement alertAccountAdded;
    @FindBy(xpath = "html/body/div[5]/div/div/div[2]/button[1]")
    public WebElement alertPaymentAccount;
    @FindBy(xpath = "html/body/div[2]/div/ui-view/div/div/div/div[2]/div[2]/div/div[1]/div[3]/span")
    public WebElement updateDone;

}
