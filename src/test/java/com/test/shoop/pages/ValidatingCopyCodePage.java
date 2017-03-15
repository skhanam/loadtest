package com.test.shoop.pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.shoop.config.AbstractDriver;
import com.test.shoop.config.Utility;
import com.test.shoop.pageobjects.ValidatingCopyCodePageObjects;

public class ValidatingCopyCodePage extends AbstractDriver{
	
	ValidatingCopyCodePageObjects copy = PageFactory.initElements(driver, ValidatingCopyCodePageObjects.class);
	
	public void enterMerchantNameinSearch(){
		waitForElementDisplay(copy.searchField);
		copy.searchField.sendKeys("my-matelas");
		copy.searchField.sendKeys(Keys.ENTER);
	}
	public void clickOnMerchantName(){
		waitForElementDisplay(copy.merchantName);
		copy.merchantName.click();
	}
	public void clickOnViewCodeButton(){
		driver.manage().timeouts().implicitlyWait(1260, TimeUnit.SECONDS);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
     	//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
     	if(copy.cookie.isDisplayed()){
        copy.cookie.click();
     	}
     	WebDriverWait wait = new WebDriverWait(driver,30);
     	wait.until(ExpectedConditions.elementToBeClickable(copy.viewVoucherCode));
	    waitForElementDisplay(copy.viewVoucherCode);
		//Actions act = new Actions(driver);
		//act.moveToElement(copy.viewVoucherCode).click().build().perform();
		copy.viewVoucherCode.click();
	}
	public void validateCopyOption(){
		driver.manage().timeouts().implicitlyWait(1260, TimeUnit.SECONDS);
		waitForElementDisplay(copy.copyOption);
          copy.copyOption.isDisplayed();


		/*
		Set <String> handles =driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		while (it.hasNext()){
		    String newwin = it.next();
		    String parentWindow = it.next();
		    driver.switchTo().window(newwin);
		     driver.switchTo().window(parentWindow);
		    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		    driver.switchTo().defaultContent();
			Utility.scrollDownWindow(driver);
			waitForElementDisplay(copy.copyOption);
		    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		    WebDriverWait wait = new WebDriverWait(driver,30);
		    waitForElementDisplay(copy.copyOption);
			copy.copyOption.isDisplayed();
	    }*/
		
	}
}
