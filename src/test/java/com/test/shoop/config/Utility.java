package com.test.shoop.config;

import java.awt.Toolkit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public final class Utility {

	
     public static void setWindowMaximise(WebDriver driver){
	        Toolkit toolkit = Toolkit.getDefaultToolkit();
	        Dimension screenResolution = new Dimension((int)
	                toolkit.getScreenSize().getWidth(), (int)
	                toolkit.getScreenSize().getHeight());
	        System.out.println("Print the screen resolution :" + screenResolution);
	        driver.manage().window().setSize(screenResolution);
	        
	    }
	
     public static void scrollDownWindow(WebDriver driver){
    	 
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
     	js.executeScript("window.scrollBy(0,200)", "");
     	
     	
     	
     }
     public static void acceptCookies(WebDriver driver){
    	 
    	try{
     Actions act = new Actions(driver);
 	act.moveToElement(driver.findElement(By.xpath("//*[@ng-click='close()']"))).click().build().perform();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
     }
}