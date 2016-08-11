package com.test.shoop.config;

import java.awt.Toolkit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.test.shoop.pageobjects.LoginPageObjects;

public final class Utility {

	static LoginPageObjects ulp = new LoginPageObjects();
	

    public Utility() {

       PageFactory.initElements(AbstractDriver.driver, ulp);
     
    }
	
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
           act.moveToElement(ulp.cookie).click().build().perform();
            
    }catch(Exception e){
                 System.out.println("no cookie");
            }
    }
}
