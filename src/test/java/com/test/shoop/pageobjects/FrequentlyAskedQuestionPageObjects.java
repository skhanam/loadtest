package com.test.shoop.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by thadeus on 14/07/16.
 */
public class FrequentlyAskedQuestionPageObjects {

    @FindBy(xpath = "//*[@id='exp1']/div[1]/span/span")
    public WebElement whatsthecashback;
    @FindBy(xpath = "//*[@id='exp2']/div[1]/span/span")
    public WebElement howShoopMakesMoney;
    @FindBy(xpath = "//*[@id='exp3']/div[1]/span/span")
    public WebElement safeSecure;
    @FindBy(xpath = "//*[@id='exp4']/div[1]/span/span")
    public WebElement consultOfferB4SigningUp;
    @FindBy(xpath = "//*[@id='exp5']/div[1]/span/span")
    public WebElement HowMuchToEarn;
    @FindBy(xpath = "//*[@id='exp6']/div[1]/span/span")
    public WebElement HowItWorks;
    @FindBy(xpath = ".//*[@id='helpdesk-link']/span")
    public WebElement contactUs;
    @FindBy(css = ".top_header_title")
    public WebElement contactPage;




}
