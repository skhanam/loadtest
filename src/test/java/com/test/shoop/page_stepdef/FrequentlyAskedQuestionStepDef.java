package com.test.shoop.page_stepdef;
import com.test.shoop.config.AbstractDriver;
import com.test.shoop.pages.FrequentlyAskedQuestionsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by thadeus on 14/07/16.
 */
public class FrequentlyAskedQuestionStepDef {
    FrequentlyAskedQuestionsPage questions = PageFactory.initElements(AbstractDriver.driver,FrequentlyAskedQuestionsPage.class);

    @When("^I click on the Au fait cest quoi le cashback link$")
    public void i_click_on_the_Au_fait_cest_quoi_le_cashback_link() throws Throwable {
        questions.clickOnByTheWaywhatsTheCashbackLink();

    }

    @Then("^I should see text containing \"([^\"]*)\"$")
    public void i_should_see_text_containing(String arg1) throws Throwable {
        questions.validateTheWaywhatsTheCashbackLink(arg1);

    }
    @When("^I click on the Shoop how he makes money link$")
    public void i_click_on_the_Shoop_how_he_makes_money_link() throws Throwable {
        questions.clickOnShoopHowHeMakesMoneyLink();
    }

    @Then("^I should see text saying how shoop makes monet \"([^\"]*)\"$")
    public void i_should_see_text_saying_how_shoop_makes_monet(String arg1) throws Throwable {

    }

    @When("^I click on the Comment Shoop gagne-t-il de l'argent link$")
    public void i_click_on_the_Comment_Shoop_gagne_t_il_de_l_argent_link() throws Throwable {


    }

    @When("^I click on the \"Peut-on consulter les offres avant de s'inscrire  link$")
    public void i_click_on_the_Peut_on_consulter_les_offres_avant_de_s_inscrire_link() throws Throwable {

    }

    @When("^I click on the Combien vaisje gagner  link$")
    public void i_click_on_the_Combien_vaisje_gagner_link() throws Throwable {

    }

    @When("^I click on the Comment ça marche link$")
    public void i_click_on_the_Comment_ça_marche_link() throws Throwable {

    }

    @When("^I click on the Contact us link$")
    public void i_click_on_the_Contact_us_link() throws Throwable {

    }

    @Then("^I should be on customer service page$")
    public void i_should_be_on_customer_service_page() throws Throwable {

    }
}
