package com.test.shoop.cucumber;

import com.test.shoop.config.AbstractDriver;
import com.test.shoop.pages.HomePage;
import com.test.shoop.pages.LoginPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import java.util.logging.Logger;


/**
 * Created by sThadeus sewanyana on 18/03/2016.
 */
public class Hooks extends AbstractDriver {

    public static Logger logger = Logger.getLogger("InfoLogging");
    public HomePage homePage = new HomePage();
    public LoginPage loginPage = new LoginPage();

    @Before
    public void beforeScenario(Scenario scenario) throws Exception {
        logger.info( "Starting before each scenario ..");
//        driver.manage().window().maximize();
            for(String tag : scenario.getSourceTagNames()){
                System.out.print("Tag: " + tag);
            }
        }


    public void embedScreenshot(Scenario scenario) {
        try {
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
    }

    @After
    public void afterScenario(Scenario scenario) {
        embedScreenshot(scenario);
//        loginPage.newUserlogout();
    }


}
