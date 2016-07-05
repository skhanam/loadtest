package com.test.shoop.utility;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import static com.test.shoop.helper.Constants.*;
/**
 * Created by Thadeus ssewanyana on 18/03/2016.
 */
public abstract class AbstractDriver {

    public static WebDriver driver = null;
    public static Properties CONFIG=null;
    private  static final String operatingSystem = System.getProperty("os.name").toUpperCase();
    private static final String systemArchitecture = System.getProperty("os.arch");
    private static Logger LOGGER = Logger.getLogger("InfoLogging");

    public static void getEnvironmentInfo() throws IOException {
        LOGGER.info(("Current Operating System: " + operatingSystem));
        LOGGER.info("Current Architecture: " + systemArchitecture);
        LOGGER.info("Current Browser Selection: " + CONFIG.getProperty("Browser"));
    }

    public static void initialize() throws IOException {
        CONFIG = new Properties();
        FileInputStream fp = new FileInputStream(System.getProperty("user.dir") + "/src/config.properties");
        CONFIG.load(fp);

        if (CONFIG.getProperty("Browser").equalsIgnoreCase("firefox") ){
                DesiredCapabilities dc = new DesiredCapabilities();
                driver = new FirefoxDriver(dc);
            } else {
                if (CONFIG.getProperty("Browser").equalsIgnoreCase("chrome")) {
                    DesiredCapabilities dc = DesiredCapabilities.chrome();
                    if (operatingSystem.contains("WINDOWS")) {
                        System.setProperty("webdriver.chrome.driver",chromeWindowsdriver);
                    } else if (operatingSystem.contains("MAC")) {
                        System.setProperty("webdriver.chrome.driver",chromeMacdriver);
                    } else if (operatingSystem.contains("LINUX")) {
                        System.setProperty("webdriver.chrome.driver",chromeLinuxdriver );
                    }else if (operatingSystem.contains("Centos")) {
                        System.setProperty("webdriver.chrome.driver",chromeCentosdriver);
                    }
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ chromeMacdriver);
                    driver = new ChromeDriver(dc);

            }

        }

    }

    public void waitForElementDisplay(final WebElement element) {
        Wait<WebDriver> wait = new FluentWait<>(AbstractDriver.driver)
                .withTimeout(60, TimeUnit.SECONDS)
                .pollingEvery(3, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        wait.until(input -> element.isDisplayed());
    }


}

