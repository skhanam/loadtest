package com.test.shoop.helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by thadeus on 15/06/16.
 */
public class Constants {


    //chromebinaries
    public static final String  chromeWindowsdriver="/src/test/resources/WinbrowserBinaries/chromedriver.exe";
    public static final String  chromeCentosdriver="/src/test/resources/centosChromeDriverBinaries/chromedriver";
    public static final String  chromeLinuxdriver="/src/test/resources/linux/googlechrome/64bit/chromedriver";
    public static final String  chromeMacdriver="/src/test/resources/macChromedriver/chromedriver";


// Member setting

    public static final String editFname= "//*[contains(@name,'first_name')]";
    public static final String editLname = "//*[contains(@name,'last_name')]";
    public static final String editEmail = "//*[contains(@type,'email')]";
    public static final String emailConfirmation = "//*[contains(@name,'confirmation')]";
    public static final String editPassword = "//*[contains(@name,'password' )]";
    public static final String editUsername="//*[contains(@name,'username')]";
    public static final String dayOFBirth = "//*[contains(@name,'year')]";
    public static final String monthOFBirth = "//*[contains(@name,'month')]";
    public static final String yearOFBirth = "//*[contains(@name,'year')]";
    public static final String editPositcode = "//*[contains(@name,'post_code')]";
    public static final String malesex = "#male";
    public static final String Femalesex = "#female";
    public static final String submitEditDataButton ="//*[contains(@type,'submit')]";
    public static final String generalSettings= "//*[@id='user.settings.general']";
    public static final String successfulUpdates = ".inline-notification.ng-isolate-scope.successful";
    //links
    public static final String nameModifierLink = "html/body/div[2]/div/ui-view/div/div/div/div[2]/div/div[1]/div[1]/div[3]/a";
    public static final String emailModifierLink="html/body/div[2]/div/ui-view/div/div/div/div[2]/div/div[2]/div[1]/div[3]/a";
    public static final String genderModifierLink = "html/body/div[2]/div/ui-view/div/div/div/div[2]/div/div[3]/div[1]/div[3]/a";
    public static final String usernameModifierLink= "html/body/div[2]/div/ui-view/div/div/div/div[2]/div/div[4]/div[1]/div[3]/a";
    public static final String dateOFBirthModiefierLink = "html/body/div[2]/div/ui-view/div/div/div/div[2]/div/div[5]/div[1]/div[3]/a";
    public static final String postCodeModiefier = "html/body/div[2]/div/ui-view/div/div/div/div[2]/div/div[6]/div[1]/div[3]/a";


    //login
    public static final String memberArea = "html/body/header/div[2]/div/div[3]/nav/div[1]/div/ul/li[2]/a";
    public static final String myAccountButton = "html/body/header/div[2]/div/div[1]/ul/li[1]/a/span/span";
    public static final String yourBalanceLink= "html/body/div[2]/div/ui-view/div/p/span/span";
    public static final String paymentbutton = "//*[@id='user.payments']";
    public static final String myactiviyButton= "//*[contains(@name,'my-account-link')]";
    public static final String userActivityPage="//*[@id='user.activity.purchases']";
    public static final String settingButton = "//*[@id='user.settings.general']";
    public static final String logOutButton = "//a[@id='signOut']";


    String memberTabs= "//*[@id='user.activity.%s']";

    public static final String loginPopup= "h1.mb20 > span.ng-scope";
    public static final String loginLink= "//a[contains(@href,'je-me-connecte')]";
    public static final String userName="username";
    public static final String password= "//input[@type='password']";
    public static final String loginButton = "//button[@type='submit']";
    public static final String rememberMe = "#persist_signin";
    public static final String invalidemailPassword ="html/body/div[2]/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[2]/div";
    public static final String searchResult= "h4 span .ng-scope";
    public static final String menuCategory= ".//*[@id='menu-categories']/div[1]/div";
    public static final String pageTopTab = ".breadcrumb";


    public static final String merchantRate =".styled-rate-text.ng-binding.ng-scope";
    String catTable = ".category-list>ul>li>a:contains('%s')";






}
