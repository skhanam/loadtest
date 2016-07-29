package com.test.shoop.cucumber;

import com.test.shoop.config.AbstractDriver;
import cucumber.api.junit.Cucumber;

/**
 * Created by thadeus on 19/07/16.
 */


import cucumber.api.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.logging.Logger;


/**
 * Created by thadeus on 25/07/16.
 */

@RunWith(Cucumber.class)
@CucumberOptions( tags="@MemberWallet",

        plugin= {"pretty","html:target/cucumber","json:target/cucumber.json"},
        monochrome = true,
        glue = { "com.test.shoop.page_stepdef",
                "com.test.shoop.config",
                "com.test.shoop.page",
                "com.test.shoop.pageobjects",
                "com.test.shoop.cucumber"},
        features={"src/test/resources/features"}

)
public class MemberWalletRunner {

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