package com.test.shoop.cucumber;

import com.test.shoop.utility.AbstractDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;

/**
 * Created by shabanakhanum on 6/29/16.
 */


@RunWith(Cucumber.class)
@CucumberOptions( tags="@Validatemerchantcategory",
        plugin= {"pretty","html:target/cucumber","json:target/cucumber.json",
                "usage:target/cucumber-usage.json","junit:target/cucumber-results.xml"},
        monochrome = true,
        glue = { "com.test.shoop.page_stepdef",
                "com.test.shoop.com.test.shoop.utility",
                "com.test.shoop.page","com.test.shoop.helper",
                "com.test.shoop.cucumber"},
        features={"src/test/resources/testFeature"}

)





public class ValidateMerchantCategoryRunner extends AbstractDriver {

    @BeforeClass
    public static void setUp() throws IOException {

        System.out.println("Starting testing");
        AbstractDriver.initialize();
        AbstractDriver.driver.manage().window().maximize();

    }

    @AfterClass
    public static void tearDown(){
        System.out.println("Quiting browser");
        AbstractDriver.driver.quit();
    }
}
