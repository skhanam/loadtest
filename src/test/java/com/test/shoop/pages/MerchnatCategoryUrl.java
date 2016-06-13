package com.test.shoop.pages;

import com.test.shoop.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by thadeus on 08/06/16.
 */
public class MerchnatCategoryUrl extends Driver {
    HomePage homePage = new HomePage();

   // @FindBy(css = "a[id='breadcrumb-home']")
   // private WebElement backHomeButton;
    @FindBy(css = "h4 span .ng-scope")
    private WebElement backHomeButton;
    @FindBy(css = ".breadcrumb")
            private WebElement pageTopTab;

    String merchantCat = "a[id='%s']";



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
        waitForElementDisplay(backHomeButton);
       WebElement checkcatName = Driver.driver.findElement(By.cssSelector(String.format(merchantCat, cat_name)));
        assertTrue(backHomeButton.getText().contains(cat_name));

    }
    public void validateMerchantCategoryUrlPages(){
        waitForElementDisplay(pageTopTab);
        assertTrue(pageTopTab.isDisplayed());
    }






}
