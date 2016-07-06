package com.test.shoop.pageobjects;

import com.test.shoop.helper.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
<<<<<<< HEAD
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
=======
 * Created by shabanakhanum on 7/5/16.
 */
public class MemberActivityPageObjects {

    @FindBy(xpath = "html/body/header/div[2]/div/div[3]/nav/div[1]/div/ul/li[2]/a")
    public WebElement memberArea;
    @FindBy(xpath = "html/body/header/div[2]/div/div[1]/ul/li[1]/a/span/span")
    public WebElement myAccountButton;
    @FindBy(xpath = "html/body/div[2]/div/ui-view/div/p/span/span")
    public WebElement yourBalanceLink;
    @FindBy(xpath = "//*[@id='user.payments']")
    public WebElement paymentbutton;
    @FindBy(xpath = "//*[contains(@name,'my-account-link')]")
    public WebElement myactivityButton;
    @FindBy(xpath = "//*[@id='user.activity.purchases']")
    public WebElement userActivityPage;
    @FindBy(xpath = "//*[@id='user.settings.general']")
    public  WebElement settingButton;
    @FindBy(css = "a[e2e-edit-row='email']")
    public WebElement emailModifierLink;
    @FindBy(xpath = "//a[@id='signOut']" )
    public WebElement logOutButton;
    @FindBy(css = ".container.ng-binding")
    public WebElement settingPage;

    String memberTabs= "//*[@id='user.activity.%s']";


>>>>>>> ac177e21239f16fcabc17f5264133f73c8d2f62e
}
