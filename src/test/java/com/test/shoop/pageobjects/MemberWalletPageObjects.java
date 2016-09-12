package com.test.shoop.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by thadeus on 19/07/16.
 */
public class MemberWalletPageObjects {


    @FindBy(xpath = "html/body/div[2]/div/ui-view/div/div[1]/div/div/div[2]/div/div/span")
    public WebElement getMyPaymentButton;
    @FindBy(xpath = "html/body/div[2]/div/ui-view/div/p/strong")
    public WebElement availableBalance;

    @FindBy(xpath = "html/body/div[2]/div/ui-view/div/div[1]/div/div/div[1]/ul/li[2]/span/span")
    public WebElement cashBackToPay;




    @FindBy(xpath = "//div[@class='payment-history']/h4/span")
    public WebElement transaction;
    //html/body/div[2]/div/ui-view/div/div[2]/table/tbody/tr/td[2]/span[2]

}
