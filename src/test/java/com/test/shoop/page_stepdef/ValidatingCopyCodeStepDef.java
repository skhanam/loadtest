package com.test.shoop.page_stepdef;

import org.openqa.selenium.support.PageFactory;

import com.test.shoop.config.AbstractDriver;
import com.test.shoop.pages.ValidatingCopyCodePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidatingCopyCodeStepDef extends AbstractDriver{
	
	ValidatingCopyCodePage copyCode = PageFactory.initElements(driver, ValidatingCopyCodePage.class);
	
	@When("^I enter merchant name in the search field$")
	public void i_enter_merchant_name_in_the_search_field(){
		copyCode.enterMerchantNameinSearch();
	}
	@And("^I click on Merchant name$")
	public void i_click_on_Merchant_name(){
		copyCode.clickOnMerchantName();
	}
	@And("^I click on view code option$")
	public void i_click_on_view_code_option(){
		copyCode.clickOnViewCodeButton();
	}
	@Then("^I should see copy option beside the code$")
	public void i_should_see_copy_option_beside_the_code(){
		copyCode.validateCopyOption();
	}

}
