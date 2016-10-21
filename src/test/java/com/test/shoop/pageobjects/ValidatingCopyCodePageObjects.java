package com.test.shoop.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValidatingCopyCodePageObjects {
	
	@FindBy(xpath = "//form[@class='search-bar ng-pristine ng-valid']/div/div/input")
    public WebElement searchField;
	@FindBy(xpath = "//*[@id='search-result-2220']/div[2]/h4")
    public WebElement merchantName;
	@FindBy(xpath = "//div[@class='offer-btn-wrapper ng-scope']/div/div")
    public WebElement viewVoucherCode;
	@FindBy(xpath = "//div[@class='modal-content']/div[2]/p[2]/a/span")
	public WebElement copyOption;
	
}
