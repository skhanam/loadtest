package com.test.shoop.pageobjects;

import com.test.shoop.helper.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by thadeus on 06/07/16.
 */
public class MemberActivityPageObjects {

    @FindBy(xpath = Constants.memberArea)
    public WebElement memberArea;
    @FindBy(xpath = Constants.loginLink)
    public WebElement loginLiknk;
    @FindBy(xpath = Constants.myAccountButton)
    public WebElement myAccountButton;
    @FindBy(xpath = Constants.yourBalanceLink)
    public WebElement yourBalanceLink;
    @FindBy(xpath = Constants.paymentbutton)
    public WebElement paymentbutton;
    @FindBy(xpath = Constants.myactiviyButton)
    public WebElement myactiviyButton;
    @FindBy(xpath = Constants.userActivityPage)
    public WebElement userActivityPage;
    @FindBy(xpath = Constants.settingButton)
    public  WebElement settingButton;
    @FindBy(css = Constants.emailModifierLink)
    public WebElement emailModifierLink;
    @FindBy(xpath = Constants.logOutButton )
    public WebElement logOutButton;
    @FindBy(css = Constants.settingPage)
    public WebElement settingPage;

    String memberTabs= "//*[@id='user.activity.%s']";
}
