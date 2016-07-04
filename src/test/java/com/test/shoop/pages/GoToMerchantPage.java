package com.test.shoop.pages;

import com.test.shoop.helper.Constants;
import com.test.shoop.pageobjects.LoginPageObjects;
import com.test.shoop.utility.AbstractDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.Set;
import java.util.logging.Logger;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by thadeus on 21/06/16.
 */
public class GoToMerchantPage extends AbstractDriver {
    LoginPage loginPage = new LoginPage();
    private static Logger logger = Logger.getLogger("InfoLogging");
    HomePage homePage = new HomePage();
    LoginPageObjects loginpo = new LoginPageObjects();

//    @FindBy(xpath= Constants.userName)
//    private WebElement userName;
//    @FindBy(xpath = Constants.emailpassword)
//    private WebElement emailpassword;
//    @FindBy(xpath = Constants.loginButton)
//    private WebElement loginButton;
//    @FindBy(xpath= Constants.logi)
//    private WebElement logi;
//    @FindBy(css = Constants.loggedIn)
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
    logger.info(driver.getTitle());
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
            logger.info(strTitle);
            if (Strhandles.equals(Strhandles)) {

                waitForElementDisplay(loginpo.userName);
                loginpo.userName.sendKeys("t.ssewanyana@quidco.com");
                loginpo.emailpassword.sendKeys("kalanzi09");
                loginpo.loginButton.click();
            }
        }
    }
    public void confirmUserNavigatesToMerchantPage(){
       // waitForElementDisplay(wayOutPopup);
        if (loginLink.isDisplayed()){
            cashBackLoginPopUp();
        }
        String parent =driver.getWindowHandle();
        logger.info("Window handle for"  +driver.getTitle());
        Set<String> Strhandles =driver.getWindowHandles();
        for (String handle: Strhandles){
            //switch control to merchant window;
            driver.switchTo().window(handle);
            String strTitle=driver.getTitle();
          //  logger.info(strTitle);
            if (Strhandles.equals(Strhandles)){
                logger.info( driver.getTitle());
            }
        }
        driver.close();

    }





}
