package com.test.shoop.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.test.shoop.config.AbstractDriver;
import com.test.shoop.config.Utility;
import com.test.shoop.pageobjects.ValidatingCopyCodePageObjects;

public class ValidatingCopyCodePage extends AbstractDriver{
	
	ValidatingCopyCodePageObjects copy = PageFactory.initElements(driver, ValidatingCopyCodePageObjects.class);
	
	public void enterMerchantNameinSearch(){
		waitForElementDisplay(copy.searchField);
		copy.searchField.sendKeys("Yoin");
		copy.searchField.submit();
	}
	public void clickOnMerchantName(){
		waitForElementDisplay(copy.merchantName);
		copy.merchantName.click();
	}
	public void clickOnViewCodeButton(){
		driver.manage().timeouts().implicitlyWait(260, TimeUnit.SECONDS);
	   Utility.scrollDownWindow(driver);
		waitForElementDisplay(copy.viewVoucherCode);
		copy.viewVoucherCode.click();
	}
	public void validateCopyOption(){
		driver.switchTo().defaultContent();
		waitForElementDisplay(copy.copyOption);
		copy.copyOption.isDisplayed();
	}


}
