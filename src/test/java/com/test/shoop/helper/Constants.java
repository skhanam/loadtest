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
    public static final String nameModifierLink = "html/body/div[2]/div/ui-view/div/div/div/div[2]/div/div[1]/div[1]/div[3]/a";
    public static final String emailModifierLink=".qp-btn.qp-btn-link.ng-binding:eq(1)";
    public static final String genderModifierLink = ".qp-btn.qp-btn-link.ng-binding:eq(2)";
    public static final String usernameModifierLink= ".qp-btn.qp-btn-link.ng-binding:eq(3)";
    public static final String dateOFBirthModiefierLink = ".qp-btn.qp-btn-link.ng-binding:eq(4)";
    public static final String postCodeModiefier = ".qp-btn.qp-btn-link.ng-binding:eq(5)";


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
    public static final String regTermsAndConditions="html/body/div[2]/div/div[2]/div[1]/div/div[2]/form/div[4]/label/span[1]/span";
    public static final String registerEmail="//*[contains(type,'email')]";
    public static final String registerPassword="//*[contains(@name,'password')]";
    public static final String invalidemailPassword ="html/body/div[2]/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[2]/div";
    public static final String regWelcome=".greeting-header>span";

    public static final String searchResult= "#courses-en-ligne-drive";
    public static final String menuCategory= ".//*[@id='menu-categories']/div[1]/div";
    public static final String pageTopTab = "#courses-en-ligne-drive";

    public static final String merchantRate =".styled-rate-text.ng-binding.ng-scope";

    public static final String emailpassword= "//input[@type='password']";
    public static final String logi= "html/body/div[1]/div/div[1]/h1/span[2]";
    public static final String loggedIn= ".qp-flash-notification.active";
    public static final String confirmUserLogged= "h1.greeting-header > span.ng-binding.ng-scope";
    public static final String myAccount = "tml/body/header/div[2]/div/div[1]/ul/li[1]/a/span/span";
    public static final String userAccount= ".ng-scope:contains('Mon compte')";
    public static final String signOutLink= "a[name='sign-out-link']";
    public static final String incorrectlogindetails= "html/body/div[1]/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[2]/div";
     public static final String category="//*[@id='%s']";
    public static final String merchantCatResult=".e2e-list-merchant-name.ng-binding:contains('Bebe')";
    String catTable = ".category-list>ul>li>a:contains('%s')";




}
