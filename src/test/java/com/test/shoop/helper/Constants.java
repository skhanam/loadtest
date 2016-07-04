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


    //Search

    public static final String searchHome =".form-control.search-input.ng-valid.ng-dirty.ng-valid-parse.ng-touched";
    public static final String SearchResult= ".e2e-list-merchant-name.ng-binding";
    public static final String cashBacklink="html/body/div[2]/div/div[5]/div/div[1]/div/div[3]/div/div[2]/a";
    public static final String wayOutPopup=".modal-header.visit-confirmation-modal.ng-scope>h4";
    public static final String pageTitle="Groupon Codes Promo, Cashback & Bons de Réduction | Shoop - Le Meilleur du Cashback & du Code Promo";

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

    public static final String nameModifierLink = "a[e2e-edit-row='name']";
    public static final String emailModifierLink="a[e2e-edit-row='email']";
    public static final String genderModifierLink = "a[e2e-edit-row='gender']";
    public static final String usernameModifierLink= "a[e2e-edit-row='username']";
    public static final String dateOFBirthModiefierLink = "a[e2e-edit-row='birthdate']";
    public static final String postCodeModiefier = "a[e2e-edit-row='postcode']";
    public static final String settingPage=".container.ng-binding";




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
    public static final String userName="//input[@type='email']";
    public static final String password= "//input[@type='password']";
    public static final String loginButton = "//button[@type='submit']";
    public static final String rememberMe = "#persist_signin";
    //reg
    public static final String registrationLink="html/body/header/div[2]/div/div[1]/ul/li[1]/a/span/span";
    public static final String regTermsAndConditions="html/body/div[2]/div/div[2]/div[1]/div/div[2]/form/div[3]/label/span[1]/span";
    public static final String acceptToReceiveShoopOffers="html/body/div[2]/div/div[2]/div[1]/div/div[2]/form/div[4]/label/span[1]/span";
    public static final String invalidemailPassword ="html/body/div[2]/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[2]/div";
    public static final String welcomeGreetings=".greeting-header>span";
    public static final String regErrorMessage="html/body/div[2]/div/div[2]/div[1]/div/div[2]/form/div[5]/div/span/span";
    public static final String searchResult= "#courses-en-ligne-drive";
    public static final String menuCategory= ".//*[@id='menu-categories']/div[1]/div";
    public static final String pageTopTab = "#courses-en-ligne-drive";

    public static final String merchantRate =".styled-rate-text.ng-binding.ng-scope";

//    public static final String emailpassword= "//input[@type='password']";
//    public static final String logi= "html/body/div[1]/div/div[1]/h1/span[2]";
//    public static final String loggedIn= ".qp-flash-notification.active";
//    public static final String confirmUserLogged= "h1.greeting-header > span.ng-binding.ng-scope";
//    public static final String myAccount = "html/body/header/div[2]/div/div[1]/ul/li[1]/a/span/span";
//    public static final String userAccount= ".ng-scope:contains('Mon compte')";
//    public static final String signOutLink= "//*[@id='signOut']";
//    public static final String incorrectlogindetails= "html/body/div[1]/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[2]/div";
     public static final String category="//*[@id='%s']";
    public static final String merchantCatResult=".e2e-list-merchant-name.ng-binding:contains(%s)";
    String catTable = ".category-list>ul>li>a:contains('%s')";
    public static final String searchField="search";
    public static final String merchantPageCashback="html/body/div[2]/div/div[5]/div/div[1]/div/div[3]/div/div[2]/a";




}
