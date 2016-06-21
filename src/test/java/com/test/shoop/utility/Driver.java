package com.test.shoop.utility;

import com.test.shoop.helper.Constants;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by Thadeus ssewanyana on 18/03/2016.
 */
public abstract class Driver {

    public static WebDriver driver = null;
    public static Properties CONFIG=null;
    private  static final String operatingSystem = System.getProperty("os.name").toUpperCase();
    private static final String systemArchitecture = System.getProperty("os.arch");


    public void getEnvironmentInfo() throws IOException {
        System.out.println(("Current Operating System: " + operatingSystem));
        System.out.println("Current Architecture: " + systemArchitecture);
        System.out.println("Current Browser Selection: " + CONFIG.getProperty("Browser"));
        System.out.println(" ");

    }




    public static void initialize() throws IOException {
        CONFIG = new Properties();
        FileInputStream fp = new FileInputStream(System.getProperty("user.dir") + "/src/config.properties");
        CONFIG.load(fp);

        if (CONFIG.getProperty("Browser").equalsIgnoreCase("firefox") ){
                DesiredCapabilities dc = new DesiredCapabilities();
                driver = new ShoopFireFoxDriver(dc);
            } else {
                if (CONFIG.getProperty("Browser").equalsIgnoreCase("chrome")) {
                    DesiredCapabilities dc = DesiredCapabilities.chrome();
                    if (operatingSystem.contains("WINDOWS")) {
                        System.setProperty("webdriver.chrome.driver",Constants.chromeWindowsdriver);
                    } else if (operatingSystem.contains("MAC")) {
                        System.setProperty("webdriver.chrome.driver",Constants.chromeMacdriver);
                    } else if (operatingSystem.contains("LINUX")) {
                        System.setProperty("webdriver.chrome.driver",Constants.chromeLinuxdriver );
                    }else if (operatingSystem.contains("Centos")) {
                        System.setProperty("webdriver.chrome.driver",Constants.chromeCentosdriver);
                    }
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ Constants.chromeCentosdriver);
                    driver = new ShoopChromeDriver(dc);

            }

        }

    }

    public void waitForElementDisplay(final WebElement element) {

        Wait<WebDriver> wait = new FluentWait<WebDriver>(Driver.driver)
                .withTimeout(60, TimeUnit.SECONDS)
                .pollingEvery(3, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        wait.until(input -> element.isDisplayed());
    }


}

