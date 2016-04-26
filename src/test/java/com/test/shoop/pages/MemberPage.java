package com.test.shoop.pages;

import com.test.shoop.utility.Driver;
import org.junit.Assert;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.DrivenSeleniumLauncher;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by thadeus on 13/04/16.
 */
public class MemberPage extends Driver{

    @FindBy(xpath = "html/body/header/div[2]/div/div[3]/nav/div[1]/div/ul/li[2]/a")
    private WebElement memberArea;


    public void clickOnSignInLink(){

    }

    public void validateAccountPage(){
        waitForElementDisplay(memberArea);
        Assert.assertTrue(memberArea.getText().contains("Mon compte"));
    }

    public void validateTabsonAccountPage(List<List<String>> tab){
        waitForElementDisplay(memberArea);
        Assert.assertTrue(Driver.driver.findElement(By.xpath(tab.get(1).get(0))).isDisplayed());
        Assert.assertTrue(Driver.driver.findElement(By.xpath(tab.get(2).get(0))).isDisplayed());
        Assert.assertTrue(Driver.driver.findElement(By.xpath(tab.get(3).get(0))).isDisplayed());
        Assert.assertTrue(Driver.driver.findElement(By.xpath(tab.get(4).get(0))).isDisplayed());
        Assert.assertTrue(Driver.driver.findElement(By.xpath(tab.get(5).get(0))).isDisplayed());


    }
    public void clickOnSignoutLink(){

    }
    public void validateSignOutComplete(){

    }
}
