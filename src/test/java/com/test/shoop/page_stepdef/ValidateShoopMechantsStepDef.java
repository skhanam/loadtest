package com.test.shoop.page_stepdef;

import com.test.shoop.pages.MerchantsCategoryPage;
import com.test.shoop.config.AbstractDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 06/06/16.
 */
public class ValidateShoopMechantsStepDef {


    MerchantsCategoryPage validatemerchants = PageFactory.initElements(AbstractDriver.driver,MerchantsCategoryPage.class);


    @When("^I click on a merchant category\"([^\"]*)\" link$")
    public void i_click_on_a_merchant_category(String arg1) throws Throwable {
        validatemerchants.goToMerchantPage(arg1);

    }
    @Then("^I should be on the shoop merchant category page$")
    public void i_should_be_on_the_shoop_merchant_category_page() throws Throwable {
       validatemerchants.validateOnShoopMerchantsCategoryPage();

    }
    @Then("^I should be on the shoop \"([^\"]*)\" merchant page$")
    public void i_should_be_on_the_shoop_merchant_page(String arg1) throws Throwable {
        validatemerchants.validateOnShoopMerchantsPage(arg1);
    }




}
