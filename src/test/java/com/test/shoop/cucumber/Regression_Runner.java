package com.test.shoop.cucumber;

import com.test.shoop.config.AbstractDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;

/**
 * Created by laxmimaddali on 1/27/17.
 */


@RunWith(Cucumber.class)
@CucumberOptions( tags="@Regression",
        plugin= {"pretty","html:target/cucumber","json:target/cucumber.json"},
        monochrome = true,
        glue = { "com.test.shoop.page_stepdef",
                "com.test.shoop.config",
                "com.test.shoop.page",
                "com.test.shoop.pageobjects",
                "com.test.shoop.cucumber"},
        features={"src/test/resources/features"}

)

public class Regression_Runner {

    @BeforeClass
    public static void setUp() throws IOException {
        System.out.println("Starting testing");
        AbstractDriver.initialize();
//        AbstractDriver.driver.manage().window().maximize();

    }

    @AfterClass
    public static void tearDown(){
        System.out.println("Quiting browser");
        AbstractDriver.driver.quit();
    }
}
