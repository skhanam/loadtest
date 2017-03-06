package com.test.shoop.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValidatingCopyCodePageObjects {
	
	@FindBy(xpath = "//search-bar[@class='ng-scope']/div/div/input")
    public WebElement searchField;
	@FindBy(xpath = "//*[@id='search-result-2220']/div[2]/h4")
    public WebElement merchantName;
	@FindBy(xpath = "//button[@class='qp-btn']/span")
	public WebElement cookie;
	@FindBy(xpath = "//div[@class='offer-btn-wrapper ng-scope']/div[@class='code ribbon ng-scope']")
    public WebElement viewVoucherCode;
	@FindBy(xpath = "//div[@class='voucher-code']/button")
	public WebElement copyOption;
	
	
	//div[@class='code ribbon ng-scope']/div/span
	
}
