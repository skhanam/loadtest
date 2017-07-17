package com.test.shoop.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by thadeus on 14/07/16.
 */
public class FrequentlyAskedQuestionPageObjects {

    @FindBy(xpath = "//div[@class='msm-register-faq']/msm-expandable-item[1]/div/button[1]")
    public WebElement whatsthecashback;
    @FindBy(xpath = "//div[@class='msm-register-faq']/msm-expandable-item[1]/div/div")
    public WebElement whatsthecashbackText;
    
    @FindBy(xpath = "//div[@class='msm-register-faq']/msm-expandable-item[2]/div/button[1]")
    public WebElement howShoopMakesMoney;
    @FindBy(xpath = "//div[@class='msm-register-faq']/msm-expandable-item[2]/div/div")
    public WebElement howShoopMakesMoneyText;
    
    @FindBy(xpath = "//div[@class='msm-register-faq']/msm-expandable-item[3]/div/button[1]")
    public WebElement safeSecure;
    @FindBy(xpath = "//div[@class='msm-register-faq']/msm-expandable-item[3]/div/divn")
    public WebElement safeSecureText;
    
    @FindBy(xpath = "//div[@class='msm-register-faq']/msm-expandable-item[4]/div/button[1]")
    public WebElement consultOfferB4SigningUp;
    @FindBy(xpath = "//div[@class='msm-register-faq']/msm-expandable-item[4]/div/div")
    public WebElement consultOfferB4SigningUpText;
    
    @FindBy(xpath = "//div[@class='msm-register-faq']/msm-expandable-item[5]/div/button[1]")
    public WebElement HowMuchToEarn;
    @FindBy(xpath = "//div[@class='msm-register-faq']/msm-expandable-item[5]/div/div")
    public WebElement HowMuchToEarnText;
    
    @FindBy(xpath = "//div[@class='msm-register-faq']/msm-expandable-item[6]/div/button[1]")
    public WebElement HowItWorks;
    @FindBy(xpath = "//div[@class='msm-register-faq']/msm-expandable-item[6]/div/div")
    public WebElement HowItWorksText;
    
    @FindBy(xpath = "//*[@id='helpdesk-link']")
    public WebElement contactUs;
    
    @FindBy(css = ".top_header_title")
    public WebElement contactPage;
}
