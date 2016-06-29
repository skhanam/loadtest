package com.test.shoop.page_stepdef;

import com.test.shoop.pages.HomePage;
import com.test.shoop.pages.MerchantCategoryUrlPage;
import com.test.shoop.utility.AbstractDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 08/06/16.
 */
public class MerchantCategoryStepDef extends HomePage {
    MerchantCategoryUrlPage merchantCat = new MerchantCategoryUrlPage();
    MerchantCategoryUrlPage merchants = PageFactory.initElements(AbstractDriver.driver,MerchantCategoryUrlPage.class);

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
