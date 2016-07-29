package com.test.shoop.page_stepdef;
import com.test.shoop.pages.MemberWalletPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import static com.test.shoop.config.AbstractDriver.driver;

/**
 * Created by thadeus on 19/07/16.
 */
public class MemberWalletStepDef {

    MemberWalletPage walletPage = PageFactory.initElements(driver,MemberWalletPage.class);

    @Then("^I should see transactions in my wallet$")
    public void i_should_see_transactions_in_my_wallet() throws Throwable {
       walletPage.validateUserTransaction();
    }
    @Given("^I have balance more than (\\d+) euros$")
    public void i_have_balance_more_than_euros(int arg1) throws Throwable {
        walletPage.vaiidateUserMinimumCashBackForPayment(arg1);

    }

    @Then("^I should see the wallet available \"([^\"]*)\" balance$")
    public void i_should_see_the_wallet_available_balance(int arg1) throws Throwable {
        walletPage.validateMemberAvailableBalance(arg1);


    }


}
