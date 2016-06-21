package com.test.shoop.pages;
import com.test.shoop.helper.Constants;
import com.test.shoop.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static junit.framework.TestCase.assertTrue;

/**
 * Created by Thadeus ssewanyana on 18/03/2016.
 */
public class MerchantSearch extends Driver {
      WebDriverWait wait= new WebDriverWait(driver,20);
    @FindBy(css = Constants.merchantRate)
    private WebElement merchantRate;
    String catTable = ".category-list>ul>li>a:contains('%s')";

    public void clickOnMerchantTab(String m_name){
        WebElement catName= driver.findElement(By.cssSelector(String.format(catTable, m_name)));
        wait.until(ExpectedConditions.visibilityOf(catName));
        driver.findElement(By.cssSelector(String.format(catTable, m_name))).click();



    }

    public void confirmOnCategoryList() {
        waitForElementDisplay(merchantRate);
        assertTrue(merchantRate.isDisplayed());


       /* List<WebElement> elements = driver.findElements(By.cssSelector(".item-inner.ng-binding"));
        elements.get(0).click();
        String catResult = driver.findElement(By.cssSelector("h4 span .ng-scope")).getText().replaceAll("([A-Za-z\\s])\\w+", "").trim();
        WebElement p= driver.findElement(By.cssSelector("div .show-more-big-button .ng-scope"));
        do {

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", p);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();",p);
            WebDriverWait wait= new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfAllElements((driver.findElements(By.cssSelector(".merchants-list a div h4")))));
            System.out.println(driver.findElements(By.cssSelector(".merchants-list a div h4")).size());
        }
        while(p.isDisplayed());
        Assert.assertEquals(Integer.parseInt(catResult),driver.findElements(By.cssSelector(".merchants-list a div h4")).size());
        driver.quit();

    }*/
    }
    }

