package com.test.shoop.pages;
import com.test.shoop.helper.Constants;
import com.test.shoop.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static junit.framework.TestCase.assertTrue;


/**
 * Created by thadeus on 06/06/16.
 */

public class ValidateMerchants extends Driver{
   HomePage homePage = new HomePage();

    @FindBy(css = Constants.searchResult)
    private WebElement searchResult;
    @FindBy(xpath = Constants.menuCategory)
    private WebElement menuCategory;



    public void goToMerchantPage(String merchantNames){
        String url = homePage.getUrl();
        String fullUrl = url + "/c/"+ merchantNames;
        driver.get(fullUrl);
        System.out.println(driver.getTitle());

    }
    public void validateOnShoopMerchantsPage(String m_name){
       waitForElementDisplay(searchResult);
        assertTrue(searchResult.getText().contains(m_name));
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

