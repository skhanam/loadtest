package com.test.shoop.cucumber;

import com.test.shoop.utility.DriverFactory;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions( tags="@smoke-testA,@SH-59,@SH-70,@SH-62,@QA-63,@QA-56,@QA-50",
        plugin= {"pretty","html:target/cucumber","json:target/cucumber.json",
                  "usage:target/cucumber-usage.json","junit:target/cucumber-results.xml"},
        monochrome = true,
        glue = { "com.test.shoop.page_stepdef",
                "com.test.shoop.com.test.shoop.utility",
                 "com.test.shoop.page","com.test.shoop.helper",
                 "com.test.shoop.cucumber"},
        features={"src/test/resources/testFeature"}

)
//@smoke-testA,@SH-59,@SH-70,@SH-62,@QA-63,@QA-56

public class Runner extends DriverFactory {


    @BeforeClass
    public static void setUp() throws IOException {

        System.out.println("Starting testing");
        DriverFactory.initialize();
        DriverFactory.driver.manage().window().maximize();

    }

    @AfterClass
    public static void tearDown(){
    System.out.println("Quiting browser");
    DriverFactory.driver.quit();
}


}
