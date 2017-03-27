package com.test.shoop.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValidatingCopyCodePageObjects {
	
	@FindBy(xpath = "//search-bar[@class='ng-scope']/div/div/input")
    public WebElement searchField;
	@FindBy(css = ".e2e-list-merchant-name.ng-binding")
    public WebElement merchantName;
	@FindBy(xpath = "//button[@class='qp-btn']/span")
	public WebElement cookie;
	@FindBy(xpath = "//button[@class='btn btn-primary btn-reveal e2e-open-copy-code-modal']")
    public WebElement viewVoucherCode;
	@FindBy(xpath = "//button[@class = 'e2e-copy-code-button copy-button btn btn-link']")
	public WebElement copyOption;
	
	
	//div[@class='code ribbon ng-scope']/div/span
	
}
