package com.test.shoop.page_sd;

import com.test.shoop.pages.HomePage;
import com.test.shoop.pages.MerchnatCategoryUrl;
import com.test.shoop.utility.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 08/06/16.
 */
public class MerchantCategory_sd extends HomePage {
    MerchnatCategoryUrl merchantCat = new MerchnatCategoryUrl();
    MerchnatCategoryUrl merchants = PageFactory.initElements(Driver.driver,MerchnatCategoryUrl .class);

    @When("^I click on a merchant\"([^\"]*)\"category name$")
    public void i_click_on_a_merchant_category_name(String arg1) throws Throwable {
        merchants.goToMerchantCategoryUrl(arg1);

    }

    @Then("^I should see merchant category \"([^\"]*)\"tabs displayed$")
    public void i_should_see_merchant_category_tabs_displayed(String arg1) throws Throwable {
        merchants.validatemerchantCategoryurlPage(arg1);



    }
    @Then("^I should see merchant category tabs displayed$")
    public void i_should_see_merchant_category_tabs_displayed() throws Throwable {
       merchants.validateMerchantCategoryUrlPages();
    }

}
