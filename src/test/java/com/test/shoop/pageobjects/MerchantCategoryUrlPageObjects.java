package com.test.shoop.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by thadeus on 06/07/16.
 */
public class MerchantCategoryUrlPageObjects {

    @FindBy(xpath = "//div[@id='msm-breadcrumbs-toggler']")
    public WebElement merchantName;
    @FindBy(css = ".ng-binding.ng-scope")
    public WebElement searchResult;
    @FindBy(css = "#courses-en-ligne-drive")
    public WebElement pageTopTab;

   public String merchantCat = "#%s";
}
