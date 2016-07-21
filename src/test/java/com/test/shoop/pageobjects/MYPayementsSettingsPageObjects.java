package com.test.shoop.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by thadeus on 21/07/16.
 */
public class MYPayementsSettingsPageObjects {


    @FindBy(css = ".container.ng-binding")
    public WebElement memberPayementsPages;
    @FindBy(xpath = "html/body/div[2]/div/ui-view/div/div/div/div[2]/div[2]/div/div[1]/div[3]/a")
    public WebElement modifiedPaymenyLink;
    @FindBy(css = ".form-control.ng-pristine.ng-invalid.ng-invalid-required.ng-valid-pattern.ng-touched")
    public WebElement codeBicField;
    @FindBy(css = ".form-control.ng-pristine.ng-untouched.ng-invalid.ng-invalid-required.ng-valid-pattern")
    public WebElement iBANField;
    @FindBy(css = ".form-control.ng-untouched.ng-dirty.ng-valid-parse.ng-valid-required.ng-invalid.ng-invalid-pattern")
    public WebElement nameField;
    @FindBy(css = ".form-control.ng-untouched.ng-dirty.ng-valid-parse.ng-valid.ng-valid-required")
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
