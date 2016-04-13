package com.test.shoop.pages;

import com.test.shoop.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Thadeus Ssweanyana on 3/21/2016.
 */
public class LoginPage extends Driver {
    Actions build  = new Actions(Driver.driver);

    @FindBy(css = "h1.mb20 > span.ng-scope")
    private WebElement loginPopup;
    //a[name='login-link']
    //a[ui-sref="signIn"]
    //li[2]/a/span/span"
    @FindBy(css = "a[name='login-link']")
    private WebElement loginLink;
    @FindBy(xpath= "//input[@type='email']")
    private WebElement username;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement emailpassword;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;
    @FindBy(xpath= "html/body/div[1]/div/div[1]/h1/span[2]")
    private WebElement loggedIn;
    @FindBy(css = "h1.greeting-header > span.ng-binding.ng-scope")
    private WebElement confirmUserLogged;

    @FindBy(xpath = "tml/body/header/div[2]/div/div[1]/ul/li[1]/a/span/span")
    private WebElement myAccount;
    @FindBy(css = ".ng-scope:contains('Mon compte')")
    private WebElement userAccount;
    @FindBy(css = "a[name='sign-out-link']")
    private WebElement signOutLink;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[2]/div")
    private  WebElement incorrectlogindetails;

    public void clickOnLoginLink(){
        waitForElementDisplay(loginLink);
        loginLink.click();
    }
    public void enterUsernameAndPassWord(){

        waitForElementDisplay(username);
        username.sendKeys("t.ssewanyana@quidco.com");
        emailpassword.sendKeys("kalanzi09");
        loginButton.click();
    }
    public void validateUserLoggedIn(){
        waitForElementDisplay(loggedIn);
        assertTrue(loggedIn.isDisplayed());
    }

    public void logOutUser(){
        waitForElementDisplay(myAccount);
        build.click(myAccount).build().perform();
        build.moveToElement(signOutLink).
                click().
                build().
                perform();
    }


    public void enterUsernameAndIncorrectPassWord(){
        waitForElementDisplay(username);
        username.sendKeys("t.ssewanyana@quidco.com");
        emailpassword.sendKeys("kalanzi0");
        loginButton.click();
    }
    public void validateUserInvaliddetailsIsdisplayed(){
        waitForElementDisplay(loggedIn);
        assertTrue(incorrectlogindetails.isDisplayed());
        System.out.println(incorrectlogindetails.getText());

    }

}
