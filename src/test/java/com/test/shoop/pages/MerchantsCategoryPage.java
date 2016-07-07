package com.test.shoop.pages;
import com.test.shoop.helper.Constants;
import com.test.shoop.pageobjects.MerchantCategoryPageObjects;
import com.test.shoop.utility.AbstractDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

import static junit.framework.TestCase.assertTrue;


/**
 * Created by thadeus on 06/06/16.
 */

public class MerchantsCategoryPage extends AbstractDriver {
   HomePage homePage = new HomePage();
    MerchantCategoryPageObjects merchantCat = new MerchantCategoryPageObjects();
    private static Logger logger = Logger.getLogger("InfoLogging");

public MerchantsCategoryPage(){
    PageFactory.initElements(AbstractDriver.driver,merchantCat);
}
    public void goToMerchantPage(String merchantNames){
        String url = homePage.getUrl();
        String fullUrl = url + "/c/"+ merchantNames;
        driver.get(fullUrl);
        logger.info(driver.getTitle());

    }
    public void validateOnShoopMerchantsCategoryPage(){
        waitForElementDisplay(merchantCat.searchResult);
        assertTrue(merchantCat.backHomeButton.isDisplayed());
    }


    public void validateOnShoopMerchantsPage(String m_name){
       waitForElementDisplay(merchantCat.searchResult);
        assertTrue(merchantCat.searchResult.getText().contains(m_name));
    }

    /*public void validateMerchantCatogoryResultsPageUrl(String m_category){
        waitForElementDisplay(menuCategory);
        String [] baseCat = m_category.split(",");

        for (String al : baseCat){
            WebElement catName = driver.findElement(By.cssSelector(String.format(merchantCat,al)));
            assertTrue(catName.isDisplayed());

        }


    }*/





}

