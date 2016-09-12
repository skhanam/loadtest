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


    @When("^I click on the Au fait, c'est quoi le cashback link$")
    public void i_click_on_the_Au_fait_c_est_quoi_le_cashback_link() throws Throwable {
        questions.clickOnByTheWaywhatsTheCashbackLink();

    }

    @Then("^I should see text containing \"([^\"]*)\"$")
    public void i_should_see_text_containing(String arg1) throws Throwable {
        questions.validateTheWaywhatsTheCashbackLink(arg1);

    }
    
    @Then("^I should see text containing \"([^\"]*)\" in how he makes money$")
    public void i_should_see_text_containing_in_how_he_makes_money(String makes_money){
    	questions.validateShoopHowHeMakesMoney(makes_money);
    }

    @When("^I click on the Comment Shoop gagne-t-il de l'argent link$")
    public void i_click_on_the_Comment_Shoop_gagne_t_il_de_l_argent_link() throws Throwable {
        questions.clickOnShoopHowHeMakesMoneyLink();

    }

    @When("^I click on the Est-ce que c'est sûr et sécurisé link$")
    public void i_click_on_the_Est_ce_que_c_est_sûr_et_sécurisé_link() throws Throwable {
        questions.clickOnIsItSafeAndSecureLink();
    }

    @Then("^I should see text containing \"([^\"]*)\" how shoop is secure$")
    public void i_should_see_text_containing_how_shoop_is_secure(String arg1) throws Throwable {
        questions.validatesIsItSafeAndSecureLink(arg1);

    }

    @When("^I click on the Peut-on consulter les offres avant de s'inscrire  link$")
    public void i_click_on_the_Peut_on_consulter_les_offres_avant_de_s_inscrire_link() throws Throwable {
        questions.clickOncanWeConsultTheOffersBeforeSignUpLink();

    }

    @Then("^I should see text containing \"([^\"]*)\" offers$")
    public void i_should_see_text_containing_offers(String arg1) throws Throwable {
        questions.validateCanWeConsultTheOffersBeforeSignUpLink(arg1);

    }

    @When("^I click on the Combien vaisje gagner  link$")
    public void i_click_on_the_Combien_vaisje_gagner_link() throws Throwable {
        questions.clickOnHowMuchWillIEarnLink();

    }

    @Then("^I should see text containing \"([^\"]*)\" how much can earn$")
    public void i_should_see_text_containing_how_much_can_earn(String arg1) throws Throwable {
        questions.ValidateHowMuchWillEarnLink(arg1);

    }

    @When("^I click on the Comment ça marche link$")
    public void i_click_on_the_Comment_ça_marche_link() throws Throwable {
        questions.clickOnhowITWorksLink();

    }

    @Then("^I should see text containing \"([^\"]*)\" how shoop works$")
    public void i_should_see_text_containing_how_shoop_works(String arg1) throws Throwable {
        questions.validateHowITWorksLink(arg1);
    }

    @When("^I click on the Contact us link$")
    public void i_click_on_the_Contact_us_link() throws Throwable {
        questions.clickOnTheContactLink();
    }

    @Then("^I should be on customer service page$")
    public void i_should_be_on_customer_service_page() throws Throwable {
        questions.ValidateOnTheContactLinkPage();

    }





}