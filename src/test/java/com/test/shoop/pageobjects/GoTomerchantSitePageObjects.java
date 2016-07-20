package com.test.shoop.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by thadeus on 15/07/16.
 */
public class GoTomerchantSitePageObjects {

    @FindBy(css = ".form-control.search-input.ng-valid.ng-dirty.ng-valid-parse.ng-touched")
    public WebElement searchHome;
    @FindBy(css = ".e2e-list-merchant-name.ng-binding")
    public WebElement searchResult;
    @FindBy(xpath = "html/body/div[2]/div/div[5]/div/div[1]/div/div[3]/div/div[2]/a")
    public WebElement cashBacklink;
    @FindBy(css = "html/body/div[2]/div/div[1]/div[1]/button/span")
    public WebElement cashBackAgain;
    @FindBy(css = ".merchant-title")
    public WebElement shoopMerchantPageTitle;
    @FindBy(css = ".modal-header.visit-confirmation-modal.ng-scope>h4")
    public WebElement wayOutPopup;
    @FindBy(xpath = "//a[contains(@href,'je-me-connecte')]")
    public WebElement loginLink;


}
