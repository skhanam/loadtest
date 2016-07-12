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
 * Created by thadeus on 06/07/16.
 */

@RunWith(Cucumber.class)
@CucumberOptions( tags="@MemberActivity",
        plugin= {"pretty","html:target/cucumber","json:target/cucumber.json",
        "usage:target/cucumber-usage.json","junit:target/cucumber-results.xml"},
        monochrome = true,
        glue = { "com.test.shoop.page_stepdef",
                "com.test.shoop.com.test.shoop.utility",
                "com.test.shoop.page","com.test.shoop.helper",
                "com.test.shoop.cucumber"},
        features={"src/test/resources/features"}

)
public class MemberActivityPageRunner extends AbstractDriver {

    private static Logger LOGGER = Logger.getLogger("InfoLogging");
    @BeforeClass
    public static void setUp() throws IOException {

        LOGGER.info("Starting testing");
        AbstractDriver.initialize();
        AbstractDriver.driver.manage().deleteAllCookies();
        AbstractDriver.driver.manage().window().maximize();


    }

    @AfterClass
    public  static void tearDown(){
        LOGGER.info("Quiting browser");
        AbstractDriver.driver.quit();
    }

}
