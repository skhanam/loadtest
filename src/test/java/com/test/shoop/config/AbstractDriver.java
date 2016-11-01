package com.test.shoop.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;





/**
 * Created by Thadeus ssewanyana on 18/03/2016.
 */
public class AbstractDriver {

    public static WebDriver driver = null;
    public static Properties CONFIG=null;
    public static Wait<WebDriver> wait = null;
    private  static final String operatingSystem = System.getProperty("os.name").toUpperCase();
    private static final String systemArchitecture = System.getProperty("os.arch");
    private static Logger LOGGER = Logger.getLogger("InfoLogging");
    //chromebinaries
    public static final String  chromeWindowsdriver="/src/test/resources/WinbrowserBinaries/chromedriver.exe";
    public static final String  chromeCentosdriver="/src/test/resources/centosChromeDriverBinaries/chromedriver";
    public static final String  chromeLinuxdriver="/src/test/resources/linux/googlechrome/64bit/chromedriver";
    public static final String  chromeMacdriver="/src/test/resources/macChromedriver/chromedriver";


    public static void getEnvironmentInfo() throws IOException {
        LOGGER.info(("Current Operating System: " + operatingSystem));
        LOGGER.info("Current Architecture: " + systemArchitecture);
        LOGGER.info("Current Browser Selection: " + CONFIG.getProperty("Browser"));
//        final Environment environment = Environment.getSystemEnvironmentWithDefault();
//        System.out.println("This is the environment : "+environment.getProperty("staging.shoop"));
    }

    public static void initialize() throws IOException {
//        final Environment environment = Environment.getSystemEnvironmentWithDefault();
//        System.out.println("This is the environment : "+environment.getProperty("staging.shoop"));
        CONFIG = new Properties();
        LOGGER.info(System.getProperty("user.dir"));
        FileInputStream fp = new FileInputStream(System.getProperty("user.dir") + "/src/config.properties");
        CONFIG.load(fp);
        if (CONFIG.getProperty("Browser").equalsIgnoreCase("firefox")) {
            DesiredCapabilities dc = new DesiredCapabilities();
            driver = new FirefoxDriver(dc);
            Utility.setWindowMaximise(driver);
        } else {
            if (CONFIG.getProperty("Browser").equalsIgnoreCase("chrome")) {
                DesiredCapabilities dc = DesiredCapabilities.chrome();
                if (operatingSystem.contains("WINDOWS")) {
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ chromeWindowsdriver);
                } else if (operatingSystem.contains("MAC")) {
                    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ chromeMacdriver);
                } else if (operatingSystem.contains("LINUX")) {
                    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ chromeLinuxdriver);

                } else if (operatingSystem.contains("Centos")) {
                    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ chromeCentosdriver);
                }
                driver = new ChromeDriver(dc);

            }
        }
    }

    public static void waitForElementDisplay(final WebElement element) throws ElementNotVisibleException{
        if (wait == null){
        Wait<WebDriver> wait = new FluentWait<>(AbstractDriver.driver)
                .withTimeout(60, TimeUnit.SECONDS)
                .pollingEvery(3, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);}

        wait.until(ExpectedConditions.visibilityOf(element));
    }




}

