package com.test.shoop.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by thadeus on 14/07/16.
 */
public class FrequentlyAskedQuestionPageObjects {

    @FindBy(xpath = "//*[@id='exp1']")
    public WebElement whatsthecashback;
    @FindBy(xpath = "//*[@id='exp2']")
    public WebElement howShoopMakesMoney;
    @FindBy(xpath = "//*[@id='exp3']")
    public WebElement safeSecure;
    @FindBy(xpath = "//*[@id='exp4']")
    public WebElement consultOfferB4SigningUp;
    @FindBy(xpath = "//*[@id='exp5']")
    public WebElement HowMuchToEarn;
    @FindBy(xpath = "//*[@id='exp6']")
    public WebElement HowItWorks;
    @FindBy(xpath = "//*[@id='helpdesk-link']")
    public WebElement contactUs;
    @FindBy(css = ".top_header_title")
    public WebElement contactPage;

    


}
