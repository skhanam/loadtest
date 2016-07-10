package com.test.shoop.page_stepdef;

import com.test.shoop.pages.HomePage;
import com.test.shoop.pages.MerchantSearchPage;
import com.test.shoop.utility.AbstractDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class LandingPageStepDef {
    private HomePage landingpage = new HomePage();
    private MerchantSearchPage searchPage = PageFactory.initElements(AbstractDriver.driver,MerchantSearchPage.class);

    @Given("^I go to shoop home Page$")
    public void i_go_to_shoop_home_Page() throws Throwable {
        landingpage.navigateToHomePage();
    }

        @When("^I click on merchant\"(.*?)\"category name$")
    public void i_click_on_merchant_category_name(String arg1) throws Throwable {
            searchPage.clickOnMerchantTab(arg1);

    }

    @Then("^I should see a category of merchant$")
    public void i_should_see_a_category_of_merchant() throws Throwable {
        searchPage.confirmOnCategoryList();

}

}
