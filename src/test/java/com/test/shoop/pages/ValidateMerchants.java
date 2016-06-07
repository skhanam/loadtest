package com.test.shoop.pages;

import com.test.shoop.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by thadeus on 06/06/16.
 */

public class ValidateMerchants extends Driver{
    Actions build = new Actions(Driver.driver);
   HomePage homePage = new HomePage();
    @FindBy(css = ".offer-badge.cashback")
    private WebElement merchantPage;
    @FindBy(css = "h4 span .ng-scope")
    private WebElement searchResult;

    public void goToMerchantPage(String merchantNames){
        String url = homePage.getUrl();

        String fullUrl = url + "/c/"+ merchantNames;
        driver.get(fullUrl);
        System.out.println(driver.getTitle());

    }
    public void validateOnShoopMerchantsPage(String m_name){
        waitForElementDisplay(merchantPage);
        assertTrue(m_name.contains(m_name));

    }


}

