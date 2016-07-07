package com.test.shoop.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by thadeus on 07/07/16.
 */
public class MerchantCategoryPageObjects {



    @FindBy(css = "a[id='breadcrumb-home']")
    public WebElement backHomeButton;
    @FindBy(css =".e2e-list-merchant-name.ng-binding")
    public WebElement searchResult;

    @FindBy(xpath= ".//*[@id='menu-categories']/div[1]/div")
    public WebElement menuCategory;
    @FindBy(css = "#courses-en-ligne-drive")
    public WebElement pageTopTab ;

    @FindBy(css = ".styled-rate-text.ng-binding.ng-scope")
    public WebElement merchantRate;


}
