package com.test.shoop.page_stepdef;

import com.test.shoop.pages.MemberActivityPage;
import com.test.shoop.pages.MerchantSearchPage;
import com.test.shoop.utility.AbstractDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 15/04/16.
 */
public class SearchTermStepDef {
    MemberActivityPage memberpage= PageFactory.initElements(AbstractDriver.driver, MemberActivityPage.class);
    MerchantSearchPage searchPage = PageFactory.initElements(com.test.shoop.utility.AbstractDriver.driver,MerchantSearchPage.class);

    @When("^I enter merchant name \"([^\"]*)\" in the search field$")
    public void i_enter_merchant_name_in_the_search_field(String arg1) throws Throwable {
        searchPage.searchMerchants(arg1);


    }

    @Then("^click on the search result$")
    public void click_on_the_search_result() throws Throwable {
        searchPage.clickOnSearchResult();

    }

    @Then("^I should be on shoop merchant page$")
    public void i_should_be_on_shoop_merchant_page() throws Throwable {
        searchPage.validateOnMerchantPage();
        memberpage.clickOnSignoutLink();

    }


}
