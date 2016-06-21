package com.test.shoop.pages;
import com.test.shoop.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static junit.framework.TestCase.assertTrue;


/**
 * Created by thadeus on 06/06/16.
 */

public class ValidateMerchants extends Driver{
   HomePage homePage = new HomePage();

    String searchButton = "//*[starts-with(@id, '%s')][@type='submit']";


    @FindBy(css = "h4 span .ng-scope")
    private WebElement searchResult;
    @FindBy(xpath = ".//*[@id='menu-categories']/div[1]/div")
     private WebElement menuCategory;
    String merchantCat = "#%s";


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

