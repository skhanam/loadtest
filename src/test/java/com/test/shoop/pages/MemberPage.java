package com.test.shoop.pages;

import com.test.shoop.utility.Driver;
import org.junit.Assert;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.DrivenSeleniumLauncher;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by thadeus on 13/04/16.
 */
public class MemberPage extends Driver{

    @FindBy(xpath = "html/body/header/div[2]/div/div[3]/nav/div[1]/div/ul/li[2]/a")
    private WebElement memberArea;
    @FindBy(xpath = "html/body/header/div[2]/div/div[1]/ul/li[2]/a/span/span")
    private WebElement loginLiknk;
    @FindBy(xpath = "html/body/header/div[2]/div/div[1]/ul/li[1]/a/span/span")
    private WebElement myAccountButton;
    @FindBy(xpath = "//*[@id='user.payments']")
    private WebElement paymentbutton;
    @FindBy(xpath = "//*[@id='user.activity.purchases']")
    private WebElement myactiviyButton;
    @FindBy(xpath = "//*[@id='user.settings.general']")
    private  WebElement settingButton;
    @FindBy(xpath = "//*[@id='signOut']")
    private WebElement logOutButton;



    public void clickOnSignInLink(){
       waitForElementDisplay(loginLiknk);
        loginLiknk.click();
    }

    public void validateAccountPage(){
        waitForElementDisplay(memberArea);
        assertTrue(memberArea.getText().contains("Mon compte"));
    }

    public void validateTabsonAccountPage(List<List<String>> tab){
        //waitForElementDisplay(memberArea);
        //WebElement what = driver.findElement(By.xpath("//*[@id='user.payments']"));
        System.out.println(tab.get(1));

       Assert.assertTrue(Driver.driver.findElement(By.xpath(tab.get(1).get(0))).isDisplayed());
        Assert.assertTrue(Driver.driver.findElement(By.xpath(tab.get(2).get(0))).isDisplayed());
        Assert.assertTrue(Driver.driver.findElement(By.xpath(tab.get(3).get(0))).isDisplayed());
        Assert.assertTrue(Driver.driver.findElement(By.xpath(tab.get(4).get(0))).isDisplayed());
        Assert.assertTrue(Driver.driver.findElement(By.xpath(tab.get(5).get(0))).isDisplayed());


    }
    public void clickOnSignoutLink(){
        waitForElementDisplay(myAccountButton);
        myAccountButton.click();
        logOutButton.click();

    }
    public void validateSignOutComplete(){
        waitForElementDisplay(loginLiknk);
        assertTrue(loginLiknk.isDisplayed());

    }
}
