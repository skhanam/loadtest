package com.test.shoop.pages;

import com.test.shoop.helper.Constants;
import com.test.shoop.utility.AbstractDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by thadeus on 08/06/16.
 */
public class MerchantCategoryUrlPage extends AbstractDriver {
    HomePage homePage = new HomePage();

    @FindBy(css = "a[id='breadcrumb-home']")
    private WebElement backHomeButton;
    @FindBy(css = Constants.searchResult)
    private WebElement searchResult;
    @FindBy(css = Constants.pageTopTab)
    private WebElement pageTopTab;

    String merchantCat = "#%s";



    public void goToMerchantCategoryUrl(String cat_name){
        String url = homePage.getUrl();
        String fullUrl = url + "/c/"+ cat_name;
        driver.get(fullUrl);
        /*String [] baseUrl = cat_name.split(",");
        for (String MC : baseUrl){
            assertTrue(fullUrl.contains(MC));
        }*/
    }

    public void validatemerchantCategoryurlPage(String cat_name){
        waitForElementDisplay(searchResult);
       WebElement checkcatName = AbstractDriver.driver.findElement(By.cssSelector(String.format(merchantCat, cat_name)));
        assertTrue(checkcatName.getText().contains(cat_name));

    }
    public void validateMerchantCategoryUrlPages(){
       waitForElementDisplay(backHomeButton);
        //assertTrue(backHomeButton.isDisplayed());
    }






}
