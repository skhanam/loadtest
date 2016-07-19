package com.test.shoop.pages;

import com.test.shoop.config.AbstractDriver;
import com.test.shoop.pageobjects.MemberZenDeskSupportPageObject;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

/**
 * Created by thadeus on 19/07/16.
 */
public class MemberZenDeskSupportPage extends AbstractDriver {

MemberZenDeskSupportPageObject supportRequest = new MemberZenDeskSupportPageObject();

     public MemberZenDeskSupportPage(){
       PageFactory.initElements(AbstractDriver.driver, supportRequest);
}

    public void clickOnTheAidLink(){
        waitForElementDisplay(supportRequest.aidLink);
        supportRequest.aidLink.click();
    }
    public void ValidateUserOnSupportPage(){
       // waitForElementDisplay(supportRequest.zenDeskFQA);
        System.out.println(driver.getTitle());
        assertTrue(supportRequest.customerserviceLink.isDisplayed());

    }

}
