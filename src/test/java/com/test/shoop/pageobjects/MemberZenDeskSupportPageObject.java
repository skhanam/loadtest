package com.test.shoop.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by thadeus on 19/07/16.
 */
public class MemberZenDeskSupportPageObject {
	                
    @FindBy(xpath = "html/body/header/div[2]/div/div[1]/ul/li[3]/a")
    public WebElement aidLink;
    @FindBy(xpath = "html/body/main/section/div/div[1]/div[2]/p[3]/a")
    public WebElement customerserviceLink;
    @FindBy(xpath = "html/body/main/section/div/div[1]/div[1]/ul[1]/li[1]/a")
    public WebElement zenDeskFQA;
    @FindBy(xpath = "//*[@id='new_request']/div[1]/a")
    public WebElement cashBackQuestionDropdown;
    @FindBy(xpath = "//*[@id='new_request']/div[2]/a")
    public WebElement specifyRequestDropdown;
    @FindBy(xpath = "//*[@id='request_description']")
    public WebElement comment;
    @FindBy(xpath = "//*[@id='request_custom_fields_27804421']")
    public WebElement dealername;
    @FindBy(xpath = "//*[@id='new_request']/div[5]/input[1]")
    public WebElement orderDate;
    @FindBy(xpath = "//*[@id='request_custom_fields_27804411']")
    public WebElement taxFreeAmountOfOrder;
    @FindBy(xpath = "//*[@id='request_custom_fields_27804401']")
    public WebElement orderNumber;
    @FindBy(xpath = "//*[@id='new_request']/div[8]/a")
    public WebElement orderTypeDropdown;
    @FindBy(xpath = "//*[@id='new_request']/footer/input")
    public WebElement sendRequestButton;

}
