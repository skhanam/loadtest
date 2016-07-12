package com.test.shoop.page_stepdef;

import com.test.shoop.pages.GoToMerchantPage;
import com.test.shoop.pages.LoginPage;
import com.test.shoop.config.AbstractDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by thadeus on 21/06/16.
 */
public class GotomerchantPageStepDef {
    GoToMerchantPage gotomerchantPage = PageFactory.initElements(AbstractDriver.driver, GoToMerchantPage.class);
    LoginPage login = PageFactory.initElements(AbstractDriver.driver,LoginPage.class);

    @When("^I go to a merchant page \"([^\"]*)\"$")
    public void i_go_to_a_merchant_page(String arg1) throws Throwable {
//     When("I go to a merchant page", (String url) ->  {
        gotomerchantPage.goTomerchantPage(arg1);
    }


    @When("^I click on the cashback link Obtenir mon cashback$")
    public void i_click_on_the_cashback_link_Obtenir_mon_cashback() throws Throwable {
        gotomerchantPage.clickOnCashBackLink();
        login.doDefaultLogin();

    }

    @Then("^I click again on cashback$")
    public void i_click_again_on_cashback() throws Throwable {
       // gotomerchantPage.confirmMemberOnShoopMerchantPage();
        gotomerchantPage.clickOnCashBackLink();
       // gotomerchantPage.clickOnCashBackLinkAgain();
    }


    @Then("^the user is directed to the merchants home page \"([^\"]*)\"$")
    public void the_user_is_directed_to_the_merchants_home_page(String arg1) throws Throwable {
    gotomerchantPage.confirmUserNavigatesToMerchantPage();

    }



}
