package com.test.shoop.pages;

import com.test.shoop.pageobjects.MerchantCategoryUrlPageObjects;
import com.test.shoop.config.AbstractDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by thadeus on 08/06/16.
 */
public class MerchantCategoryUrlPage extends AbstractDriver {
    HomePage homePage = new HomePage();
    MerchantCategoryUrlPageObjects catUrl= new MerchantCategoryUrlPageObjects();

  public MerchantCategoryUrlPage(){
      PageFactory.initElements(AbstractDriver.driver,catUrl);
    }



    public void goToMerchantCategoryUrl(String cat_name){
        String url = "https://staging.shoop.fr";
        String fullUrl = url+"/c/"+cat_name;
        driver.get(fullUrl);
        /*String [] baseUrl = cat_name.split(",");
        for (String MC : baseUrl){
            assertTrue(fullUrl.contains(MC));
        }*/
    }

    public void validatemerchantCategoryurlPage(String cat_name){
        waitForElementDisplay(catUrl.searchResult);
       WebElement checkcatName = AbstractDriver.driver.findElement(By.cssSelector(String.format(catUrl.merchantCat, cat_name)));
        assertTrue(checkcatName.getText().contains(cat_name));

    }
    public void validateMerchantCategoryUrlPages(){
       waitForElementDisplay(catUrl.merchantName);
        assertTrue(catUrl.merchantName.isDisplayed());
    }






}
