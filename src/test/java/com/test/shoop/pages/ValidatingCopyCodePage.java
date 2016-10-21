package com.test.shoop.pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
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
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//     	js.executeScript("window.scrollBy(0,250)", "");
		waitForElementDisplay(copy.viewVoucherCode);
		copy.viewVoucherCode.click();
		driver.manage().timeouts().implicitlyWait(260, TimeUnit.SECONDS);
	}
	public void validateCopyOption(){
		driver.manage().timeouts().implicitlyWait(360, TimeUnit.SECONDS);
		Set <String> handles =driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		while (it.hasNext()){
		    String newwin = it.next();
		    String parentWindow = it.next();
		    driver.switchTo().window(newwin);
		     driver.switchTo().window(parentWindow);
		    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		    driver.switchTo().defaultContent();
		   
		    waitForElementDisplay(copy.copyOption);
		     copy.copyOption.isDisplayed();
	    }
		
	}
}
