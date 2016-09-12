package com.test.shoop.pages;


import com.test.shoop.pageobjects.GoTomerchantSitePageObjects;
import com.test.shoop.pageobjects.LoginPageObjects;
import com.test.shoop.config.AbstractDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;
import java.util.concurrent.TimeUnit;
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
    GoTomerchantSitePageObjects gspo = new GoTomerchantSitePageObjects();



    public GoToMerchantPage() {
        PageFactory.initElements(AbstractDriver.driver,gspo);
    }


    public void goTomerchantPage(String merchantName){
    String url = homePage.getUrl();
    String fullUrl = url + "/"+ merchantName;
    driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    driver.get(fullUrl);
    driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    logger.info(driver.getTitle());
}

    public void confirmMemberOnShoopMerchantPage() {
        waitForElementDisplay(gspo.shoopMerchantPageTitle);
        assertTrue(gspo.shoopMerchantPageTitle.isDisplayed());
    }

    public void clickOnCashBackLink(){
        waitForElementDisplay(gspo.cashBacklink);
        gspo.cashBacklink.click();

    }
    public void clickOnCashBackLinkAgain(){
        waitForElementDisplay(gspo.cashBackAgain);
        gspo.cashBacklink.click();

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
        /*if (gspo.loginLink.isDisplayed()){
            cashBackLoginPopUp();
        }*/
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
