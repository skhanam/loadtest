package com.test.shoop.cucumber;

import com.test.shoop.config.AbstractDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by shabanakhanum on 6/29/16.
 */


@RunWith(Cucumber.class)
@CucumberOptions( tags="@MerchantCategory",
        plugin= {"pretty","html:target/cucumber","json:target/cucumber.json",
                "usage:target/cucumber-usage.json","junit:target/cucumber-results.xml"},
        monochrome = true,
        glue = { "com.test.shoop.page_stepdef",
                "com.test.shoop.config",
                "com.test.shoop.page",
                "com.test.shoop.pageobjects",
                "com.test.shoop.cucumber"},
        features={"src/test/resources/features"}
)





public class ValidateMerchantCategoryRunner extends AbstractDriver {

    private static Logger logger = Logger.getLogger("InfoLogging");
    @BeforeClass
    public static void setUp() throws IOException {

        logger.info("Starting testing");
        AbstractDriver.initialize();
        AbstractDriver.driver.manage().window().maximize();

    }

    @AfterClass
    public static void tearDown(){
        logger.info("Quiting browser");
        AbstractDriver.driver.quit();
    }
}
