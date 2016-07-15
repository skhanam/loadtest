package com.test.shoop.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.FindsByCssSelector;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shabanakhanum on 7/15/16.
 */
public class SearchPageObjects {

    public WebElement pageTitle ;
    @FindBy(css = ".styled-rate-text.ng-binding.ng-scope")
    public WebElement merchantRate;
    String catTable = ".category-list>ul>li>a:contains('%s')";
    @FindBy(name = "search")
    public WebElement searchField;
    @FindBy(css = ".e2e-list-merchant-name.ng-binding")
    public WebElement searchResult;
    @FindBy(xpath = "html/body/div[2]/div/div[5]/div/div[1]/div/div[1]")
    public WebElement merchantPageCashback;


}
