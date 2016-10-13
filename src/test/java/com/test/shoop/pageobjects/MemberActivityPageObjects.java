package com.test.shoop.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**11
 * Created by thadeus on 06/07/16.
 */
public class MemberActivityPageObjects {

    @FindBy(xpath = "//a[contains(@href,'je-me-connecte')]")
    public WebElement loginLiknk;
    @FindBy(xpath = "html/body/header/div[2]/div/div[3]/nav/div[1]/div/ul/li[2]/a")
    public WebElement memberArea;
    @FindBy(xpath = "html/body/header/div[2]/div/div[1]/ul/li[1]/a/span/span")
    public WebElement myAccountButton;
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
    @FindBy(xpath = "//a[@id='signOut']")
    public WebElement logOutButton;
    @FindBy(xpath = "//div[@class='settings-fields']/div[2]/div[1]/div/div[3]/div/div")
    public WebElement settingPage;

    String memberTabs= "//*[@id='user.activity.%s']";



}
