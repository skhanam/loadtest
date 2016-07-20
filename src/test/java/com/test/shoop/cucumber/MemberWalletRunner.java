package com.test.shoop.cucumber;

/**
 * Created by thadeus on 19/07/16.
 */


import com.test.shoop.config.AbstractDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import java.util.logging.Logger;
import java.io.IOException;

import static com.test.shoop.config.AbstractDriver.driver;

@RunWith(Cucumber.class)
@CucumberOptions( tags="@LoginOut",
        plugin= {"pretty","html:target/cucumber","json:target/cucumber.json",
                "usage:target/cucumber-usage.json","junit:target/cucumber-results.xml"},
        monochrome = true,
        glue = { "com.test.shoop.page_stepdef",
                "com.test.shoop.config",
                "com.test.shoop.page",
                "com.test.shoop.pageobjects",
                "com.test.shoop.cucumber"},
        features={"src/test/resources/features"})

public class MemberWalletRunner {
    private static Logger LOGGER = Logger.getLogger("InfoLogging");
    @BeforeClass
    public static void setUp() throws IOException {

        LOGGER.info("Starting testing");
        AbstractDriver.initialize();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

    }

    @AfterClass
    public  static void tearDown(){
        LOGGER.info("Quiting browser");
        AbstractDriver.driver.quit();
    }



        }
