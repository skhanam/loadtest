package com.test.shoop.pages;

import com.test.shoop.helper.Constants;
import com.test.shoop.utility.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by thadeus on 21/06/16.
 */
public class GoToMerchantPage extends DriverFactory {
LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @FindBy(name= Constants.userName)
    private WebElement userName;
    @FindBy(xpath = Constants.emailpassword)
    private WebElement emailpassword;
    @FindBy(xpath = Constants.loginButton)
    private WebElement loginButton;
    @FindBy(xpath= Constants.logi)
    private WebElement logi;
    @FindBy(css = Constants.loggedIn)
    private WebElement searchHome;
    @FindBy(css = Constants.searchResult)
    private WebElement searchResult;
    @FindBy(xpath = Constants.cashBacklink)
    private WebElement cashBacklink;
    @FindBy(css = Constants.wayOutPopup)
    private WebElement wayOutPopup;

    @FindBy(xpath = Constants.loginLink)
    private WebElement loginLink;



public void goTomerchantPage(String merchantName){
    String url = homePage.getUrl();
    String fullUrl = url + "/"+ merchantName;
    driver.get(fullUrl);
    System.out.println(driver.getTitle());
}

    public void confirmOnShoopMerchantPage(String pagetitle) {
        waitForElementDisplay(cashBacklink);
        assertTrue(driver.getTitle().contains(pagetitle));
    }

    public void clickOnCashBackLink(){
        waitForElementDisplay(cashBacklink);
        cashBacklink.click();

    }

    public void cashBackLoginPopUp(){
        Set<String> Strhandles =driver.getWindowHandles();
        for (String handle: Strhandles) {
            //switch control to merchant window;
            driver.switchTo().window(handle);
            String strTitle = driver.getTitle();
            System.out.println(strTitle);
            if (Strhandles.equals(Strhandles)) {

                waitForElementDisplay(userName);
                userName.sendKeys("t.ssewanyana@quidco.com");
                emailpassword.sendKeys("kalanzi09");
                loginButton.click();
            }
        }
    }
    public void confirmUserNavigatesToMerchantPage(){
       // waitForElementDisplay(wayOutPopup);
        if (loginLink.isDisplayed()){
            cashBackLoginPopUp();
        }
        String parent =driver.getWindowHandle();
        System.out.println("Window handle for"  +driver.getTitle());
        Set<String> Strhandles =driver.getWindowHandles();
        for (String handle: Strhandles){
            //switch control to merchant window;
            driver.switchTo().window(handle);
            String strTitle=driver.getTitle();
          //  System.out.println(strTitle);
            if (Strhandles.equals(Strhandles)){
                System.out.println( driver.getTitle());
            }
        }
        driver.close();

    }





}
