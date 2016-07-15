package com.test.shoop.pageobjects;

import com.test.shoop.helper.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by thadeus on 15/07/16.
 */
public class GoTomerchantSitePageObjects {


    private WebElement searchHome;
    @FindBy(css = Constants.searchResult)
    private WebElement searchResult;
    @FindBy(xpath = Constants.cashBacklink)
    private WebElement cashBacklink;
    @FindBy(css = ".qp-btn.e2e-obtain-cashback.ng-scope")
    private WebElement cashBackAgain;
    @FindBy(css = Constants.shoopMerchantPageTittle)
    private WebElement shoopMerchantPageTittle;
    @FindBy(css = Constants.wayOutPopup)
    private WebElement wayOutPopup;

    @FindBy(xpath = Constants.loginLink)
    private WebElement loginLink;

}
