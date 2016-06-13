package com.test.shoop.page_sd;

import com.test.shoop.pages.ValidateMerchants;
import com.test.shoop.utility.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 06/06/16.
 */
public class ValidateShoopMechants_sd {


    ValidateMerchants validatemerchants = PageFactory.initElements(Driver.driver,ValidateMerchants.class);


    @When("^I go to \"([^\"]*)\" page$")
    public void i_go_to_page(String arg1) throws Throwable {
        validatemerchants.goToMerchantPage(arg1);

    }

    @Then("^I should be on the shoop \"([^\"]*)\" merchant page$")
    public void i_should_be_on_the_shoop_merchant_page(String arg1) throws Throwable {
        validatemerchants.validateOnShoopMerchantsPage(arg1);
    }




}
