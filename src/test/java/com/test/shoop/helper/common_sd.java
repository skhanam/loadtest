package com.test.shoop.helper;
import com.test.shoop.pages.LoginPage;
import com.test.shoop.utility.Driver;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;



/**
 * Created by thadeus on 14/06/16.
 */
public class common_sd {
    LoginPage login = PageFactory.initElements(Driver.driver,LoginPage.class);
    @When("^I click on the login link$")
    public void i_click_on_the_login_link() throws Throwable {
       login.clickOnLoginLink();
    }
}
