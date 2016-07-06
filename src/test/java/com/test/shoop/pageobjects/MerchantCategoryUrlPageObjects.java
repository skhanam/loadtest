package com.test.shoop.pageobjects;

import com.test.shoop.helper.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by thadeus on 06/07/16.
 */
public class MerchantCategoryUrlPageObjects {

    @FindBy(css = "a[id='breadcrumb-home']")
    public WebElement backHomeButton;
    @FindBy(css = Constants.searchResult)
    public WebElement searchResult;
    @FindBy(css = Constants.pageTopTab)
    public WebElement pageTopTab;

   public String merchantCat = "#%s";
}
